# fds.sdk.DocumentsDistributorDocuments.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**global_filings_v1_list_files_get**](GlobalFilingsAPIApi.md#global_filings_v1_list_files_get) | **GET** /global-filings/v1/list-files | Retrieve filings within FactSet coverage


# **global_filings_v1_list_files_get**
> FilingsResponse global_filings_v1_list_files_get(start_date, end_date)

Retrieve filings within FactSet coverage

Parameters can be used to get the filings

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorDocuments
from fds.sdk.DocumentsDistributorDocuments.api import global_filings_api_api
from fds.sdk.DocumentsDistributorDocuments.models import *
from dateutil.parser import parse as dateutil_parser
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
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = global_filings_api_api.GlobalFilingsAPIApi(api_client)

    start_date = dateutil_parser('1970-01-01').date() # date | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format
    end_date = dateutil_parser('1970-01-01').date() # date | The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format

    try:
        # Retrieve filings within FactSet coverage
        # example passing only required values which don't have defaults set
        api_response = api_instance.global_filings_v1_list_files_get(start_date, end_date)
        pprint(api_response)

    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling GlobalFilingsAPIApi->global_filings_v1_list_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format |
 **end_date** | **date**| The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format |
 **dataset** | **str**| This parameter filters the results based on the dataset of the filings documents. | defaults to "edgar"

### Return type

[**FilingsResponse**](FilingsResponse.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

