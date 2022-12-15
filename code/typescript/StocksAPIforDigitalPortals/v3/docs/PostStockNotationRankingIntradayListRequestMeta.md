# stocksapifordigitalportals.PostStockNotationRankingIntradayListRequestMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**PostStockNotationRankingIntradayListRequestMetaPagination**](PostStockNotationRankingIntradayListRequestMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `trade.performance.absolute` (value: `"trade.performance.absolute"`)

* `-trade.performance.absolute` (value: `"-trade.performance.absolute"`)

* `trade.performance.relative` (value: `"trade.performance.relative"`)

* `-trade.performance.relative` (value: `"-trade.performance.relative"`)

* `accumulated.numberTrades` (value: `"accumulated.numberTrades"`)

* `-accumulated.numberTrades` (value: `"-accumulated.numberTrades"`)

* `accumulated.tradingVolume` (value: `"accumulated.tradingVolume"`)

* `-accumulated.tradingVolume` (value: `"-accumulated.tradingVolume"`)

* `accumulated.tradingValue` (value: `"accumulated.tradingValue"`)

* `-accumulated.tradingValue` (value: `"-accumulated.tradingValue"`)




