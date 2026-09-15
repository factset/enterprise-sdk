# fds.sdk.FactSetPowerUtilities.MarketDataApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_market_data**](MarketDataApi.md#list_market_data) | **POST** /market-data | Returns balancing authority generation, demand, or interchange
[**list_market_data_coverage**](MarketDataApi.md#list_market_data_coverage) | **GET** /market-data/coverage | Returns balancing authority coverage



# **list_market_data**
> MarketDataResponse list_market_data(market_data_request)

Returns balancing authority generation, demand, or interchange

Returns balancing authority time-series data for one of three categories, selected via the `category` discriminator in the request body:  * **`Generation`** — Hourly net generation in MW by fuel type for the specified balancing authorities (`factsetBaId`) and date range. * **`Demand`** — Hourly electricity demand (load) in MW for the specified balancing authority sub-regions (`factsetBaSubRegId`). * **`Interchange`** — Hourly net interchange in MW between a reporting BA sub-region and its counterpart sub-regions. Positive values indicate net exports; negative values indicate net imports. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import market_data_api
from fds.sdk.FactSetPowerUtilities.models import *
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
configuration = fds.sdk.FactSetPowerUtilities.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPowerUtilities.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPowerUtilities.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = market_data_api.MarketDataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    market_data_request = MarketDataRequest(
        data=MarketDataRequestData(),
        meta=RequestMeta(
            pagination=RequestPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # MarketDataRequest | 

    try:
        # Returns balancing authority generation, demand, or interchange
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_market_data(market_data_request)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling MarketDataApi->list_market_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market_data_request** | [**MarketDataRequest**](MarketDataRequest.md)|  |

### Return type

[**MarketDataResponse**](MarketDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. Record shape matches the requested &#x60;category&#x60;. |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
**422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_market_data_coverage**
> MarketDataCoverageResponse list_market_data_coverage()

Returns balancing authority coverage

Returns the full list of balancing authority (BA) sub-regions available in the market data endpoints. Use the returned `factsetBaId` values as input for the `Generation` category, or `factsetBaSubRegId` values for the `Demand` and `Interchange` categories, of `POST /market-data`. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import market_data_api
from fds.sdk.FactSetPowerUtilities.models import *
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
configuration = fds.sdk.FactSetPowerUtilities.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPowerUtilities.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPowerUtilities.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = market_data_api.MarketDataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    country = "United States" # str | Filter by country name. (optional)
    pagination_limit = 100 # int | Maximum number of results to return per request. (optional) if omitted the server will use the default value of 100
    pagination_offset = 0 # int | Number of results to skip. (optional) if omitted the server will use the default value of 0

    try:
        # Returns balancing authority coverage
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.list_market_data_coverage(country=country, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling MarketDataApi->list_market_data_coverage: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **str**| Filter by country name. | [optional]
 **pagination_limit** | **int**| Maximum number of results to return per request. | [optional] if omitted the server will use the default value of 100
 **pagination_offset** | **int**| Number of results to skip. | [optional] if omitted the server will use the default value of 0

### Return type

[**MarketDataCoverageResponse**](MarketDataCoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with balancing authority coverage list |  -  |
**400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
**401** | Unauthenticated — no valid credentials were provided. |  -  |
**403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
**404** | Not Found — the requested resource was not found. |  -  |
**429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
**500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
**503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

