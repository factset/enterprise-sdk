# TradesAtTimeApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tickHistoryTradesattimeGet**](TradesAtTimeApi.md#tickHistoryTradesattimeGet) | **GET** /TickHistory/tradesattime | Request returns the before and after trade data along with the associated quotes for the specified time



## tickHistoryTradesattimeGet

> TickhistoryResponse tickHistoryTradesattimeGet(id, reqId, format, date, time)

Request returns the before and after trade data along with the associated quotes for the specified time

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
import com.factset.sdk.FactSetIntradayTickHistory.api.TradesAtTimeApi;

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

        TradesAtTimeApi apiInstance = new TradesAtTimeApi(defaultClient);
        String id = "id_example"; // String | Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA
        String reqId = "reqId_example"; // String | Request Identification String. Can be used by the application to keep track of requests. The id is not used by this service, however, it is included in the XML response.
        String format = "XML"; // String | The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER
        String date = "date_example"; // String | Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days
        String time = "time_example"; // String | Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds
        try {
            TickhistoryResponse result = apiInstance.tickHistoryTradesattimeGet(id, reqId, format, date, time);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TradesAtTimeApi#tickHistoryTradesattimeGet");
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
 **format** | **String**| The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER | [optional] [default to XML] [enum: XML, JSON, CSV, CSV_NO_HEADER]
 **date** | **String**| Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days | [optional]
 **time** | **String**| Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds | [optional]

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

