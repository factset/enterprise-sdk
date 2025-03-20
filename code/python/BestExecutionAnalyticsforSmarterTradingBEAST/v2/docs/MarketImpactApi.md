# fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_cost_impact**](MarketImpactApi.md#get_cost_impact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



# **get_cost_impact**
> CostImpactResponseRoot get_cost_impact(security_id, region, currency, order_volume)

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
    security_id = "FDS-US" # str | ISIN for European securities, otherwise TICKER
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region
    currency = "USD" # str | The ISO 4217 currency code
    order_volume = 100000 # float | Order Volume
    strategy = "vwap" # str | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional)
    date = "2024-08-29" # str | Date in the format YYYY-MM-DD (optional)
    isin = "isin_example" # str | International securities identification number (optional)
    start_time = "10:00:00" # str | Start Time in the format HH:MM:SS (optional)
    end_time = "15:00:00" # str | End Time in the format HH:MM:SS (optional)
    front_load_half_life = 1000 # float | Front Load Half Life (optional)
    rear_load_half_life = 0 # float | Rear Load Half Life (optional)
    rear_ratio = 1 # float | Rear Ratio (optional)
    risk_aversion = 0.3 # float | Risk Aversion (optional)
    apply_momentum = False # bool | Flag to apply stock momentum. Specify true to include momentum (optional)
    side = "side_example" # str | Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. (optional)

    try:
        # Get Cost Impact
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_cost_impact(security_id, region, currency, order_volume, strategy=strategy, date=date, isin=isin, start_time=start_time, end_time=end_time, front_load_half_life=front_load_half_life, rear_load_half_life=rear_load_half_life, rear_ratio=rear_ratio, risk_aversion=risk_aversion, apply_momentum=apply_momentum, side=side)

        pprint(api_response)

    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling MarketImpactApi->get_cost_impact: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | **str**| ISIN for European securities, otherwise TICKER |
 **region** | **str**| The two character ISO country code of the trading region. EMEA is used for the European trading region |
 **currency** | **str**| The ISO 4217 currency code |
 **order_volume** | **float**| Order Volume |
 **strategy** | **str**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional]
 **date** | **str**| Date in the format YYYY-MM-DD | [optional]
 **isin** | **str**| International securities identification number | [optional]
 **start_time** | **str**| Start Time in the format HH:MM:SS | [optional]
 **end_time** | **str**| End Time in the format HH:MM:SS | [optional]
 **front_load_half_life** | **float**| Front Load Half Life | [optional]
 **rear_load_half_life** | **float**| Rear Load Half Life | [optional]
 **rear_ratio** | **float**| Rear Ratio | [optional]
 **risk_aversion** | **float**| Risk Aversion | [optional]
 **apply_momentum** | **bool**| Flag to apply stock momentum. Specify true to include momentum | [optional]
 **side** | **str**| Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. | [optional]

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

