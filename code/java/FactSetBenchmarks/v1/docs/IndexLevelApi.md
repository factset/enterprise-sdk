# IndexLevelApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBenchmarkRatios**](IndexLevelApi.md#getBenchmarkRatios) | **GET** /factset-benchmarks/v1/ratios | Returns the aggregated ratios of a requested benchmark
[**getBenchmarkRatiosForList**](IndexLevelApi.md#getBenchmarkRatiosForList) | **POST** /factset-benchmarks/v1/ratios | Returns the aggregated ratios of a requested benchmark
[**getIndexHistory**](IndexLevelApi.md#getIndexHistory) | **GET** /factset-benchmarks/v1/index-history | Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
[**getIndexHistoryForList**](IndexLevelApi.md#getIndexHistoryForList) | **POST** /factset-benchmarks/v1/index-history | Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
[**getIndexSnapshot**](IndexLevelApi.md#getIndexSnapshot) | **GET** /factset-benchmarks/v1/index-snapshot | Index Level Prices, Returns, and related information as of a single date.
[**getIndexSnapshotForList**](IndexLevelApi.md#getIndexSnapshotForList) | **POST** /factset-benchmarks/v1/index-snapshot | Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.



## getBenchmarkRatios

> BenchmarkRatiosResponse getBenchmarkRatios(ids, metrics, startDate, endDate, frequency, periodicity, currency)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. <p> Using FactSet Market Aggregates, the service combines fundamental, estimates, and pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.IndexLevelApi;

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

        IndexLevelApi apiInstance = new IndexLevelApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        java.util.List<String> metrics = Arrays.asList(); // java.util.List<String> | Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |<p>***metrics limit** =  38 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String startDate = "startDate_example"; // String | Requested start date expressed in YYYY-MM-DD format.
        String endDate = "endDate_example"; // String | Requested End Date for Range expressed in YYYY-MM-DD format.
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
        String periodicity = "LTM"; // String | The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:---|:---| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies 
        String currency = "currency_example"; // String | Currency for response.
        try {
            BenchmarkRatiosResponse result = apiInstance.getBenchmarkRatios(ids, metrics, startDate, endDate, frequency, periodicity, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndexLevelApi#getBenchmarkRatios");
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
 **ids** | **List&lt;String&gt;**| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **metrics** | **List&lt;String&gt;**| Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |&lt;p&gt;***metrics limit** &#x3D;  38 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **startDate** | **String**| Requested start date expressed in YYYY-MM-DD format. | [optional]
 **endDate** | **String**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to D] [enum: D, W, M, AM, CQ, AY, CY]
 **periodicity** | **String**| The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:---|:---| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies  | [optional] [default to LTM] [enum: LTM, LTMA, STMA, NTMA, 0, 1, 2, QTR]
 **currency** | **String**| Currency for response. | [optional]

### Return type

[**BenchmarkRatiosResponse**](BenchmarkRatiosResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benchmark Ratio data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getBenchmarkRatiosForList

> BenchmarkRatiosResponse getBenchmarkRatiosForList(benchmarkRatiosRequest)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. <p> Using FactSet Market Aggregates, the service combines FactSet Fundamental, FactSet Estimates, and FactSet Pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.IndexLevelApi;

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

        IndexLevelApi apiInstance = new IndexLevelApi(defaultClient);
        BenchmarkRatiosRequest benchmarkRatiosRequest = new BenchmarkRatiosRequest(); // BenchmarkRatiosRequest | Requests benchmark ratios for a given id
        try {
            BenchmarkRatiosResponse result = apiInstance.getBenchmarkRatiosForList(benchmarkRatiosRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndexLevelApi#getBenchmarkRatiosForList");
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
 **benchmarkRatiosRequest** | [**BenchmarkRatiosRequest**](BenchmarkRatiosRequest.md)| Requests benchmark ratios for a given id |

### Return type

[**BenchmarkRatiosResponse**](BenchmarkRatiosResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benchmark Ratio Response Items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getIndexHistory

> IndexHistoryResponse getIndexHistory(ids, startDate, endDate, frequency, returnType, hedgeType, currency, calendar)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as of a date range requested. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date range to retrieve Index Level Prices, Returns, and related information.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.IndexLevelApi;

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

        IndexLevelApi apiInstance = new IndexLevelApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String startDate = "startDate_example"; // String | Requested start date expressed in YYYY-MM-DD format.
        String endDate = "endDate_example"; // String | Requested End Date for Range expressed in YYYY-MM-DD format.
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
        String returnType = "GROSS"; // String | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS.
        String hedgeType = "UNHEDGED"; // String | The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED.
        String currency = "currency_example"; // String | Currency for response.
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends.
        try {
            IndexHistoryResponse result = apiInstance.getIndexHistory(ids, startDate, endDate, frequency, returnType, hedgeType, currency, calendar);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndexLevelApi#getIndexHistory");
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
 **ids** | **List&lt;String&gt;**| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **startDate** | **String**| Requested start date expressed in YYYY-MM-DD format. | [optional]
 **endDate** | **String**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to D] [enum: D, W, M, AM, CQ, AY, CY]
 **returnType** | **String**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] [default to GROSS] [enum: GROSS, NET]
 **hedgeType** | **String**| The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED. | [optional] [default to UNHEDGED] [enum: UNHEDGED, HEDGED]
 **currency** | **String**| Currency for response. | [optional]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to FIVEDAY] [enum: FIVEDAY, SEVENDAY]

### Return type

[**IndexHistoryResponse**](IndexHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Index Level Prices and Returns information for a requested date range. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getIndexHistoryForList

> IndexHistoryResponse getIndexHistoryForList(indexHistoryRequest)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as aligned with FactSet's Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.IndexLevelApi;

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

        IndexLevelApi apiInstance = new IndexLevelApi(defaultClient);
        IndexHistoryRequest indexHistoryRequest = new IndexHistoryRequest(); // IndexHistoryRequest | Requests Index Level History Prices and Returns for a list of identifiers and specified date range.
        try {
            IndexHistoryResponse result = apiInstance.getIndexHistoryForList(indexHistoryRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndexLevelApi#getIndexHistoryForList");
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
 **indexHistoryRequest** | [**IndexHistoryRequest**](IndexHistoryRequest.md)| Requests Index Level History Prices and Returns for a list of identifiers and specified date range. |

### Return type

[**IndexHistoryResponse**](IndexHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Index Level Prices and Returns information for a requested date range. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getIndexSnapshot

> IndexSnapshotResponse getIndexSnapshot(ids, date, returnType, currency, calendar)

Index Level Prices, Returns, and related information as of a single date.

Retrieves Index Level Prices and Returns information as of a specific date. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.IndexLevelApi;

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

        IndexLevelApi apiInstance = new IndexLevelApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String date = "date_example"; // String | Date of holding expressed in YYYY-MM-DD format.
        String returnType = "GROSS"; // String | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS.
        String currency = "currency_example"; // String | Currency for response.
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends.
        try {
            IndexSnapshotResponse result = apiInstance.getIndexSnapshot(ids, date, returnType, currency, calendar);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndexLevelApi#getIndexSnapshot");
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
 **ids** | **List&lt;String&gt;**| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **date** | **String**| Date of holding expressed in YYYY-MM-DD format. | [optional]
 **returnType** | **String**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] [default to GROSS] [enum: GROSS, NET]
 **currency** | **String**| Currency for response. | [optional]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to FIVEDAY] [enum: FIVEDAY, SEVENDAY]

### Return type

[**IndexSnapshotResponse**](IndexSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Index Level Prices and Returns information as of a single date |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getIndexSnapshotForList

> IndexSnapshotResponse getIndexSnapshotForList(indexSnapshotRequest)

Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.

Retrieves Index Level Prices and Returns information as aligned with FactSet's Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.IndexLevelApi;

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

        IndexLevelApi apiInstance = new IndexLevelApi(defaultClient);
        IndexSnapshotRequest indexSnapshotRequest = new IndexSnapshotRequest(); // IndexSnapshotRequest | Requests the Index Level Snapshot for a requested list of identifiers and specified date.
        try {
            IndexSnapshotResponse result = apiInstance.getIndexSnapshotForList(indexSnapshotRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IndexLevelApi#getIndexSnapshotForList");
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
 **indexSnapshotRequest** | [**IndexSnapshotRequest**](IndexSnapshotRequest.md)| Requests the Index Level Snapshot for a requested list of identifiers and specified date. |

### Return type

[**IndexSnapshotResponse**](IndexSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of Index Level Prices and Returns information as of a single date. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

