# fds.sdk.Vermilion.ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_report_generation**](ReportInstanceApi.md#cancel_report_generation) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**download_report_file**](ReportInstanceApi.md#download_report_file) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file
[**get_all_report_instances**](ReportInstanceApi.md#get_all_report_instances) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**get_report_generation_logs**](ReportInstanceApi.md#get_report_generation_logs) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**get_report_instance_by_id**](ReportInstanceApi.md#get_report_instance_by_id) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**start_report_generation**](ReportInstanceApi.md#start_report_generation) | **POST** /v1/report-instances/generate | Generates a report



# **cancel_report_generation**
> cancel_report_generation(tenant, report_instance_id)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
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
    api_instance = report_instance_api.ReportInstanceApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tenant = "XXXXXXXXXX" # str | The code of the tenancy
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_instance_id = "123456789" # str | The id of the report instance

    try:
        # Cancels a report generation
        # example passing only required values which don't have defaults set
        api_instance.cancel_report_generation(tenant, report_instance_id)


    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->cancel_report_generation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_instance_id** | **str**| The id of the report instance |

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
**204** | Successful operation - no response |  -  |
**400** | The supplied report instance id was either missing or invalid |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**404** | The supplied report instance ID could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_report_file**
> file_type download_report_file(tenant, report_instance_id, report_file_name)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the generation is finished. The report instance id and the report file name are passed in as path paramters. The following mapping defines the respective Content-Type for the outputFormat defined during report generation. | outputFormat | Content-Type | | ---------------- | ------------| |WORD     | application/msword | |WORD2010 |   application/vnd.openxmlformats-officedocument.wordprocessingml.document| |EXCEL    |   application/vnd.ms-excel| |EXCEL2010|   application/vnd.openxmlformats-officedocument.spreadsheetml.sheet| |PPT      |   application/vnd.ms-powerpoint| |PPT2010  |   application/vnd.openxmlformats-officedocument.presentationml.presentation| |PDF      |   application/pdf| |CSV      |   text/csv| |XML      |   application/xml| |VXML     |   application/xml| |HTML     |   text/html| |PS       |   application/postscript|

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
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
    api_instance = report_instance_api.ReportInstanceApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tenant = "XXXXXXXXXX" # str | The code of the tenancy
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_instance_id = "123456789" # str | Used to validate that report file name belongs to the report instance passed
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_file_name = "xyz.pdf" # str | The report file name that has to be retrieved. report file name. E.g: xyz.pdf

    try:
        # Gets the generated file
        # example passing only required values which don't have defaults set
        api_response = api_instance.download_report_file(tenant, report_instance_id, report_file_name)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->download_report_file: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_instance_id** | **str**| Used to validate that report file name belongs to the report instance passed |
 **report_file_name** | **str**| The report file name that has to be retrieved. report file name. E.g: xyz.pdf |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/msword, application/postscript, text/csv, text/html, application/xml, application/zip, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view the generated file in VRS |  -  |
**406** | Unsupported Accept header. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_report_instances**
> ReportInstanceList get_all_report_instances(tenant)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
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
    api_instance = report_instance_api.ReportInstanceApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tenant = "XXXXXXXXXX" # str | The code of the tenancy
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_definition_code = "XXXXXXXXXX" # str | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    entity_codes = "SYSTEM_LANG" # str | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    entity_keys = "en-gb" # str | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    section_filter = "testFilter" # str | Acts as a filter for the retrieval process. Filters the report instances that match the section filter (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    output_format = "pdf" # str | Acts as a filter for the retrieval process. Filters the report instances that match the output format (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = ["reportInstanceId"] # [str] | The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 25 # int | Non-negative maximum number of entries to return (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional)

    try:
        # Gets a list of report instances
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_all_report_instances(tenant, report_definition_code=report_definition_code, entity_codes=entity_codes, entity_keys=entity_keys, section_filter=section_filter, output_format=output_format, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->get_all_report_instances: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_definition_code** | **str**| Acts as a filter for the retrieval process. Filters the report instances that match the report definition code | [optional]
 **entity_codes** | **str**| A series of query parameters used to filter the report instances by entity code. E.g: entityCode&#x3D;DATE&amp;entityCode&#x3D;SYSTEM_LANG | [optional]
 **entity_keys** | **str**| A series of query parameters used to filter the report instances by entity keys. E.g: entityKey&#x3D;en-gb | [optional]
 **section_filter** | **str**| Acts as a filter for the retrieval process. Filters the report instances that match the section filter | [optional]
 **output_format** | **str**| Acts as a filter for the retrieval process. Filters the report instances that match the output format | [optional]
 **sort** | **[str]**| The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional]
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional]

### Return type

[**ReportInstanceList**](ReportInstanceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_report_generation_logs**
> ReportInstanceLogList get_report_generation_logs(tenant, report_instance_id)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors & warnings'

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
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
    api_instance = report_instance_api.ReportInstanceApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tenant = "XXXXXXXXXX" # str | The code of the tenancy
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_instance_id = "123456789" # str | Used to validate that report file name belongs to the report instance passed
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    errors_only = "true" # str | If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly=true (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = ["sequenceNumber"] # [str] | The column to sort on. Can add - to sort (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 25 # int | Non-negative maximum number of entries to return (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional)

    try:
        # Gets a list of logs for the report instance generation
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_report_generation_logs(tenant, report_instance_id, errors_only=errors_only, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->get_report_generation_logs: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_instance_id** | **str**| Used to validate that report file name belongs to the report instance passed |
 **errors_only** | **str**| If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly&#x3D;true | [optional]
 **sort** | **[str]**| The column to sort on. Can add - to sort | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional]
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional]

### Return type

[**ReportInstanceLogList**](ReportInstanceLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**404** | The supplied report instance ID could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_report_instance_by_id**
> ReportInstanceData get_report_instance_by_id(report_instance_id, tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
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
    api_instance = report_instance_api.ReportInstanceApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_instance_id = "1256789" # str | The ID of the report instance
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tenant = "XXXXXXXXXX" # str | The code of the tenancy

    try:
        # Gets a report instance based on the ID
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_report_instance_by_id(report_instance_id, tenant)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->get_report_instance_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_instance_id** | **str**| The ID of the report instance |
 **tenant** | **str**| The code of the tenancy |

### Return type

[**ReportInstanceData**](ReportInstanceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**400** | The supplied report instance id was either missing or invalid, or the report instance was not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**404** | The supplied report instance ID could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_report_generation**
> ReportInstanceDataResponse start_report_generation(report_generation_request_body)

Generates a report

Generates a report using the specified ID and the JSON in the request body

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
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
    api_instance = report_instance_api.ReportInstanceApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_generation_request_body = ReportGenerationRequestBody(
        vrs={
            "key": ReportGenerationRequest(
                report="report_example",
                tenancy="tenancy_example",
                output_format="WORD",
                section_filter="section_filter_example",
                priority="priority_example",
                start_date="start_date_example",
                entity_selection={
                    "key": EntitySelection(
                        key="key_example",
                    ),
                },
            ),
        },
    ) # ReportGenerationRequestBody | 

    try:
        # Generates a report
        # example passing only required values which don't have defaults set
        api_response = api_instance.start_report_generation(report_generation_request_body)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->start_report_generation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_generation_request_body** | [**ReportGenerationRequestBody**](ReportGenerationRequestBody.md)|  |

### Return type

[**ReportInstanceDataResponse**](ReportInstanceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Report generation request succeeded and report generation is in progress |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**401** | Unauthorised |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | No permissions to view reports in VRS |  -  |
**404** | The report code could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

