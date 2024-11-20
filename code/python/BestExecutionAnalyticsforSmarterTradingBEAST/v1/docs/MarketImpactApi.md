# fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_cost_impact**](MarketImpactApi.md#get_cost_impact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact
[**get_cost_impact_standard**](MarketImpactApi.md#get_cost_impact_standard) | **GET** /tca/market-impact/cost-impact-standard | Get Standard Cost Impact
[**get_previous_vwaps**](MarketImpactApi.md#get_previous_vwaps) | **GET** /tca/market-impact/previous-vwaps | Get Previous Volume Weighted Average Prices



# **get_cost_impact**
> CostImpactResponseRoot get_cost_impact(date, start_time, end_time, pause_start_time, pause_end_time, security_id, region, order_volume, front_load_half_life)

Get Cost Impact

Get Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api import market_impact_api
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models import *
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
configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = market_impact_api.MarketImpactApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    date = "2024-08-29" # str | Date in the format YYYY-MM-DD
    start_time = "10:00:00" # str | Start Time in the format HH:MM:SS
    end_time = "15:30:00" # str | End Time in the format HH:MM:SS
    pause_start_time = "12:00:00" # str | Pause Start Time in the format HH:MM:SS
    pause_end_time = "12:00:00" # str | Pause End Time in the format HH:MM:SS
    security_id = "FDS" # str | ISIN for European securities, otherwise TICKER
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region
    order_volume = 100000 # float | Order Volume
    front_load_half_life = 5000 # float | Front Load Half Life
    currency = "USD" # str | The ISO 4217 currency code (optional)
    isin = "isin_example" # str | Isin code (optional)
    spread_sensitivity = 0 # float | Spread Sensitivity (optional) if omitted the server will use the default value of 0
    liquidity_sensitivity = 0 # float | Liquidity Sensitivity (optional) if omitted the server will use the default value of 0

    try:
        # Get Cost Impact
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_cost_impact(date, start_time, end_time, pause_start_time, pause_end_time, security_id, region, order_volume, front_load_half_life, currency=currency, isin=isin, spread_sensitivity=spread_sensitivity, liquidity_sensitivity=liquidity_sensitivity)

        pprint(api_response)

    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling MarketImpactApi->get_cost_impact: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **str**| Date in the format YYYY-MM-DD |
 **start_time** | **str**| Start Time in the format HH:MM:SS |
 **end_time** | **str**| End Time in the format HH:MM:SS |
 **pause_start_time** | **str**| Pause Start Time in the format HH:MM:SS |
 **pause_end_time** | **str**| Pause End Time in the format HH:MM:SS |
 **security_id** | **str**| ISIN for European securities, otherwise TICKER |
 **region** | **str**| The two character ISO country code of the trading region. EMEA is used for the European trading region |
 **order_volume** | **float**| Order Volume |
 **front_load_half_life** | **float**| Front Load Half Life |
 **currency** | **str**| The ISO 4217 currency code | [optional]
 **isin** | **str**| Isin code | [optional]
 **spread_sensitivity** | **float**| Spread Sensitivity | [optional] if omitted the server will use the default value of 0
 **liquidity_sensitivity** | **float**| Liquidity Sensitivity | [optional] if omitted the server will use the default value of 0

### Return type

[**CostImpactResponseRoot**](CostImpactResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**400** | Invalid query parameters. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cost_impact_standard**
> CostImpactStandardResponseRoot get_cost_impact_standard(security_id, region, order_volume)

Get Standard Cost Impact

Get Standard Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api import market_impact_api
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models import *
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
configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = market_impact_api.MarketImpactApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    security_id = "FDS" # str | ISIN for European securities, otherwise TICKER
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region
    order_volume = 100000 # float | Order Volume
    currency = "USD" # str | The ISO 4217 currency code (optional)

    try:
        # Get Standard Cost Impact
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_cost_impact_standard(security_id, region, order_volume, currency=currency)

        pprint(api_response)

    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling MarketImpactApi->get_cost_impact_standard: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | **str**| ISIN for European securities, otherwise TICKER |
 **region** | **str**| The two character ISO country code of the trading region. EMEA is used for the European trading region |
 **order_volume** | **float**| Order Volume |
 **currency** | **str**| The ISO 4217 currency code | [optional]

### Return type

[**CostImpactStandardResponseRoot**](CostImpactStandardResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**400** | Invalid query parameters. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_previous_vwaps**
> VwapResponseRoot get_previous_vwaps(date, start_time, end_time, security_id, region)

Get Previous Volume Weighted Average Prices

Get previous vwaps by specified date, time range, security, region and optional currency

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api import market_impact_api
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models import *
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
configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = market_impact_api.MarketImpactApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    date = "2024-08-29" # str | Date in the format YYYY-MM-DD
    start_time = "10:00:00" # str | Start Time in the format HH:MM:SS
    end_time = "15:30:00" # str | End Time in the format HH:MM:SS
    security_id = "FDS" # str | ISIN for European securities, otherwise TICKER
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region
    currency = "USD" # str | The ISO 4217 currency code (optional)

    try:
        # Get Previous Volume Weighted Average Prices
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_previous_vwaps(date, start_time, end_time, security_id, region, currency=currency)

        pprint(api_response)

    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling MarketImpactApi->get_previous_vwaps: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **str**| Date in the format YYYY-MM-DD |
 **start_time** | **str**| Start Time in the format HH:MM:SS |
 **end_time** | **str**| End Time in the format HH:MM:SS |
 **security_id** | **str**| ISIN for European securities, otherwise TICKER |
 **region** | **str**| The two character ISO country code of the trading region. EMEA is used for the European trading region |
 **currency** | **str**| The ISO 4217 currency code | [optional]

### Return type

[**VwapResponseRoot**](VwapResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**400** | Invalid query parameters. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
**503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

