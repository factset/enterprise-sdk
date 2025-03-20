# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulated
Summary data accumulated over all trades of the current trading day.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NumberTrades** | **decimal?** | Number of trades. | [optional] 
**TradingVolume** | **decimal?** | Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute &#x60;valueUnit.id&#x3D;258&#x60;), this field represents the nominal trading volume; see attribute currency for its unit. | [optional] 
**TradingValue** | **decimal?** | Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit. | [optional] 
**Currency** | [**PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency**](PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

