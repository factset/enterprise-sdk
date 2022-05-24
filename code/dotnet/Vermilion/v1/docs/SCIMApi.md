# FactSet.SDK.Vermilion.Api.SCIMApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ScimV2GroupsGet**](SCIMApi.md#scimv2groupsget) | **GET** /scim/v2/Groups/ | Retrieves a list of VRS role
[**ScimV2GroupsGroupIdDelete**](SCIMApi.md#scimv2groupsgroupiddelete) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
[**ScimV2GroupsGroupIdGet**](SCIMApi.md#scimv2groupsgroupidget) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
[**ScimV2GroupsGroupIdPatch**](SCIMApi.md#scimv2groupsgroupidpatch) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
[**ScimV2GroupsGroupIdPut**](SCIMApi.md#scimv2groupsgroupidput) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
[**ScimV2GroupsPost**](SCIMApi.md#scimv2groupspost) | **POST** /scim/v2/Groups/ | Creates a role
[**ScimV2UsersGet**](SCIMApi.md#scimv2usersget) | **GET** /scim/v2/Users/ | Retrieves a list of VRS users
[**ScimV2UsersPost**](SCIMApi.md#scimv2userspost) | **POST** /scim/v2/Users/ | Creates a user
[**ScimV2UsersUserIdDelete**](SCIMApi.md#scimv2usersuseriddelete) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
[**ScimV2UsersUserIdGet**](SCIMApi.md#scimv2usersuseridget) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
[**ScimV2UsersUserIdPatch**](SCIMApi.md#scimv2usersuseridpatch) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
[**ScimV2UsersUserIdPut**](SCIMApi.md#scimv2usersuseridput) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user


<a name="scimv2groupsget"></a>
# **ScimV2GroupsGet**
> ScimGroupListResponse ScimV2GroupsGet (int? count = null, int? startIndex = null)

Retrieves a list of VRS role

Retrieves a VRS roles

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2GroupsGetExample
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

            var apiInstance = new SCIMApi(config);
            var count = 25;  // int? | Non-negative maximum number of entries to return (optional) 
            var startIndex = 1;  // int? | The 1-based index of the first query result (optional) 

            try
            {
                // Retrieves a list of VRS role
                ScimGroupListResponse result = apiInstance.ScimV2GroupsGet(count, startIndex);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2GroupsGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2groupsgroupiddelete"></a>
# **ScimV2GroupsGroupIdDelete**
> void ScimV2GroupsGroupIdDelete (string groupId)

Deletes a VRS role

Deletes a VRS role

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2GroupsGroupIdDeleteExample
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

            var apiInstance = new SCIMApi(config);
            var groupId = "groupId_example";  // string | The ID of the group

            try
            {
                // Deletes a VRS role
                apiInstance.ScimV2GroupsGroupIdDelete(groupId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2GroupsGroupIdDelete: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2groupsgroupidget"></a>
# **ScimV2GroupsGroupIdGet**
> ScimGroup ScimV2GroupsGroupIdGet (string groupId)

Retrieves a VRS role

Retrieves a VRS role based on the ID

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2GroupsGroupIdGetExample
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

            var apiInstance = new SCIMApi(config);
            var groupId = "groupId_example";  // string | The ID of the role

            try
            {
                // Retrieves a VRS role
                ScimGroup result = apiInstance.ScimV2GroupsGroupIdGet(groupId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2GroupsGroupIdGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2groupsgroupidpatch"></a>
# **ScimV2GroupsGroupIdPatch**
> ScimGroup ScimV2GroupsGroupIdPatch (string groupId, InlineObject2 inlineObject2)

Add or remove a user to/from a group

Adds or removes a VRS user to/from a VRS role

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2GroupsGroupIdPatchExample
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

            var apiInstance = new SCIMApi(config);
            var groupId = "groupId_example";  // string | The ID of the role
            var inlineObject2 = new InlineObject2(); // InlineObject2 | 

            try
            {
                // Add or remove a user to/from a group
                ScimGroup result = apiInstance.ScimV2GroupsGroupIdPatch(groupId, inlineObject2);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2GroupsGroupIdPatch: " + e.Message );
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | 

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
| **204** | Successfully added user to group |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2groupsgroupidput"></a>
# **ScimV2GroupsGroupIdPut**
> ScimGroup ScimV2GroupsGroupIdPut (string groupId, ScimGroup scimGroup)

Updates a VRS Group

Updates (replaces) a VRS Group with the properties in the JSON

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2GroupsGroupIdPutExample
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

            var apiInstance = new SCIMApi(config);
            var groupId = "groupId_example";  // string | The ID of the group
            var scimGroup = new ScimGroup(); // ScimGroup | 

            try
            {
                // Updates a VRS Group
                ScimGroup result = apiInstance.ScimV2GroupsGroupIdPut(groupId, scimGroup);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2GroupsGroupIdPut: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2groupspost"></a>
# **ScimV2GroupsPost**
> ScimGroup ScimV2GroupsPost (ScimGroup scimGroup)

Creates a role

Creates a VRS role

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2GroupsPostExample
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

            var apiInstance = new SCIMApi(config);
            var scimGroup = new ScimGroup(); // ScimGroup | 

            try
            {
                // Creates a role
                ScimGroup result = apiInstance.ScimV2GroupsPost(scimGroup);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2GroupsPost: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2usersget"></a>
# **ScimV2UsersGet**
> ScimUserListResponse ScimV2UsersGet (int? count = null, int? startIndex = null)

Retrieves a list of VRS users

Retrieves a VRS users

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2UsersGetExample
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

            var apiInstance = new SCIMApi(config);
            var count = 25;  // int? | Non-negative maximum number of entries to return (optional) 
            var startIndex = 1;  // int? | The 1-based index of the first query result (optional) 

            try
            {
                // Retrieves a list of VRS users
                ScimUserListResponse result = apiInstance.ScimV2UsersGet(count, startIndex);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2UsersGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2userspost"></a>
# **ScimV2UsersPost**
> CreatedScimUserJSONResponse ScimV2UsersPost (CreateScimUserJSONRequest createScimUserJSONRequest)

Creates a user

Creates a VRS user

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2UsersPostExample
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

            var apiInstance = new SCIMApi(config);
            var createScimUserJSONRequest = new CreateScimUserJSONRequest(); // CreateScimUserJSONRequest | 

            try
            {
                // Creates a user
                CreatedScimUserJSONResponse result = apiInstance.ScimV2UsersPost(createScimUserJSONRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2UsersPost: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2usersuseriddelete"></a>
# **ScimV2UsersUserIdDelete**
> void ScimV2UsersUserIdDelete (string userId)

Deletes a VRS user

Deletes a VRS user (this marks them as 'Deleted' in the database)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2UsersUserIdDeleteExample
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

            var apiInstance = new SCIMApi(config);
            var userId = "userId_example";  // string | The ID of the user

            try
            {
                // Deletes a VRS user
                apiInstance.ScimV2UsersUserIdDelete(userId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2UsersUserIdDelete: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2usersuseridget"></a>
# **ScimV2UsersUserIdGet**
> ScimUser ScimV2UsersUserIdGet (string userId)

Retrieves a VRS User

Retrieves a VRS user based on their ID

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2UsersUserIdGetExample
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

            var apiInstance = new SCIMApi(config);
            var userId = "userId_example";  // string | The ID of the user

            try
            {
                // Retrieves a VRS User
                ScimUser result = apiInstance.ScimV2UsersUserIdGet(userId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2UsersUserIdGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2usersuseridpatch"></a>
# **ScimV2UsersUserIdPatch**
> ScimUser ScimV2UsersUserIdPatch (string userId, InlineObject1 inlineObject1)

Add or remove VRS user attributes

Adds or removes VRS user attributes based on the JSON properties

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2UsersUserIdPatchExample
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

            var apiInstance = new SCIMApi(config);
            var userId = "userId_example";  // string | The ID of the user
            var inlineObject1 = new InlineObject1(); // InlineObject1 | 

            try
            {
                // Add or remove VRS user attributes
                ScimUser result = apiInstance.ScimV2UsersUserIdPatch(userId, inlineObject1);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2UsersUserIdPatch: " + e.Message );
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="scimv2usersuseridput"></a>
# **ScimV2UsersUserIdPut**
> ScimUser ScimV2UsersUserIdPut (string userId, ScimUser scimUser)

Updates a VRS user

Updates (replaces) a VRS user with the properties in the JSON

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Vermilion.Api;
using FactSet.SDK.Vermilion.Client;
using FactSet.SDK.Vermilion.Model;

namespace Example
{
    public class ScimV2UsersUserIdPutExample
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

            var apiInstance = new SCIMApi(config);
            var userId = "userId_example";  // string | The ID of the user
            var scimUser = new ScimUser(); // ScimUser | 

            try
            {
                // Updates a VRS user
                ScimUser result = apiInstance.ScimV2UsersUserIdPut(userId, scimUser);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SCIMApi.ScimV2UsersUserIdPut: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

