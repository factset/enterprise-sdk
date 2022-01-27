

# SecuritizedDerivativeNotationRankingIntradayListMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**SecuritizedDerivativeNotationRankingIntradayListMetaPagination**](SecuritizedDerivativeNotationRankingIntradayListMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
TRADE_PERFORMANCE_ABSOLUTE | &quot;trade.performance.absolute&quot;
_TRADE_PERFORMANCE_ABSOLUTE | &quot;-trade.performance.absolute&quot;
TRADE_PERFORMANCE_RELATIVE | &quot;trade.performance.relative&quot;
_TRADE_PERFORMANCE_RELATIVE | &quot;-trade.performance.relative&quot;
ACCUMULATED_NUMBERTRADES | &quot;accumulated.numberTrades&quot;
_ACCUMULATED_NUMBERTRADES | &quot;-accumulated.numberTrades&quot;
ACCUMULATED_TRADINGVOLUME | &quot;accumulated.tradingVolume&quot;
_ACCUMULATED_TRADINGVOLUME | &quot;-accumulated.tradingVolume&quot;
ACCUMULATED_TRADINGVALUE | &quot;accumulated.tradingValue&quot;
_ACCUMULATED_TRADINGVALUE | &quot;-accumulated.tradingValue&quot;


## Implemented Interfaces

* Serializable


