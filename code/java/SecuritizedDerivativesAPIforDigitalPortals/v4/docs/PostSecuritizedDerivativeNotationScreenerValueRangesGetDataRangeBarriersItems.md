

# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | --- | --- | | rangeKnockOut | Represents the upper and lower bound of the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for range knock-out certificates such as inline certificates. |   |  [optional]
**observation** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsObservation**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsObservation.md) |  |  [optional]
**upper** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpper**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpper.md) |  |  [optional]
**lower** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLower**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLower.md) |  |  [optional]
**breach** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach.md) |  |  [optional]
**cashFlow** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsCashFlow**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsCashFlow.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
RANGEKNOCKOUT | &quot;rangeKnockOut&quot;


## Implemented Interfaces

* Serializable


