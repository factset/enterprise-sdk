# fds.sdk.FactSetTickHistory.GetFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_get_files_get**](GetFilesApi.md#v1_get_files_get) | **GET** /v1/get-files | Returns the files from tickhistory endpoint for the specified date range



# **v1_get_files_get**
> GetFilesResponse v1_get_files_get(request_id)

Returns the files from tickhistory endpoint for the specified date range

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import get_files_api
from fds.sdk.FactSetTickHistory.models import *
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
configuration = fds.sdk.FactSetTickHistory.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTickHistory.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = get_files_api.GetFilesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    request_id = "requestId_example" # str | RequestId returned by request-files endpoint to poll and collect results of the query
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per response page (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) if omitted the server will use the default value of 0

    try:
        # Returns the files from tickhistory endpoint for the specified date range
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.v1_get_files_get(request_id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling GetFilesApi->v1_get_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **str**| RequestId returned by request-files endpoint to poll and collect results of the query |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per response page | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] if omitted the server will use the default value of 0

### Return type

[**GetFilesResponse**](GetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

