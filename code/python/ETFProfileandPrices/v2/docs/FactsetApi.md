# fds.sdk.ETFProfileandPrices.FactsetApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**factset_etf_allocation_asset_list_by_symbol_get**](FactsetApi.md#factset_etf_allocation_asset_list_by_symbol_get) | **GET** /factset/etf/allocation/asset/listBySymbol | This endpoint returns selected ETP&#39;s asset allocations.
[**factset_etf_allocation_country_list_by_symbol_get**](FactsetApi.md#factset_etf_allocation_country_list_by_symbol_get) | **GET** /factset/etf/allocation/country/listBySymbol | This endpoint returns selected ETP&#39;s country allocations.
[**factset_etf_allocation_exchange_list_by_symbol_get**](FactsetApi.md#factset_etf_allocation_exchange_list_by_symbol_get) | **GET** /factset/etf/allocation/exchange/listBySymbol | This endpoint returns selected ETP&#39;s exchange allocations.
[**factset_etf_allocation_region_list_by_symbol_get**](FactsetApi.md#factset_etf_allocation_region_list_by_symbol_get) | **GET** /factset/etf/allocation/region/listBySymbol | This endpoint returns selected ETP&#39;s region allocations.
[**factset_etf_allocation_sector_list_by_symbol_get**](FactsetApi.md#factset_etf_allocation_sector_list_by_symbol_get) | **GET** /factset/etf/allocation/sector/listBySymbol | This endpoint returns selected ETP&#39;s sector allocations.
[**factset_etf_characteristics_get_by_symbol_get**](FactsetApi.md#factset_etf_characteristics_get_by_symbol_get) | **GET** /factset/etf/characteristics/getBySymbol | Retrieve basic characteristic information for a specified ETP.
[**factset_etf_class_category_broad_list_get**](FactsetApi.md#factset_etf_class_category_broad_list_get) | **GET** /factset/etf/class/category/broad/list | List of ETP class broad categories.
[**factset_etf_class_category_focus_list_get**](FactsetApi.md#factset_etf_class_category_focus_list_get) | **GET** /factset/etf/class/category/focus/list | List of ETP class focus categories.
[**factset_etf_class_category_niche_list_get**](FactsetApi.md#factset_etf_class_category_niche_list_get) | **GET** /factset/etf/class/category/niche/list | List of ETP class niche categories.
[**factset_etf_class_geography_list_get**](FactsetApi.md#factset_etf_class_geography_list_get) | **GET** /factset/etf/class/geography/list | List of ETP class geographies.
[**factset_etf_class_get_by_symbol_get**](FactsetApi.md#factset_etf_class_get_by_symbol_get) | **GET** /factset/etf/class/getBySymbol | Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.
[**factset_etf_distribution_get_by_symbol_get**](FactsetApi.md#factset_etf_distribution_get_by_symbol_get) | **GET** /factset/etf/distribution/getBySymbol | Retrieve an ETP&#39;s current distribution details.
[**factset_etf_fund_flows_get_by_symbol_get**](FactsetApi.md#factset_etf_fund_flows_get_by_symbol_get) | **GET** /factset/etf/fundFlows/getBySymbol | Retrieve an ETP&#39;s cash inflow/outflows for various time periods.
[**factset_etf_get_by_symbol_get**](FactsetApi.md#factset_etf_get_by_symbol_get) | **GET** /factset/etf/getBySymbol | Retrieve basic profile information for a specified ETP.
[**factset_etf_growth_of_ten_k_list_by_symbol_get**](FactsetApi.md#factset_etf_growth_of_ten_k_list_by_symbol_get) | **GET** /factset/etf/growthOfTenK/listBySymbol | This endpoint returns selected ETP&#39;s Growth of 10K calculated values.
[**factset_etf_holdings_list_by_symbol_get**](FactsetApi.md#factset_etf_holdings_list_by_symbol_get) | **GET** /factset/etf/holdings/listBySymbol | Holdings details for an individual ETP.
[**factset_etf_price_get_by_symbol_get**](FactsetApi.md#factset_etf_price_get_by_symbol_get) | **GET** /factset/etf/price/getBySymbol | Retrieve historical ETP NAV values.
[**factset_etf_returns_get_by_symbol_get**](FactsetApi.md#factset_etf_returns_get_by_symbol_get) | **GET** /factset/etf/returns/getBySymbol | Retrieve total return data for a specified ETP.
[**factset_etf_strategy_get_by_symbol_get**](FactsetApi.md#factset_etf_strategy_get_by_symbol_get) | **GET** /factset/etf/strategy/getBySymbol | Retrieve various classification details for a specified ETP.
[**factset_etf_strategy_segment_list_get**](FactsetApi.md#factset_etf_strategy_segment_list_get) | **GET** /factset/etf/strategy/segment/list | Retrieve a list of ETP strategy segments.
[**factset_etf_structure_get_by_symbol_get**](FactsetApi.md#factset_etf_structure_get_by_symbol_get) | **GET** /factset/etf/structure/getBySymbol | Retrieve the basic structure information for a specified ETP.
[**factset_etf_taxes_and_fees_us_get_by_symbol_get**](FactsetApi.md#factset_etf_taxes_and_fees_us_get_by_symbol_get) | **GET** /factset/etf/taxesAndFees/us/getBySymbol | Retrieve the tax and fee related information for a specified ETP.
[**factset_etf_time_series_list_by_symbol_get**](FactsetApi.md#factset_etf_time_series_list_by_symbol_get) | **GET** /factset/etf/timeSeries/listBySymbol | Retrieve historical NAV data for a specified ETP.


# **factset_etf_allocation_asset_list_by_symbol_get**
> InlineResponse2001 factset_etf_allocation_asset_list_by_symbol_get(symbol)

This endpoint returns selected ETP's asset allocations.

This endpoint returns selected ETP's allocations grouped by asset class. The response will be sorted by weight in descending order.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # This endpoint returns selected ETP's asset allocations.
        api_response = api_instance.factset_etf_allocation_asset_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_asset_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # This endpoint returns selected ETP's asset allocations.
        api_response = api_instance.factset_etf_allocation_asset_list_by_symbol_get(symbol, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_asset_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_allocation_country_list_by_symbol_get**
> InlineResponse2002 factset_etf_allocation_country_list_by_symbol_get(symbol)

This endpoint returns selected ETP's country allocations.

This endpoint returns selected ETP's allocations grouped by country names. The response will be sorted by weight in descending order.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2002 import InlineResponse2002
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # This endpoint returns selected ETP's country allocations.
        api_response = api_instance.factset_etf_allocation_country_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_country_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # This endpoint returns selected ETP's country allocations.
        api_response = api_instance.factset_etf_allocation_country_list_by_symbol_get(symbol, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_country_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_allocation_exchange_list_by_symbol_get**
> InlineResponse2003 factset_etf_allocation_exchange_list_by_symbol_get(symbol)

This endpoint returns selected ETP's exchange allocations.

This endpoint returns selected ETP's allocations grouped by exchanges. The response will be sorted by weight in descending order.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2003 import InlineResponse2003
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # This endpoint returns selected ETP's exchange allocations.
        api_response = api_instance.factset_etf_allocation_exchange_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_exchange_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # This endpoint returns selected ETP's exchange allocations.
        api_response = api_instance.factset_etf_allocation_exchange_list_by_symbol_get(symbol, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_exchange_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_allocation_region_list_by_symbol_get**
> InlineResponse2004 factset_etf_allocation_region_list_by_symbol_get(symbol)

This endpoint returns selected ETP's region allocations.

This endpoint returns selected ETP's allocations grouped by region names. The response will be sorted by weight in descending order.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2004 import InlineResponse2004
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # This endpoint returns selected ETP's region allocations.
        api_response = api_instance.factset_etf_allocation_region_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_region_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # This endpoint returns selected ETP's region allocations.
        api_response = api_instance.factset_etf_allocation_region_list_by_symbol_get(symbol, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_region_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_allocation_sector_list_by_symbol_get**
> InlineResponse2005 factset_etf_allocation_sector_list_by_symbol_get(symbol)

This endpoint returns selected ETP's sector allocations.

This endpoint returns selected ETP's allocations grouped by sector names. The response will be sorted by weight in descending order.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2005 import InlineResponse2005
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # This endpoint returns selected ETP's sector allocations.
        api_response = api_instance.factset_etf_allocation_sector_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_sector_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # This endpoint returns selected ETP's sector allocations.
        api_response = api_instance.factset_etf_allocation_sector_list_by_symbol_get(symbol, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_allocation_sector_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_characteristics_get_by_symbol_get**
> InlineResponse2006 factset_etf_characteristics_get_by_symbol_get(symbol)

Retrieve basic characteristic information for a specified ETP.

An ETP has many unique characteristics specific to its composition that differentiate it from other products. This includes details on leverage, hedging, derivatives, and service providers.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2006 import InlineResponse2006
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETF defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve basic characteristic information for a specified ETP.
        api_response = api_instance.factset_etf_characteristics_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_characteristics_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve basic characteristic information for a specified ETP.
        api_response = api_instance.factset_etf_characteristics_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_characteristics_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETF defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_class_category_broad_list_get**
> InlineResponse2008 factset_etf_class_category_broad_list_get()

List of ETP class broad categories.

List of ETP class broad categories.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2008 import InlineResponse2008
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of ETP class broad categories.
        api_response = api_instance.factset_etf_class_category_broad_list_get(attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_class_category_broad_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_class_category_focus_list_get**
> InlineResponse2009 factset_etf_class_category_focus_list_get()

List of ETP class focus categories.

List of ETP class focus categories.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2009 import InlineResponse2009
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of ETP class focus categories.
        api_response = api_instance.factset_etf_class_category_focus_list_get(attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_class_category_focus_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_class_category_niche_list_get**
> InlineResponse20010 factset_etf_class_category_niche_list_get()

List of ETP class niche categories.

List of ETP class niche categories.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20010 import InlineResponse20010
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of ETP class niche categories.
        api_response = api_instance.factset_etf_class_category_niche_list_get(attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_class_category_niche_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_class_geography_list_get**
> InlineResponse20011 factset_etf_class_geography_list_get()

List of ETP class geographies.

List of ETP class geographies.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20011 import InlineResponse20011
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of ETP class geographies.
        api_response = api_instance.factset_etf_class_geography_list_get(attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_class_geography_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_class_get_by_symbol_get**
> InlineResponse2007 factset_etf_class_get_by_symbol_get(symbol)

Retrieve an ETP's classification specific to asset class, geography, or investment strategy.

ETP classification is divided into three categories: Asset Class, Geography, and Investment Strategy. Asset class is determined based on the various asset types held by the fund, A fund's geography can be classified by region (e.g. Asia-Pac), specific geography (e.g. China) or economic development (e.g. BRIC). An ETP's investment strategy is classified in broad categories (e.g. Large Cap) and more granular categorizations.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response2007 import InlineResponse2007
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve an ETP's classification specific to asset class, geography, or investment strategy.
        api_response = api_instance.factset_etf_class_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_class_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve an ETP's classification specific to asset class, geography, or investment strategy.
        api_response = api_instance.factset_etf_class_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_class_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
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

# **factset_etf_distribution_get_by_symbol_get**
> InlineResponse20012 factset_etf_distribution_get_by_symbol_get(symbol)

Retrieve an ETP's current distribution details.

Retrieve distribution-related details for a specific ETP including dividend and capital gain distribution details.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20012 import InlineResponse20012
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve an ETP's current distribution details.
        api_response = api_instance.factset_etf_distribution_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_distribution_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve an ETP's current distribution details.
        api_response = api_instance.factset_etf_distribution_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_distribution_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
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

# **factset_etf_fund_flows_get_by_symbol_get**
> InlineResponse20013 factset_etf_fund_flows_get_by_symbol_get(symbol)

Retrieve an ETP's cash inflow/outflows for various time periods.

Retrieve the amount invested or divested in a specific ETP over various time periods including one-day, one-week, one-month, one-year, and YTD.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20013 import InlineResponse20013
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve an ETP's cash inflow/outflows for various time periods.
        api_response = api_instance.factset_etf_fund_flows_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_fund_flows_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve an ETP's cash inflow/outflows for various time periods.
        api_response = api_instance.factset_etf_fund_flows_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_fund_flows_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

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

# **factset_etf_get_by_symbol_get**
> InlineResponse200 factset_etf_get_by_symbol_get(symbol)

Retrieve basic profile information for a specified ETP.

An ETP can be profiled by defining several common attributes such as issuer, fund description, and benchmark.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response200 import InlineResponse200
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve basic profile information for a specified ETP.
        api_response = api_instance.factset_etf_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve basic profile information for a specified ETP.
        api_response = api_instance.factset_etf_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
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

# **factset_etf_growth_of_ten_k_list_by_symbol_get**
> InlineResponse20014 factset_etf_growth_of_ten_k_list_by_symbol_get(symbol)

This endpoint returns selected ETP's Growth of 10K calculated values.

Growth of 10K (or growth of 10,000) is a commonly used chart that highlights the change in the value of an initial 10,000 investment in the ETP during a given period of time. Often, this period of time is either since inception or the calculation between the pre-defined range.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20014 import InlineResponse20014
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    time_period = "1M" # str | Historice NAV date value. (optional)
    calculation_type = "I" # str | Historice NAV date value. (optional)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # This endpoint returns selected ETP's Growth of 10K calculated values.
        api_response = api_instance.factset_etf_growth_of_ten_k_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_growth_of_ten_k_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # This endpoint returns selected ETP's Growth of 10K calculated values.
        api_response = api_instance.factset_etf_growth_of_ten_k_list_by_symbol_get(symbol, time_period=time_period, calculation_type=calculation_type, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_growth_of_ten_k_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **time_period** | **str**| Historice NAV date value. | [optional]
 **calculation_type** | **str**| Historice NAV date value. | [optional]
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

# **factset_etf_holdings_list_by_symbol_get**
> InlineResponse20015 factset_etf_holdings_list_by_symbol_get(symbol)

Holdings details for an individual ETP.

Retrieve an ETP's holdings information including security, shares held, and weight.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20015 import InlineResponse20015
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # Holdings details for an individual ETP.
        api_response = api_instance.factset_etf_holdings_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_holdings_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Holdings details for an individual ETP.
        api_response = api_instance.factset_etf_holdings_list_by_symbol_get(symbol, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_holdings_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_price_get_by_symbol_get**
> InlineResponse20016 factset_etf_price_get_by_symbol_get(symbol)

Retrieve historical ETP NAV values.

Retrieve an ETP's historical NAV and shares outstanding for a specified time range.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20016 import InlineResponse20016
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve historical ETP NAV values.
        api_response = api_instance.factset_etf_price_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_price_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve historical ETP NAV values.
        api_response = api_instance.factset_etf_price_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_price_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_returns_get_by_symbol_get**
> InlineResponse20017 factset_etf_returns_get_by_symbol_get(symbol)

Retrieve total return data for a specified ETP.

An ETP's total return data can be returned for various time frames including 1-month, 3-month, YTD, 1-year, 3-year, and 5-year. Total return market price is used to calcualte price returns. Total return nav is used to calcualte nav returns.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20017 import InlineResponse20017
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    return_type = "price" # str | Return type. (optional) if omitted the server will use the default value of "price"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve total return data for a specified ETP.
        api_response = api_instance.factset_etf_returns_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_returns_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve total return data for a specified ETP.
        api_response = api_instance.factset_etf_returns_get_by_symbol_get(symbol, return_type=return_type, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_returns_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **return_type** | **str**| Return type. | [optional] if omitted the server will use the default value of "price"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_strategy_get_by_symbol_get**
> InlineResponse20018 factset_etf_strategy_get_by_symbol_get(symbol)

Retrieve various classification details for a specified ETP.

ETP's can be classified in many different ways including investment strategy, security weightings, and fund composition.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20018 import InlineResponse20018
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve various classification details for a specified ETP.
        api_response = api_instance.factset_etf_strategy_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_strategy_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve various classification details for a specified ETP.
        api_response = api_instance.factset_etf_strategy_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_strategy_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_strategy_segment_list_get**
> InlineResponse20019 factset_etf_strategy_segment_list_get()

Retrieve a list of ETP strategy segments.

Retrieve the various segments assigned to a specific ETP. Segment data is used to group funds for comparison and relative performance analyses.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20019 import InlineResponse20019
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve a list of ETP strategy segments.
        api_response = api_instance.factset_etf_strategy_segment_list_get(attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_strategy_segment_list_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

# **factset_etf_structure_get_by_symbol_get**
> InlineResponse20020 factset_etf_structure_get_by_symbol_get(symbol)

Retrieve the basic structure information for a specified ETP.

Retrieve details on a fund's structure including its type, investment style (active/passive), and legal structure.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20020 import InlineResponse20020
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve the basic structure information for a specified ETP.
        api_response = api_instance.factset_etf_structure_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_structure_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve the basic structure information for a specified ETP.
        api_response = api_instance.factset_etf_structure_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_structure_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_taxes_and_fees_us_get_by_symbol_get**
> InlineResponse20021 factset_etf_taxes_and_fees_us_get_by_symbol_get(symbol)

Retrieve the tax and fee related information for a specified ETP.

Retrieve various fee and tax related details on a specified ETP including expense ratio and tax treatment for dividends and capital gains.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20021 import InlineResponse20021
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve the tax and fee related information for a specified ETP.
        api_response = api_instance.factset_etf_taxes_and_fees_us_get_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_taxes_and_fees_us_get_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve the tax and fee related information for a specified ETP.
        api_response = api_instance.factset_etf_taxes_and_fees_us_get_by_symbol_get(symbol, attributes=attributes)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_taxes_and_fees_us_get_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

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

# **factset_etf_time_series_list_by_symbol_get**
> InlineResponse20022 factset_etf_time_series_list_by_symbol_get(symbol)

Retrieve historical NAV data for a specified ETP.

Retrieve the historical NAV data and the respective fund flows and shares outstanding for a specified fund and time period. Please refer currency.fund in /factset/etf/getBySymbol for currency value.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ETFProfileandPrices
from fds.sdk.ETFProfileandPrices.api import factset_api
from fds.sdk.ETFProfileandPrices.model.inline_response20022 import InlineResponse20022
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ETFProfileandPrices.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ETFProfileandPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ETFProfileandPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = factset_api.FactsetApi(api_client)
    symbol = "symbol_example" # str | Market symbol of ETP defined by FactSet.
    time_period = "1Y" # str | Time frame of the data. (optional) if omitted the server will use the default value of "1Y"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) if omitted the server will use the default value of 0.0
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20.0

    # example passing only required values which don't have defaults set
    try:
        # Retrieve historical NAV data for a specified ETP.
        api_response = api_instance.factset_etf_time_series_list_by_symbol_get(symbol)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_time_series_list_by_symbol_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve historical NAV data for a specified ETP.
        api_response = api_instance.factset_etf_time_series_list_by_symbol_get(symbol, time_period=time_period, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)
    except fds.sdk.ETFProfileandPrices.ApiException as e:
        print("Exception when calling FactsetApi->factset_etf_time_series_list_by_symbol_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Market symbol of ETP defined by FactSet. |
 **time_period** | **str**| Time frame of the data. | [optional] if omitted the server will use the default value of "1Y"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

