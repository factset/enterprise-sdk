

# CalculationStatus

Details of the calculation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculationid** | **String** | Calculation&#39;s identifier |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Calculation&#39;s status |  [optional]
**units** | [**Map&lt;String, CalculationUnitStatus&gt;**](CalculationUnitStatus.md) | Number of calculation units in batch. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
EXECUTING | &quot;Executing&quot;
COMPLETED | &quot;Completed&quot;
CANCELLED | &quot;Cancelled&quot;


## Implemented Interfaces

* Serializable


