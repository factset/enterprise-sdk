# securityintelligence.StockMovementSummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStockMovementSummary**](StockMovementSummaryApi.md#getStockMovementSummary) | **GET** /company/stock-movement-summary | Get Stock Movement Summary



## getStockMovementSummary

> StockMovementResponse getStockMovementSummary(identifier, opts)

Get Stock Movement Summary

Returns the stock price movement over the last trading period or intraday, and aims to explain that movement using StreetAccount news over the last two trading days.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, StockMovementSummaryApi } = require('@factset/sdk-securityintelligence');
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

const apiInstance = new StockMovementSummaryApi();
const identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
const opts = {
  'outputType': "'default'" // String | Type of output to return. default for full summary and oneline for one-line summary.
};

// Call api endpoint
apiInstance.getStockMovementSummary(identifier, opts).then(
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company | 
 **outputType** | **String**| Type of output to return. default for full summary and oneline for one-line summary. | [optional] [default to &#39;default&#39;]

### Return type

[**StockMovementResponse**](StockMovementResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

