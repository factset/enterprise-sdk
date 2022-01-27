# fds.sdk.FactSetTickHistory.RequestFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_request_files_get**](RequestFilesApi.md#v1_request_files_get) | **GET** /v1/request-files | Returns the requestId and status


# **v1_request_files_get**
> RequestFilesResponse v1_request_files_get(start_date, end_date)

Returns the requestId and status

Try it Out - references a Sandbox environment to simulate live reponses.</p> **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.</p> PROD has data from 20120101 to current date &</p> **available IDs is limited to..**</p> US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA</p> ASX - CBA-ASX, BHP-ASX</p> LSE - HSBA-LON, VOD-LON</p> Tokyo - 7203-TKS, 4307-TKS</p> Shenzhen OR Shanghai - 300782-SHE, 300792-SHE</p> Swiss - NESN-SWX, COTN-SWX</p> Singapore - J36-SES &</p> Hong Kong - 700-HKG</p>

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import request_files_api
from fds.sdk.FactSetTickHistory.model.request_files_response import RequestFilesResponse
from fds.sdk.FactSetTickHistory.model.request_filestatus import RequestFilestatus
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com/bulk-documents/tickhistory
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetTickHistory.Configuration(
    host = "https://api-sandbox.factset.com/bulk-documents/tickhistory"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetTickHistory.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetTickHistory.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = request_files_api.RequestFilesApi(api_client)
    start_date = dateutil_parser('2021-01-01').date() # date | The date for (or from which) the data is required</p> **In Sandbox, data available from 1st to 31st Jan'21 only**
    end_date = dateutil_parser('2021-01-31').date() # date | The date to which data is required</p> **In Sandbox, data available from 1st to 31st Jan'21 only**
    ticker = "IBM,F,AAPL,GOOG" # str | any ticker. <p>**Either ticker(s) + iso_code  (OR) product is allowed**</p> **NOTE**:Only one identifier can be requested per request (optional)
    iso_code = "USA" # str | iso_code. <p>ticker(s) + iso_code</p> <p>**Does not support multiple iso_codes**</p> (optional)
    fields = "*" # str | Fields for which data is requested. Refer <a href= \"https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\">Output fileds list</a>. for available fields.</p> **In trial default=all fields** (optional) if omitted the server will use the default value of "*"

    # example passing only required values which don't have defaults set
    try:
        # Returns the requestId and status
        api_response = api_instance.v1_request_files_get(start_date, end_date)
        pprint(api_response)
    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling RequestFilesApi->v1_request_files_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Returns the requestId and status
        api_response = api_instance.v1_request_files_get(start_date, end_date, ticker=ticker, iso_code=iso_code, fields=fields)
        pprint(api_response)
    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling RequestFilesApi->v1_request_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| The date for (or from which) the data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** |
 **end_date** | **date**| The date to which data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** |
 **ticker** | **str**| any ticker. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request | [optional]
 **iso_code** | **str**| iso_code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; | [optional]
 **fields** | **str**| Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\&quot;&gt;Output fileds list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** | [optional] if omitted the server will use the default value of "*"

### Return type

[**RequestFilesResponse**](RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successs |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

