# CustomSymbolsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSymbolRelationshipType**](CustomSymbolsRelationshipsApi.md#createSymbolRelationshipType) | **POST** /symbols-relationships | Create a symbol relationship
[**deleteSymbolsRelationship**](CustomSymbolsRelationshipsApi.md#deleteSymbolsRelationship) | **DELETE** /symbols-relationships/{symbolsRelationshipId} | Delete a symbol relationship
[**editSymbolsRelationship**](CustomSymbolsRelationshipsApi.md#editSymbolsRelationship) | **PUT** /symbols-relationships/{symbolsRelationshipId} | Edit a symbol relationship
[**getSymbolsRelationships**](CustomSymbolsRelationshipsApi.md#getSymbolsRelationships) | **GET** /symbols-relationships | Get all the Symbols Relationships



## createSymbolRelationshipType

> NewItemDto createSymbolRelationshipType(symbolsRelationShipSaveDto)

Create a symbol relationship

Create a symbol relationship with given name

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsRelationshipsApi;

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
        SymbolsRelationShipSaveDto symbolsRelationShipSaveDto = new SymbolsRelationShipSaveDto(); // SymbolsRelationShipSaveDto | symbolsRelationshipSaveDto object to save
        try {
            NewItemDto result = apiInstance.createSymbolRelationshipType(symbolsRelationShipSaveDto);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#createSymbolRelationshipType");
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
 **symbolsRelationShipSaveDto** | [**SymbolsRelationShipSaveDto**](SymbolsRelationShipSaveDto.md)| symbolsRelationshipSaveDto object to save | [optional]

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


## deleteSymbolsRelationship

> deleteSymbolsRelationship(symbolsRelationshipId)

Delete a symbol relationship

Delete a symbol relationship based on guid

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsRelationshipsApi;

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
        java.util.UUID symbolsRelationshipId = new java.util.UUID(); // java.util.UUID | symbolsRelationshipId to delete associated record
        try {
            apiInstance.deleteSymbolsRelationship(symbolsRelationshipId);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#deleteSymbolsRelationship");
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
 **symbolsRelationshipId** | **java.util.UUID**| symbolsRelationshipId to delete associated record |

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


## editSymbolsRelationship

> editSymbolsRelationship(symbolsRelationshipId, symbolsRelationShipSaveDto)

Edit a symbol relationship

Update a symbol relationship

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsRelationshipsApi;

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
        java.util.UUID symbolsRelationshipId = new java.util.UUID(); // java.util.UUID | symbolsRelationshipId to update associated record
        SymbolsRelationShipSaveDto symbolsRelationShipSaveDto = new SymbolsRelationShipSaveDto(); // SymbolsRelationShipSaveDto | SymbolsRelationShipSaveDto object to update
        try {
            apiInstance.editSymbolsRelationship(symbolsRelationshipId, symbolsRelationShipSaveDto);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#editSymbolsRelationship");
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
 **symbolsRelationshipId** | **java.util.UUID**| symbolsRelationshipId to update associated record |
 **symbolsRelationShipSaveDto** | [**SymbolsRelationShipSaveDto**](SymbolsRelationShipSaveDto.md)| SymbolsRelationShipSaveDto object to update | [optional]

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


## getSymbolsRelationships

> java.util.List<SymbolsRelationshipDto> getSymbolsRelationships()

Get all the Symbols Relationships

Get all symbols relationships configured in your group

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
import com.factset.sdk.IRNConfiguration.api.CustomSymbolsRelationshipsApi;

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
        try {
            java.util.List<SymbolsRelationshipDto> result = apiInstance.getSymbolsRelationships();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomSymbolsRelationshipsApi#getSymbolsRelationships");
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

[**java.util.List&lt;SymbolsRelationshipDto&gt;**](SymbolsRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

