# FactSet.SDK.ProcuretoPaySCIM.Api.VermilionGroupsApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VermilionGroupsGet**](VermilionGroupsApi.md#vermiliongroupsget) | **GET** /VermilionGroups | Get a list of Vermilion groups.
[**VermilionGroupsIdGet**](VermilionGroupsApi.md#vermiliongroupsidget) | **GET** /VermilionGroups/{id} | Get a Vermilion group.
[**VermilionGroupsIdPatch**](VermilionGroupsApi.md#vermiliongroupsidpatch) | **PATCH** /VermilionGroups/{id} | Patch a Vermilion group (add, replace, or remove attributes of a Vermilion group.)
[**VermilionGroupsIdPut**](VermilionGroupsApi.md#vermiliongroupsidput) | **PUT** /VermilionGroups/{id} | Replace a Vermilion group.


<a name="vermiliongroupsget"></a>
# **VermilionGroupsGet**
> VermilionGroupResource VermilionGroupsGet (string filter = null, int? startIndex = null, int? count = null, string attributes = null, string excludedAttributes = null)

Get a list of Vermilion groups.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPaySCIM.Api;
using FactSet.SDK.ProcuretoPaySCIM.Client;
using FactSet.SDK.ProcuretoPaySCIM.Model;

namespace Example
{
    public class VermilionGroupsGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new VermilionGroupsApi(config);
            var filter = "filter_example";  // string | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. **Note**: only a subset of the filter string grammar is currently supported. (optional) 
            var startIndex = 56;  // int? | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional) 
            var count = 56;  // int? | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional) 
            var attributes = "attributes_example";  // string | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional) 
            var excludedAttributes = "excludedAttributes_example";  // string | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional) 

            try
            {
                // Get a list of Vermilion groups.
                VermilionGroupResource result = apiInstance.VermilionGroupsGet(filter, startIndex, count, attributes, excludedAttributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VermilionGroupsApi.VermilionGroupsGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. **Note**: only a subset of the filter string grammar is currently supported. | [optional] 
 **startIndex** | **int?**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional] 
 **count** | **int?**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional] 
 **attributes** | **string**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional] 
 **excludedAttributes** | **string**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional] 

### Return type
[**VermilionGroupResource**](VermilionGroupResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Invalid filter value provided. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="vermiliongroupsidget"></a>
# **VermilionGroupsIdGet**
> VermilionGroupResource VermilionGroupsIdGet (string id)

Get a Vermilion group.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPaySCIM.Api;
using FactSet.SDK.ProcuretoPaySCIM.Client;
using FactSet.SDK.ProcuretoPaySCIM.Model;

namespace Example
{
    public class VermilionGroupsIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new VermilionGroupsApi(config);
            var id = "id_example";  // string | ID of resource.

            try
            {
                // Get a Vermilion group.
                VermilionGroupResource result = apiInstance.VermilionGroupsIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VermilionGroupsApi.VermilionGroupsIdGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| ID of resource. | 

### Return type
[**VermilionGroupResource**](VermilionGroupResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="vermiliongroupsidpatch"></a>
# **VermilionGroupsIdPatch**
> VermilionGroupResource VermilionGroupsIdPatch (string id, Patch patch = null)

Patch a Vermilion group (add, replace, or remove attributes of a Vermilion group.)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPaySCIM.Api;
using FactSet.SDK.ProcuretoPaySCIM.Client;
using FactSet.SDK.ProcuretoPaySCIM.Model;

namespace Example
{
    public class VermilionGroupsIdPatchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new VermilionGroupsApi(config);
            var id = "id_example";  // string | ID of resource.
            var patch = new Patch(); // Patch |  (optional) 

            try
            {
                // Patch a Vermilion group (add, replace, or remove attributes of a Vermilion group.)
                VermilionGroupResource result = apiInstance.VermilionGroupsIdPatch(id, patch);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VermilionGroupsApi.VermilionGroupsIdPatch: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| ID of resource. | 
 **patch** | [**Patch**](Patch.md)|  | [optional] 

### Return type
[**VermilionGroupResource**](VermilionGroupResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Patch request invalid. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="vermiliongroupsidput"></a>
# **VermilionGroupsIdPut**
> VermilionGroupResource VermilionGroupsIdPut (string id, VermilionGroupResource vermilionGroupResource)

Replace a Vermilion group.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPaySCIM.Api;
using FactSet.SDK.ProcuretoPaySCIM.Client;
using FactSet.SDK.ProcuretoPaySCIM.Model;

namespace Example
{
    public class VermilionGroupsIdPutExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new VermilionGroupsApi(config);
            var id = "id_example";  // string | ID of resource.
            var vermilionGroupResource = new VermilionGroupResource(); // VermilionGroupResource | Vermilion group resource.

            try
            {
                // Replace a Vermilion group.
                VermilionGroupResource result = apiInstance.VermilionGroupsIdPut(id, vermilionGroupResource);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling VermilionGroupsApi.VermilionGroupsIdPut: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| ID of resource. | 
 **vermilionGroupResource** | [**VermilionGroupResource**](VermilionGroupResource.md)| Vermilion group resource. | 

### Return type
[**VermilionGroupResource**](VermilionGroupResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Provided resource contains invalid data. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

