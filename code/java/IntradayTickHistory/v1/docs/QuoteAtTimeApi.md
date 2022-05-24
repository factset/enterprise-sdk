# QuoteAtTimeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tickHistoryQatGet**](QuoteAtTimeApi.md#tickHistoryQatGet) | **GET** /TickHistory/qat | Request returns a quote at the specified time



## tickHistoryQatGet

> TickhistoryResponse tickHistoryQatGet(id, date, time, format)

Request returns a quote at the specified time

### Example

```java
// Import classes:
import com.factset.sdk.IntradayTickHistory.ApiClient;
import com.factset.sdk.IntradayTickHistory.ApiException;
import com.factset.sdk.IntradayTickHistory.Configuration;
import com.factset.sdk.IntradayTickHistory.auth.*;
import com.factset.sdk.IntradayTickHistory.models.*;
import com.factset.sdk.IntradayTickHistory.api.QuoteAtTimeApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        QuoteAtTimeApi apiInstance = new QuoteAtTimeApi(defaultClient);
        String id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
        String date = "date_example"; // String | Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days
        String time = "time_example"; // String | Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds
        String format = "XML"; // String | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER
        try {
            TickhistoryResponse result = apiInstance.tickHistoryQatGet(id, date, time, format);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling QuoteAtTimeApi#tickHistoryQatGet");
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
 **date** | **String**| Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days | [optional]
 **time** | **String**| Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds | [optional]
 **format** | **String**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to XML] [enum: XML, JSON, CSV, CSV_NO_HEADER]

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

