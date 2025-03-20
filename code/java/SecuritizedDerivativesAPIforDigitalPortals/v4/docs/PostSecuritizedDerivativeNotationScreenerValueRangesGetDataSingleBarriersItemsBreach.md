

# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach

Parameters related to a barrier breach; applicable to the following barrier types: `knockIn` and `knockOut`

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breached** | [**BreachedEnum**](#BreachedEnum) | Defines whether or not securitized derivatives for which the barrier has been breached are included in the result. | Value | Description | | --- | --- | | all | The result is not limited with regard to whether the barrier has been breached or not. | | only | The result is limited to securitized derivatives for which the barrier has been breached. | | exclude | The result is limited to securitized derivatives for which the barrier has not been breached. |   |  [optional]



## Enum: BreachedEnum

Name | Value
---- | -----
ALL | &quot;all&quot;
ONLY | &quot;only&quot;
EXCLUDE | &quot;exclude&quot;


## Implemented Interfaces

* Serializable


