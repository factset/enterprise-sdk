#!/usr/bin/env bash
set -euo pipefail

all_languages=(dotnet java python typescript)
if [ "$LANGUAGE_TO_PUBLISH" = "all" ]; then
  languages=("${all_languages[@]}")
else
  languages=("$LANGUAGE_TO_PUBLISH")
fi

declare -A paths
for lang in "${all_languages[@]}"; do
  paths[$lang]=""
done

error=0
IFS=',' read -ra ENTRIES <<< "$API_INCLUDE_LIST"
for raw_entry in "${ENTRIES[@]}"; do
  entry="$(echo "$raw_entry" | xargs)"
  if [ -z "$entry" ]; then
    echo "::error::Empty entry found in apiIncludeList"
    error=1
    continue
  fi

  api_name="$(echo "${entry%%:*}" | xargs)"
  if [[ "$entry" == *":"* ]]; then
    api_version="$(echo "${entry#*:}" | xargs)"
  else
    api_version=""
  fi

  if [ -z "$api_name" ]; then
    echo "::error::Malformed entry '$entry' in apiIncludeList - missing API name"
    error=1
    continue
  fi

  for lang in "${languages[@]}"; do
    base="code/${lang}/${api_name}"
    if [ ! -d "$base" ]; then
      echo "::error::Folder '$base' does not exist for entry '$entry'"
      error=1
      continue
    fi

    if [ -n "$api_version" ]; then
      p="$base/v${api_version}"
      if [ ! -d "$p" ]; then
        echo "::error::Folder '$p' does not exist for entry '$entry'"
        error=1
      else
        paths[$lang]="${paths[$lang]}${p}"$'\n'
      fi
    else
      found=0
      for verdir in "$base"/v*/; do
        [ -d "$verdir" ] || continue
        found=1
        paths[$lang]="${paths[$lang]}${verdir%/}"$'\n'
      done
      if [ "$found" -eq 0 ]; then
        echo "::error::No version folders found under '$base' for entry '$entry'"
        error=1
      fi
    fi
  done
done

if [ "$error" -ne 0 ]; then
  echo "::error::One or more entries in apiIncludeList are invalid. See errors above."
  exit 1
fi

for lang in "${all_languages[@]}"; do
  json=$(printf '%s\n' "${paths[$lang]}" | sed '/^$/d' | sort -u | jq -R . | jq -sc .)
  echo "${lang}_paths=${json}" >> "$GITHUB_OUTPUT"
done

echo "All entries in apiIncludeList validated successfully."
