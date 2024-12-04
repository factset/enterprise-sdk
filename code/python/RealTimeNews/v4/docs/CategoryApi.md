# fds.sdk.RealTimeNews.CategoryApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_category_dataset_list**](CategoryApi.md#get_category_dataset_list) | **GET** /category/dataset/list | List of entitled category datasets.
[**get_category_get**](CategoryApi.md#get_category_get) | **GET** /category/get | Details of a category.
[**get_category_instrument_list**](CategoryApi.md#get_category_instrument_list) | **GET** /category/instrument/list | List of instruments where a specific dataset has assigned a given category.
[**get_category_level_get**](CategoryApi.md#get_category_level_get) | **GET** /category/level/get | Details of a category level.
[**get_category_list**](CategoryApi.md#get_category_list) | **GET** /category/list | List of categories.
[**get_category_list_by_level**](CategoryApi.md#get_category_list_by_level) | **GET** /category/list-by-level | List of categories assigned to a category level.
[**get_category_list_by_system**](CategoryApi.md#get_category_list_by_system) | **GET** /category/list-by-system | List of categories assigned to a category system.
[**get_category_path_get**](CategoryApi.md#get_category_path_get) | **GET** /category/path/get | Path from the first level to the level of a specific category.
[**get_category_system_get**](CategoryApi.md#get_category_system_get) | **GET** /category/system/get | Details of an entitled category system.
[**get_category_system_list**](CategoryApi.md#get_category_system_list) | **GET** /category/system/list | List of entitled category systems.
[**get_category_system_type_list**](CategoryApi.md#get_category_system_type_list) | **GET** /category/system/type/list | List of category system types.



# **get_category_dataset_list**
> InlineResponse20036 get_category_dataset_list()

List of entitled category datasets.

List of entitled category datasets.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of entitled category datasets.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_dataset_list(attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_dataset_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

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

# **get_category_get**
> InlineResponse20032 get_category_get(id)

Details of a category.

Details of a category.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = 4 # float | Identifier of a category.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # Details of a category.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_get(id, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

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

# **get_category_instrument_list**
> InlineResponse20037 get_category_instrument_list(id_category, id_category_dataset)

List of instruments where a specific dataset has assigned a given category.

List of instruments where a specific dataset has assigned a given category.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id_category = 1 # float | Identifier of a category.
    id_category_dataset = 3 # float | Identifier of a category dataset.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List of instruments where a specific dataset has assigned a given category.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_instrument_list(id_category, id_category_dataset, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_instrument_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_category** | **float**| Identifier of a category. |
 **id_category_dataset** | **float**| Identifier of a category dataset. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

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

# **get_category_level_get**
> InlineResponse20038 get_category_level_get(id)

Details of a category level.

Details of a category level.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = 4 # float | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # Details of a category level.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_level_get(id, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_level_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

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

# **get_category_list**
> InlineResponse20033 get_category_list(ids)

List of categories.

List of categories.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = [1] # [float] | List of categories belonging to the same category system.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of categories.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_list(ids, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[float]**| List of categories belonging to the same category system. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

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

# **get_category_list_by_level**
> InlineResponse20034 get_category_list_by_level(id)

List of categories assigned to a category level.

List of categories assigned to a category level.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = 2 # float | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List of categories assigned to a category level.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_list_by_level(id, attributes=attributes, meta_language=meta_language, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list_by_level: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

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

# **get_category_list_by_system**
> InlineResponse20035 get_category_list_by_system(id)

List of categories assigned to a category system.

List of categories assigned to a category system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = 5 # float | Identifier of a category system. See endpoint `/category/system/list` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "en" # str | ISO 639-1 code of the language. (optional)
    pagination_offset = 0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List of categories assigned to a category system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_list_by_system(id, attributes=attributes, meta_language=meta_language, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list_by_system: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

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

# **get_category_path_get**
> InlineResponse20039 get_category_path_get(id)

Path from the first level to the level of a specific category.

Path from the first level to the level of a specific category.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = 2 # float | Identifier of a category.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # Path from the first level to the level of a specific category.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_path_get(id, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_path_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

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

# **get_category_system_get**
> InlineResponse20040 get_category_system_get(id)

Details of an entitled category system.

Details of an entitled category system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = 4 # float | Identifier of a category system. See endpoint `/category/system/list` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "en" # str | ISO 639-1 code of the language. (optional)

    try:
        # Details of an entitled category system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_system_get(id, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

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

# **get_category_system_list**
> InlineResponse20041 get_category_system_list()

List of entitled category systems.

List of entitled category systems.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id_type = 1 # float | Filter for a specific category system type. See endpoint `/category/system/type/list` for valid values. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of entitled category systems.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_system_list(id_type=id_type, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_type** | **float**| Filter for a specific category system type. See endpoint &#x60;/category/system/type/list&#x60; for valid values. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

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

# **get_category_system_type_list**
> InlineResponse20042 get_category_system_type_list()

List of category system types.

List of category system types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import category_api
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
    api_instance = category_api.CategoryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "en" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of category system types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_category_system_type_list(attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

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

