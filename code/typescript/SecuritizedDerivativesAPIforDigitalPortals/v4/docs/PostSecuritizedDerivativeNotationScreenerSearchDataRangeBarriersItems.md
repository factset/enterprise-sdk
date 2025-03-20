# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | --- | --- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |   | [optional] 
**observation** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation.md) |  | [optional] 
**upper** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper.md) |  | [optional] 
**lower** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower.md) |  | [optional] 
**breach** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach.md) |  | [optional] 
**cashFlow** | [**PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow.md) |  | [optional] 



## Enum: TypeEnum


* `rangeKnockOut` (value: `"rangeKnockOut"`)




