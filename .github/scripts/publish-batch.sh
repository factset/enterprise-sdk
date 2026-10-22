#!/usr/bin/env bash
set -euo pipefail

publish_script="$GITHUB_WORKSPACE/.github/scripts/publish-${LANGUAGE}.sh"
if [ ! -f "$publish_script" ]; then
  echo "::error::No publish script found at '$publish_script'"
  exit 1
fi

read -ra pkgs <<< "$PKG_PATHS"
if [ "${#pkgs[@]}" -eq 0 ]; then
  echo "::error::PKG_PATHS is empty"
  exit 1
fi

echo "Batch ${BATCH_ID}: publishing ${#pkgs[@]} ${LANGUAGE} package(s)"
printf '  %s\n' "${pkgs[@]}"

status_file=$(mktemp)
trap 'rm -f "$status_file"' EXIT

published=()
skipped=()
failed=()
for pkg in "${pkgs[@]}"; do
  echo "::group::Publishing ${pkg}"
  : > "$status_file"
  if (cd "$GITHUB_WORKSPACE/$pkg" && PKG_PATH="$pkg" PKG_STATUS_FILE="$status_file" bash "$publish_script"); then
    # The language script reports "<status>|<detail>"; assume published if it
    # reported nothing, so a script that predates this contract still works.
    reported="$(cat "$status_file")"
    status="${reported%%|*}"
    if [ "$reported" = "$status" ]; then
      detail=""
    else
      detail="${reported#*|}"
    fi
    case "$status" in
      skipped) skipped+=("${pkg}|${detail}") ;;
      *) published+=("${pkg}|${detail}") ;;
    esac
  else
    echo "::error::Failed to publish '${pkg}'"
    failed+=("${pkg}|")
  fi
  echo "::endgroup::"
done

row() {
  local entry="$1" result="$2" pkg detail
  pkg="${entry%%|*}"
  detail="${entry#*|}"
  echo "| \`${pkg}\` | ${detail:-–} | ${result} |"
}

{
  echo "### Batch ${BATCH_ID} — ${LANGUAGE} (dry run: ${DRY_RUN})"
  echo
  echo "| Package | Version | Result |"
  echo "| --- | --- | --- |"
  for entry in "${published[@]}"; do row "$entry" "published"; done
  for entry in "${skipped[@]}"; do row "$entry" "skipped (already published)"; done
  for entry in "${failed[@]}"; do row "$entry" "**failed**"; done
} >> "$GITHUB_STEP_SUMMARY"

echo "Batch ${BATCH_ID}: ${#published[@]} published, ${#skipped[@]} skipped, ${#failed[@]} failed"
if [ "${#failed[@]}" -ne 0 ]; then
  failed_pkgs=()
  for entry in "${failed[@]}"; do failed_pkgs+=("${entry%%|*}"); done
  echo "::error::Batch ${BATCH_ID} had ${#failed[@]} failure(s): ${failed_pkgs[*]}"
  exit 1
fi
