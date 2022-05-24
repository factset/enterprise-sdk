# fds.sdk.Vermilion.ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_report_instances_generate_post**](ReportInstanceApi.md#v1_report_instances_generate_post) | **POST** /v1/report-instances/generate | Generates a report
[**v1_tenant_report_instances_get**](ReportInstanceApi.md#v1_tenant_report_instances_get) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**v1_tenant_report_instances_report_instance_id_delete**](ReportInstanceApi.md#v1_tenant_report_instances_report_instance_id_delete) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**v1_tenant_report_instances_report_instance_id_get**](ReportInstanceApi.md#v1_tenant_report_instances_report_instance_id_get) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**v1_tenant_report_instances_report_instance_id_logs_get**](ReportInstanceApi.md#v1_tenant_report_instances_report_instance_id_logs_get) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**v1_tenant_report_instances_report_instance_id_results_report_file_name_get**](ReportInstanceApi.md#v1_tenant_report_instances_report_instance_id_results_report_file_name_get) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file


# **v1_report_instances_generate_post**
> ReportInstanceDataResponse v1_report_instances_generate_post(inline_object)

Generates a report

Generates a report using the specified ID and the JSON in the request body

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
from fds.sdk.Vermilion.model.inline_response4002 import InlineResponse4002
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response4042 import InlineResponse4042
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.inline_object import InlineObject
from fds.sdk.Vermilion.model.report_instance_data_response import ReportInstanceDataResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    inline_object = InlineObject(
        vrs=V1ReportInstancesGenerateVrs(
            instance_id=V1ReportInstancesGenerateVrsInstanceId(
                tenancy="tenancy_example",
                report_code="report_code_example",
                output_format="output_format_example",
                entity=V1ReportInstancesGenerateVrsInstanceIdEntity(
                    key="key_example",
                ),
            ),
        ),
    ) # InlineObject | 

    # example passing only required values which don't have defaults set
    try:
        # Generates a report
        api_response = api_instance.v1_report_instances_generate_post(inline_object)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_report_instances_generate_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object** | [**InlineObject**](InlineObject.md)|  |

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

# **v1_tenant_report_instances_get**
> ReportInstanceList v1_tenant_report_instances_get(tenant)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.report_instance_list import ReportInstanceList
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    tenant = "tenant_example" # str | The code of the tenancy
    report_definition_code = "reportDefinitionCode_example" # str | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code (optional)
    entity_codes = "entityCodes_example" # str | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG (optional)
    entity_keys = "entityKeys_example" # str | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb (optional)
    section_filter = "sectionFilter_example" # str | Acts as a filter for the retrieval process. Filters the report instances that match the section filter (optional)
    output_format = "outputFormat_example" # str | Acts as a filter for the retrieval process. Filters the report instances that match the output format (optional)
    pagination_limit = 25 # int | Non-negative maximum number of entries to return (optional)
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional)

    # example passing only required values which don't have defaults set
    try:
        # Gets a list of report instances
        api_response = api_instance.v1_tenant_report_instances_get(tenant)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets a list of report instances
        api_response = api_instance.v1_tenant_report_instances_get(tenant, report_definition_code=report_definition_code, entity_codes=entity_codes, entity_keys=entity_keys, section_filter=section_filter, output_format=output_format, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_get: %s\n" % e)
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

# **v1_tenant_report_instances_report_instance_id_delete**
> v1_tenant_report_instances_report_instance_id_delete(tenant, report_instance_id)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
from fds.sdk.Vermilion.model.inline_response4011 import InlineResponse4011
from fds.sdk.Vermilion.model.inline_response4003 import InlineResponse4003
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response4042 import InlineResponse4042
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    tenant = "tenant_example" # str | The code of the tenancy
    report_instance_id = "reportInstanceId_example" # str | The id of the report instance

    # example passing only required values which don't have defaults set
    try:
        # Cancels a report generation
        api_instance.v1_tenant_report_instances_report_instance_id_delete(tenant, report_instance_id)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_report_instance_id_delete: %s\n" % e)
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

# **v1_tenant_report_instances_report_instance_id_get**
> v1_tenant_report_instances_report_instance_id_get(report_instance_id, tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
from fds.sdk.Vermilion.model.inline_response4003 import InlineResponse4003
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.report_instance_data import ReportInstanceData
from fds.sdk.Vermilion.model.inline_response4042 import InlineResponse4042
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    report_instance_id = "reportInstanceId_example" # str | The ID of the report instance
    tenant = "tenant_example" # str | The code of the tenancy

    # example passing only required values which don't have defaults set
    try:
        # Gets a report instance based on the ID
        api_instance.v1_tenant_report_instances_report_instance_id_get(report_instance_id, tenant)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_report_instance_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_instance_id** | **str**| The ID of the report instance |
 **tenant** | **str**| The code of the tenancy |

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
**200** | Report generation has completed and the report is ready to download |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**202** | Expected response returned if the report generation is not yet completed. |  -  |
**400** | The supplied report instance id was either missing or invalid, or the report instance was not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**404** | The supplied report instance ID could not be found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_tenant_report_instances_report_instance_id_logs_get**
> ReportInstanceLogList v1_tenant_report_instances_report_instance_id_logs_get(tenant, report_instance_id)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors & warnings'

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.report_instance_log_list import ReportInstanceLogList
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response4043 import InlineResponse4043
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    tenant = "tenant_example" # str | The code of the tenancy
    report_instance_id = "reportInstanceId_example" # str | Used to validate that report file name belongs to the report instance passed
    full_log = "fullLog_example" # str | Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog=true (optional)
    sort = "_sort=sequenceNumber" # str | The column to sort on. Can add - to sort (optional)
    pagination_limit = 25 # int | Non-negative maximum number of entries to return (optional)
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional)

    # example passing only required values which don't have defaults set
    try:
        # Gets a list of logs for the report instance generation
        api_response = api_instance.v1_tenant_report_instances_report_instance_id_logs_get(tenant, report_instance_id)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_report_instance_id_logs_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets a list of logs for the report instance generation
        api_response = api_instance.v1_tenant_report_instances_report_instance_id_logs_get(tenant, report_instance_id, full_log=full_log, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_report_instance_id_logs_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_instance_id** | **str**| Used to validate that report file name belongs to the report instance passed |
 **full_log** | **str**| Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog&#x3D;true | [optional]
 **sort** | **str**| The column to sort on. Can add - to sort | [optional]
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

# **v1_tenant_report_instances_report_instance_id_results_report_file_name_get**
> v1_tenant_report_instances_report_instance_id_results_report_file_name_get(tenant, report_instance_id, report_file_name)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the genration is finished. The report instance id and the report file name are passed in as path paramters

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_instance_api
from fds.sdk.Vermilion.model.inline_response4003 import InlineResponse4003
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    tenant = "tenant_example" # str | The code of the tenancy
    report_instance_id = "reportInstanceId_example" # str | Used to validate that report file name belongs to the report instance passed
    report_file_name = "reportFileName_example" # str | The report file name that has to be retrieved. report file name. E.g: xyz.pdf

    # example passing only required values which don't have defaults set
    try:
        # Gets the generated file
        api_instance.v1_tenant_report_instances_report_instance_id_results_report_file_name_get(tenant, report_instance_id, report_file_name)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportInstanceApi->v1_tenant_report_instances_report_instance_id_results_report_file_name_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_instance_id** | **str**| Used to validate that report file name belongs to the report instance passed |
 **report_file_name** | **str**| The report file name that has to be retrieved. report file name. E.g: xyz.pdf |

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
**200** | Successful operation |  -  |
**400** | The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view the generated file in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

