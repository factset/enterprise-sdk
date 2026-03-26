# InlineResponse200DataTriggerStatus

Status of the trigger.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str, none_type** | Code of the status. | Value | Description | | --- | --- | | active | The trigger is active and trigger conditions are evaluated. | | inactive | The trigger is inactive and conditions do not generate alerts | | error | The trigger is in an error state, error details are noted in \&quot;details\&quot; |   | [optional] 
**details** | **str, none_type** | A human-readable, unstructured explanation specific to this error. | [optional] 
**encrypted_details** | **str, none_type** | Base64-encoded, internal details about the error, in addition to \&quot;details\&quot;. An issue submitted to Service Desk should contain this data to speed up investigation. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


