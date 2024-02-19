# SnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListFiles**](SnapshotApi.md#getV1ListFiles) | **GET** /v1/list-files | Snapshot



## getV1ListFiles

> InlineResponse200 getV1ListFiles(product, startDate, endDate, startTime, endTime, access)

Snapshot

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiClient;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiException;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.Configuration;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.auth.*;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models.*;
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.api.SnapshotApi;

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

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        Integer product = 10001; // Integer | any product subscribed by client. Minimum value for prod code=9001
        LocalDate startDate = LocalDate.now(); // LocalDate | YYYYMMDD (Choose between 1 and 4 previous trading days)
        LocalDate endDate = LocalDate.now(); // LocalDate | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date)
        String startTime = "startTime_example"; // String | HHMM (24 hour time EST)
        String endTime = "endTime_example"; // String | HHMM (24 hour time EST)
        String access = "static"; // String | Option to select from static, DL or RT data
        try {
            InlineResponse200 result = apiInstance.getV1ListFiles(product, startDate, endDate, startTime, endTime, access);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#getV1ListFiles");
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
 **product** | **Integer**| any product subscribed by client. Minimum value for prod code&#x3D;9001 |
 **startDate** | **LocalDate**| YYYYMMDD (Choose between 1 and 4 previous trading days) |
 **endDate** | **LocalDate**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date) |
 **startTime** | **String**| HHMM (24 hour time EST) |
 **endTime** | **String**| HHMM (24 hour time EST) |
 **access** | **String**| Option to select from static, DL or RT data | [optional] [default to DL] [enum: static, DL, RT]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success  |  -  |
| **400** | Bad Request |  -  |

