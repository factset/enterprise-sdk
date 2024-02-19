# CustomSymbolsCustomFieldsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#createCustomSymbolCustomField) | **POST** /v1/custom-symbol-custom-fields | Create a Custom symbol custom field
[**deleteCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#deleteCustomSymbolCustomField) | **DELETE** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Delete a Custom symbol custom field
[**getCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#getCustomSymbolCustomField) | **GET** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Get a specific Custom symbol custom field&#39;s details
[**getCustomSymbolCustomFields**](CustomSymbolsCustomFieldsApi.md#getCustomSymbolCustomFields) | **GET** /v1/custom-symbol-custom-fields | Get all the Custom symbol custom fields
[**patchCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#patchCustomSymbolCustomField) | **PATCH** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Edit a Custom symbol custom field



## createCustomSymbolCustomField

> NewItemDto createCustomSymbolCustomField(createCustomSymbolCustomFieldDto)

Create a Custom symbol custom field

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsCustomFieldsApi;

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

        CustomSymbolsCustomFieldsApi apiInstance = new CustomSymbolsCustomFieldsApi(defaultClient);
        CreateCustomSymbolCustomFieldDto createCustomSymbolCustomFieldDto = new CreateCustomSymbolCustomFieldDto(); // CreateCustomSymbolCustomFieldDto | createCustomSymbolCustomFieldDto object to save
        try {
            NewItemDto result = apiInstance.createCustomSymbolCustomField(createCustomSymbolCustomFieldDto);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsCustomFieldsApi#createCustomSymbolCustomField");
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
 **createCustomSymbolCustomFieldDto** | [**CreateCustomSymbolCustomFieldDto**](CreateCustomSymbolCustomFieldDto.md)| createCustomSymbolCustomFieldDto object to save | [optional]

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## deleteCustomSymbolCustomField

> deleteCustomSymbolCustomField(customSymbolCustomFieldId)

Delete a Custom symbol custom field

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsCustomFieldsApi;

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

        CustomSymbolsCustomFieldsApi apiInstance = new CustomSymbolsCustomFieldsApi(defaultClient);
        java.util.UUID customSymbolCustomFieldId = new java.util.UUID(); // java.util.UUID | customSymbolCustomFieldId to delete associated record
        try {
            apiInstance.deleteCustomSymbolCustomField(customSymbolCustomFieldId);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsCustomFieldsApi#deleteCustomSymbolCustomField");
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
 **customSymbolCustomFieldId** | **java.util.UUID**| customSymbolCustomFieldId to delete associated record |

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


## getCustomSymbolCustomField

> CustomSymbolCustomFieldConfigDto getCustomSymbolCustomField(customSymbolCustomFieldId)

Get a specific Custom symbol custom field&#39;s details

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsCustomFieldsApi;

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

        CustomSymbolsCustomFieldsApi apiInstance = new CustomSymbolsCustomFieldsApi(defaultClient);
        java.util.UUID customSymbolCustomFieldId = new java.util.UUID(); // java.util.UUID | customSymbolCustomFieldId to get associated record
        try {
            CustomSymbolCustomFieldConfigDto result = apiInstance.getCustomSymbolCustomField(customSymbolCustomFieldId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsCustomFieldsApi#getCustomSymbolCustomField");
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
 **customSymbolCustomFieldId** | **java.util.UUID**| customSymbolCustomFieldId to get associated record |

### Return type

[**CustomSymbolCustomFieldConfigDto**](CustomSymbolCustomFieldConfigDto.md)

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


## getCustomSymbolCustomFields

> java.util.List<CustomSymbolCustomFieldConfigDto> getCustomSymbolCustomFields()

Get all the Custom symbol custom fields

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsCustomFieldsApi;

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

        CustomSymbolsCustomFieldsApi apiInstance = new CustomSymbolsCustomFieldsApi(defaultClient);
        try {
            java.util.List<CustomSymbolCustomFieldConfigDto> result = apiInstance.getCustomSymbolCustomFields();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsCustomFieldsApi#getCustomSymbolCustomFields");
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

[**java.util.List&lt;CustomSymbolCustomFieldConfigDto&gt;**](CustomSymbolCustomFieldConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## patchCustomSymbolCustomField

> patchCustomSymbolCustomField(customSymbolCustomFieldId, operation)

Edit a Custom symbol custom field

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsCustomFieldsApi;

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

        CustomSymbolsCustomFieldsApi apiInstance = new CustomSymbolsCustomFieldsApi(defaultClient);
        java.util.UUID customSymbolCustomFieldId = new java.util.UUID(); // java.util.UUID | customSymbolCustomFieldId to update associated record
        java.util.List<Operation> operation = Arrays.asList(); // java.util.List<Operation> | customSymbolCustomFieldUpdateDto object to update
        try {
            apiInstance.patchCustomSymbolCustomField(customSymbolCustomFieldId, operation);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsCustomFieldsApi#patchCustomSymbolCustomField");
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
 **customSymbolCustomFieldId** | **java.util.UUID**| customSymbolCustomFieldId to update associated record |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| customSymbolCustomFieldUpdateDto object to update | [optional]

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

