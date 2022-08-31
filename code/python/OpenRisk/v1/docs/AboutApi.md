# fds.sdk.OpenRisk.AboutApi

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentation**](AboutApi.md#documentation) | **GET** /linear/{version} | Get OpenAPI Specification documentation
[**health_status**](AboutApi.md#health_status) | **GET** /linear/{version}/health | Get health of service
[**list_risk_models**](AboutApi.md#list_risk_models) | **GET** /linear/{version}/riskmodels | Get available risk models
[**risk_model_metadata**](AboutApi.md#risk_model_metadata) | **GET** /linear/{version}/riskmodels/{modelCode} | Get risk model details
[**stats**](AboutApi.md#stats) | **GET** /linear/{version}/stats | Get available risk statistics details
[**stats_names_only**](AboutApi.md#stats_names_only) | **GET** /linear/{version}/stats-names-only | Get available risk statistics names


# **documentation**
> InlineResponse200 documentation(version)

Get OpenAPI Specification documentation

The service documentation as this OpenAPI Specification JSON document for the corresponding major version number

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)

    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

    try:
        # Get OpenAPI Specification documentation
        # example passing only required values which don't have defaults set
        api_response = api_instance.documentation(version)
        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->documentation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The service documentation as this OpenAPI Specification JSON document for the corresponding major version number |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **health_status**
> InlineResponse2003 health_status(version)

Get health of service

Health status of the service

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)

    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

    try:
        # Get health of service
        # example passing only required values which don't have defaults set
        api_response = api_instance.health_status(version)
        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->health_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Service is operational and healthy |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**403** | Full access to the service is not authorized |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**404** | API version not found |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_risk_models**
> InlineResponse2001 list_risk_models(version)

Get available risk models

Get the list of available risk models, including their respective model codes required for use with other routes.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)

    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

    try:
        # Get available risk models
        # example passing only required values which don't have defaults set
        api_response = api_instance.list_risk_models(version)
        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->list_risk_models: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the list of available risk models for use. Both risk model subscription and each risk model vendor specific Open:Risk API subscription are required for use. For subscription, please report an issue from FactSet:Developer portal. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **risk_model_metadata**
> InlineResponse2002 risk_model_metadata(version, model_code)

Get risk model details

Get the meta data of the risk model for the corresponding modelCode. modelCode can be obtained via '/linear/{version}/riskmodels/' route.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)

    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
    model_code = RiskModelCode("FDS:GLOBAL_EQUITY_M_V1") # RiskModelCode | Model code

    try:
        # Get risk model details
        # example passing only required values which don't have defaults set
        api_response = api_instance.risk_model_metadata(version, model_code)
        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->risk_model_metadata: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |
 **model_code** | **RiskModelCode**| Model code |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the meta data of risk model. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stats**
> SupportedStats stats(version)

Get available risk statistics details

All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When 'securityGroupMethod' is 'statSpecific', please refer to statistics documentation service for more information.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)

    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

    try:
        # Get available risk statistics details
        # example passing only required values which don't have defaults set
        api_response = api_instance.stats(version)
        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |

### Return type

[**SupportedStats**](SupportedStats.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stats_names_only**
> SupportedStatsNamesOnly stats_names_only(version)

Get available risk statistics names

All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk)

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)

    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

    try:
        # Get available risk statistics names
        # example passing only required values which don't have defaults set
        api_response = api_instance.stats_names_only(version)
        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->stats_names_only: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |

### Return type

[**SupportedStatsNamesOnly**](SupportedStatsNamesOnly.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk) |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

