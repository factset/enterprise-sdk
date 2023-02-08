# fds.sdk.FactSetBenchmarks.BenchmarkConstituentsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_benchmark_constituents**](BenchmarkConstituentsApi.md#get_benchmark_constituents) | **GET** /factset-benchmarks/v1/constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
[**get_benchmark_constituents_for_list**](BenchmarkConstituentsApi.md#get_benchmark_constituents_for_list) | **POST** /factset-benchmarks/v1/constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
[**get_fi_benchmark_constituents**](BenchmarkConstituentsApi.md#get_fi_benchmark_constituents) | **GET** /factset-benchmarks/v1/fixed-income-constituents | Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
[**get_fi_benchmark_constituents_for_list**](BenchmarkConstituentsApi.md#get_fi_benchmark_constituents_for_list) | **POST** /factset-benchmarks/v1/fixed-income-constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.



# **get_benchmark_constituents**
> BenchmarkConstituentsResponse get_benchmark_constituents(ids)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. Use the helper endpoint **/id-list** for valid identifiers.   

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import benchmark_constituents_api
from fds.sdk.FactSetBenchmarks.models import *
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
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = benchmark_constituents_api.BenchmarkConstituentsApi(api_client)

    ids = [
        "ids_example",
    ] # [str] | Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error. <p>***ids limit** =  1 per request*</p>
    date = "date_example" # str | Date of holding expressed in YYYY-MM-DD format. (optional)
    currency = "currency_example" # str | Currency for response. (optional)

    try:
        # Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_benchmark_constituents(ids, date=date, currency=currency)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling BenchmarkConstituentsApi->get_benchmark_constituents: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; |
 **date** | **str**| Date of holding expressed in YYYY-MM-DD format. | [optional]
 **currency** | **str**| Currency for response. | [optional]

### Return type

[**BenchmarkConstituentsResponse**](BenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Benchmark data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_benchmark_constituents_for_list**
> BenchmarkConstituentsResponse get_benchmark_constituents_for_list(benchmark_constituents_request)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. Use the helper endpoint **/id-list** for valid identifiers. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import benchmark_constituents_api
from fds.sdk.FactSetBenchmarks.models import *
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
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = benchmark_constituents_api.BenchmarkConstituentsApi(api_client)

    benchmark_constituents_request = BenchmarkConstituentsRequest(
        ids=ConstituentIds(["SP50"]),
        date="2020-08-06",
        currency="USD",
    ) # BenchmarkConstituentsRequest | Requests Benchmark Constituents for the given identifier and date.

    try:
        # Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_benchmark_constituents_for_list(benchmark_constituents_request)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling BenchmarkConstituentsApi->get_benchmark_constituents_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_constituents_request** | [**BenchmarkConstituentsRequest**](BenchmarkConstituentsRequest.md)| Requests Benchmark Constituents for the given identifier and date. |

### Return type

[**BenchmarkConstituentsResponse**](BenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Benchmark data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fi_benchmark_constituents**
> FixedIncomeBenchmarkConstituentsResponse get_fi_benchmark_constituents(ids)

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import benchmark_constituents_api
from fds.sdk.FactSetBenchmarks.models import *
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
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = benchmark_constituents_api.BenchmarkConstituentsApi(api_client)

    ids = [
        "LHMN0001",
    ] # [str] | Fixed Income Benchmark Identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error. <p>***ids limit** =  1 per request*</p>
    date = "date_example" # str | Date of holding expressed in YYYY-MM-DD format. (optional)
    currency = "currency_example" # str | Currency for response. (optional)

    try:
        # Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fi_benchmark_constituents(ids, date=date, currency=currency)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling BenchmarkConstituentsApi->get_fi_benchmark_constituents: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Fixed Income Benchmark Identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; |
 **date** | **str**| Date of holding expressed in YYYY-MM-DD format. | [optional]
 **currency** | **str**| Currency for response. | [optional]

### Return type

[**FixedIncomeBenchmarkConstituentsResponse**](FixedIncomeBenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fixed Income Constituent data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fi_benchmark_constituents_for_list**
> FixedIncomeBenchmarkConstituentsResponse get_fi_benchmark_constituents_for_list(fixed_income_benchmark_constituents_request)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import benchmark_constituents_api
from fds.sdk.FactSetBenchmarks.models import *
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
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = benchmark_constituents_api.BenchmarkConstituentsApi(api_client)

    fixed_income_benchmark_constituents_request = FixedIncomeBenchmarkConstituentsRequest(
        ids=FIConstituentIds(["LHMN0001"]),
        date="2020-08-06",
        currency="USD",
    ) # FixedIncomeBenchmarkConstituentsRequest | Requests Fixed Income Benchmark Constituents for the given identifier and date.

    try:
        # Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fi_benchmark_constituents_for_list(fixed_income_benchmark_constituents_request)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling BenchmarkConstituentsApi->get_fi_benchmark_constituents_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fixed_income_benchmark_constituents_request** | [**FixedIncomeBenchmarkConstituentsRequest**](FixedIncomeBenchmarkConstituentsRequest.md)| Requests Fixed Income Benchmark Constituents for the given identifier and date. |

### Return type

[**FixedIncomeBenchmarkConstituentsResponse**](FixedIncomeBenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fixed Income Constituent data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

