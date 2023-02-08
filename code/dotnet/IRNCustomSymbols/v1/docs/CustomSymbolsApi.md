# FactSet.SDK.IRNCustomSymbols.Api.CustomSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCustomSymbol**](CustomSymbolsApi.md#createcustomsymbol) | **POST** /v1/custom-symbols | Create a custom symbol
[**DeleteCustomSymbol**](CustomSymbolsApi.md#deletecustomsymbol) | **DELETE** /v1/custom-symbols/{customSymbolId} | Delete a custom symbol
[**GetCustomSymbol**](CustomSymbolsApi.md#getcustomsymbol) | **GET** /v1/custom-symbols/{customSymbolId} | Get all custom field and standard field details on a specific custom symbol
[**GetCustomSymbolRecords**](CustomSymbolsApi.md#getcustomsymbolrecords) | **GET** /v1/custom-symbols/{customSymbolId}/records | Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
[**GetCustomSymbols**](CustomSymbolsApi.md#getcustomsymbols) | **GET** /v1/custom-symbols | Get list of all custom symbols in your group along with some of their standard field and custom fields data
[**LinkCustomSymbolToStandardSymbol**](CustomSymbolsApi.md#linkcustomsymboltostandardsymbol) | **POST** /v1/custom-symbols/{customSymbolId}/link-standard-symbol | Link custom symbol to standard symbol
[**PatchCustomSymbol**](CustomSymbolsApi.md#patchcustomsymbol) | **PATCH** /v1/custom-symbols/{customSymbolId} | Edit a custom symbol’s standard field and custom field data



<a name="createcustomsymbol"></a>
# **CreateCustomSymbol**
> NewItemDto CreateCustomSymbol (CreateCustomSymbolDto createCustomSymbolDto = null)

Create a custom symbol

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
    public class CreateCustomSymbolExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var createCustomSymbolDto = new CreateCustomSymbolDto(); // CreateCustomSymbolDto | createCustomSymbolDto object to save (optional) 

            try
            {
                // Create a custom symbol
                NewItemDto result = apiInstance.CreateCustomSymbol(createCustomSymbolDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.CreateCustomSymbol: " + e.Message );
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
 **createCustomSymbolDto** | [**CreateCustomSymbolDto**](CreateCustomSymbolDto.md)| createCustomSymbolDto object to save | [optional] 

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


<a name="deletecustomsymbol"></a>
# **DeleteCustomSymbol**
> void DeleteCustomSymbol (Guid customSymbolId)

Delete a custom symbol

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
    public class DeleteCustomSymbolExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var customSymbolId = "customSymbolId_example";  // Guid | customSymbolId to delete associated custom symbol

            try
            {
                // Delete a custom symbol
                apiInstance.DeleteCustomSymbol(customSymbolId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.DeleteCustomSymbol: " + e.Message );
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
 **customSymbolId** | **Guid**| customSymbolId to delete associated custom symbol | 

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


<a name="getcustomsymbol"></a>
# **GetCustomSymbol**
> CustomSymbolDto GetCustomSymbol (Guid customSymbolId, bool? includeEvent = null)

Get all custom field and standard field details on a specific custom symbol

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
    public class GetCustomSymbolExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var customSymbolId = "customSymbolId_example";  // Guid | customSymbolId to get associated custom symbol
            var includeEvent = false;  // bool? | Whether or not to include event (optional)  (default to false)

            try
            {
                // Get all custom field and standard field details on a specific custom symbol
                CustomSymbolDto result = apiInstance.GetCustomSymbol(customSymbolId, includeEvent);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.GetCustomSymbol: " + e.Message );
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
 **customSymbolId** | **Guid**| customSymbolId to get associated custom symbol | 
 **includeEvent** | **bool?**| Whether or not to include event | [optional] [default to false]

### Return type
[**CustomSymbolDto**](CustomSymbolDto.md)

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


<a name="getcustomsymbolrecords"></a>
# **GetCustomSymbolRecords**
> List&lt;RecordPreviewDto&gt; GetCustomSymbolRecords (Guid customSymbolId)

Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier

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
    public class GetCustomSymbolRecordsExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var customSymbolId = "customSymbolId_example";  // Guid | CustomSymbolId to get associated records

            try
            {
                // Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
                List<RecordPreviewDto> result = apiInstance.GetCustomSymbolRecords(customSymbolId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.GetCustomSymbolRecords: " + e.Message );
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
 **customSymbolId** | **Guid**| CustomSymbolId to get associated records | 

### Return type
[**List&lt;RecordPreviewDto&gt;**](RecordPreviewDto.md)

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


<a name="getcustomsymbols"></a>
# **GetCustomSymbols**
> List&lt;CustomSymbolDto&gt; GetCustomSymbols (string typeName = null, string query = null, bool? includeCustomFieldValues = null, bool? excludeLinkedCustomSymbol = null, bool? includeEvent = null)

Get list of all custom symbols in your group along with some of their standard field and custom fields data

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
    public class GetCustomSymbolsExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var typeName = "typeName_example";  // string | filter custom symbols based on custom symbol type (optional) 
            var query = "query_example";  // string | filter custom symbols based on custom symbol code or name (optional) 
            var includeCustomFieldValues = false;  // bool? | Whether or not to include customFieldValues (optional)  (default to false)
            var excludeLinkedCustomSymbol = false;  // bool? | Whether or not to exclude linked custom symbol (optional)  (default to false)
            var includeEvent = true;  // bool? | Whether or not to include event (optional)  (default to true)

            try
            {
                // Get list of all custom symbols in your group along with some of their standard field and custom fields data
                List<CustomSymbolDto> result = apiInstance.GetCustomSymbols(typeName, query, includeCustomFieldValues, excludeLinkedCustomSymbol, includeEvent);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.GetCustomSymbols: " + e.Message );
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
 **typeName** | **string**| filter custom symbols based on custom symbol type | [optional] 
 **query** | **string**| filter custom symbols based on custom symbol code or name | [optional] 
 **includeCustomFieldValues** | **bool?**| Whether or not to include customFieldValues | [optional] [default to false]
 **excludeLinkedCustomSymbol** | **bool?**| Whether or not to exclude linked custom symbol | [optional] [default to false]
 **includeEvent** | **bool?**| Whether or not to include event | [optional] [default to true]

### Return type
[**List&lt;CustomSymbolDto&gt;**](CustomSymbolDto.md)

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


<a name="linkcustomsymboltostandardsymbol"></a>
# **LinkCustomSymbolToStandardSymbol**
> void LinkCustomSymbolToStandardSymbol (Guid customSymbolId, StandardSymbolDto standardSymbolDto = null)

Link custom symbol to standard symbol

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
    public class LinkCustomSymbolToStandardSymbolExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var customSymbolId = "customSymbolId_example";  // Guid | customSymbolId associated with custom symbol
            var standardSymbolDto = new StandardSymbolDto(); // StandardSymbolDto | standard symbol name (optional) 

            try
            {
                // Link custom symbol to standard symbol
                apiInstance.LinkCustomSymbolToStandardSymbol(customSymbolId, standardSymbolDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.LinkCustomSymbolToStandardSymbol: " + e.Message );
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
 **customSymbolId** | **Guid**| customSymbolId associated with custom symbol | 
 **standardSymbolDto** | [**StandardSymbolDto**](StandardSymbolDto.md)| standard symbol name | [optional] 

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


<a name="patchcustomsymbol"></a>
# **PatchCustomSymbol**
> void PatchCustomSymbol (Guid customSymbolId, List<Operation> operation = null)

Edit a custom symbol’s standard field and custom field data

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
    public class PatchCustomSymbolExample
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

            var apiInstance = new CustomSymbolsApi(config);

            var customSymbolId = "customSymbolId_example";  // Guid | customSymbolId to update associated custom symbol
            var operation = new List<Operation>(); // List<Operation> | updateCustomSymbolDto object to update (optional) 

            try
            {
                // Edit a custom symbol’s standard field and custom field data
                apiInstance.PatchCustomSymbol(customSymbolId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsApi.PatchCustomSymbol: " + e.Message );
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
 **customSymbolId** | **Guid**| customSymbolId to update associated custom symbol | 
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


