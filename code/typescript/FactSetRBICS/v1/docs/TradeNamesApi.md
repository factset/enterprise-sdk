# factsetrbics.TradeNamesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTradeNamesForList**](TradeNamesApi.md#getTradeNamesForList) | **POST** /factset-rbics/v1/trade-names | Get a company&#39;s associated tradeNames and product lines.



## getTradeNamesForList

> TradeNamesResponse getTradeNamesForList(tradeNamesRequest)

Get a company&#39;s associated tradeNames and product lines.

RBICS with TradeNames maps over 260,000 products, services and brands (a.k.a. TradeNames) to the granular sectors of the FactSet Revere Business Industry Classification System taxonomy, resulting in a multi-sector participation map for each company.   Whereas RBICS with Revenue offers quantified multi-sector exposure based on a company’s segment disclosures, RBICS with TradeNames provides a comprehensive view of sector participation at the product level. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TradeNamesApi } = require('@factset/sdk-factsetrbics');
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

const apiInstance = new TradeNamesApi();
const tradeNamesRequest = new factsetrbics.TradeNamesRequest(); // TradeNamesRequest | Request Body to request a list of tradeName objects.

// Call api endpoint
apiInstance.getTradeNamesForList(tradeNamesRequest).then(
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
 **tradeNamesRequest** | [**TradeNamesRequest**](TradeNamesRequest.md)| Request Body to request a list of tradeName objects. | 

### Return type

[**TradeNamesResponse**](TradeNamesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

