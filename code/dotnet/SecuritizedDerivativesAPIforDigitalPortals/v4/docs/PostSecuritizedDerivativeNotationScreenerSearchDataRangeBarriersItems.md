# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems
A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | - -- | - -- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |   | [optional] 
**Observation** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation.md) |  | [optional] 
**Upper** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper.md) |  | [optional] 
**Lower** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower.md) |  | [optional] 
**Breach** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach.md) |  | [optional] 
**CashFlow** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

