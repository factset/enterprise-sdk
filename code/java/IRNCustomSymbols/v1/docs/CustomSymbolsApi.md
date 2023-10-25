# CustomSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomSymbol**](CustomSymbolsApi.md#createCustomSymbol) | **POST** /v1/custom-symbols | Create a custom symbol
[**deleteCustomSymbol**](CustomSymbolsApi.md#deleteCustomSymbol) | **DELETE** /v1/custom-symbols/{customSymbolId} | Delete a custom symbol
[**getCustomSymbol**](CustomSymbolsApi.md#getCustomSymbol) | **GET** /v1/custom-symbols/{customSymbolId} | Get all custom field and standard field details on a specific custom symbol
[**getCustomSymbolRecords**](CustomSymbolsApi.md#getCustomSymbolRecords) | **GET** /v1/custom-symbols/{customSymbolId}/records | Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
[**getCustomSymbols**](CustomSymbolsApi.md#getCustomSymbols) | **GET** /v1/custom-symbols | Get list of all custom symbols in your group along with some of their standard field and custom fields data
[**linkCustomSymbolToStandardSymbol**](CustomSymbolsApi.md#linkCustomSymbolToStandardSymbol) | **POST** /v1/custom-symbols/{customSymbolId}/link-standard-symbol | Link custom symbol to standard symbol
[**patchCustomSymbol**](CustomSymbolsApi.md#patchCustomSymbol) | **PATCH** /v1/custom-symbols/{customSymbolId} | Edit a custom symbol’s standard field and custom field data



## createCustomSymbol

> NewItemDto createCustomSymbol(createCustomSymbolDto)

Create a custom symbol

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        CreateCustomSymbolDto createCustomSymbolDto = new CreateCustomSymbolDto(); // CreateCustomSymbolDto | createCustomSymbolDto object to save
        try {
            NewItemDto result = apiInstance.createCustomSymbol(createCustomSymbolDto);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#createCustomSymbol");
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
 **createCustomSymbolDto** | [**CreateCustomSymbolDto**](CreateCustomSymbolDto.md)| createCustomSymbolDto object to save | [optional]

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


## deleteCustomSymbol

> deleteCustomSymbol(customSymbolId)

Delete a custom symbol

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        java.util.UUID customSymbolId = new java.util.UUID(); // java.util.UUID | customSymbolId to delete associated custom symbol
        try {
            apiInstance.deleteCustomSymbol(customSymbolId);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#deleteCustomSymbol");
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
 **customSymbolId** | **java.util.UUID**| customSymbolId to delete associated custom symbol |

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


## getCustomSymbol

> CustomSymbolDto getCustomSymbol(customSymbolId, includeEvent)

Get all custom field and standard field details on a specific custom symbol

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        java.util.UUID customSymbolId = new java.util.UUID(); // java.util.UUID | customSymbolId to get associated custom symbol
        Boolean includeEvent = false; // Boolean | Whether or not to include event
        try {
            CustomSymbolDto result = apiInstance.getCustomSymbol(customSymbolId, includeEvent);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#getCustomSymbol");
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
 **customSymbolId** | **java.util.UUID**| customSymbolId to get associated custom symbol |
 **includeEvent** | **Boolean**| Whether or not to include event | [optional] [default to false]

### Return type

[**CustomSymbolDto**](CustomSymbolDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCustomSymbolRecords

> java.util.List<RecordPreviewDto> getCustomSymbolRecords(customSymbolId)

Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        java.util.UUID customSymbolId = new java.util.UUID(); // java.util.UUID | CustomSymbolId to get associated records
        try {
            java.util.List<RecordPreviewDto> result = apiInstance.getCustomSymbolRecords(customSymbolId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#getCustomSymbolRecords");
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
 **customSymbolId** | **java.util.UUID**| CustomSymbolId to get associated records |

### Return type

[**java.util.List&lt;RecordPreviewDto&gt;**](RecordPreviewDto.md)

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


## getCustomSymbols

> java.util.List<CustomSymbolDto> getCustomSymbols(typeName, query, includeCustomFieldValues, excludeLinkedCustomSymbol, includeEvent)

Get list of all custom symbols in your group along with some of their standard field and custom fields data

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        String typeName = "typeName_example"; // String | filter custom symbols based on custom symbol type
        String query = "query_example"; // String | filter custom symbols based on custom symbol code or name
        Boolean includeCustomFieldValues = false; // Boolean | Whether or not to include customFieldValues
        Boolean excludeLinkedCustomSymbol = false; // Boolean | Whether or not to exclude linked custom symbol
        Boolean includeEvent = true; // Boolean | Whether or not to include event
        try {
            java.util.List<CustomSymbolDto> result = apiInstance.getCustomSymbols(typeName, query, includeCustomFieldValues, excludeLinkedCustomSymbol, includeEvent);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#getCustomSymbols");
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
 **typeName** | **String**| filter custom symbols based on custom symbol type | [optional]
 **query** | **String**| filter custom symbols based on custom symbol code or name | [optional]
 **includeCustomFieldValues** | **Boolean**| Whether or not to include customFieldValues | [optional] [default to false]
 **excludeLinkedCustomSymbol** | **Boolean**| Whether or not to exclude linked custom symbol | [optional] [default to false]
 **includeEvent** | **Boolean**| Whether or not to include event | [optional] [default to true]

### Return type

[**java.util.List&lt;CustomSymbolDto&gt;**](CustomSymbolDto.md)

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


## linkCustomSymbolToStandardSymbol

> linkCustomSymbolToStandardSymbol(customSymbolId, standardSymbolDto)

Link custom symbol to standard symbol

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        java.util.UUID customSymbolId = new java.util.UUID(); // java.util.UUID | customSymbolId associated with custom symbol
        StandardSymbolDto standardSymbolDto = new StandardSymbolDto(); // StandardSymbolDto | standard symbol name
        try {
            apiInstance.linkCustomSymbolToStandardSymbol(customSymbolId, standardSymbolDto);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#linkCustomSymbolToStandardSymbol");
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
 **customSymbolId** | **java.util.UUID**| customSymbolId associated with custom symbol |
 **standardSymbolDto** | [**StandardSymbolDto**](StandardSymbolDto.md)| standard symbol name | [optional]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## patchCustomSymbol

> patchCustomSymbol(customSymbolId, operation)

Edit a custom symbol’s standard field and custom field data

### Example

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsApi;

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

        CustomSymbolsApi apiInstance = new CustomSymbolsApi(defaultClient);
        java.util.UUID customSymbolId = new java.util.UUID(); // java.util.UUID | customSymbolId to update associated custom symbol
        java.util.List<Operation> operation = Arrays.asList(); // java.util.List<Operation> | updateCustomSymbolDto object to update
        try {
            apiInstance.patchCustomSymbol(customSymbolId, operation);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsApi#patchCustomSymbol");
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
 **customSymbolId** | **java.util.UUID**| customSymbolId to update associated custom symbol |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| updateCustomSymbolDto object to update | [optional]

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

