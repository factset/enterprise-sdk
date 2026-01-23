# fds.sdk.UniversalScreening.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_calculate_results**](ScreeningOperationsApi.md#get_calculate_results) | **GET** /job/{id} | 
[**get_export_results**](ScreeningOperationsApi.md#get_export_results) | **GET** /job/{id}/export | 
[**poll_calculate**](ScreeningOperationsApi.md#poll_calculate) | **GET** /job/{id}/status | 
[**submit_archive_ofdb**](ScreeningOperationsApi.md#submit_archive_ofdb) | **POST** /job/archive | 
[**submit_calculate**](ScreeningOperationsApi.md#submit_calculate) | **POST** /job/calculate | 
[**submit_export**](ScreeningOperationsApi.md#submit_export) | **POST** /job/export | 



# **get_calculate_results**
> PaginatedCalculationResponse get_calculate_results(id)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "123e4567-e89b-12d3-a456-426655440000" # str | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.
    pagination_limit = 12345 # int | Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional) if omitted the server will use the default value of 10000
    pagination_cursor = 0 # int | Paging index (Initial request may omit) (optional) if omitted the server will use the default value of 0

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
 **id** | **str**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |
 **pagination_limit** | **int**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional] if omitted the server will use the default value of 10000
 **pagination_cursor** | **int**| Paging index (Initial request may omit) | [optional] if omitted the server will use the default value of 0

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
**200** | Paginated Screen Results and Metadata |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**400** | The requested screen could not be opened. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**403** | User is not authorized for this operation. |  -  |
**404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_export_results**
> file_type get_export_results(id)



Retrieve results of an export request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "123e4567-e89b-12d3-a456-426655440000" # str | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_export_results(id)

        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->get_export_results: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/csv, text/plain, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Body of the requested export file. Content-type will be conditioned on requested export type. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Content-Disposition -  <br>  |
**202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**400** | The requested screen could not be opened. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**403** | User is not authorized for this operation. |  -  |
**404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **poll_calculate**
> ResourceStatusResponse poll_calculate(id)



Polls the job with a given screen ID and returns job status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "123e4567-e89b-12d3-a456-426655440000" # str | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.

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
 **id** | **str**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |

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
**201** | Job completed |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**403** | User is not authorized for this operation. |  -  |
**404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_archive_ofdb**
> ResourceStatusResponse submit_archive_ofdb()



Begins archive of screen to OFDB. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    screen_archive_ofdb_parameters = ScreenArchiveOFDBParameters(
        data=ScreenArchiveOFDBParametersData(
            archive_options=ScreenArchiveOFDBParametersDataArchiveOptions(
                archive_date="20201231",
                archive_type="ofdbSymbols",
                auto_symbol_updates=True,
                existed=False,
                filename="personal:/screening_api_example_file.ofdb",
                overwrite_data=True,
                quick_columns="PARAM1 PARAM2",
                symbol_type="cusip",
                time_series=True,
                unsplit_history=False,
                use_report_order=True,
            ),
            backtest_date="19951203",
            global_variables_map={
                "key": "key_example",
            },
            legacy_universe_type="equity",
            screen_name="SAMPLE_SCREENS:KPI_AIR.USWEB",
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
**202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_calculate**
> ResourceStatusResponse submit_calculate()



Begins calculation of screen. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    screen_calc_parameters = ScreenCalcParameters(
        meta=CalculateMetadata(
            sort=["#P.P1","-#P.P2"],
        ),
        data=ScreenCalcParametersData(
            backtest_date="20040412",
            global_variables_map={
                "key": "key_example",
            },
            legacy_universe_type="equity",
            screen_name="SAMPLE_SCREENS:KPI_AIR.USWEB",
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
**202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_export**
> SubmitExportResponse submit_export()



Begins the calculate and export of screen to specified file format. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    screen_export_parameters = ScreenExportParameters(
        meta=CalculateMetadata(
            sort=["#P.P1","-#P.P2"],
        ),
        data=ScreenExportParametersData(
            screen_name="SAMPLE_SCREENS:KPI_AIR.USWEB",
            file=None,
            backtest_date="20040412",
            global_variables_map={
                "key": "key_example",
            },
            legacy_universe_type="equity",
            grouping_info=GroupingInfo(
                grouping_state="EXPAND_ALL",
                custom_grouping=["MY_SECTOR","MY_INDUSTRY"],
            ),
        ),
    ) # ScreenExportParameters | Data required for an export request (optional)

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.submit_export(screen_export_parameters=screen_export_parameters)

        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling ScreeningOperationsApi->submit_export: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screen_export_parameters** | [**ScreenExportParameters**](ScreenExportParameters.md)| Data required for an export request | [optional]

### Return type

[**SubmitExportResponse**](SubmitExportResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful export submission response, returns the job ID unique to this export and the URL in the Location header to check the status of the export. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

