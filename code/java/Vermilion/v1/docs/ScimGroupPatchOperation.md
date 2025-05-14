

# ScimGroupPatchOperation

Patch operation to modify a group's attributes. It defines the action to take, the attribute to modify, and the new value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | **String** | Action to perform on the group attribute. |  [optional]
**path** | **String** | The group/role attribute path to modify. |  [optional]
**value** | [**ScimGroupPatchOperationValue**](ScimGroupPatchOperationValue.md) |  |  [optional]


## Implemented Interfaces

* Serializable


