# HybridSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStandardSymbolMetadata**](HybridSymbolsApi.md#createStandardSymbolMetadata) | **POST** /v1/custom-symbols/standard-symbol-metadata | Create standard symbol metadata
[**getStandardSymbolMetadataGuid**](HybridSymbolsApi.md#getStandardSymbolMetadataGuid) | **GET** /v1/custom-symbols/standard-symbol-metadata/{standardSymbol} | Get all custom field and standard field details on a specific standard symbol
[**patchStandardSymbol**](HybridSymbolsApi.md#patchStandardSymbol) | **PATCH** /v1/custom-symbols/standard-symbol-metadata/{standardSymbolId} | Edit a standard symbol’s standard field and custom field data



## createStandardSymbolMetadata

> NewItemDto createStandardSymbolMetadata(createStandardSymbolMetadataDto)

Create standard symbol metadata

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
import com.factset.sdk.IRNCustomSymbols.api.HybridSymbolsApi;

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

        HybridSymbolsApi apiInstance = new HybridSymbolsApi(defaultClient);
        CreateStandardSymbolMetadataDto createStandardSymbolMetadataDto = new CreateStandardSymbolMetadataDto(); // CreateStandardSymbolMetadataDto | createStandardSymbolMetadataDto object to save
        try {
            NewItemDto result = apiInstance.createStandardSymbolMetadata(createStandardSymbolMetadataDto);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HybridSymbolsApi#createStandardSymbolMetadata");
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
 **createStandardSymbolMetadataDto** | [**CreateStandardSymbolMetadataDto**](CreateStandardSymbolMetadataDto.md)| createStandardSymbolMetadataDto object to save | [optional]

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


## getStandardSymbolMetadataGuid

> java.util.UUID getStandardSymbolMetadataGuid(standardSymbol)

Get all custom field and standard field details on a specific standard symbol

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
import com.factset.sdk.IRNCustomSymbols.api.HybridSymbolsApi;

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

        HybridSymbolsApi apiInstance = new HybridSymbolsApi(defaultClient);
        String standardSymbol = "standardSymbol_example"; // String | Standard symbol to get associated customSymbolId
        try {
            java.util.UUID result = apiInstance.getStandardSymbolMetadataGuid(standardSymbol);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HybridSymbolsApi#getStandardSymbolMetadataGuid");
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
 **standardSymbol** | **String**| Standard symbol to get associated customSymbolId |

### Return type

[**java.util.UUID**](java.util.UUID.md)

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


## patchStandardSymbol

> patchStandardSymbol(standardSymbolId, operation)

Edit a standard symbol’s standard field and custom field data

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
import com.factset.sdk.IRNCustomSymbols.api.HybridSymbolsApi;

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

        HybridSymbolsApi apiInstance = new HybridSymbolsApi(defaultClient);
        java.util.UUID standardSymbolId = new java.util.UUID(); // java.util.UUID | standardSymbolId to update associated standard symbol
        java.util.List<Operation> operation = Arrays.asList(); // java.util.List<Operation> | updateCustomSymbolDto object to update
        try {
            apiInstance.patchStandardSymbol(standardSymbolId, operation);

        } catch (ApiException e) {
            System.err.println("Exception when calling HybridSymbolsApi#patchStandardSymbol");
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
 **standardSymbolId** | **java.util.UUID**| standardSymbolId to update associated standard symbol |
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

