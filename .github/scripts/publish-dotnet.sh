#!/usr/bin/env bash
set -euo pipefail

pkg_path="${PKG_PATH:-$PWD}"
source_url="https://api.nuget.org/v3/index.json"

# Each SDK version folder holds exactly one project under src/.
shopt -s nullglob
projects=(src/*/*.csproj)
shopt -u nullglob
if [ "${#projects[@]}" -ne 1 ]; then
  echo "::error::Expected exactly one .csproj under ${pkg_path}/src, found ${#projects[@]}"
  exit 1
fi
project="${projects[0]}"

pkg_id=$(sed -n 's:.*<PackageId>\(.*\)</PackageId>.*:\1:p' "$project" | head -n1)
pkg_version=$(sed -n 's:.*<Version>\(.*\)</Version>.*:\1:p' "$project" | head -n1)
if [ -z "$pkg_id" ] || [ -z "$pkg_version" ]; then
  echo "::error::Could not read PackageId and Version from ${project}"
  exit 1
fi

echo "Publishing ${pkg_id}@${pkg_version} from ${pkg_path} (dry run: ${DRY_RUN})"

# Report the outcome back to publish-batch.sh, which renders the run summary.
report_status() {
  if [ -n "${PKG_STATUS_FILE:-}" ]; then
    printf '%s|%s\n' "$1" "$2" > "$PKG_STATUS_FILE"
  fi
}

# The flat container lists every published version, lowercased. A 404 means the
# package does not exist yet. A transient error also lands on "not published";
# the push then fails on nuget.org's own duplicate check, so nothing is overwritten.
id_lower=$(tr '[:upper:]' '[:lower:]' <<< "$pkg_id")
version_lower=$(tr '[:upper:]' '[:lower:]' <<< "$pkg_version")
if curl -fsS --max-time 30 "https://api.nuget.org/v3-flatcontainer/${id_lower}/index.json" 2>/dev/null \
    | jq -e --arg v "$version_lower" '.versions | index($v)' > /dev/null; then
  echo "::notice::${pkg_id}@${pkg_version} is already published - skipping."
  report_status skipped "${pkg_id}@${pkg_version}"
  exit 0
fi

out_dir=$(mktemp -d)
trap 'rm -rf "$out_dir"' EXIT
dotnet pack "$project" -c Release -o "$out_dir"

if [ "$DRY_RUN" = "true" ]; then
  echo "Dry run - packed, not pushing:"
  ls "$out_dir"
else
  if [ -z "${NUGET_API_KEY:-}" ]; then
    echo "::error::NUGET_API_KEY is empty - the NuGet login step must run before publishing"
    exit 1
  fi
  # out_dir is fresh for this package, so it holds exactly this one .nupkg.
  dotnet nuget push "$out_dir/*.nupkg" \
    --api-key "$NUGET_API_KEY" \
    --source "$source_url"
fi

report_status published "${pkg_id}@${pkg_version}"
