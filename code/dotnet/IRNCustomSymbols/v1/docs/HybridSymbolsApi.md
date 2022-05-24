# FactSet.SDK.IRNCustomSymbols.Api.HybridSymbolsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateStandardSymbolMetadata**](HybridSymbolsApi.md#createstandardsymbolmetadata) | **POST** /v1/custom-symbols/standard-symbol-metadata | Create standard symbol metadata
[**GetStandardSymbolMetadataGuid**](HybridSymbolsApi.md#getstandardsymbolmetadataguid) | **GET** /v1/custom-symbols/standard-symbol-metadata/{standardSymbol} | Get all custom field and standard field details on a specific standard symbol
[**PatchStandardSymbol**](HybridSymbolsApi.md#patchstandardsymbol) | **PATCH** /v1/custom-symbols/standard-symbol-metadata/{standardSymbolId} | Edit a standard symbol’s standard field and custom field data


<a name="createstandardsymbolmetadata"></a>
# **CreateStandardSymbolMetadata**
> NewItemDto CreateStandardSymbolMetadata (CreateStandardSymbolMetadataDto createStandardSymbolMetadataDto = null)

Create standard symbol metadata

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
    public class CreateStandardSymbolMetadataExample
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

            var apiInstance = new HybridSymbolsApi(config);
            var createStandardSymbolMetadataDto = new CreateStandardSymbolMetadataDto(); // CreateStandardSymbolMetadataDto | createStandardSymbolMetadataDto object to save (optional) 

            try
            {
                // Create standard symbol metadata
                NewItemDto result = apiInstance.CreateStandardSymbolMetadata(createStandardSymbolMetadataDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HybridSymbolsApi.CreateStandardSymbolMetadata: " + e.Message );
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
 **createStandardSymbolMetadataDto** | [**CreateStandardSymbolMetadataDto**](CreateStandardSymbolMetadataDto.md)| createStandardSymbolMetadataDto object to save | [optional] 

### Return type
[**NewItemDto**](NewItemDto.md)

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

<a name="getstandardsymbolmetadataguid"></a>
# **GetStandardSymbolMetadataGuid**
> Guid GetStandardSymbolMetadataGuid (string standardSymbol)

Get all custom field and standard field details on a specific standard symbol

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
    public class GetStandardSymbolMetadataGuidExample
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

            var apiInstance = new HybridSymbolsApi(config);
            var standardSymbol = "standardSymbol_example";  // string | Standard symbol to get associated customSymbolId

            try
            {
                // Get all custom field and standard field details on a specific standard symbol
                Guid result = apiInstance.GetStandardSymbolMetadataGuid(standardSymbol);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HybridSymbolsApi.GetStandardSymbolMetadataGuid: " + e.Message );
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
 **standardSymbol** | **string**| Standard symbol to get associated customSymbolId | 

### Return type
**Guid**

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

<a name="patchstandardsymbol"></a>
# **PatchStandardSymbol**
> void PatchStandardSymbol (Guid standardSymbolId, List<Operation> operation = null)

Edit a standard symbol’s standard field and custom field data

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
    public class PatchStandardSymbolExample
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

            var apiInstance = new HybridSymbolsApi(config);
            var standardSymbolId = "standardSymbolId_example";  // Guid | standardSymbolId to update associated standard symbol
            var operation = new List<Operation>(); // List<Operation> | updateCustomSymbolDto object to update (optional) 

            try
            {
                // Edit a standard symbol’s standard field and custom field data
                apiInstance.PatchStandardSymbol(standardSymbolId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HybridSymbolsApi.PatchStandardSymbol: " + e.Message );
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
 **standardSymbolId** | **Guid**| standardSymbolId to update associated standard symbol | 
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| updateCustomSymbolDto object to update | [optional] 

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
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

