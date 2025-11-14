# MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostImpactV3**](MarketImpactApi.md#getCostImpactV3) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



## getCostImpactV3

> CostImpactResponseRootV3 getCostImpactV3(securityId, orderVolume, strategy, riskAversion, date, startTime, endTime, isMomentum, side, peer, frontLoadHalfLife, rearLoadHalfLife, rearRatio, binsData)

Get Cost Impact

Get Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiClient;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.auth.*;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models.*;
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.MarketImpactApi;

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

        MarketImpactApi apiInstance = new MarketImpactApi(defaultClient);
        String securityId = "FDS-US"; // String | ISIN for European securities, otherwise TICKER
        String orderVolume = "1000"; // String | Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4.
        String strategy = "strategy_example"; // String | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom
        java.util.List<String> riskAversion = Arrays.asList(); // java.util.List<String> | Input risk tolerance from passive to very aggressive
        LocalDate date = LocalDate.parse("2024-08-29"); // LocalDate | Date in the format YYYY-MM-DD
        String startTime = "10:00"; // String | Start Time in the format HH:MM
        String endTime = "15:00"; // String | End Time in the format HH:MM
        Boolean isMomentum = false; // Boolean | Flag to apply stock momentum. Specify true to include momentum
        String side = "side_example"; // String | Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell.
        Boolean peer = false; // Boolean | Flag to apply peer calibration. Specify true to include peer calibration
        Float frontLoadHalfLife = 1000F; // Float | Speeds up early execution
        Float rearLoadHalfLife = 0F; // Float | Delays orders towards end of the trading day.
        Float rearRatio = 1F; // Float | Adjusts weighting of final execution
        Boolean binsData = true; // Boolean | Flag to apply BinsData. Specify true to include BinsData
        try {
            CostImpactResponseRootV3 result = apiInstance.getCostImpactV3(securityId, orderVolume, strategy, riskAversion, date, startTime, endTime, isMomentum, side, peer, frontLoadHalfLife, rearLoadHalfLife, rearRatio, binsData);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MarketImpactApi#getCostImpactV3");
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
 **securityId** | **String**| ISIN for European securities, otherwise TICKER |
 **orderVolume** | **String**| Order Volume in scientific notation or float format. Example: 1000 or 1.234567e4. |
 **strategy** | **String**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional]
 **riskAversion** | **List&lt;String&gt;**| Input risk tolerance from passive to very aggressive | [optional]
 **date** | **LocalDate**| Date in the format YYYY-MM-DD | [optional]
 **startTime** | **String**| Start Time in the format HH:MM | [optional]
 **endTime** | **String**| End Time in the format HH:MM | [optional]
 **isMomentum** | **Boolean**| Flag to apply stock momentum. Specify true to include momentum | [optional]
 **side** | **String**| Indicate whether a buyer or seller. Only applies when isMomentum is true. Example: Buy or Sell. | [optional]
 **peer** | **Boolean**| Flag to apply peer calibration. Specify true to include peer calibration | [optional]
 **frontLoadHalfLife** | **Float**| Speeds up early execution | [optional]
 **rearLoadHalfLife** | **Float**| Delays orders towards end of the trading day. | [optional]
 **rearRatio** | **Float**| Adjusts weighting of final execution | [optional]
 **binsData** | **Boolean**| Flag to apply BinsData. Specify true to include BinsData | [optional] [default to true]

### Return type

[**CostImpactResponseRootV3**](CostImpactResponseRootV3.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **400** | Invalid query parameters. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |
| **503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify the API request. Only available after successful authentication. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining until the rate limit resets. <br>  |

