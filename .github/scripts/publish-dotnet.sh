#!/usr/bin/env bash
set -euo pipefail

# Packs one .NET SDK into $NUPKG_DIR. It never pushes: pushing happens in a
# separate job that holds the nuget.org credentials and runs no build code.

pkg_path="${PKG_PATH:-$PWD}"

if [ -z "${NUPKG_DIR:-}" ]; then
  echo "::error::NUPKG_DIR is not set"
  exit 1
fi

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

echo "Packing ${pkg_id}@${pkg_version} from ${pkg_path}"

# Report the outcome back to publish-batch.sh, which renders the run summary.
report_status() {
  if [ -n "${PKG_STATUS_FILE:-}" ]; then
    printf '%s|%s\n' "$1" "$2" > "$PKG_STATUS_FILE"
  fi
}

# The flat container lists every published version, lowercased. A 404 means the
# package does not exist yet. A transient error also lands on "not published";
# the push then relies on --skip-duplicate, so nothing gets overwritten.
id_lower=$(tr '[:upper:]' '[:lower:]' <<< "$pkg_id")
version_lower=$(tr '[:upper:]' '[:lower:]' <<< "$pkg_version")
if curl -fsS --max-time 30 "https://api.nuget.org/v3-flatcontainer/${id_lower}/index.json" 2>/dev/null \
    | jq -e --arg v "$version_lower" '.versions | index($v)' > /dev/null; then
  echo "::notice::${pkg_id}@${pkg_version} is already published - skipping."
  report_status skipped "${pkg_id}@${pkg_version}"
  exit 0
fi

dotnet pack "$project" -c Release -o "$NUPKG_DIR"

report_status packed "${pkg_id}@${pkg_version}"
