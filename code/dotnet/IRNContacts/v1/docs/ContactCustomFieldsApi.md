# FactSet.SDK.IRNContacts.Api.ContactCustomFieldsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1ContactCustomFieldsContactCustomFieldIdDelete**](ContactCustomFieldsApi.md#v1contactcustomfieldscontactcustomfieldiddelete) | **DELETE** /v1/contact-custom-fields/{contactCustomFieldId} | Delete a contact custom field
[**V1ContactCustomFieldsContactCustomFieldIdGet**](ContactCustomFieldsApi.md#v1contactcustomfieldscontactcustomfieldidget) | **GET** /v1/contact-custom-fields/{contactCustomFieldId} | Get a specific Contact custom field&#39;s details
[**V1ContactCustomFieldsContactCustomFieldIdPatch**](ContactCustomFieldsApi.md#v1contactcustomfieldscontactcustomfieldidpatch) | **PATCH** /v1/contact-custom-fields/{contactCustomFieldId} | Edit a contact custom field
[**V1ContactCustomFieldsGet**](ContactCustomFieldsApi.md#v1contactcustomfieldsget) | **GET** /v1/contact-custom-fields | Get all the contact custom fields
[**V1ContactCustomFieldsPost**](ContactCustomFieldsApi.md#v1contactcustomfieldspost) | **POST** /v1/contact-custom-fields | Create a contact custom field
[**V1ContactCustomFieldsReorderPost**](ContactCustomFieldsApi.md#v1contactcustomfieldsreorderpost) | **POST** /v1/contact-custom-fields/reorder | Reorder contact custom fields


<a name="v1contactcustomfieldscontactcustomfieldiddelete"></a>
# **V1ContactCustomFieldsContactCustomFieldIdDelete**
> void V1ContactCustomFieldsContactCustomFieldIdDelete (Guid contactCustomFieldId)

Delete a contact custom field

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
    public class V1ContactCustomFieldsContactCustomFieldIdDeleteExample
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

            var apiInstance = new ContactCustomFieldsApi(config);
            var contactCustomFieldId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactCustomFieldId to delete associated record

            try
            {
                // Delete a contact custom field
                apiInstance.V1ContactCustomFieldsContactCustomFieldIdDelete(contactCustomFieldId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactCustomFieldsApi.V1ContactCustomFieldsContactCustomFieldIdDelete: " + e.Message );
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
 **contactCustomFieldId** | **Guid**| contactCustomFieldId to delete associated record | 

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

<a name="v1contactcustomfieldscontactcustomfieldidget"></a>
# **V1ContactCustomFieldsContactCustomFieldIdGet**
> ContactCustomFieldDto V1ContactCustomFieldsContactCustomFieldIdGet (Guid contactCustomFieldId)

Get a specific Contact custom field's details

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
    public class V1ContactCustomFieldsContactCustomFieldIdGetExample
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

            var apiInstance = new ContactCustomFieldsApi(config);
            var contactCustomFieldId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactCustomFieldId to get associated record

            try
            {
                // Get a specific Contact custom field's details
                ContactCustomFieldDto result = apiInstance.V1ContactCustomFieldsContactCustomFieldIdGet(contactCustomFieldId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactCustomFieldsApi.V1ContactCustomFieldsContactCustomFieldIdGet: " + e.Message );
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
 **contactCustomFieldId** | **Guid**| contactCustomFieldId to get associated record | 

### Return type

[**ContactCustomFieldDto**](ContactCustomFieldDto.md)

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

<a name="v1contactcustomfieldscontactcustomfieldidpatch"></a>
# **V1ContactCustomFieldsContactCustomFieldIdPatch**
> void V1ContactCustomFieldsContactCustomFieldIdPatch (Guid contactCustomFieldId, List<Operation> operation = null)

Edit a contact custom field

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
    public class V1ContactCustomFieldsContactCustomFieldIdPatchExample
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

            var apiInstance = new ContactCustomFieldsApi(config);
            var contactCustomFieldId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactCustomFieldId to update associated record
            var operation = new List<Operation>(); // List<Operation> | contactCustomFieldUpdateDto object to update (optional) 

            try
            {
                // Edit a contact custom field
                apiInstance.V1ContactCustomFieldsContactCustomFieldIdPatch(contactCustomFieldId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactCustomFieldsApi.V1ContactCustomFieldsContactCustomFieldIdPatch: " + e.Message );
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
 **contactCustomFieldId** | **Guid**| contactCustomFieldId to update associated record | 
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| contactCustomFieldUpdateDto object to update | [optional] 

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

<a name="v1contactcustomfieldsget"></a>
# **V1ContactCustomFieldsGet**
> List&lt;ContactCustomFieldDto&gt; V1ContactCustomFieldsGet ()

Get all the contact custom fields

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
    public class V1ContactCustomFieldsGetExample
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

            var apiInstance = new ContactCustomFieldsApi(config);

            try
            {
                // Get all the contact custom fields
                List<ContactCustomFieldDto> result = apiInstance.V1ContactCustomFieldsGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactCustomFieldsApi.V1ContactCustomFieldsGet: " + e.Message );
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

[**List&lt;ContactCustomFieldDto&gt;**](ContactCustomFieldDto.md)

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

<a name="v1contactcustomfieldspost"></a>
# **V1ContactCustomFieldsPost**
> Guid V1ContactCustomFieldsPost (ContactCustomFieldSaveDto contactCustomFieldSaveDto = null)

Create a contact custom field

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
    public class V1ContactCustomFieldsPostExample
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

            var apiInstance = new ContactCustomFieldsApi(config);
            var contactCustomFieldSaveDto = new ContactCustomFieldSaveDto(); // ContactCustomFieldSaveDto | ContactCustomFieldSaveDto object to save (optional) 

            try
            {
                // Create a contact custom field
                Guid result = apiInstance.V1ContactCustomFieldsPost(contactCustomFieldSaveDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactCustomFieldsApi.V1ContactCustomFieldsPost: " + e.Message );
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
 **contactCustomFieldSaveDto** | [**ContactCustomFieldSaveDto**](ContactCustomFieldSaveDto.md)| ContactCustomFieldSaveDto object to save | [optional] 

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

<a name="v1contactcustomfieldsreorderpost"></a>
# **V1ContactCustomFieldsReorderPost**
> void V1ContactCustomFieldsReorderPost (ContactCustomFieldListDto contactCustomFieldListDto = null)

Reorder contact custom fields

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
    public class V1ContactCustomFieldsReorderPostExample
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

            var apiInstance = new ContactCustomFieldsApi(config);
            var contactCustomFieldListDto = new ContactCustomFieldListDto(); // ContactCustomFieldListDto | List of Guid (optional) 

            try
            {
                // Reorder contact custom fields
                apiInstance.V1ContactCustomFieldsReorderPost(contactCustomFieldListDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactCustomFieldsApi.V1ContactCustomFieldsReorderPost: " + e.Message );
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
 **contactCustomFieldListDto** | [**ContactCustomFieldListDto**](ContactCustomFieldListDto.md)| List of Guid | [optional] 

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

