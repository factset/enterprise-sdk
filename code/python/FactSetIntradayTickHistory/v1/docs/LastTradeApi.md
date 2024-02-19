# fds.sdk.FactSetIntradayTickHistory.LastTradeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tick_history_lasttrade_get**](LastTradeApi.md#tick_history_lasttrade_get) | **GET** /TickHistory/lasttrade | Request returns data for the last trade and associated quotes before the specified time



# **tick_history_lasttrade_get**
> TickhistoryResponse tick_history_lasttrade_get(id)

Request returns data for the last trade and associated quotes before the specified time

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetIntradayTickHistory
from fds.sdk.FactSetIntradayTickHistory.api import last_trade_api
from fds.sdk.FactSetIntradayTickHistory.models import *
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
    api_instance = last_trade_api.LastTradeApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    format = "XML" # str | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional) if omitted the server will use the default value of "XML"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    date = "date_example" # str | Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    time = "time_example" # str | Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SSS- Seconds (optional)

    try:
        # Request returns data for the last trade and associated quotes before the specified time
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.tick_history_lasttrade_get(id, format=format, date=date, time=time)

        pprint(api_response)

    except fds.sdk.FactSetIntradayTickHistory.ApiException as e:
        print("Exception when calling LastTradeApi->tick_history_lasttrade_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA |
 **format** | **str**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] if omitted the server will use the default value of "XML"
 **date** | **str**| Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days | [optional]
 **time** | **str**| Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SSS- Seconds | [optional]

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

