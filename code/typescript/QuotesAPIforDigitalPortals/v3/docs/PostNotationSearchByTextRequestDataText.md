# quotesapifordigitalportals.PostNotationSearchByTextRequestDataText

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value. | [optional] 
**value** | **String** | Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. If only two characters are submitted, the search is executed as an exact search. | 



## Enum: [AttributesEnum]


* `allEntitled` (value: `"allEntitled"`)

* `isin` (value: `"isin"`)

* `wkn` (value: `"wkn"`)

* `valor` (value: `"valor"`)

* `sedol` (value: `"sedol"`)

* `cusip` (value: `"cusip"`)

* `symbol` (value: `"symbol"`)

* `longName` (value: `"longName"`)

* `shortName` (value: `"shortName"`)




