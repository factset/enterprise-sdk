# fds.sdk.VectorData.VectorApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_count**](VectorApi.md#get_count) | **GET** /chunk-text | Returns chunked text for the given vectorId.
[**post_vector**](VectorApi.md#post_vector) | **POST** /data | Return vector information based on the input parameters below



# **get_count**
> ChunkTextResponse get_count(vector_id)

Returns chunked text for the given vectorId.

Returns content and link of provided vector id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import vector_api
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
    api_instance = vector_api.VectorApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    vector_id = ["0001493152-24-046748-1_0001493152-24-046748-1_text_236_0"] # [str] | Unique identifier for a document
    pagination_limit = 20 # int | Number of results to return per page. (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Page number of the results to return.  (optional) if omitted the server will use the default value of 0

    try:
        # Returns chunked text for the given vectorId.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_count(vector_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling VectorApi->get_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_id** | **[str]**| Unique identifier for a document |
 **pagination_limit** | **int**| Number of results to return per page. | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Page number of the results to return.  | [optional] if omitted the server will use the default value of 0

### Return type

[**ChunkTextResponse**](ChunkTextResponse.md)

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
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_vector**
> VectorDataResponse post_vector()

Return vector information based on the input parameters below

Returns the vector information.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VectorData
from fds.sdk.VectorData.api import vector_api
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
    api_instance = vector_api.VectorApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    vector_data_request = VectorDataRequest(
        data=VectorDataRequestData(
            query="Updates",
            start_date=dateutil_parser('Fri Dec 22 00:00:00 UTC 2023').date(),
            end_date=dateutil_parser('Sat Dec 23 00:00:00 UTC 2023').date(),
            esg_theme=["Workplace Diversity","Accessible Food"],
            search_concept=["Consumer Spending","Regulatory Change"],
            sentiment=["Neutral","Negative"],
            document_types=["10-K","10-Q","8-K","News","Transcripts"],
            sources=["EDG","FCST","SA"],
            trimmed=False,
            ids=[
                "ids_example",
            ],
        ),
        meta=Meta(
            number_of_results=10,
        ),
    ) # VectorDataRequest | Input parameters for vector data. (optional)

    try:
        # Return vector information based on the input parameters below
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_vector(vector_data_request=vector_data_request)

        pprint(api_response)

    except fds.sdk.VectorData.ApiException as e:
        print("Exception when calling VectorApi->post_vector: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_data_request** | [**VectorDataRequest**](VectorDataRequest.md)| Input parameters for vector data. | [optional]

### Return type

[**VectorDataResponse**](VectorDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns vector data |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

