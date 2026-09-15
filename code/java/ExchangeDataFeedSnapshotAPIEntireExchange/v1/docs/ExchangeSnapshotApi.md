# ExchangeSnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListFiles**](ExchangeSnapshotApi.md#getListFiles) | **GET** /list-files | List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range



## getListFiles

> EntireExchangeSnapshotResponse getListFiles(product, startDate, endDate, startTime, endTime, access)

List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range

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
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.api.ExchangeSnapshotApi;

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

        ExchangeSnapshotApi apiInstance = new ExchangeSnapshotApi(defaultClient);
        Integer product = 10001; // Integer | any product subscribed by client
        LocalDate startDate = LocalDate.now(); // LocalDate | YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts `start_date` (snake_case), which is deprecated and exists for backward compatibility.
        LocalDate endDate = LocalDate.now(); // LocalDate | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts `end_date` (snake_case), which is deprecated and exists for backward compatibility.
        String startTime = "startTime_example"; // String | HHMM (24 hour time EST). Also accepts `start_time` (snake_case), which is deprecated and exists for backward compatibility.
        String endTime = "endTime_example"; // String | HHMM (24 hour time EST). Also accepts `end_time` (snake_case), which is deprecated and exists for backward compatibility.
        String access = "static"; // String | Option to select from static, DL or RT data
        try {
            EntireExchangeSnapshotResponse result = apiInstance.getListFiles(product, startDate, endDate, startTime, endTime, access);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeSnapshotApi#getListFiles");
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
 **product** | **Integer**| any product subscribed by client |
 **startDate** | **LocalDate**| YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts &#x60;start_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **endDate** | **LocalDate**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts &#x60;end_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **startTime** | **String**| HHMM (24 hour time EST). Also accepts &#x60;start_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **endTime** | **String**| HHMM (24 hour time EST). Also accepts &#x60;end_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **access** | **String**| Option to select from static, DL or RT data | [optional] [default to DL] [enum: static, DL, RT]

### Return type

[**EntireExchangeSnapshotResponse**](EntireExchangeSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success  |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication Failed |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **408** | Request Timeout |  -  |
| **500** | Internal Server Error |  -  |

