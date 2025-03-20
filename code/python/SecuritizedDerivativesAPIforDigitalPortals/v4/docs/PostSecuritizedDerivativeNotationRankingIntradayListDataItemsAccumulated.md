# PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated

Summary data accumulated over all trades of the current trading day.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_trades** | **float, none_type** | Number of trades. | [optional] 
**trading_volume** | **float, none_type** | Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute &#x60;valueUnit.id&#x3D;258&#x60;), this field represents the nominal trading volume; see attribute currency for its unit. | [optional] 
**trading_value** | **float, none_type** | Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit. | [optional] 
**currency** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


