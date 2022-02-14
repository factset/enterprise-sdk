# FactSet.SDK.IRNContacts.Api.RelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1RelationshipsGet**](RelationshipsApi.md#v1relationshipsget) | **GET** /v1/relationships | Get list of the relationships configured in your group
[**V1RelationshipsPost**](RelationshipsApi.md#v1relationshipspost) | **POST** /v1/relationships | Create a relationship type
[**V1RelationshipsRelationshipIdDelete**](RelationshipsApi.md#v1relationshipsrelationshipiddelete) | **DELETE** /v1/relationships/{relationshipId} | Delete a relationship type
[**V1RelationshipsRelationshipIdPut**](RelationshipsApi.md#v1relationshipsrelationshipidput) | **PUT** /v1/relationships/{relationshipId} | Edit a relationship type


<a name="v1relationshipsget"></a>
# **V1RelationshipsGet**
> List&lt;RelationshipDto&gt; V1RelationshipsGet (RelationshipType? type = null)

Get list of the relationships configured in your group

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
    public class V1RelationshipsGetExample
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

            var apiInstance = new RelationshipsApi(config);
            var type = ;  // RelationshipType? |  (optional) 

            try
            {
                // Get list of the relationships configured in your group
                List<RelationshipDto> result = apiInstance.V1RelationshipsGet(type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipsApi.V1RelationshipsGet: " + e.Message );
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
 **type** | **RelationshipType?**|  | [optional] 

### Return type

[**List&lt;RelationshipDto&gt;**](RelationshipDto.md)

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

<a name="v1relationshipspost"></a>
# **V1RelationshipsPost**
> Guid V1RelationshipsPost (RelationshipSaveDto relationshipSaveDto = null)

Create a relationship type

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
    public class V1RelationshipsPostExample
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

            var apiInstance = new RelationshipsApi(config);
            var relationshipSaveDto = new RelationshipSaveDto(); // RelationshipSaveDto | RelationshipSaveDto object to save (optional) 

            try
            {
                // Create a relationship type
                Guid result = apiInstance.V1RelationshipsPost(relationshipSaveDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipsApi.V1RelationshipsPost: " + e.Message );
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
 **relationshipSaveDto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to save | [optional] 

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

<a name="v1relationshipsrelationshipiddelete"></a>
# **V1RelationshipsRelationshipIdDelete**
> void V1RelationshipsRelationshipIdDelete (Guid relationshipId)

Delete a relationship type

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
    public class V1RelationshipsRelationshipIdDeleteExample
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

            var apiInstance = new RelationshipsApi(config);
            var relationshipId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | relationshipId to delete associated record

            try
            {
                // Delete a relationship type
                apiInstance.V1RelationshipsRelationshipIdDelete(relationshipId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipsApi.V1RelationshipsRelationshipIdDelete: " + e.Message );
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
 **relationshipId** | **Guid**| relationshipId to delete associated record | 

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

<a name="v1relationshipsrelationshipidput"></a>
# **V1RelationshipsRelationshipIdPut**
> void V1RelationshipsRelationshipIdPut (Guid relationshipId, RelationshipSaveDto relationshipSaveDto = null)

Edit a relationship type

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
    public class V1RelationshipsRelationshipIdPutExample
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

            var apiInstance = new RelationshipsApi(config);
            var relationshipId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | relationshipId to update associated record
            var relationshipSaveDto = new RelationshipSaveDto(); // RelationshipSaveDto | RelationshipSaveDto object to update (optional) 

            try
            {
                // Edit a relationship type
                apiInstance.V1RelationshipsRelationshipIdPut(relationshipId, relationshipSaveDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RelationshipsApi.V1RelationshipsRelationshipIdPut: " + e.Message );
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
 **relationshipId** | **Guid**| relationshipId to update associated record | 
 **relationshipSaveDto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to update | [optional] 

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

