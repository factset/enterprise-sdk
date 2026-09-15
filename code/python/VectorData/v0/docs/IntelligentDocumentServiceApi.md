# fds.sdk.VectorData.IntelligentDocumentServiceApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_ids_document_upload**](IntelligentDocumentServiceApi.md#create_ids_document_upload) | **POST** /documents/register | Register a document and receive a presigned upload URL
[**get_ids_document_download**](IntelligentDocumentServiceApi.md#get_ids_document_download) | **POST** /documents/download | Get a presigned URL to download processed document output.
[**get_ids_document_status**](IntelligentDocumentServiceApi.md#get_ids_document_status) | **POST** /documents/status | Retrieve ingestion status for one or more documents.
[**list_all_ids_documents**](IntelligentDocumentServiceApi.md#list_all_ids_documents) | **GET** /documents/list | List all uploaded documents
[**search_ids_documents**](IntelligentDocumentServiceApi.md#search_ids_documents) | **POST** /documents/search | Semantically search uploaded documents



# **create_ids_document_upload**
> IdsDocumentUploadResponse create_ids_document_upload(ids_document_upload_request)

Register a document and receive a presigned upload URL

Registers a document for Intelligent Document Service ingestion and returns a document ID plus a short-lived presigned HTTPS URL. PUT the file to that URL, then poll `/documents/status` until the document reaches a terminal state (`success` or `failed`). Supported file types include Pdf, Text, Html, Md and Xml.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import intelligent_document_service_api
from fds.sdk.VectorData.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VectorData.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VectorData.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VectorData.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = intelligent_document_service_api.IntelligentDocumentServiceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids_document_upload_request = IdsDocumentUploadRequest(
        data=IdsDocumentUploadRequestData(
            file_name="annual-report-2024.pdf",
            file_type="Pdf",
        ),
    ) # IdsDocumentUploadRequest | Document registration request.

    try:
        # Register a document and receive a presigned upload URL
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_ids_document_upload(ids_document_upload_request)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling IntelligentDocumentServiceApi->create_ids_document_upload: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids_document_upload_request** | [**IdsDocumentUploadRequest**](IdsDocumentUploadRequest.md)| Document registration request. |

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
**202** | Document registered. Presigned upload URL returned. |  -  |
**400** | Bad request - malformed syntax or missing required fields. |  -  |
**401** | Unauthenticated - missing or invalid credentials. |  -  |
**403** | Forbidden - authenticated but not authorised. |  -  |
**404** | The specified documentID was not found. |  -  |
**415** | Unsupported Media Type. |  -  |
**422** | Unprocessable Entity - document exists but is not in awaitingUpload status. |  -  |
**429** | Too Many Requests - rate limit exceeded. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ids_document_download**
> IdsDocumentDownloadResponse get_ids_document_download(ids_document_download_request)

Get a presigned URL to download processed document output.

Returns a short-lived presigned HTTPS URL for each requested document so the client can download the processed output JSON. Accepts one or more `documentIDs`. Available only when a document status is `Success` — returns `422` if status is not `Success`, and `202` if the document is still inprogress (`AwaitingUpload` or `Processing`). Prefer polling `/documents/status` until terminal before calling this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import intelligent_document_service_api
from fds.sdk.VectorData.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VectorData.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VectorData.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VectorData.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = intelligent_document_service_api.IntelligentDocumentServiceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids_document_download_request = IdsDocumentDownloadRequest(
        data=IdsDocumentDownloadRequestData(
            document_ids=["0001493152-24-046748-1","0001493152-24-046748-2"],
            request_id="b5cc289f-9cf0-4999-aa23-bfd5f7654113",
        ),
    ) # IdsDocumentDownloadRequest | Document download request.

    try:
        # Get a presigned URL to download processed document output.
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_ids_document_download(ids_document_download_request)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling IntelligentDocumentServiceApi->get_ids_document_download: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids_document_download_request** | [**IdsDocumentDownloadRequest**](IdsDocumentDownloadRequest.md)| Document download request. |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**IdsDocumentDownloadResponse**](IdsDocumentDownloadResponse.md)
- **202**: [**IdsDocumentStatusResponse**](IdsDocumentStatusResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Presigned download URL returned. |  -  |
**202** | Document is still being processed. Poll status before downloading. |  * Location - Path to Batch Request status. <br>  |
**400** | Bad request. |  -  |
**401** | Unauthenticated. |  -  |
**403** | Forbidden. |  -  |
**404** | The specified documentID was not found. |  -  |
**415** | Unsupported Media Type. |  -  |
**422** | Unprocessable Entity - document status is not success; download is only available after successful processing. |  -  |
**429** | Too Many Requests. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ids_document_status**
> IdsDocumentStatusResponse get_ids_document_status(ids_document_status_request)

Retrieve ingestion status for one or more documents.

Returns the current lifecycle state for each requested document ID, including timestamps and any pipeline failure details. Accepts one or more `documentIDs`. Returns `201` when all requested documents are in a terminal state (`Success`or `Failed`), and `202` while any are still in progress (`AwaitingUpload` or`Processing`). Poll until a `201` is received before calling`/documents/download` or `/documents/search`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import intelligent_document_service_api
from fds.sdk.VectorData.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VectorData.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VectorData.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VectorData.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = intelligent_document_service_api.IntelligentDocumentServiceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids_document_status_request = IdsDocumentStatusRequest(
        data=IdsDocumentStatusRequestData(
            document_ids=["0001493152-24-046748-1","0001493152-24-046748-2"],
            request_id="b5cc289f-9cf0-4999-aa23-bfd5f7654113",
        ),
    ) # IdsDocumentStatusRequest | Document status request.

    try:
        # Retrieve ingestion status for one or more documents.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_ids_document_status(ids_document_status_request)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling IntelligentDocumentServiceApi->get_ids_document_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids_document_status_request** | [**IdsDocumentStatusRequest**](IdsDocumentStatusRequest.md)| Document status request. |

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
**201** | Terminal status returned (success or failed). |  * Location - Path to Batch Request status. <br>  |
**202** | Document is still in-progress. Poll again shortly. |  * Location - Path to Batch Request status. <br>  |
**400** | Bad request. |  -  |
**401** | Unauthenticated. |  -  |
**403** | Forbidden. |  -  |
**404** | The specified documentID was not found. |  -  |
**415** | Unsupported Media Type. |  -  |
**422** | Unprocessable Entity. |  -  |
**429** | Too Many Requests. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_all_ids_documents**
> IdsDocumentsListResponse list_all_ids_documents()

List all uploaded documents

Returns a paginated list of all documents uploaded by the authenticated tenant.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import intelligent_document_service_api
from fds.sdk.VectorData.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VectorData.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VectorData.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VectorData.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = intelligent_document_service_api.IntelligentDocumentServiceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 10
    pagination_offset = 0 # int | Page number of the results to return.  (optional) if omitted the server will use the default value of 0

    try:
        # List all uploaded documents
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_all_ids_documents(pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling IntelligentDocumentServiceApi->list_all_ids_documents: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 10
 **pagination_offset** | **int**| Page number of the results to return.  | [optional] if omitted the server will use the default value of 0

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
**200** | Document list returned. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated. |  -  |
**403** | Forbidden. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_ids_documents**
> IdsDocumentSearchResponse search_ids_documents(ids_document_search_request)

Semantically search uploaded documents

Performs natural-language semantic search across documents ingested through the Intelligent Document Service and returns matching chunks ranked by similarity score. Requires a `query` and one or more `sources`. Optionally restrict results to specific `documentIDs`. Supports offset pagination and sorting by `SimilarityScore`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import intelligent_document_service_api
from fds.sdk.VectorData.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VectorData.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VectorData.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VectorData.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = intelligent_document_service_api.IntelligentDocumentServiceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids_document_search_request = IdsDocumentSearchRequest(
        data=IdsDocumentSearchRequestData(
            query="What are companies saying about AI investment and infrastructure?",
            sources=["IdsClient"],
            document_ids=["0001493152-24-046748-1"],
        ),
        meta=IdsDocumentSearchRequestMeta(
            pagination=OffsetPaginationRequest(
                limit=10,
                offset=0,
            ),
            sort=["SimilarityScore"],
        ),
    ) # IdsDocumentSearchRequest | Document search request.

    try:
        # Semantically search uploaded documents
        # example passing only required values which don't have defaults set
        api_response = api_instance.search_ids_documents(ids_document_search_request)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling IntelligentDocumentServiceApi->search_ids_documents: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids_document_search_request** | [**IdsDocumentSearchRequest**](IdsDocumentSearchRequest.md)| Document search request. |

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
**200** | Search results returned, ranked by similarity score. |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated. |  -  |
**403** | Forbidden. |  -  |
**415** | Unsupported Media Type. |  -  |
**422** | Unprocessable Entity. |  -  |
**429** | Too Many Requests. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

