# FirstTradeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tickHistoryFirsttradeGet**](FirstTradeApi.md#tickHistoryFirsttradeGet) | **GET** /TickHistory/firsttrade | Request returns data for the first trade (official and unofficial) after the specified time



## tickHistoryFirsttradeGet

> TickhistoryResponse tickHistoryFirsttradeGet(id, reqId, startDate, startTime, format, includeRequest, dataset)

Request returns data for the first trade (official and unofficial) after the specified time

### Example

```java
// Import classes:
import com.factset.sdk.IntradayTickHistory.ApiClient;
import com.factset.sdk.IntradayTickHistory.ApiException;
import com.factset.sdk.IntradayTickHistory.Configuration;
import com.factset.sdk.IntradayTickHistory.auth.*;
import com.factset.sdk.IntradayTickHistory.model.*;
import com.factset.sdk.IntradayTickHistory.api.FirstTradeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        FirstTradeApi apiInstance = new FirstTradeApi(defaultClient);
        String id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
        String reqId = "reqId_example"; // String | Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response.
        String startDate = "startDate_example"; // String | This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day.
        String startTime = "040000"; // String | This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day
        String format = "XML"; // String | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER
        String includeRequest = "true"; // String | Flag to include request id and key in the CSV output.
        String dataset = ""; // String | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades.
        try {
            TickhistoryResponse result = apiInstance.tickHistoryFirsttradeGet(id, reqId, startDate, startTime, format, includeRequest, dataset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FirstTradeApi#tickHistoryFirsttradeGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA |
 **reqId** | **String**| Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response. | [optional]
 **startDate** | **String**| This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. | [optional]
 **startTime** | **String**| This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day | [optional] [default to 040000]
 **format** | **String**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to XML] [enum: XML, JSON, CSV, CSV_NO_HEADER]
 **includeRequest** | **String**| Flag to include request id and key in the CSV output. | [optional] [default to false] [enum: true, T, false, F]
 **dataset** | **String**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional] [enum: , charting]

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

