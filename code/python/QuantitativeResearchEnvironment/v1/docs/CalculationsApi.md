# fds.sdk.QuantitativeResearchEnvironment.CalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analytics_quant_qre_v1_calculations_id_get**](CalculationsApi.md#analytics_quant_qre_v1_calculations_id_get) | **GET** /analytics/quant/qre/v1/calculations/{id} | Get calculation status by id
[**analytics_quant_qre_v1_calculations_id_log_get**](CalculationsApi.md#analytics_quant_qre_v1_calculations_id_log_get) | **GET** /analytics/quant/qre/v1/calculations/{id}/log | Get calculation log for a specific calculation
[**analytics_quant_qre_v1_calculations_id_output_get**](CalculationsApi.md#analytics_quant_qre_v1_calculations_id_output_get) | **GET** /analytics/quant/qre/v1/calculations/{id}/output | Get calculation output for a specific calculation
[**analytics_quant_qre_v1_calculations_post**](CalculationsApi.md#analytics_quant_qre_v1_calculations_post) | **POST** /analytics/quant/qre/v1/calculations | Starts a new script calculation


# **analytics_quant_qre_v1_calculations_id_get**
> CalculationStatus analytics_quant_qre_v1_calculations_id_get(id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuantitativeResearchEnvironment
from fds.sdk.QuantitativeResearchEnvironment.api import calculations_api
from fds.sdk.QuantitativeResearchEnvironment.model.calculation_status import CalculationStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuantitativeResearchEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    id = "id_example" # str | From url, provided by location header or response body in the calculation start endpoint

    # example passing only required values which don't have defaults set
    try:
        # Get calculation status by id
        api_response = api_instance.analytics_quant_qre_v1_calculations_id_get(id)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->analytics_quant_qre_v1_calculations_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| From url, provided by location header or response body in the calculation start endpoint |

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
**200** | Expected response. Signals that the calculation is finished. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**202** | Expected response. Signals that the calculation is still in progress. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_quant_qre_v1_calculations_id_log_get**
> file_type analytics_quant_qre_v1_calculations_id_log_get(id)

Get calculation log for a specific calculation

This endpoint returns the log from the calculation.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuantitativeResearchEnvironment
from fds.sdk.QuantitativeResearchEnvironment.api import calculations_api
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuantitativeResearchEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    id = "id_example" # str | From url, provided by location header or response body in the calculation start endpoint

    # example passing only required values which don't have defaults set
    try:
        # Get calculation log for a specific calculation
        api_response = api_instance.analytics_quant_qre_v1_calculations_id_log_get(id)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->analytics_quant_qre_v1_calculations_id_log_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| From url, provided by location header or response body in the calculation start endpoint |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. Signals that the calculation is finished. Log from the calculation is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**202** | Expected response. Signals that the calculation is still in progress and no log is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_quant_qre_v1_calculations_id_output_get**
> file_type analytics_quant_qre_v1_calculations_id_output_get(id)

Get calculation output for a specific calculation

This endpoint returns the specified output from the calculation.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuantitativeResearchEnvironment
from fds.sdk.QuantitativeResearchEnvironment.api import calculations_api
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuantitativeResearchEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    id = "id_example" # str | From url, provided by location header or response body in the calculation start endpoint

    # example passing only required values which don't have defaults set
    try:
        # Get calculation output for a specific calculation
        api_response = api_instance.analytics_quant_qre_v1_calculations_id_output_get(id)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->analytics_quant_qre_v1_calculations_id_output_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| From url, provided by location header or response body in the calculation start endpoint |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. Signals that the calculation is finished. Output from the calculation is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  |
**202** | Expected response. Signals that the calculation is still in progress and no output is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_quant_qre_v1_calculations_post**
> CalculationStatus analytics_quant_qre_v1_calculations_post()

Starts a new script calculation

This endpoint takes a python script and starts executing it within QRE

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuantitativeResearchEnvironment
from fds.sdk.QuantitativeResearchEnvironment.api import calculations_api
from fds.sdk.QuantitativeResearchEnvironment.model.calculation import Calculation
from fds.sdk.QuantitativeResearchEnvironment.model.calculation_status import CalculationStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuantitativeResearchEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)
    calculation = Calculation(None) # Calculation |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Starts a new script calculation
        api_response = api_instance.analytics_quant_qre_v1_calculations_post(calculation=calculation)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->analytics_quant_qre_v1_calculations_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculation** | [**Calculation**](Calculation.md)|  | [optional]

### Return type

[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Expected response, contains the relative URL in the Location header to check the status of the calculation. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Invalid request body provided |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

