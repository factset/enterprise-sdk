

# TaskListItemDetails

Task Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated task |  [optional]
**description** | **String** | Task description. |  [optional]
**taskType** | [**TaskTypeEnum**](#TaskTypeEnum) | Type of the task. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the task. |  [optional]
**expectedStartDate** | **String** | Expected start date of the task. |  [optional]
**expectedEndDate** | **String** | Expected end date of the task. |  [optional]
**actualStartDate** | **String** | Actual start date of the task. |  [optional]
**notes** | **String** | Notes for the task. |  [optional]
**immediate** | **Boolean** | Boolean flag to indicate whether the task is an immediate task. |  [optional]
**reason** | **String** | Reason for the task action. |  [optional]
**outputFormat** | **String** | Output Format for thet task. |  [optional]
**scheduleName** | **String** | Name of the schedule to which this task belongs to. |  [optional]
**mandatoryTaskApproveNotes** | **Boolean** | The flag if task approve notes are mandatory for the task |  [optional]
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific task |  [optional]
**role** | **String** | Role associated with the task. |  [optional]
**action** | **Boolean** | Indicates if a task is actionable by the user. |  [optional]
**user** | **String** | User associated with the task. |  [optional]
**taskId** | **Integer** | Unique identifier of the Task. |  [optional]
**escalationLevel** | **Integer** | The escalation level of the task. |  [optional]
**order** | **Integer** | The order of the task. |  [optional]



## Enum: TaskTypeEnum

Name | Value
---- | -----
WAIT_FOR_DATA | &quot;WAIT_FOR_DATA&quot;
CUSTOM_DATA | &quot;CUSTOM_DATA&quot;
CREATE_MANUAL_DATA | &quot;CREATE_MANUAL_DATA&quot;
CREATE_FILTERED_DATA | &quot;CREATE_FILTERED_DATA&quot;
GET_DATA | &quot;GET_DATA&quot;
GENERATE_PREVIEW | &quot;GENERATE_PREVIEW&quot;
SIGNOFF_DATA | &quot;SIGNOFF_DATA&quot;
CUSTOM_GENERATE | &quot;CUSTOM_GENERATE&quot;
GENERATE_REPORT | &quot;GENERATE_REPORT&quot;
SIGNOFF_REPORT | &quot;SIGNOFF_REPORT&quot;
CUSTOM_DELIVERY | &quot;CUSTOM_DELIVERY&quot;
EMAIL_REPORT | &quot;EMAIL_REPORT&quot;
POST_REPORT | &quot;POST_REPORT&quot;
FTP_REPORT | &quot;FTP_REPORT&quot;
CUSTOM_OTHER | &quot;CUSTOM_OTHER&quot;
COPY_REPORT_FILE | &quot;COPY_REPORT_FILE&quot;
PACKAGE_REPORTS | &quot;PACKAGE_REPORTS&quot;



## Enum: StatusEnum

Name | Value
---- | -----
COMPLETED | &quot;COMPLETED&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
AWAITING_CORRECTION | &quot;AWAITING_CORRECTION&quot;
PENDING | &quot;PENDING&quot;
SKIPPED | &quot;SKIPPED&quot;
FAILED_REJECTED | &quot;FAILED_REJECTED&quot;


## Implemented Interfaces

* Serializable


