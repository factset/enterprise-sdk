# OrderSearchApi

All URIs are relative to *https://api.factset.com/analytics/beast/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFieldValues**](OrderSearchApi.md#getFieldValues) | **GET** /tca/search/field-values | Get Order field values
[**getOrders**](OrderSearchApi.md#getOrders) | **GET** /tca/search/orders | Get Orders by field values



## getFieldValues

> FieldValuesResponseRoot getFieldValues(startDate, endDate)

Get Order field values

Get lists of Order field values for symbol, trader, region, strategy and broker fields

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
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.OrderSearchApi;

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

        OrderSearchApi apiInstance = new OrderSearchApi(defaultClient);
        LocalDate startDate = LocalDate.parse("2024-08-21"); // LocalDate | Date in the format YYYY-MM-DD
        LocalDate endDate = LocalDate.parse("2024-08-29"); // LocalDate | Date in the format YYYY-MM-DD
        try {
            FieldValuesResponseRoot result = apiInstance.getFieldValues(startDate, endDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrderSearchApi#getFieldValues");
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
 **startDate** | **LocalDate**| Date in the format YYYY-MM-DD |
 **endDate** | **LocalDate**| Date in the format YYYY-MM-DD |

### Return type

[**FieldValuesResponseRoot**](FieldValuesResponseRoot.md)

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


## getOrders

> OrdersResponseRoot getOrders(startDate, endDate, securityId, trader, country, strategy, broker, orderFields, hierarchical, messageType, limit, offset)

Get Orders by field values

Get Orders by specific field values.

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
import com.factset.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.OrderSearchApi;

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

        OrderSearchApi apiInstance = new OrderSearchApi(defaultClient);
        LocalDate startDate = LocalDate.parse("2024-08-21"); // LocalDate | Date in the format YYYY-MM-DD
        LocalDate endDate = LocalDate.parse("2024-08-29"); // LocalDate | Date in the format YYYY-MM-DD
        String securityId = "FDS"; // String | ISIN for European or India securities, otherwise TICKER. Works together with country and currency parameters.
        String trader = "trader_example"; // String | Optionally specify a trader to filter by, Example : Ryan
        String country = "US"; // String | The two character ISO country code of the trading region, like US. EMEA is used for the European trading region
        String strategy = "strategy_example"; // String | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom
        String broker = "broker_example"; // String | Order Broker
        java.util.List<String> orderFields = Arrays.asList(); // java.util.List<String> | Specify order fields to select. The OrderId, Country, MasterOrderId, MessageType and ParentId fields are default fields and must be included if none are specified.
        Boolean hierarchical = true; // Boolean | Return order records in hierarchical format or as flat records
        String messageType = "Undefined"; // String | Return parent or child order records by messageType. Only apply when hierarchical is false
        Integer limit = 50000; // Integer | Maximum number of records to return per page. Default with max value 50000
        Integer offset = 1; // Integer | Starting position (offset) for paginated records. Specifies current page to return results. Default value 1
        try {
            OrdersResponseRoot result = apiInstance.getOrders(startDate, endDate, securityId, trader, country, strategy, broker, orderFields, hierarchical, messageType, limit, offset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrderSearchApi#getOrders");
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
 **startDate** | **LocalDate**| Date in the format YYYY-MM-DD |
 **endDate** | **LocalDate**| Date in the format YYYY-MM-DD |
 **securityId** | **String**| ISIN for European or India securities, otherwise TICKER. Works together with country and currency parameters. | [optional]
 **trader** | **String**| Optionally specify a trader to filter by, Example : Ryan | [optional]
 **country** | **String**| The two character ISO country code of the trading region, like US. EMEA is used for the European trading region | [optional]
 **strategy** | **String**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional]
 **broker** | **String**| Order Broker | [optional]
 **orderFields** | **List&lt;String&gt;**| Specify order fields to select. The OrderId, Country, MasterOrderId, MessageType and ParentId fields are default fields and must be included if none are specified. | [optional] [enum: DateId, Symbol, Trader, Broker, Strategy, Country, Side, Price, ClosePrice, VwapOpenClose, VwapFfClose, Currency, ParentId, BasketId, Volume, RefValue, Status, Note, CompanyName, FirstFillTime, LastFillTime, OrderEntryTimeUtc, OpenPerfBps, FirstFillMidPerfBps, LastFillMidPerfBps, ClosePerfBps, VwapFfLfPerfBps, Reversion5MinMidBps, ParticipationRatePct, MessageType, MasterOrderId, OrderId, Reversion60MinMidBps, ClientId, SecurityId, LimitPrice, OrderType, OrderVolume, Venue, FillTimeUtc, Algo, OpenPrice, FirstFillMid, LastFillMid, VwapFfLf, Value, Reversion5MinMidPrice, Reversion10MinMidPrice, Reversion10MinMidBps, Reversion15MinMidPrice, Reversion15MinMidBps, IntraOrderVolatility, SpreadCross, Pwp20Price, Pwp20Volume, Pwp20PerfBps, Pwp10Price, Pwp10Volume, Pwp10PerfBps, Pwp05Price, Pwp05Volume, Pwp05PerfBps, MarketAdjustment, ErrorCodes, ProcessedTime, Twas, TwasAskSize, TwasBidSize, RefCurrency, Region, Destination, Destinationtype, VwapFfLfVolume, LimitVwapFfLfVolume, LimitVwapFfLf, LimitVwapFfLfPerfBps, IntraOrderVolatilityBps, LimitParticipationRatePct, MarketSpreadCross, LimitPwp20Price, LimitPwp20Volume, LimitPwp20PerfBps, LimitPwp10Price, LimitPwp10Volume, LimitPwp10PerfBps, LimitPwp05Price, LimitPwp05Volume, LimitPwp05PerfBps, FxRate, ParentCreationTimeUtc, Synthetic, GrandParentId, Isin, Pwp01Price, Pwp01Volume, Pwp01PerfBps, LimitPwp01Price, LimitPwp01Volume, LimitPwp01PerfBps, Pwp02Price, Pwp02Volume, Pwp02PerfBps, LimitPwp02Price, LimitPwp02Volume, LimitPwp02PerfBps, Pwp03Price, Pwp03Volume, Pwp03PerfBps, LimitPwp03Price, LimitPwp03Volume, LimitPwp03PerfBps, Reversion60MinMidPrice, LimitPwp50Price, LimitPwp50Volume, LimitPwp50PerfBps, LimitPwp100Price, LimitPwp100Volume, LimitPwp100PerfBps, Pwp50Price, Pwp50Volume, Pwp50PerfBps, Pwp100Price, Pwp100Volume, Pwp100PerfBps, Udfmap, VwapFfCloseVolume, VwapFfClosePerfBps, VwapOrderEntryClose, VwapOrderEntryCloseVolume, VwapOrderEntryClosePerfBps, VwapOpenCloseVolume, VwapOpenClosePerfBps, VwapHighAvgPrice, VwapHighAvgPriceVolume, VwapHighAvgPricePerfBps, VwapLowAvgPrice, VwapLowAvgPriceVolume, VwapLowAvgPricePerfBps, LimitVwapFfClose, LimitVwapFfCloseVolume, LimitVwapFfClosePerfBps, LimitVwapOrderEntryClose, LimitVwapOrderEntryCloseVolume, LimitVwapOrderEntryClosePerfBps, LimitVwapOpenClose, LimitVwapOpenCloseVolume, LimitVwapOpenClosePerfBps, LimitVwapHighAvgPrice, LimitVwapHighAvgPriceVolume, LimitVwapHighAvgPricePerfBps, LimitVwapLowAvgPrice, LimitVwapLowAvgPriceVolume, LimitVwapLowAvgPricePerfBps, AlgoWheel, CountryAlias, Direction, OrderEntryFillMid, FirstFillPrice, FirstFillPreBid, FirstFillPreAsk, OrderEntryPreBid, OrderEntryPreAsk, LastFillPrice, LastFillPreBid, LastFillPreAsk, BbgTicker, CostEstimates, FirstFillPricePerfBps, FirstFillTimeStatus, Id, MarketCap, OrderEntryFillMidPerfBps, Sector, MultidayBenchmarks]
 **hierarchical** | **Boolean**| Return order records in hierarchical format or as flat records | [optional] [default to true]
 **messageType** | **String**| Return parent or child order records by messageType. Only apply when hierarchical is false | [optional] [default to Undefined] [enum: Undefined, Parent, Child]
 **limit** | **Integer**| Maximum number of records to return per page. Default with max value 50000 | [optional] [default to 50000]
 **offset** | **Integer**| Starting position (offset) for paginated records. Specifies current page to return results. Default value 1 | [optional] [default to 1]

### Return type

[**OrdersResponseRoot**](OrdersResponseRoot.md)

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

