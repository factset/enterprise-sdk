# fds.sdk.VectorData.VectorSearchApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_form_types**](VectorSearchApi.md#get_form_types) | **GET** /form-types | Returns the available form types
[**get_vector**](VectorSearchApi.md#get_vector) | **GET** /vector | Returns vector data and metadata for specified vector IDs
[**post_search**](VectorSearchApi.md#post_search) | **POST** /search | Perform semantic search and return ranked results with similarity scores
[**retrieve_sources**](VectorSearchApi.md#retrieve_sources) | **GET** /sources | Returns the available data sources



# **get_form_types**
> FormTypesResponse get_form_types()

Returns the available form types

Retrieves and delivers a comprehensive list of all available `formTypes`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import vector_search_api
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
    api_instance = vector_search_api.VectorSearchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Returns the available form types
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_form_types()

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling VectorSearchApi->get_form_types: %s\n" % e)
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
**200** | Success |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vector**
> VectorResponse get_vector(vector_id)

Returns vector data and metadata for specified vector IDs

Retrieves the complete vector embedding and all associated metadata for one or more vector IDs. Optionally returns trimmed vectors (metadata only) when the trimmed parameter is set to true.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import vector_search_api
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
    api_instance = vector_search_api.VectorSearchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    vector_id = ["0001493152-24-046748-1_0001493152-24-046748-1_text_236_0"] # [str] | Unique identifier for a document
    trimmed = False # bool | If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. (optional) if omitted the server will use the default value of False
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 10
    pagination_offset = 0 # int | Page number of the results to return.  (optional) if omitted the server will use the default value of 0

    try:
        # Returns vector data and metadata for specified vector IDs
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_vector(vector_id, trimmed=trimmed, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling VectorSearchApi->get_vector: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_id** | **[str]**| Unique identifier for a document |
 **trimmed** | **bool**| If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. | [optional] if omitted the server will use the default value of False
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 10
 **pagination_offset** | **int**| Page number of the results to return.  | [optional] if omitted the server will use the default value of 0

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
**200** | Success |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity. Validation failed for one or more request parameters or body fields. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_search**
> SearchResponse post_search(search_request)

Perform semantic search and return ranked results with similarity scores

Performs semantic search across vectorized financial documents and returns results ranked by similarity score. Supports filtering by themes (including ESG themes and search concepts), sentiment, form types, date ranges, and entity identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import vector_search_api
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
    api_instance = vector_search_api.VectorSearchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    search_request = SearchRequest(
        data=SearchRequestData(
            query="What are companies saying about AI investment and infrastructure?",
            start_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
            end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2024').date(),
            form_types=["10-K","10-Q","8-K"],
            sources=["EDG","FCST","SA","MTN"],
            ids=["AAPL-US","MSFT-US"],
            results_by_source=False,
        ),
        meta=SearchRequestMeta(
            pagination=SearchRequestMetaPagination(
                limit=10,
                offset=0,
            ),
            sort=[
                "similarityScore",
            ],
        ),
    ) # SearchRequest | Input parameters for semantic search.

    try:
        # Perform semantic search and return ranked results with similarity scores
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_search(search_request)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling VectorSearchApi->post_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_request** | [**SearchRequest**](SearchRequest.md)| Input parameters for semantic search. |

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
**200** | Returns search results with similarity scores |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**422** | Unprocessable Entity. Validation failed for one or more request parameters or body fields. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_sources**
> SourceResponseData retrieve_sources()

Returns the available data sources

Retrieves and delivers a comprehensive list of all available `sources`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import vector_search_api
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
    api_instance = vector_search_api.VectorSearchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    entitled_sources = False # bool | If true, returns only entitled sources. If false, returns all the available sources. (optional) if omitted the server will use the default value of False
    type = [
        "News",
    ] # [str] | Filters type of sources. (optional)

    try:
        # Returns the available data sources
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.retrieve_sources(entitled_sources=entitled_sources, type=type)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling VectorSearchApi->retrieve_sources: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entitled_sources** | **bool**| If true, returns only entitled sources. If false, returns all the available sources. | [optional] if omitted the server will use the default value of False
 **type** | **[str]**| Filters type of sources. | [optional]

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
**200** | Success |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

