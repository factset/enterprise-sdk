# fds.sdk.PortfolioReportingBatcher.RunsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_run_status**](RunsApi.md#check_run_status) | **GET** /runs/{id}/status | check the status for a particular run ID
[**start_job_run**](RunsApi.md#start_job_run) | **POST** /runs | trigger PRB jobs



# **check_run_status**
> IdStatus check_run_status(id)

check the status for a particular run ID

Use this endpoint to check the status of a run using the id from the POST /runs endpoint

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PortfolioReportingBatcher
from fds.sdk.PortfolioReportingBatcher.api import runs_api
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
    api_instance = runs_api.RunsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "1013456" # str | run id

    try:
        # check the status for a particular run ID
        # example passing only required values which don't have defaults set
        api_response = api_instance.check_run_status(id)

        pprint(api_response)

    except fds.sdk.PortfolioReportingBatcher.ApiException as e:
        print("Exception when calling RunsApi->check_run_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| run id |

### Return type

[**IdStatus**](IdStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_job_run**
> StartJobRunResponse start_job_run()

trigger PRB jobs

Use this endpoint with with POST method to trigger PRB jobs.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PortfolioReportingBatcher
from fds.sdk.PortfolioReportingBatcher.api import runs_api
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
    api_instance = runs_api.RunsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    start_job_root = StartJobRoot(
        data=StartJob(
            job_name="job_name_example",
            overrides=JobOverrides(
                calendar=Calendar("fiveDay"),
                combinations=[
                    JobOverridesCombinationsRoot(
                        accounts=[
                            "accounts_example",
                        ],
                        dates=[
                            dateutil_parser('1970-01-01').date(),
                        ],
                    ),
                ],
                dates=JobOverridesDates(
                    end=dateutil_parser('1970-01-01').date(),
                    start=dateutil_parser('1970-01-01').date(),
                ),
                frequency=Frequency("daily"),
                run_as_of_date=dateutil_parser('1970-01-01').date(),
                run_as_serial_number="run_as_serial_number_example",
                tasks=[
                    "tasks_example",
                ],
            ),
            job_type=JobTypes("vault"),
        ),
    ) # StartJobRoot | The main object in the request body contains details for the job to be triggered. The \"name\" and \"type\" fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job's type. (optional)

    try:
        # trigger PRB jobs
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.start_job_run(start_job_root=start_job_root)

        pprint(api_response)

    except fds.sdk.PortfolioReportingBatcher.ApiException as e:
        print("Exception when calling RunsApi->start_job_run: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_job_root** | [**StartJobRoot**](StartJobRoot.md)| The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. | [optional]

### Return type

[**StartJobRunResponse**](StartJobRunResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Expected response, the job has been accepted, please use /runs/{id}/status to poll status and check progress |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**400** | Invalid post body parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**404** | Not Found - invalid inputs |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

