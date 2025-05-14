# vermilion.TaskDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdatedBy** | **String** | Indicates the username of the person who last updated task | [optional] 
**description** | **String** | Task description. | [optional] 
**taskType** | **String** | Type of the task. | [optional] 
**status** | **String** | Status of the task. | [optional] 
**expectedStartDate** | **String** | Expected start date of the task. | [optional] 
**expectedEndDate** | **String** | Expected end date of the task. | [optional] 
**actualStartDate** | **String** | Actual start date of the task. | [optional] 
**notes** | **String** | Notes for the task. | [optional] 
**immediate** | **Boolean** | Boolean flag to indicate whether the task is an immediate task. | [optional] 
**reason** | **String** | Reason for the task action. | [optional] 
**outputFormat** | **String** | Output Format for thet task. | [optional] 
**scheduleName** | **String** | Name of the schedule to which this task belongs to. | [optional] 
**mandatoryTaskApproveNotes** | **Boolean** | The flag if task approve notes are mandatory for the task | [optional] 
**lastUpdated** | **String** | The timestamp of the most recent update in epoch format for a specific task | [optional] 
**role** | **String** | Role associated with the task. | [optional] 
**action** | **Boolean** | Indicates if a task is actionable by the user. | [optional] 
**user** | **String** | User associated with the task. | [optional] 



## Enum: TaskTypeEnum


* `WAIT_FOR_DATA` (value: `"WAIT_FOR_DATA"`)

* `CUSTOM_DATA` (value: `"CUSTOM_DATA"`)

* `CREATE_MANUAL_DATA` (value: `"CREATE_MANUAL_DATA"`)

* `CREATE_FILTERED_DATA` (value: `"CREATE_FILTERED_DATA"`)

* `GET_DATA` (value: `"GET_DATA"`)

* `GENERATE_PREVIEW` (value: `"GENERATE_PREVIEW"`)

* `SIGNOFF_DATA` (value: `"SIGNOFF_DATA"`)

* `CUSTOM_GENERATE` (value: `"CUSTOM_GENERATE"`)

* `GENERATE_REPORT` (value: `"GENERATE_REPORT"`)

* `SIGNOFF_REPORT` (value: `"SIGNOFF_REPORT"`)

* `CUSTOM_DELIVERY` (value: `"CUSTOM_DELIVERY"`)

* `EMAIL_REPORT` (value: `"EMAIL_REPORT"`)

* `POST_REPORT` (value: `"POST_REPORT"`)

* `FTP_REPORT` (value: `"FTP_REPORT"`)

* `CUSTOM_OTHER` (value: `"CUSTOM_OTHER"`)

* `COPY_REPORT_FILE` (value: `"COPY_REPORT_FILE"`)

* `PACKAGE_REPORTS` (value: `"PACKAGE_REPORTS"`)





## Enum: StatusEnum


* `COMPLETED` (value: `"COMPLETED"`)

* `IN_PROGRESS` (value: `"IN_PROGRESS"`)

* `AWAITING_CORRECTION` (value: `"AWAITING_CORRECTION"`)

* `PENDING` (value: `"PENDING"`)

* `SKIPPED` (value: `"SKIPPED"`)

* `FAILED_REJECTED` (value: `"FAILED_REJECTED"`)




