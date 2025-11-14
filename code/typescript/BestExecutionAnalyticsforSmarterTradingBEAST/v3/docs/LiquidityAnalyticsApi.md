# bestexecutionanalyticsforsmartertradingbeast.LiquidityAnalyticsApi

All URIs are relative to *https://api.factset.com/analytics/beast/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLiquidityAnalytics**](LiquidityAnalyticsApi.md#getLiquidityAnalytics) | **GET** /tca/liquidity/liquidity-analytics | Get Liquidity Analytics
[**getLiquidityQuotes**](LiquidityAnalyticsApi.md#getLiquidityQuotes) | **GET** /tca/liquidity/quotes | Get Liquidity Quotes
[**getLiquidityTrades**](LiquidityAnalyticsApi.md#getLiquidityTrades) | **GET** /tca/liquidity/trades | Get Liquidity Trades
[**getLiquidityVolumeAnalytics**](LiquidityAnalyticsApi.md#getLiquidityVolumeAnalytics) | **GET** /tca/liquidity/volume-analytics | Get Liquidity Volume Analytics



## getLiquidityAnalytics

> LiquidityAnalyticsResponseRoot getLiquidityAnalytics(securityIds, startDate, endDate)

Get Liquidity Analytics

Get Liquidity Analytics

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, LiquidityAnalyticsApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new LiquidityAnalyticsApi();
const securityIds = ["FDS-US","AAPL-US","MX-CA"]; // [String] | ISIN for European securities, otherwise TICKER
const startDate = 2024-08-21; // Date | Date in the format YYYY-MM-DD
const endDate = 2024-08-29; // Date | Date in the format YYYY-MM-DD

// Call api endpoint
apiInstance.getLiquidityAnalytics(securityIds, startDate, endDate).then(
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
 **securityIds** | [**[String]**](String.md)| ISIN for European securities, otherwise TICKER | 
 **startDate** | **Date**| Date in the format YYYY-MM-DD | 
 **endDate** | **Date**| Date in the format YYYY-MM-DD | 

### Return type

[**LiquidityAnalyticsResponseRoot**](LiquidityAnalyticsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLiquidityQuotes

> QuotesAnalyticsResponseRoot getLiquidityQuotes(securityIds, startDate, endDate)

Get Liquidity Quotes

Get Liquidity Quotes

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, LiquidityAnalyticsApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new LiquidityAnalyticsApi();
const securityIds = ["FDS-US","AAPL-US","MX-CA"]; // [String] | ISIN for European securities, otherwise TICKER
const startDate = 2024-08-21; // Date | Date in the format YYYY-MM-DD
const endDate = 2024-08-29; // Date | Date in the format YYYY-MM-DD

// Call api endpoint
apiInstance.getLiquidityQuotes(securityIds, startDate, endDate).then(
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
 **securityIds** | [**[String]**](String.md)| ISIN for European securities, otherwise TICKER | 
 **startDate** | **Date**| Date in the format YYYY-MM-DD | 
 **endDate** | **Date**| Date in the format YYYY-MM-DD | 

### Return type

[**QuotesAnalyticsResponseRoot**](QuotesAnalyticsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLiquidityTrades

> TradesAnalyticsResponseRoot getLiquidityTrades(securityIds, startDate, endDate)

Get Liquidity Trades

Get Liquidity Trades

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, LiquidityAnalyticsApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new LiquidityAnalyticsApi();
const securityIds = ["FDS-US","AAPL-US","MX-CA"]; // [String] | ISIN for European securities, otherwise TICKER
const startDate = 2024-08-21; // Date | Date in the format YYYY-MM-DD
const endDate = 2024-08-29; // Date | Date in the format YYYY-MM-DD

// Call api endpoint
apiInstance.getLiquidityTrades(securityIds, startDate, endDate).then(
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
 **securityIds** | [**[String]**](String.md)| ISIN for European securities, otherwise TICKER | 
 **startDate** | **Date**| Date in the format YYYY-MM-DD | 
 **endDate** | **Date**| Date in the format YYYY-MM-DD | 

### Return type

[**TradesAnalyticsResponseRoot**](TradesAnalyticsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLiquidityVolumeAnalytics

> VolumeAnalyticsResponseRootV3 getLiquidityVolumeAnalytics(securityIds, startDate, endDate)

Get Liquidity Volume Analytics

Get Liquidity Volume Analytics

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, LiquidityAnalyticsApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new LiquidityAnalyticsApi();
const securityIds = ["FDS-US","AAPL-US","MX-CA"]; // [String] | ISIN for European securities, otherwise TICKER
const startDate = 2024-08-21; // Date | Date in the format YYYY-MM-DD
const endDate = 2024-08-29; // Date | Date in the format YYYY-MM-DD

// Call api endpoint
apiInstance.getLiquidityVolumeAnalytics(securityIds, startDate, endDate).then(
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
 **securityIds** | [**[String]**](String.md)| ISIN for European securities, otherwise TICKER | 
 **startDate** | **Date**| Date in the format YYYY-MM-DD | 
 **endDate** | **Date**| Date in the format YYYY-MM-DD | 

### Return type

[**VolumeAnalyticsResponseRootV3**](VolumeAnalyticsResponseRootV3.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

