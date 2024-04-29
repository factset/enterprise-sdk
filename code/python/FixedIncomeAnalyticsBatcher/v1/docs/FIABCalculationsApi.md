# fds.sdk.FixedIncomeAnalyticsBatcher.FIABCalculationsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fiab_calculation_by_id**](FIABCalculationsApi.md#get_fiab_calculation_by_id) | **GET** /analytics/engines/fiab/v1/calculations/{id} | Get FIAB calculation by id
[**get_fiab_calculation_status_summaries**](FIABCalculationsApi.md#get_fiab_calculation_status_summaries) | **GET** /analytics/engines/fiab/v1/calculations | Get all FIAB calculation summaries
[**run_fiab_calculation**](FIABCalculationsApi.md#run_fiab_calculation) | **POST** /analytics/engines/fiab/v1/calculations | Run FIAB calculation



# **get_fiab_calculation_by_id**
> FIABCalculationStatus get_fiab_calculation_by_id(id)

Get FIAB calculation by id

This is the endpoint to check on the progress of a previously requested calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeAnalyticsBatcher
from fds.sdk.FixedIncomeAnalyticsBatcher.api import fiab_calculations_api
from fds.sdk.FixedIncomeAnalyticsBatcher.models import *
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
configuration = fds.sdk.FixedIncomeAnalyticsBatcher.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeAnalyticsBatcher.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeAnalyticsBatcher.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fiab_calculations_api.FIABCalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | from url, provided from the location header in the Run FIAB Calculation endpoint

    try:
        # Get FIAB calculation by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fiab_calculation_by_id(id)

        pprint(api_response)

    except fds.sdk.FixedIncomeAnalyticsBatcher.ApiException as e:
        print("Exception when calling FIABCalculationsApi->get_fiab_calculation_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Run FIAB Calculation endpoint |

### Return type

[**FIABCalculationStatus**](FIABCalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns status information of the entire calculation if it is complete. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**202** | Expected response, returns status information of the entire calculation if it is not complete. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | Calculation was already returned, provided id was not a requested calculation, or the calculation was cancelled |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fiab_calculation_status_summaries**
> {str: (FIABCalculationStatusSummary,)} get_fiab_calculation_status_summaries()

Get all FIAB calculation summaries

This endpoints returns all FIAB calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeAnalyticsBatcher
from fds.sdk.FixedIncomeAnalyticsBatcher.api import fiab_calculations_api
from fds.sdk.FixedIncomeAnalyticsBatcher.models import *
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
configuration = fds.sdk.FixedIncomeAnalyticsBatcher.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeAnalyticsBatcher.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeAnalyticsBatcher.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fiab_calculations_api.FIABCalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get all FIAB calculation summaries
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_fiab_calculation_status_summaries()

        pprint(api_response)

    except fds.sdk.FixedIncomeAnalyticsBatcher.ApiException as e:
        print("Exception when calling FIABCalculationsApi->get_fiab_calculation_status_summaries: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**{str: (FIABCalculationStatusSummary,)}**](FIABCalculationStatusSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of active FIAB calculation requests. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **run_fiab_calculation**
> run_fiab_calculation()

Run FIAB calculation

This endpoint creates a new FIAB calculation.  This must be used first before get status or cancelling endpoints with a calculation id.  A successful response will contain the URL to check the status of the calculation request.    Remarks:  * Any settings in POST body will act as a one-time override over the settings saved in the FIAB template.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeAnalyticsBatcher
from fds.sdk.FixedIncomeAnalyticsBatcher.api import fiab_calculations_api
from fds.sdk.FixedIncomeAnalyticsBatcher.models import *
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
configuration = fds.sdk.FixedIncomeAnalyticsBatcher.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeAnalyticsBatcher.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeAnalyticsBatcher.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fiab_calculations_api.FIABCalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    fiab_calculation_parameters = FIABCalculationParameters(
        fiabdocument="fiabdocument_example",
        account=FIABIdentifier(
            id="id_example",
        ),
        dates=FIABDateParameters(
            startdate="startdate_example",
            enddate="enddate_example",
        ),
        msl="msl_example",
        fisettingsdocument="fisettingsdocument_example",
    ) # FIABCalculationParameters |  (optional)

    try:
        # Run FIAB calculation
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.run_fiab_calculation(fiab_calculation_parameters=fiab_calculation_parameters)


    except fds.sdk.FixedIncomeAnalyticsBatcher.ApiException as e:
        print("Exception when calling FIABCalculationsApi->run_fiab_calculation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fiab_calculation_parameters** | [**FIABCalculationParameters**](FIABCalculationParameters.md)|  | [optional]

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
**202** | Expected response, contains the URL in the Location header to check the status of the calculation. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid POST body. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  |
**403** | User is forbidden with current credentials. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Cancel older requests using Cancel FIAB Calculation endpoint or wait for older requests to finish / expire. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * Location - URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FIAB request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FIAB requests remaining till request limit reached. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

