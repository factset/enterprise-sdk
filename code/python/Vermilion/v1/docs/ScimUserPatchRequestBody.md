# ScimUserPatchRequestBody

Defines the request payload for updating a user's attributes. The patch operation modifies specific fields of a user.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[str]** | A list of URIs that indicate the namespaces of the schema used in this request. | [optional] 
**operations** | [**[ScimUserPatchOperation]**](ScimUserPatchOperation.md) | A list of operations defining the specific changes to apply to the user&#39;s attributes. Each operation specifies an action (e.g., add, remove, replace) the target attribute and value | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


