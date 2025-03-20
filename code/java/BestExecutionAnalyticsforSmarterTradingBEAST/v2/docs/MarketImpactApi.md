# MarketImpactApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostImpact**](MarketImpactApi.md#getCostImpact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact



## getCostImpact

> CostImpactResponseRoot getCostImpact(securityId, region, currency, orderVolume, strategy, date, isin, startTime, endTime, frontLoadHalfLife, rearLoadHalfLife, rearRatio, riskAversion, applyMomentum, side)

Get Cost Impact

Get Cost Impact

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
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
        String region = "US"; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
        String currency = "USD"; // String | The ISO 4217 currency code
        Float orderVolume = 100000F; // Float | Order Volume
        String strategy = "vwap"; // String | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom
        String date = "2024-08-29"; // String | Date in the format YYYY-MM-DD
        String isin = "isin_example"; // String | International securities identification number
        String startTime = "10:00:00"; // String | Start Time in the format HH:MM:SS
        String endTime = "15:00:00"; // String | End Time in the format HH:MM:SS
        Float frontLoadHalfLife = 1000F; // Float | Front Load Half Life
        Float rearLoadHalfLife = 0F; // Float | Rear Load Half Life
        Float rearRatio = 1F; // Float | Rear Ratio
        Float riskAversion = 0.3F; // Float | Risk Aversion
        Boolean applyMomentum = false; // Boolean | Flag to apply stock momentum. Specify true to include momentum
        String side = "side_example"; // String | Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell.
        try {
            CostImpactResponseRoot result = apiInstance.getCostImpact(securityId, region, currency, orderVolume, strategy, date, isin, startTime, endTime, frontLoadHalfLife, rearLoadHalfLife, rearRatio, riskAversion, applyMomentum, side);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MarketImpactApi#getCostImpact");
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
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region |
 **currency** | **String**| The ISO 4217 currency code |
 **orderVolume** | **Float**| Order Volume |
 **strategy** | **String**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional]
 **date** | **String**| Date in the format YYYY-MM-DD | [optional]
 **isin** | **String**| International securities identification number | [optional]
 **startTime** | **String**| Start Time in the format HH:MM:SS | [optional]
 **endTime** | **String**| End Time in the format HH:MM:SS | [optional]
 **frontLoadHalfLife** | **Float**| Front Load Half Life | [optional]
 **rearLoadHalfLife** | **Float**| Rear Load Half Life | [optional]
 **rearRatio** | **Float**| Rear Ratio | [optional]
 **riskAversion** | **Float**| Risk Aversion | [optional]
 **applyMomentum** | **Boolean**| Flag to apply stock momentum. Specify true to include momentum | [optional]
 **side** | **String**| Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. | [optional]

### Return type

[**CostImpactResponseRoot**](CostImpactResponseRoot.md)

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

