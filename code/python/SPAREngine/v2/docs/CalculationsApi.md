# fds.sdk.SPAREngine.CalculationsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_calculation_by_id**](CalculationsApi.md#cancel_calculation_by_id) | **DELETE** /analytics/engines/v2/calculations/{id} | Cancel calculation by id
[**get_calculation_status_by_id**](CalculationsApi.md#get_calculation_status_by_id) | **GET** /analytics/engines/v2/calculations/{id} | Get calculation status by id
[**get_calculation_status_summaries**](CalculationsApi.md#get_calculation_status_summaries) | **GET** /analytics/engines/v2/calculations | Get all calculation statuses
[**run_calculation**](CalculationsApi.md#run_calculation) | **POST** /analytics/engines/v2/calculations | Run calculation


# **cancel_calculation_by_id**
> cancel_calculation_by_id(id)

Cancel calculation by id

This is the endpoint to cancel a previously submitted calculation request.  Instead of doing a GET on the getCalculationById URL, cancel the calculation by doing a DELETE.  All individual calculation units within the calculation will be canceled if they have not already finished.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SPAREngine
from fds.sdk.SPAREngine.api import calculations_api
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.SPAREngine.Configuration(
    host = "https://api-sandbox.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.SPAREngine.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.SPAREngine.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SPAREngine.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    id = "id_example" # str | From url, provided from the location header in the Run Multiple Calculations endpoint.

    # example passing only required values which don't have defaults set
    try:
        # Cancel calculation by id
        api_instance.cancel_calculation_by_id(id)
    except fds.sdk.SPAREngine.ApiException as e:
        print("Exception when calling CalculationsApi->cancel_calculation_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| From url, provided from the location header in the Run Multiple Calculations endpoint. |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Expected response, request was cancelled successfully. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | There was no request for the identifier provided, or the request was already canceled for the provided identifier. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_calculation_status_by_id**
> CalculationStatus get_calculation_status_by_id(id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.  Response body contains status information of the entire request and each individual calculation unit.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SPAREngine
from fds.sdk.SPAREngine.api import calculations_api
from fds.sdk.SPAREngine.model.calculation_status import CalculationStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.SPAREngine.Configuration(
    host = "https://api-sandbox.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.SPAREngine.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.SPAREngine.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SPAREngine.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    id = "id_example" # str | From url, provided from the location header in the Run Multiple Calculations endpoint.

    # example passing only required values which don't have defaults set
    try:
        # Get calculation status by id
        api_response = api_instance.get_calculation_status_by_id(id)
        pprint(api_response)
    except fds.sdk.SPAREngine.ApiException as e:
        print("Exception when calling CalculationsApi->get_calculation_status_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| From url, provided from the location header in the Run Multiple Calculations endpoint. |

### Return type

[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns status information of the entire calculation and each individual calculation unit. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | Provided identifier was not a request, or the request was cancelled. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_calculation_status_summaries**
> {str: (CalculationStatusSummary,)} get_calculation_status_summaries()

Get all calculation statuses

This endpoints returns all active calculation requests.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SPAREngine
from fds.sdk.SPAREngine.api import calculations_api
from fds.sdk.SPAREngine.model.calculation_status_summary import CalculationStatusSummary
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.SPAREngine.Configuration(
    host = "https://api-sandbox.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.SPAREngine.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.SPAREngine.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SPAREngine.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get all calculation statuses
        api_response = api_instance.get_calculation_status_summaries()
        pprint(api_response)
    except fds.sdk.SPAREngine.ApiException as e:
        print("Exception when calling CalculationsApi->get_calculation_status_summaries: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**{str: (CalculationStatusSummary,)}**](CalculationStatusSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of active calculation requests. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **run_calculation**
> run_calculation()

Run calculation

This endpoint creates a new calculation and runs the set of calculation units specified in the POST body.  This must be used first before get status or cancelling endpoints with a calculation id.   A successful response will contain the URL to check the status of the calculation request.    Remarks:  * Maximum 500 units allowed across all simultaneous calculations. (Refer API documentation for more information)                * Any settings in POST body will act as a one-time override over the settings saved in the PA/SPAR/Vault template.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SPAREngine
from fds.sdk.SPAREngine.api import calculations_api
from fds.sdk.SPAREngine.model.calculation import Calculation
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.SPAREngine.Configuration(
    host = "https://api-sandbox.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.SPAREngine.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.SPAREngine.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SPAREngine.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    calculation = Calculation(
        pa={
            "key": PACalculationParameters(
                componentid="componentid_example",
                accounts=[
                    PAIdentifier(
                        id="id_example",
                        holdingsmode="holdingsmode_example",
                    ),
                ],
                benchmarks=[
                    PAIdentifier(
                        id="id_example",
                        holdingsmode="holdingsmode_example",
                    ),
                ],
                dates=PADateParameters(
                    startdate="startdate_example",
                    enddate="enddate_example",
                    frequency="frequency_example",
                ),
                groups=[
                    PACalculationGroup(
                        id="id_example",
                    ),
                ],
                currencyisocode="currencyisocode_example",
                columns=[
                    PACalculationColumn(
                        id="id_example",
                        statistics=[
                            "statistics_example",
                        ],
                    ),
                ],
                componentdetail="componentdetail_example",
            ),
        },
        spar={
            "key": SPARCalculationParameters(
                componentid="componentid_example",
                accounts=[
                    SPARIdentifier(
                        id="id_example",
                        returntype="returntype_example",
                        prefix="prefix_example",
                    ),
                ],
                benchmark=SPARIdentifier(
                    id="id_example",
                    returntype="returntype_example",
                    prefix="prefix_example",
                ),
                dates=SPARDateParameters(
                    startdate="startdate_example",
                    enddate="enddate_example",
                    frequency="frequency_example",
                ),
            ),
        },
        vault={
            "key": VaultCalculationParameters(
                componentid="componentid_example",
                account=VaultIdentifier(
                    id="id_example",
                ),
                dates=VaultDateParameters(
                    startdate="startdate_example",
                    enddate="enddate_example",
                    frequency="frequency_example",
                ),
                configid="configid_example",
                componentdetail="componentdetail_example",
            ),
        },
        pub={
            "key": PubCalculationParameters(
                document="document_example",
                account=PubIdentifier(
                    id="id_example",
                    holdingsmode="holdingsmode_example",
                ),
                dates=PubDateParameters(
                    startdate="startdate_example",
                    enddate="enddate_example",
                ),
            ),
        },
    ) # Calculation |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Run calculation
        api_instance.run_calculation(calculation=calculation)
    except fds.sdk.SPAREngine.ApiException as e:
        print("Exception when calling CalculationsApi->run_calculation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculation** | [**Calculation**](Calculation.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Expected response, contains the URL in the Location header to check the status of the calculation. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid POST body. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  |
**403** | User is forbidden with current credentials. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Cancel older requests using Cancel Calculation endpoint or wait for older requests to finish / expire. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Points-Limit - Maximum points limit across all batches. <br>  * X-FactSet-Api-Points-Remaining - Number of points remaining till points limit reached. <br>  * X-FactSet-Api-Units-Limit - Maximum units limit across all batches. <br>  * X-FactSet-Api-Units-Remaining - Number of units remaining till units limit reached. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

