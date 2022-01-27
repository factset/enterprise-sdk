# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2004AccumulatedCurrency
Main currency of the trading value. For securitized derivatives quoted in percent, it is also the currency of the nominal trading volume, for the latter see attribute `accumulated.tradingVolume`. For securitized derivatives quoted in units, this attribute contains the same unit as the attribute `valueUnit`. See endpoint `/basic/valueUnit/main/currency/list` for possible values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **decimal** | Identifier of the currency. | [optional] 
**Code** | **string** | Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

