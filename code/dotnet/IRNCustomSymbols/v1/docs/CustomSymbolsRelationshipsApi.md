# FactSet.SDK.IRNCustomSymbols.Api.CustomSymbolsRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateSymbolRelationship**](CustomSymbolsRelationshipsApi.md#createsymbolrelationship) | **POST** /v1/symbol-relationships | Create a symbol relationship
[**DeleteSymbolRelationship**](CustomSymbolsRelationshipsApi.md#deletesymbolrelationship) | **DELETE** /v1/symbol-relationships/{symbolRelationshipId} | Delete a symbol relationship
[**EditAndAddSymbolRelationship**](CustomSymbolsRelationshipsApi.md#editandaddsymbolrelationship) | **PUT** /v1/symbol-relationships/{symbol} | Edit a symbol relationship
[**GetSymbolRelationship**](CustomSymbolsRelationshipsApi.md#getsymbolrelationship) | **GET** /v1/symbol-relationships/{symbolRelationshipId} | Get details on a specific symbol relationship
[**GetSymbolRelationships**](CustomSymbolsRelationshipsApi.md#getsymbolrelationships) | **GET** /v1/symbol-relationships/{symbolId}/relationships | Returns a list of a symbol’s relationships


<a name="createsymbolrelationship"></a>
# **CreateSymbolRelationship**
> void CreateSymbolRelationship (List<SymbolRelationshipSaveDto> symbolRelationshipSaveDto = null)

Create a symbol relationship

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNCustomSymbols.Api;
using FactSet.SDK.IRNCustomSymbols.Client;
using FactSet.SDK.IRNCustomSymbols.Model;

namespace Example
{
    public class CreateSymbolRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNCustomSymbols.Client.Configuration();

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

            var apiInstance = new CustomSymbolsRelationshipsApi(config);
            var symbolRelationshipSaveDto = new List<SymbolRelationshipSaveDto>(); // List<SymbolRelationshipSaveDto> | symbolRelationship object to save (optional) 

            try
            {
                // Create a symbol relationship
                apiInstance.CreateSymbolRelationship(symbolRelationshipSaveDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsRelationshipsApi.CreateSymbolRelationship: " + e.Message );
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
 **symbolRelationshipSaveDto** | [**List&lt;SymbolRelationshipSaveDto&gt;**](SymbolRelationshipSaveDto.md)| symbolRelationship object to save | [optional] 

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletesymbolrelationship"></a>
# **DeleteSymbolRelationship**
> void DeleteSymbolRelationship (Guid symbolRelationshipId)

Delete a symbol relationship

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNCustomSymbols.Api;
using FactSet.SDK.IRNCustomSymbols.Client;
using FactSet.SDK.IRNCustomSymbols.Model;

namespace Example
{
    public class DeleteSymbolRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNCustomSymbols.Client.Configuration();

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

            var apiInstance = new CustomSymbolsRelationshipsApi(config);
            var symbolRelationshipId = "symbolRelationshipId_example";  // Guid | symbolRelationshipId to delete associated record

            try
            {
                // Delete a symbol relationship
                apiInstance.DeleteSymbolRelationship(symbolRelationshipId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsRelationshipsApi.DeleteSymbolRelationship: " + e.Message );
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
 **symbolRelationshipId** | **Guid**| symbolRelationshipId to delete associated record | 

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

<a name="editandaddsymbolrelationship"></a>
# **EditAndAddSymbolRelationship**
> void EditAndAddSymbolRelationship (string symbol, List<SymbolRelationshipUpdateDto> symbolRelationshipUpdateDto = null)

Edit a symbol relationship

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNCustomSymbols.Api;
using FactSet.SDK.IRNCustomSymbols.Client;
using FactSet.SDK.IRNCustomSymbols.Model;

namespace Example
{
    public class EditAndAddSymbolRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNCustomSymbols.Client.Configuration();

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

            var apiInstance = new CustomSymbolsRelationshipsApi(config);
            var symbol = "symbol_example";  // string | 
            var symbolRelationshipUpdateDto = new List<SymbolRelationshipUpdateDto>(); // List<SymbolRelationshipUpdateDto> | symbolRelationship object to save (optional) 

            try
            {
                // Edit a symbol relationship
                apiInstance.EditAndAddSymbolRelationship(symbol, symbolRelationshipUpdateDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsRelationshipsApi.EditAndAddSymbolRelationship: " + e.Message );
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
 **symbol** | **string**|  | 
 **symbolRelationshipUpdateDto** | [**List&lt;SymbolRelationshipUpdateDto&gt;**](SymbolRelationshipUpdateDto.md)| symbolRelationship object to save | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsymbolrelationship"></a>
# **GetSymbolRelationship**
> SymbolRelationshipDto GetSymbolRelationship (Guid symbolRelationshipId)

Get details on a specific symbol relationship

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNCustomSymbols.Api;
using FactSet.SDK.IRNCustomSymbols.Client;
using FactSet.SDK.IRNCustomSymbols.Model;

namespace Example
{
    public class GetSymbolRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNCustomSymbols.Client.Configuration();

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

            var apiInstance = new CustomSymbolsRelationshipsApi(config);
            var symbolRelationshipId = "symbolRelationshipId_example";  // Guid | symbolRelationshipId to get associated record

            try
            {
                // Get details on a specific symbol relationship
                SymbolRelationshipDto result = apiInstance.GetSymbolRelationship(symbolRelationshipId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsRelationshipsApi.GetSymbolRelationship: " + e.Message );
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
 **symbolRelationshipId** | **Guid**| symbolRelationshipId to get associated record | 

### Return type
[**SymbolRelationshipDto**](SymbolRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsymbolrelationships"></a>
# **GetSymbolRelationships**
> List&lt;SymbolRelationshipDto&gt; GetSymbolRelationships (Guid symbolId)

Returns a list of a symbol’s relationships

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNCustomSymbols.Api;
using FactSet.SDK.IRNCustomSymbols.Client;
using FactSet.SDK.IRNCustomSymbols.Model;

namespace Example
{
    public class GetSymbolRelationshipsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNCustomSymbols.Client.Configuration();

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

            var apiInstance = new CustomSymbolsRelationshipsApi(config);
            var symbolId = "symbolId_example";  // Guid | symbolId to get associated records

            try
            {
                // Returns a list of a symbol’s relationships
                List<SymbolRelationshipDto> result = apiInstance.GetSymbolRelationships(symbolId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsRelationshipsApi.GetSymbolRelationships: " + e.Message );
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
 **symbolId** | **Guid**| symbolId to get associated records | 

### Return type
[**List&lt;SymbolRelationshipDto&gt;**](SymbolRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

