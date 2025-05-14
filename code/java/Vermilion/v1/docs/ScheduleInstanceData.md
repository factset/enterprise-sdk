

# ScheduleInstanceData

Details of an individual schedule instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleInstanceId** | **Integer** | Unique identifier of the schedule instance. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the schedule instance. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
INITIALISED | &quot;INITIALISED&quot;
RUNNING | &quot;RUNNING&quot;
CANCELLED | &quot;CANCELLED&quot;
SUSPENDED | &quot;SUSPENDED&quot;
FINISHED | &quot;FINISHED&quot;
CLOSED | &quot;CLOSED&quot;
GENERATING_TASKS | &quot;GENERATING_TASKS&quot;


## Implemented Interfaces

* Serializable


