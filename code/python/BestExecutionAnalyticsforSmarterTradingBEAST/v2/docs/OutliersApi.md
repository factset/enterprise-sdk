# fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.OutliersApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_outlier_metrics_by_percentile**](OutliersApi.md#get_outlier_metrics_by_percentile) | **GET** /tca/outlier/metrics-by-percentile | Get Outlier Metrics by percentile
[**get_outlier_metrics_standard**](OutliersApi.md#get_outlier_metrics_standard) | **GET** /tca/outlier/metrics-standard | Get Outlier Metrics by standard deviation



# **get_outlier_metrics_by_percentile**
> OutlierResponseRoot get_outlier_metrics_by_percentile(metric_type, start_date, end_date)

Get Outlier Metrics by percentile

Get outlier metrics by the specified metric type, percentile and date range

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api import outliers_api
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
    api_instance = outliers_api.OutliersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    metric_type = "firstFillMidPerfBps" # str | Metric type
    start_date = "2024-07-29" # str | Start date in the format YYYY-MM-DD
    end_date = "2024-08-29" # str | End date in the format YYYY-MM-DD
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region (optional)
    trader = "trader_example" # str | Optionally specify a trader to filter by, Example : Ryan (optional)
    min_percent = 2.5 # float | Min Percentile (optional) if omitted the server will use the default value of 2.5
    max_percent = 97.5 # float | Max Percentile (optional) if omitted the server will use the default value of 97.5
    bin_scalar = 51 # int | Bin Scalar (optional) if omitted the server will use the default value of 51

    try:
        # Get Outlier Metrics by percentile
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_outlier_metrics_by_percentile(metric_type, start_date, end_date, region=region, trader=trader, min_percent=min_percent, max_percent=max_percent, bin_scalar=bin_scalar)

        pprint(api_response)

    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling OutliersApi->get_outlier_metrics_by_percentile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric_type** | **str**| Metric type |
 **start_date** | **str**| Start date in the format YYYY-MM-DD |
 **end_date** | **str**| End date in the format YYYY-MM-DD |
 **region** | **str**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional]
 **trader** | **str**| Optionally specify a trader to filter by, Example : Ryan | [optional]
 **min_percent** | **float**| Min Percentile | [optional] if omitted the server will use the default value of 2.5
 **max_percent** | **float**| Max Percentile | [optional] if omitted the server will use the default value of 97.5
 **bin_scalar** | **int**| Bin Scalar | [optional] if omitted the server will use the default value of 51

### Return type

[**OutlierResponseRoot**](OutlierResponseRoot.md)

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

# **get_outlier_metrics_standard**
> OutlierResponseRoot get_outlier_metrics_standard(metric_type, start_date, end_date)

Get Outlier Metrics by standard deviation

Get outlier metrics by the specified metric type and date range

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api import outliers_api
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
    api_instance = outliers_api.OutliersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    metric_type = "firstFillMidPerfBps" # str | Metric type
    start_date = "2024-07-29" # str | Start date in the format YYYY-MM-DD
    end_date = "2024-08-29" # str | End date in the format YYYY-MM-DD
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region (optional)
    trader = "trader_example" # str | Optionally specify a trader to filter by, Example : Ryan (optional)
    deviation = 2 # float | Deviation (optional) if omitted the server will use the default value of 2
    bin_scalar = 51 # int | Bin Scalar (optional) if omitted the server will use the default value of 51

    try:
        # Get Outlier Metrics by standard deviation
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_outlier_metrics_standard(metric_type, start_date, end_date, region=region, trader=trader, deviation=deviation, bin_scalar=bin_scalar)

        pprint(api_response)

    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling OutliersApi->get_outlier_metrics_standard: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric_type** | **str**| Metric type |
 **start_date** | **str**| Start date in the format YYYY-MM-DD |
 **end_date** | **str**| End date in the format YYYY-MM-DD |
 **region** | **str**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional]
 **trader** | **str**| Optionally specify a trader to filter by, Example : Ryan | [optional]
 **deviation** | **float**| Deviation | [optional] if omitted the server will use the default value of 2
 **bin_scalar** | **int**| Bin Scalar | [optional] if omitted the server will use the default value of 51

### Return type

[**OutlierResponseRoot**](OutlierResponseRoot.md)

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

