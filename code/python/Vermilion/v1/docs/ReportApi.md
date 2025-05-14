# fds.sdk.Vermilion.ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_report_definitions**](ReportApi.md#get_all_report_definitions) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**get_report_definition_by_code**](ReportApi.md#get_report_definition_by_code) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition



# **get_all_report_definitions**
> ReportDefinitionList get_all_report_definitions(tenant)

Gets all report definitions

Gets all report definitions the user has permissions for

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_api
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
    api_instance = report_api.ReportApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    sort = ["name"] # [str] | The column to sort on. Can add - to sort (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip (optional) if omitted the server will use the default value of 0

    try:
        # Gets all report definitions
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_all_report_definitions(tenant, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportApi->get_all_report_definitions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **sort** | **[str]**| The column to sort on. Can add - to sort | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip | [optional] if omitted the server will use the default value of 0

### Return type

[**ReportDefinitionList**](ReportDefinitionList.md)

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
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_report_definition_by_code**
> ReportDefinitionData get_report_definition_by_code(tenant, report_definition_code)

Gets a report definition

Gets a report defintion based on the code specified

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import report_api
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
    api_instance = report_api.ReportApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    report_definition_code = "RPCODE" # str | The code of the report definition

    try:
        # Gets a report definition
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_report_definition_by_code(tenant, report_definition_code)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling ReportApi->get_report_definition_by_code: %s\n" % e)
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
**500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

