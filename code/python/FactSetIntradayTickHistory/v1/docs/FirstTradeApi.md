# fds.sdk.FactSetIntradayTickHistory.FirstTradeApi

All URIs are relative to *https://api.factset.com/TickHistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**firsttrade_get**](FirstTradeApi.md#firsttrade_get) | **GET** /firsttrade | First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time



# **firsttrade_get**
> TickHistoryResponse firsttrade_get(id)

First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time

The First Trade service returns data for the first trade (official and unofficial) and associated quotes after the specified time.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetIntradayTickHistory
from fds.sdk.FactSetIntradayTickHistory.api import first_trade_api
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
    api_instance = first_trade_api.FirstTradeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  <p>**Note**: Only one identifier can be requested per API call. </p> <p>The sandbox environment provides access to the following list of symbols: </p> <p>BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1</p>
    req_id = "req_id_example" # str | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. (optional)
    start_date = "start_date_example" # str | This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. (optional)
    start_time = "040000" # str | This is the start time for the snapshot history requested. Requests should be made in a **HHMMSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day (optional) if omitted the server will use the default value of "040000"
    format = "XML" # str | The format of the output file.  (optional) if omitted the server will use the default value of "XML"
    include_request = "false" # str | Flag to include request id and key in the CSV output. (optional) if omitted the server will use the default value of "false"
    dataset = "charting" # str | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional) if omitted the server will use the default value of "charting"

    try:
        # First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.firsttrade_get(id, req_id=req_id, start_date=start_date, start_time=start_time, format=format, include_request=include_request, dataset=dataset)

        pprint(api_response)

    except fds.sdk.FactSetIntradayTickHistory.ApiException as e:
        print("Exception when calling FirstTradeApi->firsttrade_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; |
 **req_id** | **str**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. | [optional]
 **start_date** | **str**| This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. | [optional]
 **start_time** | **str**| This is the start time for the snapshot history requested. Requests should be made in a **HHMMSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day | [optional] if omitted the server will use the default value of "040000"
 **format** | **str**| The format of the output file.  | [optional] if omitted the server will use the default value of "XML"
 **include_request** | **str**| Flag to include request id and key in the CSV output. | [optional] if omitted the server will use the default value of "false"
 **dataset** | **str**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional] if omitted the server will use the default value of "charting"

### Return type

[**TickHistoryResponse**](TickHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**405** | Method Not Allowed |  -  |
**408** | Request Timeout |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

