# fds.sdk.QuotesAPIforDigitalPortals.BasicApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_basic_asset_class_list**](BasicApi.md#get_basic_asset_class_list) | **GET** /basic/assetClass/list | List of asset classes.
[**get_basic_benchmark_type_list**](BasicApi.md#get_basic_benchmark_type_list) | **GET** /basic/benchmark/type/list | List of benchmark types.
[**get_basic_frequency_type_list**](BasicApi.md#get_basic_frequency_type_list) | **GET** /basic/frequency/type/list | List of frequency types.
[**get_basic_language_get**](BasicApi.md#get_basic_language_get) | **GET** /basic/language/get | Details for a language.
[**get_basic_language_get_by_code**](BasicApi.md#get_basic_language_get_by_code) | **GET** /basic/language/getByCode | Details for a language identified by code.
[**get_basic_language_list**](BasicApi.md#get_basic_language_list) | **GET** /basic/language/list | List of languages.
[**get_basic_market_get**](BasicApi.md#get_basic_market_get) | **GET** /basic/market/get | Details of a market.
[**get_basic_market_group_list**](BasicApi.md#get_basic_market_group_list) | **GET** /basic/market/group/list | List of market groups.
[**get_basic_market_type_list**](BasicApi.md#get_basic_market_type_list) | **GET** /basic/market/type/list | List of market types.
[**get_basic_media_kind_list**](BasicApi.md#get_basic_media_kind_list) | **GET** /basic/media/kind/list | List of media kinds.
[**get_basic_region_continent_get**](BasicApi.md#get_basic_region_continent_get) | **GET** /basic/region/continent/get | Details for a continent.
[**get_basic_region_continent_list**](BasicApi.md#get_basic_region_continent_list) | **GET** /basic/region/continent/list | List of continents.
[**get_basic_region_country_get**](BasicApi.md#get_basic_region_country_get) | **GET** /basic/region/country/get | Details for a country.
[**get_basic_region_country_get_by_code**](BasicApi.md#get_basic_region_country_get_by_code) | **GET** /basic/region/country/getByCode | Details for a country identified by code.
[**get_basic_region_country_list**](BasicApi.md#get_basic_region_country_list) | **GET** /basic/region/country/list | List of countries.
[**get_basic_region_get**](BasicApi.md#get_basic_region_get) | **GET** /basic/region/get | Details for a region.
[**get_basic_region_list**](BasicApi.md#get_basic_region_list) | **GET** /basic/region/list | List of regions.
[**get_basic_timezone_get**](BasicApi.md#get_basic_timezone_get) | **GET** /basic/timezone/get | Details of a timezone.
[**get_basic_timezone_get_by_name**](BasicApi.md#get_basic_timezone_get_by_name) | **GET** /basic/timezone/getByName | Details of a timezone identified by name.
[**get_basic_value_unit_alternative_list**](BasicApi.md#get_basic_value_unit_alternative_list) | **GET** /basic/valueUnit/alternative/list | List of alternative units.
[**get_basic_value_unit_currency_fractional_get**](BasicApi.md#get_basic_value_unit_currency_fractional_get) | **GET** /basic/valueUnit/currency/fractional/get | Details of a fractional currency.
[**get_basic_value_unit_currency_fractional_list**](BasicApi.md#get_basic_value_unit_currency_fractional_list) | **GET** /basic/valueUnit/currency/fractional/list | List of fractional currencies.
[**get_basic_value_unit_get**](BasicApi.md#get_basic_value_unit_get) | **GET** /basic/valueUnit/get | Details of a value unit.
[**post_basic_background_text_type_list**](BasicApi.md#post_basic_background_text_type_list) | **POST** /basic/backgroundText/type/list | List of background text types.
[**post_basic_delivery_list**](BasicApi.md#post_basic_delivery_list) | **POST** /basic/delivery/list | List of deliveries.
[**post_basic_market_list**](BasicApi.md#post_basic_market_list) | **POST** /basic/market/list | List of markets.
[**post_basic_media_type_list**](BasicApi.md#post_basic_media_type_list) | **POST** /basic/media/type/list | List of Internet media types.
[**post_basic_mic_operating_list**](BasicApi.md#post_basic_mic_operating_list) | **POST** /basic/mic/operating/list | List of operating market identifier codes (MIC).
[**post_basic_timezone_list**](BasicApi.md#post_basic_timezone_list) | **POST** /basic/timezone/list | List of timezones.
[**post_basic_value_unit_currency_list**](BasicApi.md#post_basic_value_unit_currency_list) | **POST** /basic/valueUnit/currency/list | List of currencies.
[**post_basic_value_unit_currency_main_list**](BasicApi.md#post_basic_value_unit_currency_main_list) | **POST** /basic/valueUnit/currency/main/list | List of main currencies.
[**post_basic_value_unit_list**](BasicApi.md#post_basic_value_unit_list) | **POST** /basic/valueUnit/list | List of value units.



# **get_basic_asset_class_list**
> InlineResponse200 get_basic_asset_class_list()

List of asset classes.

List of asset classes as defined by FactSet Digital Solutions.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # List of asset classes.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_asset_class_list(attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_asset_class_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **get_basic_benchmark_type_list**
> InlineResponse2002 get_basic_benchmark_type_list()

List of benchmark types.

List of benchmark types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of benchmark types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_benchmark_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_benchmark_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

# **get_basic_frequency_type_list**
> InlineResponse2004 get_basic_frequency_type_list()

List of frequency types.

List of frequency types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of frequency types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_frequency_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_frequency_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_basic_language_get**
> InlineResponse2005 get_basic_language_get(id)

Details for a language.

Details for a language.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a language.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_language_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_language_get: %s\n" % e)
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

# **get_basic_language_get_by_code**
> InlineResponse2006 get_basic_language_get_by_code(code)

Details for a language identified by code.

Details for a language identified by code.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    code = "code_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a language identified by code.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_language_get_by_code(code, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_language_get_by_code: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  |
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

# **get_basic_language_list**
> InlineResponse2007 get_basic_language_list()

List of languages.

List of languages.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of languages.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_language_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_language_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

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

# **get_basic_market_get**
> InlineResponse2008 get_basic_market_get(id)

Details of a market.

Details of a market.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details of a market.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_market_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_market_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_basic_market_group_list**
> InlineResponse20010 get_basic_market_group_list()

List of market groups.

List of market groups.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of market groups.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_market_group_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_market_group_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

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

# **get_basic_market_type_list**
> InlineResponse20011 get_basic_market_type_list()

List of market types.

List of market types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of market types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_market_type_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_market_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
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

# **get_basic_media_kind_list**
> InlineResponse20012 get_basic_media_kind_list()

List of media kinds.

List of media kinds.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # List of media kinds.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_media_kind_list(attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_media_kind_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

# **get_basic_region_continent_get**
> InlineResponse20017 get_basic_region_continent_get(id)

Details for a continent.

Details for a continent.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a continent.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_continent_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_continent_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

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

# **get_basic_region_continent_list**
> InlineResponse20018 get_basic_region_continent_list()

List of continents.

List of continents.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of continents.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_continent_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_continent_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

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

# **get_basic_region_country_get**
> InlineResponse20019 get_basic_region_country_get(id)

Details for a country.

Details for a country.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a country.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_country_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_country_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

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

# **get_basic_region_country_get_by_code**
> InlineResponse20020 get_basic_region_country_get_by_code(code)

Details for a country identified by code.

Details for a country identified by code.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    code = "code_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a country identified by code.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_country_get_by_code(code, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_country_get_by_code: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

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

# **get_basic_region_country_list**
> InlineResponse20021 get_basic_region_country_list()

List of countries.

List of countries.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of countries.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_country_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_country_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

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

# **get_basic_region_get**
> InlineResponse20015 get_basic_region_get(id)

Details for a region.

Details for a geographic, political, or economic region.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a region.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

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

# **get_basic_region_list**
> InlineResponse20016 get_basic_region_list()

List of regions.

List of geographic, political, and economic regions.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of regions.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_region_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_region_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

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

# **get_basic_timezone_get**
> InlineResponse20022 get_basic_timezone_get(id)

Details of a timezone.

Details of a timezone identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a timezone.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_timezone_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_timezone_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

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

# **get_basic_timezone_get_by_name**
> InlineResponse20022 get_basic_timezone_get_by_name(name)

Details of a timezone identified by name.

Details of a timezone identified by name, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    name = "W" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a timezone identified by name.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_timezone_get_by_name(name, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_timezone_get_by_name: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

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

# **get_basic_value_unit_alternative_list**
> InlineResponse20026 get_basic_value_unit_alternative_list()

List of alternative units.

List of alternative units.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of alternative units.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_value_unit_alternative_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_value_unit_alternative_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

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

# **get_basic_value_unit_currency_fractional_get**
> InlineResponse20028 get_basic_value_unit_currency_fractional_get(id)

Details of a fractional currency.

Details of a fractional currency.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details of a fractional currency.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_value_unit_currency_fractional_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_value_unit_currency_fractional_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

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

# **get_basic_value_unit_currency_fractional_list**
> InlineResponse20029 get_basic_value_unit_currency_fractional_list()

List of fractional currencies.

List of fractional currencies.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)
    sort = ["name"] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["name"]

    try:
        # List of fractional currencies.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_value_unit_currency_fractional_list(attributes=attributes, language=language, sort=sort)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_value_unit_currency_fractional_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["name"]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

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

# **get_basic_value_unit_get**
> InlineResponse20024 get_basic_value_unit_get(id)

Details of a value unit.

Details of a value unit.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    id = 3.14 # float | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details of a value unit.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_basic_value_unit_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->get_basic_value_unit_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

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

# **post_basic_background_text_type_list**
> InlineResponse2001 post_basic_background_text_type_list()

List of background text types.

List of background text types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_background_text_type_list_request = PostBasicBackgroundTextTypeListRequest(
        data=PostBasicBackgroundTextTypeListRequestData(
            filter=PostBasicBackgroundTextTypeListRequestDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=PostBasicBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostBasicBackgroundTextTypeListRequest |  (optional)

    try:
        # List of background text types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_background_text_type_list(post_basic_background_text_type_list_request=post_basic_background_text_type_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_background_text_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_background_text_type_list_request** | [**PostBasicBackgroundTextTypeListRequest**](PostBasicBackgroundTextTypeListRequest.md)|  | [optional]

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

# **post_basic_delivery_list**
> InlineResponse2003 post_basic_delivery_list()

List of deliveries.

List of deliveries.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_delivery_list_request = PostBasicDeliveryListRequest(
        data=PostBasicDeliveryListRequestData(
            filter=PostBasicDeliveryListRequestDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=PostBasicDeliveryListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            sort=["name"],
        ),
    ) # PostBasicDeliveryListRequest |  (optional)

    try:
        # List of deliveries.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_delivery_list(post_basic_delivery_list_request=post_basic_delivery_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_delivery_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_delivery_list_request** | [**PostBasicDeliveryListRequest**](PostBasicDeliveryListRequest.md)|  | [optional]

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

# **post_basic_market_list**
> InlineResponse2009 post_basic_market_list()

List of markets.

List of markets.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_market_list_request = PostBasicMarketListRequest(
        data=PostBasicMarketListRequestData(
            filter=PostBasicMarketListRequestDataFilter(
                markets=PostBasicMarketListRequestDataFilterMarkets(
                    ids=[
                        3.14,
                    ],
                ),
                only_active=True,
            ),
        ),
        meta=PostBasicMarketListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["name"],
            pagination=PostBasicMarketListRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostBasicMarketListRequest |  (optional)

    try:
        # List of markets.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_market_list(post_basic_market_list_request=post_basic_market_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_market_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_market_list_request** | [**PostBasicMarketListRequest**](PostBasicMarketListRequest.md)|  | [optional]

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

# **post_basic_media_type_list**
> InlineResponse20013 post_basic_media_type_list()

List of Internet media types.

List of Internet media types. See http://www.iana.org/assignments/media-types/ for further details. Not all such Internet media types are available on the MDG.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_media_type_list_request = PostBasicMediaTypeListRequest(
        data=PostBasicMediaTypeListRequestData(
            filter=PostBasicMediaTypeListRequestDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=PostBasicMediaTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            sort=["name"],
        ),
    ) # PostBasicMediaTypeListRequest |  (optional)

    try:
        # List of Internet media types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_media_type_list(post_basic_media_type_list_request=post_basic_media_type_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_media_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_media_type_list_request** | [**PostBasicMediaTypeListRequest**](PostBasicMediaTypeListRequest.md)|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

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

# **post_basic_mic_operating_list**
> InlineResponse20014 post_basic_mic_operating_list()

List of operating market identifier codes (MIC).

List of operating market identifier codes (MIC).

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_mic_operating_list_request = PostBasicMicOperatingListRequest(
        data=PostBasicMicOperatingListRequestData(
            filter=PostBasicMicOperatingListRequestDataFilter(
                status="active",
            ),
        ),
        meta=PostBasicMicOperatingListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            sort=["name"],
            pagination=PostBasicMarketListRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostBasicMicOperatingListRequest |  (optional)

    try:
        # List of operating market identifier codes (MIC).
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_mic_operating_list(post_basic_mic_operating_list_request=post_basic_mic_operating_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_mic_operating_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_mic_operating_list_request** | [**PostBasicMicOperatingListRequest**](PostBasicMicOperatingListRequest.md)|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

# **post_basic_timezone_list**
> InlineResponse20023 post_basic_timezone_list()

List of timezones.

List of timezones identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_timezone_list_request = PostBasicTimezoneListRequest(
        data=PostBasicTimezoneListRequestData(
            filter=PostBasicTimezoneListRequestDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=PostBasicBackgroundTextTypeListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostBasicTimezoneListRequest |  (optional)

    try:
        # List of timezones.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_timezone_list(post_basic_timezone_list_request=post_basic_timezone_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_timezone_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_timezone_list_request** | [**PostBasicTimezoneListRequest**](PostBasicTimezoneListRequest.md)|  | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

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

# **post_basic_value_unit_currency_list**
> InlineResponse20027 post_basic_value_unit_currency_list()

List of currencies.

List of currencies.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_value_unit_currency_list_request = PostBasicValueUnitCurrencyListRequest(
        data=PostBasicValueUnitListRequestData(
            filter=PostBasicValueUnitListRequestDataFilter(
                status="active",
            ),
        ),
        meta=PostBasicValueUnitListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["name"],
        ),
    ) # PostBasicValueUnitCurrencyListRequest |  (optional)

    try:
        # List of currencies.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_value_unit_currency_list(post_basic_value_unit_currency_list_request=post_basic_value_unit_currency_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_value_unit_currency_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_value_unit_currency_list_request** | [**PostBasicValueUnitCurrencyListRequest**](PostBasicValueUnitCurrencyListRequest.md)|  | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

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

# **post_basic_value_unit_currency_main_list**
> InlineResponse20030 post_basic_value_unit_currency_main_list()

List of main currencies.

List of main currencies.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_value_unit_currency_main_list_request = PostBasicValueUnitCurrencyMainListRequest(
        data=PostBasicValueUnitCurrencyMainListRequestData(
            filter=PostBasicValueUnitCurrencyMainListRequestDataFilter(
                status="active",
            ),
        ),
        meta=PostBasicValueUnitListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["name"],
        ),
    ) # PostBasicValueUnitCurrencyMainListRequest |  (optional)

    try:
        # List of main currencies.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_value_unit_currency_main_list(post_basic_value_unit_currency_main_list_request=post_basic_value_unit_currency_main_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_value_unit_currency_main_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_value_unit_currency_main_list_request** | [**PostBasicValueUnitCurrencyMainListRequest**](PostBasicValueUnitCurrencyMainListRequest.md)|  | [optional]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

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

# **post_basic_value_unit_list**
> InlineResponse20025 post_basic_value_unit_list()

List of value units.

List of value units.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import basic_api
from fds.sdk.QuotesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = basic_api.BasicApi(api_client)

    post_basic_value_unit_list_request = PostBasicValueUnitListRequest(
        data=PostBasicValueUnitListRequestData(
            filter=PostBasicValueUnitListRequestDataFilter(
                status="active",
            ),
        ),
        meta=PostBasicValueUnitListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["name"],
        ),
    ) # PostBasicValueUnitListRequest |  (optional)

    try:
        # List of value units.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_basic_value_unit_list(post_basic_value_unit_list_request=post_basic_value_unit_list_request)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling BasicApi->post_basic_value_unit_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_basic_value_unit_list_request** | [**PostBasicValueUnitListRequest**](PostBasicValueUnitListRequest.md)|  | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

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

