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

published=()
failed=()
for pkg in "${pkgs[@]}"; do
  echo "::group::Publishing ${pkg}"
  if (cd "$GITHUB_WORKSPACE/$pkg" && PKG_PATH="$pkg" bash "$publish_script"); then
    published+=("$pkg")
  else
    echo "::error::Failed to publish '${pkg}'"
    failed+=("$pkg")
  fi
  echo "::endgroup::"
done

{
  echo "### Batch ${BATCH_ID} — ${LANGUAGE} (dry run: ${DRY_RUN})"
  echo
  echo "| Package | Result |"
  echo "| --- | --- |"
  for pkg in "${published[@]}"; do echo "| \`${pkg}\` | published |"; done
  for pkg in "${failed[@]}"; do echo "| \`${pkg}\` | **failed** |"; done
} >> "$GITHUB_STEP_SUMMARY"

echo "Batch ${BATCH_ID}: ${#published[@]} published, ${#failed[@]} failed"
if [ "${#failed[@]}" -ne 0 ]; then
  echo "::error::Batch ${BATCH_ID} had ${#failed[@]} failure(s): ${failed[*]}"
  exit 1
fi
