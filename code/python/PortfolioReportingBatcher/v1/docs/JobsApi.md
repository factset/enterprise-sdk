# fds.sdk.PortfolioReportingBatcher.JobsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_get_details_for_job**](JobsApi.md#v1_get_details_for_job) | **GET** /jobs/{type}/{name} | Get details for the given PRB job
[**v1_get_prb_jobs**](JobsApi.md#v1_get_prb_jobs) | **GET** /jobs | Get a list of existing jobs



# **v1_get_details_for_job**
> JobDetailsResponse v1_get_details_for_job(type, name)

Get details for the given PRB job

Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PortfolioReportingBatcher
from fds.sdk.PortfolioReportingBatcher.api import jobs_api
from fds.sdk.PortfolioReportingBatcher.models import *
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
configuration = fds.sdk.PortfolioReportingBatcher.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.PortfolioReportingBatcher.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.PortfolioReportingBatcher.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = jobs_api.JobsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    type = JobTypes("vault") # JobTypes | The jobs type
    name = "name_example" # str | The jobs name
    attribute = [
        "documents",
    ] # [str] | The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)

    try:
        # Get details for the given PRB job
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.v1_get_details_for_job(type, name, attribute=attribute)

        pprint(api_response)

    except fds.sdk.PortfolioReportingBatcher.ApiException as e:
        print("Exception when calling JobsApi->v1_get_details_for_job: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **JobTypes**| The jobs type |
 **name** | **str**| The jobs name |
 **attribute** | **[str]**| The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. | [optional]

### Return type

[**JobDetailsResponse**](JobDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**400** | Invalid input parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**404** | Not Found - invalid inputs |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_get_prb_jobs**
> JobListResponse v1_get_prb_jobs()

Get a list of existing jobs

Use this endpoint with the optional 'type' or 'name' filters to get a list of PRB jobs. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PortfolioReportingBatcher
from fds.sdk.PortfolioReportingBatcher.api import jobs_api
from fds.sdk.PortfolioReportingBatcher.models import *
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
configuration = fds.sdk.PortfolioReportingBatcher.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.PortfolioReportingBatcher.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.PortfolioReportingBatcher.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = jobs_api.JobsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    type = JobTypes("vault") # JobTypes | The job type (optional)
    name = "name_example" # str | The job name (optional)
    pagination_offset = 0 # int | The number of jobs to skip (please note the jobs are ordered by last modified in descending order, i.e. most recently modified will show on the (optional)
    pagination_limit = 1 # int | The number of jobs to bring back (maximum 50) (optional)

    try:
        # Get a list of existing jobs
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.v1_get_prb_jobs(type=type, name=name, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.PortfolioReportingBatcher.ApiException as e:
        print("Exception when calling JobsApi->v1_get_prb_jobs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **JobTypes**| The job type | [optional]
 **name** | **str**| The job name | [optional]
 **pagination_offset** | **int**| The number of jobs to skip (please note the jobs are ordered by last modified in descending order, i.e. most recently modified will show on the | [optional]
 **pagination_limit** | **int**| The number of jobs to bring back (maximum 50) | [optional]

### Return type

[**JobListResponse**](JobListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**400** | Invalid input parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

