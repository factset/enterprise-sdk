# FactSet.SDK.StocksAPIforDigitalPortals.Model.StockNotationRankingIntradayListDataIndexMembership
List of indices of which a stock is a constituent. The list restricts the request to return only those stocks that are a constituent of one of the specified indices.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | List of index instrument identifiers. | [optional] 
**UseAlternativeNotation** | **bool** | Specifies whether an alternative notation of a constituent shall be retrieved if the market of the original notation is currently closed or if the user is not entitled for the market of the original notation. The alternative notation is the one with the highest trading volume averaged over one month that satisfies all other selected filters, such as only a specific market or a specific currency. If the original notation is not entitled and a currency has not been specified, the alternative notation may be in a different currency than the original one which makes the ranking less meaningful, especially a trading value-based ranking, see attribute &#x60;accumulated.tradingValue&#x60; in the response. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

