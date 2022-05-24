# fds.sdk.Vermilion.ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_tenant_reports_get**](ReportApi.md#v1_tenant_reports_get) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**v1_tenant_reports_report_definition_code_get**](ReportApi.md#v1_tenant_reports_report_definition_code_get) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition


# **v1_tenant_reports_get**
> [ReportDefinitionList] v1_tenant_reports_get(tenant)

Gets all report definitions

Gets all report definitions the user has permissions for

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_api
from fds.sdk.Vermilion.model.inline_response4002 import InlineResponse4002
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.report_definition_list import ReportDefinitionList
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
    api_instance = report_api.ReportApi(api_client)
    tenant = "tenant_example" # str | The code of the tenancy
    sort = "_sort=name" # str | The column to sort on. Can add - to sort (optional)
    pagination_limit = 25 # int | Non-negative maximum number of entries to return (optional)
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional)

    # example passing only required values which don't have defaults set
    try:
        # Gets all report definitions
        api_response = api_instance.v1_tenant_reports_get(tenant)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportApi->v1_tenant_reports_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets all report definitions
        api_response = api_instance.v1_tenant_reports_get(tenant, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportApi->v1_tenant_reports_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **sort** | **str**| The column to sort on. Can add - to sort | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional]
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional]

### Return type

[**[ReportDefinitionList]**](ReportDefinitionList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_tenant_reports_report_definition_code_get**
> ReportDefinitionData v1_tenant_reports_report_definition_code_get(tenant, report_definition_code)

Gets a report definition

Gets a report defintion based on the code specified

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_api
from fds.sdk.Vermilion.model.inline_response4002 import InlineResponse4002
from fds.sdk.Vermilion.model.report_definition_data import ReportDefinitionData
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
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
    api_instance = report_api.ReportApi(api_client)
    tenant = "tenant_example" # str | The code of the tenancy
    report_definition_code = "reportDefinitionCode_example" # str | The code of the report definition

    # example passing only required values which don't have defaults set
    try:
        # Gets a report definition
        api_response = api_instance.v1_tenant_reports_report_definition_code_get(tenant, report_definition_code)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportApi->v1_tenant_reports_report_definition_code_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **report_definition_code** | **str**| The code of the report definition |

### Return type

[**ReportDefinitionData**](ReportDefinitionData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view reports in VRS |  -  |
**404** | The supplied report definition code was was not found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

