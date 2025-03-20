# PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency

Main currency of the trading value. For securitized derivatives quoted in percent, it is also the currency of the nominal trading volume, for the latter see attribute `accumulated.tradingVolume`. For securitized derivatives quoted in units, this attribute contains the same unit as the attribute `valueUnit`. See endpoint `/basic/value-unit/main/currency/list` for possible values.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float, none_type** | Identifier of the currency. | [optional] 
**code** | **str, none_type** | Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


