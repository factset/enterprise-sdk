# fds.sdk.StocksAPIforDigitalPortals.StockApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_stock_dividend_type_list**](StockApi.md#get_stock_dividend_type_list) | **GET** /stock/dividend/type/list | List of dividend types.
[**get_stock_notation_key_figures_benchmark_month_1_get**](StockApi.md#get_stock_notation_key_figures_benchmark_month_1_get) | **GET** /stock/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
[**get_stock_notation_key_figures_benchmark_month_3_get**](StockApi.md#get_stock_notation_key_figures_benchmark_month_3_get) | **GET** /stock/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
[**get_stock_notation_key_figures_benchmark_week_1_get**](StockApi.md#get_stock_notation_key_figures_benchmark_week_1_get) | **GET** /stock/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
[**get_stock_notation_key_figures_benchmark_year_1_get**](StockApi.md#get_stock_notation_key_figures_benchmark_year_1_get) | **GET** /stock/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
[**get_stock_notation_key_figures_benchmark_year_3_get**](StockApi.md#get_stock_notation_key_figures_benchmark_year_3_get) | **GET** /stock/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
[**get_stock_notation_key_figures_benchmark_year_5_get**](StockApi.md#get_stock_notation_key_figures_benchmark_year_5_get) | **GET** /stock/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
[**get_stock_owner_list**](StockApi.md#get_stock_owner_list) | **GET** /stock/owner/list | List of owners for a specific type of a company&#39;s shares.
[**get_stock_recommendation_aggregate_get**](StockApi.md#get_stock_recommendation_aggregate_get) | **GET** /stock/recommendation/aggregate/get | Target price and aggregated recommendations for a stock.
[**get_stock_recommendation_aggregate_history_list**](StockApi.md#get_stock_recommendation_aggregate_history_list) | **GET** /stock/recommendation/aggregate/history/list | Current and historical trade recommendations and target prices for a stock.
[**post_stock_dividend_list**](StockApi.md#post_stock_dividend_list) | **POST** /stock/dividend/list | List of dividends for a stock.
[**post_stock_notation_ranking_intraday_list**](StockApi.md#post_stock_notation_ranking_intraday_list) | **POST** /stock/notation/ranking/intraday/list | Ranking of stocks&#39; notations using intraday figures.
[**post_stock_notation_screener_search**](StockApi.md#post_stock_notation_screener_search) | **POST** /stock/notation/screener/search | Screener for stocks&#39; notations based on stock-specific parameters.
[**post_stock_notation_screener_value_ranges_get**](StockApi.md#post_stock_notation_screener_value_ranges_get) | **POST** /stock/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.


# **get_stock_dividend_type_list**
> InlineResponse2004 get_stock_dividend_type_list()

List of dividend types.

List of dividend types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of dividend types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_dividend_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_dividend_type_list: %s\n" % e)
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

# **get_stock_notation_key_figures_benchmark_month_1_get**
> InlineResponse2005 get_stock_notation_key_figures_benchmark_month_1_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_month_1_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_month_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
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

# **get_stock_notation_key_figures_benchmark_month_3_get**
> InlineResponse2005 get_stock_notation_key_figures_benchmark_month_3_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_month_3_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_month_3_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
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

# **get_stock_notation_key_figures_benchmark_week_1_get**
> InlineResponse2005 get_stock_notation_key_figures_benchmark_week_1_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_week_1_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_week_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
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

# **get_stock_notation_key_figures_benchmark_year_1_get**
> InlineResponse2005 get_stock_notation_key_figures_benchmark_year_1_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_year_1_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_year_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
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

# **get_stock_notation_key_figures_benchmark_year_3_get**
> InlineResponse2005 get_stock_notation_key_figures_benchmark_year_3_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_year_3_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_year_3_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
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

# **get_stock_notation_key_figures_benchmark_year_5_get**
> InlineResponse2005 get_stock_notation_key_figures_benchmark_year_5_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_year_5_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_year_5_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
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

# **get_stock_owner_list**
> InlineResponse2002 get_stock_owner_list(id)

List of owners for a specific type of a company's shares.

List of top-20 owners for a specific type of a company's shares.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # List of owners for a specific type of a company's shares.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_owner_list(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_owner_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
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

# **get_stock_recommendation_aggregate_get**
> InlineResponse200 get_stock_recommendation_aggregate_get(id)

Target price and aggregated recommendations for a stock.

Target price and aggregated recommendations for a stock.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Target price and aggregated recommendations for a stock.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_recommendation_aggregate_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_recommendation_aggregate_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
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

# **get_stock_recommendation_aggregate_history_list**
> InlineResponse2001 get_stock_recommendation_aggregate_history_list(id, snapshots)

Current and historical trade recommendations and target prices for a stock.

Current and historical trade recommendations and target prices for a stock.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    id = "id_example" # str | 
    snapshots = [
        "latest",
    ] # [str] | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Current and historical trade recommendations and target prices for a stock.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_recommendation_aggregate_history_list(id, snapshots, attributes=attributes)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_recommendation_aggregate_history_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  |
 **snapshots** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

# **post_stock_dividend_list**
> InlineResponse2003 post_stock_dividend_list(inline_object)

List of dividends for a stock.

List of dividends for a stock.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    inline_object = InlineObject(
        data=StockDividendListData(
            id="id_example",
            filter=StockDividendListDataFilter(
                period=StockDividendListDataFilterPeriod(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                type=StockDividendListDataFilterType(
                    id=3.14,
                ),
            ),
        ),
        meta=StockDividendListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["dates.payment"],
        ),
    ) # InlineObject | 

    try:
        # List of dividends for a stock.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_stock_dividend_list(inline_object)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_dividend_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object** | [**InlineObject**](InlineObject.md)|  |

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

# **post_stock_notation_ranking_intraday_list**
> InlineResponse2006 post_stock_notation_ranking_intraday_list()

Ranking of stocks' notations using intraday figures.

Ranking of stocks' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter `currency` has not been specified.`  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    inline_object1 = InlineObject1(
        data=StockNotationRankingIntradayListData(
            prices=StockNotationRankingIntradayListDataPrices(
                quality="DLY",
            ),
            currency=StockNotationRankingIntradayListDataCurrency(
                id=3.14,
            ),
            market=StockNotationRankingIntradayListDataMarket(
                ids=[
                    3.14,
                ],
                priority=StockNotationRankingIntradayListDataMarketPriority(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            instrument_restriction_list=StockNotationRankingIntradayListDataInstrumentRestrictionList(
                ids=[
                    3.14,
                ],
            ),
            notation_restriction_list=StockNotationRankingIntradayListDataNotationRestrictionList(
                ids=[
                    3.14,
                ],
            ),
            industry_classification=StockNotationRankingIntradayListDataIndustryClassification(
                ids=[
                    3.14,
                ],
            ),
            company=StockNotationRankingIntradayListDataCompany(
                country=StockNotationRankingIntradayListDataCompanyCountry(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            index_membership=StockNotationRankingIntradayListDataIndexMembership(
                ids=[
                    "ids_example",
                ],
                use_alternative_notation=False,
            ),
            performance=StockNotationRankingIntradayListDataPerformance(
                relative=StockNotationRankingIntradayListDataPerformanceRelative(
                    minimum=StockNotationRankingIntradayListDataPerformanceRelativeMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationRankingIntradayListDataPerformanceRelativeMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=StockNotationRankingIntradayListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["-trade.performance.relative"],
            pagination=StockNotationRankingIntradayListMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # InlineObject1 |  (optional)

    try:
        # Ranking of stocks' notations using intraday figures.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_notation_ranking_intraday_list(inline_object1=inline_object1)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_notation_ranking_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **post_stock_notation_screener_search**
> InlineResponse2007 post_stock_notation_screener_search()

Screener for stocks' notations based on stock-specific parameters.

Screener for stocks' notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Parameters for up to three fiscal years might be used in one request, see attribute `reportedKeyFigures`; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute `estimates`. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter `reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode` and parameter `estimates.currencyDependentEstimates.currency.isoCode` respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter `reportedKeyFigures.fiscalYear`) or for the estimates (see parameter `estimates.fiscalYear`) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    inline_object2 = InlineObject2(
        data=StockNotationScreenerSearchData(
            validation=StockNotationScreenerSearchDataValidation(
                only_active=True,
                only_not_suspended=False,
                prices=StockNotationScreenerSearchDataValidationPrices(
                    quality="DLY",
                    latest=StockNotationScreenerSearchDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=StockNotationScreenerSearchDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=StockNotationScreenerSearchDataValidationValueUnit(
                    restrict=StockNotationScreenerSearchDataValidationValueUnitRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataValidationValueUnitExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=StockNotationScreenerSearchDataValidationMarket(
                    selection=StockNotationScreenerSearchDataValidationMarketSelection(
                        restrict=StockNotationScreenerSearchDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=StockNotationScreenerSearchDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=StockNotationScreenerSearchDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=StockNotationScreenerSearchDataValidationInstrumentSelectionList(
                    restrict=StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=StockNotationScreenerSearchDataValidationNotationSelectionList(
                    restrict=StockNotationScreenerSearchDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            stock_type=[
                "common",
            ],
            industry_classification=StockNotationScreenerSearchDataIndustryClassification(
                restrict=StockNotationScreenerSearchDataIndustryClassificationRestrict(
                    ids=[
                        3.14,
                    ],
                ),
                exclude=StockNotationScreenerSearchDataIndustryClassificationExclude(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            company=StockNotationScreenerSearchDataCompany(
                country=StockNotationScreenerSearchDataCompanyCountry(
                    restrict=StockNotationScreenerSearchDataCompanyCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataCompanyCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            index_membership=StockNotationScreenerSearchDataIndexMembership(
                ids=[
                    "ids_example",
                ],
            ),
            compliance=StockNotationScreenerSearchDataCompliance(
                france=StockNotationScreenerSearchDataComplianceFrance(
                    _or=[
                        StockNotationScreenerSearchDataComplianceFranceOr(
                            _and=[
                                StockNotationScreenerSearchDataComplianceFranceAnd(
                                    id=2,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
            ),
            reported_key_figures=[
                StockNotationScreenerSearchDataReportedKeyFigures(
                    fiscal_year=StockNotationScreenerSearchDataFiscalYear(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_key_figures=StockNotationScreenerSearchDataCurrencyDependentKeyFigures(
                        currency=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresCurrency(
                            iso_code="EUR",
                        ),
                        market_capitalization=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalization(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebit=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresEbit(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebitda=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresEbitda(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        per_share=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShare(
                            sales=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareSales(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            recurring_diluted_earnings=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            dividends=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareDividends(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            book_value=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareBookValue(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            cash_flow=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareCashFlow(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    ebit_margin=StockNotationScreenerSearchDataEbitMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ebitda_margin=StockNotationScreenerSearchDataEbitdaMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    net_income_margin=StockNotationScreenerSearchDataNetIncomeMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    gross_income_margin=StockNotationScreenerSearchDataGrossIncomeMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    operating_margin=StockNotationScreenerSearchDataOperatingMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_assets=StockNotationScreenerSearchDataReturnOnAssets(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_equity=StockNotationScreenerSearchDataReturnOnEquity(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ratios=StockNotationScreenerSearchDataRatios(
                        price_sales=StockNotationScreenerSearchDataRatiosPriceSales(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_earnings=StockNotationScreenerSearchDataRatiosPriceEarnings(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_book_value=StockNotationScreenerSearchDataRatiosPriceBookValue(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_cash_flow=StockNotationScreenerSearchDataRatiosPriceCashFlow(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_free_cash_flow=StockNotationScreenerSearchDataRatiosPriceFreeCashFlow(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        dividend_yield=StockNotationScreenerSearchDataRatiosDividendYield(
                            minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebit=StockNotationScreenerSearchDataRatiosEnterpriseValueEbit(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebitda=StockNotationScreenerSearchDataRatiosEnterpriseValueEbitda(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_sales=StockNotationScreenerSearchDataRatiosEnterpriseValueSales(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        debt_equity=StockNotationScreenerSearchDataRatiosDebtEquity(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ],
            performance=StockNotationScreenerSearchDataPerformance(
                intraday=StockNotationScreenerSearchDataPerformanceIntraday(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                end_of_day=StockNotationScreenerSearchDataPerformanceEndOfDay(
                    day1=StockNotationScreenerSearchDataPerformanceEndOfDayDay1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=StockNotationScreenerSearchDataPerformanceEndOfDayWeek1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=StockNotationScreenerSearchDataPerformanceEndOfDayMonth1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=StockNotationScreenerSearchDataPerformanceEndOfDayMonths3(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=StockNotationScreenerSearchDataPerformanceEndOfDayMonths6(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=StockNotationScreenerSearchDataPerformanceEndOfDayYear1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=StockNotationScreenerSearchDataPerformanceEndOfDayYears3(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=StockNotationScreenerSearchDataPerformanceEndOfDayYears5(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=StockNotationScreenerSearchDataVolatility(
                week1=StockNotationScreenerSearchDataPerformanceEndOfDayWeek1(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                month1=StockNotationScreenerSearchDataPerformanceEndOfDayMonth1(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months3=StockNotationScreenerSearchDataPerformanceEndOfDayMonths3(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months6=StockNotationScreenerSearchDataPerformanceEndOfDayMonths6(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year1=StockNotationScreenerSearchDataPerformanceEndOfDayYear1(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years3=StockNotationScreenerSearchDataPerformanceEndOfDayYears3(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years5=StockNotationScreenerSearchDataPerformanceEndOfDayYears5(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year_to_date=StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            trading_value=StockNotationScreenerSearchDataTradingValue(
                average=StockNotationScreenerSearchDataTradingValueAverage(
                    days5=StockNotationScreenerSearchDataTradingValueAverageDays5(
                        minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    days30=StockNotationScreenerSearchDataTradingValueAverageDays30(
                        minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            simple_moving_average=StockNotationScreenerSearchDataSimpleMovingAverage(
                days20=StockNotationScreenerSearchDataSimpleMovingAverageDays20(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days50=StockNotationScreenerSearchDataSimpleMovingAverageDays50(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days200=StockNotationScreenerSearchDataSimpleMovingAverageDays200(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                trading_days_since_crossover=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossover(
                    sma20vs50=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50(
                        number_days=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays(
                            minimum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                    sma50vs200=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200(
                        number_days=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDays(
                            minimum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                ),
            ),
            rsi_wilder=StockNotationScreenerSearchDataRsiWilder(
                days14=StockNotationScreenerSearchDataRsiWilderDays14(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            recommendation=StockNotationScreenerSearchDataRecommendation(
                counts=StockNotationScreenerSearchDataRecommendationCounts(
                    total=StockNotationScreenerSearchDataRecommendationCountsTotal(
                        minimum=StockNotationScreenerSearchDataRecommendationCountsTotalMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataRecommendationCountsTotalMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                consensus=StockNotationScreenerSearchDataRecommendationConsensus(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            estimates=[
                StockNotationScreenerSearchDataEstimates(
                    fiscal_year=StockNotationScreenerSearchDataFiscalYear1(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_estimates=StockNotationScreenerSearchDataCurrencyDependentEstimates(
                        currency=StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency(
                            iso_code="EUR",
                        ),
                        ebit=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        ebitda=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        per_share=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare(
                            sales=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            earnings=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            dividends=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            cash_flow=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                        ),
                    ),
                    return_on_assets=StockNotationScreenerSearchDataReturnOnAssets1(
                        mean=StockNotationScreenerSearchDataReturnOnAssets1Mean(
                            minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    return_on_equity=StockNotationScreenerSearchDataReturnOnEquity1(
                        mean=StockNotationScreenerSearchDataReturnOnAssets1Mean(
                            minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    ratios=StockNotationScreenerSearchDataRatios1(
                        price_sales=StockNotationScreenerSearchDataRatios1PriceSales(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings=StockNotationScreenerSearchDataRatios1PriceEarnings(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings_growth=StockNotationScreenerSearchDataRatios1PriceEarningsGrowth(
                            mean=StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_book_value=StockNotationScreenerSearchDataRatios1PriceBookValue(
                            mean=StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_cash_flow=StockNotationScreenerSearchDataRatios1PriceCashFlow(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_free_cash_flow=StockNotationScreenerSearchDataRatios1PriceFreeCashFlow(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        dividend_yield=StockNotationScreenerSearchDataRatios1DividendYield(
                            mean=StockNotationScreenerSearchDataReturnOnAssets1Mean(
                                minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebit=StockNotationScreenerSearchDataRatios1EnterpriseValueEbit(
                            mean=StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebitda=StockNotationScreenerSearchDataRatios1EnterpriseValueEbitda(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_sales=StockNotationScreenerSearchDataRatios1EnterpriseValueSales(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
            ],
        ),
        meta=StockNotationScreenerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["instrument.name"],
            pagination=StockNotationScreenerSearchMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # InlineObject2 |  (optional)

    try:
        # Screener for stocks' notations based on stock-specific parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_notation_screener_search(inline_object2=inline_object2)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_notation_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

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

# **post_stock_notation_screener_value_ranges_get**
> InlineResponse2008 post_stock_notation_screener_value_ranges_get()

Possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/stock/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the `/notation/keyFigures/` endpoints.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StocksAPIforDigitalPortals
from fds.sdk.StocksAPIforDigitalPortals.api import stock_api
from fds.sdk.StocksAPIforDigitalPortals.models import *
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
configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StocksAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StocksAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = stock_api.StockApi(api_client)

    inline_object3 = InlineObject3(
        data=StockNotationScreenerSearchData(
            validation=StockNotationScreenerSearchDataValidation(
                only_active=True,
                only_not_suspended=False,
                prices=StockNotationScreenerSearchDataValidationPrices(
                    quality="DLY",
                    latest=StockNotationScreenerSearchDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=StockNotationScreenerSearchDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=StockNotationScreenerSearchDataValidationValueUnit(
                    restrict=StockNotationScreenerSearchDataValidationValueUnitRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataValidationValueUnitExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=StockNotationScreenerSearchDataValidationMarket(
                    selection=StockNotationScreenerSearchDataValidationMarketSelection(
                        restrict=StockNotationScreenerSearchDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=StockNotationScreenerSearchDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=StockNotationScreenerSearchDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=StockNotationScreenerSearchDataValidationInstrumentSelectionList(
                    restrict=StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=StockNotationScreenerSearchDataValidationNotationSelectionList(
                    restrict=StockNotationScreenerSearchDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            stock_type=[
                "common",
            ],
            industry_classification=StockNotationScreenerSearchDataIndustryClassification(
                restrict=StockNotationScreenerSearchDataIndustryClassificationRestrict(
                    ids=[
                        3.14,
                    ],
                ),
                exclude=StockNotationScreenerSearchDataIndustryClassificationExclude(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            company=StockNotationScreenerSearchDataCompany(
                country=StockNotationScreenerSearchDataCompanyCountry(
                    restrict=StockNotationScreenerSearchDataCompanyCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=StockNotationScreenerSearchDataCompanyCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            index_membership=StockNotationScreenerSearchDataIndexMembership(
                ids=[
                    "ids_example",
                ],
            ),
            compliance=StockNotationScreenerSearchDataCompliance(
                france=StockNotationScreenerSearchDataComplianceFrance(
                    _or=[
                        StockNotationScreenerSearchDataComplianceFranceOr(
                            _and=[
                                StockNotationScreenerSearchDataComplianceFranceAnd(
                                    id=2,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
            ),
            reported_key_figures=[
                StockNotationScreenerSearchDataReportedKeyFigures(
                    fiscal_year=StockNotationScreenerSearchDataFiscalYear(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_key_figures=StockNotationScreenerSearchDataCurrencyDependentKeyFigures(
                        currency=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresCurrency(
                            iso_code="EUR",
                        ),
                        market_capitalization=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalization(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebit=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresEbit(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebitda=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresEbitda(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        per_share=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShare(
                            sales=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareSales(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            recurring_diluted_earnings=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            dividends=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareDividends(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            book_value=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareBookValue(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            cash_flow=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareCashFlow(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    ebit_margin=StockNotationScreenerSearchDataEbitMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ebitda_margin=StockNotationScreenerSearchDataEbitdaMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    net_income_margin=StockNotationScreenerSearchDataNetIncomeMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    gross_income_margin=StockNotationScreenerSearchDataGrossIncomeMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    operating_margin=StockNotationScreenerSearchDataOperatingMargin(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_assets=StockNotationScreenerSearchDataReturnOnAssets(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_equity=StockNotationScreenerSearchDataReturnOnEquity(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ratios=StockNotationScreenerSearchDataRatios(
                        price_sales=StockNotationScreenerSearchDataRatiosPriceSales(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_earnings=StockNotationScreenerSearchDataRatiosPriceEarnings(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_book_value=StockNotationScreenerSearchDataRatiosPriceBookValue(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_cash_flow=StockNotationScreenerSearchDataRatiosPriceCashFlow(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_free_cash_flow=StockNotationScreenerSearchDataRatiosPriceFreeCashFlow(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        dividend_yield=StockNotationScreenerSearchDataRatiosDividendYield(
                            minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebit=StockNotationScreenerSearchDataRatiosEnterpriseValueEbit(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebitda=StockNotationScreenerSearchDataRatiosEnterpriseValueEbitda(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_sales=StockNotationScreenerSearchDataRatiosEnterpriseValueSales(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        debt_equity=StockNotationScreenerSearchDataRatiosDebtEquity(
                            minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ],
            performance=StockNotationScreenerSearchDataPerformance(
                intraday=StockNotationScreenerSearchDataPerformanceIntraday(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                end_of_day=StockNotationScreenerSearchDataPerformanceEndOfDay(
                    day1=StockNotationScreenerSearchDataPerformanceEndOfDayDay1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=StockNotationScreenerSearchDataPerformanceEndOfDayWeek1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=StockNotationScreenerSearchDataPerformanceEndOfDayMonth1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=StockNotationScreenerSearchDataPerformanceEndOfDayMonths3(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=StockNotationScreenerSearchDataPerformanceEndOfDayMonths6(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=StockNotationScreenerSearchDataPerformanceEndOfDayYear1(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=StockNotationScreenerSearchDataPerformanceEndOfDayYears3(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=StockNotationScreenerSearchDataPerformanceEndOfDayYears5(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate(
                        minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=StockNotationScreenerSearchDataVolatility(
                week1=StockNotationScreenerSearchDataPerformanceEndOfDayWeek1(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                month1=StockNotationScreenerSearchDataPerformanceEndOfDayMonth1(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months3=StockNotationScreenerSearchDataPerformanceEndOfDayMonths3(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months6=StockNotationScreenerSearchDataPerformanceEndOfDayMonths6(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year1=StockNotationScreenerSearchDataPerformanceEndOfDayYear1(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years3=StockNotationScreenerSearchDataPerformanceEndOfDayYears3(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years5=StockNotationScreenerSearchDataPerformanceEndOfDayYears5(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year_to_date=StockNotationScreenerSearchDataPerformanceEndOfDayYearToDate(
                    minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            trading_value=StockNotationScreenerSearchDataTradingValue(
                average=StockNotationScreenerSearchDataTradingValueAverage(
                    days5=StockNotationScreenerSearchDataTradingValueAverageDays5(
                        minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    days30=StockNotationScreenerSearchDataTradingValueAverageDays30(
                        minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            simple_moving_average=StockNotationScreenerSearchDataSimpleMovingAverage(
                days20=StockNotationScreenerSearchDataSimpleMovingAverageDays20(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days50=StockNotationScreenerSearchDataSimpleMovingAverageDays50(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days200=StockNotationScreenerSearchDataSimpleMovingAverageDays200(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                trading_days_since_crossover=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossover(
                    sma20vs50=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50(
                        number_days=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays(
                            minimum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                    sma50vs200=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200(
                        number_days=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDays(
                            minimum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                ),
            ),
            rsi_wilder=StockNotationScreenerSearchDataRsiWilder(
                days14=StockNotationScreenerSearchDataRsiWilderDays14(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            recommendation=StockNotationScreenerSearchDataRecommendation(
                counts=StockNotationScreenerSearchDataRecommendationCounts(
                    total=StockNotationScreenerSearchDataRecommendationCountsTotal(
                        minimum=StockNotationScreenerSearchDataRecommendationCountsTotalMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=StockNotationScreenerSearchDataRecommendationCountsTotalMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                consensus=StockNotationScreenerSearchDataRecommendationConsensus(
                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            estimates=[
                StockNotationScreenerSearchDataEstimates(
                    fiscal_year=StockNotationScreenerSearchDataFiscalYear1(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_estimates=StockNotationScreenerSearchDataCurrencyDependentEstimates(
                        currency=StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency(
                            iso_code="EUR",
                        ),
                        ebit=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        ebitda=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        per_share=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare(
                            sales=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareSales(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            earnings=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            dividends=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareDividends(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            cash_flow=StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow(
                                mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                    minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                        ),
                    ),
                    return_on_assets=StockNotationScreenerSearchDataReturnOnAssets1(
                        mean=StockNotationScreenerSearchDataReturnOnAssets1Mean(
                            minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    return_on_equity=StockNotationScreenerSearchDataReturnOnEquity1(
                        mean=StockNotationScreenerSearchDataReturnOnAssets1Mean(
                            minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    ratios=StockNotationScreenerSearchDataRatios1(
                        price_sales=StockNotationScreenerSearchDataRatios1PriceSales(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings=StockNotationScreenerSearchDataRatios1PriceEarnings(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings_growth=StockNotationScreenerSearchDataRatios1PriceEarningsGrowth(
                            mean=StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_book_value=StockNotationScreenerSearchDataRatios1PriceBookValue(
                            mean=StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_cash_flow=StockNotationScreenerSearchDataRatios1PriceCashFlow(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_free_cash_flow=StockNotationScreenerSearchDataRatios1PriceFreeCashFlow(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        dividend_yield=StockNotationScreenerSearchDataRatios1DividendYield(
                            mean=StockNotationScreenerSearchDataReturnOnAssets1Mean(
                                minimum=StockNotationScreenerSearchDataEbitMarginMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataEbitMarginMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebit=StockNotationScreenerSearchDataRatios1EnterpriseValueEbit(
                            mean=StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebitda=StockNotationScreenerSearchDataRatios1EnterpriseValueEbitda(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_sales=StockNotationScreenerSearchDataRatios1EnterpriseValueSales(
                            mean=StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean(
                                minimum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
            ],
        ),
        meta=StockNotationScreenerValueRangesGetMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject3 |  (optional)

    try:
        # Possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_notation_screener_value_ranges_get(inline_object3=inline_object3)
        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_notation_screener_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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

