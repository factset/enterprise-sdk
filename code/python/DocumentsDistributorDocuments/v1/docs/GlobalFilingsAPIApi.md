# fds.sdk.DocumentsDistributorDocuments.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**global_filings_v1_form_types_get**](GlobalFilingsAPIApi.md#global_filings_v1_form_types_get) | **GET** /global-filings/v1/form-types | Retrieve form types for each available Filings Source
[**global_filings_v1_list_files_get**](GlobalFilingsAPIApi.md#global_filings_v1_list_files_get) | **GET** /global-filings/v1/list-files | Retrieve filings and metadata within FactSet coverage


# **global_filings_v1_form_types_get**
> Response global_filings_v1_form_types_get(source)

Retrieve form types for each available Filings Source

Gets all available form types for the filings sources. Source parameter can be used to filter the results.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorDocuments
from fds.sdk.DocumentsDistributorDocuments.api import global_filings_api_api
from fds.sdk.DocumentsDistributorDocuments.model.status import Status
from fds.sdk.DocumentsDistributorDocuments.model.response import Response
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = global_filings_api_api.GlobalFilingsAPIApi(api_client)
    source = "EDG" # str | This parameter filters the results based on the source of the filings document.

    # example passing only required values which don't have defaults set
    try:
        # Retrieve form types for each available Filings Source
        api_response = api_instance.global_filings_v1_form_types_get(source)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling GlobalFilingsAPIApi->global_filings_v1_form_types_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **str**| This parameter filters the results based on the source of the filings document. |

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Form Types data items |  -  |
**400** | Bad request- invalid or missing parameter |  -  |
**401** | Authentication Failed |  -  |
**403** | Entitlements Not Found |  -  |
**500** | Internal Service Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **global_filings_v1_list_files_get**
> Response global_filings_v1_list_files_get(source, )

Retrieve filings and metadata within FactSet coverage

Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorDocuments
from fds.sdk.DocumentsDistributorDocuments.api import global_filings_api_api
from fds.sdk.DocumentsDistributorDocuments.model.status import Status
from fds.sdk.DocumentsDistributorDocuments.model.response import Response
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = global_filings_api_api.GlobalFilingsAPIApi(api_client)
    source = "EDG" # str | This parameter filters the results based on the source of the filings documents.
    sort = "-startDate" # str | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional) if omitted the server will use the default value of "-startDate"
    start_date = "2020-07-01" # str | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (optional)
    end_date = "2020-12-01" # str | The latest date the API should fetch for. Dates can be YYYY-MM-DD format (optional)
    ids = "AAPL" # str | This parameter filters the results based on ticker ID. (optional)
    form_type = "10-Q" # str | This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieve filings and metadata within FactSet coverage
        api_response = api_instance.global_filings_v1_list_files_get(source, )
        pprint(api_response)
    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling GlobalFilingsAPIApi->global_filings_v1_list_files_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieve filings and metadata within FactSet coverage
        api_response = api_instance.global_filings_v1_list_files_get(source, sort=sort, start_date=start_date, end_date=end_date, ids=ids, form_type=form_type)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling GlobalFilingsAPIApi->global_filings_v1_list_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **str**| This parameter filters the results based on the source of the filings documents. |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result (max. 25) | defaults to 5
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | defaults to 0
 **sort** | **str**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] if omitted the server will use the default value of "-startDate"
 **start_date** | **str**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional]
 **end_date** | **str**| The latest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional]
 **ids** | **str**| This parameter filters the results based on ticker ID. | [optional]
 **form_type** | **str**| This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Global Filings data items |  -  |
**400** | Bad request- invalid or missing parameter |  -  |
**401** | Authentication Failed |  -  |
**403** | Entitlements Not Found |  -  |
**500** | Internal Service Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

