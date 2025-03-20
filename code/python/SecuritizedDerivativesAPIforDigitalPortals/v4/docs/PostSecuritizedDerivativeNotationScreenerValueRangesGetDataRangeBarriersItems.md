# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | --- | --- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |   | [optional]  if omitted the server will use the default value of "rangeKnockOut"
**observation** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsObservation**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsObservation.md) |  | [optional] 
**upper** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpper**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpper.md) |  | [optional] 
**lower** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLower**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLower.md) |  | [optional] 
**breach** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach.md) |  | [optional] 
**cash_flow** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsCashFlow**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsCashFlow.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


