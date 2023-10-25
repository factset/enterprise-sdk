# fds.sdk.InvestmentBankingOfficeRefresh.ModelRefreshApi

All URIs are relative to *https://api.factset.com/office-refresh/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_file_by_id**](ModelRefreshApi.md#get_file_by_id) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**get_status_by_id**](ModelRefreshApi.md#get_status_by_id) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**post_workbook**](ModelRefreshApi.md#post_workbook) | **POST** /refresh | Upload a model



# **get_file_by_id**
> file_type get_file_by_id(id)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import model_refresh_api
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
    api_instance = model_refresh_api.ModelRefreshApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | Resource ID
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    output_file_name = "outputFileName_example" # str | Optional name for returned output file as set in the Content-Disposition response header. (optional)

    try:
        # Retrieve a calculated file by resource ID.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response_wrapper = api_instance.get_file_by_id(id, output_file_name=output_file_name)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling ModelRefreshApi->get_file_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Resource ID |
 **output_file_name** | **str**| Optional name for returned output file as set in the Content-Disposition response header. | [optional]

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; body will contain calculated file |  -  |
**202** | Accepted (resource not ready yet) |  * Location - Absolute URL to check status of the request. <br>  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status_by_id**
> JobStatus get_status_by_id(id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by ID

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import model_refresh_api
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
    api_instance = model_refresh_api.ModelRefreshApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | Resource ID

    try:
        # Get the status of the refresh job with the given resource ID
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_status_by_id(id)

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling ModelRefreshApi->get_status_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Resource ID |

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
**201** | Created (the calculated workbook is ready to be retrieved) |  * Location - Absolute URL to check status of the request. <br>  |
**202** | Accepted (resource not ready yet) |  * Location - Absolute URL to check status of the request. <br>  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |
**429** | Limit Exceeded |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_workbook**
> JobStatus post_workbook(body)

Upload a model

Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.InvestmentBankingOfficeRefresh
from fds.sdk.InvestmentBankingOfficeRefresh.api import model_refresh_api
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
    api_instance = model_refresh_api.ModelRefreshApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    body = open('/path/to/file', 'rb') # file_type | 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    now_handling_enabled = True # bool | Option to handle =NOW codes. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    refresh_auto_filters = True # bool | Option to refresh codes in autofilters. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    resize_arrays = True # bool | Option to resize arrays (optional)

    try:
        # Upload a model
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_workbook(body, now_handling_enabled=now_handling_enabled, refresh_auto_filters=refresh_auto_filters, resize_arrays=resize_arrays)

        pprint(api_response)

    except fds.sdk.InvestmentBankingOfficeRefresh.ApiException as e:
        print("Exception when calling ModelRefreshApi->post_workbook: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **file_type**|  |
 **now_handling_enabled** | **bool**| Option to handle &#x3D;NOW codes. | [optional]
 **refresh_auto_filters** | **bool**| Option to refresh codes in autofilters. | [optional]
 **resize_arrays** | **bool**| Option to resize arrays | [optional]

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
**202** | Accepted |  * Location - Absolute URL to check status of the request. <br>  |
**400** | Bad Request |  -  |
**429** | Limit Exceeded |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

