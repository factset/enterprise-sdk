# ScimGroupPatchOperation

Patch operation to modify a group's attributes. It defines the action to take, the attribute to modify, and the new value.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | **str** | Action to perform on the group attribute. | [optional] 
**path** | **str** | The group/role attribute path to modify. | [optional] 
**value** | [**ScimGroupPatchOperationValue**](ScimGroupPatchOperationValue.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


