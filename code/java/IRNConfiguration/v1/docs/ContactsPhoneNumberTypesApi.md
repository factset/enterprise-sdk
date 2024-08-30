# ContactsPhoneNumberTypesApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhoneNumberType**](ContactsPhoneNumberTypesApi.md#createPhoneNumberType) | **POST** /phone-number-types | Create a phone type
[**deletePhoneNumberType**](ContactsPhoneNumberTypesApi.md#deletePhoneNumberType) | **DELETE** /phone-number-types/{phoneNumberTypeId} | Delete a phone type
[**getPhoneNumberTypes**](ContactsPhoneNumberTypesApi.md#getPhoneNumberTypes) | **GET** /phone-number-types | Get list of the phone types configured in your group
[**updatePhoneNumberType**](ContactsPhoneNumberTypesApi.md#updatePhoneNumberType) | **PUT** /phone-number-types/{phoneNumberTypeId} | Edit a phone type



## createPhoneNumberType

> NewItemDto createPhoneNumberType(body)

Create a phone type

Create a phone type with given name

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.ContactsPhoneNumberTypesApi;

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

        ContactsPhoneNumberTypesApi apiInstance = new ContactsPhoneNumberTypesApi(defaultClient);
        String body = "body_example"; // String | To add phoneNumberType
        try {
            NewItemDto result = apiInstance.createPhoneNumberType(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsPhoneNumberTypesApi#createPhoneNumberType");
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

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## deletePhoneNumberType

> deletePhoneNumberType(phoneNumberTypeId)

Delete a phone type

Delete a phone number type based on guid

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.ContactsPhoneNumberTypesApi;

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

        ContactsPhoneNumberTypesApi apiInstance = new ContactsPhoneNumberTypesApi(defaultClient);
        java.util.UUID phoneNumberTypeId = new java.util.UUID(); // java.util.UUID | phoneNumberTypeId for deleting associated record
        try {
            apiInstance.deletePhoneNumberType(phoneNumberTypeId);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsPhoneNumberTypesApi#deletePhoneNumberType");
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


## getPhoneNumberTypes

> java.util.List<PhoneNumberTypeDto> getPhoneNumberTypes()

Get list of the phone types configured in your group

Get all phone types configured in your group

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.ContactsPhoneNumberTypesApi;

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

        ContactsPhoneNumberTypesApi apiInstance = new ContactsPhoneNumberTypesApi(defaultClient);
        try {
            java.util.List<PhoneNumberTypeDto> result = apiInstance.getPhoneNumberTypes();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsPhoneNumberTypesApi#getPhoneNumberTypes");
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


## updatePhoneNumberType

> updatePhoneNumberType(phoneNumberTypeId, body)

Edit a phone type

Update a phone number type

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNConfiguration.ApiClient;
import com.factset.sdk.IRNConfiguration.ApiException;
import com.factset.sdk.IRNConfiguration.Configuration;
import com.factset.sdk.IRNConfiguration.auth.*;
import com.factset.sdk.IRNConfiguration.models.*;
import com.factset.sdk.IRNConfiguration.api.ContactsPhoneNumberTypesApi;

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

        ContactsPhoneNumberTypesApi apiInstance = new ContactsPhoneNumberTypesApi(defaultClient);
        java.util.UUID phoneNumberTypeId = new java.util.UUID(); // java.util.UUID | phoneNumberTypeId to update associated record
        String body = "body_example"; // String | Update with phoneNumberType
        try {
            apiInstance.updatePhoneNumberType(phoneNumberTypeId, body);

        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsPhoneNumberTypesApi#updatePhoneNumberType");
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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

