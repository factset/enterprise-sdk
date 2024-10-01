

# ScheduleData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**definitionName** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**group** | **String** |  |  [optional]
**reportDate** | **String** |  |  [optional]
**noOfTasks** | **Integer** |  |  [optional]
**businessCalendar** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**notes** | **String** |  |  [optional]
**finishDate** | **String** |  |  [optional]
**startDate** | **String** |  |  [optional]
**lastUpdatedBy** | **String** |  |  [optional]
**lastUpdated** | **String** |  |  [optional]



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


