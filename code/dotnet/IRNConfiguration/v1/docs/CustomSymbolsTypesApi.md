# FactSet.SDK.IRNConfiguration.Api.CustomSymbolsTypesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCustomSymbolType**](CustomSymbolsTypesApi.md#createcustomsymboltype) | **POST** /v1/custom-symbol-types | Create a Custom symbol type
[**DeleteCustomSymbolTypeAsync**](CustomSymbolsTypesApi.md#deletecustomsymboltypeasync) | **DELETE** /v1/custom-symbol-types/{customSymbolTypeId} | Delete a Custom symbol type
[**GetCustomSymbolType**](CustomSymbolsTypesApi.md#getcustomsymboltype) | **GET** /v1/custom-symbol-types/{customSymbolTypeId} | Get a specific Custom symbol type&#39;s details
[**GetCustomSymbolTypes**](CustomSymbolsTypesApi.md#getcustomsymboltypes) | **GET** /v1/custom-symbol-types | Get all the custom symbol types
[**GetSymbolCustomFieldsForCustomSymbolType**](CustomSymbolsTypesApi.md#getsymbolcustomfieldsforcustomsymboltype) | **GET** /v1/custom-symbol-types/{customSymbolTypeId}/custom-fields | Get Custom fields for Custom Symbol type
[**UpdateCustomSymbolType**](CustomSymbolsTypesApi.md#updatecustomsymboltype) | **PUT** /v1/custom-symbol-types/{customSymbolTypeId} | Edit a Custom symbol type
[**UpdateCustomSymbolTypeOrder**](CustomSymbolsTypesApi.md#updatecustomsymboltypeorder) | **POST** /v1/custom-symbol-types/reorder | 



<a name="createcustomsymboltype"></a>
# **CreateCustomSymbolType**
> NewItemDto CreateCustomSymbolType (SaveCustomSymbolTypeDto saveCustomSymbolTypeDto = null)

Create a Custom symbol type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class CreateCustomSymbolTypeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);

            var saveCustomSymbolTypeDto = new SaveCustomSymbolTypeDto(); // SaveCustomSymbolTypeDto | saveCustomSymbolTypeDto object to save (optional) 

            try
            {
                // Create a Custom symbol type
                NewItemDto result = apiInstance.CreateCustomSymbolType(saveCustomSymbolTypeDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.CreateCustomSymbolType: " + e.Message );
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
 **saveCustomSymbolTypeDto** | [**SaveCustomSymbolTypeDto**](SaveCustomSymbolTypeDto.md)| saveCustomSymbolTypeDto object to save | [optional] 

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


<a name="deletecustomsymboltypeasync"></a>
# **DeleteCustomSymbolTypeAsync**
> void DeleteCustomSymbolTypeAsync (Guid customSymbolTypeId)

Delete a Custom symbol type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class DeleteCustomSymbolTypeAsyncExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);

            var customSymbolTypeId = "customSymbolTypeId_example";  // Guid | customSymbolTypeId to delete associated record

            try
            {
                // Delete a Custom symbol type
                apiInstance.DeleteCustomSymbolTypeAsync(customSymbolTypeId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.DeleteCustomSymbolTypeAsync: " + e.Message );
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
 **customSymbolTypeId** | **Guid**| customSymbolTypeId to delete associated record | 

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


<a name="getcustomsymboltype"></a>
# **GetCustomSymbolType**
> CustomSymbolTypeDetailDto GetCustomSymbolType (Guid customSymbolTypeId)

Get a specific Custom symbol type's details

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class GetCustomSymbolTypeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);

            var customSymbolTypeId = "customSymbolTypeId_example";  // Guid | customSymbolTypeId to get associated record

            try
            {
                // Get a specific Custom symbol type's details
                CustomSymbolTypeDetailDto result = apiInstance.GetCustomSymbolType(customSymbolTypeId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.GetCustomSymbolType: " + e.Message );
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
 **customSymbolTypeId** | **Guid**| customSymbolTypeId to get associated record | 

### Return type
[**CustomSymbolTypeDetailDto**](CustomSymbolTypeDetailDto.md)

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


<a name="getcustomsymboltypes"></a>
# **GetCustomSymbolTypes**
> List&lt;CustomSymbolTypeDto&gt; GetCustomSymbolTypes ()

Get all the custom symbol types

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class GetCustomSymbolTypesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);


            try
            {
                // Get all the custom symbol types
                List<CustomSymbolTypeDto> result = apiInstance.GetCustomSymbolTypes();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.GetCustomSymbolTypes: " + e.Message );
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
[**List&lt;CustomSymbolTypeDto&gt;**](CustomSymbolTypeDto.md)

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


<a name="getsymbolcustomfieldsforcustomsymboltype"></a>
# **GetSymbolCustomFieldsForCustomSymbolType**
> List&lt;CustomSymbolCustomFieldConfigDto&gt; GetSymbolCustomFieldsForCustomSymbolType (Guid customSymbolTypeId)

Get Custom fields for Custom Symbol type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class GetSymbolCustomFieldsForCustomSymbolTypeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);

            var customSymbolTypeId = "customSymbolTypeId_example";  // Guid | customSymbolTypeId to get associated Custom fileds

            try
            {
                // Get Custom fields for Custom Symbol type
                List<CustomSymbolCustomFieldConfigDto> result = apiInstance.GetSymbolCustomFieldsForCustomSymbolType(customSymbolTypeId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.GetSymbolCustomFieldsForCustomSymbolType: " + e.Message );
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
 **customSymbolTypeId** | **Guid**| customSymbolTypeId to get associated Custom fileds | 

### Return type
[**List&lt;CustomSymbolCustomFieldConfigDto&gt;**](CustomSymbolCustomFieldConfigDto.md)

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


<a name="updatecustomsymboltype"></a>
# **UpdateCustomSymbolType**
> void UpdateCustomSymbolType (Guid customSymbolTypeId, UpdateCustomSymbolTypeDto updateCustomSymbolTypeDto = null)

Edit a Custom symbol type

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class UpdateCustomSymbolTypeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);

            var customSymbolTypeId = "customSymbolTypeId_example";  // Guid | customSymbolTypeId to update associated record
            var updateCustomSymbolTypeDto = new UpdateCustomSymbolTypeDto(); // UpdateCustomSymbolTypeDto | updateCustomSymbolTypeDto object to update (optional) 

            try
            {
                // Edit a Custom symbol type
                apiInstance.UpdateCustomSymbolType(customSymbolTypeId, updateCustomSymbolTypeDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.UpdateCustomSymbolType: " + e.Message );
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
 **customSymbolTypeId** | **Guid**| customSymbolTypeId to update associated record | 
 **updateCustomSymbolTypeDto** | [**UpdateCustomSymbolTypeDto**](UpdateCustomSymbolTypeDto.md)| updateCustomSymbolTypeDto object to update | [optional] 

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updatecustomsymboltypeorder"></a>
# **UpdateCustomSymbolTypeOrder**
> void UpdateCustomSymbolTypeOrder (ReorderCustomSymbolTypeDto reorderCustomSymbolTypeDto = null)



### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNConfiguration.Api;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;

namespace Example
{
    public class UpdateCustomSymbolTypeOrderExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

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

            var apiInstance = new CustomSymbolsTypesApi(config);

            var reorderCustomSymbolTypeDto = new ReorderCustomSymbolTypeDto(); // ReorderCustomSymbolTypeDto |  (optional) 

            try
            {
                apiInstance.UpdateCustomSymbolTypeOrder(reorderCustomSymbolTypeDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsTypesApi.UpdateCustomSymbolTypeOrder: " + e.Message );
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
 **reorderCustomSymbolTypeDto** | [**ReorderCustomSymbolTypeDto**](ReorderCustomSymbolTypeDto.md)|  | [optional] 

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


