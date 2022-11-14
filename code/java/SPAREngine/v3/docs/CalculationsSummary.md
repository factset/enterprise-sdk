

# CalculationsSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Last poll status of the calculation. |  [optional]
**units** | **Integer** | Number of calculation units in batch. |  [optional]
**requestTime** | **OffsetDateTime** | Request time of calculation. |  [optional]
**lastPollTime** | **OffsetDateTime** | Last poll time of calculation. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;Queued&quot;
EXECUTING | &quot;Executing&quot;
COMPLETED | &quot;Completed&quot;
CANCELLED | &quot;Cancelled&quot;


## Implemented Interfaces

* Serializable


