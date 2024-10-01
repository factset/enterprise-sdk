# fds.sdk.Vermilion.WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_schedule**](WorkflowApi.md#generate_schedule) | **POST** /v1/{tenant}/schedules/{scheduleDefinitionCode} | Creates schedule for the specified schedule definition
[**get_schedule_definitions**](WorkflowApi.md#get_schedule_definitions) | **GET** /v1/{tenant}/schedule-definitions | Retrieves a list of all schedule definitions
[**get_schedule_generation_logs**](WorkflowApi.md#get_schedule_generation_logs) | **GET** /v1/{tenant}/schedules/{scheduleId}/logs | Gets the generation logs for a specific schedule
[**get_schedules**](WorkflowApi.md#get_schedules) | **GET** /v1/{tenant}/schedules | Retrieves a list of all schedules
[**update_schedule_status**](WorkflowApi.md#update_schedule_status) | **PATCH** /v1/{tenant}/schedules/{scheduleId}/{status} | Update schedule status for specified schedule



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
    schedule_type = "MANUAL" # str | Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType=REPEATING,TEMPLATE (optional)
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
 **schedule_type** | **str**| Acts as a filter for the retrieval process. Filters the schedule definitions that match the given schedule type. Accepts multiple values separated by a comma, e.g. ?scheduleType&#x3D;REPEATING,TEMPLATE | [optional]
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

