# VermilionUsersApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vermilionUsersGet**](VermilionUsersApi.md#vermilionUsersGet) | **GET** /VermilionUsers | Get a list of Vermilion users.
[**vermilionUsersIdDelete**](VermilionUsersApi.md#vermilionUsersIdDelete) | **DELETE** /VermilionUsers/{id} | Delete a Vermilion user
[**vermilionUsersIdGet**](VermilionUsersApi.md#vermilionUsersIdGet) | **GET** /VermilionUsers/{id} | Get a Vermilion user.
[**vermilionUsersIdPatch**](VermilionUsersApi.md#vermilionUsersIdPatch) | **PATCH** /VermilionUsers/{id} | Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)
[**vermilionUsersIdPut**](VermilionUsersApi.md#vermilionUsersIdPut) | **PUT** /VermilionUsers/{id} | Replace a Vermilion user.
[**vermilionUsersPost**](VermilionUsersApi.md#vermilionUsersPost) | **POST** /VermilionUsers | Create a Vermilion user.



## vermilionUsersGet

> VermilionUserResource vermilionUsersGet(filter, startIndex, count, attributes, excludedAttributes)

Get a list of Vermilion users.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.VermilionUsersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
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

        VermilionUsersApi apiInstance = new VermilionUsersApi(defaultClient);
        String filter = "filter_example"; // String | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. **Note**: only a subset of the filter string grammar is currently supported.
        Integer startIndex = 56; // Integer | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
        Integer count = 56; // Integer | Maximum resource count. The server will not return more resources than this value, although it may return fewer.
        String attributes = "attributes_example"; // String | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.
        String excludedAttributes = "excludedAttributes_example"; // String | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.
        try {
            VermilionUserResource result = apiInstance.vermilionUsersGet(filter, startIndex, count, attributes, excludedAttributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VermilionUsersApi#vermilionUsersGet");
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
 **filter** | **String**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. **Note**: only a subset of the filter string grammar is currently supported. | [optional]
 **startIndex** | **Integer**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional]
 **count** | **Integer**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional]
 **attributes** | **String**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional]
 **excludedAttributes** | **String**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional]

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Invalid filter value provided. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |


## vermilionUsersIdDelete

> vermilionUsersIdDelete(id)

Delete a Vermilion user

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.VermilionUsersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
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

        VermilionUsersApi apiInstance = new VermilionUsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        try {
            apiInstance.vermilionUsersIdDelete(id);

        } catch (ApiException e) {
            System.err.println("Exception when calling VermilionUsersApi#vermilionUsersIdDelete");
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
 **id** | **String**| ID of resource. |

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
| **204** | User successfully deleted. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | Vermilion user not found. |  -  |
| **500** | Internal server error. |  -  |


## vermilionUsersIdGet

> VermilionUserResource vermilionUsersIdGet(id)

Get a Vermilion user.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.VermilionUsersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
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

        VermilionUsersApi apiInstance = new VermilionUsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        try {
            VermilionUserResource result = apiInstance.vermilionUsersIdGet(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VermilionUsersApi#vermilionUsersIdGet");
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
 **id** | **String**| ID of resource. |

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal server error. |  -  |


## vermilionUsersIdPatch

> VermilionUserResource vermilionUsersIdPatch(id, patch)

Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.VermilionUsersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
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

        VermilionUsersApi apiInstance = new VermilionUsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        Patch patch = new Patch(); // Patch | 
        try {
            VermilionUserResource result = apiInstance.vermilionUsersIdPatch(id, patch);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VermilionUsersApi#vermilionUsersIdPatch");
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
 **id** | **String**| ID of resource. |
 **patch** | [**Patch**](Patch.md)|  | [optional]

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Patch request invalid. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |


## vermilionUsersIdPut

> VermilionUserResource vermilionUsersIdPut(id, vermilionUserResource)

Replace a Vermilion user.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.VermilionUsersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
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

        VermilionUsersApi apiInstance = new VermilionUsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        VermilionUserResource vermilionUserResource = new VermilionUserResource(); // VermilionUserResource | Vermilion user resource.
        try {
            VermilionUserResource result = apiInstance.vermilionUsersIdPut(id, vermilionUserResource);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VermilionUsersApi#vermilionUsersIdPut");
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
 **id** | **String**| ID of resource. |
 **vermilionUserResource** | [**VermilionUserResource**](VermilionUserResource.md)| Vermilion user resource. |

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Provided resource contains invalid data. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal server error. |  -  |


## vermilionUsersPost

> VermilionUserResource vermilionUsersPost(vermilionUserResource)

Create a Vermilion user.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.VermilionUsersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
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

        VermilionUsersApi apiInstance = new VermilionUsersApi(defaultClient);
        VermilionUserResource vermilionUserResource = new VermilionUserResource(); // VermilionUserResource | Vermilion user resource.
        try {
            VermilionUserResource result = apiInstance.vermilionUsersPost(vermilionUserResource);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VermilionUsersApi#vermilionUsersPost");
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
 **vermilionUserResource** | [**VermilionUserResource**](VermilionUserResource.md)| Vermilion user resource. |

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/scim+json
- **Accept**: application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. |  -  |
| **400** | Provided resource contains invalid data. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **500** | Internal server error. |  -  |

