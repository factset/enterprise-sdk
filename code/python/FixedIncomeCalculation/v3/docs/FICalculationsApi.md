# fds.sdk.FixedIncomeCalculation.FICalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_calculation_by_id**](FICalculationsApi.md#cancel_calculation_by_id) | **DELETE** /analytics/engines/fi/v3/calculations/{id} | Cancel FI calculation by id
[**get_calculation_parameters**](FICalculationsApi.md#get_calculation_parameters) | **GET** /analytics/engines/fi/v3/calculations/{id} | Get FI calculation parameters by id
[**get_calculation_result**](FICalculationsApi.md#get_calculation_result) | **GET** /analytics/engines/fi/v3/calculations/{id}/result | Get FI calculation result by id
[**get_calculation_status_by_id**](FICalculationsApi.md#get_calculation_status_by_id) | **GET** /analytics/engines/fi/v3/calculations/{id}/status | Get FI calculation status by id
[**post_and_calculate**](FICalculationsApi.md#post_and_calculate) | **POST** /analytics/engines/fi/v3/calculations | Create and Run FI calculation
[**put_and_calculate**](FICalculationsApi.md#put_and_calculate) | **PUT** /analytics/engines/fi/v3/calculations/{id} | Create or Update FI calculation and run it.



# **cancel_calculation_by_id**
> cancel_calculation_by_id(id)

Cancel FI calculation by id

This is the endpoint to cancel a previously submitted calculation.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeCalculation
from fds.sdk.FixedIncomeCalculation.api import fi_calculations_api
from fds.sdk.FixedIncomeCalculation.models import *
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
configuration = fds.sdk.FixedIncomeCalculation.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeCalculation.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeCalculation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fi_calculations_api.FICalculationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | from url, provided from the location header in the Create and Run FI calculation endpoint

    try:
        # Cancel FI calculation by id
        # example passing only required values which don't have defaults set
        api_instance.cancel_calculation_by_id(id)

    except fds.sdk.FixedIncomeCalculation.ApiException as e:
        print("Exception when calling FICalculationsApi->cancel_calculation_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Create and Run FI calculation endpoint |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Expected response, calculation was canceled successfully. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | There was no request for the calculation identifier provided, or the request was already canceled for the provided identifier. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_calculation_parameters**
> FICalculationParametersRoot get_calculation_parameters(id)

Get FI calculation parameters by id

This is the endpoint that returns the calculation parameters passed for a calculation.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeCalculation
from fds.sdk.FixedIncomeCalculation.api import fi_calculations_api
from fds.sdk.FixedIncomeCalculation.models import *
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
configuration = fds.sdk.FixedIncomeCalculation.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeCalculation.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeCalculation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fi_calculations_api.FICalculationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | from url, provided from the location header in the Create and Run FI calculation endpoint

    try:
        # Get FI calculation parameters by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_calculation_parameters(id)
        pprint(api_response)

    except fds.sdk.FixedIncomeCalculation.ApiException as e:
        print("Exception when calling FICalculationsApi->get_calculation_parameters: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Create and Run FI calculation endpoint |

### Return type

[**FICalculationParametersRoot**](FICalculationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns the FI calculation parameters. |  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | Calculation id not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_calculation_result**
> ObjectRoot get_calculation_result(id)

Get FI calculation result by id

This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeCalculation
from fds.sdk.FixedIncomeCalculation.api import fi_calculations_api
from fds.sdk.FixedIncomeCalculation.models import *
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
configuration = fds.sdk.FixedIncomeCalculation.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeCalculation.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeCalculation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fi_calculations_api.FICalculationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | from url, provided from the location header in the Get FI calculation status by id endpoint

    try:
        # Get FI calculation result by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_calculation_result(id)
        pprint(api_response)

    except fds.sdk.FixedIncomeCalculation.ApiException as e:
        print("Exception when calling FICalculationsApi->get_calculation_result: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Get FI calculation status by id endpoint |

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-protobuf


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response once calculation is completed, returns JSON in the format specified in the Calculation parameters. |  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | Calculation was already returned, provided id was not a requested calculation, or the calculation was cancelled |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_calculation_status_by_id**
> ObjectRoot get_calculation_status_by_id(id)

Get FI calculation status by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.  Otherwise, the calculation is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeCalculation
from fds.sdk.FixedIncomeCalculation.api import fi_calculations_api
from fds.sdk.FixedIncomeCalculation.models import *
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
configuration = fds.sdk.FixedIncomeCalculation.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeCalculation.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeCalculation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fi_calculations_api.FICalculationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | from url, provided from the location header in the Create and Run FI calculation endpoint

    try:
        # Get FI calculation status by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_calculation_status_by_id(id)
        pprint(api_response)

    except fds.sdk.FixedIncomeCalculation.ApiException as e:
        print("Exception when calling FICalculationsApi->get_calculation_status_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Create and Run FI calculation endpoint |

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-protobuf


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Expected response once calculation is completed, returns JSON in the format specified in the Calculation parameters. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**202** | Expected response returned if the calculation is not yet completed, should contain X-FactSet-Api-PickUp-Progress header. |  * X-FactSet-Api-PickUp-Progress - FactSet&#39;s progress header. <br>  * Cache-Control - Standard HTTP header. Header will specify max-age in seconds. Polling can be adjusted based on the max-age value. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | Calculation was already returned, provided id was not a requested calculation, or the calculation was cancelled |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_and_calculate**
> ObjectRoot post_and_calculate()

Create and Run FI calculation

This endpoint creates and runs a new FI calculation specified in the post body.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeCalculation
from fds.sdk.FixedIncomeCalculation.api import fi_calculations_api
from fds.sdk.FixedIncomeCalculation.models import *
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
configuration = fds.sdk.FixedIncomeCalculation.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeCalculation.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeCalculation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fi_calculations_api.FICalculationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    x_fact_set_api_long_running_deadline = 1 # int | Long running deadline in seconds. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    cache_control = "Cache-Control_example" # str | Standard HTTP header.  Accepts max-stale. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    fi_calculation_parameters_root = FICalculationParametersRoot(
        data=FICalculationParameters(
            securities=[
                FISecurity(
                    settlement="settlement_example",
                    call_method="No Call",
                    reference_security=FIReferenceSecurity(
                        security_type="security_type_example",
                        security_name="security_name_example",
                        calc_from_method="calc_from_method_example",
                        calc_from_value=3.14,
                        prepay=FIReferencePrepay(
                            prepay_name="prepay_name_example",
                        ),
                        settlement="settlement_example",
                    ),
                    bank_loans=FIBankLoans(
                        ignore_sinking_fund=True,
                    ),
                    municipal_bonds=FIMunicipalBonds(
                        ignore_sinking_fund=True,
                        use_anticipated_sink_schedule=True,
                    ),
                    loss=FILoss(
                        loss_name="loss_name_example",
                    ),
                    prepay=FIPrepay(
                        prepay_name="prepay_name_example",
                    ),
                    matrix_spread_adjustment=3.14,
                    matrix_multiplier=3.14,
                    structured_products=FIStructuredProductsForSecurities(
                        servicer_advances=FIServicerAdvancesForSecurities(
                            principal=3.14,
                            interest=3.14,
                            advance_type="Advances All",
                        ),
                        ignore_financial_guarantee="ignore_financial_guarantee_example",
                        clean_up_call_method=True,
                        do_opt_redeem="do_opt_redeem_example",
                        prepay_lockout=FIPrepayLockout(
                            points_above="ANY",
                            ym_above="ANY",
                        ),
                        cashflows=FICashflows(
                            optional_redemption_call_when_units="Manual",
                            optional_redemption_call_when=1,
                            recovery_lag=1,
                        ),
                        balloon_extension=FIBalloonExtension(
                            months=1,
                            percentage=3.14,
                            amortization_type="Loan_Amort_None",
                            units="units_example",
                            coupon_stepup=3.14,
                        ),
                    ),
                    calc_from_method="calc_from_method_example",
                    calc_from_value=3.14,
                    face=1,
                    face_type="Current",
                    symbol="symbol_example",
                    discount_curve="discount_curve_example",
                ),
            ],
            calculations=[
                "calculations_example",
            ],
            job_settings=FIJobSettings(
                as_of_date="as_of_date_example",
                partial_duration_months=[
                    1,
                ],
                call_method="No Call",
                settlement="settlement_example",
                calc_from_method="calc_from_method_example",
                bank_loans=FIBankLoans(
                    ignore_sinking_fund=True,
                ),
                municipal_bonds=FIMunicipalBondsForJobSettings(
                    allow_sink_for_installment_payment=True,
                    ignore_sinking_fund=True,
                    use_anticipated_sink_schedule=True,
                ),
                market_environment=FIMarketEnvironment(
                    rate_path="FLAT & FORWARD",
                ),
                structured_products=FIStructuredProductsForJobSettings(
                    servicer_advances=FIServicerAdvances(
                        advance_type="Advances All",
                    ),
                    ignore_financial_guarantee="ignore_financial_guarantee_example",
                    clean_up_call_method=True,
                    do_opt_redeem="do_opt_redeem_example",
                    prepay_lockout=FIPrepayLockout(
                        points_above="ANY",
                        ym_above="ANY",
                    ),
                    cashflows=FICashflows(
                        optional_redemption_call_when_units="Manual",
                        optional_redemption_call_when=1,
                        recovery_lag=1,
                    ),
                    balloon_extension=FIBalloonExtension(
                        months=1,
                        percentage=3.14,
                        amortization_type="Loan_Amort_None",
                        units="units_example",
                        coupon_stepup=3.14,
                    ),
                ),
            ),
        ),
        meta=CalculationMeta(
            contentorganization="SimplifiedRow",
            stach_content_organization="SimplifiedRow",
            contenttype="Json",
            format="JsonStach",
        ),
    ) # FICalculationParametersRoot | Calculation Parameters (optional)

    try:
        # Create and Run FI calculation
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_and_calculate(x_fact_set_api_long_running_deadline=x_fact_set_api_long_running_deadline, cache_control=cache_control, fi_calculation_parameters_root=fi_calculation_parameters_root)
        responseWrapper = {
            201: api_response.get_response_201,
            202: api_response.get_response_202,
        }
        pprint(responseWrapper[api_response.status_code]())

    except fds.sdk.FixedIncomeCalculation.ApiException as e:
        print("Exception when calling FICalculationsApi->post_and_calculate: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_fact_set_api_long_running_deadline** | **int**| Long running deadline in seconds. | [optional]
 **cache_control** | **str**| Standard HTTP header.  Accepts max-stale. | [optional]
 **fi_calculation_parameters_root** | [**FICalculationParametersRoot**](FICalculationParametersRoot.md)| Calculation Parameters | [optional]

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/x-protobuf


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Expected response if calculation is completed in a short span, returns JSON in the format specified in the Calculation parameters. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**202** | Expected response, contains the poll URL in the Location header. |  * Location - URL to poll for the resulting calculation <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid calculation parameters. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | One or more calculation settings were unavailable. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Cancel older requests using Cancel Calculation endpoint or wait for older requests to finish/expire. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-Calculations-Limit - Maximum FI request limit. <br>  * X-FactSet-Api-Calculations-Remaining - Number of FI requests remaining till request limit reached. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_and_calculate**
> ObjectRoot put_and_calculate(id)

Create or Update FI calculation and run it.

This endpoint updates and run the FI optimization specified in the PUT body parameters. It also allows the creation of new FI optimization with custom id.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FixedIncomeCalculation
from fds.sdk.FixedIncomeCalculation.api import fi_calculations_api
from fds.sdk.FixedIncomeCalculation.models import *
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
configuration = fds.sdk.FixedIncomeCalculation.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FixedIncomeCalculation.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FixedIncomeCalculation.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fi_calculations_api.FICalculationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | from url, provided from the location header in the Create and Run FI calculation endpoint
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    x_fact_set_api_long_running_deadline = 1 # int | Long running deadline in seconds. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    cache_control = "Cache-Control_example" # str | Standard HTTP header.  Accepts max-stale. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    fi_calculation_parameters_root = FICalculationParametersRoot(
        data=FICalculationParameters(
            securities=[
                FISecurity(
                    settlement="settlement_example",
                    call_method="No Call",
                    reference_security=FIReferenceSecurity(
                        security_type="security_type_example",
                        security_name="security_name_example",
                        calc_from_method="calc_from_method_example",
                        calc_from_value=3.14,
                        prepay=FIReferencePrepay(
                            prepay_name="prepay_name_example",
                        ),
                        settlement="settlement_example",
                    ),
                    bank_loans=FIBankLoans(
                        ignore_sinking_fund=True,
                    ),
                    municipal_bonds=FIMunicipalBonds(
                        ignore_sinking_fund=True,
                        use_anticipated_sink_schedule=True,
                    ),
                    loss=FILoss(
                        loss_name="loss_name_example",
                    ),
                    prepay=FIPrepay(
                        prepay_name="prepay_name_example",
                    ),
                    matrix_spread_adjustment=3.14,
                    matrix_multiplier=3.14,
                    structured_products=FIStructuredProductsForSecurities(
                        servicer_advances=FIServicerAdvancesForSecurities(
                            principal=3.14,
                            interest=3.14,
                            advance_type="Advances All",
                        ),
                        ignore_financial_guarantee="ignore_financial_guarantee_example",
                        clean_up_call_method=True,
                        do_opt_redeem="do_opt_redeem_example",
                        prepay_lockout=FIPrepayLockout(
                            points_above="ANY",
                            ym_above="ANY",
                        ),
                        cashflows=FICashflows(
                            optional_redemption_call_when_units="Manual",
                            optional_redemption_call_when=1,
                            recovery_lag=1,
                        ),
                        balloon_extension=FIBalloonExtension(
                            months=1,
                            percentage=3.14,
                            amortization_type="Loan_Amort_None",
                            units="units_example",
                            coupon_stepup=3.14,
                        ),
                    ),
                    calc_from_method="calc_from_method_example",
                    calc_from_value=3.14,
                    face=1,
                    face_type="Current",
                    symbol="symbol_example",
                    discount_curve="discount_curve_example",
                ),
            ],
            calculations=[
                "calculations_example",
            ],
            job_settings=FIJobSettings(
                as_of_date="as_of_date_example",
                partial_duration_months=[
                    1,
                ],
                call_method="No Call",
                settlement="settlement_example",
                calc_from_method="calc_from_method_example",
                bank_loans=FIBankLoans(
                    ignore_sinking_fund=True,
                ),
                municipal_bonds=FIMunicipalBondsForJobSettings(
                    allow_sink_for_installment_payment=True,
                    ignore_sinking_fund=True,
                    use_anticipated_sink_schedule=True,
                ),
                market_environment=FIMarketEnvironment(
                    rate_path="FLAT & FORWARD",
                ),
                structured_products=FIStructuredProductsForJobSettings(
                    servicer_advances=FIServicerAdvances(
                        advance_type="Advances All",
                    ),
                    ignore_financial_guarantee="ignore_financial_guarantee_example",
                    clean_up_call_method=True,
                    do_opt_redeem="do_opt_redeem_example",
                    prepay_lockout=FIPrepayLockout(
                        points_above="ANY",
                        ym_above="ANY",
                    ),
                    cashflows=FICashflows(
                        optional_redemption_call_when_units="Manual",
                        optional_redemption_call_when=1,
                        recovery_lag=1,
                    ),
                    balloon_extension=FIBalloonExtension(
                        months=1,
                        percentage=3.14,
                        amortization_type="Loan_Amort_None",
                        units="units_example",
                        coupon_stepup=3.14,
                    ),
                ),
            ),
        ),
        meta=CalculationMeta(
            contentorganization="SimplifiedRow",
            stach_content_organization="SimplifiedRow",
            contenttype="Json",
            format="JsonStach",
        ),
    ) # FICalculationParametersRoot | Calculation Parameters (optional)

    try:
        # Create or Update FI calculation and run it.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.put_and_calculate(id, x_fact_set_api_long_running_deadline=x_fact_set_api_long_running_deadline, cache_control=cache_control, fi_calculation_parameters_root=fi_calculation_parameters_root)
        responseWrapper = {
            201: api_response.get_response_201,
            202: api_response.get_response_202,
        }
        pprint(responseWrapper[api_response.status_code]())

    except fds.sdk.FixedIncomeCalculation.ApiException as e:
        print("Exception when calling FICalculationsApi->put_and_calculate: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Create and Run FI calculation endpoint |
 **x_fact_set_api_long_running_deadline** | **int**| Long running deadline in seconds. | [optional]
 **cache_control** | **str**| Standard HTTP header.  Accepts max-stale. | [optional]
 **fi_calculation_parameters_root** | [**FICalculationParametersRoot**](FICalculationParametersRoot.md)| Calculation Parameters | [optional]

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/x-protobuf


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Expected response if calculation is completed in a short span, returns JSON in the format specified in the Calculation parameters. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**202** | Expected response, contains the poll URL in the Location header. |  * Location - URL to poll for the resulting calculation <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Invalid Calculation Parameters. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**404** | One or more calculation settings were unavailable. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**409** | Duplicate calculation exists with same parameters. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**429** | Rate limit reached. Cancel older requests using Cancel Calculation endpoint or wait for older requests to finish/expire. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

