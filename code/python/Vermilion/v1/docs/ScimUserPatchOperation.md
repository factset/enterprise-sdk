# ScimUserPatchOperation

Patch operation to modify a user's attributes. It includes the action to be performed, the attribute to modify, and the new value.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | **str** | Action to perform on the attribute. | [optional] 
**path** | **str** | The user attribute path to modify. | [optional] 
**value** | **str** | The value to set for the attribute. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


