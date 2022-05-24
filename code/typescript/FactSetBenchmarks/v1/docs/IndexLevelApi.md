# factsetbenchmarks.IndexLevelApi

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

> BenchmarkRatiosResponse getBenchmarkRatios(ids, metrics, opts)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. &lt;p&gt; Using FactSet Market Aggregates, the service combines fundamental, estimates, and pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).&lt;/p&gt; 

### Example

```javascript
const { ApiClient, IndexLevelApi } = require('@factset/sdk-factsetbenchmarks');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new IndexLevelApi();
const ids = ["null"]; // [String] | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const metrics = ["LTD_EQ"]; // [String] | Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |<p>***metrics limit** =  38 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'startDate': "startDate_example", // String | Requested start date expressed in YYYY-MM-DD format.
  'endDate': "endDate_example", // String | Requested End Date for Range expressed in YYYY-MM-DD format.
  'frequency': D, // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
  'periodicity': "'LTM'", // String | The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:---|:---| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies 
  'currency': "currency_example" // String | Currency for response.
};

// Call api endpoint
apiInstance.getBenchmarkRatios(ids, metrics, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**[String]**](String.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **metrics** | [**[String]**](String.md)| Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |&lt;p&gt;***metrics limit** &#x3D;  38 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **String**| Requested start date expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to &#39;D&#39;]
 **periodicity** | **String**| The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:---|:---| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies  | [optional] [default to &#39;LTM&#39;]
 **currency** | **String**| Currency for response. | [optional] 

### Return type

[**BenchmarkRatiosResponse**](BenchmarkRatiosResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBenchmarkRatiosForList

> BenchmarkRatiosResponse getBenchmarkRatiosForList(benchmarkRatiosRequest)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. &lt;p&gt; Using FactSet Market Aggregates, the service combines FactSet Fundamental, FactSet Estimates, and FactSet Pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).&lt;/p&gt; 

### Example

```javascript
const { ApiClient, IndexLevelApi } = require('@factset/sdk-factsetbenchmarks');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new IndexLevelApi();
const benchmarkRatiosRequest = new factsetbenchmarks.BenchmarkRatiosRequest(); // BenchmarkRatiosRequest | Requests benchmark ratios for a given id

// Call api endpoint
apiInstance.getBenchmarkRatiosForList(benchmarkRatiosRequest).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


## getIndexHistory

> IndexHistoryResponse getIndexHistory(ids, opts)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as of a date range requested. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date range to retrieve Index Level Prices, Returns, and related information. 

### Example

```javascript
const { ApiClient, IndexLevelApi } = require('@factset/sdk-factsetbenchmarks');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new IndexLevelApi();
const ids = ["null"]; // [String] | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': "startDate_example", // String | Requested start date expressed in YYYY-MM-DD format.
  'endDate': "endDate_example", // String | Requested End Date for Range expressed in YYYY-MM-DD format.
  'frequency': D, // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. 
  'returnType': "'GROSS'", // String | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS.
  'hedgeType': "'UNHEDGED'", // String | The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED.
  'currency': "currency_example", // String | Currency for response.
  'calendar': FIVEDAY // String | Calendar of data returned. SEVENDAY includes weekends.
};

// Call api endpoint
apiInstance.getIndexHistory(ids, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**[String]**](String.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **String**| Requested start date expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **String**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to &#39;D&#39;]
 **returnType** | **String**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] [default to &#39;GROSS&#39;]
 **hedgeType** | **String**| The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED. | [optional] [default to &#39;UNHEDGED&#39;]
 **currency** | **String**| Currency for response. | [optional] 
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to &#39;FIVEDAY&#39;]

### Return type

[**IndexHistoryResponse**](IndexHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getIndexHistoryForList

> IndexHistoryResponse getIndexHistoryForList(indexHistoryRequest)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as aligned with FactSet&#39;s Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example

```javascript
const { ApiClient, IndexLevelApi } = require('@factset/sdk-factsetbenchmarks');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new IndexLevelApi();
const indexHistoryRequest = new factsetbenchmarks.IndexHistoryRequest(); // IndexHistoryRequest | Requests Index Level History Prices and Returns for a list of identifiers and specified date range.

// Call api endpoint
apiInstance.getIndexHistoryForList(indexHistoryRequest).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


## getIndexSnapshot

> IndexSnapshotResponse getIndexSnapshot(ids, opts)

Index Level Prices, Returns, and related information as of a single date.

Retrieves Index Level Prices and Returns information as of a specific date. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example

```javascript
const { ApiClient, IndexLevelApi } = require('@factset/sdk-factsetbenchmarks');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new IndexLevelApi();
const ids = ["null"]; // [String] | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'date': "date_example", // String | Date of holding expressed in YYYY-MM-DD format.
  'returnType': "'GROSS'", // String | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS.
  'currency': "currency_example", // String | Currency for response.
  'calendar': FIVEDAY // String | Calendar of data returned. SEVENDAY includes weekends.
};

// Call api endpoint
apiInstance.getIndexSnapshot(ids, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**[String]**](String.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **date** | **String**| Date of holding expressed in YYYY-MM-DD format. | [optional] 
 **returnType** | **String**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] [default to &#39;GROSS&#39;]
 **currency** | **String**| Currency for response. | [optional] 
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. | [optional] [default to &#39;FIVEDAY&#39;]

### Return type

[**IndexSnapshotResponse**](IndexSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getIndexSnapshotForList

> IndexSnapshotResponse getIndexSnapshotForList(indexSnapshotRequest)

Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.

Retrieves Index Level Prices and Returns information as aligned with FactSet&#39;s Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example

```javascript
const { ApiClient, IndexLevelApi } = require('@factset/sdk-factsetbenchmarks');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new IndexLevelApi();
const indexSnapshotRequest = new factsetbenchmarks.IndexSnapshotRequest(); // IndexSnapshotRequest | Requests the Index Level Snapshot for a requested list of identifiers and specified date.

// Call api endpoint
apiInstance.getIndexSnapshotForList(indexSnapshotRequest).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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

