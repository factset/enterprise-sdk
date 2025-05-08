# fds.sdk.FactSetNews.FiltersApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_filters**](FiltersApi.md#get_filters) | **GET** /filters | Retrieve all FactSet News filters
[**get_news_filters_categories**](FiltersApi.md#get_news_filters_categories) | **GET** /filters/categories | Retrieve all News filter categories
[**get_news_filters_countries**](FiltersApi.md#get_news_filters_countries) | **GET** /filters/countries | Retrieve all News filter countries
[**get_news_filters_regions**](FiltersApi.md#get_news_filters_regions) | **GET** /filters/regions | Retrieve all News filter regions
[**get_news_filters_sources**](FiltersApi.md#get_news_filters_sources) | **GET** /filters/sources | Retrieve all News filter sources
[**get_news_filters_topics**](FiltersApi.md#get_news_filters_topics) | **GET** /filters/topics | Retrieve all News filter topics
[**get_news_filters_watchlists**](FiltersApi.md#get_news_filters_watchlists) | **GET** /filters/watchlists | Retrieve all News filter watchlists



# **get_filters**
> FilterResponse get_filters()

Retrieve all FactSet News filters

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all FactSet News filters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_filters(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_filters: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_filters_categories**
> FilterCategoriesResponse get_news_filters_categories()

Retrieve all News filter categories

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all News filter categories
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_filters_categories(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_news_filters_categories: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterCategoriesResponse**](FilterCategoriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns news categories |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_filters_countries**
> FilterCountriesResponse get_news_filters_countries()

Retrieve all News filter countries

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter countries. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all News filter countries
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_filters_countries(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_news_filters_countries: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter countries. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterCountriesResponse**](FilterCountriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns News countries. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_filters_regions**
> FilterRegionsResponse get_news_filters_regions()

Retrieve all News filter regions

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter regions. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all News filter regions
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_filters_regions(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_news_filters_regions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterRegionsResponse**](FilterRegionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns News regions. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_filters_sources**
> FilterSourcesResponse get_news_filters_sources()

Retrieve all News filter sources

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter sources. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all News filter sources
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_filters_sources(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_news_filters_sources: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter sources. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterSourcesResponse**](FilterSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns News Sources. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_filters_topics**
> FilterTopicResponse get_news_filters_topics()

Retrieve all News filter topics

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all News filter topics
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_filters_topics(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_news_filters_topics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterTopicResponse**](FilterTopicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns News topics. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_news_filters_watchlists**
> FilterWatchlistsResponse get_news_filters_watchlists()

Retrieve all News filter watchlists

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetNews
from fds.sdk.FactSetNews.api import filters_api
from fds.sdk.FactSetNews.models import *
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
configuration = fds.sdk.FactSetNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "structured",
    ] # [str] | Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response).  (optional)

    try:
        # Retrieve all News filter watchlists
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_filters_watchlists(attributes=attributes)

        pprint(api_response)

    except fds.sdk.FactSetNews.ApiException as e:
        print("Exception when calling FiltersApi->get_news_filters_watchlists: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional]

### Return type

[**FilterWatchlistsResponse**](FilterWatchlistsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns News watchlists. |  -  |
**400** | Bad Request. This can occur for invalid parameter. |  -  |
**401** | Unauthenticated |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

