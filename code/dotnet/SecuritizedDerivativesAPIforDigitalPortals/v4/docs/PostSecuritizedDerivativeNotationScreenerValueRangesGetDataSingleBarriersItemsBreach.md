# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach
Parameters related to a barrier breach; applicable to the following barrier types: `knockIn` and `knockOut`

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Breached** | **string** | Defines whether or not securitized derivatives for which the barrier has been breached are included in the result. | Value | Description | | - -- | - -- | | all | The result is not limited with regard to whether the barrier has been breached or not. | | only | The result is limited to securitized derivatives for which the barrier has been breached. | | exclude | The result is limited to securitized derivatives for which the barrier has not been breached. |   | [optional] [default to BreachedEnum.Exclude]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

