# fds.sdk.FactSetFunds.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_content_set**](ScreeningOperationsApi.md#create_content_set) | **POST** /factset-funds/v1/screener/content-sets/create | Create a new custom content set with required fields from the default content sets.
[**delete_content_set**](ScreeningOperationsApi.md#delete_content_set) | **DELETE** /factset-funds/v1/screener/content-sets/{name} | Delete a custom content set.
[**get_content_sets**](ScreeningOperationsApi.md#get_content_sets) | **GET** /factset-funds/v1/screener/content-sets | Get the content sets that are permissioned for the user.
[**get_distinct_count**](ScreeningOperationsApi.md#get_distinct_count) | **POST** /factset-funds/v1/screener/distinct-count | Returns the number of records for a given field spread across all possible values.
[**get_fields**](ScreeningOperationsApi.md#get_fields) | **GET** /factset-funds/v1/screener/fields | Get the list of fields available for given content set.
[**get_screener_data**](ScreeningOperationsApi.md#get_screener_data) | **POST** /factset-funds/v1/screener/search | Returns all the records that match the given criteria.
[**get_statistics**](ScreeningOperationsApi.md#get_statistics) | **POST** /factset-funds/v1/screener/statistics | Returns the statistics and histogram data for a given field within the specified content sets.



# **create_content_set**
> CreateContentSetResponse create_content_set(create_content_set_request)

Create a new custom content set with required fields from the default content sets.

Create a custom content set with the required set of fields. These fields are taken from the default content sets provided in the request.  The name for a custom content-set must be unique. The list of displayNames within each custom content-set must also be unique. Display names can be used as fieldName in other endpoints to perform screening operations.  The `/screener/content-sets` and `/screener/fields` endpoints provide the authoritative lists of available content sets and fields. Use these endpoints to construct custom content sets and ensure that all content set names and displayName values are unique. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    create_content_set_request = CreateContentSetRequest(
        data=CreateContentSetRequestBody(
            name="my-content-set",
            description="Custom content set for my user",
            content_sets=CustomContentSets([
                CustomContentSetItem(
                    content_set="Factset Fundamentals",
                    fields=[
                        CreateRequestFieldObject(
                            field_name="FF_SALES",
                            display_name="Sales",
                        ),
                    ],
                ),
            ]),
        ),
    ) # CreateContentSetRequest | Request object for create content-set endpoint.

    try:
        # Create a new custom content set with required fields from the default content sets.
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_content_set(create_content_set_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->create_content_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_content_set_request** | [**CreateContentSetRequest**](CreateContentSetRequest.md)| Request object for create content-set endpoint. |

### Return type

[**CreateContentSetResponse**](CreateContentSetResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Response object for create content-set endpoint. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_content_set**
> delete_content_set(name)

Delete a custom content set.

Delete a custom content set by providing the content set name.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    name = "my-content-set" # str | The name of the content set to be deleted.

    try:
        # Delete a custom content set.
        # example passing only required values which don't have defaults set
        api_instance.delete_content_set(name)


    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->delete_content_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the content set to be deleted. |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The content set has been deleted successfully. |  -  |
**400** | Bad Request occurs when the content set name is not provided or is invalid. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_content_sets**
> ContentSetsResponse get_content_sets()

Get the content sets that are permissioned for the user.

Gets the content sets that are permissioned for the user. for example: `Factset Fundamentals`, `Factset Funds`, etc. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get the content sets that are permissioned for the user.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_content_sets()

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_content_sets: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentSetsResponse**](ContentSetsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The content-sets response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_distinct_count**
> DistinctCountResponse get_distinct_count(distinct_count_request)

Returns the number of records for a given field spread across all possible values.

Returns the number of records for a given field spread across all possible values that match the given criteria. Only string fields are supported. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    distinct_count_request = DistinctCountRequest(
        data=DistinctCountRequestBody(
            content_set="Factset Fundamentals",
            field_name="Company Name",
            join_type=JoinType("AND"),
            filters=[
                Filter(
                    join_type=JoinType("AND"),
                    criteria=[
                        Criterion(
                            field_name="Company Name",
                            operator=Operator("EQ"),
                            values=["Apple Inc."],
                        ),
                    ],
                ),
            ],
        ),
        meta=DistinctCountMeta(
            pagination=MetaPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # DistinctCountRequest | Request object for `distinct-count`.

    try:
        # Returns the number of records for a given field spread across all possible values.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_distinct_count(distinct_count_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_distinct_count: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distinct_count_request** | [**DistinctCountRequest**](DistinctCountRequest.md)| Request object for &#x60;distinct-count&#x60;. |

### Return type

[**DistinctCountResponse**](DistinctCountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for distinct-count. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fields**
> FieldsResponse get_fields(content_sets)

Get the list of fields available for given content set.

Gets the list of fields available for a given content set (or combination of content sets). For example: `Factset Fundamentals`, `Factset Funds`, etc.  Both default and custom content sets are supported. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    content_sets = ["Factset Fundamentals"] # [str] | The content sets from which the fields are requested. For example: `Factset Fundamentals`,  `Factset Funds`, etc. 

    try:
        # Get the list of fields available for given content set.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fields(content_sets)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_fields: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content_sets** | **[str]**| The content sets from which the fields are requested. For example: &#x60;Factset Fundamentals&#x60;,  &#x60;Factset Funds&#x60;, etc.  |

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Fields response object for the given content set(s). |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_screener_data**
> SearchResponse get_screener_data(search_request)

Returns all the records that match the given criteria.

Returns the records that match the given criteria. The request object for `Search` allows the user to get back data for fields of their choosing. Along with the fields requested, a unique identifier such as the ticker symbol will be returned in the response.  Custom search of fields actually uses `displayName`. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    search_request = SearchRequest(
        data=SearchRequestBody(
            content_sets=SearchContentSets([
                ContentSetItem(
                    content_set="Factset Fundamentals",
                    fields=[
                        "Company Name",
                    ],
                ),
            ]),
            filters=[
                SearchFilter(
                    join_type=JoinType("AND"),
                    criteria=[
                        SearchCriterion(
                            content_set="Factset Fundamentals",
                            field_name="Company Name",
                            operator=Operator("EQ"),
                            values=["Apple Inc."],
                        ),
                    ],
                ),
            ],
            join_type=JoinType("AND"),
        ),
        meta=Meta(
            sort=[
                "sort_example",
            ],
            pagination=MetaPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # SearchRequest | Request object for `Search`.

    try:
        # Returns all the records that match the given criteria.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_screener_data(search_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_screener_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_request** | [**SearchRequest**](SearchRequest.md)| Request object for &#x60;Search&#x60;. |

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
**200** | Response object for search endpoint. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_statistics**
> StatisticsResponse get_statistics(statistics_request)

Returns the statistics and histogram data for a given field within the specified content sets.

Returns the statistics for a given field within the specified content sets. Only numerical fields are supported. If histogram flag is set to true, histogram data is also returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import screening_operations_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    statistics_request = StatisticsRequest(
        data=StatisticsRequestBody(
            content_set="Factset Fundamentals",
            field_name="Company Name",
            histogram=True,
            join_type=JoinType("AND"),
            filters=[
                Filter(
                    join_type=JoinType("AND"),
                    criteria=[
                        Criterion(
                            field_name="Company Name",
                            operator=Operator("EQ"),
                            values=["Apple Inc."],
                        ),
                    ],
                ),
            ],
        ),
    ) # StatisticsRequest | Request object for `Statistics`.

    try:
        # Returns the statistics and histogram data for a given field within the specified content sets.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_statistics(statistics_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_statistics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statistics_request** | [**StatisticsRequest**](StatisticsRequest.md)| Request object for &#x60;Statistics&#x60;. |

### Return type

[**StatisticsResponse**](StatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for statistics. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

