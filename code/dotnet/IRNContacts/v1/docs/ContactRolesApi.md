# FactSet.SDK.IRNContacts.Api.ContactRolesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1ContactRolesContactRoleIdDelete**](ContactRolesApi.md#v1contactrolescontactroleiddelete) | **DELETE** /v1/contact-roles/{contactRoleId} | Delete a contact role
[**V1ContactRolesContactRoleIdPut**](ContactRolesApi.md#v1contactrolescontactroleidput) | **PUT** /v1/contact-roles/{contactRoleId} | Edit a contact role
[**V1ContactRolesGet**](ContactRolesApi.md#v1contactrolesget) | **GET** /v1/contact-roles | Get list of the contact roles configured in your group
[**V1ContactRolesPost**](ContactRolesApi.md#v1contactrolespost) | **POST** /v1/contact-roles | Create contact roles


<a name="v1contactrolescontactroleiddelete"></a>
# **V1ContactRolesContactRoleIdDelete**
> void V1ContactRolesContactRoleIdDelete (Guid contactRoleId)

Delete a contact role

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
    public class V1ContactRolesContactRoleIdDeleteExample
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

            var apiInstance = new ContactRolesApi(config);
            var contactRoleId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactRoleId to delete associated record

            try
            {
                // Delete a contact role
                apiInstance.V1ContactRolesContactRoleIdDelete(contactRoleId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRolesApi.V1ContactRolesContactRoleIdDelete: " + e.Message );
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
 **contactRoleId** | **Guid**| contactRoleId to delete associated record | 

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

<a name="v1contactrolescontactroleidput"></a>
# **V1ContactRolesContactRoleIdPut**
> void V1ContactRolesContactRoleIdPut (Guid contactRoleId, string body)

Edit a contact role

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
    public class V1ContactRolesContactRoleIdPutExample
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

            var apiInstance = new ContactRolesApi(config);
            var contactRoleId = 38400000-8cf0-11bd-b23e-10b96e4ef00d;  // Guid | contactRoleId to update associated record
            var body = body_example;  // string | Updated contact role name

            try
            {
                // Edit a contact role
                apiInstance.V1ContactRolesContactRoleIdPut(contactRoleId, body);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRolesApi.V1ContactRolesContactRoleIdPut: " + e.Message );
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
 **contactRoleId** | **Guid**| contactRoleId to update associated record | 
 **body** | **string**| Updated contact role name | 

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

<a name="v1contactrolesget"></a>
# **V1ContactRolesGet**
> List&lt;ContactRoleDto&gt; V1ContactRolesGet ()

Get list of the contact roles configured in your group

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
    public class V1ContactRolesGetExample
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

            var apiInstance = new ContactRolesApi(config);

            try
            {
                // Get list of the contact roles configured in your group
                List<ContactRoleDto> result = apiInstance.V1ContactRolesGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRolesApi.V1ContactRolesGet: " + e.Message );
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

[**List&lt;ContactRoleDto&gt;**](ContactRoleDto.md)

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

<a name="v1contactrolespost"></a>
# **V1ContactRolesPost**
> Guid V1ContactRolesPost (string body)

Create contact roles

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
    public class V1ContactRolesPostExample
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

            var apiInstance = new ContactRolesApi(config);
            var body = body_example;  // string | Contact role name

            try
            {
                // Create contact roles
                Guid result = apiInstance.V1ContactRolesPost(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ContactRolesApi.V1ContactRolesPost: " + e.Message );
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
 **body** | **string**| Contact role name | 

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

