# TaskPatchRequestBodyData

Task data object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** | Status of the task, status cannot be changed to IN_PROGRESS. It is case-sensitive and should be in upper case. | [optional] 
**expected_start_date** | **str** | Expected start date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. | [optional] 
**expected_end_date** | **str** | Expected end date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. | [optional] 
**actual_start_date** | **str** | Actual start date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. | [optional] 
**notes** | **str** | Notes for the task. | [optional] 
**role** | **str** | Role assigned to the task, It can&#39;t be null or empty. | [optional] 
**user** | **str** | User name assigned to the task. | [optional] 
**action** | **str** | task action to be performed, Approve and Reject are the possible values. | [optional] 
**reason** | **str** | Reason code for rejection or approval, It will be validated against values from VRSReasonCodes.properties. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


