# FactSet.SDK.IRNConfiguration.Api.CustomSymbolsCustomFieldsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#createcustomsymbolcustomfield) | **POST** /v1/custom-symbol-custom-fields | Create a Custom symbol custom field
[**DeleteCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#deletecustomsymbolcustomfield) | **DELETE** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Delete a Custom symbol custom field
[**GetCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#getcustomsymbolcustomfield) | **GET** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Get a specific Custom symbol custom field&#39;s details
[**GetCustomSymbolCustomFields**](CustomSymbolsCustomFieldsApi.md#getcustomsymbolcustomfields) | **GET** /v1/custom-symbol-custom-fields | Get all the Custom symbol custom fields
[**PatchCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#patchcustomsymbolcustomfield) | **PATCH** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Edit a Custom symbol custom field



<a name="createcustomsymbolcustomfield"></a>
# **CreateCustomSymbolCustomField**
> NewItemDto CreateCustomSymbolCustomField (CreateCustomSymbolCustomFieldDto createCustomSymbolCustomFieldDto = null)

Create a Custom symbol custom field

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
    public class CreateCustomSymbolCustomFieldExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CustomSymbolsCustomFieldsApi(config);

            var createCustomSymbolCustomFieldDto = new CreateCustomSymbolCustomFieldDto(); // CreateCustomSymbolCustomFieldDto | createCustomSymbolCustomFieldDto object to save (optional) 

            try
            {
                // Create a Custom symbol custom field
                NewItemDto result = apiInstance.CreateCustomSymbolCustomField(createCustomSymbolCustomFieldDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsCustomFieldsApi.CreateCustomSymbolCustomField: " + e.Message );
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
 **createCustomSymbolCustomFieldDto** | [**CreateCustomSymbolCustomFieldDto**](CreateCustomSymbolCustomFieldDto.md)| createCustomSymbolCustomFieldDto object to save | [optional] 

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


<a name="deletecustomsymbolcustomfield"></a>
# **DeleteCustomSymbolCustomField**
> void DeleteCustomSymbolCustomField (Guid customSymbolCustomFieldId)

Delete a Custom symbol custom field

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
    public class DeleteCustomSymbolCustomFieldExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CustomSymbolsCustomFieldsApi(config);

            var customSymbolCustomFieldId = "customSymbolCustomFieldId_example";  // Guid | customSymbolCustomFieldId to delete associated record

            try
            {
                // Delete a Custom symbol custom field
                apiInstance.DeleteCustomSymbolCustomField(customSymbolCustomFieldId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsCustomFieldsApi.DeleteCustomSymbolCustomField: " + e.Message );
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
 **customSymbolCustomFieldId** | **Guid**| customSymbolCustomFieldId to delete associated record | 

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


<a name="getcustomsymbolcustomfield"></a>
# **GetCustomSymbolCustomField**
> CustomSymbolCustomFieldConfigDto GetCustomSymbolCustomField (Guid customSymbolCustomFieldId)

Get a specific Custom symbol custom field's details

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
    public class GetCustomSymbolCustomFieldExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CustomSymbolsCustomFieldsApi(config);

            var customSymbolCustomFieldId = "customSymbolCustomFieldId_example";  // Guid | customSymbolCustomFieldId to get associated record

            try
            {
                // Get a specific Custom symbol custom field's details
                CustomSymbolCustomFieldConfigDto result = apiInstance.GetCustomSymbolCustomField(customSymbolCustomFieldId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsCustomFieldsApi.GetCustomSymbolCustomField: " + e.Message );
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
 **customSymbolCustomFieldId** | **Guid**| customSymbolCustomFieldId to get associated record | 

### Return type
[**CustomSymbolCustomFieldConfigDto**](CustomSymbolCustomFieldConfigDto.md)

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


<a name="getcustomsymbolcustomfields"></a>
# **GetCustomSymbolCustomFields**
> List&lt;CustomSymbolCustomFieldConfigDto&gt; GetCustomSymbolCustomFields ()

Get all the Custom symbol custom fields

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
    public class GetCustomSymbolCustomFieldsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CustomSymbolsCustomFieldsApi(config);


            try
            {
                // Get all the Custom symbol custom fields
                List<CustomSymbolCustomFieldConfigDto> result = apiInstance.GetCustomSymbolCustomFields();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsCustomFieldsApi.GetCustomSymbolCustomFields: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="patchcustomsymbolcustomfield"></a>
# **PatchCustomSymbolCustomField**
> void PatchCustomSymbolCustomField (Guid customSymbolCustomFieldId, List<Operation> operation = null)

Edit a Custom symbol custom field

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
    public class PatchCustomSymbolCustomFieldExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNConfiguration.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new CustomSymbolsCustomFieldsApi(config);

            var customSymbolCustomFieldId = "customSymbolCustomFieldId_example";  // Guid | customSymbolCustomFieldId to update associated record
            var operation = new List<Operation>(); // List<Operation> | customSymbolCustomFieldUpdateDto object to update (optional) 

            try
            {
                // Edit a Custom symbol custom field
                apiInstance.PatchCustomSymbolCustomField(customSymbolCustomFieldId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomSymbolsCustomFieldsApi.PatchCustomSymbolCustomField: " + e.Message );
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
 **customSymbolCustomFieldId** | **Guid**| customSymbolCustomFieldId to update associated record | 
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| customSymbolCustomFieldUpdateDto object to update | [optional] 

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


