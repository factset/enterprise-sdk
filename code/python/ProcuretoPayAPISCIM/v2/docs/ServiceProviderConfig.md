# ServiceProviderConfig


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**patch** | [**ServiceProviderConfigPatch**](ServiceProviderConfigPatch.md) |  | 
**bulk** | [**ServiceProviderConfigBulk**](ServiceProviderConfigBulk.md) |  | 
**filter** | [**ServiceProviderConfigFilter**](ServiceProviderConfigFilter.md) |  | 
**change_password** | [**ServiceProviderConfigChangePassword**](ServiceProviderConfigChangePassword.md) |  | 
**sort** | [**ServiceProviderConfigSort**](ServiceProviderConfigSort.md) |  | 
**etag** | [**ServiceProviderConfigEtag**](ServiceProviderConfigEtag.md) |  | 
**authentication_schemes** | [**[AuthenticationScheme]**](AuthenticationScheme.md) | A complex type that specifies supported authentication scheme properties. | 
**schemas** | **[str]** | An array containing the standard schema URI used for identifying a service provider&#39;s configuration. See RFC 7643 section 5. | [optional] 
**documentation_uri** | **str** | An HTTP-addressable URL pointing to the service provider&#39;s human-consumable help documentation. | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


