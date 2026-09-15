# FirstTradeApi

All URIs are relative to *https://api.factset.com/TickHistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**firsttradeGet**](FirstTradeApi.md#firsttradeGet) | **GET** /firsttrade | First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time



## firsttradeGet

> TickHistoryResponse firsttradeGet(id, reqId, startDate, startTime, format, includeRequest, dataset)

First Trade service returns the first trade (official and unofficial) and associated quotes after a specified time

The First Trade service returns data for the first trade (official and unofficial) and associated quotes after the specified time.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetIntradayTickHistory.ApiClient;
import com.factset.sdk.FactSetIntradayTickHistory.ApiException;
import com.factset.sdk.FactSetIntradayTickHistory.Configuration;
import com.factset.sdk.FactSetIntradayTickHistory.auth.*;
import com.factset.sdk.FactSetIntradayTickHistory.models.*;
import com.factset.sdk.FactSetIntradayTickHistory.api.FirstTradeApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        FirstTradeApi apiInstance = new FirstTradeApi(defaultClient);
        String id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  <p>**Note**: Only one identifier can be requested per API call. </p> <p>The sandbox environment provides access to the following list of symbols: </p> <p>BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1</p>
        String reqId = "reqId_example"; // String | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response.
        String startDate = "startDate_example"; // String | This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day.
        String startTime = "040000"; // String | This is the start time for the snapshot history requested. Requests should be made in a **HHMMSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day
        String format = "XML"; // String | The format of the output file. 
        String includeRequest = "true"; // String | Flag to include request id and key in the CSV output.
        String dataset = "charting"; // String | Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades.
        try {
            TickHistoryResponse result = apiInstance.firsttradeGet(id, reqId, startDate, startTime, format, includeRequest, dataset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FirstTradeApi#firsttradeGet");
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
 **id** | **String**| Requested symbol or security. The symbol can be a FactSet ticker-exchange or ticker-region symbol, CUSIP, ISIN or SEDOL.  &lt;p&gt;**Note**: Only one identifier can be requested per API call. &lt;/p&gt; &lt;p&gt;The sandbox environment provides access to the following list of symbols: &lt;/p&gt; &lt;p&gt;BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1&lt;/p&gt; |
 **reqId** | **String**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the response. | [optional]
 **startDate** | **String**| This is the start date for the Snapshot History. Requests should be made in the format YYYYMMDD Default is current business day. Field can be sd or date. TRY IT OUT Cannot use current day. | [optional]
 **startTime** | **String**| This is the start time for the snapshot history requested. Requests should be made in a **HHMMSS** format.Range from 000000 - 235959. **TRY IT OUT** Cannot use current day | [optional] [default to 040000]
 **format** | **String**| The format of the output file.  | [optional] [default to XML] [enum: XML, JSON, CSV, CSV_NO_HEADER]
 **includeRequest** | **String**| Flag to include request id and key in the CSV output. | [optional] [default to false] [enum: true, T, false, F]
 **dataset** | **String**| Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades. | [optional] [enum: charting]

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **405** | Method Not Allowed |  -  |
| **408** | Request Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

