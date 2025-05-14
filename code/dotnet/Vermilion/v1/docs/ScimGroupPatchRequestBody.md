# FactSet.SDK.Vermilion.Model.ScimGroupPatchRequestBody
Defines the request payload for updating a group's attributes in SCIM. This patch operation allows for specific modifications to a group's properties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** | An array of URIs representing the schema namespaces applied to this request. | [optional] 
**Operations** | [**List&lt;ScimGroupPatchOperation&gt;**](ScimGroupPatchOperation.md) | A list of operations specifying the actions to perform on the group&#39;s attributes, such as adding, removing, or updating members. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

