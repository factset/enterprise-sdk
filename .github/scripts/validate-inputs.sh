#!/usr/bin/env bash
set -euo pipefail

BATCH_SIZE="${BATCH_SIZE:-5}"
if ! [[ "$BATCH_SIZE" =~ ^[1-9][0-9]*$ ]]; then
  echo "::error::BATCH_SIZE must be a positive integer, got '$BATCH_SIZE'"
  exit 1
fi

all_languages=(dotnet java python typescript)
if [ "$LANGUAGE_TO_PUBLISH" = "all" ]; then
  languages=("${all_languages[@]}")
else
  languages=("$LANGUAGE_TO_PUBLISH")
fi

API_INCLUDE_LIST="${API_INCLUDE_LIST:-}"
if [ -z "${API_INCLUDE_LIST//[[:space:]]/}" ]; then
  echo "No apiIncludeList given - discovering all APIs for: ${languages[*]}"

  discovered=()
  for lang in "${languages[@]}"; do
    if [ ! -d "code/${lang}" ]; then
      echo "::error::Language folder 'code/${lang}' does not exist"
      exit 1
    fi
    for apidir in "code/${lang}"/*/; do
      [ -d "$apidir" ] || continue
      api_name="$(basename "$apidir")"
      # Only APIs that actually have at least one version folder.
      for verdir in "$apidir"v*/; do
        [ -d "$verdir" ] || continue
        discovered+=("$api_name")
        break
      done
    done
  done

  if [ "${#discovered[@]}" -eq 0 ]; then
    echo "::error::No APIs discovered under code/ for: ${languages[*]}"
    exit 1
  fi

  # Dedupe across languages, then rejoin into the parser's expected format.
  mapfile -t discovered < <(printf '%s\n' "${discovered[@]}" | sort -u)
  API_INCLUDE_LIST="$(IFS=,; echo "${discovered[*]}")"
  echo "Discovered ${#discovered[@]} API(s) to publish."
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

readonly MATRIX_LIMIT=256

for lang in "${all_languages[@]}"; do
  path_list=$(printf '%s\n' "${paths[$lang]}" | sed '/^$/d' | sort -u | jq -R . | jq -sc .)
  n_paths=$(jq -r 'length' <<< "$path_list")

  # One job per package unless doing so would blow the matrix limit.
  if [ "$n_paths" -le "$MATRIX_LIMIT" ]; then
    effective_size=1
  else
    effective_size="$BATCH_SIZE"
    echo "::notice::${lang}: ${n_paths} packages exceeds the ${MATRIX_LIMIT}-job matrix limit; batching ${effective_size} per job."
  fi

  batches=$(jq -c --argjson n "$effective_size" '
      [range(0; length; $n) as $i | .[$i:$i+$n]]
      | length as $total
      | to_entries
      | map({
          id: "\(.key + 1)/\($total)",
          count: (.value | length),
          paths: (.value | join(" ")),
          name: (if (.value | length) == 1
                 then .value[0]
                 else "batch \(.key + 1)/\($total) (\(.value | length) pkgs)"
                 end)
        })
    ' <<< "$path_list")

  n_batches=$(jq -r 'length' <<< "$batches")
  if [ "$n_batches" -gt "$MATRIX_LIMIT" ]; then
    min_size=$(( (n_paths + MATRIX_LIMIT - 1) / MATRIX_LIMIT ))
    echo "::error::${lang}: ${n_paths} packages at BATCH_SIZE=${BATCH_SIZE} still yields ${n_batches} jobs, over the ${MATRIX_LIMIT} matrix limit. Raise BATCH_SIZE to at least ${min_size} or narrow apiIncludeList."
    exit 1
  fi

  echo "${lang}_batches=${batches}" >> "$GITHUB_OUTPUT"
done

echo "All entries in apiIncludeList validated successfully."
