# fds.sdk.RealTimeNews.NewsApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_news_article_get**](NewsApi.md#get_news_article_get) | **GET** /news/article/get | Details for a news article.
[**get_news_article_type_get**](NewsApi.md#get_news_article_type_get) | **GET** /news/article/type/get | Details for a news article type.
[**get_news_article_type_list**](NewsApi.md#get_news_article_type_list) | **GET** /news/article/type/list | List of news article types.
[**get_news_distributor_get**](NewsApi.md#get_news_distributor_get) | **GET** /news/distributor/get | Details of a distributor.
[**get_news_distributor_list**](NewsApi.md#get_news_distributor_list) | **GET** /news/distributor/list | List of distributors.
[**get_news_publisher_get**](NewsApi.md#get_news_publisher_get) | **GET** /news/publisher/get | Details of a publisher.
[**get_news_publisher_list**](NewsApi.md#get_news_publisher_list) | **GET** /news/publisher/list | List of publishers.
[**get_news_publisher_list_by_distributor**](NewsApi.md#get_news_publisher_list_by_distributor) | **GET** /news/publisher/listByDistributor | List of publishers provided by the given distributor.
[**post_news_article_list**](NewsApi.md#post_news_article_list) | **POST** /news/article/list | List of news articles.
[**post_news_article_list_by_chain**](NewsApi.md#post_news_article_list_by_chain) | **POST** /news/article/listByChain | List news articles of an article chain.
[**post_news_article_list_by_index**](NewsApi.md#post_news_article_list_by_index) | **POST** /news/article/listByIndex | News articles for instruments that are constituents of the given indices.
[**post_news_article_list_by_instrument**](NewsApi.md#post_news_article_list_by_instrument) | **POST** /news/article/listByInstrument | News articles for instruments.
[**post_news_article_list_by_media_kind**](NewsApi.md#post_news_article_list_by_media_kind) | **POST** /news/article/listByMediaKind | List news articles which contain media of specific media kinds.
[**post_news_article_search_by_text**](NewsApi.md#post_news_article_search_by_text) | **POST** /news/article/searchByText | Search for news articles using a fulltext search.
[**post_news_publisher_search_by_name**](NewsApi.md#post_news_publisher_search_by_name) | **POST** /news/publisher/searchByName | Search for publishers.



# **get_news_article_get**
> InlineResponse200 get_news_article_get(code)

Details for a news article.

Details for a news article.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    code = "0" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    include_media = False # bool |  (optional) if omitted the server will use the default value of False
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Details for a news article.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_article_get(code, include_media=include_media, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  |
 **include_media** | **bool**|  | [optional] if omitted the server will use the default value of False
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_article_type_get**
> InlineResponse2005 get_news_article_type_get(id)

Details for a news article type.

Details for a news article type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = 3.14 # float | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Details for a news article type.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_article_type_get(id, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_type_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_article_type_list**
> InlineResponse2006 get_news_article_type_list()

List of news article types.

List of news article types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # List of news article types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_article_type_list(attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_distributor_get**
> InlineResponse2007 get_news_distributor_get(id)

Details of a distributor.

Details of a distributor.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = 3.14 # float | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a distributor.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_distributor_get(id, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_distributor_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_distributor_list**
> InlineResponse2008 get_news_distributor_list()

List of distributors.

List of distributors.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = [
        3.14,
    ] # [float] |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of distributors.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_distributor_list(ids=ids, attributes=attributes, sort=sort)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_distributor_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[float]**|  | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_publisher_get**
> InlineResponse2009 get_news_publisher_get(id)

Details of a publisher.

Details of a publisher.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = 3.14 # float | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a publisher.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_publisher_get(id, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_publisher_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_publisher_list**
> InlineResponse20010 get_news_publisher_list()

List of publishers.

List of publishers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = [
        3.14,
    ] # [float] |  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List of publishers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_publisher_list(ids=ids, attributes=attributes, sort=sort, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_publisher_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[float]**|  | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_publisher_list_by_distributor**
> InlineResponse20011 get_news_publisher_list_by_distributor(id)

List of publishers provided by the given distributor.

List of publishers provided by the given distributor.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = 3.14 # float | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of publishers provided by the given distributor.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_publisher_list_by_distributor(id, attributes=attributes, sort=sort)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_publisher_list_by_distributor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_article_list**
> InlineResponse2001 post_news_article_list()

List of news articles.

List of news articles.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_article_list_request = PostNewsArticleListRequest(
        data=PostNewsArticleListRequestData(
            filter=PostNewsArticleListRequestDataFilter(
                range=PostNewsArticleListRequestDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=PostNewsArticleListRequestDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=PostNewsArticleListRequestDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=PostNewsArticleListRequestDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=PostNewsArticleListRequestDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=PostNewsArticleListRequestDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=PostNewsArticleListRequestDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=PostNewsArticleListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=PostNewsArticleListRequestMetaSubscription(
                minimum_interval=0,
            ),
            pagination=PostNewsArticleListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostNewsArticleListRequest | Request Body (optional)

    try:
        # List of news articles.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_news_article_list(post_news_article_list_request=post_news_article_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_article_list_request** | [**PostNewsArticleListRequest**](PostNewsArticleListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_article_list_by_chain**
> InlineResponse2002 post_news_article_list_by_chain(post_news_article_list_by_chain_request)

List news articles of an article chain.

List news articles of an article chain.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_article_list_by_chain_request = PostNewsArticleListByChainRequest(
        data=PostNewsArticleListByChainRequestData(
            id="id_example",
            filter=PostNewsArticleListByChainRequestDataFilter(
                range=PostNewsArticleListRequestDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
            ),
        ),
        meta=PostNewsArticleListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=PostNewsArticleListRequestMetaSubscription(
                minimum_interval=0,
            ),
            pagination=PostNewsArticleListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostNewsArticleListByChainRequest | Request Body

    try:
        # List news articles of an article chain.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_news_article_list_by_chain(post_news_article_list_by_chain_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_chain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_article_list_by_chain_request** | [**PostNewsArticleListByChainRequest**](PostNewsArticleListByChainRequest.md)| Request Body |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_article_list_by_index**
> InlineResponse2003 post_news_article_list_by_index(post_news_article_list_by_index_request)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_article_list_by_index_request = PostNewsArticleListByIndexRequest(
        data=PostNewsArticleListByIndexRequestData(
            identifier=PostNewsArticleListByIndexRequestDataIdentifier(
                values=[
                    "80728880015",
                ],
                type="idNotation",
            ),
            filter=PostNewsArticleListRequestDataFilter(
                range=PostNewsArticleListRequestDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=PostNewsArticleListRequestDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=PostNewsArticleListRequestDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=PostNewsArticleListRequestDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=PostNewsArticleListRequestDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=PostNewsArticleListRequestDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=PostNewsArticleListRequestDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=PostNewsArticleListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=PostNewsArticleListRequestMetaSubscription(
                minimum_interval=0,
            ),
            pagination=PostNewsArticleListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostNewsArticleListByIndexRequest | Request Body

    try:
        # News articles for instruments that are constituents of the given indices.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_news_article_list_by_index(post_news_article_list_by_index_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_index: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_article_list_by_index_request** | [**PostNewsArticleListByIndexRequest**](PostNewsArticleListByIndexRequest.md)| Request Body |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_article_list_by_instrument**
> InlineResponse2004 post_news_article_list_by_instrument(post_news_article_list_by_instrument_request)

News articles for instruments.

News articles for instruments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_article_list_by_instrument_request = PostNewsArticleListByInstrumentRequest(
        data=PostNewsArticleListByInstrumentRequestData(
            identifier=PostNewsArticleListByInstrumentRequestDataIdentifier(
                values=[
                    "PQ6ZGC",
                ],
                type="idInstrument",
            ),
            filter=PostNewsArticleListRequestDataFilter(
                range=PostNewsArticleListRequestDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=PostNewsArticleListRequestDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=PostNewsArticleListRequestDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=PostNewsArticleListRequestDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=PostNewsArticleListRequestDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=PostNewsArticleListRequestDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=PostNewsArticleListRequestDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=PostNewsArticleListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=PostNewsArticleListRequestMetaSubscription(
                minimum_interval=0,
            ),
            pagination=PostNewsArticleListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostNewsArticleListByInstrumentRequest | Request Body

    try:
        # News articles for instruments.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_news_article_list_by_instrument(post_news_article_list_by_instrument_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_article_list_by_instrument_request** | [**PostNewsArticleListByInstrumentRequest**](PostNewsArticleListByInstrumentRequest.md)| Request Body |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_article_list_by_media_kind**
> InlineResponse2001 post_news_article_list_by_media_kind(post_news_article_list_by_media_kind_request)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_article_list_by_media_kind_request = PostNewsArticleListByMediaKindRequest(
        data=PostNewsArticleListByMediaKindRequestData(
            ids=[
                3.14,
            ],
            filter=PostNewsArticleListRequestDataFilter(
                range=PostNewsArticleListRequestDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=PostNewsArticleListRequestDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=PostNewsArticleListRequestDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=PostNewsArticleListRequestDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=PostNewsArticleListRequestDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=PostNewsArticleListRequestDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=PostNewsArticleListRequestDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=PostNewsArticleListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=PostNewsArticleListRequestMetaSubscription(
                minimum_interval=0,
            ),
            pagination=PostNewsArticleListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostNewsArticleListByMediaKindRequest | Request Body

    try:
        # List news articles which contain media of specific media kinds.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_news_article_list_by_media_kind(post_news_article_list_by_media_kind_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_media_kind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_article_list_by_media_kind_request** | [**PostNewsArticleListByMediaKindRequest**](PostNewsArticleListByMediaKindRequest.md)| Request Body |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_article_search_by_text**
> InlineResponse2001 post_news_article_search_by_text()

Search for news articles using a fulltext search.

Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \"include\" requires the criterion to evaluate to true, \"exclude\" requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_article_search_by_text_request = PostNewsArticleSearchByTextRequest(
        data=PostNewsArticleSearchByTextRequestData(
            text=PostNewsArticleSearchByTextRequestDataText(
                criteria=PostNewsArticleSearchByTextRequestDataTextCriteria(
                    selection_type="include",
                    phrases=[
                        "phrases_example",
                    ],
                    minimum_match_score=0.7,
                    scope="all",
                ),
            ),
            criteria=[
                PostNewsArticleSearchByTextRequestDataCriteria(
                    selection_type="include",
                    range=PostNewsArticleListRequestDataFilterRange(
                        start="start_example",
                        end="end_example",
                    ),
                    indices=PostNewsArticleSearchByTextRequestDataIndices(
                        ids=[
                            "ids_example",
                        ],
                    ),
                    instruments=PostNewsArticleSearchByTextRequestDataInstruments(
                        ids=[
                            "ids_example",
                        ],
                    ),
                    types=PostNewsArticleSearchByTextRequestDataTypes(
                        ids=[
                            3.14,
                        ],
                    ),
                    categories=PostNewsArticleSearchByTextRequestDataCategories(
                        ids=[
                            3.14,
                        ],
                    ),
                    regions=PostNewsArticleSearchByTextRequestDataRegions(
                        ids=[
                            3.14,
                        ],
                    ),
                    distributor=PostNewsArticleSearchByTextRequestDataDistributor(
                        ids=[
                            3.14,
                        ],
                    ),
                    publisher=PostNewsArticleSearchByTextRequestDataPublisher(
                        ids=[
                            3.14,
                        ],
                    ),
                    language=PostNewsArticleSearchByTextRequestDataLanguage(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ],
        ),
        meta=PostNewsArticleListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=PostNewsArticleListRequestMetaSubscription(
                minimum_interval=0,
            ),
            pagination=PostNewsArticleListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostNewsArticleSearchByTextRequest | Request Body (optional)

    try:
        # Search for news articles using a fulltext search.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_news_article_search_by_text(post_news_article_search_by_text_request=post_news_article_search_by_text_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_search_by_text: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_article_search_by_text_request** | [**PostNewsArticleSearchByTextRequest**](PostNewsArticleSearchByTextRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_news_publisher_search_by_name**
> InlineResponse20011 post_news_publisher_search_by_name(post_news_publisher_search_by_name_request)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_news_publisher_search_by_name_request = PostNewsPublisherSearchByNameRequest(
        data=PostNewsPublisherSearchByNameRequestData(
            search_value="search_value_example",
            match_type="begins",
            filter=PostNewsPublisherSearchByNameRequestDataFilter(
                distributor=PostNewsPublisherSearchByNameRequestDataFilterDistributor(
                    id=3.14,
                ),
                delivery=PostNewsPublisherSearchByNameRequestDataFilterDelivery(
                    id=3.14,
                ),
            ),
        ),
        meta=PostNewsPublisherSearchByNameRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            sort=["name"],
        ),
    ) # PostNewsPublisherSearchByNameRequest | Request Body

    try:
        # Search for publishers.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_news_publisher_search_by_name(post_news_publisher_search_by_name_request)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->post_news_publisher_search_by_name: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_news_publisher_search_by_name_request** | [**PostNewsPublisherSearchByNameRequest**](PostNewsPublisherSearchByNameRequest.md)| Request Body |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

