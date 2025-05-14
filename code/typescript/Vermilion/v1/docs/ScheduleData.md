# vermilion.ScheduleData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | **Number** | Unique identifier of the Schedule. | [optional] 
**name** | **String** | Name of the Schedule. | [optional] 
**definitionName** | **String** | Name of Schedule Definition from which the Schedule has been generated. | [optional] 
**status** | **String** | Status of the Schedule. | [optional] 
**scheduleGroup** | **String** | Group of the Schedule. | [optional] 
**reportDate** | **String** | The timestamp of the report date in epoch format for a specific Schedule | [optional] 
**noOfTasks** | **Number** | No of tasks generated for the Schedule | [optional] 
**businessCalendar** | **String** | Name of Business Calender used in the Schedule | [optional] 
**owner** | **String** | Owner role used in the Schedule | [optional] 
**notes** | **String** | Notes of the Schedule | [optional] 
**finishDate** | **String** | The timestamp of the Finish Date in epoch format of the Schedule | [optional] 
**startDate** | **String** | The timestamp of the Start Date in epoch format of the Schedule | [optional] 
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated Schedule | [optional] 
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific Schedule | [optional] 



## Enum: StatusEnum


* `INITIALISED` (value: `"INITIALISED"`)

* `RUNNING` (value: `"RUNNING"`)

* `CANCELLED` (value: `"CANCELLED"`)

* `SUSPENDED` (value: `"SUSPENDED"`)

* `FINISHED` (value: `"FINISHED"`)

* `CLOSED` (value: `"CLOSED"`)

* `GENERATING_TASKS` (value: `"GENERATING_TASKS"`)




