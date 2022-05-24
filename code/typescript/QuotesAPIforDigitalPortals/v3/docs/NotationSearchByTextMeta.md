# quotesapifordigitalportals.NotationSearchByTextMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 3 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**BasicMarketListMetaPagination**](BasicMarketListMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `instrument.name.default.long` (value: `"instrument.name.default.long"`)

* `-instrument.name.default.long` (value: `"-instrument.name.default.long"`)

* `instrument.name.default.short` (value: `"instrument.name.default.short"`)

* `-instrument.name.default.short` (value: `"-instrument.name.default.short"`)

* `tradingValue.average.days30` (value: `"tradingValue.average.days30"`)

* `-tradingValue.average.days30` (value: `"-tradingValue.average.days30"`)




