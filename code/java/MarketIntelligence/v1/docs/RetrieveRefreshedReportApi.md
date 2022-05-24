# RetrieveRefreshedReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataReportIdGet**](RetrieveRefreshedReportApi.md#getDataReportIdGet) | **GET** /get-data/{report_id} | Retrieve data for desired report.



## getDataReportIdGet

> FetchReportPollID getDataReportIdGet(reportId)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.

### Example

```java
// Import classes:
import com.factset.sdk.MarketIntelligence.ApiClient;
import com.factset.sdk.MarketIntelligence.ApiException;
import com.factset.sdk.MarketIntelligence.Configuration;
import com.factset.sdk.MarketIntelligence.auth.*;
import com.factset.sdk.MarketIntelligence.models.*;
import com.factset.sdk.MarketIntelligence.api.RetrieveRefreshedReportApi;

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

        RetrieveRefreshedReportApi apiInstance = new RetrieveRefreshedReportApi(defaultClient);
        String reportId = "reportId_example"; // String | example: 65ba6dd63fb366464646426d0b
        try {
            FetchReportPollID result = apiInstance.getDataReportIdGet(reportId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveRefreshedReportApi#getDataReportIdGet");
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
 **reportId** | **String**| example: 65ba6dd63fb366464646426d0b |

### Return type

[**FetchReportPollID**](FetchReportPollID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. If the report requested has been refreshed within an hour, the report data will be returned. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. |  -  |
| **202** | Your report is being processed. Please Check again after sometime. |  -  |
| **400** | Unknown Error. |  -  |
| **401** | Missing/invalid Credentials or authentication failure |  -  |
| **503** | Unrecognized report_id |  -  |

