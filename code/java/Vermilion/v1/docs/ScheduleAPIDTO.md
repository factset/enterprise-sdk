

# ScheduleAPIDTO

Schedule along with an extra property to indicate the task generation log warning(s)/error(s)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | **Integer** | Unique identifier of the Schedule. |  [optional]
**name** | **String** | Name of the Schedule. |  [optional]
**definitionName** | **String** | Name of Schedule Definition from which the Schedule has been generated. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the Schedule. |  [optional]
**scheduleGroup** | **String** | Group of the Schedule. |  [optional]
**reportDate** | **String** | The timestamp of the report date in epoch format for a specific Schedule |  [optional]
**noOfTasks** | **Integer** | No of tasks generated for the Schedule |  [optional]
**businessCalendar** | **String** | Name of Business Calender used in the Schedule |  [optional]
**owner** | **String** | Owner role used in the Schedule |  [optional]
**notes** | **String** | Notes of the Schedule |  [optional]
**finishDate** | **String** | The timestamp of the Finish Date in epoch format of the Schedule |  [optional]
**startDate** | **String** | The timestamp of the Start Date in epoch format of the Schedule |  [optional]
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated Schedule |  [optional]
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific Schedule |  [optional]
**hasTaskGenIssues** | **Boolean** | A flag that specifies if task generation has warning or error logs. |  [optional]



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


