# factsetestimatesreportbuilder.AllEstimatesApi

All URIs are relative to *https://api.factset.com/report/estimates/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEstimatesBalanceSheet**](AllEstimatesApi.md#getEstimatesBalanceSheet) | **GET** /balance-sheet | Balance Sheet
[**getEstimatesCashFlow**](AllEstimatesApi.md#getEstimatesCashFlow) | **GET** /cash-flow | Cash Flow
[**getEstimatesGeographicSegments**](AllEstimatesApi.md#getEstimatesGeographicSegments) | **GET** /geographic-segments | Geographic Segments
[**getEstimatesIncomeStatement**](AllEstimatesApi.md#getEstimatesIncomeStatement) | **GET** /income-statement | Income Statement
[**getEstimatesIndustryMetrics**](AllEstimatesApi.md#getEstimatesIndustryMetrics) | **GET** /industry-metrics | Industry Metrics
[**getEstimatesPerShare**](AllEstimatesApi.md#getEstimatesPerShare) | **GET** /per-share | Per Share
[**getEstimatesProductSegments**](AllEstimatesApi.md#getEstimatesProductSegments) | **GET** /product-segments | Product Segments
[**getEstimatesValuation**](AllEstimatesApi.md#getEstimatesValuation) | **GET** /valuation | Valuation



## getEstimatesBalanceSheet

> Response getEstimatesBalanceSheet(id, opts)

Balance Sheet

Returns historical and future period broker estimate consensus in a statement format for Balance Sheet line items.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesBalanceSheet(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesCashFlow

> Response getEstimatesCashFlow(id, opts)

Cash Flow

Returns historical and future period broker estimate consensus in a statement format for Cash Flow line items.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesCashFlow(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesGeographicSegments

> Response getEstimatesGeographicSegments(id, opts)

Geographic Segments

Returns historical and future period broker estimate consensus in a statement format for line items broken down geographically.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesGeographicSegments(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesIncomeStatement

> Response getEstimatesIncomeStatement(id, opts)

Income Statement

Returns historical and future period broker estimate consensus in a statement format for Income Statement line items.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesIncomeStatement(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesIndustryMetrics

> Response getEstimatesIndustryMetrics(id, opts)

Industry Metrics

Returns historical and future period broker estimate consensus in a statement format for industry-specific metrics.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesIndustryMetrics(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesPerShare

> Response getEstimatesPerShare(id, opts)

Per Share

Returns historical and future period broker estimate consensus in a statement format for Per Share line items.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesPerShare(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesProductSegments

> Response getEstimatesProductSegments(id, opts)

Product Segments

Returns historical and future period broker estimate consensus in a statement format for line items broken down by product and business.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesProductSegments(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEstimatesValuation

> Response getEstimatesValuation(id, opts)

Valuation

Returns valuation ratios in a statement format calculated from historical and future period broker estimate consensus.

### Example

```javascript
const { ApiClient, AllEstimatesApi } = require('@factset/sdk-factsetestimatesreportbuilder');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new AllEstimatesApi();
const id = FDS; // String | Company Ticker
const opts = {
  'periodicity': "'ANN'", // String | Periodicity or frequency of the fiscal periods.
  'schema': "'table_parent_child_columns'" // String | The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns 
};

// Call api endpoint
apiInstance.getEstimatesValuation(id, opts).then(
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
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. | [optional] [default to &#39;ANN&#39;]
 **schema** | **String**| The schema that the data is returned as. The following are descriptions for the accepted values: - table_group_level - STACH 2.0 row organized package format with parent-child relationships represented using STACH group level cell metadata - table_parent_child_columns - STACH 2.0 row organized package format with parent-child relationships represented using STACH parent-child columns  | [optional] [default to &#39;table_parent_child_columns&#39;]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

