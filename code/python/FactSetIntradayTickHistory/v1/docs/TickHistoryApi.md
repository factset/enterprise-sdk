# fds.sdk.FactSetIntradayTickHistory.TickHistoryApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_tick_history**](TickHistoryApi.md#get_tick_history) | **GET** /TickHistory/history | Tick History service returns trade data and associated quotes for a client specified interval and time period


# **get_tick_history**
> TickhistoryResponse get_tick_history(id)

Tick History service returns trade data and associated quotes for a client specified interval and time period

When using an HTTP GET request, the seach criteria is sent via the query string in the URL. Please make sure that all requests contain a date within the past trailing year. Fields are added using ampersands, with enumerations seperated by commas. <p>**Try it Out** - references a sandbox environment to simulate live reponses. Available `id` is limited to BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA. Current day data is not available.</p>

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetIntradayTickHistory
from fds.sdk.FactSetIntradayTickHistory.api import tick_history_api
from fds.sdk.FactSetIntradayTickHistory.models import *
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
configuration = fds.sdk.FactSetIntradayTickHistory.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetIntradayTickHistory.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetIntradayTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tick_history_api.TickHistoryApi(api_client)

    id = "id_example" # str | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
    req_id = "req_id_example" # str | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. (optional)
    format = "XML" # str | The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER (optional) if omitted the server will use the default value of "XML"
    fields = "fields_example" # str | All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. (optional)
    sd = "sd_example" # str | This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. (optional)
    ed = "ed_example" # str | This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. (optional)
    st = "040000" # str | Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional) if omitted the server will use the default value of "040000"
    et = "200000" # str | Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional) if omitted the server will use the default value of "200000"
    interval = "1M" # str | Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. (optional) if omitted the server will use the default value of "1M"
    include_request = "false" # str | Flag to include request id and key in the CSV output. (optional) if omitted the server will use the default value of "false"
    dataset = "" # str | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional)

    try:
        # Tick History service returns trade data and associated quotes for a client specified interval and time period
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_tick_history(id, req_id=req_id, format=format, fields=fields, sd=sd, ed=ed, st=st, et=et, interval=interval, include_request=include_request, dataset=dataset)
        pprint(api_response)

    except fds.sdk.FactSetIntradayTickHistory.ApiException as e:
        print("Exception when calling TickHistoryApi->get_tick_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA |
 **req_id** | **str**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. | [optional]
 **format** | **str**| The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER | [optional] if omitted the server will use the default value of "XML"
 **fields** | **str**| All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. | [optional]
 **sd** | **str**| This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. | [optional]
 **ed** | **str**| This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. | [optional]
 **st** | **str**| Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. | [optional] if omitted the server will use the default value of "040000"
 **et** | **str**| Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. | [optional] if omitted the server will use the default value of "200000"
 **interval** | **str**| Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. | [optional] if omitted the server will use the default value of "1M"
 **include_request** | **str**| Flag to include request id and key in the CSV output. | [optional] if omitted the server will use the default value of "false"
 **dataset** | **str**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional]

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
**200** | OK |  -  |
**401** | Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. |  -  |
**403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |
**405** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

