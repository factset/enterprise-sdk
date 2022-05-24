# FactSet.SDK.IRNContacts.Api.ContactsRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateContactRelationship**](ContactsRelationshipsApi.md#createcontactrelationship) | **POST** /v1/contact-relationships | Create a contact relationship
[**DeleteContactRelationship**](ContactsRelationshipsApi.md#deletecontactrelationship) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**GetAllRelationshipsTaggingAContact**](ContactsRelationshipsApi.md#getallrelationshipstaggingacontact) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**GetContactRelationship**](ContactsRelationshipsApi.md#getcontactrelationship) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**PatchContactRelationship**](ContactsRelationshipsApi.md#patchcontactrelationship) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship


<a name="createcontactrelationship"></a>
# **CreateContactRelationship**
> NewItemDto CreateContactRelationship (ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto = null)

Create a contact relationship

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
    public class CreateContactRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsRelationshipsApi(config);
            var contactRelationshipTwoSidedSaveDto = new ContactRelationshipTwoSidedSaveDto(); // ContactRelationshipTwoSidedSaveDto | contactRelationship object to save (optional) 

            try
            {
                // Create a contact relationship
                NewItemDto result = apiInstance.CreateContactRelationship(contactRelationshipTwoSidedSaveDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsRelationshipsApi.CreateContactRelationship: " + e.Message );
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
 **contactRelationshipTwoSidedSaveDto** | [**ContactRelationshipTwoSidedSaveDto**](ContactRelationshipTwoSidedSaveDto.md)| contactRelationship object to save | [optional] 

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

<a name="deletecontactrelationship"></a>
# **DeleteContactRelationship**
> void DeleteContactRelationship (Guid contactRelationshipId)

Delete a contact relationship

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
    public class DeleteContactRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsRelationshipsApi(config);
            var contactRelationshipId = "contactRelationshipId_example";  // Guid | contactRelationshipId to delete associated record

            try
            {
                // Delete a contact relationship
                apiInstance.DeleteContactRelationship(contactRelationshipId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsRelationshipsApi.DeleteContactRelationship: " + e.Message );
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
 **contactRelationshipId** | **Guid**| contactRelationshipId to delete associated record | 

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

<a name="getallrelationshipstaggingacontact"></a>
# **GetAllRelationshipsTaggingAContact**
> List&lt;ContactRelationshipTwoSidedDto&gt; GetAllRelationshipsTaggingAContact (string symbol = null, Guid? contactId = null, Guid? relationshipId = null)

Get all the relationships where the given symbol or contact identifier has been tagged in a relationship

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
    public class GetAllRelationshipsTaggingAContactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsRelationshipsApi(config);
            var symbol = "symbol_example";  // string |  (optional) 
            var contactId = "contactId_example";  // Guid? |  (optional) 
            var relationshipId = "relationshipId_example";  // Guid? |  (optional) 

            try
            {
                // Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
                List<ContactRelationshipTwoSidedDto> result = apiInstance.GetAllRelationshipsTaggingAContact(symbol, contactId, relationshipId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsRelationshipsApi.GetAllRelationshipsTaggingAContact: " + e.Message );
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
 **symbol** | **string**|  | [optional] 
 **contactId** | **Guid?**|  | [optional] 
 **relationshipId** | **Guid?**|  | [optional] 

### Return type
[**List&lt;ContactRelationshipTwoSidedDto&gt;**](ContactRelationshipTwoSidedDto.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcontactrelationship"></a>
# **GetContactRelationship**
> ContactRelationshipTwoSidedDto GetContactRelationship (Guid contactRelationshipId)

Get details on a specific contact relationship

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
    public class GetContactRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsRelationshipsApi(config);
            var contactRelationshipId = "contactRelationshipId_example";  // Guid | contactRelationshipId to get associated record

            try
            {
                // Get details on a specific contact relationship
                ContactRelationshipTwoSidedDto result = apiInstance.GetContactRelationship(contactRelationshipId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsRelationshipsApi.GetContactRelationship: " + e.Message );
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
 **contactRelationshipId** | **Guid**| contactRelationshipId to get associated record | 

### Return type
[**ContactRelationshipTwoSidedDto**](ContactRelationshipTwoSidedDto.md)

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

<a name="patchcontactrelationship"></a>
# **PatchContactRelationship**
> void PatchContactRelationship (Guid contactRelationshipId, List<Operation> operation = null)

Update a contact relationship

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
    public class PatchContactRelationshipExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNContacts.Client.Configuration();

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

            var apiInstance = new ContactsRelationshipsApi(config);
            var contactRelationshipId = "contactRelationshipId_example";  // Guid | contactRelationshipId to update associated record
            var operation = new List<Operation>(); // List<Operation> | contactRelationshipPatch object to update (optional) 

            try
            {
                // Update a contact relationship
                apiInstance.PatchContactRelationship(contactRelationshipId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactsRelationshipsApi.PatchContactRelationship: " + e.Message );
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
 **contactRelationshipId** | **Guid**| contactRelationshipId to update associated record | 
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| contactRelationshipPatch object to update | [optional] 

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

