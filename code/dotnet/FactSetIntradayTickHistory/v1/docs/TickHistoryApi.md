# FactSet.SDK.FactSetIntradayTickHistory.Api.TickHistoryApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTickHistory**](TickHistoryApi.md#gettickhistory) | **GET** /TickHistory/history | Tick History service returns trade data and associated quotes for a client specified interval and time period



<a name="gettickhistory"></a>
# **GetTickHistory**
> TickhistoryResponse GetTickHistory (string id, string reqId = null, string format = null, string fields = null, string sd = null, string ed = null, string st = null, string et = null, string interval = null, string includeRequest = null, string dataset = null)

Tick History service returns trade data and associated quotes for a client specified interval and time period

When using an HTTP GET request, the seach criteria is sent via the query string in the URL. Please make sure that all requests contain a date within the past trailing year. Fields are added using ampersands, with enumerations seperated by commas. <p>**Try it Out** - references a sandbox environment to simulate live reponses. Available `id` is limited to BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA. Current day data is not available.</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetIntradayTickHistory.Api;
using FactSet.SDK.FactSetIntradayTickHistory.Client;
using FactSet.SDK.FactSetIntradayTickHistory.Model;

namespace Example
{
    public class GetTickHistoryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new TickHistoryApi(config);

            var id = "id_example";  // string | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
            var reqId = "reqId_example";  // string | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. (optional) 
            var format = "XML";  // string | The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER (optional)  (default to XML)
            var fields = "fields_example";  // string | All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. (optional) 
            var sd = "sd_example";  // string | This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. (optional) 
            var ed = "ed_example";  // string | This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. (optional) 
            var st = "\"040000\"";  // string | Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional)  (default to "040000")
            var et = "\"200000\"";  // string | Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. (optional)  (default to "200000")
            var interval = "0";  // string | Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. (optional)  (default to 1M)
            var includeRequest = "true";  // string | Flag to include request id and key in the CSV output. (optional)  (default to false)
            var dataset = "";  // string | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. (optional) 

            try
            {
                // Tick History service returns trade data and associated quotes for a client specified interval and time period
                TickhistoryResponse result = apiInstance.GetTickHistory(id, reqId, format, fields, sd, ed, st, et, interval, includeRequest, dataset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TickHistoryApi.GetTickHistory: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA | 
 **reqId** | **string**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response. | [optional] 
 **format** | **string**| The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to XML]
 **fields** | **string**| All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank. | [optional] 
 **sd** | **string**| This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day. | [optional] 
 **ed** | **string**| This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day. | [optional] 
 **st** | **string**| Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. | [optional] [default to &quot;040000&quot;]
 **et** | **string**| Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day. | [optional] [default to &quot;200000&quot;]
 **interval** | **string**| Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details. | [optional] [default to 1M]
 **includeRequest** | **string**| Flag to include request id and key in the CSV output. | [optional] [default to false]
 **dataset** | **string**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional] 

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
| **200** | OK |  -  |
| **401** | Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. |  -  |
| **403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |
| **405** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


