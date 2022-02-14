# PhoneNumberTypesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PhoneNumberTypesGet**](PhoneNumberTypesApi.md#v1PhoneNumberTypesGet) | **GET** /v1/phone-number-types | Get list of the phone types configured in your group
[**v1PhoneNumberTypesPhoneNumberTypeIdDelete**](PhoneNumberTypesApi.md#v1PhoneNumberTypesPhoneNumberTypeIdDelete) | **DELETE** /v1/phone-number-types/{phoneNumberTypeId} | Delete a phone type
[**v1PhoneNumberTypesPhoneNumberTypeIdPut**](PhoneNumberTypesApi.md#v1PhoneNumberTypesPhoneNumberTypeIdPut) | **PUT** /v1/phone-number-types/{phoneNumberTypeId} | Edit a phone type
[**v1PhoneNumberTypesPost**](PhoneNumberTypesApi.md#v1PhoneNumberTypesPost) | **POST** /v1/phone-number-types | Create a phone type



## v1PhoneNumberTypesGet

> java.util.List&lt;PhoneNumberTypeDto&gt; v1PhoneNumberTypesGet()

Get list of the phone types configured in your group

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.PhoneNumberTypesApi;

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

        PhoneNumberTypesApi apiInstance = new PhoneNumberTypesApi(defaultClient);
        try {
            java.util.List<PhoneNumberTypeDto> result = apiInstance.v1PhoneNumberTypesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberTypesApi#v1PhoneNumberTypesGet");
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

[**java.util.List&lt;PhoneNumberTypeDto&gt;**](PhoneNumberTypeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## v1PhoneNumberTypesPhoneNumberTypeIdDelete

> v1PhoneNumberTypesPhoneNumberTypeIdDelete(phoneNumberTypeId)

Delete a phone type

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.PhoneNumberTypesApi;

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

        PhoneNumberTypesApi apiInstance = new PhoneNumberTypesApi(defaultClient);
        java.util.UUID phoneNumberTypeId = new java.util.UUID(); // java.util.UUID | phoneNumberTypeId for deleting associated record
        try {
            apiInstance.v1PhoneNumberTypesPhoneNumberTypeIdDelete(phoneNumberTypeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberTypesApi#v1PhoneNumberTypesPhoneNumberTypeIdDelete");
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
 **phoneNumberTypeId** | **java.util.UUID**| phoneNumberTypeId for deleting associated record |

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


## v1PhoneNumberTypesPhoneNumberTypeIdPut

> v1PhoneNumberTypesPhoneNumberTypeIdPut(phoneNumberTypeId, body)

Edit a phone type

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.PhoneNumberTypesApi;

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

        PhoneNumberTypesApi apiInstance = new PhoneNumberTypesApi(defaultClient);
        java.util.UUID phoneNumberTypeId = new java.util.UUID(); // java.util.UUID | phoneNumberTypeId to update associated record
        String body = "body_example"; // String | Update with phoneNumberType
        try {
            apiInstance.v1PhoneNumberTypesPhoneNumberTypeIdPut(phoneNumberTypeId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberTypesApi#v1PhoneNumberTypesPhoneNumberTypeIdPut");
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
 **phoneNumberTypeId** | **java.util.UUID**| phoneNumberTypeId to update associated record |
 **body** | **String**| Update with phoneNumberType |

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


## v1PhoneNumberTypesPost

> java.util.UUID v1PhoneNumberTypesPost(body)

Create a phone type

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.PhoneNumberTypesApi;

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

        PhoneNumberTypesApi apiInstance = new PhoneNumberTypesApi(defaultClient);
        String body = "body_example"; // String | To add phoneNumberType
        try {
            java.util.UUID result = apiInstance.v1PhoneNumberTypesPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberTypesApi#v1PhoneNumberTypesPost");
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
 **body** | **String**| To add phoneNumberType |

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

