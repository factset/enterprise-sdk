# factsetfundamentals.MetricsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFdsFundamentalsMetrics**](MetricsApi.md#getFdsFundamentalsMetrics) | **GET** /metrics | Returns available FactSet Fundamental metrics and ratios.



## getFdsFundamentalsMetrics

> MetricsResponse getFdsFundamentalsMetrics(opts)

Returns available FactSet Fundamental metrics and ratios.

Returns list of available FF_* metrics that can be used in the &#x60;metrics&#x60; parameter of related endpoints. These are related to FactSet Fundamentals standardized data. As Reported will be available in future endpoints. Leave Category and Subcategory blank to request all available items. The Endpoint Data model is optimized for time-series data with periodicity. Some items in this list are non-time series. **For methodology definitions, reference the &#x60;OApageID&#x60; or &#x60;OAurl&#x60; response items to launch the available methodology page.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MetricsApi } = require('@factset/sdk-factsetfundamentals');
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

const apiInstance = new MetricsApi();
const opts = {
  'category': INCOME_STATEMENT, // String | Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** = Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** = Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** = Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** = Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** = Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** = Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** = Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** = General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing-related market data.*   * **MISCELLANEOUS** = Corporation Data, Financial Records details, Indicators.   * **DATES** = Relevant Dates 
  'subcategory': INCOME_STATEMENT, // String | Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, EXPENSES, OPERATING_COST, NON-RECURRING_ITEMS, REVENUES, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL, FINANCING_ACTIVITIES, OPERATING_ACTIVITIES, INVESTING_ACTIVITIES   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES 
  'metricDataType': integer // String | Returns general data type of the metrics like integer, float or strings, when left blankmetrics with all data types would be returned 
};

// Call api endpoint
apiInstance.getFdsFundamentalsMetrics(opts).then(
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
 **category** | **String**| Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** &#x3D; Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** &#x3D; Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** &#x3D; Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** &#x3D; Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** &#x3D; Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** &#x3D; Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** &#x3D; Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** &#x3D; General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing-related market data.*   * **MISCELLANEOUS** &#x3D; Corporation Data, Financial Records details, Indicators.   * **DATES** &#x3D; Relevant Dates  | [optional] 
 **subcategory** | **String**| Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, EXPENSES, OPERATING_COST, NON-RECURRING_ITEMS, REVENUES, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL, FINANCING_ACTIVITIES, OPERATING_ACTIVITIES, INVESTING_ACTIVITIES   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES  | [optional] 
 **metricDataType** | **String**| Returns general data type of the metrics like integer, float or strings, when left blankmetrics with all data types would be returned  | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

