# VectorSearchApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormTypes**](VectorSearchApi.md#getFormTypes) | **GET** /form-types | Returns the available form types
[**getVector**](VectorSearchApi.md#getVector) | **GET** /vector | Returns vector data and metadata for specified vector IDs
[**postSearch**](VectorSearchApi.md#postSearch) | **POST** /search | Perform semantic search and return ranked results with similarity scores
[**retrieveSources**](VectorSearchApi.md#retrieveSources) | **GET** /sources | Returns the available data sources



## getFormTypes

> FormTypesResponse getFormTypes()

Returns the available form types

Retrieves and delivers a comprehensive list of all available `formTypes`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.VectorData.ApiClient;
import com.factset.sdk.VectorData.ApiException;
import com.factset.sdk.VectorData.Configuration;
import com.factset.sdk.VectorData.auth.*;
import com.factset.sdk.VectorData.models.*;
import com.factset.sdk.VectorData.api.VectorSearchApi;

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

        VectorSearchApi apiInstance = new VectorSearchApi(defaultClient);
        try {
            FormTypesResponse result = apiInstance.getFormTypes();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VectorSearchApi#getFormTypes");
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

[**FormTypesResponse**](FormTypesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getVector

> VectorResponse getVector(vectorId, trimmed, paginationLimit, paginationOffset)

Returns vector data and metadata for specified vector IDs

Retrieves the complete vector embedding and all associated metadata for one or more vector IDs. Optionally returns trimmed vectors (metadata only) when the trimmed parameter is set to true.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.VectorData.ApiClient;
import com.factset.sdk.VectorData.ApiException;
import com.factset.sdk.VectorData.Configuration;
import com.factset.sdk.VectorData.auth.*;
import com.factset.sdk.VectorData.models.*;
import com.factset.sdk.VectorData.api.VectorSearchApi;

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

        VectorSearchApi apiInstance = new VectorSearchApi(defaultClient);
        java.util.List<String> vectorId = Arrays.asList(); // java.util.List<String> | Unique identifier for a document
        Boolean trimmed = false; // Boolean | If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response.
        Integer paginationLimit = 10; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return. 
        try {
            VectorResponse result = apiInstance.getVector(vectorId, trimmed, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VectorSearchApi#getVector");
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
 **vectorId** | **List&lt;String&gt;**| Unique identifier for a document |
 **trimmed** | **Boolean**| If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. | [optional] [default to false]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 10]
 **paginationOffset** | **Integer**| Page number of the results to return.  | [optional] [default to 0]

### Return type

[**VectorResponse**](VectorResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity. Validation failed for one or more request parameters or body fields. |  -  |
| **500** | Internal Server Error |  -  |


## postSearch

> SearchResponse postSearch(searchRequest)

Perform semantic search and return ranked results with similarity scores

Performs semantic search across vectorized financial documents and returns results ranked by similarity score. Supports filtering by themes (including ESG themes and search concepts), sentiment, form types, date ranges, and entity identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.VectorData.ApiClient;
import com.factset.sdk.VectorData.ApiException;
import com.factset.sdk.VectorData.Configuration;
import com.factset.sdk.VectorData.auth.*;
import com.factset.sdk.VectorData.models.*;
import com.factset.sdk.VectorData.api.VectorSearchApi;

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

        VectorSearchApi apiInstance = new VectorSearchApi(defaultClient);
        SearchRequest searchRequest = new SearchRequest(); // SearchRequest | Input parameters for semantic search.
        try {
            SearchResponse result = apiInstance.postSearch(searchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VectorSearchApi#postSearch");
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| Input parameters for semantic search. |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns search results with similarity scores |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **422** | Unprocessable Entity. Validation failed for one or more request parameters or body fields. |  -  |
| **500** | Internal Server Error |  -  |


## retrieveSources

> SourceResponseData retrieveSources(entitledSources, type)

Returns the available data sources

Retrieves and delivers a comprehensive list of all available `sources`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.VectorData.ApiClient;
import com.factset.sdk.VectorData.ApiException;
import com.factset.sdk.VectorData.Configuration;
import com.factset.sdk.VectorData.auth.*;
import com.factset.sdk.VectorData.models.*;
import com.factset.sdk.VectorData.api.VectorSearchApi;

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

        VectorSearchApi apiInstance = new VectorSearchApi(defaultClient);
        Boolean entitledSources = false; // Boolean | If true, returns only entitled sources. If false, returns all the available sources.
        java.util.List<String> type = Arrays.asList(); // java.util.List<String> | Filters type of sources.
        try {
            SourceResponseData result = apiInstance.retrieveSources(entitledSources, type);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VectorSearchApi#retrieveSources");
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
 **entitledSources** | **Boolean**| If true, returns only entitled sources. If false, returns all the available sources. | [optional] [default to false]
 **type** | **List&lt;String&gt;**| Filters type of sources. | [optional] [enum: News, Filings, Transcripts]

### Return type

[**SourceResponseData**](SourceResponseData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

