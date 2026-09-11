#!/usr/bin/env bash
set -euo pipefail

pkg_path="${PKG_PATH:-$PWD}"
pkg_name=$(jq -r '.name' package.json)
pkg_version=$(jq -r '.version' package.json)
registry="https://registry.npmjs.org"

echo "Publishing ${pkg_name}@${pkg_version} from ${pkg_path} (dry run: ${DRY_RUN})"

# Report the outcome back to publish-batch.sh, which renders the run summary.
report_status() {
  if [ -n "${PKG_STATUS_FILE:-}" ]; then
    printf '%s|%s\n' "$1" "$2" > "$PKG_STATUS_FILE"
  fi
}

# `npm view` prints nothing and exits 0 when the package exists but this version
# does not, and fails with E404 when the package itself is unknown. Either way an
# empty result means the version has not been published yet. A transient registry
# error also lands here - publishing then fails on the registry's own duplicate
# check, so a false negative cannot overwrite an existing version.
existing=$(npm view "${pkg_name}@${pkg_version}" version --registry "$registry" 2>/dev/null || true)
if [ -n "$existing" ]; then
  echo "::notice::${pkg_name}@${pkg_version} is already published - skipping."
  report_status skipped "${pkg_name}@${pkg_version}"
  exit 0
fi

publish_args=(--access public)
if [ "$DRY_RUN" = "true" ]; then
  publish_args+=(--dry-run)
fi

echo 'npmRegistryServer: "https://registry.npmjs.org"' > .yarnrc.yml
echo 'enableScripts: false' >> .yarnrc.yml

corepack enable
yarn set version stable
yarn install
yarn build
yarn npm publish "${publish_args[@]}"

report_status published "${pkg_name}@${pkg_version}"
