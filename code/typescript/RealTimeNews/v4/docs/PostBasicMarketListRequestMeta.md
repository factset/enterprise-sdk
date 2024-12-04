# realtimenews.PostBasicMarketListRequestMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name | | shortName | | -shortName | | country.name | | -country.name | | type.name | | -type.name | | group.name | | -group.name |   | [optional] 
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `name` (value: `"name"`)

* `-name` (value: `"-name"`)

* `shortName` (value: `"shortName"`)

* `-shortName` (value: `"-shortName"`)

* `country.name` (value: `"country.name"`)

* `-country.name` (value: `"-country.name"`)

* `type.name` (value: `"type.name"`)

* `-type.name` (value: `"-type.name"`)

* `group.name` (value: `"group.name"`)

* `-group.name` (value: `"-group.name"`)




