# fds.sdk.FactSetTickHistory.RequestFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_request_files_get**](RequestFilesApi.md#v1_request_files_get) | **GET** /v1/request-files | Returns the requestId and status



# **v1_request_files_get**
> RequestFilesResponse v1_request_files_get(start_date, end_date)

Returns the requestId and status

Try it Out - references a Sandbox environment to simulate live reponses.</p> **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.</p> PROD has data from 20120101 to current date &</p> **available IDs is limited to..**</p> US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA</p> ASX - CBA-ASX, BHP-ASX, APA-ASX</p> LSE - HSBA-LON, VOD-LON</p> Tokyo - 7203-TKS, 4307-TKS</p> Swiss - NESN-SWX, COTN-SWX</p> Singapore - J36-SES &</p> Hong Kong - 700-HKG</p>

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import request_files_api
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
    api_instance = request_files_api.RequestFilesApi(api_client)

    start_date = dateutil_parser('2021-01-01').date() # date | The date for (or from which) the data is required.</p> **In Sandbox, data available from 1st to 31st Jan'21 only**.
    end_date = dateutil_parser('2021-01-31').date() # date | The date to which data is required.</p> **In Sandbox, data available from 1st to 31st Jan'21 only**.
    ticker = "CBA,BHP,APA" # str | The requested list of security identifiers. <p>**Either ticker(s) + iso_code  (OR) product is allowed**</p> **NOTE**:Only one identifier can be requested per request (optional)
    iso_code = "AUS" # str | The requested ISO code. <p>ticker(s) + iso_code</p> <p>**Does not support multiple iso_codes**</p> (optional)
    fields = "*" # str | Fields for which data is requested. Refer <a href= \"https://developer.factset.com/api-catalog/factset-tick-history-api#apiDocumentation\">Output fields list</a>. for available fields.</p> **In trial default=all fields** (optional) if omitted the server will use the default value of "*"
    start_time = "10:20:30" # str | The start time of the data being requested. The time should be in HH:MM:SS format. (optional)
    end_time = "11:20:30" # str | The end time of the data being requested. The time should be in HH:MM:SS format. (optional)
    single = "false" # str | Returns data in a single file when single=true. This parameter only works for smaller date/time requests where the file size is upto 128MB. (optional) if omitted the server will use the default value of "false"
    regional_iso_code = "ASX" # str | Works in conjunction with iso_code parameter.<p>ticker(s) + iso_code + regionalISOCode</p> <p>**Does not support multiple regionalISOCodes**</p> (optional)

    try:
        # Returns the requestId and status
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.v1_request_files_get(start_date, end_date, ticker=ticker, iso_code=iso_code, fields=fields, start_time=start_time, end_time=end_time, single=single, regional_iso_code=regional_iso_code)
        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling RequestFilesApi->v1_request_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| The date for (or from which) the data is required.&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only**. |
 **end_date** | **date**| The date to which data is required.&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only**. |
 **ticker** | **str**| The requested list of security identifiers. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request | [optional]
 **iso_code** | **str**| The requested ISO code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; | [optional]
 **fields** | **str**| Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/factset-tick-history-api#apiDocumentation\&quot;&gt;Output fields list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** | [optional] if omitted the server will use the default value of "*"
 **start_time** | **str**| The start time of the data being requested. The time should be in HH:MM:SS format. | [optional]
 **end_time** | **str**| The end time of the data being requested. The time should be in HH:MM:SS format. | [optional]
 **single** | **str**| Returns data in a single file when single&#x3D;true. This parameter only works for smaller date/time requests where the file size is upto 128MB. | [optional] if omitted the server will use the default value of "false"
 **regional_iso_code** | **str**| Works in conjunction with iso_code parameter.&lt;p&gt;ticker(s) + iso_code + regionalISOCode&lt;/p&gt; &lt;p&gt;**Does not support multiple regionalISOCodes**&lt;/p&gt; | [optional]

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

