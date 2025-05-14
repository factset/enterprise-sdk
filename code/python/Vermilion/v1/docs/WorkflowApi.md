# fds.sdk.Vermilion.WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_schedule**](WorkflowApi.md#generate_schedule) | **POST** /v1/{tenant}/schedules/{scheduleDefinitionCode} | Creates schedule for the specified schedule definition
[**generate_schedule_tasks**](WorkflowApi.md#generate_schedule_tasks) | **POST** /v1/{tenant}/schedules/{scheduleId}/generate-tasks | Generates the tasks for the initialised schedule
[**get_schedule_by_id**](WorkflowApi.md#get_schedule_by_id) | **GET** /v1/{tenant}/schedules/{scheduleId} | Gets a schedule based on the schedule ID
[**get_schedule_definitions**](WorkflowApi.md#get_schedule_definitions) | **GET** /v1/{tenant}/schedule-definitions | Retrieves a list of all schedule definitions
[**get_schedule_generation_logs**](WorkflowApi.md#get_schedule_generation_logs) | **GET** /v1/{tenant}/schedules/{scheduleId}/logs | Gets the generation logs for a specific schedule
[**get_schedules**](WorkflowApi.md#get_schedules) | **GET** /v1/{tenant}/schedules | Retrieves a list of all schedules
[**get_task**](WorkflowApi.md#get_task) | **GET** /v1/{tenant}/tasks/{taskId} | Gets a task based on the task ID
[**get_task_history**](WorkflowApi.md#get_task_history) | **GET** /v1/{tenant}/tasks/{taskId}/history | Gets the task history for a specific task
[**get_tasks**](WorkflowApi.md#get_tasks) | **GET** /v1/{tenant}/tasks | Retrieves a list of all tasks
[**update_schedule_status**](WorkflowApi.md#update_schedule_status) | **PATCH** /v1/{tenant}/schedules/{scheduleId}/{status} | Update schedule status for specified schedule
[**update_task_details**](WorkflowApi.md#update_task_details) | **PATCH** /v1/{tenant}/tasks/{taskId} | Updates the task details for the specified task.



# **generate_schedule**
> GenerateScheduleResponse generate_schedule(tenant, schedule_definition_code)

Creates schedule for the specified schedule definition

Creates schedule for the specified Schedule Definition code and sets to running based on the param in the JSON in the request body

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    schedule_definition_code = "TEST_SCHEDULE_DEF" # str | The schedule definition code for which to generate the schedule
    set_to_running = True # bool | This parameter is used to set the generated schedule's status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. (optional)

    try:
        # Creates schedule for the specified schedule definition
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.generate_schedule(tenant, schedule_definition_code, set_to_running=set_to_running)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->generate_schedule: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **schedule_definition_code** | **str**| The schedule definition code for which to generate the schedule |
 **set_to_running** | **bool**| This parameter is used to set the generated schedule&#39;s status to Running.If parameter is set to true, the generated schedule will be set to Running. If no value is provided, the schedule will remain in Initialised status. | [optional]

### Return type

[**GenerateScheduleResponse**](GenerateScheduleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Schedule generation request succeeded and tasks have been generated |  -  |
**400** | The supplied schedule definition code missing or invalid |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to create schedule in VRS |  -  |
**404** | The schedule definition code could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_schedule_tasks**
> ScheduleStatusUpdateResponse generate_schedule_tasks(tenant, schedule_id)

Generates the tasks for the initialised schedule

Generates the schedule tasks for the specified schedule id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    schedule_id = "123456" # str | The schedule id for which to generate the tasks

    try:
        # Generates the tasks for the initialised schedule
        # example passing only required values which don't have defaults set
        api_response = api_instance.generate_schedule_tasks(tenant, schedule_id)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->generate_schedule_tasks: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **schedule_id** | **str**| The schedule id for which to generate the tasks |

### Return type

[**ScheduleStatusUpdateResponse**](ScheduleStatusUpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Task generation request succeeded and task generation is in progress |  -  |
**400** | Tasks could not be generated because the schedule is not in an initialized state |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to generate tasks for the schedule |  -  |
**404** | The schedule id could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server might have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedule_by_id**
> ScheduleResponseData get_schedule_by_id(tenant, schedule_id)

Gets a schedule based on the schedule ID

Gets a schedule Object based on the schedule ID passed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    schedule_id = "16304" # str | The Id of the schedule

    try:
        # Gets a schedule based on the schedule ID
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_schedule_by_id(tenant, schedule_id)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_schedule_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **schedule_id** | **str**| The Id of the schedule |

### Return type

[**ScheduleResponseData**](ScheduleResponseData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant) |  -  |
**401** | Unauthorised |  -  |
**403** | Forbidden. No permissions to view schedule in VRS |  -  |
**404** | The supplied schedule ID was not found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedule_definitions**
> ScheduleDefinitionsList get_schedule_definitions(tenant)

Retrieves a list of all schedule definitions

Retrieves all schedule definitions the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    schedule_type = "MANUAL" # str | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType=REPEATING,MANUAL (optional)
    report_date = "LAST_BUSINESS_DAY_OF_PREV_MONTH" # str | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate=LAST_DAY_OF_PREV_MONTH,CREATION_DATE (optional)
    last_updated_by = "John" # str | Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions (optional)
    start_date = "25 March 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    end_date = "25 March 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    sort = ["name"] # [str] | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order. (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional) if omitted the server will use the default value of 0

    try:
        # Retrieves a list of all schedule definitions
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_schedule_definitions(tenant, schedule_type=schedule_type, report_date=report_date, last_updated_by=last_updated_by, start_date=start_date, end_date=end_date, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_schedule_definitions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **schedule_type** | **str**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,MANUAL | [optional]
 **report_date** | **str**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule report date.  Accepts multiple values separated by a comma, e.g. ?reportDate&#x3D;LAST_DAY_OF_PREV_MONTH,CREATION_DATE | [optional]
 **last_updated_by** | **str**| Acts as a filter for the retrieval process. Filters the schedule definitions where the provided parameter value matches or is a substring of the last updated by value of the schedule definitions | [optional]
 **start_date** | **str**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **end_date** | **str**| Acts as a filter for the retrieval process. Filters the schedule definitions based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **[str]**| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional] if omitted the server will use the default value of 0

### Return type

[**ScheduleDefinitionsList**](ScheduleDefinitionsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, scheduleType) |  -  |
**401** | Unauthorised |  -  |
**403** | Forbidden. No permissions to view schedule definitions in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedule_generation_logs**
> ScheduleGenerationLogList get_schedule_generation_logs(tenant, schedule_id)

Gets the generation logs for a specific schedule

Gets the generation logs for a specific schedule based on the Schedule ID. Allows the user to sort and filter logs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    schedule_id = "123456" # str | The scheduleId for which the logs are requested
    type = "INFO" # str | Acts as a filter for the retrieval process. Filters the log instances that match the input type (optional)
    message = "package definition" # str | Acts as a filter for the retrieval process. Filters the log instances that match the input message (optional)
    log_set = "1" # str | Acts as a filter for the retrieval process. Filters the log instances that match the input logset (optional)
    start_date = "25 March 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    end_date = "25 March 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    sort = ["sequenceNumber"] # [str] | The column to sort on. Can add - to sort (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional) if omitted the server will use the default value of 0

    try:
        # Gets the generation logs for a specific schedule
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_schedule_generation_logs(tenant, schedule_id, type=type, message=message, log_set=log_set, start_date=start_date, end_date=end_date, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_schedule_generation_logs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **schedule_id** | **str**| The scheduleId for which the logs are requested |
 **type** | **str**| Acts as a filter for the retrieval process. Filters the log instances that match the input type | [optional]
 **message** | **str**| Acts as a filter for the retrieval process. Filters the log instances that match the input message | [optional]
 **log_set** | **str**| Acts as a filter for the retrieval process. Filters the log instances that match the input logset | [optional]
 **start_date** | **str**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **end_date** | **str**| Acts as a filter for the retrieval process. Filters the log instances based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **[str]**| The column to sort on. Can add - to sort | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional] if omitted the server will use the default value of 0

### Return type

[**ScheduleGenerationLogList**](ScheduleGenerationLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, type) |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view schedule logs in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_schedules**
> SchedulesList get_schedules(tenant)

Retrieves a list of all schedules

Retrieves all schedules the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    status = "RUNNING" # str | Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status=INITIALISED,RUNNING (optional)
    start_date = "14 June 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    end_date = "14 June 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    sort = ["scheduleId"] # [str] | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order. (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional) if omitted the server will use the default value of 0

    try:
        # Retrieves a list of all schedules
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_schedules(tenant, status=status, start_date=start_date, end_date=end_date, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_schedules: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **status** | **str**| Acts as a filter for the retrieval process. Filters the schedules that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;INITIALISED,RUNNING | [optional]
 **start_date** | **str**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **end_date** | **str**| Acts as a filter for the retrieval process. Filters the schedules based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **[str]**| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional] if omitted the server will use the default value of 0

### Return type

[**SchedulesList**](SchedulesList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, status) |  -  |
**401** | Unauthorised |  -  |
**403** | Forbidden. No permissions to view schedule definitions in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_task**
> TaskDetailsObject get_task(tenant, task_id)

Gets a task based on the task ID

Gets a task Object based on the task ID passed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    task_id = "135709" # str | The Id of the task

    try:
        # Gets a task based on the task ID
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_task(tenant, task_id)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_task: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **task_id** | **str**| The Id of the task |

### Return type

[**TaskDetailsObject**](TaskDetailsObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant) |  -  |
**401** | Unauthorised |  -  |
**403** | Forbidden. No permissions to view tasks in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_task_history**
> TaskHistoryList get_task_history(tenant, task_id)

Gets the task history for a specific task

Gets the task history for a specific task based on the Task ID. Allows the user to sort and filter the task history entries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    task_id = "123456" # str | The taskId for which the history of the specific task is requested
    action_type = "Status Changed" # str | Acts as a filter for the retrieval process. Filters the task history entries that match the given action type (optional)
    reason_code = "Missing Data" # str | Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code (optional)
    start_date = "25 March 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    end_date = "25 March 2024 00:00:00" # str | Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). (optional)
    sort = ["dateAndTime"] # [str] | The column to sort on. Can add - to sort for descending order (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional) if omitted the server will use the default value of 0

    try:
        # Gets the task history for a specific task
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_task_history(tenant, task_id, action_type=action_type, reason_code=reason_code, start_date=start_date, end_date=end_date, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_task_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **task_id** | **str**| The taskId for which the history of the specific task is requested |
 **action_type** | **str**| Acts as a filter for the retrieval process. Filters the task history entries that match the given action type | [optional]
 **reason_code** | **str**| Acts as a filter for the retrieval process. Filters the task history entries that match the given reason code | [optional]
 **start_date** | **str**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **end_date** | **str**| Acts as a filter for the retrieval process. Filters the task history events based on their last updated date, the input date must be of the date format (d MMMMM yyyy 00:00:00). | [optional]
 **sort** | **[str]**| The column to sort on. Can add - to sort for descending order | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional] if omitted the server will use the default value of 0

### Return type

[**TaskHistoryList**](TaskHistoryList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, taskId) |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view task in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tasks**
> TaskList get_tasks(tenant)

Retrieves a list of all tasks

Retrieves all tasks the user has permissions for. User has sort and filter parameters available to use.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    task_type = "PACKAGE_REPORTS" # str | Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType=SIGNOFF_DATA,PACKAGE_REPORTS (optional)
    status = "PENDING" # str | Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status=PENDING,AWAITING_CORRECTION (optional)
    role = "Client Reporting Manager" # str | Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task (optional)
    user = "John" # str | Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task (optional)
    immediate_tasks_only = True # bool | Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true (optional)
    schedule_id = 37325 # int | Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value (optional)
    sort = ["taskId"] # [str] | The column to sort on. Can add '-' to the start of the parameter value to sort in descending order. (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional) if omitted the server will use the default value of 0

    try:
        # Retrieves a list of all tasks
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_tasks(tenant, task_type=task_type, status=status, role=role, user=user, immediate_tasks_only=immediate_tasks_only, schedule_id=schedule_id, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->get_tasks: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **task_type** | **str**| Acts as a filter for the retrieval process. Filters the tasks that match the given task type. Accepts multiple values separated by a comma, e.g. ?taskType&#x3D;SIGNOFF_DATA,PACKAGE_REPORTS | [optional]
 **status** | **str**| Acts as a filter for the retrieval process. Filters the tasks that match the given status. Accepts multiple values separated by a comma, e.g. ?status&#x3D;PENDING,AWAITING_CORRECTION | [optional]
 **role** | **str**| Acts as a filter for the retrieval process. Filters the tasks that match the input role assigned to the task | [optional]
 **user** | **str**| Acts as a filter for the retrieval process. Filters the tasks that match the input user name assigned to the task | [optional]
 **immediate_tasks_only** | **bool**| Acts as a filter for the retrieval process. Filters the immediate tasks if the parameter value is set to true | [optional]
 **schedule_id** | **int**| Acts as a filter for the retrieval process. Filters the schedule tasks for the Schedule Id passed in the parameter value | [optional]
 **sort** | **[str]**| The column to sort on. Can add &#39;-&#39; to the start of the parameter value to sort in descending order. | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional] if omitted the server will use the default value of 0

### Return type

[**TaskList**](TaskList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant, status) |  -  |
**401** | Unauthorised |  -  |
**403** | Forbidden. No permissions to view tasks in VRS |  -  |
**404** | The supplied schedule Id was not found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_schedule_status**
> ScheduleStatusUpdateResponse update_schedule_status(tenant, schedule_id, status)

Update schedule status for specified schedule

Updated the schedule status for the specified schedule id based on the given status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    schedule_id = "123456" # str | The schedule id for which to update the status
    status = "RUNNING" # str | The schedule status that needs to be updated only if the transition is valid

    try:
        # Update schedule status for specified schedule
        # example passing only required values which don't have defaults set
        api_response = api_instance.update_schedule_status(tenant, schedule_id, status)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->update_schedule_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **schedule_id** | **str**| The schedule id for which to update the status |
 **status** | **str**| The schedule status that needs to be updated only if the transition is valid |

### Return type

[**ScheduleStatusUpdateResponse**](ScheduleStatusUpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update schedule request succeeded and status has been changed |  -  |
**400** | Schedule status in the request is missing or invalid |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to update schedule in VRS |  -  |
**404** | The schedule id could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_task_details**
> TaskPatchResponseObject update_task_details(tenant, task_id, task_patch_request_body)

Updates the task details for the specified task.

Updates the task details for the specified task.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import workflow_api
from fds.sdk.Vermilion.models import *
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
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = workflow_api.WorkflowApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    task_id = "123456" # str | The unique identifier for task
    task_patch_request_body = TaskPatchRequestBody(
        data=TaskPatchRequestBodyData(
            status="COMPLETED",
            expected_start_date="expected_start_date_example",
            expected_end_date="expected_end_date_example",
            actual_start_date="actual_start_date_example",
            notes="notes_example",
            role="role_example",
            user="user_example",
            action="action_example",
            reason="reason_example",
        ),
    ) # TaskPatchRequestBody | 

    try:
        # Updates the task details for the specified task.
        # example passing only required values which don't have defaults set
        api_response = api_instance.update_task_details(tenant, task_id, task_patch_request_body)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling WorkflowApi->update_task_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **task_id** | **str**| The unique identifier for task |
 **task_patch_request_body** | [**TaskPatchRequestBody**](TaskPatchRequestBody.md)|  |

### Return type

[**TaskPatchResponseObject**](TaskPatchResponseObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**206** | Request was partially successful |  -  |
**400** | Bad Request. Required values not provided in request parameter or invalid values given (e.g. tenant) |  -  |
**401** | Unauthorised |  -  |
**403** | Forbidden. No permissions to view the task. |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

