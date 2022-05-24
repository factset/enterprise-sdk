# ScimApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scimV2GroupsGet**](ScimApi.md#scimV2GroupsGet) | **GET** /scim/v2/Groups/ | Retrieves a list of VRS role
[**scimV2GroupsGroupIdDelete**](ScimApi.md#scimV2GroupsGroupIdDelete) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
[**scimV2GroupsGroupIdGet**](ScimApi.md#scimV2GroupsGroupIdGet) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
[**scimV2GroupsGroupIdPatch**](ScimApi.md#scimV2GroupsGroupIdPatch) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
[**scimV2GroupsGroupIdPut**](ScimApi.md#scimV2GroupsGroupIdPut) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
[**scimV2GroupsPost**](ScimApi.md#scimV2GroupsPost) | **POST** /scim/v2/Groups/ | Creates a role
[**scimV2UsersGet**](ScimApi.md#scimV2UsersGet) | **GET** /scim/v2/Users/ | Retrieves a list of VRS users
[**scimV2UsersPost**](ScimApi.md#scimV2UsersPost) | **POST** /scim/v2/Users/ | Creates a user
[**scimV2UsersUserIdDelete**](ScimApi.md#scimV2UsersUserIdDelete) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
[**scimV2UsersUserIdGet**](ScimApi.md#scimV2UsersUserIdGet) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
[**scimV2UsersUserIdPatch**](ScimApi.md#scimV2UsersUserIdPatch) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
[**scimV2UsersUserIdPut**](ScimApi.md#scimV2UsersUserIdPut) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user



## scimV2GroupsGet

> ScimGroupListResponse scimV2GroupsGet(count, startIndex)

Retrieves a list of VRS role

Retrieves a VRS roles

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        Integer count = 25; // Integer | Non-negative maximum number of entries to return
        Integer startIndex = 1; // Integer | The 1-based index of the first query result
        try {
            ScimGroupListResponse result = apiInstance.scimV2GroupsGet(count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2GroupsGet");
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


## scimV2GroupsGroupIdDelete

> scimV2GroupsGroupIdDelete(groupId)

Deletes a VRS role

Deletes a VRS role

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String groupId = "groupId_example"; // String | The ID of the group
        try {
            apiInstance.scimV2GroupsGroupIdDelete(groupId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2GroupsGroupIdDelete");
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


## scimV2GroupsGroupIdGet

> ScimGroup scimV2GroupsGroupIdGet(groupId)

Retrieves a VRS role

Retrieves a VRS role based on the ID

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String groupId = "groupId_example"; // String | The ID of the role
        try {
            ScimGroup result = apiInstance.scimV2GroupsGroupIdGet(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2GroupsGroupIdGet");
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


## scimV2GroupsGroupIdPatch

> ScimGroup scimV2GroupsGroupIdPatch(groupId, inlineObject2)

Add or remove a user to/from a group

Adds or removes a VRS user to/from a VRS role

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String groupId = "groupId_example"; // String | The ID of the role
        InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
        try {
            ScimGroup result = apiInstance.scimV2GroupsGroupIdPatch(groupId, inlineObject2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2GroupsGroupIdPatch");
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


## scimV2GroupsGroupIdPut

> ScimGroup scimV2GroupsGroupIdPut(groupId, scimGroup)

Updates a VRS Group

Updates (replaces) a VRS Group with the properties in the JSON

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String groupId = "groupId_example"; // String | The ID of the group
        ScimGroup scimGroup = new ScimGroup(); // ScimGroup | 
        try {
            ScimGroup result = apiInstance.scimV2GroupsGroupIdPut(groupId, scimGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2GroupsGroupIdPut");
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


## scimV2GroupsPost

> ScimGroup scimV2GroupsPost(scimGroup)

Creates a role

Creates a VRS role

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
            ScimGroup result = apiInstance.scimV2GroupsPost(scimGroup);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2GroupsPost");
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


## scimV2UsersGet

> ScimUserListResponse scimV2UsersGet(count, startIndex)

Retrieves a list of VRS users

Retrieves a VRS users

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        Integer count = 25; // Integer | Non-negative maximum number of entries to return
        Integer startIndex = 1; // Integer | The 1-based index of the first query result
        try {
            ScimUserListResponse result = apiInstance.scimV2UsersGet(count, startIndex);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2UsersGet");
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


## scimV2UsersPost

> CreatedScimUserJSONResponse scimV2UsersPost(createScimUserJSONRequest)

Creates a user

Creates a VRS user

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
            CreatedScimUserJSONResponse result = apiInstance.scimV2UsersPost(createScimUserJSONRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2UsersPost");
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


## scimV2UsersUserIdDelete

> scimV2UsersUserIdDelete(userId)

Deletes a VRS user

Deletes a VRS user (this marks them as 'Deleted' in the database)

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String userId = "userId_example"; // String | The ID of the user
        try {
            apiInstance.scimV2UsersUserIdDelete(userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2UsersUserIdDelete");
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


## scimV2UsersUserIdGet

> ScimUser scimV2UsersUserIdGet(userId)

Retrieves a VRS User

Retrieves a VRS user based on their ID

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String userId = "userId_example"; // String | The ID of the user
        try {
            ScimUser result = apiInstance.scimV2UsersUserIdGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2UsersUserIdGet");
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


## scimV2UsersUserIdPatch

> ScimUser scimV2UsersUserIdPatch(userId, inlineObject1)

Add or remove VRS user attributes

Adds or removes VRS user attributes based on the JSON properties

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String userId = "userId_example"; // String | The ID of the user
        InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
        try {
            ScimUser result = apiInstance.scimV2UsersUserIdPatch(userId, inlineObject1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2UsersUserIdPatch");
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


## scimV2UsersUserIdPut

> ScimUser scimV2UsersUserIdPut(userId, scimUser)

Updates a VRS user

Updates (replaces) a VRS user with the properties in the JSON

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ScimApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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
        String userId = "userId_example"; // String | The ID of the user
        ScimUser scimUser = new ScimUser(); // ScimUser | 
        try {
            ScimUser result = apiInstance.scimV2UsersUserIdPut(userId, scimUser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScimApi#scimV2UsersUserIdPut");
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

