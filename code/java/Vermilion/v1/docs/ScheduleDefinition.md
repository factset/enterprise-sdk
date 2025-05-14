

# ScheduleDefinition

List of Schedule Definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleDefinitionId** | **Integer** | Unique Identifier for the Schedule Definition. |  [optional]
**name** | **String** | Name of the Schedule Definition. |  [optional]
**code** | **String** | Code of the Schedule Definition. |  [optional]
**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | Type of Schedule Definition. |  [optional]
**scheduleGroup** | **String** | Group of the Schedule Definition. |  [optional]
**reportDate** | [**ReportDateEnum**](#ReportDateEnum) | Report Date of the Schedule Definition. |  [optional]
**numberOfObligations** | **Integer** | Number of obligations used in the Schedule Definition. |  [optional]
**businessCalendar** | **String** | Calender name used in the Schedule Definition. |  [optional]
**deleteScheduleAfterDays** | **Integer** | Indicates after how many days the Schedule should be deleted. |  [optional]
**numberOfPackages** | **Integer** | Indicates number of packages involved in the Schedule Definition. |  [optional]
**entities** | [**java.util.List&lt;EntityDTO&gt;**](EntityDTO.md) | A set of entities used in Schedule Definition. |  [optional]
**ownerRole** | [**ScheduleDefinitionOwnerRole**](ScheduleDefinitionOwnerRole.md) |  |  [optional]
**notes** | **String** | Notes of the Schedule Definition. |  [optional]
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated the Data Source. |  [optional]
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific Schedule Definition |  [optional]



## Enum: ScheduleTypeEnum

Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
REPEATING | &quot;REPEATING&quot;



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


