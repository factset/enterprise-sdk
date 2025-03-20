# bestexecutionanalyticsforsmartertradingbeast.ZScoreApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZScoreQuotes**](ZScoreApi.md#getZScoreQuotes) | **GET** /la/zscore/quotes | Get Quote Z-Scores
[**getZScoreTrades**](ZScoreApi.md#getZScoreTrades) | **GET** /la/zscore/trades | Get Trade Z-Scores



## getZScoreQuotes

> ZScoreResponseRoot getZScoreQuotes(startDate, endDate, securityId, region)

Get Quote Z-Scores

Get quote z-scores for a specific date range, security and region. Z-Scores compare the value of the liquidity analytics for the  latest day in the specified date range with the mean and standard deviation from the historical period defined by the date range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ZScoreApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new ZScoreApi();
const startDate = 2024-07-29; // String | Search start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | Search end date in the format YYYY-MM-DD
const securityId = FDS; // String | ISIN for European securities, otherwise TICKER
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region

// Call api endpoint
apiInstance.getZScoreQuotes(startDate, endDate, securityId, region).then(
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
 **startDate** | **String**| Search start date in the format YYYY-MM-DD | 
 **endDate** | **String**| Search end date in the format YYYY-MM-DD | 
 **securityId** | **String**| ISIN for European securities, otherwise TICKER | 
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | 

### Return type

[**ZScoreResponseRoot**](ZScoreResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getZScoreTrades

> ZScoreResponseRoot getZScoreTrades(startDate, endDate, securityId, region)

Get Trade Z-Scores

Get trade z-scores for a specific date range, security and region. Z-Scores compare the value of the liquidity analytics for the  latest day in the specified date range with the mean and standard deviation from the historical period defined by the date range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ZScoreApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new ZScoreApi();
const startDate = 2024-07-29; // String | Search start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | Search end date in the format YYYY-MM-DD
const securityId = FDS; // String | ISIN for European securities, otherwise TICKER
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region

// Call api endpoint
apiInstance.getZScoreTrades(startDate, endDate, securityId, region).then(
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
 **startDate** | **String**| Search start date in the format YYYY-MM-DD | 
 **endDate** | **String**| Search end date in the format YYYY-MM-DD | 
 **securityId** | **String**| ISIN for European securities, otherwise TICKER | 
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | 

### Return type

[**ZScoreResponseRoot**](ZScoreResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

