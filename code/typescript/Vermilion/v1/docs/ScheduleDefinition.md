# vermilion.ScheduleDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleDefinitionId** | **Number** | Unique Identifier for the Schedule Definition. | [optional] 
**name** | **String** | Name of the Schedule Definition. | [optional] 
**code** | **String** | Code of the Schedule Definition. | [optional] 
**scheduleType** | **String** | Type of Schedule Definition. | [optional] 
**scheduleGroup** | **String** | Group of the Schedule Definition. | [optional] 
**reportDate** | **String** | Report Date of the Schedule Definition. | [optional] 
**numberOfObligations** | **Number** | Number of obligations used in the Schedule Definition. | [optional] 
**businessCalendar** | **String** | Calender name used in the Schedule Definition. | [optional] 
**deleteScheduleAfterDays** | **Number** | Indicates after how many days the Schedule should be deleted. | [optional] 
**numberOfPackages** | **Number** | Indicates number of packages involved in the Schedule Definition. | [optional] 
**entities** | [**[EntityDTO]**](EntityDTO.md) | A set of entities used in Schedule Definition. | [optional] 
**ownerRole** | [**ScheduleDefinitionOwnerRole**](ScheduleDefinitionOwnerRole.md) |  | [optional] 
**notes** | **String** | Notes of the Schedule Definition. | [optional] 
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated the Data Source. | [optional] 
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific Schedule Definition | [optional] 



## Enum: ScheduleTypeEnum


* `MANUAL` (value: `"MANUAL"`)

* `REPEATING` (value: `"REPEATING"`)





## Enum: ReportDateEnum


* `LAST_DAY_OF_PREV_MONTH` (value: `"LAST_DAY_OF_PREV_MONTH"`)

* `LAST_BUSINESS_DAY_OF_PREV_MONTH` (value: `"LAST_BUSINESS_DAY_OF_PREV_MONTH"`)

* `CREATION_DATE` (value: `"CREATION_DATE"`)

* `DAY_BEFORE_CREATION_DATE` (value: `"DAY_BEFORE_CREATION_DATE"`)

* `BUSINESS_DAY_BEFORE_CREATION_DATE` (value: `"BUSINESS_DAY_BEFORE_CREATION_DATE"`)

* `LAST_DAY_OF_MONTH_SCHEDULE_CREATED` (value: `"LAST_DAY_OF_MONTH_SCHEDULE_CREATED"`)

* `LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED` (value: `"LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED"`)

* `LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED` (value: `"LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED"`)

* `LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED` (value: `"LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED"`)

* `TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED` (value: `"TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED"`)




