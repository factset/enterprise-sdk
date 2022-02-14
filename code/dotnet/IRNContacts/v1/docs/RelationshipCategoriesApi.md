# FactSet.SDK.IRNContacts.Api.RelationshipCategoriesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1RelationshipCategoriesGet**](RelationshipCategoriesApi.md#v1relationshipcategoriesget) | **GET** /v1/relationship-categories | Get list of the relationship categories configured in your group
[**V1RelationshipCategoriesPost**](RelationshipCategoriesApi.md#v1relationshipcategoriespost) | **POST** /v1/relationship-categories | Create a relationship category
[**V1RelationshipCategoriesRelationshipCategoryIdDelete**](RelationshipCategoriesApi.md#v1relationshipcategoriesrelationshipcategoryiddelete) | **DELETE** /v1/relationship-categories/{relationshipCategoryId} | Delete a relationship category
[**V1RelationshipCategoriesRelationshipCategoryIdPut**](RelationshipCategoriesApi.md#v1relationshipcategoriesrelationshipcategoryidput) | **PUT** /v1/relationship-categories/{relationshipCategoryId} | Edit a relationship category
[**V1RelationshipCategoriesReorderPost**](RelationshipCategoriesApi.md#v1relationshipcategoriesreorderpost) | **POST** /v1/relationship-categories/reorder | Reorder relationship categories


<a name="v1relationshipcategoriesget"></a>
# **V1RelationshipCategoriesGet**
> List&lt;RelationshipCategoryDto&gt; V1RelationshipCategoriesGet ()

Get list of the relationship categories configured in your group

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1RelationshipCategoriesGetExample
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

            var apiInstance = new RelationshipCategoriesApi(config);

            try
            {
                // Get list of the relationship categories configured in your group
                List<RelationshipCategoryDto> result = apiInstance.V1RelationshipCategoriesGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipCategoriesApi.V1RelationshipCategoriesGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RelationshipCategoryDto&gt;**](RelationshipCategoryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1relationshipcategoriespost"></a>
# **V1RelationshipCategoriesPost**
> Guid V1RelationshipCategoriesPost (RelationshipCategorySaveDto relationshipCategorySaveDto = null)

Create a relationship category

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1RelationshipCategoriesPostExample
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

            var apiInstance = new RelationshipCategoriesApi(config);
            var relationshipCategorySaveDto = new RelationshipCategorySaveDto(); // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to save (optional) 

            try
            {
                // Create a relationship category
                Guid result = apiInstance.V1RelationshipCategoriesPost(relationshipCategorySaveDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipCategoriesApi.V1RelationshipCategoriesPost: " + e.Message );
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
 **relationshipCategorySaveDto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to save | [optional] 

### Return type

**Guid**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1relationshipcategoriesrelationshipcategoryiddelete"></a>
# **V1RelationshipCategoriesRelationshipCategoryIdDelete**
> void V1RelationshipCategoriesRelationshipCategoryIdDelete (Guid relationshipCategoryId)

Delete a relationship category

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1RelationshipCategoriesRelationshipCategoryIdDeleteExample
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

            var apiInstance = new RelationshipCategoriesApi(config);
            var relationshipCategoryId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | relationshipCategoryId to delete associated record

            try
            {
                // Delete a relationship category
                apiInstance.V1RelationshipCategoriesRelationshipCategoryIdDelete(relationshipCategoryId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipCategoriesApi.V1RelationshipCategoriesRelationshipCategoryIdDelete: " + e.Message );
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
 **relationshipCategoryId** | **Guid**| relationshipCategoryId to delete associated record | 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1relationshipcategoriesrelationshipcategoryidput"></a>
# **V1RelationshipCategoriesRelationshipCategoryIdPut**
> void V1RelationshipCategoriesRelationshipCategoryIdPut (Guid relationshipCategoryId, RelationshipCategorySaveDto relationshipCategorySaveDto = null)

Edit a relationship category

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1RelationshipCategoriesRelationshipCategoryIdPutExample
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

            var apiInstance = new RelationshipCategoriesApi(config);
            var relationshipCategoryId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | relationshipCategoryId to update associated record
            var relationshipCategorySaveDto = new RelationshipCategorySaveDto(); // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to update (optional) 

            try
            {
                // Edit a relationship category
                apiInstance.V1RelationshipCategoriesRelationshipCategoryIdPut(relationshipCategoryId, relationshipCategorySaveDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipCategoriesApi.V1RelationshipCategoriesRelationshipCategoryIdPut: " + e.Message );
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
 **relationshipCategoryId** | **Guid**| relationshipCategoryId to update associated record | 
 **relationshipCategorySaveDto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to update | [optional] 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1relationshipcategoriesreorderpost"></a>
# **V1RelationshipCategoriesReorderPost**
> void V1RelationshipCategoriesReorderPost (RelationshipCategoryListDto relationshipCategoryListDto = null)

Reorder relationship categories

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNContacts.Api;
using FactSet.SDK.IRNContacts.Client;
using FactSet.SDK.IRNContacts.Model;

namespace Example
{
    public class V1RelationshipCategoriesReorderPostExample
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

            var apiInstance = new RelationshipCategoriesApi(config);
            var relationshipCategoryListDto = new RelationshipCategoryListDto(); // RelationshipCategoryListDto | List of Guid (optional) 

            try
            {
                // Reorder relationship categories
                apiInstance.V1RelationshipCategoriesReorderPost(relationshipCategoryListDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipCategoriesApi.V1RelationshipCategoriesReorderPost: " + e.Message );
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
 **relationshipCategoryListDto** | [**RelationshipCategoryListDto**](RelationshipCategoryListDto.md)| List of Guid | [optional] 

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

