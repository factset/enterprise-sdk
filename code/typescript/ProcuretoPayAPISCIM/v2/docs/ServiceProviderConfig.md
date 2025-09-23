# procuretopayapiscim.ServiceProviderConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[String]** | An array containing the standard schema URI used for identifying a service provider&#39;s configuration. See RFC 7643 section 5. | [optional] 
**documentationUri** | **String** | An HTTP-addressable URL pointing to the service provider&#39;s human-consumable help documentation. | [optional] [readonly] 
**patch** | [**ServiceProviderConfigPatch**](ServiceProviderConfigPatch.md) |  | 
**bulk** | [**ServiceProviderConfigBulk**](ServiceProviderConfigBulk.md) |  | 
**filter** | [**ServiceProviderConfigFilter**](ServiceProviderConfigFilter.md) |  | 
**changePassword** | [**ServiceProviderConfigChangePassword**](ServiceProviderConfigChangePassword.md) |  | 
**sort** | [**ServiceProviderConfigSort**](ServiceProviderConfigSort.md) |  | 
**etag** | [**ServiceProviderConfigEtag**](ServiceProviderConfigEtag.md) |  | 
**authenticationSchemes** | [**[AuthenticationScheme]**](AuthenticationScheme.md) | A complex type that specifies supported authentication scheme properties. | 



## Enum: [SchemasEnum]


* `urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig` (value: `"urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig"`)




