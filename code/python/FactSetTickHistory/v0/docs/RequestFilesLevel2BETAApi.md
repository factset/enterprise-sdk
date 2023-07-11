# fds.sdk.FactSetTickHistory.RequestFilesLevel2BETAApi

All URIs are relative to *https://api.factset.com/bulk-documents/tick-history/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getrequest_id_level2**](RequestFilesLevel2BETAApi.md#getrequest_id_level2) | **GET** /level2/request-files | Returns the requestId and status



# **getrequest_id_level2**
> Level2RequestFilesResponse getrequest_id_level2(ticker, start_date, end_date, mic)

Returns the requestId and status

Returns the requestId and status.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import request_files_level_2__beta_api
from fds.sdk.FactSetTickHistory.models import *
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
    api_instance = request_files_level_2__beta_api.RequestFilesLevel2BETAApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ticker = ["GOOGL"] # [str] | The requested list of one or more Market tickers.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    start_date = dateutil_parser('2023-01-01').date() # date | The date to which data is required.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    end_date = dateutil_parser('2023-01-30').date() # date | The date to which data is required.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    mic = "XNYS" # str | This parameter is used to filter the results based on the exchange code. <p>**NOTE**:Does not support multiple mic codes</p>
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    response_file_type = "parquet" # str | Specifies the fileType (optional) if omitted the server will use the default value of "parquet"

    try:
        # Returns the requestId and status
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.getrequest_id_level2(ticker, start_date, end_date, mic, response_file_type=response_file_type)

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling RequestFilesLevel2BETAApi->getrequest_id_level2: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | **[str]**| The requested list of one or more Market tickers. |
 **start_date** | **date**| The date to which data is required. |
 **end_date** | **date**| The date to which data is required. |
 **mic** | **str**| This parameter is used to filter the results based on the exchange code. &lt;p&gt;**NOTE**:Does not support multiple mic codes&lt;/p&gt; |
 **response_file_type** | **str**| Specifies the fileType | [optional] if omitted the server will use the default value of "parquet"

### Return type

[**Level2RequestFilesResponse**](Level2RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successs |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**429** | Too many requests. |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

