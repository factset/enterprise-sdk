# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresVega
Vega. It represents the first partial derivative of the function determining the derivative notation's theoretical price with respect to the implied volatility, evaluated at the current implied volatility. Vega indicates the ratio of the absolute change of the price of a derivative for an absolute change of the implied volatility, thus it represents the price sensitivity of the derivative relative to changes in the implied volatility. This key figure is calculated for plain vanilla warrants only.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Effective** | **decimal?** | Vega calculated using the actual cover ratio of the securitized derivative. | [optional] 
**Unadjusted** | **decimal?** | Vega calculated using a (hypothetical) cover ratio of 1:1. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

