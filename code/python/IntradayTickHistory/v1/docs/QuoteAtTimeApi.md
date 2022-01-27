# fds.sdk.IntradayTickHistory.QuoteAtTimeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tick_history_qat_get**](QuoteAtTimeApi.md#tick_history_qat_get) | **GET** /TickHistory/qat | Request returns a quote at the specified time


# **tick_history_qat_get**
> TickhistoryResponse tick_history_qat_get(id)

Request returns a quote at the specified time

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IntradayTickHistory
from fds.sdk.IntradayTickHistory.api import quote_at_time_api
from fds.sdk.IntradayTickHistory.model.tickhistory_response import TickhistoryResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api-sandbox.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.IntradayTickHistory.Configuration(
    host = "https://api-sandbox.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.IntradayTickHistory.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.IntradayTickHistory.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IntradayTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = quote_at_time_api.QuoteAtTimeApi(api_client)
    id = "id_example" # str | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
    date = "date_example" # str | Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)
    time = "time_example" # str | Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)
    format = "XML" # str | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional) if omitted the server will use the default value of "XML"

    # example passing only required values which don't have defaults set
    try:
        # Request returns a quote at the specified time
        api_response = api_instance.tick_history_qat_get(id)
        pprint(api_response)
    except fds.sdk.IntradayTickHistory.ApiException as e:
        print("Exception when calling QuoteAtTimeApi->tick_history_qat_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Request returns a quote at the specified time
        api_response = api_instance.tick_history_qat_get(id, date=date, time=time, format=format)
        pprint(api_response)
    except fds.sdk.IntradayTickHistory.ApiException as e:
        print("Exception when calling QuoteAtTimeApi->tick_history_qat_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA |
 **date** | **str**| Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days | [optional]
 **time** | **str**| Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds | [optional]
 **format** | **str**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] if omitted the server will use the default value of "XML"

### Return type

[**TickhistoryResponse**](TickhistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK  x |  -  |
**401** | Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. |  -  |
**403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |
**405** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

