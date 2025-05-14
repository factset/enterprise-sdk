# FactSet.SDK.Vermilion.Api.SCIMApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateGroup**](SCIMApi.md#creategroup) | **POST** /scim/v2/Groups | Creates a role
[**CreateUser**](SCIMApi.md#createuser) | **POST** /scim/v2/Users | Creates a user
[**DeleteGroupById**](SCIMApi.md#deletegroupbyid) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
[**DeleteUserById**](SCIMApi.md#deleteuserbyid) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
[**GetAllGroups**](SCIMApi.md#getallgroups) | **GET** /scim/v2/Groups | Retrieves a list of VRS role
[**GetAllUsers**](SCIMApi.md#getallusers) | **GET** /scim/v2/Users | Retrieves a list of VRS users
[**GetGroupById**](SCIMApi.md#getgroupbyid) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
[**GetUserById**](SCIMApi.md#getuserbyid) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
[**PatchGroupById**](SCIMApi.md#patchgroupbyid) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
[**PatchUserById**](SCIMApi.md#patchuserbyid) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
[**UpdateGroupById**](SCIMApi.md#updategroupbyid) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
[**UpdateUserById**](SCIMApi.md#updateuserbyid) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user



<a name="creategroup"></a>
# **CreateGroup**
> ScimGroup CreateGroup (ScimGroup scimGroup)

Creates a role

Creates a VRS role

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class CreateGroupExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var scimGroup = new ScimGroup(); // ScimGroup | 

            try
            {
                // Creates a role
                ScimGroup result = apiInstance.CreateGroup(scimGroup);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.CreateGroup: " + e.Message );
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
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  | 

### Return type
[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | Forbidden, user does not have permission to create roles |  -  |
| **409** | Group already exists |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="createuser"></a>
# **CreateUser**
> CreatedScimUserJSONResponse CreateUser (CreateScimUserJSONRequest createScimUserJSONRequest)

Creates a user

Creates a VRS user

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class CreateUserExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var createScimUserJSONRequest = new CreateScimUserJSONRequest(); // CreateScimUserJSONRequest | 

            try
            {
                // Creates a user
                CreatedScimUserJSONResponse result = apiInstance.CreateUser(createScimUserJSONRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.CreateUser: " + e.Message );
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
 **createScimUserJSONRequest** | [**CreateScimUserJSONRequest**](CreateScimUserJSONRequest.md)|  | 

### Return type
[**CreatedScimUserJSONResponse**](CreatedScimUserJSONResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **400** | Bad Request, required values not provided in JSON request body (e.g. tenant, name or userName (loginID) |  -  |
| **403** | Forbidden, user does not have permission to create users or it does not have requested tenancy assigned to it |  -  |
| **409** | User already exists |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletegroupbyid"></a>
# **DeleteGroupById**
> void DeleteGroupById (string groupId)

Deletes a VRS role

Deletes a VRS role

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class DeleteGroupByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var groupId = "123456";  // string | The ID of the group

            try
            {
                // Deletes a VRS role
                apiInstance.DeleteGroupById(groupId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.DeleteGroupById: " + e.Message );
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
 **groupId** | **string**| The ID of the group | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden, user does not have permission to delete roles |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deleteuserbyid"></a>
# **DeleteUserById**
> void DeleteUserById (string userId)

Deletes a VRS user

Deletes a VRS user (this marks them as 'Deleted' in the database)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class DeleteUserByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var userId = "123456";  // string | The ID of the user

            try
            {
                // Deletes a VRS user
                apiInstance.DeleteUserById(userId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.DeleteUserById: " + e.Message );
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
 **userId** | **string**| The ID of the user | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden, user does not have permission to delete users |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getallgroups"></a>
# **GetAllGroups**
> ScimGroupListResponse GetAllGroups (int? count = null, int? startIndex = null, string filter = null, List<string> sortBy = null, List<string> sortOrder = null)

Retrieves a list of VRS role

Retrieves VRS roles

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetAllGroupsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var count = 10;  // int? | Non-negative maximum number of entries to return (optional) 
            var startIndex = 5;  // int? | The 1-based index of the first query result (optional) 
            var filter = "tenant eq \"MASTER,DEMO\"";  // string | Acts as a filter for the retrieval process. if filter=tenant, filters the groups that match the given tenant code. Accepts multiple values separated by a comma, e.g. ?filter=tenant eq MASTER,DEMO (optional) 
            var sortBy = new List<string>(); // List<string> | The column to sort on. If parameter is not given, no sorting will be done (optional) 
            var sortOrder = new List<string>(); // List<string> | The order in which the sort is applied for the sort by parameter. If parameter is not given along with a sortBy, sorting will be done in ascending order (optional) 

            try
            {
                // Retrieves a list of VRS role
                ScimGroupListResponse result = apiInstance.GetAllGroups(count, startIndex, filter, sortBy, sortOrder);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.GetAllGroups: " + e.Message );
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
 **count** | **int?**| Non-negative maximum number of entries to return | [optional] 
 **startIndex** | **int?**| The 1-based index of the first query result | [optional] 
 **filter** | **string**| Acts as a filter for the retrieval process. if filter&#x3D;tenant, filters the groups that match the given tenant code. Accepts multiple values separated by a comma, e.g. ?filter&#x3D;tenant eq MASTER,DEMO | [optional] 
 **sortBy** | [**List&lt;string&gt;**](string.md)| The column to sort on. If parameter is not given, no sorting will be done | [optional] 
 **sortOrder** | [**List&lt;string&gt;**](string.md)| The order in which the sort is applied for the sort by parameter. If parameter is not given along with a sortBy, sorting will be done in ascending order | [optional] 

### Return type
[**ScimGroupListResponse**](ScimGroupListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **403** | Forbidden, user does not have permission to view roles |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getallusers"></a>
# **GetAllUsers**
> ScimUserListResponse GetAllUsers (int? count = null, int? startIndex = null)

Retrieves a list of VRS users

Retrieves a list of VRS users

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetAllUsersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var count = 10;  // int? | Non-negative maximum number of entries to return (optional) 
            var startIndex = 5;  // int? | The 1-based index of the first query result (optional) 

            try
            {
                // Retrieves a list of VRS users
                ScimUserListResponse result = apiInstance.GetAllUsers(count, startIndex);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.GetAllUsers: " + e.Message );
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
 **count** | **int?**| Non-negative maximum number of entries to return | [optional] 
 **startIndex** | **int?**| The 1-based index of the first query result | [optional] 

### Return type
[**ScimUserListResponse**](ScimUserListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **403** | Forbidden, user does not have permission to view users |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getgroupbyid"></a>
# **GetGroupById**
> ScimGroup GetGroupById (string groupId)

Retrieves a VRS role

Retrieves a VRS role based on the ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetGroupByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var groupId = "123456";  // string | The ID of the role

            try
            {
                // Retrieves a VRS role
                ScimGroup result = apiInstance.GetGroupById(groupId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.GetGroupById: " + e.Message );
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
 **groupId** | **string**| The ID of the role | 

### Return type
[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | Forbidden, user does not have permission to view roles |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getuserbyid"></a>
# **GetUserById**
> ScimUser GetUserById (string userId)

Retrieves a VRS User

Retrieves a VRS user based on their ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class GetUserByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var userId = "123456";  // string | The ID of the user

            try
            {
                // Retrieves a VRS User
                ScimUser result = apiInstance.GetUserById(userId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.GetUserById: " + e.Message );
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
 **userId** | **string**| The ID of the user | 

### Return type
[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | Forbidden, user does not have permission to view users |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="patchgroupbyid"></a>
# **PatchGroupById**
> ScimGroup PatchGroupById (string groupId, ScimGroupPatchRequestBody scimGroupPatchRequestBody)

Add or remove a user to/from a group

Adds or removes a VRS user to/from a VRS role

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class PatchGroupByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var groupId = "123456";  // string | The ID of the role
            var scimGroupPatchRequestBody = new ScimGroupPatchRequestBody(); // ScimGroupPatchRequestBody | 

            try
            {
                // Add or remove a user to/from a group
                ScimGroup result = apiInstance.PatchGroupById(groupId, scimGroupPatchRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.PatchGroupById: " + e.Message );
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
 **groupId** | **string**| The ID of the role | 
 **scimGroupPatchRequestBody** | [**ScimGroupPatchRequestBody**](ScimGroupPatchRequestBody.md)|  | 

### Return type
[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added user to group |  -  |
| **400** | Bad Request, invalid values provided in JSON request body. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="patchuserbyid"></a>
# **PatchUserById**
> ScimUser PatchUserById (string userId, ScimUserPatchRequestBody scimUserPatchRequestBody)

Add or remove VRS user attributes

Adds or removes VRS user attributes based on the JSON properties

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class PatchUserByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var userId = "123456";  // string | The ID of the user
            var scimUserPatchRequestBody = new ScimUserPatchRequestBody(); // ScimUserPatchRequestBody | 

            try
            {
                // Add or remove VRS user attributes
                ScimUser result = apiInstance.PatchUserById(userId, scimUserPatchRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.PatchUserById: " + e.Message );
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
 **userId** | **string**| The ID of the user | 
 **scimUserPatchRequestBody** | [**ScimUserPatchRequestBody**](ScimUserPatchRequestBody.md)|  | 

### Return type
[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated user |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | Forbidden, user does not have permission to update users |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updategroupbyid"></a>
# **UpdateGroupById**
> ScimGroup UpdateGroupById (string groupId, ScimGroup scimGroup)

Updates a VRS Group

Updates (replaces) a VRS Group with the properties in the JSON

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class UpdateGroupByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var groupId = "123456";  // string | The ID of the group
            var scimGroup = new ScimGroup(); // ScimGroup | 

            try
            {
                // Updates a VRS Group
                ScimGroup result = apiInstance.UpdateGroupById(groupId, scimGroup);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.UpdateGroupById: " + e.Message );
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
 **groupId** | **string**| The ID of the group | 
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  | 

### Return type
[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated group |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | Forbidden, user does not have permission to update groups |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updateuserbyid"></a>
# **UpdateUserById**
> ScimUser UpdateUserById (string userId, ScimUser scimUser)

Updates a VRS user

Updates (replaces) a VRS user with the properties in the JSON

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class UpdateUserByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Vermilion.Client.Configuration();

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

            var apiInstance = new SCIMApi(config);

            var userId = "123456";  // string | The ID of the user
            var scimUser = new ScimUser(); // ScimUser | 

            try
            {
                // Updates a VRS user
                ScimUser result = apiInstance.UpdateUserById(userId, scimUser);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.UpdateUserById: " + e.Message );
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
 **userId** | **string**| The ID of the user | 
 **scimUser** | [**ScimUser**](ScimUser.md)|  | 

### Return type
[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated user |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | Forbidden, user does not have permission to update users |  -  |
| **404** | Not Found |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


