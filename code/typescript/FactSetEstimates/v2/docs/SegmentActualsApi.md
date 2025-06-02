# factsetestimates.SegmentActualsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSegmentActuals**](SegmentActualsApi.md#getSegmentActuals) | **GET** /factset-estimates/v2/segment-actuals | Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.
[**getSegmentActualsForList**](SegmentActualsApi.md#getSegmentActualsForList) | **POST** /factset-estimates/v2/segment-actuals | Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.



## getSegmentActuals

> SegmentActualsResponse getSegmentActuals(ids, segmentType, metrics, opts)

Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.

Returns FactSet Estimates Actuals data using rolling fiscal dates for company business and geographic segments. &lt;p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SegmentActualsApi } = require('@factset/sdk-factsetestimates');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new SegmentActualsApi();
const ids = ["AAPL-USA"]; // [String] | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
const segmentType = BUS; // String | Controls the type of segment selected.   * **BUS** = Business / Product Segment   * **GEO** = Geographic Segment 
const metrics = ["SALES"]; // [String] | Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  <h3>Financial Metrics</h3> |field|description| |---|---| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General & Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General & Administrative Expenses| |S_M_EXP|Selling & Marketing Expenses| |REV_TOT*|Total Revenues*|   <h3>Industry Metrics</h3> |field|description| |---|---| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds| 
const opts = {
  'relativeFiscalStart': -2, // Number | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for `relativeFiscalStart` must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0). 
  'relativeFiscalEnd': 0, // Number | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for `relativeFiscalEnd` must be an integer that is zero or less.  For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2).
  'periodicity': "'ANN'", // String | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.    
  'currency': USD // String | Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getSegmentActuals(ids, segmentType, metrics, opts).then(
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
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
 **segmentType** | **String**| Controls the type of segment selected.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment  | [default to &#39;BUS&#39;]
 **metrics** | [**[String]**](String.md)| Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |---|---| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|   &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |---|---| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds|  | 
 **relativeFiscalStart** | **Number**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0).  | [optional] 
 **relativeFiscalEnd** | **Number**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less.  For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2). | [optional] 
 **periodicity** | **String**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     | [optional] [default to &#39;ANN&#39;]
 **currency** | **String**| Currency code for adjusting the data. Use &#x60;ESTIMATE&#x60; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**SegmentActualsResponse**](SegmentActualsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSegmentActualsForList

> SegmentActualsResponse getSegmentActualsForList(segmentActualsRequest)

Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.

Returns FactSet Estimates Actuals data using rolling fiscal dates for company business and geographic segments. &lt;p&gt; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SegmentActualsApi } = require('@factset/sdk-factsetestimates');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new SegmentActualsApi();
const segmentActualsRequest = new factsetestimates.SegmentActualsRequest(); // SegmentActualsRequest | Request object for Estimate Data Items.

// Call api endpoint
apiInstance.getSegmentActualsForList(segmentActualsRequest).then(
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
 **segmentActualsRequest** | [**SegmentActualsRequest**](SegmentActualsRequest.md)| Request object for Estimate Data Items. | 

### Return type

[**SegmentActualsResponse**](SegmentActualsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

