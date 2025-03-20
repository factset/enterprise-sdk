# PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta

The meta member contains the meta information of the request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**AttributesMember**](AttributesMember.md) |  | [optional] 
**language** | [**LanguageMember**](LanguageMember.md) |  | [optional] 
**sort** | **[str]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | trade.performance.absolute | | -trade.performance.absolute | | trade.performance.relative | | -trade.performance.relative | | accumulated.numberTrades | | -accumulated.numberTrades | | accumulated.tradingVolume | | -accumulated.tradingVolume | | accumulated.tradingValue | | -accumulated.tradingValue |   | [optional]  if omitted the server will use the default value of ["-trade.performance.relative"]
**pagination** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination**](PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


