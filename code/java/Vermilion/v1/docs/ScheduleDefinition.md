

# ScheduleDefinition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleDefinitionId** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) |  |  [optional]
**scheduleGroup** | **String** |  |  [optional]
**reportDate** | [**ReportDateEnum**](#ReportDateEnum) |  |  [optional]
**numberOfObligations** | **Integer** |  |  [optional]
**businessCalendar** | **String** |  |  [optional]
**deleteScheduleAfterDays** | **Integer** |  |  [optional]
**numberOfPackages** | **Integer** |  |  [optional]
**entities** | [**java.util.List&lt;EntityDTO&gt;**](EntityDTO.md) |  |  [optional]
**ownerRole** | [**ScheduleDefinitionOwnerRole**](ScheduleDefinitionOwnerRole.md) |  |  [optional]
**notes** | **String** |  |  [optional]
**lastUpdatedBy** | **String** |  |  [optional]
**lastUpdated** | **String** |  |  [optional]



## Enum: ScheduleTypeEnum

Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
REPEATING | &quot;REPEATING&quot;
TEMPLATE | &quot;TEMPLATE&quot;
ADHOC | &quot;ADHOC&quot;



## Enum: ReportDateEnum

Name | Value
---- | -----
LAST_DAY_OF_PREV_MONTH | &quot;LAST_DAY_OF_PREV_MONTH&quot;
LAST_BUSINESS_DAY_OF_PREV_MONTH | &quot;LAST_BUSINESS_DAY_OF_PREV_MONTH&quot;
CREATION_DATE | &quot;CREATION_DATE&quot;
DAY_BEFORE_CREATION_DATE | &quot;DAY_BEFORE_CREATION_DATE&quot;
BUSINESS_DAY_BEFORE_CREATION_DATE | &quot;BUSINESS_DAY_BEFORE_CREATION_DATE&quot;
LAST_DAY_OF_MONTH_SCHEDULE_CREATED | &quot;LAST_DAY_OF_MONTH_SCHEDULE_CREATED&quot;
LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED | &quot;LAST_BUSINESS_DAY_OF_MONTH_SCHEDULE_CREATED&quot;
LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED | &quot;LAST_BUSINESS_DAY_OF_PREVIOUS_WEEK_SCHEDULE_CREATED&quot;
LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED | &quot;LAST_BUSINESS_DAY_OF_WEEK_SCHEDULE_CREATED&quot;
TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED | &quot;TWO_BUSINESS_DAYS_BEFORE_SCHEDULE_CREATED&quot;


## Implemented Interfaces

* Serializable


