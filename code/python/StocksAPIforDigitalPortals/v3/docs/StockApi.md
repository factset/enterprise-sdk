# fds.sdk.StocksAPIforDigitalPortals.StockApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_stock_composite_profile_get_by_notation**](StockApi.md#get_stock_composite_profile_get_by_notation) | **GET** /stock/composite/profile/getByNotation | Provides key elements of a stock profile together with the profile of the issuing company.
[**get_stock_dividend_type_list**](StockApi.md#get_stock_dividend_type_list) | **GET** /stock/dividend/type/list | List of dividend types.
[**get_stock_notation_key_figures_benchmark_month_1_get**](StockApi.md#get_stock_notation_key_figures_benchmark_month_1_get) | **GET** /stock/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
[**get_stock_notation_key_figures_benchmark_month_3_get**](StockApi.md#get_stock_notation_key_figures_benchmark_month_3_get) | **GET** /stock/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
[**get_stock_notation_key_figures_benchmark_month_6_get**](StockApi.md#get_stock_notation_key_figures_benchmark_month_6_get) | **GET** /stock/notation/keyFigures/benchmark/month/6/get | End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
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



# **get_stock_composite_profile_get_by_notation**
> InlineResponse2009 get_stock_composite_profile_get_by_notation(identifier, identifier_type)

Provides key elements of a stock profile together with the profile of the issuing company.

Provides key elements of a stock profile together with the profile of the issuing company.

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # Provides key elements of a stock profile together with the profile of the issuing company.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_composite_profile_get_by_notation(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_composite_profile_get_by_notation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_dividend_type_list**
> InlineResponse20011 get_stock_dividend_type_list()

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
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

# **get_stock_notation_key_figures_benchmark_month_1_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_month_1_get(identifier, identifier_type, id_notation_benchmark)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_month_1_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_month_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_notation_key_figures_benchmark_month_3_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_month_3_get(identifier, identifier_type, id_notation_benchmark)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_month_3_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_month_3_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_notation_key_figures_benchmark_month_6_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_month_6_get(identifier, identifier_type, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a stock for the time range of six months.

End-of-day (EOD) benchmark key figures of a stock for the time range of six months.

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_month_6_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_month_6_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_notation_key_figures_benchmark_week_1_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_week_1_get(identifier, identifier_type, id_notation_benchmark)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_week_1_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_week_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_notation_key_figures_benchmark_year_1_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_year_1_get(identifier, identifier_type, id_notation_benchmark)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_year_1_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_year_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_notation_key_figures_benchmark_year_3_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_year_3_get(identifier, identifier_type, id_notation_benchmark)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_year_3_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_year_3_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_notation_key_figures_benchmark_year_5_get**
> InlineResponse20012 get_stock_notation_key_figures_benchmark_year_5_get(identifier, identifier_type, id_notation_benchmark)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "80728880015" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idNotation" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_notation_key_figures_benchmark_year_5_get(identifier, identifier_type, id_notation_benchmark, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_notation_key_figures_benchmark_year_5_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **id_notation_benchmark** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**|  | [optional]

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

# **get_stock_owner_list**
> InlineResponse2008 get_stock_owner_list(identifier, identifier_type)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language = "_language_example" # str |  (optional)

    try:
        # List of owners for a specific type of a company's shares.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_owner_list(identifier, identifier_type, attributes=attributes, language=language)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_owner_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
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

# **get_stock_recommendation_aggregate_get**
> InlineResponse2003 get_stock_recommendation_aggregate_get(identifier, identifier_type)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Target price and aggregated recommendations for a stock.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_recommendation_aggregate_get(identifier, identifier_type, attributes=attributes)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_recommendation_aggregate_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **get_stock_recommendation_aggregate_history_list**
> InlineResponse2004 get_stock_recommendation_aggregate_history_list(identifier, identifier_type, snapshots)

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier = "PQ6ZGC" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_type = "idInstrument" # str | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    snapshots = [
        "latest",
    ] # [str] | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Current and historical trade recommendations and target prices for a stock.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_stock_recommendation_aggregate_history_list(identifier, identifier_type, snapshots, attributes=attributes)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->get_stock_recommendation_aggregate_history_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **snapshots** | **[str]**|  |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **post_stock_dividend_list**
> InlineResponse20010 post_stock_dividend_list()

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_stock_dividend_list_request = PostStockDividendListRequest(
        data=PostStockDividendListRequestData(
            identifier=PostStockDividendListRequestDataIdentifier(
                value="PQ6ZGC",
                type="idInstrument",
            ),
            filter=PostStockDividendListRequestDataFilter(
                period=PostStockDividendListRequestDataFilterPeriod(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                type=PostStockDividendListRequestDataFilterType(
                    id=3.14,
                ),
            ),
        ),
        meta=PostStockDividendListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["dividends.dates.payment"],
        ),
    ) # PostStockDividendListRequest |  (optional)

    try:
        # List of dividends for a stock.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_dividend_list(post_stock_dividend_list_request=post_stock_dividend_list_request)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_dividend_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_stock_dividend_list_request** | [**PostStockDividendListRequest**](PostStockDividendListRequest.md)|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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
> InlineResponse20013 post_stock_notation_ranking_intraday_list()

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_stock_notation_ranking_intraday_list_request = PostStockNotationRankingIntradayListRequest(
        data=PostStockNotationRankingIntradayListRequestData(
            prices=PostStockNotationRankingIntradayListRequestDataPrices(
                quality="DLY",
            ),
            currency=PostStockNotationRankingIntradayListRequestDataCurrency(
                id=3.14,
            ),
            market=PostStockNotationRankingIntradayListRequestDataMarket(
                ids=[
                    3.14,
                ],
                priority=PostStockNotationRankingIntradayListRequestDataMarketPriority(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            instrument_restriction_list=PostStockNotationRankingIntradayListRequestDataInstrumentRestrictionList(
                ids=[
                    3.14,
                ],
            ),
            notation_restriction_list=PostStockNotationRankingIntradayListRequestDataNotationRestrictionList(
                ids=[
                    3.14,
                ],
            ),
            industry_classification=PostStockNotationRankingIntradayListRequestDataIndustryClassification(
                ids=[
                    3.14,
                ],
            ),
            company=PostStockNotationRankingIntradayListRequestDataCompany(
                country=PostStockNotationRankingIntradayListRequestDataCompanyCountry(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            index_membership=PostStockNotationRankingIntradayListRequestDataIndexMembership(
                ids=[
                    "ids_example",
                ],
                use_alternative_notation=False,
            ),
            performance=PostStockNotationRankingIntradayListRequestDataPerformance(
                relative=PostStockNotationRankingIntradayListRequestDataPerformanceRelative(
                    minimum=PostStockNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=PostStockNotationRankingIntradayListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["-trade.performance.relative"],
            pagination=PostStockNotationRankingIntradayListRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostStockNotationRankingIntradayListRequest |  (optional)

    try:
        # Ranking of stocks' notations using intraday figures.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_notation_ranking_intraday_list(post_stock_notation_ranking_intraday_list_request=post_stock_notation_ranking_intraday_list_request)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_notation_ranking_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_stock_notation_ranking_intraday_list_request** | [**PostStockNotationRankingIntradayListRequest**](PostStockNotationRankingIntradayListRequest.md)|  | [optional]

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

# **post_stock_notation_screener_search**
> InlineResponse20014 post_stock_notation_screener_search()

Screener for stocks' notations based on stock-specific parameters.

Screener for stocks' notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Currency dependent current figures on company level (see attribute `currentKeyFigures.company.currencyDependent`) or on share instrument level (see attribute `currentKeyFigures.shareInstrument.currencyDependent`) are only returned if the currency (see parameter `currentKeyFigures.company.currencyDependent.currency.isoCode` or parameter `currentKeyFigures.shareInstrument.currencyDependent.currency.isoCode` respectively) are set.  Parameters for up to three fiscal years might be used in one request, see attribute `reportedKeyFigures`; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute `estimates`. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter `reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode` and parameter `estimates.currencyDependentEstimates.currency.isoCode` respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter `reportedKeyFigures.fiscalYear`) or for the estimates (see parameter `estimates.fiscalYear`) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_stock_notation_screener_search_request = PostStockNotationScreenerSearchRequest(
        data=PostStockNotationScreenerSearchRequestData(
            validation=PostStockNotationScreenerSearchRequestDataValidation(
                only_active=True,
                only_not_suspended=False,
                prices=PostStockNotationScreenerSearchRequestDataValidationPrices(
                    quality="DLY",
                    latest=PostStockNotationScreenerSearchRequestDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=PostStockNotationScreenerSearchRequestDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=PostStockNotationScreenerSearchRequestDataValidationValueUnit(
                    restrict=PostStockNotationScreenerSearchRequestDataValidationValueUnitRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataValidationValueUnitExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=PostStockNotationScreenerSearchRequestDataValidationMarket(
                    selection=PostStockNotationScreenerSearchRequestDataValidationMarketSelection(
                        restrict=PostStockNotationScreenerSearchRequestDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=PostStockNotationScreenerSearchRequestDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=PostStockNotationScreenerSearchRequestDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionList(
                    restrict=PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=PostStockNotationScreenerSearchRequestDataValidationNotationSelectionList(
                    restrict=PostStockNotationScreenerSearchRequestDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            stock_type=[
                "common",
            ],
            industry_classification=PostStockNotationScreenerSearchRequestDataIndustryClassification(
                restrict=PostStockNotationScreenerSearchRequestDataIndustryClassificationRestrict(
                    ids=[
                        3.14,
                    ],
                ),
                exclude=PostStockNotationScreenerSearchRequestDataIndustryClassificationExclude(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            company=PostStockNotationScreenerSearchRequestDataCompany(
                country=PostStockNotationScreenerSearchRequestDataCompanyCountry(
                    restrict=PostStockNotationScreenerSearchRequestDataCompanyCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataCompanyCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            index_membership=PostStockNotationScreenerSearchRequestDataIndexMembership(
                ids=[
                    "ids_example",
                ],
            ),
            esg=PostStockNotationScreenerSearchRequestDataEsg(
                truvalue_labs=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabs(
                    sasb=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasb(
                        all_categories=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategories(
                            insight=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsight(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            momentum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesMomentum(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            ranking=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesRanking(
                                minimum="leader",
                            ),
                        ),
                        materiality=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbMateriality(
                            insight=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsight(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            momentum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesMomentum(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            ranking=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesRanking(
                                minimum="leader",
                            ),
                        ),
                    ),
                    sdg=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdg(
                        impact=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpact(
                            insight=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsight(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            momentum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSdgImpactMomentum(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            compliance=PostStockNotationScreenerSearchRequestDataCompliance(
                france=PostStockNotationScreenerSearchRequestDataComplianceFrance(
                    _or=[
                        PostStockNotationScreenerSearchRequestDataComplianceFranceOr(
                            _and=[
                                PostStockNotationScreenerSearchRequestDataComplianceFranceAnd(
                                    id=2,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
            ),
            current_key_figures=PostStockNotationScreenerSearchRequestDataCurrentKeyFigures(
                company=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompany(
                    shares_outstanding=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstanding(
                        minimum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMinimum(
                            value="value_example",
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMaximum(
                            value="value_example",
                            inclusive=True,
                        ),
                    ),
                    free_float=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyFreeFloat(
                        minimum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMinimum(
                            value="value_example",
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMaximum(
                            value="value_example",
                            inclusive=True,
                        ),
                    ),
                    currency_dependent=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependent(
                        currency=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentCurrency(
                            iso_code="EUR",
                        ),
                        market_capitalization_shares_outstanding=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentMarketCapitalizationSharesOutstanding(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        per_share=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShare(
                            earnings=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShareEarnings(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            book_value=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShareBookValue(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            cash_flow=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShareCashFlow(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            sales=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentPerShareSales(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
                share_instrument=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrument(
                    shares_outstanding=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstanding(
                        minimum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMinimum(
                            value="value_example",
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMaximum(
                            value="value_example",
                            inclusive=True,
                        ),
                    ),
                    free_float=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyFreeFloat(
                        minimum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMinimum(
                            value="value_example",
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanySharesOutstandingMaximum(
                            value="value_example",
                            inclusive=True,
                        ),
                    ),
                    ratios=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatios(
                        price_earnings=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatiosPriceEarnings(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_book_value=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatiosPriceBookValue(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_cash_flow=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatiosPriceCashFlow(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_sales=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatiosPriceSales(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        dividend_yield=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatiosDividendYield(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        earnings_yield=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentRatiosEarningsYield(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    currency_dependent=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentCurrencyDependent(
                        currency=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentCurrency(
                            iso_code="EUR",
                        ),
                        market_capitalization_shares_outstanding=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresCompanyCurrencyDependentMarketCapitalizationSharesOutstanding(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        per_share=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentCurrencyDependentPerShare(
                            dividend=PostStockNotationScreenerSearchRequestDataCurrentKeyFiguresShareInstrumentCurrencyDependentPerShareDividend(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
            ),
            reported_key_figures=[
                PostStockNotationScreenerSearchRequestDataReportedKeyFigures(
                    fiscal_year=PostStockNotationScreenerSearchRequestDataFiscalYear(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_key_figures=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures(
                        currency=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresCurrency(
                            iso_code="EUR",
                        ),
                        market_capitalization=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresMarketCapitalization(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebit=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresEbit(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebitda=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresEbitda(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        per_share=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare(
                            sales=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            recurring_diluted_earnings=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            dividends=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            book_value=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            cash_flow=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    ebit_margin=PostStockNotationScreenerSearchRequestDataEbitMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ebitda_margin=PostStockNotationScreenerSearchRequestDataEbitdaMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    net_income_margin=PostStockNotationScreenerSearchRequestDataNetIncomeMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    gross_income_margin=PostStockNotationScreenerSearchRequestDataGrossIncomeMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    operating_margin=PostStockNotationScreenerSearchRequestDataOperatingMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_assets=PostStockNotationScreenerSearchRequestDataReturnOnAssets(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_equity=PostStockNotationScreenerSearchRequestDataReturnOnEquity(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ratios=PostStockNotationScreenerSearchRequestDataRatios(
                        price_sales=PostStockNotationScreenerSearchRequestDataRatiosPriceSales(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_earnings=PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_book_value=PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_cash_flow=PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_free_cash_flow=PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        dividend_yield=PostStockNotationScreenerSearchRequestDataRatiosDividendYield(
                            minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebit=PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebitda=PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_sales=PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        debt_equity=PostStockNotationScreenerSearchRequestDataRatiosDebtEquity(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ],
            benchmark=PostStockNotationScreenerSearchRequestDataBenchmark(
                type="local",
                beta=PostStockNotationScreenerSearchRequestDataBenchmarkBeta(
                    week1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaWeek1(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonth1(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonths3(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonths6(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYear1(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYears3(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYears5(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                correlation=PostStockNotationScreenerSearchRequestDataBenchmarkCorrelation(
                    week1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaWeek1(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonth1(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonths3(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonths6(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYear1(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYears3(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYears5(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                outperformance=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformance(
                    week1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            performance=PostStockNotationScreenerSearchRequestDataPerformance(
                intraday=PostStockNotationScreenerSearchRequestDataPerformanceIntraday(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                end_of_day=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay(
                    day1=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayDay1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=PostStockNotationScreenerSearchRequestDataVolatility(
                week1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                month1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months6=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years5=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year_to_date=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            trading_value=PostStockNotationScreenerSearchRequestDataTradingValue(
                average=PostStockNotationScreenerSearchRequestDataTradingValueAverage(
                    days5=PostStockNotationScreenerSearchRequestDataTradingValueAverageDays5(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    days30=PostStockNotationScreenerSearchRequestDataTradingValueAverageDays30(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            simple_moving_average=PostStockNotationScreenerSearchRequestDataSimpleMovingAverage(
                days20=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days50=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays50(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days200=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays200(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                trading_days_since_crossover=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossover(
                    sma20vs50=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50(
                        number_days=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays(
                            minimum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                    sma50vs200=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200(
                        number_days=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDays(
                            minimum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                ),
            ),
            rsi_wilder=PostStockNotationScreenerSearchRequestDataRsiWilder(
                days14=PostStockNotationScreenerSearchRequestDataRsiWilderDays14(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            recommendation=PostStockNotationScreenerSearchRequestDataRecommendation(
                counts=PostStockNotationScreenerSearchRequestDataRecommendationCounts(
                    total=PostStockNotationScreenerSearchRequestDataRecommendationCountsTotal(
                        minimum=PostStockNotationScreenerSearchRequestDataRecommendationCountsTotalMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataRecommendationCountsTotalMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                consensus=PostStockNotationScreenerSearchRequestDataRecommendationConsensus(
                    range=PostStockNotationScreenerSearchRequestDataRecommendationConsensusRange(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    change=PostStockNotationScreenerSearchRequestDataRecommendationConsensusChange(
                        week1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaWeek1(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        month1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonth1(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        months3=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonths3(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        months6=PostStockNotationScreenerSearchRequestDataBenchmarkBetaMonths6(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        year1=PostStockNotationScreenerSearchRequestDataBenchmarkBetaYear1(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ),
            estimates=[
                PostStockNotationScreenerSearchRequestDataEstimates(
                    fiscal_year=PostStockNotationScreenerSearchRequestDataFiscalYear1(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_estimates=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimates(
                        currency=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesCurrency(
                            iso_code="EUR",
                        ),
                        ebit=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbit(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        ebitda=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitda(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        per_share=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShare(
                            sales=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareSales(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            earnings=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareEarnings(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            dividends=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareDividends(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            cash_flow=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareCashFlow(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                        ),
                    ),
                    return_on_assets=PostStockNotationScreenerSearchRequestDataReturnOnAssets1(
                        mean=PostStockNotationScreenerSearchRequestDataReturnOnAssets1Mean(
                            minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    return_on_equity=PostStockNotationScreenerSearchRequestDataReturnOnEquity1(
                        mean=PostStockNotationScreenerSearchRequestDataReturnOnAssets1Mean(
                            minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    ratios=PostStockNotationScreenerSearchRequestDataRatios1(
                        price_sales=PostStockNotationScreenerSearchRequestDataRatios1PriceSales(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings=PostStockNotationScreenerSearchRequestDataRatios1PriceEarnings(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings_growth=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowth(
                            mean=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowthMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_book_value=PostStockNotationScreenerSearchRequestDataRatios1PriceBookValue(
                            mean=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowthMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_cash_flow=PostStockNotationScreenerSearchRequestDataRatios1PriceCashFlow(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_free_cash_flow=PostStockNotationScreenerSearchRequestDataRatios1PriceFreeCashFlow(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        dividend_yield=PostStockNotationScreenerSearchRequestDataRatios1DividendYield(
                            mean=PostStockNotationScreenerSearchRequestDataReturnOnAssets1Mean(
                                minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebit=PostStockNotationScreenerSearchRequestDataRatios1EnterpriseValueEbit(
                            mean=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowthMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebitda=PostStockNotationScreenerSearchRequestDataRatios1EnterpriseValueEbitda(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_sales=PostStockNotationScreenerSearchRequestDataRatios1EnterpriseValueSales(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
            ],
        ),
        meta=PostStockNotationScreenerSearchRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=["instrument.name"],
            pagination=PostStockNotationScreenerSearchRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostStockNotationScreenerSearchRequest |  (optional)

    try:
        # Screener for stocks' notations based on stock-specific parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_notation_screener_search(post_stock_notation_screener_search_request=post_stock_notation_screener_search_request)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_notation_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_stock_notation_screener_search_request** | [**PostStockNotationScreenerSearchRequest**](PostStockNotationScreenerSearchRequest.md)|  | [optional]

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

# **post_stock_notation_screener_value_ranges_get**
> InlineResponse20015 post_stock_notation_screener_value_ranges_get()

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_stock_notation_screener_value_ranges_get_request = PostStockNotationScreenerValueRangesGetRequest(
        data=PostStockNotationScreenerValueRangesGetRequestData(
            validation=PostStockNotationScreenerSearchRequestDataValidation(
                only_active=True,
                only_not_suspended=False,
                prices=PostStockNotationScreenerSearchRequestDataValidationPrices(
                    quality="DLY",
                    latest=PostStockNotationScreenerSearchRequestDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=PostStockNotationScreenerSearchRequestDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=PostStockNotationScreenerSearchRequestDataValidationValueUnit(
                    restrict=PostStockNotationScreenerSearchRequestDataValidationValueUnitRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataValidationValueUnitExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=PostStockNotationScreenerSearchRequestDataValidationMarket(
                    selection=PostStockNotationScreenerSearchRequestDataValidationMarketSelection(
                        restrict=PostStockNotationScreenerSearchRequestDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=PostStockNotationScreenerSearchRequestDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=PostStockNotationScreenerSearchRequestDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionList(
                    restrict=PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=PostStockNotationScreenerSearchRequestDataValidationNotationSelectionList(
                    restrict=PostStockNotationScreenerSearchRequestDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            stock_type=[
                "common",
            ],
            industry_classification=PostStockNotationScreenerSearchRequestDataIndustryClassification(
                restrict=PostStockNotationScreenerSearchRequestDataIndustryClassificationRestrict(
                    ids=[
                        3.14,
                    ],
                ),
                exclude=PostStockNotationScreenerSearchRequestDataIndustryClassificationExclude(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            company=PostStockNotationScreenerSearchRequestDataCompany(
                country=PostStockNotationScreenerSearchRequestDataCompanyCountry(
                    restrict=PostStockNotationScreenerSearchRequestDataCompanyCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=PostStockNotationScreenerSearchRequestDataCompanyCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            index_membership=PostStockNotationScreenerSearchRequestDataIndexMembership(
                ids=[
                    "ids_example",
                ],
            ),
            compliance=PostStockNotationScreenerSearchRequestDataCompliance(
                france=PostStockNotationScreenerSearchRequestDataComplianceFrance(
                    _or=[
                        PostStockNotationScreenerSearchRequestDataComplianceFranceOr(
                            _and=[
                                PostStockNotationScreenerSearchRequestDataComplianceFranceAnd(
                                    id=2,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
            ),
            reported_key_figures=[
                PostStockNotationScreenerSearchRequestDataReportedKeyFigures(
                    fiscal_year=PostStockNotationScreenerSearchRequestDataFiscalYear(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_key_figures=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFigures(
                        currency=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresCurrency(
                            iso_code="EUR",
                        ),
                        market_capitalization=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresMarketCapitalization(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebit=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresEbit(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        ebitda=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresEbitda(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        per_share=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShare(
                            sales=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareSales(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            recurring_diluted_earnings=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            dividends=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareDividends(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            book_value=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareBookValue(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                            cash_flow=PostStockNotationScreenerSearchRequestDataCurrencyDependentKeyFiguresPerShareCashFlow(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    ebit_margin=PostStockNotationScreenerSearchRequestDataEbitMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ebitda_margin=PostStockNotationScreenerSearchRequestDataEbitdaMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    net_income_margin=PostStockNotationScreenerSearchRequestDataNetIncomeMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    gross_income_margin=PostStockNotationScreenerSearchRequestDataGrossIncomeMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    operating_margin=PostStockNotationScreenerSearchRequestDataOperatingMargin(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_assets=PostStockNotationScreenerSearchRequestDataReturnOnAssets(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    return_on_equity=PostStockNotationScreenerSearchRequestDataReturnOnEquity(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    ratios=PostStockNotationScreenerSearchRequestDataRatios(
                        price_sales=PostStockNotationScreenerSearchRequestDataRatiosPriceSales(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_earnings=PostStockNotationScreenerSearchRequestDataRatiosPriceEarnings(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_book_value=PostStockNotationScreenerSearchRequestDataRatiosPriceBookValue(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_cash_flow=PostStockNotationScreenerSearchRequestDataRatiosPriceCashFlow(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        price_free_cash_flow=PostStockNotationScreenerSearchRequestDataRatiosPriceFreeCashFlow(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        dividend_yield=PostStockNotationScreenerSearchRequestDataRatiosDividendYield(
                            minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebit=PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbit(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_ebitda=PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueEbitda(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        enterprise_value_sales=PostStockNotationScreenerSearchRequestDataRatiosEnterpriseValueSales(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        debt_equity=PostStockNotationScreenerSearchRequestDataRatiosDebtEquity(
                            minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ],
            performance=PostStockNotationScreenerSearchRequestDataPerformance(
                intraday=PostStockNotationScreenerSearchRequestDataPerformanceIntraday(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                end_of_day=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDay(
                    day1=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayDay1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate(
                        minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=PostStockNotationScreenerSearchRequestDataVolatility(
                week1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceWeek1(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                month1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonth1(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths3(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months6=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceMonths6(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year1=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYear1(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years3=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears3(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years5=PostStockNotationScreenerSearchRequestDataBenchmarkOutperformanceYears5(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year_to_date=PostStockNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate(
                    minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            trading_value=PostStockNotationScreenerSearchRequestDataTradingValue(
                average=PostStockNotationScreenerSearchRequestDataTradingValueAverage(
                    days5=PostStockNotationScreenerSearchRequestDataTradingValueAverageDays5(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    days30=PostStockNotationScreenerSearchRequestDataTradingValueAverageDays30(
                        minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            simple_moving_average=PostStockNotationScreenerSearchRequestDataSimpleMovingAverage(
                days20=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays20(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days50=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays50(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                days200=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageDays200(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                trading_days_since_crossover=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossover(
                    sma20vs50=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50(
                        number_days=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays(
                            minimum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                    sma50vs200=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200(
                        number_days=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDays(
                            minimum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200NumberDaysMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                        direction="up",
                    ),
                ),
            ),
            rsi_wilder=PostStockNotationScreenerSearchRequestDataRsiWilder(
                days14=PostStockNotationScreenerSearchRequestDataRsiWilderDays14(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            recommendation=PostStockNotationScreenerValueRangesGetRequestDataRecommendation(
                counts=PostStockNotationScreenerSearchRequestDataRecommendationCounts(
                    total=PostStockNotationScreenerSearchRequestDataRecommendationCountsTotal(
                        minimum=PostStockNotationScreenerSearchRequestDataRecommendationCountsTotalMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=PostStockNotationScreenerSearchRequestDataRecommendationCountsTotalMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                consensus=PostStockNotationScreenerValueRangesGetRequestDataRecommendationConsensus(
                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            estimates=[
                PostStockNotationScreenerSearchRequestDataEstimates(
                    fiscal_year=PostStockNotationScreenerSearchRequestDataFiscalYear1(
                        year_end=3.14,
                        year=3.14,
                    ),
                    currency_dependent_estimates=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimates(
                        currency=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesCurrency(
                            iso_code="EUR",
                        ),
                        ebit=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbit(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        ebitda=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitda(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        per_share=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShare(
                            sales=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareSales(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            earnings=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareEarnings(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            dividends=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareDividends(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                            cash_flow=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesPerShareCashFlow(
                                mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                    minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                    maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                        value=3.14,
                                        inclusive=True,
                                    ),
                                ),
                            ),
                        ),
                    ),
                    return_on_assets=PostStockNotationScreenerSearchRequestDataReturnOnAssets1(
                        mean=PostStockNotationScreenerSearchRequestDataReturnOnAssets1Mean(
                            minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    return_on_equity=PostStockNotationScreenerSearchRequestDataReturnOnEquity1(
                        mean=PostStockNotationScreenerSearchRequestDataReturnOnAssets1Mean(
                            minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    ratios=PostStockNotationScreenerSearchRequestDataRatios1(
                        price_sales=PostStockNotationScreenerSearchRequestDataRatios1PriceSales(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings=PostStockNotationScreenerSearchRequestDataRatios1PriceEarnings(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_earnings_growth=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowth(
                            mean=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowthMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_book_value=PostStockNotationScreenerSearchRequestDataRatios1PriceBookValue(
                            mean=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowthMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_cash_flow=PostStockNotationScreenerSearchRequestDataRatios1PriceCashFlow(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        price_free_cash_flow=PostStockNotationScreenerSearchRequestDataRatios1PriceFreeCashFlow(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        dividend_yield=PostStockNotationScreenerSearchRequestDataRatios1DividendYield(
                            mean=PostStockNotationScreenerSearchRequestDataReturnOnAssets1Mean(
                                minimum=PostStockNotationScreenerSearchRequestDataEbitMarginMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEbitMarginMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebit=PostStockNotationScreenerSearchRequestDataRatios1EnterpriseValueEbit(
                            mean=PostStockNotationScreenerSearchRequestDataRatios1PriceEarningsGrowthMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_ebitda=PostStockNotationScreenerSearchRequestDataRatios1EnterpriseValueEbitda(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                        enterprise_value_sales=PostStockNotationScreenerSearchRequestDataRatios1EnterpriseValueSales(
                            mean=PostStockNotationScreenerSearchRequestDataCurrencyDependentEstimatesEbitMean(
                                minimum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=PostStockNotationScreenerSearchRequestDataEsgTruvalueLabsSasbAllCategoriesInsightMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                ),
            ],
        ),
        meta=PostCompanyKeyItemsCurrentGetByInstrumentRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # PostStockNotationScreenerValueRangesGetRequest |  (optional)

    try:
        # Possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_stock_notation_screener_value_ranges_get(post_stock_notation_screener_value_ranges_get_request=post_stock_notation_screener_value_ranges_get_request)

        pprint(api_response)

    except fds.sdk.StocksAPIforDigitalPortals.ApiException as e:
        print("Exception when calling StockApi->post_stock_notation_screener_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_stock_notation_screener_value_ranges_get_request** | [**PostStockNotationScreenerValueRangesGetRequest**](PostStockNotationScreenerValueRangesGetRequest.md)|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

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

