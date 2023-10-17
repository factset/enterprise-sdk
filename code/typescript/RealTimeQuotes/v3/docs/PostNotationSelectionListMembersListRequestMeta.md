# realtimequotes.PostNotationSelectionListMembersListRequestMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 6 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `market.name` (value: `"market.name"`)

* `-market.name` (value: `"-market.name"`)

* `valueUnit.name` (value: `"valueUnit.name"`)

* `-valueUnit.name` (value: `"-valueUnit.name"`)

* `instrument.name.default.long` (value: `"instrument.name.default.long"`)

* `-instrument.name.default.long` (value: `"-instrument.name.default.long"`)

* `instrument.name.default.short` (value: `"instrument.name.default.short"`)

* `-instrument.name.default.short` (value: `"-instrument.name.default.short"`)

* `instrument.name.assetClassSpecific.long` (value: `"instrument.name.assetClassSpecific.long"`)

* `-instrument.name.assetClassSpecific.long` (value: `"-instrument.name.assetClassSpecific.long"`)

* `instrument.name.assetClassSpecific.short` (value: `"instrument.name.assetClassSpecific.short"`)

* `-instrument.name.assetClassSpecific.short` (value: `"-instrument.name.assetClassSpecific.short"`)




