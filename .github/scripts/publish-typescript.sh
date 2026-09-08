#!/usr/bin/env bash
set -euo pipefail

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
