# realtimequotes.PostNotationSearchByTextRequestDataText

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. | [optional] 
**value** | **String** | Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. If only two characters are submitted, the search is executed as an exact search. | 
**minimumMatchScore** | **Number** | Minimum match score for the text string. The match score has a value between 0 and 1 (inclusive), where a higher value indicates a better match than a lower one.      Examples for the two most relevant thresholds:       0.25: Exact substring match after case-folding and modifier elimination - \&quot;Münchner Rück\&quot; is a match for the search string \&quot;Munch\&quot; but not for \&quot;Muench\&quot;.        0.50: Exact substring match - \&quot;Münchner Rück\&quot; is a match for the search string \&quot;Münch\&quot; but not for \&quot;Munch\&quot; or \&quot;münch\&quot;. | [optional] [default to 0.25]



## Enum: [AttributesEnum]


* `allEntitled` (value: `"allEntitled"`)

* `isin` (value: `"isin"`)

* `wkn` (value: `"wkn"`)

* `valor` (value: `"valor"`)

* `sedol` (value: `"sedol"`)

* `cusip` (value: `"cusip"`)

* `symbol` (value: `"symbol"`)

* `normalizedSymbol` (value: `"normalizedSymbol"`)

* `longName` (value: `"longName"`)

* `shortName` (value: `"shortName"`)




