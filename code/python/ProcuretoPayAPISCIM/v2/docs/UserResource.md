# UserResource


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_name** | **str** | Unique identifier for the User, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider&#39;s entire set of Users. | [readonly] 
**name** | [**UserResourceName**](UserResourceName.md) |  | 
**email** | **str** | Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;. | 
**schemas** | **[str]** |  | [optional] 
**id** | **str** |  | [optional] [readonly] 
**external_id** | **str** |  | [optional] 
**phone_numbers** | [**[UserResourcePhoneNumbers]**](UserResourcePhoneNumbers.md) | Phone numbers for the User.  The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;main&#39;, &#39;work&#39;, &#39;mobile&#39;, and &#39;home&#39;. | [optional] [readonly] 
**groups** | [**[UserResourceGroups]**](UserResourceGroups.md) | A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated. | [optional] [readonly] 
**urnscimschemasextension_fact_set_core1_0_user** | [**UserResourceUrnScimSchemasExtensionFactSetCore10User**](UserResourceUrnScimSchemasExtensionFactSetCore10User.md) |  | [optional] 
**urnscimschemasextension_fact_set_vrs1_0_user** | [**UserResourceUrnScimSchemasExtensionFactSetVRS10User**](UserResourceUrnScimSchemasExtensionFactSetVRS10User.md) |  | [optional] 
**meta** | [**UserResourceMeta**](UserResourceMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


