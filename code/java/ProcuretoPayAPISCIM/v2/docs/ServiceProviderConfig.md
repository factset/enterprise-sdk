

# ServiceProviderConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | [**java.util.List&lt;SchemasEnum&gt;**](#java.util.List&lt;SchemasEnum&gt;) | An array containing the standard schema URI used for identifying a service provider&#39;s configuration. See RFC 7643 section 5. |  [optional]
**documentationUri** | **String** | An HTTP-addressable URL pointing to the service provider&#39;s human-consumable help documentation. |  [optional] [readonly]
**patch** | [**ServiceProviderConfigPatch**](ServiceProviderConfigPatch.md) |  | 
**bulk** | [**ServiceProviderConfigBulk**](ServiceProviderConfigBulk.md) |  | 
**filter** | [**ServiceProviderConfigFilter**](ServiceProviderConfigFilter.md) |  | 
**changePassword** | [**ServiceProviderConfigChangePassword**](ServiceProviderConfigChangePassword.md) |  | 
**sort** | [**ServiceProviderConfigSort**](ServiceProviderConfigSort.md) |  | 
**etag** | [**ServiceProviderConfigEtag**](ServiceProviderConfigEtag.md) |  | 
**authenticationSchemes** | [**java.util.List&lt;AuthenticationScheme&gt;**](AuthenticationScheme.md) | A complex type that specifies supported authentication scheme properties. | 



## Enum: java.util.List&lt;SchemasEnum&gt;

Name | Value
---- | -----
URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_SERVICEPROVIDERCONFIG | &quot;urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig&quot;


## Implemented Interfaces

* Serializable


