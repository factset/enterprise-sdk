

# TaskPatchRequestBodyData

Task data object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the task, status cannot be changed to IN_PROGRESS. It is case-sensitive and should be in upper case. |  [optional]
**expectedStartDate** | **String** | Expected start date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. |  [optional]
**expectedEndDate** | **String** | Expected end date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. |  [optional]
**actualStartDate** | **String** | Actual start date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. |  [optional]
**notes** | **String** | Notes for the task. |  [optional]
**role** | **String** | Role assigned to the task, It can&#39;t be null or empty. |  [optional]
**user** | **String** | User name assigned to the task. |  [optional]
**action** | **String** | task action to be performed, Approve and Reject are the possible values. |  [optional]
**reason** | **String** | Reason code for rejection or approval, It will be validated against values from VRSReasonCodes.properties. |  [optional]



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


