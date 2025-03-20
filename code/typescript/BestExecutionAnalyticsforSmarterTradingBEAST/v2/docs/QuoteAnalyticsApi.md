# bestexecutionanalyticsforsmartertradingbeast.QuoteAnalyticsApi

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQuoteInsideSize**](QuoteAnalyticsApi.md#getQuoteInsideSize) | **GET** /la/quote/inside-size | Get Quote Analytics



## getQuoteInsideSize

> QuoteInsideSizeResponseRoot getQuoteInsideSize(startDate, endDate, securityId, region)

Get Quote Analytics

Get quote inside-size analytics for a specific date range, security and region

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, QuoteAnalyticsApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new QuoteAnalyticsApi();
const startDate = 2024-07-29; // String | Search start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | Search end date in the format YYYY-MM-DD
const securityId = FDS; // String | ISIN for European securities, otherwise TICKER
const region = US; // String | The two character ISO country code of the trading region. EMEA is used for the European trading region

// Call api endpoint
apiInstance.getQuoteInsideSize(startDate, endDate, securityId, region).then(
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

[**QuoteInsideSizeResponseRoot**](QuoteInsideSizeResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

