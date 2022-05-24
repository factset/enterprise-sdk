# fds.sdk.NewsAPIforDigitalPortals.NewsApi

All URIs are relative to *https://api.factset.com/wealth/v1*

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

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response200 import InlineResponse200
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    code = "0" # str | Identifier of a news article.
    include_media = False # bool | If true, media references are included if available. (optional) (default to False)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Details for a news article.
        api_response = api_instance.get_news_article_get(code, include_media=include_media, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Identifier of a news article. |
 **include_media** | **bool**| If true, media references are included if available. | [optional] if omitted the server will use the default value of False
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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
> InlineResponse2003 get_news_article_type_get(id)

Details for a news article type.

Details for a news article type.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    id = 3.14 # float | Identifier of a news article type.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Details for a news article type.
        api_response = api_instance.get_news_article_type_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_type_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a news article type. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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
> InlineResponse2004 get_news_article_type_list()

List of news article types.

List of news article types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2004 import InlineResponse2004
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of news article types.
        api_response = api_instance.get_news_article_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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
> InlineResponse2005 get_news_distributor_get(id)

Details of a distributor.

Details of a distributor.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2005 import InlineResponse2005
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    id = 3.14 # float | Identifier of a distributor.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a distributor.
        api_response = api_instance.get_news_distributor_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_distributor_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a distributor. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **get_news_distributor_list**
> InlineResponse2006 get_news_distributor_list()

List of distributors.

List of distributors.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2006 import InlineResponse2006
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    ids = [
        3.14,
    ] # [float] | Identifiers of distributors. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) (default to ["name"])

    try:
        # List of distributors.
        api_response = api_instance.get_news_distributor_list(ids=ids, attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_distributor_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[float]**| Identifiers of distributors. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

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

# **get_news_publisher_get**
> InlineResponse2007 get_news_publisher_get(id)

Details of a publisher.

Details of a publisher.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2007 import InlineResponse2007
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    id = 3.14 # float | Identifier of a publisher.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a publisher.
        api_response = api_instance.get_news_publisher_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_publisher_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a publisher. |
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

# **get_news_publisher_list**
> InlineResponse2008 get_news_publisher_list()

List of publishers.

List of publishers.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2008 import InlineResponse2008
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    ids = [
        3.14,
    ] # [float] | Identifiers of publishers. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) (default to ["name"])
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) (default to 0.0)
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) (default to 20.0)

    try:
        # List of publishers.
        api_response = api_instance.get_news_publisher_list(ids=ids, attributes=attributes, sort=sort, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_publisher_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[float]**| Identifiers of publishers. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **get_news_publisher_list_by_distributor**
> InlineResponse2009 get_news_publisher_list_by_distributor(id)

List of publishers provided by the given distributor.

List of publishers provided by the given distributor.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2009 import InlineResponse2009
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    id = 3.14 # float | Identifier of a distributor.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["name"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) (default to ["name"])

    try:
        # List of publishers provided by the given distributor.
        api_response = api_instance.get_news_publisher_list_by_distributor(id, attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->get_news_publisher_list_by_distributor: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a distributor. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

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

# **post_news_article_list**
> InlineResponse2001 post_news_article_list()

List of news articles.

List of news articles.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object import InlineObject
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject(
        data=NewsArticleListData(
            filter=NewsArticleListDataFilter(
                range=NewsArticleListDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=NewsArticleListDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=NewsArticleListDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=NewsArticleListDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=NewsArticleListDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=NewsArticleListDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=NewsArticleListDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=NewsArticleListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=NewsArticleListMetaSubscription(
                minimum_interval=0,
            ),
            pagination=NewsArticleListMetaPagination(
                cursor="cursor_example",
                limit=1,
            ),
        ),
    ) # InlineObject |  (optional)

    try:
        # List of news articles.
        api_response = api_instance.post_news_article_list(body=body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

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
> InlineResponse2002 post_news_article_list_by_chain(body)

List news articles of an article chain.

List news articles of an article chain.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object1 import InlineObject1
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2002 import InlineResponse2002
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject1(
        data=NewsArticleListByChainData(
            id="id_example",
            filter=NewsArticleListByChainDataFilter(
                range=NewsArticleListDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
            ),
        ),
        meta=NewsArticleListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=NewsArticleListMetaSubscription(
                minimum_interval=0,
            ),
            pagination=NewsArticleListMetaPagination(
                cursor="cursor_example",
                limit=1,
            ),
        ),
    ) # InlineObject1 | 

    try:
        # List news articles of an article chain.
        api_response = api_instance.post_news_article_list_by_chain(body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_chain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  |

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
> InlineResponse2001 post_news_article_list_by_index(body)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object2 import InlineObject2
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject2(
        data=NewsArticleListByIndexData(
            ids=[
                "ids_example",
            ],
            filter=NewsArticleListDataFilter(
                range=NewsArticleListDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=NewsArticleListDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=NewsArticleListDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=NewsArticleListDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=NewsArticleListDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=NewsArticleListDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=NewsArticleListDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=NewsArticleListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=NewsArticleListMetaSubscription(
                minimum_interval=0,
            ),
            pagination=NewsArticleListMetaPagination(
                cursor="cursor_example",
                limit=1,
            ),
        ),
    ) # InlineObject2 | 

    try:
        # News articles for instruments that are constituents of the given indices.
        api_response = api_instance.post_news_article_list_by_index(body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_index: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  |

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

# **post_news_article_list_by_instrument**
> InlineResponse2001 post_news_article_list_by_instrument(body)

News articles for instruments.

News articles for instruments.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object3 import InlineObject3
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject3(
        data=NewsArticleListByInstrumentData(
            ids=[
                "ids_example",
            ],
            filter=NewsArticleListDataFilter(
                range=NewsArticleListDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=NewsArticleListDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=NewsArticleListDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=NewsArticleListDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=NewsArticleListDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=NewsArticleListDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=NewsArticleListDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=NewsArticleListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=NewsArticleListMetaSubscription(
                minimum_interval=0,
            ),
            pagination=NewsArticleListMetaPagination(
                cursor="cursor_example",
                limit=1,
            ),
        ),
    ) # InlineObject3 | 

    try:
        # News articles for instruments.
        api_response = api_instance.post_news_article_list_by_instrument(body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject3**](InlineObject3.md)|  |

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

# **post_news_article_list_by_media_kind**
> InlineResponse2001 post_news_article_list_by_media_kind(body)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object4 import InlineObject4
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject4(
        data=NewsArticleListByMediaKindData(
            ids=[
                3.14,
            ],
            filter=NewsArticleListDataFilter(
                range=NewsArticleListDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
                categories=NewsArticleListDataFilterCategories(
                    ids=[
                        3.14,
                    ],
                ),
                regions=NewsArticleListDataFilterRegions(
                    ids=[
                        3.14,
                    ],
                ),
                distributor=NewsArticleListDataFilterDistributor(
                    ids=[
                        3.14,
                    ],
                ),
                publisher=NewsArticleListDataFilterPublisher(
                    ids=[
                        3.14,
                    ],
                ),
                language=NewsArticleListDataFilterLanguage(
                    ids=[
                        3.14,
                    ],
                ),
                types=NewsArticleListDataFilterTypes(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=NewsArticleListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=NewsArticleListMetaSubscription(
                minimum_interval=0,
            ),
            pagination=NewsArticleListMetaPagination(
                cursor="cursor_example",
                limit=1,
            ),
        ),
    ) # InlineObject4 | 

    try:
        # List news articles which contain media of specific media kinds.
        api_response = api_instance.post_news_article_list_by_media_kind(body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_list_by_media_kind: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject4**](InlineObject4.md)|  |

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

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object5 import InlineObject5
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject5(
        data=NewsArticleSearchByTextData(
            text=NewsArticleSearchByTextDataText(
                criteria=NewsArticleSearchByTextDataTextCriteria(
                    selection_type="include",
                    phrases=[
                        "phrases_example",
                    ],
                    minimum_match_score=3.14,
                    scope="all",
                ),
            ),
            criteria=[
                NewsArticleSearchByTextDataCriteria(
                    selection_type="include",
                    range=NewsArticleListDataFilterRange(
                        start="start_example",
                        end="end_example",
                    ),
                    indices=NewsArticleSearchByTextDataIndices(
                        ids=[
                            "ids_example",
                        ],
                    ),
                    instruments=NewsArticleSearchByTextDataInstruments(
                        ids=[
                            "ids_example",
                        ],
                    ),
                    types=NewsArticleSearchByTextDataTypes(
                        ids=[
                            3.14,
                        ],
                    ),
                    categories=NewsArticleSearchByTextDataCategories(
                        ids=[
                            3.14,
                        ],
                    ),
                    regions=NewsArticleSearchByTextDataRegions(
                        ids=[
                            3.14,
                        ],
                    ),
                    distributor=NewsArticleSearchByTextDataDistributor(
                        ids=[
                            3.14,
                        ],
                    ),
                    publisher=NewsArticleSearchByTextDataPublisher(
                        ids=[
                            3.14,
                        ],
                    ),
                    language=NewsArticleSearchByTextDataLanguage(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ],
        ),
        meta=NewsArticleListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            subscription=NewsArticleListMetaSubscription(
                minimum_interval=0,
            ),
            pagination=NewsArticleListMetaPagination(
                cursor="cursor_example",
                limit=1,
            ),
        ),
    ) # InlineObject5 |  (optional)

    try:
        # Search for news articles using a fulltext search.
        api_response = api_instance.post_news_article_search_by_text(body=body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_article_search_by_text: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional]

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
> InlineResponse2009 post_news_publisher_search_by_name(body)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NewsAPIforDigitalPortals
from fds.sdk.NewsAPIforDigitalPortals.api import news_api
from fds.sdk.NewsAPIforDigitalPortals.model.inline_response2009 import InlineResponse2009
from fds.sdk.NewsAPIforDigitalPortals.model.inline_object6 import InlineObject6
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NewsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NewsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)

    body = InlineObject6(
        data=NewsPublisherSearchByNameData(
            search_value="search_value_example",
            match_type="begins",
            filter=NewsPublisherSearchByNameDataFilter(
                distributor=NewsPublisherSearchByNameDataFilterDistributor(
                    id=3.14,
                ),
                delivery=NewsPublisherSearchByNameDataFilterDelivery(
                    id=3.14,
                ),
            ),
        ),
        meta=NewsPublisherSearchByNameMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            sort=[
                "id",
            ],
        ),
    ) # InlineObject6 | 

    try:
        # Search for publishers.
        api_response = api_instance.post_news_publisher_search_by_name(body)
        pprint(api_response)

    except fds.sdk.NewsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling NewsApi->post_news_publisher_search_by_name: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject6**](InlineObject6.md)|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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

