# fds.sdk.FactSetConcordance.PeopleMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_people_decisions**](PeopleMatchBulkApi.md#get_people_decisions) | **GET** /factset-concordance/v2/people-decisions | Get the decisions of matches for the requested taskId.
[**get_people_task_for_list**](PeopleMatchBulkApi.md#get_people_task_for_list) | **POST** /factset-concordance/v2/people-task | Create a People Concordance Task.
[**get_people_task_status**](PeopleMatchBulkApi.md#get_people_task_status) | **GET** /factset-concordance/v2/people-task-status | Get the Status of the People Tasks.



# **get_people_decisions**
> PeopleDecisionsResponse get_people_decisions(task_id)

Get the decisions of matches for the requested taskId.

Retrieves the `Decision` objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import people_match___bulk_api
from fds.sdk.FactSetConcordance.models import *
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
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = people_match___bulk_api.PeopleMatchBulkApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    task_id = 31589 # int | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    offset = 0 # int | Starting row for records to return or rows to skip. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    limit = 10 # int | Limits the number of records in the response. (optional)

    try:
        # Get the decisions of matches for the requested taskId.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_people_decisions(task_id, offset=offset, limit=limit)

        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling PeopleMatchBulkApi->get_people_decisions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **int**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. |
 **offset** | **int**| Starting row for records to return or rows to skip. | [optional] if omitted the server will use the default value of 0
 **limit** | **int**| Limits the number of records in the response. | [optional]

### Return type

[**PeopleDecisionsResponse**](PeopleDecisionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for People Decisions endpoint. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_people_task_for_list**
> PeopleTaskResponse get_people_task_for_list(universe_id, task_name, input_file, client_id_column, entity_column)

Create a People Concordance Task.

The \"Bulk\" workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process.    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the `personNameColumn`.(do not include `firstNameColumn`,`lastNameColumn` & `middleNameColumn`)     2.Filling all the required fields excluding the `personNameColumn`.(Ensure atleast the `lastNameColumn` is filled) 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import people_match___bulk_api
from fds.sdk.FactSetConcordance.models import *
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
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = people_match___bulk_api.PeopleMatchBulkApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    universe_id = 1 # int | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    task_name = "test31" # str | User defined name for the task that will be used to name the output files.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    input_file = open('/path/to/file', 'rb') # file_type | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    client_id_column = "ClientId" # str | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    entity_column = "Microsoft" # str | Header name of the column in the input file that contains the Entity Name to be matched. 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    first_name_column = "Bill" # str | First name of the person.**Do not include with `personNameColumn`**.   (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    last_name_column = "Gates" # str | Lat name of the person.**Do not include with `personNameColumn`**.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    middle_name_column = "Henry" # str | Middle name of the person.**Do not include within `personNameColumn`**.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    person_name_column = "Bill Gates" # str | Header name of the column in the input file that contains the name of the person to be matched. **Do not include with `firstNameColumn` and `lastNameColumn`.**  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    priority_column = "HIGH" # str | Priority associated to the clientId. Used for manual mapping.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    salutation_column = "Mr." # str | The salutation of the person.**Do not include with `personNameColumn`**.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    suffix_column = "HIGH" # str | A name suffix, that follows a person's full name and provides additional information about the person.**Do not include with `personNameColumn`**.  (optional)

    try:
        # Create a People Concordance Task.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_people_task_for_list(universe_id, task_name, input_file, client_id_column, entity_column, first_name_column=first_name_column, last_name_column=last_name_column, middle_name_column=middle_name_column, person_name_column=person_name_column, priority_column=priority_column, salutation_column=salutation_column, suffix_column=suffix_column)

        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling PeopleMatchBulkApi->get_people_task_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universe_id** | **int**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. |
 **task_name** | **str**| User defined name for the task that will be used to name the output files. |
 **input_file** | **file_type**| The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  |
 **client_id_column** | **str**| Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  |
 **entity_column** | **str**| Header name of the column in the input file that contains the Entity Name to be matched.  |
 **first_name_column** | **str**| First name of the person.**Do not include with &#x60;personNameColumn&#x60;**.   | [optional]
 **last_name_column** | **str**| Lat name of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional]
 **middle_name_column** | **str**| Middle name of the person.**Do not include within &#x60;personNameColumn&#x60;**.  | [optional]
 **person_name_column** | **str**| Header name of the column in the input file that contains the name of the person to be matched. **Do not include with &#x60;firstNameColumn&#x60; and &#x60;lastNameColumn&#x60;.**  | [optional]
 **priority_column** | **str**| Priority associated to the clientId. Used for manual mapping.  | [optional]
 **salutation_column** | **str**| The salutation of the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional]
 **suffix_column** | **str**| A name suffix, that follows a person&#39;s full name and provides additional information about the person.**Do not include with &#x60;personNameColumn&#x60;**.  | [optional]

### Return type

[**PeopleTaskResponse**](PeopleTaskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. The People Task creation is submitted. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_people_task_status**
> PeopleTaskStatusResponse get_people_task_status()

Get the Status of the People Tasks.

Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import people_match___bulk_api
from fds.sdk.FactSetConcordance.models import *
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
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = people_match___bulk_api.PeopleMatchBulkApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    task_id = 31589 # int | Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    offset = 0 # int | Starting row for records to return or rows to skip. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    limit = 10 # int | Limits the number of records in the response. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    status = [
        "PENDING",
    ] # [str] | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)

    try:
        # Get the Status of the People Tasks.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_people_task_status(task_id=task_id, offset=offset, limit=limit, status=status)

        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling PeopleMatchBulkApi->get_people_task_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **int**| Concordance Task Identifier. The taskId is created in response from the /people-task endpoint. | [optional]
 **offset** | **int**| Starting row for records to return or rows to skip. | [optional] if omitted the server will use the default value of 0
 **limit** | **int**| Limits the number of records in the response. | [optional]
 **status** | **[str]**| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional]

### Return type

[**PeopleTaskStatusResponse**](PeopleTaskStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for People Task Status endpoint. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

