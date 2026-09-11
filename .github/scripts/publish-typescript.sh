#!/usr/bin/env bash
set -euo pipefail

pkg_path="${PKG_PATH:-$PWD}"
pkg_name=$(jq -r '.name' package.json)
pkg_version=$(jq -r '.version' package.json)

echo "Publishing ${pkg_name}@${pkg_version} from ${pkg_path} (dry run: ${DRY_RUN})"

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
