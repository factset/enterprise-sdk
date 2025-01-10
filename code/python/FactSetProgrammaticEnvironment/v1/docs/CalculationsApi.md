# fds.sdk.FactSetProgrammaticEnvironment.CalculationsApi

All URIs are relative to *https://api.factset.com/analytics/quant/fpe/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_calculations**](CalculationsApi.md#create_calculations) | **POST** /calculations | Starts a new script calculation
[**get_calculations**](CalculationsApi.md#get_calculations) | **GET** /calculations/{id} | Get calculation status by id
[**get_calculations_log**](CalculationsApi.md#get_calculations_log) | **GET** /calculations/{id}/log | Get calculation log for a specific calculation
[**get_calculations_output**](CalculationsApi.md#get_calculations_output) | **GET** /calculations/{id}/output | Get calculation output for a specific calculation



# **create_calculations**
> CalculationStatus create_calculations()

Starts a new script calculation

This endpoint takes a python script and starts executing it within FPE

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetProgrammaticEnvironment
from fds.sdk.FactSetProgrammaticEnvironment.api import calculations_api
from fds.sdk.FactSetProgrammaticEnvironment.models import *
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
configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetProgrammaticEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    calculation = Calculation(
        script="script_example",
        notebook="notebook_example",
        kernel="python-3-7",
    ) # Calculation |  (optional)

    try:
        # Starts a new script calculation
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_calculations(calculation=calculation)

        pprint(api_response)

    except fds.sdk.FactSetProgrammaticEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->create_calculations: %s\n" % e)
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

# **get_calculations**
> CalculationStatus get_calculations(id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetProgrammaticEnvironment
from fds.sdk.FactSetProgrammaticEnvironment.api import calculations_api
from fds.sdk.FactSetProgrammaticEnvironment.models import *
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
configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetProgrammaticEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | From url, provided by location header or response body in the calculation start endpoint

    try:
        # Get calculation status by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_calculations(id)

        pprint(api_response)

    except fds.sdk.FactSetProgrammaticEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->get_calculations: %s\n" % e)
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

# **get_calculations_log**
> file_type get_calculations_log(id)

Get calculation log for a specific calculation

This endpoint returns the log from the calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetProgrammaticEnvironment
from fds.sdk.FactSetProgrammaticEnvironment.api import calculations_api
from fds.sdk.FactSetProgrammaticEnvironment.models import *
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
configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetProgrammaticEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | From url, provided by location header or response body in the calculation start endpoint

    try:
        # Get calculation log for a specific calculation
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_calculations_log(id)

        pprint(api_response)

    except fds.sdk.FactSetProgrammaticEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->get_calculations_log: %s\n" % e)
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

# **get_calculations_output**
> file_type get_calculations_output(id)

Get calculation output for a specific calculation

This endpoint returns the specified output from the calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetProgrammaticEnvironment
from fds.sdk.FactSetProgrammaticEnvironment.api import calculations_api
from fds.sdk.FactSetProgrammaticEnvironment.models import *
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
configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetProgrammaticEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calculations_api.CalculationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | From url, provided by location header or response body in the calculation start endpoint

    try:
        # Get calculation output for a specific calculation
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_calculations_output(id)

        pprint(api_response)

    except fds.sdk.FactSetProgrammaticEnvironment.ApiException as e:
        print("Exception when calling CalculationsApi->get_calculations_output: %s\n" % e)
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

