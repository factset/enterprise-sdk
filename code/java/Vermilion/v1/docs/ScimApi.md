# ScimApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroup**](ScimApi.md#createGroup) | **POST** /scim/v2/Groups | Creates a role
[**createUser**](ScimApi.md#createUser) | **POST** /scim/v2/Users | Creates a user
[**deleteGroupById**](ScimApi.md#deleteGroupById) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
[**deleteUserById**](ScimApi.md#deleteUserById) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
[**getAllGroups**](ScimApi.md#getAllGroups) | **GET** /scim/v2/Groups | Retrieves a list of VRS role
[**getAllUsers**](ScimApi.md#getAllUsers) | **GET** /scim/v2/Users | Retrieves a list of VRS users
[**getGroupById**](ScimApi.md#getGroupById) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
[**getUserById**](ScimApi.md#getUserById) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
[**patchGroupById**](ScimApi.md#patchGroupById) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
[**patchUserById**](ScimApi.md#patchUserById) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
[**updateGroupById**](ScimApi.md#updateGroupById) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
[**updateUserById**](ScimApi.md#updateUserById) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user



## createGroup

> ScimGroup createGroup(scimGroup)

Creates a role

Creates a VRS role

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
        try {
            ScimGroup result = apiInstance.createGroup(scimGroup);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#createGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
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


## createUser

> CreatedScimUserJSONResponse createUser(createScimUserJSONRequest)

Creates a user

Creates a VRS user

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        CreateScimUserJSONRequest createScimUserJSONRequest = new CreateScimUserJSONRequest(); // CreateScimUserJSONRequest | 
        try {
            CreatedScimUserJSONResponse result = apiInstance.createUser(createScimUserJSONRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
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


## deleteGroupById

> deleteGroupById(groupId)

Deletes a VRS role

Deletes a VRS role

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String groupId = "123456"; // String | The ID of the group
        try {
            apiInstance.deleteGroupById(groupId);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#deleteGroupById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The ID of the group |

### Return type

null (empty response body)

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


## deleteUserById

> deleteUserById(userId)

Deletes a VRS user

Deletes a VRS user (this marks them as 'Deleted' in the database)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String userId = "123456"; // String | The ID of the user
        try {
            apiInstance.deleteUserById(userId);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#deleteUserById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user |

### Return type

null (empty response body)

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


## getAllGroups

> ScimGroupListResponse getAllGroups(count, startIndex, filter, sortBy, sortOrder)

Retrieves a list of VRS role

Retrieves VRS roles

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        Integer count = 10; // Integer | Non-negative maximum number of entries to return
        Integer startIndex = 5; // Integer | The 1-based index of the first query result
        String filter = "tenant eq \"MASTER,DEMO\""; // String | Acts as a filter for the retrieval process. if filter=tenant, filters the groups that match the given tenant code. Accepts multiple values separated by a comma, e.g. ?filter=tenant eq MASTER,DEMO
        java.util.List<String> sortBy = Arrays.asList(); // java.util.List<String> | The column to sort on. If parameter is not given, no sorting will be done
        java.util.List<String> sortOrder = Arrays.asList(); // java.util.List<String> | The order in which the sort is applied for the sort by parameter. If parameter is not given along with a sortBy, sorting will be done in ascending order
        try {
            ScimGroupListResponse result = apiInstance.getAllGroups(count, startIndex, filter, sortBy, sortOrder);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#getAllGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Non-negative maximum number of entries to return | [optional]
 **startIndex** | **Integer**| The 1-based index of the first query result | [optional]
 **filter** | **String**| Acts as a filter for the retrieval process. if filter&#x3D;tenant, filters the groups that match the given tenant code. Accepts multiple values separated by a comma, e.g. ?filter&#x3D;tenant eq MASTER,DEMO | [optional]
 **sortBy** | **List&lt;String&gt;**| The column to sort on. If parameter is not given, no sorting will be done | [optional]
 **sortOrder** | **List&lt;String&gt;**| The order in which the sort is applied for the sort by parameter. If parameter is not given along with a sortBy, sorting will be done in ascending order | [optional]

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


## getAllUsers

> ScimUserListResponse getAllUsers(count, startIndex)

Retrieves a list of VRS users

Retrieves a list of VRS users

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        Integer count = 10; // Integer | Non-negative maximum number of entries to return
        Integer startIndex = 5; // Integer | The 1-based index of the first query result
        try {
            ScimUserListResponse result = apiInstance.getAllUsers(count, startIndex);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#getAllUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Non-negative maximum number of entries to return | [optional]
 **startIndex** | **Integer**| The 1-based index of the first query result | [optional]

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


## getGroupById

> ScimGroup getGroupById(groupId)

Retrieves a VRS role

Retrieves a VRS role based on the ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String groupId = "123456"; // String | The ID of the role
        try {
            ScimGroup result = apiInstance.getGroupById(groupId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#getGroupById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The ID of the role |

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


## getUserById

> ScimUser getUserById(userId)

Retrieves a VRS User

Retrieves a VRS user based on their ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String userId = "123456"; // String | The ID of the user
        try {
            ScimUser result = apiInstance.getUserById(userId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#getUserById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user |

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


## patchGroupById

> ScimGroup patchGroupById(groupId, scimGroupPatchRequestBody)

Add or remove a user to/from a group

Adds or removes a VRS user to/from a VRS role

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String groupId = "123456"; // String | The ID of the role
        ScimGroupPatchRequestBody scimGroupPatchRequestBody = new ScimGroupPatchRequestBody(); // ScimGroupPatchRequestBody | 
        try {
            ScimGroup result = apiInstance.patchGroupById(groupId, scimGroupPatchRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#patchGroupById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The ID of the role |
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


## patchUserById

> ScimUser patchUserById(userId, scimUserPatchRequestBody)

Add or remove VRS user attributes

Adds or removes VRS user attributes based on the JSON properties

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String userId = "123456"; // String | The ID of the user
        ScimUserPatchRequestBody scimUserPatchRequestBody = new ScimUserPatchRequestBody(); // ScimUserPatchRequestBody | 
        try {
            ScimUser result = apiInstance.patchUserById(userId, scimUserPatchRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#patchUserById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user |
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


## updateGroupById

> ScimGroup updateGroupById(groupId, scimGroup)

Updates a VRS Group

Updates (replaces) a VRS Group with the properties in the JSON

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String groupId = "123456"; // String | The ID of the group
        ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
        try {
            ScimGroup result = apiInstance.updateGroupById(groupId, scimGroup);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#updateGroupById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The ID of the group |
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


## updateUserById

> ScimUser updateUserById(userId, scimUser)

Updates a VRS user

Updates (replaces) a VRS user with the properties in the JSON

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ScimApi apiInstance = new ScimApi(defaultClient);
        String userId = "123456"; // String | The ID of the user
        ScimUser scimUser = new ScimUser(); // ScimUser | 
        try {
            ScimUser result = apiInstance.updateUserById(userId, scimUser);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#updateUserById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The ID of the user |
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

