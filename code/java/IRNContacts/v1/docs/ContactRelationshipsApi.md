# ContactRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ContactRelationshipsContactRelationshipIdDelete**](ContactRelationshipsApi.md#v1ContactRelationshipsContactRelationshipIdDelete) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**v1ContactRelationshipsContactRelationshipIdGet**](ContactRelationshipsApi.md#v1ContactRelationshipsContactRelationshipIdGet) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**v1ContactRelationshipsContactRelationshipIdPatch**](ContactRelationshipsApi.md#v1ContactRelationshipsContactRelationshipIdPatch) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship
[**v1ContactRelationshipsGet**](ContactRelationshipsApi.md#v1ContactRelationshipsGet) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**v1ContactRelationshipsPost**](ContactRelationshipsApi.md#v1ContactRelationshipsPost) | **POST** /v1/contact-relationships | Create a contact relationship



## v1ContactRelationshipsContactRelationshipIdDelete

> v1ContactRelationshipsContactRelationshipIdDelete(contactRelationshipId)

Delete a contact relationship

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactRelationshipsApi;

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

        ContactRelationshipsApi apiInstance = new ContactRelationshipsApi(defaultClient);
        java.util.UUID contactRelationshipId = new java.util.UUID(); // java.util.UUID | contactRelationshipId to delete associated record
        try {
            apiInstance.v1ContactRelationshipsContactRelationshipIdDelete(contactRelationshipId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactRelationshipsApi#v1ContactRelationshipsContactRelationshipIdDelete");
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
 **contactRelationshipId** | **java.util.UUID**| contactRelationshipId to delete associated record |

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


## v1ContactRelationshipsContactRelationshipIdGet

> ContactRelationshipTwoSidedDto v1ContactRelationshipsContactRelationshipIdGet(contactRelationshipId)

Get details on a specific contact relationship

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactRelationshipsApi;

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

        ContactRelationshipsApi apiInstance = new ContactRelationshipsApi(defaultClient);
        java.util.UUID contactRelationshipId = new java.util.UUID(); // java.util.UUID | contactRelationshipId to get associated record
        try {
            ContactRelationshipTwoSidedDto result = apiInstance.v1ContactRelationshipsContactRelationshipIdGet(contactRelationshipId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactRelationshipsApi#v1ContactRelationshipsContactRelationshipIdGet");
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
 **contactRelationshipId** | **java.util.UUID**| contactRelationshipId to get associated record |

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


## v1ContactRelationshipsContactRelationshipIdPatch

> v1ContactRelationshipsContactRelationshipIdPatch(contactRelationshipId, operation)

Update a contact relationship

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactRelationshipsApi;

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

        ContactRelationshipsApi apiInstance = new ContactRelationshipsApi(defaultClient);
        java.util.UUID contactRelationshipId = new java.util.UUID(); // java.util.UUID | contactRelationshipId to update associated record
        java.util.List<Operation> operation = Arrays.asList(); // java.util.List<Operation> | contactRelationshipPatch object to update
        try {
            apiInstance.v1ContactRelationshipsContactRelationshipIdPatch(contactRelationshipId, operation);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactRelationshipsApi#v1ContactRelationshipsContactRelationshipIdPatch");
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
 **contactRelationshipId** | **java.util.UUID**| contactRelationshipId to update associated record |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| contactRelationshipPatch object to update | [optional]

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


## v1ContactRelationshipsGet

> java.util.List&lt;ContactRelationshipTwoSidedDto&gt; v1ContactRelationshipsGet(symbol, contactId, relationshipId)

Get all the relationships where the given symbol or contact identifier has been tagged in a relationship

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactRelationshipsApi;

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

        ContactRelationshipsApi apiInstance = new ContactRelationshipsApi(defaultClient);
        String symbol = "symbol_example"; // String | 
        java.util.UUID contactId = new java.util.UUID(); // java.util.UUID | 
        java.util.UUID relationshipId = new java.util.UUID(); // java.util.UUID | 
        try {
            java.util.List<ContactRelationshipTwoSidedDto> result = apiInstance.v1ContactRelationshipsGet(symbol, contactId, relationshipId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactRelationshipsApi#v1ContactRelationshipsGet");
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
 **symbol** | **String**|  | [optional]
 **contactId** | **java.util.UUID**|  | [optional]
 **relationshipId** | **java.util.UUID**|  | [optional]

### Return type

[**java.util.List&lt;ContactRelationshipTwoSidedDto&gt;**](ContactRelationshipTwoSidedDto.md)

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


## v1ContactRelationshipsPost

> v1ContactRelationshipsPost(contactRelationshipTwoSidedSaveDto)

Create a contact relationship

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.ContactRelationshipsApi;

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

        ContactRelationshipsApi apiInstance = new ContactRelationshipsApi(defaultClient);
        ContactRelationshipTwoSidedSaveDto contactRelationshipTwoSidedSaveDto = new ContactRelationshipTwoSidedSaveDto(); // ContactRelationshipTwoSidedSaveDto | contactRelationship object to save
        try {
            apiInstance.v1ContactRelationshipsPost(contactRelationshipTwoSidedSaveDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactRelationshipsApi#v1ContactRelationshipsPost");
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
 **contactRelationshipTwoSidedSaveDto** | [**ContactRelationshipTwoSidedSaveDto**](ContactRelationshipTwoSidedSaveDto.md)| contactRelationship object to save | [optional]

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
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

