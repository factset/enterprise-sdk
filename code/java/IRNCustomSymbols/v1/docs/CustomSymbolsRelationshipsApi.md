# CustomSymbolsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSymbolRelationship**](CustomSymbolsRelationshipsApi.md#createSymbolRelationship) | **POST** /v1/symbol-relationships | Create a symbol relationship
[**deleteSymbolRelationship**](CustomSymbolsRelationshipsApi.md#deleteSymbolRelationship) | **DELETE** /v1/symbol-relationships/{symbolRelationshipId} | Delete a symbol relationship
[**editAndAddSymbolRelationship**](CustomSymbolsRelationshipsApi.md#editAndAddSymbolRelationship) | **PUT** /v1/symbol-relationships/{symbol} | Edit a symbol relationship
[**getSymbolRelationship**](CustomSymbolsRelationshipsApi.md#getSymbolRelationship) | **GET** /v1/symbol-relationships/{symbolRelationshipId} | Get details on a specific symbol relationship
[**getSymbolRelationships**](CustomSymbolsRelationshipsApi.md#getSymbolRelationships) | **GET** /v1/symbol-relationships/{symbolId}/relationships | Returns a list of a symbol’s relationships



## createSymbolRelationship

> createSymbolRelationship(symbolRelationshipSaveDto)

Create a symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsRelationshipsApi;

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

        CustomSymbolsRelationshipsApi apiInstance = new CustomSymbolsRelationshipsApi(defaultClient);
        java.util.List<SymbolRelationshipSaveDto> symbolRelationshipSaveDto = Arrays.asList(); // java.util.List<SymbolRelationshipSaveDto> | symbolRelationship object to save
        try {
            apiInstance.createSymbolRelationship(symbolRelationshipSaveDto);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#createSymbolRelationship");
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
 **symbolRelationshipSaveDto** | [**List&lt;SymbolRelationshipSaveDto&gt;**](SymbolRelationshipSaveDto.md)| symbolRelationship object to save | [optional]

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## deleteSymbolRelationship

> deleteSymbolRelationship(symbolRelationshipId)

Delete a symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsRelationshipsApi;

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

        CustomSymbolsRelationshipsApi apiInstance = new CustomSymbolsRelationshipsApi(defaultClient);
        java.util.UUID symbolRelationshipId = new java.util.UUID(); // java.util.UUID | symbolRelationshipId to delete associated record
        try {
            apiInstance.deleteSymbolRelationship(symbolRelationshipId);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#deleteSymbolRelationship");
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
 **symbolRelationshipId** | **java.util.UUID**| symbolRelationshipId to delete associated record |

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


## editAndAddSymbolRelationship

> editAndAddSymbolRelationship(symbol, symbolRelationshipUpdateDto)

Edit a symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsRelationshipsApi;

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

        CustomSymbolsRelationshipsApi apiInstance = new CustomSymbolsRelationshipsApi(defaultClient);
        String symbol = "symbol_example"; // String | 
        java.util.List<SymbolRelationshipUpdateDto> symbolRelationshipUpdateDto = Arrays.asList(); // java.util.List<SymbolRelationshipUpdateDto> | symbolRelationship object to save
        try {
            apiInstance.editAndAddSymbolRelationship(symbol, symbolRelationshipUpdateDto);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#editAndAddSymbolRelationship");
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
 **symbol** | **String**|  |
 **symbolRelationshipUpdateDto** | [**List&lt;SymbolRelationshipUpdateDto&gt;**](SymbolRelationshipUpdateDto.md)| symbolRelationship object to save | [optional]

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


## getSymbolRelationship

> SymbolRelationshipDto getSymbolRelationship(symbolRelationshipId)

Get details on a specific symbol relationship

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsRelationshipsApi;

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

        CustomSymbolsRelationshipsApi apiInstance = new CustomSymbolsRelationshipsApi(defaultClient);
        java.util.UUID symbolRelationshipId = new java.util.UUID(); // java.util.UUID | symbolRelationshipId to get associated record
        try {
            SymbolRelationshipDto result = apiInstance.getSymbolRelationship(symbolRelationshipId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#getSymbolRelationship");
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
 **symbolRelationshipId** | **java.util.UUID**| symbolRelationshipId to get associated record |

### Return type

[**SymbolRelationshipDto**](SymbolRelationshipDto.md)

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


## getSymbolRelationships

> java.util.List<SymbolRelationshipDto> getSymbolRelationships(symbolId)

Returns a list of a symbol’s relationships

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNCustomSymbols.ApiClient;
import com.factset.sdk.IRNCustomSymbols.ApiException;
import com.factset.sdk.IRNCustomSymbols.Configuration;
import com.factset.sdk.IRNCustomSymbols.auth.*;
import com.factset.sdk.IRNCustomSymbols.models.*;
import com.factset.sdk.IRNCustomSymbols.api.CustomSymbolsRelationshipsApi;

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

        CustomSymbolsRelationshipsApi apiInstance = new CustomSymbolsRelationshipsApi(defaultClient);
        java.util.UUID symbolId = new java.util.UUID(); // java.util.UUID | symbolId to get associated records
        try {
            java.util.List<SymbolRelationshipDto> result = apiInstance.getSymbolRelationships(symbolId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#getSymbolRelationships");
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
 **symbolId** | **java.util.UUID**| symbolId to get associated records |

### Return type

[**java.util.List&lt;SymbolRelationshipDto&gt;**](SymbolRelationshipDto.md)

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

