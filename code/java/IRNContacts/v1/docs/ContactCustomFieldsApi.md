# ContactCustomFieldsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ContactCustomFieldsContactCustomFieldIdDelete**](ContactCustomFieldsApi.md#v1ContactCustomFieldsContactCustomFieldIdDelete) | **DELETE** /v1/contact-custom-fields/{contactCustomFieldId} | Delete a contact custom field
[**v1ContactCustomFieldsContactCustomFieldIdGet**](ContactCustomFieldsApi.md#v1ContactCustomFieldsContactCustomFieldIdGet) | **GET** /v1/contact-custom-fields/{contactCustomFieldId} | Get a specific Contact custom field&#39;s details
[**v1ContactCustomFieldsContactCustomFieldIdPatch**](ContactCustomFieldsApi.md#v1ContactCustomFieldsContactCustomFieldIdPatch) | **PATCH** /v1/contact-custom-fields/{contactCustomFieldId} | Edit a contact custom field
[**v1ContactCustomFieldsGet**](ContactCustomFieldsApi.md#v1ContactCustomFieldsGet) | **GET** /v1/contact-custom-fields | Get all the contact custom fields
[**v1ContactCustomFieldsPost**](ContactCustomFieldsApi.md#v1ContactCustomFieldsPost) | **POST** /v1/contact-custom-fields | Create a contact custom field
[**v1ContactCustomFieldsReorderPost**](ContactCustomFieldsApi.md#v1ContactCustomFieldsReorderPost) | **POST** /v1/contact-custom-fields/reorder | Reorder contact custom fields



## v1ContactCustomFieldsContactCustomFieldIdDelete

> v1ContactCustomFieldsContactCustomFieldIdDelete(contactCustomFieldId)

Delete a contact custom field

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactCustomFieldsApi;

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
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        ContactCustomFieldsApi apiInstance = new ContactCustomFieldsApi(defaultClient);
        java.util.UUID contactCustomFieldId = new java.util.UUID(); // java.util.UUID | contactCustomFieldId to delete associated record
        try {
            apiInstance.v1ContactCustomFieldsContactCustomFieldIdDelete(contactCustomFieldId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactCustomFieldsApi#v1ContactCustomFieldsContactCustomFieldIdDelete");
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
 **contactCustomFieldId** | **java.util.UUID**| contactCustomFieldId to delete associated record |

### Return type

null (empty response body)

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


## v1ContactCustomFieldsContactCustomFieldIdGet

> ContactCustomFieldDto v1ContactCustomFieldsContactCustomFieldIdGet(contactCustomFieldId)

Get a specific Contact custom field&#39;s details

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactCustomFieldsApi;

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
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        ContactCustomFieldsApi apiInstance = new ContactCustomFieldsApi(defaultClient);
        java.util.UUID contactCustomFieldId = new java.util.UUID(); // java.util.UUID | contactCustomFieldId to get associated record
        try {
            ContactCustomFieldDto result = apiInstance.v1ContactCustomFieldsContactCustomFieldIdGet(contactCustomFieldId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactCustomFieldsApi#v1ContactCustomFieldsContactCustomFieldIdGet");
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
 **contactCustomFieldId** | **java.util.UUID**| contactCustomFieldId to get associated record |

### Return type

[**ContactCustomFieldDto**](ContactCustomFieldDto.md)

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


## v1ContactCustomFieldsContactCustomFieldIdPatch

> v1ContactCustomFieldsContactCustomFieldIdPatch(contactCustomFieldId, operation)

Edit a contact custom field

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactCustomFieldsApi;

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
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        ContactCustomFieldsApi apiInstance = new ContactCustomFieldsApi(defaultClient);
        java.util.UUID contactCustomFieldId = new java.util.UUID(); // java.util.UUID | contactCustomFieldId to update associated record
        java.util.List<Operation> operation = Arrays.asList(); // java.util.List<Operation> | contactCustomFieldUpdateDto object to update
        try {
            apiInstance.v1ContactCustomFieldsContactCustomFieldIdPatch(contactCustomFieldId, operation);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactCustomFieldsApi#v1ContactCustomFieldsContactCustomFieldIdPatch");
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
 **contactCustomFieldId** | **java.util.UUID**| contactCustomFieldId to update associated record |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| contactCustomFieldUpdateDto object to update | [optional]

### Return type

null (empty response body)

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


## v1ContactCustomFieldsGet

> java.util.List&lt;ContactCustomFieldDto&gt; v1ContactCustomFieldsGet()

Get all the contact custom fields

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactCustomFieldsApi;

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
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        ContactCustomFieldsApi apiInstance = new ContactCustomFieldsApi(defaultClient);
        try {
            java.util.List<ContactCustomFieldDto> result = apiInstance.v1ContactCustomFieldsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactCustomFieldsApi#v1ContactCustomFieldsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;ContactCustomFieldDto&gt;**](ContactCustomFieldDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## v1ContactCustomFieldsPost

> java.util.UUID v1ContactCustomFieldsPost(contactCustomFieldSaveDto)

Create a contact custom field

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactCustomFieldsApi;

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
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        ContactCustomFieldsApi apiInstance = new ContactCustomFieldsApi(defaultClient);
        ContactCustomFieldSaveDto contactCustomFieldSaveDto = new ContactCustomFieldSaveDto(); // ContactCustomFieldSaveDto | ContactCustomFieldSaveDto object to save
        try {
            java.util.UUID result = apiInstance.v1ContactCustomFieldsPost(contactCustomFieldSaveDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactCustomFieldsApi#v1ContactCustomFieldsPost");
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
 **contactCustomFieldSaveDto** | [**ContactCustomFieldSaveDto**](ContactCustomFieldSaveDto.md)| ContactCustomFieldSaveDto object to save | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

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


## v1ContactCustomFieldsReorderPost

> v1ContactCustomFieldsReorderPost(contactCustomFieldListDto)

Reorder contact custom fields

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactCustomFieldsApi;

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
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        ContactCustomFieldsApi apiInstance = new ContactCustomFieldsApi(defaultClient);
        ContactCustomFieldListDto contactCustomFieldListDto = new ContactCustomFieldListDto(); // ContactCustomFieldListDto | List of Guid
        try {
            apiInstance.v1ContactCustomFieldsReorderPost(contactCustomFieldListDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactCustomFieldsApi#v1ContactCustomFieldsReorderPost");
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
 **contactCustomFieldListDto** | [**ContactCustomFieldListDto**](ContactCustomFieldListDto.md)| List of Guid | [optional]

### Return type

null (empty response body)

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

