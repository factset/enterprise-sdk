# fds.sdk.UniversalScreening.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_active_job**](DefaultApi.md#delete_active_job) | **DELETE** /v1/calculations/{id} | 
[**delete_all_active_jobs**](DefaultApi.md#delete_all_active_jobs) | **DELETE** /v1/calculations | 
[**get_all_active_jobs**](DefaultApi.md#get_all_active_jobs) | **GET** /v1/calculations | 
[**get_calculate_results**](DefaultApi.md#get_calculate_results) | **GET** /v1/calculations/{id} | 
[**poll_archive_ofdb**](DefaultApi.md#poll_archive_ofdb) | **GET** /v1/archive/{id}/status | 
[**poll_calculate**](DefaultApi.md#poll_calculate) | **GET** /v1/calculations/{id}/status | 
[**submit_archive_ofdb**](DefaultApi.md#submit_archive_ofdb) | **POST** /v1/archive | 
[**submit_calculate**](DefaultApi.md#submit_calculate) | **POST** /v1/calculations | 


# **delete_active_job**
> delete_active_job(id)



Delete a specified job started by the requester's username-serial

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
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
    api_instance = _api.DefaultApi(api_client)

    id = "id_example" # str | Unique identifier for a screen calculation job

    try:
        api_instance.delete_active_job(id)
    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->delete_active_job: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a screen calculation job |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No content |  -  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_all_active_jobs**
> delete_all_active_jobs()



Delete all active jobs started by the requester's username-serial

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
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
    api_instance = _api.DefaultApi(api_client)


    try:
        api_instance.delete_all_active_jobs()
    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->delete_all_active_jobs: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_active_jobs**
> InlineResponse200 get_all_active_jobs()



Retrieve list of all active job ids started by requester's username-serial

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
from fds.sdk.UniversalScreening.model.inline_response200 import InlineResponse200
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
    api_instance = _api.DefaultApi(api_client)


    try:
        api_response = api_instance.get_all_active_jobs()
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->get_all_active_jobs: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ActiveJobsResponse contains id of all of a user&#39;s active jobs |  -  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_calculate_results**
> get_calculate_results(id)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.resource_status_response import ResourceStatusResponse
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
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
    api_instance = _api.DefaultApi(api_client)

    id = "id_example" # str | Unique identifier for a screen calculation job
    pagination_limit = 1 # int | Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)
    pagination_cursor = 1 # int | Paging index (Initial request may omit) (optional)

    try:
        api_instance.get_calculate_results(id, pagination_limit=pagination_limit, pagination_cursor=pagination_cursor)
    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->get_calculate_results: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a screen calculation job |
 **pagination_limit** | **int**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional]
 **pagination_cursor** | **int**| Paging index (Initial request may omit) | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Screen calculation complete. The screen results will be formatted as a STACH 2.0 table and in a property named data. In the case of pagination column metadata will only be returned with the first page. Results will be purged after they are retrieved or six hours. |  -  |
**202** | Calculation job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
**400** | The requested screen could not be opened. |  -  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**410** | The results have been fetched for this ID. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **poll_archive_ofdb**
> ResourceStatusResponse poll_archive_ofdb(id)



Polls the archive OFDB job with a given archive job ID and returns job status

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.resource_status_response import ResourceStatusResponse
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
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
    api_instance = _api.DefaultApi(api_client)

    id = "id_example" # str | Unique identifier for a screen archive to OFDB job

    try:
        api_response = api_instance.poll_archive_ofdb(id)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->poll_archive_ofdb: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a screen archive to OFDB job |

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
**201** | Archive job completed |  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
**202** | Archive job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**410** | The results have been fetched for this ID. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **poll_calculate**
> ResourceStatusResponse poll_calculate(id)



Polls the calculation job with a given screen calculation ID and returns job status

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.resource_status_response import ResourceStatusResponse
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
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
    api_instance = _api.DefaultApi(api_client)

    id = "id_example" # str | Unique identifier for a screen calculation job

    try:
        api_response = api_instance.poll_calculate(id)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->poll_calculate: %s\n" % e)
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
**201** | Calculation job completed |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
**202** | Calculation job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  -  |
**410** | The results have been fetched for this ID. |  -  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_archive_ofdb**
> ResourceStatusResponse submit_archive_ofdb()



Begins archive of screen to OFDB

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.resource_status_response import ResourceStatusResponse
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
from fds.sdk.UniversalScreening.model.screen_archive_ofdb_parameters import ScreenArchiveOFDBParameters
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
    api_instance = _api.DefaultApi(api_client)

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
        api_response = api_instance.submit_archive_ofdb(screen_archive_ofdb_parameters=screen_archive_ofdb_parameters)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->submit_archive_ofdb: %s\n" % e)
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
**202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
**400** | Invalid request body. |  -  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_calculate**
> ResourceStatusResponse submit_calculate()



Begins calculation of screen

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import _api
from fds.sdk.UniversalScreening.model.resource_status_response import ResourceStatusResponse
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
from fds.sdk.UniversalScreening.model.screen_calc_parameters import ScreenCalcParameters
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
    api_instance = _api.DefaultApi(api_client)

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
        api_response = api_instance.submit_calculate(screen_calc_parameters=screen_calc_parameters)
        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->submit_calculate: %s\n" % e)
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
**202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
**400** | Invalid request body. |  -  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

