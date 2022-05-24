# factsetfundamentalsreportbuilder.FinancialsApi

All URIs are relative to *https://api.factset.com/report/financials/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancialsBalanceSheet**](FinancialsApi.md#getFinancialsBalanceSheet) | **GET** /balance-sheet | Balance Sheet
[**getFinancialsCashFlow**](FinancialsApi.md#getFinancialsCashFlow) | **GET** /cash-flow | Cash Flow
[**getFinancialsIncomeStatement**](FinancialsApi.md#getFinancialsIncomeStatement) | **GET** /income-statement | Income Statement



## getFinancialsBalanceSheet

> Response getFinancialsBalanceSheet(id, opts)

Balance Sheet

Returns a standardized Balance Sheet based on industry.

### Example

```javascript
const { ApiClient, FinancialsApi } = require('@factset/sdk-factsetfundamentalsreportbuilder');
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

const apiInstance = new FinancialsApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'INTERIM'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'", // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
  'reportStatus': "'RESTATED'", // String | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.  
  'currency': "'LOCAL'" // String | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
};

// Call api endpoint
apiInstance.getFinancialsBalanceSheet(id, opts).then(
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
 **id** | **String**| Company Ticker | 
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;INTERIM&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]
 **reportStatus** | **String**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to &#39;RESTATED&#39;]
 **currency** | **String**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFinancialsCashFlow

> Response getFinancialsCashFlow(id, opts)

Cash Flow

Returns a standardized Cash Flow based on industry.

### Example

```javascript
const { ApiClient, FinancialsApi } = require('@factset/sdk-factsetfundamentalsreportbuilder');
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

const apiInstance = new FinancialsApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'INTERIM'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'", // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
  'reportStatus': "'RESTATED'", // String | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.  
  'currency': "'LOCAL'" // String | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
};

// Call api endpoint
apiInstance.getFinancialsCashFlow(id, opts).then(
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
 **id** | **String**| Company Ticker | 
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;INTERIM&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]
 **reportStatus** | **String**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to &#39;RESTATED&#39;]
 **currency** | **String**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFinancialsIncomeStatement

> Response getFinancialsIncomeStatement(id, opts)

Income Statement

Returns a standardized Income Statement based on industry.

### Example

```javascript
const { ApiClient, FinancialsApi } = require('@factset/sdk-factsetfundamentalsreportbuilder');
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

const apiInstance = new FinancialsApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'INTERIM'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'", // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
  'reportStatus': "'RESTATED'", // String | Return historical periods as originally reported or retroactively restated (for M&A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.  
  'currency': "'LOCAL'" // String | Currency code for currency values. \"LOCAL\" will return the security's pricing currency. \"RPT\" will return the company's reporting currency (which may differ from \"LOCAL\" for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
};

// Call api endpoint
apiInstance.getFinancialsIncomeStatement(id, opts).then(
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
 **id** | **String**| Company Ticker | 
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;INTERIM&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]
 **reportStatus** | **String**| Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events). The following are descriptions for the accepted values: - RESTATED - retroactively restated data. - NON-RESTATED - originally reported data.   | [optional] [default to &#39;RESTATED&#39;]
 **currency** | **String**| Currency code for currency values. \&quot;LOCAL\&quot; will return the security&#39;s pricing currency. \&quot;RPT\&quot; will return the company&#39;s reporting currency (which may differ from \&quot;LOCAL\&quot; for some companies). For a list of other currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

