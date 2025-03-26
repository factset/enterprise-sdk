# FactSet.SDK.ProcuretoPayAPISCIM.Model.Patch
The request body used for the HTTP PATCH server function (see RFC 7644 section 3.5.2.) This can be used to alter an individual SCIM resource.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** | An array containing the standard schema URI used for SCIM PATCH requests. | [optional] 
**Operations** | [**List&lt;PatchOperation&gt;**](PatchOperation.md) | The list of PATCH operations that should be applied for the PATCH request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

