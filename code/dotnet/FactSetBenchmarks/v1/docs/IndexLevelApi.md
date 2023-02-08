# FactSet.SDK.FactSetBenchmarks.Api.IndexLevelApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBenchmarkRatios**](IndexLevelApi.md#getbenchmarkratios) | **GET** /factset-benchmarks/v1/ratios | Returns the aggregated ratios of a requested benchmark
[**GetBenchmarkRatiosForList**](IndexLevelApi.md#getbenchmarkratiosforlist) | **POST** /factset-benchmarks/v1/ratios | Returns the aggregated ratios of a requested benchmark
[**GetIndexHistory**](IndexLevelApi.md#getindexhistory) | **GET** /factset-benchmarks/v1/index-history | Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
[**GetIndexHistoryForList**](IndexLevelApi.md#getindexhistoryforlist) | **POST** /factset-benchmarks/v1/index-history | Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
[**GetIndexSnapshot**](IndexLevelApi.md#getindexsnapshot) | **GET** /factset-benchmarks/v1/index-snapshot | Index Level Prices, Returns, and related information as of a single date.
[**GetIndexSnapshotForList**](IndexLevelApi.md#getindexsnapshotforlist) | **POST** /factset-benchmarks/v1/index-snapshot | Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.



<a name="getbenchmarkratios"></a>
# **GetBenchmarkRatios**
> BenchmarkRatiosResponse GetBenchmarkRatios (List<string> ids, List<string> metrics, string startDate = null, string endDate = null, string frequency = null, string periodicity = null, string currency = null)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. <p> Using FactSet Market Aggregates, the service combines fundamental, estimates, and pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).</p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetBenchmarkRatiosExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBenchmarks.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IndexLevelApi(config);

            var ids = new List<string>(); // List<string> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var metrics = new List<string>(); // List<string> | Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:- --|:- --|:- --|:- --| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |<p>***metrics limit** =  38 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var startDate = "startDate_example";  // string | Requested start date expressed in YYYY-MM-DD format. (optional) 
            var endDate = "endDate_example";  // string | Requested End Date for Range expressed in YYYY-MM-DD format. (optional) 
            var frequency = "D";  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional)  (default to D)
            var periodicity = "LTM";  // string | The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:- --|:- --| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies  (optional)  (default to LTM)
            var currency = "currency_example";  // string | Currency for response. (optional) 

            try
            {
                // Returns the aggregated ratios of a requested benchmark
                BenchmarkRatiosResponse result = apiInstance.GetBenchmarkRatios(ids, metrics, startDate, endDate, frequency, periodicity, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IndexLevelApi.GetBenchmarkRatios: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **metrics** | [**List&lt;string&gt;**](string.md)| Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:- --|:- --|:- --|:- --| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |&lt;p&gt;***metrics limit** &#x3D;  38 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **string**| Requested start date expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **string**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to D]
 **periodicity** | **string**| The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:- --|:- --| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies  | [optional] [default to LTM]
 **currency** | **string**| Currency for response. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbenchmarkratiosforlist"></a>
# **GetBenchmarkRatiosForList**
> BenchmarkRatiosResponse GetBenchmarkRatiosForList (BenchmarkRatiosRequest benchmarkRatiosRequest)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. <p> Using FactSet Market Aggregates, the service combines FactSet Fundamental, FactSet Estimates, and FactSet Pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).</p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetBenchmarkRatiosForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBenchmarks.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IndexLevelApi(config);

            var benchmarkRatiosRequest = new BenchmarkRatiosRequest(); // BenchmarkRatiosRequest | Requests benchmark ratios for a given id

            try
            {
                // Returns the aggregated ratios of a requested benchmark
                BenchmarkRatiosResponse result = apiInstance.GetBenchmarkRatiosForList(benchmarkRatiosRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IndexLevelApi.GetBenchmarkRatiosForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getindexhistory"></a>
# **GetIndexHistory**
> IndexHistoryResponse GetIndexHistory (List<string> ids, string startDate = null, string endDate = null, string frequency = null, string returnType = null, string hedgeType = null, string currency = null, string calendar = null, string impliedDate = null)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as of a date range requested. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date range to retrieve Index Level Prices, Returns, and related information. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetIndexHistoryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBenchmarks.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IndexLevelApi(config);

            var ids = new List<string>(); // List<string> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var startDate = "startDate_example";  // string | Requested start date expressed in YYYY-MM-DD format. (optional) 
            var endDate = "endDate_example";  // string | Requested End Date for Range expressed in YYYY-MM-DD format. (optional) 
            var frequency = "D";  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional)  (default to D)
            var returnType = "GROSS";  // string | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. (optional)  (default to GROSS)
            var hedgeType = "UNHEDGED";  // string | The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED. (optional)  (default to UNHEDGED)
            var currency = "currency_example";  // string | Currency for response. (optional) 
            var calendar = "FIVEDAY";  // string | Calendar of data returned. SEVENDAY includes weekends. (optional)  (default to FIVEDAY)
            var impliedDate = "Y";  // string | This parameter controls the **date** returned in the date field. The default value is **N**. By default, the date field returns the actual date of the observation. This means it will repeat values for weekends and holidays. If  set to **Y**, the date field will return the implied date of the observation, making all the dates unique. (optional)  (default to N)

            try
            {
                // Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
                IndexHistoryResponse result = apiInstance.GetIndexHistory(ids, startDate, endDate, frequency, returnType, hedgeType, currency, calendar, impliedDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IndexLevelApi.GetIndexHistory: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **string**| Requested start date expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **string**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to D]
 **returnType** | **string**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] [default to GROSS]
 **hedgeType** | **string**| The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED. | [optional] [default to UNHEDGED]
 **currency** | **string**| Currency for response. | [optional] 
 **calendar** | **string**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to FIVEDAY]
 **impliedDate** | **string**| This parameter controls the **date** returned in the date field. The default value is **N**. By default, the date field returns the actual date of the observation. This means it will repeat values for weekends and holidays. If  set to **Y**, the date field will return the implied date of the observation, making all the dates unique. | [optional] [default to N]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getindexhistoryforlist"></a>
# **GetIndexHistoryForList**
> IndexHistoryResponse GetIndexHistoryForList (IndexHistoryRequest indexHistoryRequest)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as aligned with FactSet's Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetIndexHistoryForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBenchmarks.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IndexLevelApi(config);

            var indexHistoryRequest = new IndexHistoryRequest(); // IndexHistoryRequest | Requests Index Level History Prices and Returns for a list of identifiers and specified date range.

            try
            {
                // Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
                IndexHistoryResponse result = apiInstance.GetIndexHistoryForList(indexHistoryRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IndexLevelApi.GetIndexHistoryForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getindexsnapshot"></a>
# **GetIndexSnapshot**
> IndexSnapshotResponse GetIndexSnapshot (List<string> ids, string date = null, string returnType = null, string currency = null, string calendar = null)

Index Level Prices, Returns, and related information as of a single date.

Retrieves Index Level Prices and Returns information as of a specific date. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetIndexSnapshotExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBenchmarks.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IndexLevelApi(config);

            var ids = new List<string>(); // List<string> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var date = "date_example";  // string | Date of holding expressed in YYYY-MM-DD format. (optional) 
            var returnType = "GROSS";  // string | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. (optional)  (default to GROSS)
            var currency = "currency_example";  // string | Currency for response. (optional) 
            var calendar = "FIVEDAY";  // string | Calendar of data returned. SEVENDAY includes weekends. (optional)  (default to FIVEDAY)

            try
            {
                // Index Level Prices, Returns, and related information as of a single date.
                IndexSnapshotResponse result = apiInstance.GetIndexSnapshot(ids, date, returnType, currency, calendar);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IndexLevelApi.GetIndexSnapshot: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;string&gt;**](string.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **date** | **string**| Date of holding expressed in YYYY-MM-DD format. | [optional] 
 **returnType** | **string**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] [default to GROSS]
 **currency** | **string**| Currency for response. | [optional] 
 **calendar** | **string**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to FIVEDAY]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getindexsnapshotforlist"></a>
# **GetIndexSnapshotForList**
> IndexSnapshotResponse GetIndexSnapshotForList (IndexSnapshotRequest indexSnapshotRequest)

Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.

Retrieves Index Level Prices and Returns information as aligned with FactSet's Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetIndexSnapshotForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBenchmarks.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new IndexLevelApi(config);

            var indexSnapshotRequest = new IndexSnapshotRequest(); // IndexSnapshotRequest | Requests the Index Level Snapshot for a requested list of identifiers and specified date.

            try
            {
                // Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.
                IndexSnapshotResponse result = apiInstance.GetIndexSnapshotForList(indexSnapshotRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IndexLevelApi.GetIndexSnapshotForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


