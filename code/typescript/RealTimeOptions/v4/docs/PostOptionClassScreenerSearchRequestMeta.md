# realtimeoptions.PostOptionClassScreenerSearchRequestMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | symbol | | -symbol | | isin | | -isin | | name | | -name | | market.name | | -market.name | | underlying.name | | -underlying.name | | currency.code | | -currency.code | | category.name | | -category.name |   | [optional] 



## Enum: [SortEnum]


* `symbol` (value: `"symbol"`)

* `-symbol` (value: `"-symbol"`)

* `isin` (value: `"isin"`)

* `-isin` (value: `"-isin"`)

* `name` (value: `"name"`)

* `-name` (value: `"-name"`)

* `market.name` (value: `"market.name"`)

* `-market.name` (value: `"-market.name"`)

* `underlying.name` (value: `"underlying.name"`)

* `-underlying.name` (value: `"-underlying.name"`)

* `currency.code` (value: `"currency.code"`)

* `-currency.code` (value: `"-currency.code"`)

* `category.name` (value: `"category.name"`)

* `-category.name` (value: `"-category.name"`)




