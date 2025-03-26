# FactSet.SDK.ProcuretoPayAPISCIM.Api.UsersApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateUser**](UsersApi.md#createuser) | **POST** /Users | Create a user.
[**DeleteUser**](UsersApi.md#deleteuser) | **DELETE** /Users/{id} | Delete a user.
[**GetUser**](UsersApi.md#getuser) | **GET** /Users/{id} | Get a user.
[**GetUsers**](UsersApi.md#getusers) | **GET** /Users | Get a list of users.
[**ModifyUser**](UsersApi.md#modifyuser) | **PATCH** /Users/{id} | Patch a user.
[**ReplaceUser**](UsersApi.md#replaceuser) | **PUT** /Users/{id} | Replace a user.



<a name="createuser"></a>
# **CreateUser**
> UserResource CreateUser (UserResource userResource)

Create a user.

Create a user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class CreateUserExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new UsersApi(config);

            var userResource = new UserResource(); // UserResource | User resource.

            try
            {
                // Create a user.
                UserResource result = apiInstance.CreateUser(userResource);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UsersApi.CreateUser: " + e.Message );
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
 **userResource** | [**UserResource**](UserResource.md)| User resource. | 

### Return type
[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. |  -  |
| **400** | Provided resource contains invalid data. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deleteuser"></a>
# **DeleteUser**
> void DeleteUser (string id)

Delete a user.

Delete a specific user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class DeleteUserExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new UsersApi(config);

            var id = "id_example";  // string | ID of resource.

            try
            {
                // Delete a user.
                apiInstance.DeleteUser(id);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UsersApi.DeleteUser: " + e.Message );
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
 **id** | **string**| ID of resource. | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User successfully deleted. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getuser"></a>
# **GetUser**
> UserResource GetUser (string id)

Get a user.

Get a specific user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class GetUserExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new UsersApi(config);

            var id = "id_example";  // string | ID of resource.

            try
            {
                // Get a user.
                UserResource result = apiInstance.GetUser(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UsersApi.GetUser: " + e.Message );
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
 **id** | **string**| ID of resource. | 

### Return type
[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getusers"></a>
# **GetUsers**
> UserResourceList GetUsers (string filter = null, string sortBy = null, string sortOrder = null, int? startIndex = null, int? count = null, string attributes = null, string excludedAttributes = null)

Get a list of users.

Get a list of user resources.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class GetUsersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new UsersApi(config);

            var filter = "filter_example";  // string | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against string attributes. When using the \"re\" operator, do not include slash characters as delimiters (e.g. use \"foo\" instead of \"/foo/\".) Also note the case-sensitivity of the regular expression corresponds to the \"caseExact\" characteristic of the target attribute. (optional) 
            var sortBy = "sortBy_example";  // string | Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. (optional) 
            var sortOrder = "sortOrder_example";  // string | The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are ''ascending'' (the default value) or ''descending''. This parameter may not be used unless the *sortBy* parameter is also specified. (optional) 
            var startIndex = 56;  // int? | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional) 
            var count = 56;  // int? | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional) 
            var attributes = "attributes_example";  // string | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional) 
            var excludedAttributes = "excludedAttributes_example";  // string | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional) 

            try
            {
                // Get a list of users.
                UserResourceList result = apiInstance.GetUsers(filter, sortBy, sortOrder, startIndex, count, attributes, excludedAttributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UsersApi.GetUsers: " + e.Message );
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
 **filter** | **string**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. | [optional] 
 **sortBy** | **string**| Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. | [optional] 
 **sortOrder** | **string**| The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. | [optional] 
 **startIndex** | **int?**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional] 
 **count** | **int?**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional] 
 **attributes** | **string**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional] 
 **excludedAttributes** | **string**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional] 

### Return type
[**UserResourceList**](UserResourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Invalid filter value provided. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="modifyuser"></a>
# **ModifyUser**
> UserResource ModifyUser (string id, Patch patch = null)

Patch a user.

Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class ModifyUserExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new UsersApi(config);

            var id = "id_example";  // string | ID of resource.
            var patch = new Patch(); // Patch |  (optional) 

            try
            {
                // Patch a user.
                UserResource result = apiInstance.ModifyUser(id, patch);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UsersApi.ModifyUser: " + e.Message );
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
 **id** | **string**| ID of resource. | 
 **patch** | [**Patch**](Patch.md)|  | [optional] 

### Return type
[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Patch request invalid. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |
| **501** | Operation is not supported. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="replaceuser"></a>
# **ReplaceUser**
> UserResource ReplaceUser (string id, UserResource userResource)

Replace a user.

Replace a specific user resource with another provided user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProcuretoPayAPISCIM.Api;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;

namespace Example
{
    public class ReplaceUserExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration();

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

            var apiInstance = new UsersApi(config);

            var id = "id_example";  // string | ID of resource.
            var userResource = new UserResource(); // UserResource | User resource.

            try
            {
                // Replace a user.
                UserResource result = apiInstance.ReplaceUser(id, userResource);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UsersApi.ReplaceUser: " + e.Message );
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
 **id** | **string**| ID of resource. | 
 **userResource** | [**UserResource**](UserResource.md)| User resource. | 

### Return type
[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Provided resource contains invalid data. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


