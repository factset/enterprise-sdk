# fds.sdk.UniversalScreening.JobManagementApi

All URIs are relative to *https://api.factset.com/universal-screening/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_active_job**](JobManagementApi.md#delete_active_job) | **DELETE** /job/{id} | 
[**delete_all_active_jobs**](JobManagementApi.md#delete_all_active_jobs) | **DELETE** /jobs | 
[**get_all_active_jobs**](JobManagementApi.md#get_all_active_jobs) | **GET** /jobs | 



# **delete_active_job**
> delete_active_job(id)



Delete a specified job started by the requester's username-serial

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import job_management_api
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
    api_instance = job_management_api.JobManagementApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "123e4567-e89b-12d3-a456-426655440000" # str | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.

    try:
        # example passing only required values which don't have defaults set
        api_instance.delete_active_job(id)


    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling JobManagementApi->delete_active_job: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |

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
**204** | No content |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_all_active_jobs**
> delete_all_active_jobs()



Delete all active jobs started by the requester's username-serial

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import job_management_api
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
    api_instance = job_management_api.JobManagementApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # example, this endpoint has no required or optional parameters
        api_instance.delete_all_active_jobs()


    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling JobManagementApi->delete_all_active_jobs: %s\n" % e)
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
**204** | No content |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_active_jobs**
> ActiveJobsData get_all_active_jobs()



Retrieve list of all active job ids started by requester's username-serial

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import job_management_api
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
    api_instance = job_management_api.JobManagementApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_all_active_jobs()

        pprint(api_response)

    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling JobManagementApi->get_all_active_jobs: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ActiveJobsData**](ActiveJobsData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ActiveJobsResponse contains id of all of a user&#39;s active jobs |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Invalid or missing authentication. |  -  |
**404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

