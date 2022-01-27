

# CalculationUnitStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The status of calculation unit. |  [optional]
**error** | **String** | The error in a calculation unit. |  [optional]
**result** | **String** | The result URL of the calculation. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
EXECUTING | &quot;Executing&quot;
SUCCESS | &quot;Success&quot;
FAILED | &quot;Failed&quot;
CANCELLED | &quot;Cancelled&quot;


## Implemented Interfaces

* Serializable


