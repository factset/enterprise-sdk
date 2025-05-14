# ScimGroupPatchRequestBody

Defines the request payload for updating a group's attributes in SCIM. This patch operation allows for specific modifications to a group's properties.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[str]** | An array of URIs representing the schema namespaces applied to this request. | [optional] 
**operations** | [**[ScimGroupPatchOperation]**](ScimGroupPatchOperation.md) | A list of operations specifying the actions to perform on the group&#39;s attributes, such as adding, removing, or updating members. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


