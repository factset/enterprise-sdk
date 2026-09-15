# FactSet.SDK.VectorData.Api.IntelligentDocumentServiceApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIdsDocumentUpload**](IntelligentDocumentServiceApi.md#createidsdocumentupload) | **POST** /documents/register | Register a document and receive a presigned upload URL
[**GetIdsDocumentDownload**](IntelligentDocumentServiceApi.md#getidsdocumentdownload) | **POST** /documents/download | Get a presigned URL to download processed document output.
[**GetIdsDocumentStatus**](IntelligentDocumentServiceApi.md#getidsdocumentstatus) | **POST** /documents/status | Retrieve ingestion status for one or more documents.
[**ListAllIdsDocuments**](IntelligentDocumentServiceApi.md#listallidsdocuments) | **GET** /documents/list | List all uploaded documents
[**SearchIdsDocuments**](IntelligentDocumentServiceApi.md#searchidsdocuments) | **POST** /documents/search | Semantically search uploaded documents



<a name="createidsdocumentupload"></a>
# **CreateIdsDocumentUpload**
> IdsDocumentUploadResponse CreateIdsDocumentUpload (IdsDocumentUploadRequest idsDocumentUploadRequest)

Register a document and receive a presigned upload URL

Registers a document for Intelligent Document Service ingestion and returns a document ID plus a short-lived presigned HTTPS URL. PUT the file to that URL, then poll `/documents/status` until the document reaches a terminal state (`success` or `failed`). Supported file types include Pdf, Text, Html, Md and Xml.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class CreateIdsDocumentUploadExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IntelligentDocumentServiceApi(config);

            var idsDocumentUploadRequest = new IdsDocumentUploadRequest(); // IdsDocumentUploadRequest | Document registration request.

            try
            {
                // Register a document and receive a presigned upload URL
                IdsDocumentUploadResponse result = apiInstance.CreateIdsDocumentUpload(idsDocumentUploadRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IntelligentDocumentServiceApi.CreateIdsDocumentUpload: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getidsdocumentdownload"></a>
# **GetIdsDocumentDownload**
> IdsDocumentDownloadResponse GetIdsDocumentDownload (IdsDocumentDownloadRequest idsDocumentDownloadRequest)

Get a presigned URL to download processed document output.

Returns a short-lived presigned HTTPS URL for each requested document so the client can download the processed output JSON. Accepts one or more `documentIDs`. Available only when a document status is `Success` — returns `422` if status is not `Success`, and `202` if the document is still inprogress (`AwaitingUpload` or `Processing`). Prefer polling `/documents/status` until terminal before calling this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class GetIdsDocumentDownloadExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IntelligentDocumentServiceApi(config);

            var idsDocumentDownloadRequest = new IdsDocumentDownloadRequest(); // IdsDocumentDownloadRequest | Document download request.

            try
            {
                // Get a presigned URL to download processed document output.
                IntelligentDocumentServiceApi.GetIdsDocumentDownloadResponseWrapper result = apiInstance.GetIdsDocumentDownload(idsDocumentDownloadRequest);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IntelligentDocumentServiceApi.GetIdsDocumentDownload: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getidsdocumentstatus"></a>
# **GetIdsDocumentStatus**
> IdsDocumentStatusResponse GetIdsDocumentStatus (IdsDocumentStatusRequest idsDocumentStatusRequest)

Retrieve ingestion status for one or more documents.

Returns the current lifecycle state for each requested document ID, including timestamps and any pipeline failure details. Accepts one or more `documentIDs`. Returns `201` when all requested documents are in a terminal state (`Success`or `Failed`), and `202` while any are still in progress (`AwaitingUpload` or`Processing`). Poll until a `201` is received before calling`/documents/download` or `/documents/search`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class GetIdsDocumentStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IntelligentDocumentServiceApi(config);

            var idsDocumentStatusRequest = new IdsDocumentStatusRequest(); // IdsDocumentStatusRequest | Document status request.

            try
            {
                // Retrieve ingestion status for one or more documents.
                IdsDocumentStatusResponse result = apiInstance.GetIdsDocumentStatus(idsDocumentStatusRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IntelligentDocumentServiceApi.GetIdsDocumentStatus: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listallidsdocuments"></a>
# **ListAllIdsDocuments**
> IdsDocumentsListResponse ListAllIdsDocuments (int? paginationLimit = null, int? paginationOffset = null)

List all uploaded documents

Returns a paginated list of all documents uploaded by the authenticated tenant.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class ListAllIdsDocumentsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IntelligentDocumentServiceApi(config);

            var paginationLimit = 10;  // int? | Number of results to return per page. (optional)  (default to 10)
            var paginationOffset = 0;  // int? | Page number of the results to return.  (optional)  (default to 0)

            try
            {
                // List all uploaded documents
                IdsDocumentsListResponse result = apiInstance.ListAllIdsDocuments(paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IntelligentDocumentServiceApi.ListAllIdsDocuments: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 10]
 **paginationOffset** | **int?**| Page number of the results to return.  | [optional] [default to 0]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="searchidsdocuments"></a>
# **SearchIdsDocuments**
> IdsDocumentSearchResponse SearchIdsDocuments (IdsDocumentSearchRequest idsDocumentSearchRequest)

Semantically search uploaded documents

Performs natural-language semantic search across documents ingested through the Intelligent Document Service and returns matching chunks ranked by similarity score. Requires a `query` and one or more `sources`. Optionally restrict results to specific `documentIDs`. Supports offset pagination and sorting by `SimilarityScore`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.VectorData.Api;
using FactSet.SDK.VectorData.Client;
using FactSet.SDK.VectorData.Model;

namespace Example
{
    public class SearchIdsDocumentsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.VectorData.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IntelligentDocumentServiceApi(config);

            var idsDocumentSearchRequest = new IdsDocumentSearchRequest(); // IdsDocumentSearchRequest | Document search request.

            try
            {
                // Semantically search uploaded documents
                IdsDocumentSearchResponse result = apiInstance.SearchIdsDocuments(idsDocumentSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IntelligentDocumentServiceApi.SearchIdsDocuments: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


