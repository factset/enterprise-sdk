# FactSet.SDK.FactSetIntradayTickHistory.Api.LastTradeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TickHistoryLasttradeGet**](LastTradeApi.md#tickhistorylasttradeget) | **GET** /TickHistory/lasttrade | Request returns data for the last trade and associated quotes before the specified time



<a name="tickhistorylasttradeget"></a>
# **TickHistoryLasttradeGet**
> TickhistoryResponse TickHistoryLasttradeGet (string id, string format = null, string date = null, string time = null)

Request returns data for the last trade and associated quotes before the specified time

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetIntradayTickHistory.Api;
using FactSet.SDK.FactSetIntradayTickHistory.Client;
using FactSet.SDK.FactSetIntradayTickHistory.Model;

namespace Example
{
    public class TickHistoryLasttradeGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new LastTradeApi(config);

            var id = "id_example";  // string | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
            var format = "XML";  // string | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional)  (default to XML)
            var date = "date_example";  // string | Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional) 
            var time = "time_example";  // string | Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SSS- Seconds (optional) 

            try
            {
                // Request returns data for the last trade and associated quotes before the specified time
                TickhistoryResponse result = apiInstance.TickHistoryLasttradeGet(id, format, date, time);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling LastTradeApi.TickHistoryLasttradeGet: " + e.Message );
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
 **format** | **string**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to XML]
 **date** | **string**| Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days | [optional] 
 **time** | **string**| Request should be made in the format **HHMMSS**.HH- Hour, MM- Minutes, SSS- Seconds | [optional] 

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
| **200** | OK  x |  -  |
| **401** | Access Denied. The user is not authorized to view the data requested. Contact FactSet Consulting Services for assistance. |  -  |
| **403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |
| **405** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request lenght (currently set at 5000 bytes. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


