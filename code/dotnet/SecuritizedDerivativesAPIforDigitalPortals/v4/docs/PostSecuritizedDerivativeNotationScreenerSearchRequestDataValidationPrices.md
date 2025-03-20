# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices
Price-related parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Quality** | **string** | Quality of the price. | Value | Description | | - -- | - -- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional] [default to QualityEnum.DLY]
**Latest** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPricesLatest**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPricesLatest.md) |  | [optional] 
**Previous** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesPrevious**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesPrevious.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

