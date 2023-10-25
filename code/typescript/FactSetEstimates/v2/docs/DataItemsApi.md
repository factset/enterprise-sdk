# factsetestimates.DataItemsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEstimateMetrics**](DataItemsApi.md#getEstimateMetrics) | **GET** /factset-estimates/v2/metrics | Available Estimate metrics
[**getEstimateMetricsForList**](DataItemsApi.md#getEstimateMetricsForList) | **POST** /factset-estimates/v2/metrics | Available Estimate metrics or ratios.



## getEstimateMetrics

> MetricsResponse getEstimateMetrics(opts)

Available Estimate metrics

Returns list of available Estimate metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. **By default, Factset provides Estimated items in millions. For specific metric methodology definitions, reference the &#x60;OAurl&#x60; response items to launch the available methodology page.**  

### Example

```javascript
const { ApiClient, DataItemsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new DataItemsApi();
const opts = {
  'category': "category_example", // String | Filters the list of Estimate metrics by major category -   * **FINANCIAL_STATEMENT** = Includes Balance Sheet, Cash Flow, and Income Statement.   * **INDUSTRY_METRICS** = Industry specific metrics.   * **OTHER** = Target Price 
  'subcategory': "subcategory_example" // String | Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested. For methodology, visit [OA 16038](https://my.apps.factset.com/oa/pages/16038) <p>Financial Statement -    * **BALANCE_SHEET** - Balance Sheet line items, such as Assets, Long-term Debt, and more.   * **CASH_FLOW** - Cash Flow Statement line items, such as Free Cash Flow and Share Repurchases   * **INCOME_STATEMENT** - Income Statement line items, such as EPS, Sales, DPS, and more.   * **MISCELLANEOUS** - EPS Long Term Growth </p> <p> Industry Metrics -     * **AIRLINES** - Including items such as Revenue Passenger, Total Revenue per ASK, Available Seats, and more.   * **BANKS** - Including items such as Net Interest Income, Trading Income, Net Loans, and more. SUPPLEMENTAL   * **COMMODITIES** - Including items such as Average Target Price.   * **COMPUTER_HARDWARE** - Including items such as Total Addressable Market.   * **CONSUMER_SERVICES** - Including items such as Gross Merchandise Volume   * **EDUCATION** - Including Items such as Total Student Enrollment   * **FINANCIAL_SERVICE_PROVIDER** - Including items such as Annual Subscription Value   * **HOME_BUILDERS** - Including items such as Home Sales, Land Sales, Cancellation Rates, and more.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **MARIJUANA** - Including items such as Cost per Gram and Kg of Cannabis Sold.   * **MINING** - Including items such as Realized Price and Total Production   * **MULTIFINANCIAL** - Including items such as AUM, Net Flows, and Fee Related Earnings.   * **OIL_AND_GAS** - Including items such as Downstream Income, Production per Day, and Exploration Expense.   * **OTHER** - Target Price   * **REITS** - Including items such as Funds from Operations, Implied Cap Rate, and LTV.   * **RESTAURANTS** - Including items such as Restaurant Margin.   * **RETAILERS** - Including items such as Stores Information, Selling Space and Net sales per square foot.   * **TELECOMMUNICATIONS** - Including items such as Gross Adds, Monthly Revenue Per User, Churn, and more.   * **TRANSPORTATION** - Including items such as Revenue Per Unit, Volume Growth, and Operating Ratio.</p>    
};

// Call api endpoint
apiInstance.getEstimateMetrics(opts).then(
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
 **category** | **String**| Filters the list of Estimate metrics by major category -   * **FINANCIAL_STATEMENT** &#x3D; Includes Balance Sheet, Cash Flow, and Income Statement.   * **INDUSTRY_METRICS** &#x3D; Industry specific metrics.   * **OTHER** &#x3D; Target Price  | [optional] 
 **subcategory** | **String**| Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested. For methodology, visit [OA 16038](https://my.apps.factset.com/oa/pages/16038) &lt;p&gt;Financial Statement -    * **BALANCE_SHEET** - Balance Sheet line items, such as Assets, Long-term Debt, and more.   * **CASH_FLOW** - Cash Flow Statement line items, such as Free Cash Flow and Share Repurchases   * **INCOME_STATEMENT** - Income Statement line items, such as EPS, Sales, DPS, and more.   * **MISCELLANEOUS** - EPS Long Term Growth &lt;/p&gt; &lt;p&gt; Industry Metrics -     * **AIRLINES** - Including items such as Revenue Passenger, Total Revenue per ASK, Available Seats, and more.   * **BANKS** - Including items such as Net Interest Income, Trading Income, Net Loans, and more. SUPPLEMENTAL   * **COMMODITIES** - Including items such as Average Target Price.   * **COMPUTER_HARDWARE** - Including items such as Total Addressable Market.   * **CONSUMER_SERVICES** - Including items such as Gross Merchandise Volume   * **EDUCATION** - Including Items such as Total Student Enrollment   * **FINANCIAL_SERVICE_PROVIDER** - Including items such as Annual Subscription Value   * **HOME_BUILDERS** - Including items such as Home Sales, Land Sales, Cancellation Rates, and more.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **HOSPITALS** - Including items such as Bad Debt Provisions, Medical Cost Ratio, SS Admissions and more.   * **HOTELS** - Including items such as Average Daily Rate, Occupancy %, RevPAR, and more.   * **INSURANCE** - Including items such as Gross Premiums Written, Underwriting Income, and Claims.   * **MARIJUANA** - Including items such as Cost per Gram and Kg of Cannabis Sold.   * **MINING** - Including items such as Realized Price and Total Production   * **MULTIFINANCIAL** - Including items such as AUM, Net Flows, and Fee Related Earnings.   * **OIL_AND_GAS** - Including items such as Downstream Income, Production per Day, and Exploration Expense.   * **OTHER** - Target Price   * **REITS** - Including items such as Funds from Operations, Implied Cap Rate, and LTV.   * **RESTAURANTS** - Including items such as Restaurant Margin.   * **RETAILERS** - Including items such as Stores Information, Selling Space and Net sales per square foot.   * **TELECOMMUNICATIONS** - Including items such as Gross Adds, Monthly Revenue Per User, Churn, and more.   * **TRANSPORTATION** - Including items such as Revenue Per Unit, Volume Growth, and Operating Ratio.&lt;/p&gt;     | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimateMetricsForList

> MetricsResponse getEstimateMetricsForList(metricsRequest)

Available Estimate metrics or ratios.

Returns list of available Estimate metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. **By default, Factset provides Estimated items in millions. For specific metric methodology definitions, reference the &#x60;OAurl&#x60; response items to launch the available methodology page.**  

### Example

```javascript
const { ApiClient, DataItemsApi } = require('@factset/sdk-factsetestimates');
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

const apiInstance = new DataItemsApi();
const metricsRequest = new factsetestimates.MetricsRequest(); // MetricsRequest | Request object for requesting estimates data

// Call api endpoint
apiInstance.getEstimateMetricsForList(metricsRequest).then(
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
 **metricsRequest** | [**MetricsRequest**](MetricsRequest.md)| Request object for requesting estimates data | 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

