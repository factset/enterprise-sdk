# DataItemsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEstimateMetrics**](DataItemsApi.md#getEstimateMetrics) | **GET** /factset-estimates/v2/metrics | Available Estimate metrics
[**getEstimateMetricsForList**](DataItemsApi.md#getEstimateMetricsForList) | **POST** /factset-estimates/v2/metrics | Available Estimate metrics or ratios.



## getEstimateMetrics

> MetricsResponse getEstimateMetrics(category, subcategory)

Available Estimate metrics

Returns list of available Estimate metrics that can be used in the `metrics` parameter of related endpoints.
**By default, Factset provides Estimated items in millions. For specific metric methodology definitions, reference the `OAurl` response items to launch the available methodology page.** 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEstimates.ApiClient;
import com.factset.sdk.FactSetEstimates.ApiException;
import com.factset.sdk.FactSetEstimates.Configuration;
import com.factset.sdk.FactSetEstimates.auth.*;
import com.factset.sdk.FactSetEstimates.model.*;
import com.factset.sdk.FactSetEstimates.api.DataItemsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        DataItemsApi apiInstance = new DataItemsApi(defaultClient);
        String category = "FINANCIAL_STATEMENT"; // String | Filters the list of Estimate metrics by major category -   * **FINANCIAL_STATEMENT** = Includes Balance Sheet, Cash Flow, and Income Statement.   * **INDUSTRY_METRICS** = Industry specific metrics.   * **OTHER** = Target Price 
        String subcategory = "AIRLINES"; // String | Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested. For methodology, visit [OA 16038](https://my.apps.factset.com/oa/pages/16038) <p>Financial Statement -    * **BALANCE_SHEET** - Balance Sheet line items, such as Assets, Long-term Debt, and more.   * **CASH_FLOW** - Cash Flow Statement line items, such as Free Cash Flow and Share Repurchases   * **INCOME_STATEMENT** - Income Statement line items, such as EPS, Sales, DPS, and more. </p> <p> Industry Metrics -     * **AIRLINES** - Including items such as Revenue Passenger, Total Revenue per ASK, Available Seats, and more.   * **BANKS** - Including items such as Net Interest Income, Trading Income, Net Loans, and more. SUPPLEMENTAL   * **COMMODITIES** - Including items such as Average Target Price.   * **COMPUTER_HARDWARE** - Including items such as Total Addressable Market.   * **CONSUMER_SERVICES** - Including items such as Gross Merchandise Volume   * **EDUCATION** - Including Items such as Total Student Enrollment   * **FINANCIAL_SERVICE_PROVIDER** - Including items such as Annual Subscription Value   * **HOME_BUILDERS** - Including items such as Home Sales, Land Sales, Cancellation Rates, and more.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **MARIJUANA** - Including items such as Cost per Gram and Kg of Cannabis Sold.   * **MINING** - Including items such as Realized Price and Total Production   * **MULTIFINANCIAL** - Including items such as AUM, Net Flows, and Fee Related Earnings.   * **OIL_AND_GAS** - Including items such as Downstream Income, Production per Day, and Exploration Expense.   * **OTHER** - Target Price   * **REITS** - Including items such as Funds from Operations, Implied Cap Rate, and LTV.   * **RESTAURANTS** - Including items such as Restaurant Margin.   * **RETAILERS** - Including items such as Stores Information, Selling Space and Net sales per square foot.   * **TELECOMMUNICATIONS** - Including items such as Gross Adds, Monthly Revenue Per User, Churn, and more.   * **TRANSPORTATION** - Including items such as Revenue Per Unit, Volume Growth, and Operating Ratio.</p>    
        try {
            MetricsResponse result = apiInstance.getEstimateMetrics(category, subcategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataItemsApi#getEstimateMetrics");
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
 **category** | **String**| Filters the list of Estimate metrics by major category -   * **FINANCIAL_STATEMENT** &#x3D; Includes Balance Sheet, Cash Flow, and Income Statement.   * **INDUSTRY_METRICS** &#x3D; Industry specific metrics.   * **OTHER** &#x3D; Target Price  | [optional] [enum: FINANCIAL_STATEMENT, INDUSTRY_METRIC, OTHER]
 **subcategory** | **String**| Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested. For methodology, visit [OA 16038](https://my.apps.factset.com/oa/pages/16038) &lt;p&gt;Financial Statement -    * **BALANCE_SHEET** - Balance Sheet line items, such as Assets, Long-term Debt, and more.   * **CASH_FLOW** - Cash Flow Statement line items, such as Free Cash Flow and Share Repurchases   * **INCOME_STATEMENT** - Income Statement line items, such as EPS, Sales, DPS, and more. &lt;/p&gt; &lt;p&gt; Industry Metrics -     * **AIRLINES** - Including items such as Revenue Passenger, Total Revenue per ASK, Available Seats, and more.   * **BANKS** - Including items such as Net Interest Income, Trading Income, Net Loans, and more. SUPPLEMENTAL   * **COMMODITIES** - Including items such as Average Target Price.   * **COMPUTER_HARDWARE** - Including items such as Total Addressable Market.   * **CONSUMER_SERVICES** - Including items such as Gross Merchandise Volume   * **EDUCATION** - Including Items such as Total Student Enrollment   * **FINANCIAL_SERVICE_PROVIDER** - Including items such as Annual Subscription Value   * **HOME_BUILDERS** - Including items such as Home Sales, Land Sales, Cancellation Rates, and more.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **MARIJUANA** - Including items such as Cost per Gram and Kg of Cannabis Sold.   * **MINING** - Including items such as Realized Price and Total Production   * **MULTIFINANCIAL** - Including items such as AUM, Net Flows, and Fee Related Earnings.   * **OIL_AND_GAS** - Including items such as Downstream Income, Production per Day, and Exploration Expense.   * **OTHER** - Target Price   * **REITS** - Including items such as Funds from Operations, Implied Cap Rate, and LTV.   * **RESTAURANTS** - Including items such as Restaurant Margin.   * **RETAILERS** - Including items such as Stores Information, Selling Space and Net sales per square foot.   * **TELECOMMUNICATIONS** - Including items such as Gross Adds, Monthly Revenue Per User, Churn, and more.   * **TRANSPORTATION** - Including items such as Revenue Per Unit, Volume Growth, and Operating Ratio.&lt;/p&gt;     | [optional] [enum: AIRLINES, BALANCE_SHEET, BANKS, CASH_FLOW, COMMODITIES, COMPUTER_HARDWARE, CONSUMER_SERVICES, EDUCATION, FINANCIAL_SERVICE_PROVIDER, HOME_BUILDERS, HOSPITALS, HOTELS, INCOME_STATEMENT, INSURANCE, MARIJUANA, MINING, MULTIFINANCIAL, OIL_AND_GAS, OTHER, REITS, RESTAURANTS, RETAILERS, TELECOMMUNICATIONS, TRANSPORTATION]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data metric items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getEstimateMetricsForList

> MetricsResponse getEstimateMetricsForList(metricsRequest)

Available Estimate metrics or ratios.

Returns list of available Estimate metrics that can be used in the `metrics` parameter of related endpoints.
**By default, Factset provides Estimated items in millions. For specific metric methodology definitions, reference the `OAurl` response items to launch the available methodology page.** 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEstimates.ApiClient;
import com.factset.sdk.FactSetEstimates.ApiException;
import com.factset.sdk.FactSetEstimates.Configuration;
import com.factset.sdk.FactSetEstimates.auth.*;
import com.factset.sdk.FactSetEstimates.model.*;
import com.factset.sdk.FactSetEstimates.api.DataItemsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        DataItemsApi apiInstance = new DataItemsApi(defaultClient);
        MetricsRequest metricsRequest = new MetricsRequest(); // MetricsRequest | Request object for requesting estimates data
        try {
            MetricsResponse result = apiInstance.getEstimateMetricsForList(metricsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataItemsApi#getEstimateMetricsForList");
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
 **metricsRequest** | [**MetricsRequest**](MetricsRequest.md)| Request object for requesting estimates data |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Estimate metric Ids |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

