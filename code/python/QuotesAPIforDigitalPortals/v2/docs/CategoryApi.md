# fds.sdk.QuotesAPIforDigitalPortals.CategoryApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_category_dataset_list**](CategoryApi.md#get_category_dataset_list) | **GET** /category/dataset/list | List of entitled category datasets.
[**get_category_get**](CategoryApi.md#get_category_get) | **GET** /category/get | Details of a category.
[**get_category_instrument_list**](CategoryApi.md#get_category_instrument_list) | **GET** /category/instrument/list | List of instruments where a specific dataset has assigned a given category.
[**get_category_level_get**](CategoryApi.md#get_category_level_get) | **GET** /category/level/get | Details of a category level.
[**get_category_list**](CategoryApi.md#get_category_list) | **GET** /category/list | List of categories.
[**get_category_list_by_level**](CategoryApi.md#get_category_list_by_level) | **GET** /category/listByLevel | List of categories assigned to a category level.
[**get_category_list_by_system**](CategoryApi.md#get_category_list_by_system) | **GET** /category/listBySystem | List of categories assigned to a category system.
[**get_category_path_get**](CategoryApi.md#get_category_path_get) | **GET** /category/path/get | Path from the first level to the level of a specific category.
[**get_category_system_get**](CategoryApi.md#get_category_system_get) | **GET** /category/system/get | Details of an entitled category system.
[**get_category_system_list**](CategoryApi.md#get_category_system_list) | **GET** /category/system/list | List of entitled category systems.
[**get_category_system_type_list**](CategoryApi.md#get_category_system_type_list) | **GET** /category/system/type/list | List of category system types.


# **get_category_dataset_list**
> InlineResponse20035 get_category_dataset_list()

List of entitled category datasets.

List of entitled category datasets.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20035 import InlineResponse20035
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of entitled category datasets.
        api_response = api_instance.get_category_dataset_list(attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_dataset_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_category_get**
> InlineResponse20031 get_category_get(id)

Details of a category.

Details of a category.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20031 import InlineResponse20031
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id = 3.14 # float | Identifier of a category.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Details of a category.
        api_response = api_instance.get_category_get(id)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Details of a category.
        api_response = api_instance.get_category_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

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
> InlineResponse20036 get_category_instrument_list(id_category, id_category_dataset)

List of instruments where a specific dataset has assigned a given category.

List of instruments where a specific dataset has assigned a given category.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20036 import InlineResponse20036
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id_category = 3.14 # float | Identifier of a category.
    id_category_dataset = 3.14 # float | Identifier of a category dataset.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # List of instruments where a specific dataset has assigned a given category.
        api_response = api_instance.get_category_instrument_list(id_category, id_category_dataset)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_instrument_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of instruments where a specific dataset has assigned a given category.
        api_response = api_instance.get_category_instrument_list(id_category, id_category_dataset, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_instrument_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_category** | **float**| Identifier of a category. |
 **id_category_dataset** | **float**| Identifier of a category dataset. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **get_category_level_get**
> InlineResponse20037 get_category_level_get(id)

Details of a category level.

Details of a category level.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20037 import InlineResponse20037
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id = 3.14 # float | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Details of a category level.
        api_response = api_instance.get_category_level_get(id)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_level_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Details of a category level.
        api_response = api_instance.get_category_level_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_level_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_category_list**
> InlineResponse20032 get_category_list(ids)

List of categories.

List of categories.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20032 import InlineResponse20032
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    ids = [
        3.14,
    ] # [float] | List of categories belonging to the same category system.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # List of categories.
        api_response = api_instance.get_category_list(ids)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of categories.
        api_response = api_instance.get_category_list(ids, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[float]**| List of categories belonging to the same category system. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_category_list_by_level**
> InlineResponse20033 get_category_list_by_level(id)

List of categories assigned to a category level.

List of categories assigned to a category level.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20033 import InlineResponse20033
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id = 3.14 # float | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # List of categories assigned to a category level.
        api_response = api_instance.get_category_list_by_level(id)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list_by_level: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of categories assigned to a category level.
        api_response = api_instance.get_category_list_by_level(id, attributes=attributes, language=language, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list_by_level: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **get_category_list_by_system**
> InlineResponse20034 get_category_list_by_system(id)

List of categories assigned to a category system.

List of categories assigned to a category system.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20034 import InlineResponse20034
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id = 3.14 # float | Identifier of a category system. See endpoint `/category/system/list` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # List of categories assigned to a category system.
        api_response = api_instance.get_category_list_by_system(id)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list_by_system: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of categories assigned to a category system.
        api_response = api_instance.get_category_list_by_system(id, attributes=attributes, language=language, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_list_by_system: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **get_category_path_get**
> InlineResponse20038 get_category_path_get(id)

Path from the first level to the level of a specific category.

Path from the first level to the level of a specific category.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20038 import InlineResponse20038
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id = 3.14 # float | Identifier of a category.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Path from the first level to the level of a specific category.
        api_response = api_instance.get_category_path_get(id)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_path_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Path from the first level to the level of a specific category.
        api_response = api_instance.get_category_path_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_path_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_category_system_get**
> InlineResponse20039 get_category_system_get(id)

Details of an entitled category system.

Details of an entitled category system.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20039 import InlineResponse20039
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id = 3.14 # float | Identifier of a category system. See endpoint `/category/system/list` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Details of an entitled category system.
        api_response = api_instance.get_category_system_get(id)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Details of an entitled category system.
        api_response = api_instance.get_category_system_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_category_system_list**
> InlineResponse20040 get_category_system_list()

List of entitled category systems.

List of entitled category systems.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20040 import InlineResponse20040
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    id_type = 3.14 # float | Filter for a specific category system type. See endpoint `/category/system/type/list` for valid values. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of entitled category systems.
        api_response = api_instance.get_category_system_list(id_type=id_type, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id_type** | **float**| Filter for a specific category system type. See endpoint &#x60;/category/system/type/list&#x60; for valid values. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_category_system_type_list**
> InlineResponse20041 get_category_system_type_list()

List of category system types.

List of category system types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import category_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20041 import InlineResponse20041
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = category_api.CategoryApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of category system types.
        api_response = api_instance.get_category_system_type_list(attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling CategoryApi->get_category_system_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

