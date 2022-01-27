# RequestFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RequestFilesGet**](RequestFilesApi.md#v1RequestFilesGet) | **GET** /v1/request-files | Returns the requestId and status



## v1RequestFilesGet

> RequestFilesResponse v1RequestFilesGet(startDate, endDate, ticker, isoCode, fields)

Returns the requestId and status

Try it Out - references a Sandbox environment to simulate live reponses.</p> **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.</p> PROD has data from 20120101 to current date &</p> **available IDs is limited to..**</p> US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA</p> ASX - CBA-ASX, BHP-ASX</p> LSE - HSBA-LON, VOD-LON</p> Tokyo - 7203-TKS, 4307-TKS</p> Shenzhen OR Shanghai - 300782-SHE, 300792-SHE</p> Swiss - NESN-SWX, COTN-SWX</p> Singapore - J36-SES &</p> Hong Kong - 700-HKG</p>

### Example

```java
import org.threeten.bp.LocalDate;
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.model.*;
import com.factset.sdk.FactSetTickHistory.api.RequestFilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/bulk-documents/tickhistory");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RequestFilesApi apiInstance = new RequestFilesApi(defaultClient);
        LocalDate startDate = LocalDate.parse("2021-01-01"); // LocalDate | The date for (or from which) the data is required</p> **In Sandbox, data available from 1st to 31st Jan'21 only**
        LocalDate endDate = LocalDate.parse("2021-01-31"); // LocalDate | The date to which data is required</p> **In Sandbox, data available from 1st to 31st Jan'21 only**
        String ticker = "IBM,F,AAPL,GOOG"; // String | any ticker. <p>**Either ticker(s) + iso_code  (OR) product is allowed**</p> **NOTE**:Only one identifier can be requested per request
        String isoCode = "USA"; // String | iso_code. <p>ticker(s) + iso_code</p> <p>**Does not support multiple iso_codes**</p>
        String fields = "*"; // String | Fields for which data is requested. Refer <a href= \"https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\">Output fileds list</a>. for available fields.</p> **In trial default=all fields**
        try {
            RequestFilesResponse result = apiInstance.v1RequestFilesGet(startDate, endDate, ticker, isoCode, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequestFilesApi#v1RequestFilesGet");
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
 **startDate** | **LocalDate**| The date for (or from which) the data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** |
 **endDate** | **LocalDate**| The date to which data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** |
 **ticker** | **String**| any ticker. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request | [optional]
 **isoCode** | **String**| iso_code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; | [optional]
 **fields** | **String**| Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\&quot;&gt;Output fileds list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** | [optional] [default to *]

### Return type

[**RequestFilesResponse**](RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successs |  -  |
| **400** | Bad Request |  -  |

