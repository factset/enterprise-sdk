# fds.sdk.AnalyticsDatastore.DocumentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_documents_end_point**](DocumentsApi.md#get_documents_end_point) | **POST** /analytics/pub-datastore/tag-search/v1/documents/search | Gets a list of Documents that a user has access to.
[**get_product_types**](DocumentsApi.md#get_product_types) | **POST** /analytics/pub-datastore/tag-search/v1/product-types/search | Gets a list of product types that a user has access to.
[**get_single_tag_end_point**](DocumentsApi.md#get_single_tag_end_point) | **GET** /analytics/pub-datastore/tag-search/v1/tags/{name} | Get a single tag definition based on its name
[**get_tag_values_end_point**](DocumentsApi.md#get_tag_values_end_point) | **POST** /analytics/pub-datastore/tag-search/v1/tags/{name}/values | Gets a list of tag values for the given name
[**get_tags_end_point**](DocumentsApi.md#get_tags_end_point) | **GET** /analytics/pub-datastore/tag-search/v1/tags | Gets a list of tag definitions for the user.



# **get_documents_end_point**
> DocumentListResponse get_documents_end_point(document_request)

Gets a list of Documents that a user has access to.

Retrieves metadata around documents stored in the Analytics Datastore Service. Each Document will have a 'url' property which will act as a re-direct to the underlying document data    This end point supports pagination and filtering through the use of the request body listed below.    To discover what tags are available to filter on, see GET /tags and GET /tags/{name}/values to retrieve these filter values.    Similarly, to discover what product types are available to filter on, see POST /product-types/search to retrieve a list of product types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import documents_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = documents_api.DocumentsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    document_request = DocumentRequest(
        meta=MetaRequestModel(
            pagination=MetaRequestModelPagination(
                offset=0,
                limit=10,
            ),
        ),
        data=DocumentRequestData(
            path="Client:/Publisher/TEST_ACCOUNT.ACCT",
            product_type="Publisher",
            tags={
                "key": "key_example",
            },
        ),
    ) # DocumentRequest | Example request of a filtered Documents search call

    try:
        # Gets a list of Documents that a user has access to.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_documents_end_point(document_request)

        pprint(api_response)

    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling DocumentsApi->get_documents_end_point: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_request** | [**DocumentRequest**](DocumentRequest.md)| Example request of a filtered Documents search call |

### Return type

[**DocumentListResponse**](DocumentListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, a list of documents the user has access to. |  -  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_product_types**
> ProductTypeListResponse get_product_types(tag_filter_model)

Gets a list of product types that a user has access to.

Retrieves a list of product types that have been specified across all documents the user has access to

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import documents_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = documents_api.DocumentsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tag_filter_model = TagFilterModel(
        meta=MetaRequestModel(
            pagination=MetaRequestModelPagination(
                offset=0,
                limit=10,
            ),
        ),
        data=TagFilterModelData(
            tags={
                "key": "key_example",
            },
        ),
    ) # TagFilterModel | Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object.

    try:
        # Gets a list of product types that a user has access to.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_product_types(tag_filter_model)

        pprint(api_response)

    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling DocumentsApi->get_product_types: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag_filter_model** | [**TagFilterModel**](TagFilterModel.md)| Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. |

### Return type

[**ProductTypeListResponse**](ProductTypeListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, a list of product types the user has access to. |  -  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_single_tag_end_point**
> TagResponse get_single_tag_end_point(name)

Get a single tag definition based on its name

Retrieve a tag definition based on its name

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import documents_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = documents_api.DocumentsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    name = "name_example" # str | The name of the tag

    try:
        # Get a single tag definition based on its name
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_single_tag_end_point(name)

        pprint(api_response)

    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling DocumentsApi->get_single_tag_end_point: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the tag |

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns the tag requested |  -  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tag_values_end_point**
> TagValuesListResponse get_tag_values_end_point(name, tag_filter_model)

Gets a list of tag values for the given name

Returns a list of tag values depending on the name provided. Supports filtering on additional tag name value pairs, which operates as an 'AND' where the Document must have the tag name specified in the path AND the filtered parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import documents_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = documents_api.DocumentsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    name = "name_example" # str | The name of the tag
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tag_filter_model = TagFilterModel(
        meta=MetaRequestModel(
            pagination=MetaRequestModelPagination(
                offset=0,
                limit=10,
            ),
        ),
        data=TagFilterModelData(
            tags={
                "key": "key_example",
            },
        ),
    ) # TagFilterModel | Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object.

    try:
        # Gets a list of tag values for the given name
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_tag_values_end_point(name, tag_filter_model)

        pprint(api_response)

    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling DocumentsApi->get_tag_values_end_point: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the tag |
 **tag_filter_model** | [**TagFilterModel**](TagFilterModel.md)| Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. |

### Return type

[**TagValuesListResponse**](TagValuesListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns a list of tag definitions the user has access to. |  -  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tags_end_point**
> TagListResponse get_tags_end_point()

Gets a list of tag definitions for the user.

Tag definitions consist of a name and a type. Use this end point to see a list of pre-existing tags that can be used to filter on the Documents end point.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import documents_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = documents_api.DocumentsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | The offset integer on where to begin paginating (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 50 # int | The limit of records to return when paginating (optional) if omitted the server will use the default value of 50

    try:
        # Gets a list of tag definitions for the user.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_tags_end_point(pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling DocumentsApi->get_tags_end_point: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_offset** | **int**| The offset integer on where to begin paginating | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **int**| The limit of records to return when paginating | [optional] if omitted the server will use the default value of 50

### Return type

[**TagListResponse**](TagListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns a list of tag definitions the user has access to. |  -  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

