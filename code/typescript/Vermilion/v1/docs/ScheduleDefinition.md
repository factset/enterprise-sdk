# vermilion.ScheduleDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleDefinitionId** | **Number** |  | [optional] 
**name** | **String** |  | [optional] 
**code** | **String** |  | [optional] 
**scheduleType** | **String** |  | [optional] 
**scheduleGroup** | **String** |  | [optional] 
**reportDate** | **String** |  | [optional] 
**numberOfObligations** | **Number** |  | [optional] 
**businessCalendar** | **String** |  | [optional] 
**deleteScheduleAfterDays** | **Number** |  | [optional] 
**numberOfPackages** | **Number** |  | [optional] 
**entities** | [**[EntityDTO]**](EntityDTO.md) |  | [optional] 
**ownerRole** | [**ScheduleDefinitionOwnerRole**](ScheduleDefinitionOwnerRole.md) |  | [optional] 
**notes** | **String** |  | [optional] 
**lastUpdatedBy** | **String** |  | [optional] 
**lastUpdated** | **String** |  | [optional] 



## Enum: ScheduleTypeEnum


* `MANUAL` (value: `"MANUAL"`)

* `REPEATING` (value: `"REPEATING"`)

* `TEMPLATE` (value: `"TEMPLATE"`)

* `ADHOC` (value: `"ADHOC"`)





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




