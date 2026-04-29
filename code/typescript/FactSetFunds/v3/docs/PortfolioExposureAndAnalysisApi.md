# factsetfunds.PortfolioExposureAndAnalysisApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancialKeyItems**](PortfolioExposureAndAnalysisApi.md#getFinancialKeyItems) | **GET** /financials/key-items | Get Financial Key Items for Funds
[**getFinancialKeyItemsForList**](PortfolioExposureAndAnalysisApi.md#getFinancialKeyItemsForList) | **POST** /financials/key-items | Get Financial Key Items for Funds
[**getPortfolioAnalytics**](PortfolioExposureAndAnalysisApi.md#getPortfolioAnalytics) | **GET** /portfolio/analytics | Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details
[**getPortfolioAnalyticsForList**](PortfolioExposureAndAnalysisApi.md#getPortfolioAnalyticsForList) | **POST** /portfolio/analytics | Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details
[**getPortfolioStatistics**](PortfolioExposureAndAnalysisApi.md#getPortfolioStatistics) | **GET** /portfolio/statistics | Get Portfolio Statistics for Funds
[**getPortfolioStatisticsForList**](PortfolioExposureAndAnalysisApi.md#getPortfolioStatisticsForList) | **POST** /portfolio/statistics | Get Portfolio Statistics for Funds
[**getRiskAnalytics**](PortfolioExposureAndAnalysisApi.md#getRiskAnalytics) | **GET** /risk-analytics | Get Credit Risk and Rate Risk Analytics
[**getRiskAnalyticsForList**](PortfolioExposureAndAnalysisApi.md#getRiskAnalyticsForList) | **POST** /risk-analytics | Get Credit Risk and Rate Risk Analytics.
[**getTop10Holdings**](PortfolioExposureAndAnalysisApi.md#getTop10Holdings) | **GET** /holdings/top-10 | Get Top 10 Holdings
[**getTop10HoldingsForList**](PortfolioExposureAndAnalysisApi.md#getTop10HoldingsForList) | **POST** /holdings/top-10 | Get Top 10 Holdings



## getFinancialKeyItems

> FinancialsKeyItemsResponse getFinancialKeyItems(ids, opts)

Get Financial Key Items for Funds

Get Last Twelve Months (LTM) Financial Key Items for Funds which provides access to industry-specific operating measures. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'keyItemsType': new factsetfunds.KeyItemsType() // KeyItemsType | The Key Items type report.
};

// Call api endpoint
apiInstance.getFinancialKeyItems(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **keyItemsType** | [**KeyItemsType**](.md)| The Key Items type report. | [optional] 

### Return type

[**FinancialsKeyItemsResponse**](FinancialsKeyItemsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFinancialKeyItemsForList

> FinancialsKeyItemsResponse getFinancialKeyItemsForList(financialsKeyItemsRequest)

Get Financial Key Items for Funds

Get Financial Key Items for Funds which provides access to industry-specific operating measures. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const financialsKeyItemsRequest = new factsetfunds.FinancialsKeyItemsRequest(); // FinancialsKeyItemsRequest | 

// Call api endpoint
apiInstance.getFinancialKeyItemsForList(financialsKeyItemsRequest).then(
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
 **financialsKeyItemsRequest** | [**FinancialsKeyItemsRequest**](FinancialsKeyItemsRequest.md)|  | 

### Return type

[**FinancialsKeyItemsResponse**](FinancialsKeyItemsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getPortfolioAnalytics

> PortfolioAnalyticsResponse getPortfolioAnalytics(ids, opts)

Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details

Returns Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details data based on the &#x60;analyticsType&#x60; parameter. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'analyticsType': new factsetfunds.AnalyticsType() // AnalyticsType | Type of portfolio analytics data items to be returned.  * **ASSETALLOCATION**: Returns the asset types weights in the fund's portfolio. * **SECTOR_WEIGHTAGE**: Returns the weighted average percent of revenue derived from multiple industries for a universe of companies. Data is available for L1(Economy) level of the RBICS Classification. For more details, visit [Online Assistant Page   #20710](https://oa.apps.factset.com/pages/20710) * **GEOGRAPHIC_REVENUE**: Returns an aggregated percent of revenue derived based on super region for a universe of companies. For more details, visit [Online Assistant Page   #17555](https://oa.apps.factset.com/pages/17555) * **MARKET_CAPITALIZATION**: Returns the percentage of the aggregate that is composed of large-cap, mid-cap, small-cap and micro-cap holdings 
};

// Call api endpoint
apiInstance.getPortfolioAnalytics(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **analyticsType** | [**AnalyticsType**](.md)| Type of portfolio analytics data items to be returned.  * **ASSETALLOCATION**: Returns the asset types weights in the fund&#39;s portfolio. * **SECTOR_WEIGHTAGE**: Returns the weighted average percent of revenue derived from multiple industries for a universe of companies. Data is available for L1(Economy) level of the RBICS Classification. For more details, visit [Online Assistant Page   #20710](https://oa.apps.factset.com/pages/20710) * **GEOGRAPHIC_REVENUE**: Returns an aggregated percent of revenue derived based on super region for a universe of companies. For more details, visit [Online Assistant Page   #17555](https://oa.apps.factset.com/pages/17555) * **MARKET_CAPITALIZATION**: Returns the percentage of the aggregate that is composed of large-cap, mid-cap, small-cap and micro-cap holdings  | [optional] 

### Return type

[**PortfolioAnalyticsResponse**](PortfolioAnalyticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPortfolioAnalyticsForList

> PortfolioAnalyticsResponse getPortfolioAnalyticsForList(portfolioAnalyticsRequest)

Get Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details

Returns Asset Allocation, Sector Weightage, Geographic Revenue and Market Capitalization details data based on the &#x60;analyticsType&#x60; parameter data for a large list of IDs. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const portfolioAnalyticsRequest = new factsetfunds.PortfolioAnalyticsRequest(); // PortfolioAnalyticsRequest | 

// Call api endpoint
apiInstance.getPortfolioAnalyticsForList(portfolioAnalyticsRequest).then(
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
 **portfolioAnalyticsRequest** | [**PortfolioAnalyticsRequest**](PortfolioAnalyticsRequest.md)|  | 

### Return type

[**PortfolioAnalyticsResponse**](PortfolioAnalyticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getPortfolioStatistics

> PortfolioStatisticsResponse getPortfolioStatistics(ids, opts)

Get Portfolio Statistics for Funds

Fetch Last Twelve Months (LTM) Portfolio Statistics for the Funds. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2025-01-01, // Date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
  'endDate': 2025-12-31, // Date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
  'frequency': M, // Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'paginationLimit': 100, // Number | The maximum number of records to return. The default is 20.
  'paginationOffset': 0 // Number | The number of records to skip before the first record to return. The default is 0.
};

// Call api endpoint
apiInstance.getPortfolioStatistics(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **Date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional] 
 **frequency** | [**Frequency**](.md)| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] 
 **paginationLimit** | **Number**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Number**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**PortfolioStatisticsResponse**](PortfolioStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPortfolioStatisticsForList

> PortfolioStatisticsResponse getPortfolioStatisticsForList(portfolioStatisticsRequest)

Get Portfolio Statistics for Funds

Fetch Portfolio Statistics for the Funds. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const portfolioStatisticsRequest = new factsetfunds.PortfolioStatisticsRequest(); // PortfolioStatisticsRequest | Portfolio Statistics request body.

// Call api endpoint
apiInstance.getPortfolioStatisticsForList(portfolioStatisticsRequest).then(
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
 **portfolioStatisticsRequest** | [**PortfolioStatisticsRequest**](PortfolioStatisticsRequest.md)| Portfolio Statistics request body. | 

### Return type

[**PortfolioStatisticsResponse**](PortfolioStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getRiskAnalytics

> RiskAnalyticsResponse getRiskAnalytics(ids, opts)

Get Credit Risk and Rate Risk Analytics

Returns credit risk or rate risk analytics based on the &#x60;riskType&#x60; parameter.This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'startDate': 2025-01-01, // Date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint.
  'endDate': 2025-12-31, // Date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint
  'frequency': M, // Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year. 
  'currency': USD, // String | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)
  'riskType': new factsetfunds.RiskType(), // RiskType | Type of risk analytics to return.
  'paginationLimit': 100, // Number | The maximum number of records to return. The default is 20.
  'paginationOffset': 0 // Number | The number of records to skip before the first record to return. The default is 0.
};

// Call api endpoint
apiInstance.getRiskAnalytics(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **Date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **endDate** | **Date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional] 
 **frequency** | [**Frequency**](.md)| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] 
 **currency** | **String**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] [default to &#39;USD&#39;]
 **riskType** | [**RiskType**](.md)| Type of risk analytics to return. | [optional] 
 **paginationLimit** | **Number**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **Number**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type

[**RiskAnalyticsResponse**](RiskAnalyticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRiskAnalyticsForList

> RiskAnalyticsResponse getRiskAnalyticsForList(riskAnalyticsRequest)

Get Credit Risk and Rate Risk Analytics.

Returns credit risk or rate risk analytics for a large list of IDs based on the &#x60;riskType&#x60; parameter. This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const riskAnalyticsRequest = new factsetfunds.RiskAnalyticsRequest(); // RiskAnalyticsRequest | 

// Call api endpoint
apiInstance.getRiskAnalyticsForList(riskAnalyticsRequest).then(
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
 **riskAnalyticsRequest** | [**RiskAnalyticsRequest**](RiskAnalyticsRequest.md)|  | 

### Return type

[**RiskAnalyticsResponse**](RiskAnalyticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getTop10Holdings

> TopHoldingsResponse getTop10Holdings(ids)

Get Top 10 Holdings

Returns the top 10 holdings for the requested fund or ETF.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*

// Call api endpoint
apiInstance.getTop10Holdings(ids).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 

### Return type

[**TopHoldingsResponse**](TopHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTop10HoldingsForList

> TopHoldingsResponse getTop10HoldingsForList(topHoldingsRequest)

Get Top 10 Holdings

Returns the top 10 holdings for a list of funds or ETFs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PortfolioExposureAndAnalysisApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new PortfolioExposureAndAnalysisApi();
const topHoldingsRequest = new factsetfunds.TopHoldingsRequest(); // TopHoldingsRequest | 

// Call api endpoint
apiInstance.getTop10HoldingsForList(topHoldingsRequest).then(
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
 **topHoldingsRequest** | [**TopHoldingsRequest**](TopHoldingsRequest.md)|  | 

### Return type

[**TopHoldingsResponse**](TopHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

