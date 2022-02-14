# FactSet.SDK.IRNContacts.Api.ContactRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1ContactRelationshipsContactRelationshipIdDelete**](ContactRelationshipsApi.md#v1contactrelationshipscontactrelationshipiddelete) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**V1ContactRelationshipsContactRelationshipIdGet**](ContactRelationshipsApi.md#v1contactrelationshipscontactrelationshipidget) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**V1ContactRelationshipsContactRelationshipIdPatch**](ContactRelationshipsApi.md#v1contactrelationshipscontactrelationshipidpatch) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship
[**V1ContactRelationshipsGet**](ContactRelationshipsApi.md#v1contactrelationshipsget) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**V1ContactRelationshipsPost**](ContactRelationshipsApi.md#v1contactrelationshipspost) | **POST** /v1/contact-relationships | Create a contact relationship


<a name="v1contactrelationshipscontactrelationshipiddelete"></a>
# **V1ContactRelationshipsContactRelationshipIdDelete**
> void V1ContactRelationshipsContactRelationshipIdDelete (Guid contactRelationshipId)

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
    public class V1ContactRelationshipsContactRelationshipIdDeleteExample
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

            var apiInstance = new ContactRelationshipsApi(config);
            var contactRelationshipId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactRelationshipId to delete associated record

            try
            {
                // Delete a contact relationship
                apiInstance.V1ContactRelationshipsContactRelationshipIdDelete(contactRelationshipId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRelationshipsApi.V1ContactRelationshipsContactRelationshipIdDelete: " + e.Message );
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

<a name="v1contactrelationshipscontactrelationshipidget"></a>
# **V1ContactRelationshipsContactRelationshipIdGet**
> ContactRelationshipTwoSidedDto V1ContactRelationshipsContactRelationshipIdGet (Guid contactRelationshipId)

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
    public class V1ContactRelationshipsContactRelationshipIdGetExample
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

            var apiInstance = new ContactRelationshipsApi(config);
            var contactRelationshipId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactRelationshipId to get associated record

            try
            {
                // Get details on a specific contact relationship
                ContactRelationshipTwoSidedDto result = apiInstance.V1ContactRelationshipsContactRelationshipIdGet(contactRelationshipId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRelationshipsApi.V1ContactRelationshipsContactRelationshipIdGet: " + e.Message );
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

<a name="v1contactrelationshipscontactrelationshipidpatch"></a>
# **V1ContactRelationshipsContactRelationshipIdPatch**
> void V1ContactRelationshipsContactRelationshipIdPatch (Guid contactRelationshipId, List<Operation> operation = null)

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
    public class V1ContactRelationshipsContactRelationshipIdPatchExample
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

            var apiInstance = new ContactRelationshipsApi(config);
            var contactRelationshipId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactRelationshipId to update associated record
            var operation = new List<Operation>(); // List<Operation> | contactRelationshipPatch object to update (optional) 

            try
            {
                // Update a contact relationship
                apiInstance.V1ContactRelationshipsContactRelationshipIdPatch(contactRelationshipId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRelationshipsApi.V1ContactRelationshipsContactRelationshipIdPatch: " + e.Message );
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

<a name="v1contactrelationshipsget"></a>
# **V1ContactRelationshipsGet**
> List&lt;ContactRelationshipTwoSidedDto&gt; V1ContactRelationshipsGet (string symbol = null, Guid? contactId = null, Guid? relationshipId = null)

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
    public class V1ContactRelationshipsGetExample
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

            var apiInstance = new ContactRelationshipsApi(config);
            var symbol = symbol_example;  // string |  (optional) 
            var contactId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid? |  (optional) 
            var relationshipId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid? |  (optional) 

            try
            {
                // Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
                List<ContactRelationshipTwoSidedDto> result = apiInstance.V1ContactRelationshipsGet(symbol, contactId, relationshipId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRelationshipsApi.V1ContactRelationshipsGet: " + e.Message );
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

<a name="v1contactrelationshipspost"></a>
# **V1ContactRelationshipsPost**
> void V1ContactRelationshipsPost (ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto = null)

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
    public class V1ContactRelationshipsPostExample
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

            var apiInstance = new ContactRelationshipsApi(config);
            var contactRelationshipTwoSidedSaveDto = new ContactRelationshipTwoSidedSaveDto(); // ContactRelationshipTwoSidedSaveDto | contactRelationship object to save (optional) 

            try
            {
                // Create a contact relationship
                apiInstance.V1ContactRelationshipsPost(contactRelationshipTwoSidedSaveDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRelationshipsApi.V1ContactRelationshipsPost: " + e.Message );
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

void (empty response body)

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

