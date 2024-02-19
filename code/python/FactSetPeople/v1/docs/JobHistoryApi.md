# fds.sdk.FactSetPeople.JobHistoryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_people_jobs**](JobHistoryApi.md#get_people_jobs) | **GET** /factset-people/v1/jobs | Returns the Job history of the person.
[**get_people_jobs_for_list**](JobHistoryApi.md#get_people_jobs_for_list) | **POST** /factset-people/v1/jobs | Returns the Job history for the large list of people.



# **get_people_jobs**
> PeopleJobsResponse get_people_jobs(ids)

Returns the Job history of the person.

Returns the `Job` history of the person referenced by the entityId specified in the request. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPeople
from fds.sdk.FactSetPeople.api import job_history_api
from fds.sdk.FactSetPeople.models import *
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
configuration = fds.sdk.FactSetPeople.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPeople.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPeople.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = job_history_api.JobHistoryApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["0DPHLH-E","07MZV9-E"] # [str] | List of FactSet Person Entity identifier.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    status = "ALL" # str | Select only Jobs with a certain status primary, active, or inactive. (optional) if omitted the server will use the default value of "ALL"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    level = "DETAIL" # str | Select the level of detail only main Jobs or include other Jobs at a company. (optional) if omitted the server will use the default value of "DETAIL"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    type = "ALL" # str | Select only Jobs of a certain type board member or employee. (optional) if omitted the server will use the default value of "ALL"

    try:
        # Returns the Job history of the person.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_people_jobs(ids, status=status, level=level, type=type)

        pprint(api_response)

    except fds.sdk.FactSetPeople.ApiException as e:
        print("Exception when calling JobHistoryApi->get_people_jobs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of FactSet Person Entity identifier. |
 **status** | **str**| Select only Jobs with a certain status primary, active, or inactive. | [optional] if omitted the server will use the default value of "ALL"
 **level** | **str**| Select the level of detail only main Jobs or include other Jobs at a company. | [optional] if omitted the server will use the default value of "DETAIL"
 **type** | **str**| Select only Jobs of a certain type board member or employee. | [optional] if omitted the server will use the default value of "ALL"

### Return type

[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of Job objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_people_jobs_for_list**
> PeopleJobsResponse get_people_jobs_for_list(people_jobs_request)

Returns the Job history for the large list of people.

Returns the `Job` history of the person referenced by the entityId specified in the request. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPeople
from fds.sdk.FactSetPeople.api import job_history_api
from fds.sdk.FactSetPeople.models import *
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
configuration = fds.sdk.FactSetPeople.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPeople.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPeople.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = job_history_api.JobHistoryApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    people_jobs_request = PeopleJobsRequest(
        ids=Ids(["0DPHLH-E"]),
        status=Status("ALL"),
        level=Level("DETAIL"),
        type=Type("ALL"),
    ) # PeopleJobsRequest | 

    try:
        # Returns the Job history for the large list of people.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_people_jobs_for_list(people_jobs_request)

        pprint(api_response)

    except fds.sdk.FactSetPeople.ApiException as e:
        print("Exception when calling JobHistoryApi->get_people_jobs_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **people_jobs_request** | [**PeopleJobsRequest**](PeopleJobsRequest.md)|  |

### Return type

[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of Job objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

