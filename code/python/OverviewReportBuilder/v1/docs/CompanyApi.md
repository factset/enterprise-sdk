# fds.sdk.OverviewReportBuilder.CompanyApi

All URIs are relative to *https://api.factset.com/report/overview/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_current_cap**](CompanyApi.md#get_current_cap) | **GET** /current-cap | Current Capitalization
[**get_financial_highlights**](CompanyApi.md#get_financial_highlights) | **GET** /financial-highlights | Financial / Estimate Highlights
[**get_key_stats**](CompanyApi.md#get_key_stats) | **GET** /key-stats | Key Stats
[**get_peerlist**](CompanyApi.md#get_peerlist) | **GET** /peer-list | Peer List
[**get_profile_profile**](CompanyApi.md#get_profile_profile) | **GET** /profile | Overview Profile
[**get_trasactions**](CompanyApi.md#get_trasactions) | **GET** /transactions | Transactions



# **get_current_cap**
> StachTableResponse get_current_cap(id)

Current Capitalization

Get current capitalization data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OverviewReportBuilder
from fds.sdk.OverviewReportBuilder.api import company_api
from fds.sdk.OverviewReportBuilder.models import *
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
configuration = fds.sdk.OverviewReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OverviewReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OverviewReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS" # str | Company ticker

    try:
        # Current Capitalization
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_current_cap(id)

        pprint(api_response)

    except fds.sdk.OverviewReportBuilder.ApiException as e:
        print("Exception when calling CompanyApi->get_current_cap: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company ticker |

### Return type

[**StachTableResponse**](StachTableResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_highlights**
> StachTableResponse get_financial_highlights(id)

Financial / Estimate Highlights

Get financial highlights data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OverviewReportBuilder
from fds.sdk.OverviewReportBuilder.api import company_api
from fds.sdk.OverviewReportBuilder.models import *
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
configuration = fds.sdk.OverviewReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OverviewReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OverviewReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS" # str | Company ticker
    actual = 4 # int | The number of actual data periods to be returned. Must be 0 or greater (optional) if omitted the server will use the default value of 4
    estimate = 1 # int | The number of estimate data periods to be returned. Must be 0 or greater (optional) if omitted the server will use the default value of 1

    try:
        # Financial / Estimate Highlights
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_financial_highlights(id, actual=actual, estimate=estimate)

        pprint(api_response)

    except fds.sdk.OverviewReportBuilder.ApiException as e:
        print("Exception when calling CompanyApi->get_financial_highlights: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company ticker |
 **actual** | **int**| The number of actual data periods to be returned. Must be 0 or greater | [optional] if omitted the server will use the default value of 4
 **estimate** | **int**| The number of estimate data periods to be returned. Must be 0 or greater | [optional] if omitted the server will use the default value of 1

### Return type

[**StachTableResponse**](StachTableResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; Returns JSON data containing STACH 2.0 row organized package format |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_key_stats**
> KeyStatsResponse get_key_stats(id)

Key Stats

Get key stats data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OverviewReportBuilder
from fds.sdk.OverviewReportBuilder.api import company_api
from fds.sdk.OverviewReportBuilder.models import *
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
configuration = fds.sdk.OverviewReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OverviewReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OverviewReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS" # str | Company ticker

    try:
        # Key Stats
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_key_stats(id)

        pprint(api_response)

    except fds.sdk.OverviewReportBuilder.ApiException as e:
        print("Exception when calling CompanyApi->get_key_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company ticker |

### Return type

[**KeyStatsResponse**](KeyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns the JSON in a simple key-value format |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_peerlist**
> PeerListResponse get_peerlist(id)

Peer List

Retrieve peers for the provided company

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OverviewReportBuilder
from fds.sdk.OverviewReportBuilder.api import company_api
from fds.sdk.OverviewReportBuilder.models import *
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
configuration = fds.sdk.OverviewReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OverviewReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OverviewReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS" # str | Company ticker
    topn = 5 # float | Limits the number of peers returned. (optional)

    try:
        # Peer List
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_peerlist(id, topn=topn)

        pprint(api_response)

    except fds.sdk.OverviewReportBuilder.ApiException as e:
        print("Exception when calling CompanyApi->get_peerlist: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company ticker |
 **topn** | **float**| Limits the number of peers returned. | [optional]

### Return type

[**PeerListResponse**](PeerListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns JSON data containing key-value format |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_profile_profile**
> ProfileResponse get_profile_profile(id)

Overview Profile

Retrieve all profile properties for the provided security

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OverviewReportBuilder
from fds.sdk.OverviewReportBuilder.api import company_api
from fds.sdk.OverviewReportBuilder.models import *
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
configuration = fds.sdk.OverviewReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OverviewReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OverviewReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS" # str | Company ticker

    try:
        # Overview Profile
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_profile_profile(id)

        pprint(api_response)

    except fds.sdk.OverviewReportBuilder.ApiException as e:
        print("Exception when calling CompanyApi->get_profile_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company ticker |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns the JSON in a simple key-value format |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_trasactions**
> StachTableResponse get_trasactions(id)

Transactions

get transactions data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OverviewReportBuilder
from fds.sdk.OverviewReportBuilder.api import company_api
from fds.sdk.OverviewReportBuilder.models import *
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
configuration = fds.sdk.OverviewReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OverviewReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OverviewReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS" # str | Company ticker
    transaction_type = "ACQUISITION_MERGER" # str | Filters response to return only this type of transaction. If not specified, returns all transactions. Values are not case sensitive. (optional)
    financing_type = "EQUITY" # str | Filters response to return transactions of this financing type. If not specified, returns all transactions. Values are not case sensitive (optional)

    try:
        # Transactions
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_trasactions(id, transaction_type=transaction_type, financing_type=financing_type)

        pprint(api_response)

    except fds.sdk.OverviewReportBuilder.ApiException as e:
        print("Exception when calling CompanyApi->get_trasactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company ticker |
 **transaction_type** | **str**| Filters response to return only this type of transaction. If not specified, returns all transactions. Values are not case sensitive. | [optional]
 **financing_type** | **str**| Filters response to return transactions of this financing type. If not specified, returns all transactions. Values are not case sensitive | [optional]

### Return type

[**StachTableResponse**](StachTableResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; Returns JSON data containing STACH 2.0 row organized package format |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * X-DataDirect-Request-Key -  <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

