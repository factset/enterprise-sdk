# fds.sdk.InvestmentBankingOfficeRefresh.RefreshOperationsApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_file_by_id**](RefreshOperationsApi.md#get_file_by_id) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**get_status_by_id**](RefreshOperationsApi.md#get_status_by_id) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**post_workbook**](RefreshOperationsApi.md#post_workbook) | **POST** /refresh/calculate | Upload a spreadsheet file



# **get_file_by_id**
> file_type get_file_by_id(id)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import refresh_operations_api
from fds.sdk.InvestmentBankingOfficeRefresh.models import *
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
configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentBankingOfficeRefresh.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = refresh_operations_api.RefreshOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | Unique identifier for the job (resource ID returned from FactSet).

    try:
        # Retrieve a calculated file by resource ID.
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_file_by_id(id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling RefreshOperationsApi->get_file_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for the job (resource ID returned from FactSet). |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: **file_type**
- **202**: **JobStatus**


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; body will contain calculated file |  * Content-Disposition - Standard HTTP header. Content is expected to be displayed as an attachment. <br>  * Content-Type - Standard HTTP header. The file format type. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  |
**202** | Accepted (resource not ready yet) |  * Location - Relative URL to check status of the request. <br>  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**422** | Failed to refresh file |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status_by_id**
> JobStatus get_status_by_id(id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import refresh_operations_api
from fds.sdk.InvestmentBankingOfficeRefresh.models import *
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
configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentBankingOfficeRefresh.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = refresh_operations_api.RefreshOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | Unique identifier for the job (resource ID returned from FactSet).

    try:
        # Get the status of the refresh job with the given resource ID
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_status_by_id(id)

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling RefreshOperationsApi->get_status_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Unique identifier for the job (resource ID returned from FactSet). |

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created (the calculated workbook is ready to be retrieved) |  * Location - Relative URL to check status of the request. <br>  |
**202** | Accepted (resource not ready yet) |  * Location - Relative URL to check status of the request. <br>  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**422** | Failed to refresh file |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_workbook**
> JobStatus post_workbook(body)

Upload a spreadsheet file

Upload a spreadsheet file (in the Open Office XML format) for FactSet to refresh.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import refresh_operations_api
from fds.sdk.InvestmentBankingOfficeRefresh.models import *
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
configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.InvestmentBankingOfficeRefresh.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.InvestmentBankingOfficeRefresh.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = refresh_operations_api.RefreshOperationsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    body = open('/path/to/file', 'rb') # file_type | 
    now_handling_enabled = True # bool | Return \\#VALUE for =FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. (optional)
    refresh_auto_filters = True # bool | Option to refresh =FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is false.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional)
    resize_arrays = True # bool | Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional)

    try:
        # Upload a spreadsheet file
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_workbook(body, now_handling_enabled=now_handling_enabled, refresh_auto_filters=refresh_auto_filters, resize_arrays=resize_arrays)

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling RefreshOperationsApi->post_workbook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **file_type**|  |
 **now_handling_enabled** | **bool**| Return \\#VALUE for &#x3D;FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. | [optional]
 **refresh_auto_filters** | **bool**| Option to refresh &#x3D;FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is false.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional]
 **resize_arrays** | **bool**| Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional]

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * Location - Relative URL to check status of the request. <br>  |
**400** | Bad Request |  -  |
**403** | Forbidden. The user&#39;s subscription is missing required CACCESS. |  -  |
**413** | File Too Large.  Currently only accepting files up to 50MB. |  -  |
**429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

