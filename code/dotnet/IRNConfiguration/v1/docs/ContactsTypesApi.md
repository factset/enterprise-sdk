# FactSet.SDK.IRNConfiguration.Api.ContactsTypesApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateContactType**](ContactsTypesApi.md#createcontacttype) | **POST** /v1/contact-types | Create contact types
[**DeleteContactType**](ContactsTypesApi.md#deletecontacttype) | **DELETE** /v1/contact-types/{contactTypeId} | Delete a contact type
[**GetContactTypes**](ContactsTypesApi.md#getcontacttypes) | **GET** /v1/contact-types | Get list of the contact types configured in your group
[**UpdateContactType**](ContactsTypesApi.md#updatecontacttype) | **PUT** /v1/contact-types/{contactTypeId} | Edit a contact type



<a name="createcontacttype"></a>
# **CreateContactType**
> NewItemDto CreateContactType (string body)

Create contact types

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
    public class CreateContactTypeExample
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

            var apiInstance = new ContactsTypesApi(config);

            var body = "body_example";  // string | Contact type name

            try
            {
                // Create contact types
                NewItemDto result = apiInstance.CreateContactType(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsTypesApi.CreateContactType: " + e.Message );
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
 **body** | **string**| Contact type name | 

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


<a name="deletecontacttype"></a>
# **DeleteContactType**
> void DeleteContactType (Guid contactTypeId)

Delete a contact type

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
    public class DeleteContactTypeExample
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

            var apiInstance = new ContactsTypesApi(config);

            var contactTypeId = "contactTypeId_example";  // Guid | contactTypeId to delete associated record

            try
            {
                // Delete a contact type
                apiInstance.DeleteContactType(contactTypeId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsTypesApi.DeleteContactType: " + e.Message );
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
 **contactTypeId** | **Guid**| contactTypeId to delete associated record | 

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


<a name="getcontacttypes"></a>
# **GetContactTypes**
> List&lt;ContactTypeDto&gt; GetContactTypes ()

Get list of the contact types configured in your group

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
    public class GetContactTypesExample
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

            var apiInstance = new ContactsTypesApi(config);


            try
            {
                // Get list of the contact types configured in your group
                List<ContactTypeDto> result = apiInstance.GetContactTypes();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsTypesApi.GetContactTypes: " + e.Message );
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
[**List&lt;ContactTypeDto&gt;**](ContactTypeDto.md)

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


<a name="updatecontacttype"></a>
# **UpdateContactType**
> void UpdateContactType (Guid contactTypeId, string body)

Edit a contact type

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
    public class UpdateContactTypeExample
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

            var apiInstance = new ContactsTypesApi(config);

            var contactTypeId = "contactTypeId_example";  // Guid | contactTypeId to update associated record
            var body = "body_example";  // string | Updated contact type name

            try
            {
                // Edit a contact type
                apiInstance.UpdateContactType(contactTypeId, body);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsTypesApi.UpdateContactType: " + e.Message );
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
 **contactTypeId** | **Guid**| contactTypeId to update associated record | 
 **body** | **string**| Updated contact type name | 

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


