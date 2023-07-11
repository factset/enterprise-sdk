# RequestFilesLevel2BetaApi

All URIs are relative to *https://api.factset.com/bulk-documents/tick-history/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getrequestIdLevel2**](RequestFilesLevel2BetaApi.md#getrequestIdLevel2) | **GET** /level2/request-files | Returns the requestId and status



## getrequestIdLevel2

> Level2RequestFilesResponse getrequestIdLevel2(ticker, startDate, endDate, mic, responseFileType)

Returns the requestId and status

Returns the requestId and status.

### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.RequestFilesLevel2BetaApi;

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

        RequestFilesLevel2BetaApi apiInstance = new RequestFilesLevel2BetaApi(defaultClient);
        java.util.List<String> ticker = Arrays.asList(); // java.util.List<String> | The requested list of one or more Market tickers.
        LocalDate startDate = LocalDate.parse("2023-01-01"); // LocalDate | The date to which data is required.
        LocalDate endDate = LocalDate.parse("2023-01-30"); // LocalDate | The date to which data is required.
        String mic = "XNYS"; // String | This parameter is used to filter the results based on the exchange code. <p>**NOTE**:Does not support multiple mic codes</p>
        String responseFileType = "csv"; // String | Specifies the fileType
        try {
            Level2RequestFilesResponse result = apiInstance.getrequestIdLevel2(ticker, startDate, endDate, mic, responseFileType);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RequestFilesLevel2BetaApi#getrequestIdLevel2");
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
 **ticker** | **List&lt;String&gt;**| The requested list of one or more Market tickers. |
 **startDate** | **LocalDate**| The date to which data is required. |
 **endDate** | **LocalDate**| The date to which data is required. |
 **mic** | **String**| This parameter is used to filter the results based on the exchange code. &lt;p&gt;**NOTE**:Does not support multiple mic codes&lt;/p&gt; |
 **responseFileType** | **String**| Specifies the fileType | [optional] [default to parquet] [enum: csv, parquet]

### Return type

[**Level2RequestFilesResponse**](Level2RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successs |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

