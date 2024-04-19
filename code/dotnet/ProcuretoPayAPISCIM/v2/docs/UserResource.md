# FactSet.SDK.ProcuretoPayAPISCIM.Model.UserResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** |  | [optional] 
**Id** | **string** |  | [optional] [readonly] 
**ExternalId** | **string** | An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. | [optional] 
**UserName** | **string** | Unique identifier for the User, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider&#39;s entire set of Users. | [readonly] 
**Name** | [**UserResourceName**](UserResourceName.md) |  | 
**Email** | **string** | Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;. | 
**PhoneNumbers** | [**List&lt;UserResourcePhoneNumbers&gt;**](UserResourcePhoneNumbers.md) | Phone numbers for the User.  The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;main&#39;, &#39;work&#39;, &#39;mobile&#39;, and &#39;home&#39;. | [optional] [readonly] 
**Groups** | [**List&lt;UserResourceGroups&gt;**](UserResourceGroups.md) | A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated. | [optional] [readonly] 
**UrnscimschemasextensionFactSetCore10User** | [**UserResourceUrnScimSchemasExtensionFactSetCore10User**](UserResourceUrnScimSchemasExtensionFactSetCore10User.md) |  | [optional] 
**UrnscimschemasextensionFactSetVRS10User** | [**UserResourceUrnScimSchemasExtensionFactSetVRS10User**](UserResourceUrnScimSchemasExtensionFactSetVRS10User.md) |  | [optional] 
**Meta** | [**UserResourceMeta**](UserResourceMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

