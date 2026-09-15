# IntelligentDocumentServiceApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdsDocumentUpload**](IntelligentDocumentServiceApi.md#createIdsDocumentUpload) | **POST** /documents/register | Register a document and receive a presigned upload URL
[**getIdsDocumentDownload**](IntelligentDocumentServiceApi.md#getIdsDocumentDownload) | **POST** /documents/download | Get a presigned URL to download processed document output.
[**getIdsDocumentStatus**](IntelligentDocumentServiceApi.md#getIdsDocumentStatus) | **POST** /documents/status | Retrieve ingestion status for one or more documents.
[**listAllIdsDocuments**](IntelligentDocumentServiceApi.md#listAllIdsDocuments) | **GET** /documents/list | List all uploaded documents
[**searchIdsDocuments**](IntelligentDocumentServiceApi.md#searchIdsDocuments) | **POST** /documents/search | Semantically search uploaded documents



## createIdsDocumentUpload

> IdsDocumentUploadResponse createIdsDocumentUpload(idsDocumentUploadRequest)

Register a document and receive a presigned upload URL

Registers a document for Intelligent Document Service ingestion and returns a document ID plus a short-lived presigned HTTPS URL. PUT the file to that URL, then poll `/documents/status` until the document reaches a terminal state (`success` or `failed`). Supported file types include Pdf, Text, Html, Md and Xml.

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
import com.factset.sdk.VectorData.api.IntelligentDocumentServiceApi;

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

        IntelligentDocumentServiceApi apiInstance = new IntelligentDocumentServiceApi(defaultClient);
        IdsDocumentUploadRequest idsDocumentUploadRequest = new IdsDocumentUploadRequest(); // IdsDocumentUploadRequest | Document registration request.
        try {
            IdsDocumentUploadResponse result = apiInstance.createIdsDocumentUpload(idsDocumentUploadRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IntelligentDocumentServiceApi#createIdsDocumentUpload");
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
 **idsDocumentUploadRequest** | [**IdsDocumentUploadRequest**](IdsDocumentUploadRequest.md)| Document registration request. |

### Return type

[**IdsDocumentUploadResponse**](IdsDocumentUploadResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Document registered. Presigned upload URL returned. |  -  |
| **400** | Bad request - malformed syntax or missing required fields. |  -  |
| **401** | Unauthenticated - missing or invalid credentials. |  -  |
| **403** | Forbidden - authenticated but not authorised. |  -  |
| **404** | The specified documentID was not found. |  -  |
| **415** | Unsupported Media Type. |  -  |
| **422** | Unprocessable Entity - document exists but is not in awaitingUpload status. |  -  |
| **429** | Too Many Requests - rate limit exceeded. |  -  |
| **500** | Internal Server Error. |  -  |


## getIdsDocumentDownload

> GetIdsDocumentDownloadResponseWrapper getIdsDocumentDownload(idsDocumentDownloadRequest)

Get a presigned URL to download processed document output.

Returns a short-lived presigned HTTPS URL for each requested document so the client can download the processed output JSON. Accepts one or more `documentIDs`. Available only when a document status is `Success` — returns `422` if status is not `Success`, and `202` if the document is still inprogress (`AwaitingUpload` or `Processing`). Prefer polling `/documents/status` until terminal before calling this endpoint.

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
import com.factset.sdk.VectorData.api.IntelligentDocumentServiceApi;
import com.factset.sdk.VectorData.api.IntelligentDocumentServiceApi.GetIdsDocumentDownloadResponseWrapper;

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

        IntelligentDocumentServiceApi apiInstance = new IntelligentDocumentServiceApi(defaultClient);
        IdsDocumentDownloadRequest idsDocumentDownloadRequest = new IdsDocumentDownloadRequest(); // IdsDocumentDownloadRequest | Document download request.
        try {
            GetIdsDocumentDownloadResponseWrapper result = apiInstance.getIdsDocumentDownload(idsDocumentDownloadRequest);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // IdsDocumentDownloadResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // IdsDocumentStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling IntelligentDocumentServiceApi#getIdsDocumentDownload");
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
 **idsDocumentDownloadRequest** | [**IdsDocumentDownloadRequest**](IdsDocumentDownloadRequest.md)| Document download request. |

### Return type

GetIdsDocumentDownloadResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Presigned download URL returned. |  -  |
| **202** | Document is still being processed. Poll status before downloading. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated. |  -  |
| **403** | Forbidden. |  -  |
| **404** | The specified documentID was not found. |  -  |
| **415** | Unsupported Media Type. |  -  |
| **422** | Unprocessable Entity - document status is not success; download is only available after successful processing. |  -  |
| **429** | Too Many Requests. |  -  |
| **500** | Internal Server Error. |  -  |


## getIdsDocumentStatus

> IdsDocumentStatusResponse getIdsDocumentStatus(idsDocumentStatusRequest)

Retrieve ingestion status for one or more documents.

Returns the current lifecycle state for each requested document ID, including timestamps and any pipeline failure details. Accepts one or more `documentIDs`. Returns `201` when all requested documents are in a terminal state (`Success`or `Failed`), and `202` while any are still in progress (`AwaitingUpload` or`Processing`). Poll until a `201` is received before calling`/documents/download` or `/documents/search`.

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
import com.factset.sdk.VectorData.api.IntelligentDocumentServiceApi;

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

        IntelligentDocumentServiceApi apiInstance = new IntelligentDocumentServiceApi(defaultClient);
        IdsDocumentStatusRequest idsDocumentStatusRequest = new IdsDocumentStatusRequest(); // IdsDocumentStatusRequest | Document status request.
        try {
            IdsDocumentStatusResponse result = apiInstance.getIdsDocumentStatus(idsDocumentStatusRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IntelligentDocumentServiceApi#getIdsDocumentStatus");
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
 **idsDocumentStatusRequest** | [**IdsDocumentStatusRequest**](IdsDocumentStatusRequest.md)| Document status request. |

### Return type

[**IdsDocumentStatusResponse**](IdsDocumentStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Terminal status returned (success or failed). |  * Location - Path to Batch Request status. <br>  |
| **202** | Document is still in-progress. Poll again shortly. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated. |  -  |
| **403** | Forbidden. |  -  |
| **404** | The specified documentID was not found. |  -  |
| **415** | Unsupported Media Type. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **429** | Too Many Requests. |  -  |
| **500** | Internal Server Error. |  -  |


## listAllIdsDocuments

> IdsDocumentsListResponse listAllIdsDocuments(paginationLimit, paginationOffset)

List all uploaded documents

Returns a paginated list of all documents uploaded by the authenticated tenant.

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
import com.factset.sdk.VectorData.api.IntelligentDocumentServiceApi;

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

        IntelligentDocumentServiceApi apiInstance = new IntelligentDocumentServiceApi(defaultClient);
        Integer paginationLimit = 10; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return. 
        try {
            IdsDocumentsListResponse result = apiInstance.listAllIdsDocuments(paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IntelligentDocumentServiceApi#listAllIdsDocuments");
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
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 10]
 **paginationOffset** | **Integer**| Page number of the results to return.  | [optional] [default to 0]

### Return type

[**IdsDocumentsListResponse**](IdsDocumentsListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Document list returned. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal Server Error. |  -  |


## searchIdsDocuments

> IdsDocumentSearchResponse searchIdsDocuments(idsDocumentSearchRequest)

Semantically search uploaded documents

Performs natural-language semantic search across documents ingested through the Intelligent Document Service and returns matching chunks ranked by similarity score. Requires a `query` and one or more `sources`. Optionally restrict results to specific `documentIDs`. Supports offset pagination and sorting by `SimilarityScore`.

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
import com.factset.sdk.VectorData.api.IntelligentDocumentServiceApi;

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

        IntelligentDocumentServiceApi apiInstance = new IntelligentDocumentServiceApi(defaultClient);
        IdsDocumentSearchRequest idsDocumentSearchRequest = new IdsDocumentSearchRequest(); // IdsDocumentSearchRequest | Document search request.
        try {
            IdsDocumentSearchResponse result = apiInstance.searchIdsDocuments(idsDocumentSearchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IntelligentDocumentServiceApi#searchIdsDocuments");
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
 **idsDocumentSearchRequest** | [**IdsDocumentSearchRequest**](IdsDocumentSearchRequest.md)| Document search request. |

### Return type

[**IdsDocumentSearchResponse**](IdsDocumentSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search results returned, ranked by similarity score. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated. |  -  |
| **403** | Forbidden. |  -  |
| **415** | Unsupported Media Type. |  -  |
| **422** | Unprocessable Entity. |  -  |
| **429** | Too Many Requests. |  -  |
| **500** | Internal Server Error. |  -  |

