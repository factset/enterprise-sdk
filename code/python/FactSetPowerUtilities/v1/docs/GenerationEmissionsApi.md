# fds.sdk.FactSetPowerUtilities.GenerationEmissionsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_hourly_generation_units**](GenerationEmissionsApi.md#list_hourly_generation_units) | **POST** /generation/hourly/units | Returns hourly plant unit generation and emissions
[**list_monthly_generation**](GenerationEmissionsApi.md#list_monthly_generation) | **POST** /generation/monthly | Returns monthly plant generation and emissions



# **list_hourly_generation_units**
> HourlyGenerationResponse list_hourly_generation_units(hourly_generation_request)

Returns hourly plant unit generation and emissions

Returns hourly net generation and emissions for the requested power plant units over the specified date range. Each record provides net generation in MWh and reported emissions of CO₂, SO₂, and N₂O (nitrous oxide) in metric tons, along with heat input in MMBtu and steam generation.  This endpoint operates at the unit level, matching the underlying source data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import generation__emissions_api
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
    api_instance = generation__emissions_api.GenerationEmissionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    hourly_generation_request = HourlyGenerationRequest(
        data=HourlyGenerationRequestData(
            ids=PlantUnitIds(["B00121-M","05RLSM-M"]),
            start_date=dateutil_parser('Sat Jun 01 00:00:00 UTC 2024').date(),
            end_date=dateutil_parser('Fri Jun 07 00:00:00 UTC 2024').date(),
        ),
        meta=RequestMeta(
            pagination=RequestPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # HourlyGenerationRequest | 

    try:
        # Returns hourly plant unit generation and emissions
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_hourly_generation_units(hourly_generation_request)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling GenerationEmissionsApi->list_hourly_generation_units: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hourly_generation_request** | [**HourlyGenerationRequest**](HourlyGenerationRequest.md)|  |

### Return type

[**HourlyGenerationResponse**](HourlyGenerationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with hourly generation and emissions |  -  |
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

# **list_monthly_generation**
> MonthlyGenerationResponse list_monthly_generation(monthly_generation_request)

Returns monthly plant generation and emissions

Returns monthly net generation and emissions for the requested power plants over the specified date range. Each record provides net generation in MWh, plant/fuel-type capacity and capacity factor, and total emissions of CO₂ (metric tons), SO₂ (short tons), and N₂O (nitrous oxide, short tons), along with heat input in MMBtu and a CO₂ intensity measure. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPowerUtilities
from fds.sdk.FactSetPowerUtilities.api import generation__emissions_api
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
    api_instance = generation__emissions_api.GenerationEmissionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    monthly_generation_request = MonthlyGenerationRequest(
        data=MonthlyGenerationRequestData(
            ids=PlantIds(["B00121-M","B00987-M"]),
            start_date=dateutil_parser('Sun Jan 01 00:00:00 UTC 2023').date(),
            end_date=dateutil_parser('Sun Dec 31 00:00:00 UTC 2023').date(),
        ),
        meta=RequestMeta(
            pagination=RequestPagination(
                limit=100,
                offset=0,
            ),
        ),
    ) # MonthlyGenerationRequest | 

    try:
        # Returns monthly plant generation and emissions
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_monthly_generation(monthly_generation_request)

        pprint(api_response)

    except fds.sdk.FactSetPowerUtilities.ApiException as e:
        print("Exception when calling GenerationEmissionsApi->list_monthly_generation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monthly_generation_request** | [**MonthlyGenerationRequest**](MonthlyGenerationRequest.md)|  |

### Return type

[**MonthlyGenerationResponse**](MonthlyGenerationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with monthly generation and emissions |  -  |
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

