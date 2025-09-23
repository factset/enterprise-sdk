# UsersApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /Users | Create a user.
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /Users/{id} | Delete a user.
[**getUser**](UsersApi.md#getUser) | **GET** /Users/{id} | Get a user.
[**getUsers**](UsersApi.md#getUsers) | **GET** /Users | Get a list of users.
[**modifyUser**](UsersApi.md#modifyUser) | **PATCH** /Users/{id} | Patch a user.
[**replaceUser**](UsersApi.md#replaceUser) | **PUT** /Users/{id} | Replace a user.



## createUser

> UserResource createUser(userResource, attributes, excludedAttributes, additionalAttributes)

Create a user.

Create a user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        UserResource userResource = new UserResource(); // UserResource | User resource.
        java.util.List<String> attributes = Arrays.asList(); // java.util.List<String> | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters.
        java.util.List<String> excludedAttributes = Arrays.asList(); // java.util.List<String> | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters.
        java.util.List<String> additionalAttributes = Arrays.asList(); // java.util.List<String> | Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters.
        try {
            UserResource result = apiInstance.createUser(userResource, attributes, excludedAttributes, additionalAttributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUser");
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
 **userResource** | [**UserResource**](UserResource.md)| User resource. |
 **attributes** | **List&lt;String&gt;**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. | [optional]
 **excludedAttributes** | **List&lt;String&gt;**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. | [optional]
 **additionalAttributes** | **List&lt;String&gt;**| Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. | [optional]

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


## deleteUser

> deleteUser(id)

Delete a user.

Delete a specific user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        try {
            apiInstance.deleteUser(id);

        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
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


## getUser

> UserResource getUser(id, attributes, excludedAttributes, additionalAttributes)

Get a user.

Get a specific user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        java.util.List<String> attributes = Arrays.asList(); // java.util.List<String> | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters.
        java.util.List<String> excludedAttributes = Arrays.asList(); // java.util.List<String> | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters.
        java.util.List<String> additionalAttributes = Arrays.asList(); // java.util.List<String> | Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters.
        try {
            UserResource result = apiInstance.getUser(id, attributes, excludedAttributes, additionalAttributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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
 **attributes** | **List&lt;String&gt;**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. | [optional]
 **excludedAttributes** | **List&lt;String&gt;**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. | [optional]
 **additionalAttributes** | **List&lt;String&gt;**| Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. | [optional]

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


## getUsers

> UserResourceList getUsers(filter, sortBy, sortOrder, startIndex, count, attributes, excludedAttributes, additionalAttributes)

Get a list of users.

Get a list of user resources.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String filter = "filter_example"; // String | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against string attributes. When using the \"re\" operator, do not include slash characters as delimiters (e.g. use \"foo\" instead of \"/foo/\".) Also note the case-sensitivity of the regular expression corresponds to the \"caseExact\" characteristic of the target attribute.
        String sortBy = "sortBy_example"; // String | Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order.
        String sortOrder = "sortOrder_example"; // String | The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are ''ascending'' (the default value) or ''descending''. This parameter may not be used unless the *sortBy* parameter is also specified.
        Integer startIndex = 56; // Integer | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
        Integer count = 56; // Integer | Maximum resource count. The server will not return more resources than this value, although it may return fewer.
        java.util.List<String> attributes = Arrays.asList(); // java.util.List<String> | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters.
        java.util.List<String> excludedAttributes = Arrays.asList(); // java.util.List<String> | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters.
        java.util.List<String> additionalAttributes = Arrays.asList(); // java.util.List<String> | Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters.
        try {
            UserResourceList result = apiInstance.getUsers(filter, sortBy, sortOrder, startIndex, count, attributes, excludedAttributes, additionalAttributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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
 **filter** | **String**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against string attributes. When using the \&quot;re\&quot; operator, do not include slash characters as delimiters (e.g. use \&quot;foo\&quot; instead of \&quot;/foo/\&quot;.) Also note the case-sensitivity of the regular expression corresponds to the \&quot;caseExact\&quot; characteristic of the target attribute. | [optional]
 **sortBy** | **String**| Attribute to be used for sorting resources. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). The attribute name must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) Use the *sortOrder* parameter to specify whether resources should be sorted in ascending or descending order. | [optional]
 **sortOrder** | **String**| The order by which resources are to be sorted. See [RFC 7644 section 3.4.2.3](https://tools.ietf.org/html/rfc7644#section-3.4.2.3). Valid values are &#39;&#39;ascending&#39;&#39; (the default value) or &#39;&#39;descending&#39;&#39;. This parameter may not be used unless the *sortBy* parameter is also specified. | [optional]
 **startIndex** | **Integer**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional]
 **count** | **Integer**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional]
 **attributes** | **List&lt;String&gt;**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. | [optional]
 **excludedAttributes** | **List&lt;String&gt;**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. | [optional]
 **additionalAttributes** | **List&lt;String&gt;**| Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. | [optional]

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


## modifyUser

> UserResource modifyUser(id, attributes, excludedAttributes, additionalAttributes, patch)

Patch a user.

Modify a specific user resource (i.e. add, replace, or remove attributes of a user resource.)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        java.util.List<String> attributes = Arrays.asList(); // java.util.List<String> | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters.
        java.util.List<String> excludedAttributes = Arrays.asList(); // java.util.List<String> | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters.
        java.util.List<String> additionalAttributes = Arrays.asList(); // java.util.List<String> | Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters.
        Patch patch = new Patch(); // Patch | 
        try {
            UserResource result = apiInstance.modifyUser(id, attributes, excludedAttributes, additionalAttributes, patch);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#modifyUser");
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
 **attributes** | **List&lt;String&gt;**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. | [optional]
 **excludedAttributes** | **List&lt;String&gt;**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. | [optional]
 **additionalAttributes** | **List&lt;String&gt;**| Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. | [optional]
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


## replaceUser

> UserResource replaceUser(id, userResource, attributes, excludedAttributes, additionalAttributes)

Replace a user.

Replace a specific user resource with another provided user resource.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.UsersApi;

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

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        UserResource userResource = new UserResource(); // UserResource | User resource.
        java.util.List<String> attributes = Arrays.asList(); // java.util.List<String> | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters.
        java.util.List<String> excludedAttributes = Arrays.asList(); // java.util.List<String> | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters.
        java.util.List<String> additionalAttributes = Arrays.asList(); // java.util.List<String> | Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters.
        try {
            UserResource result = apiInstance.replaceUser(id, userResource, attributes, excludedAttributes, additionalAttributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#replaceUser");
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
 **userResource** | [**UserResource**](UserResource.md)| User resource. |
 **attributes** | **List&lt;String&gt;**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* or *additionalAttributes* parameters. | [optional]
 **excludedAttributes** | **List&lt;String&gt;**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *additionalAttributes* parameters. | [optional]
 **additionalAttributes** | **List&lt;String&gt;**| Non-standard attribute filter string. A comma-separated list of resource attribute names to be included in the response, complementing the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* or *excludedAttributes* parameters. | [optional]

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

