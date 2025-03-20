# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta
The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | **List&lt;string&gt;** | Limit the attributes returned in the response to the specified set. | [optional] 
**Language** | **string** | ISO 639-1 code of the language. | [optional] 
**Sort** | **List&lt;string&gt;** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | trade.performance.absolute | | -trade.performance.absolute | | trade.performance.relative | | -trade.performance.relative | | accumulated.numberTrades | | -accumulated.numberTrades | | accumulated.tradingVolume | | -accumulated.tradingVolume | | accumulated.tradingValue | | -accumulated.tradingValue |   | [optional] 
**Pagination** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination**](PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

