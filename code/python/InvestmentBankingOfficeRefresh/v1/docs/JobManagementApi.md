# fds.sdk.InvestmentBankingOfficeRefresh.JobManagementApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_active_job**](JobManagementApi.md#cancel_active_job) | **DELETE** /jobs/{id} | Cancel a job with the given resource ID
[**cancel_all_active_jobs**](JobManagementApi.md#cancel_all_active_jobs) | **DELETE** /jobs | Cancel all active jobs
[**get_jobs**](JobManagementApi.md#get_jobs) | **GET** /jobs | Get information on all active jobs



# **cancel_active_job**
> cancel_active_job(id)

Cancel a job with the given resource ID

Cancel a specific job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import job_management_api
from fds.sdk.InvestmentBankingOfficeRefresh.models import *
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
configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentBankingOfficeRefresh.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = job_management_api.JobManagementApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | Unique identifier for the job (resource ID returned from FactSet).

    try:
        # Cancel a job with the given resource ID
        # example passing only required values which don't have defaults set
        api_instance.cancel_active_job(id)


    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling JobManagementApi->cancel_active_job: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for the job (resource ID returned from FactSet). |

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
**400** | Bad Request |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_all_active_jobs**
> cancel_all_active_jobs()

Cancel all active jobs

Cancel all active (on_hold, queued, executing) jobs

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import job_management_api
from fds.sdk.InvestmentBankingOfficeRefresh.models import *
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
configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentBankingOfficeRefresh.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = job_management_api.JobManagementApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Cancel all active jobs
        # example, this endpoint has no required or optional parameters
        api_instance.cancel_all_active_jobs()


    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling JobManagementApi->cancel_all_active_jobs: %s\n" % e)
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
**400** | Bad Request |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_jobs**
> ActiveJobStatusList get_jobs()

Get information on all active jobs

Get the ids and status of all active jobs

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import job_management_api
from fds.sdk.InvestmentBankingOfficeRefresh.models import *
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
configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentBankingOfficeRefresh.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = job_management_api.JobManagementApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get information on all active jobs
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_jobs()

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling JobManagementApi->get_jobs: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ActiveJobStatusList**](ActiveJobStatusList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  |
**400** | Bad Request |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

