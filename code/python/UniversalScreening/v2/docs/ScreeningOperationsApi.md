# fds.sdk.UniversalScreening.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_calculate_results**](ScreeningOperationsApi.md#get_calculate_results) | **GET** /v2/job/{id} | 
[**poll_calculate**](ScreeningOperationsApi.md#poll_calculate) | **GET** /v2/job/{id}/status | 
[**submit_archive_ofdb**](ScreeningOperationsApi.md#submit_archive_ofdb) | **POST** /v2/job/archive | 
[**submit_calculate**](ScreeningOperationsApi.md#submit_calculate) | **POST** /v2/job/calculate | 


# **get_calculate_results**
> PaginatedCalculationResponse get_calculate_results(id)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import screening_operations_api
from fds.sdk.UniversalScreening.models import *
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
configuration = fds.sdk.UniversalScreening.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.UniversalScreening.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.UniversalScreening.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    id = "id_example" # str | Unique identifier for a screen calculation job
    pagination_limit = 1 # int | Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)
    pagination_cursor = 1 # int | Paging index (Initial request may omit) (optional)

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_calculate_results(id, pagination_limit=pagination_limit, pagination_cursor=pagination_cursor)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_calculate_results: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a screen calculation job |
 **pagination_limit** | **int**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional]
 **pagination_cursor** | **int**| Paging index (Initial request may omit) | [optional]

### Return type

[**PaginatedCalculationResponse**](PaginatedCalculationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Paginated Screen Results and Metadata |  -  |
**202** | Calculation job still in progress |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
**400** | The requested screen could not be opened. |  -  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**410** | The results have been fetched for this ID. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **poll_calculate**
> ResourceStatusResponse poll_calculate(id)



Polls the job with a given screen ID and returns job status

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import screening_operations_api
from fds.sdk.UniversalScreening.models import *
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
configuration = fds.sdk.UniversalScreening.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.UniversalScreening.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.UniversalScreening.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    id = "id_example" # str | Unique identifier for a screen calculation job

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.poll_calculate(id)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->poll_calculate: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a screen calculation job |

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Job completed |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
**202** | Calculation job still in progress |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**410** | The results have been fetched for this ID. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_archive_ofdb**
> ResourceStatusResponse submit_archive_ofdb()



Begins archive of screen to OFDB. Subject to rate limiting by serial.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import screening_operations_api
from fds.sdk.UniversalScreening.models import *
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
configuration = fds.sdk.UniversalScreening.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.UniversalScreening.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.UniversalScreening.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    screen_archive_ofdb_parameters = ScreenArchiveOFDBParameters(
        data=ScreenArchiveOFDBParametersData(
            archive_options=ScreenArchiveOFDBParametersDataArchiveOptions(
                archive_date="archive_date_example",
                archive_type="archive_type_example",
                auto_symbol_updates=True,
                existed=True,
                filename="filename_example",
                overwrite_data=True,
                quick_columns="quick_columns_example",
                symbol_type="symbol_type_example",
                time_series=True,
                unsplit_history=True,
                use_report_order=True,
            ),
            backtest_date="backtest_date_example",
            global_variables_map={
                "key": "key_example",
            },
            legacy_universe_type="legacy_universe_type_example",
            screen_name="screen_name_example",
        ),
    ) # ScreenArchiveOFDBParameters | Data required for an archive to OFDB request (optional)

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.submit_archive_ofdb(screen_archive_ofdb_parameters=screen_archive_ofdb_parameters)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->submit_archive_ofdb: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screen_archive_ofdb_parameters** | [**ScreenArchiveOFDBParameters**](ScreenArchiveOFDBParameters.md)| Data required for an archive to OFDB request | [optional]

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  |
**400** | Invalid request body. |  -  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_calculate**
> ResourceStatusResponse submit_calculate()



Begins calculation of screen. Subject to rate limiting by serial.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import screening_operations_api
from fds.sdk.UniversalScreening.models import *
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
configuration = fds.sdk.UniversalScreening.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.UniversalScreening.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.UniversalScreening.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = screening_operations_api.ScreeningOperationsApi(api_client)

    screen_calc_parameters = ScreenCalcParameters(
        data=ScreenCalcParametersData(
            backtest_date="backtest_date_example",
            global_variables_map={
                "key": "key_example",
            },
            legacy_universe_type="legacy_universe_type_example",
            screen_name="screen_name_example",
        ),
    ) # ScreenCalcParameters | Data required for a calculation request (optional)

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.submit_calculate(screen_calc_parameters=screen_calc_parameters)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->submit_calculate: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screen_calc_parameters** | [**ScreenCalcParameters**](ScreenCalcParameters.md)| Data required for a calculation request | [optional]

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  |
**400** | Invalid request body. |  -  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

