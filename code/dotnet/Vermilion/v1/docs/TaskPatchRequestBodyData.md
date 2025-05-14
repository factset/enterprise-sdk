# FactSet.SDK.Vermilion.Model.TaskPatchRequestBodyData
Task data object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | Status of the task, status cannot be changed to IN_PROGRESS. It is case-sensitive and should be in upper case. | [optional] 
**ExpectedStartDate** | **string** | Expected start date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. | [optional] 
**ExpectedEndDate** | **string** | Expected end date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. | [optional] 
**ActualStartDate** | **string** | Actual start date of task, date format should be &#39;d MMMMM yyyy HH:mm:ss&#39; and will be converted to server time zone. | [optional] 
**Notes** | **string** | Notes for the task. | [optional] 
**Role** | **string** | Role assigned to the task, It can&#39;t be null or empty. | [optional] 
**User** | **string** | User name assigned to the task. | [optional] 
**Action** | **string** | task action to be performed, Approve and Reject are the possible values. | [optional] 
**Reason** | **string** | Reason code for rejection or approval, It will be validated against values from VRSReasonCodes.properties. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

