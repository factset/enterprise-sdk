# factsetbanks.DepositRatesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRates**](DepositRatesApi.md#getRates) | **POST** /deposit-rates | Returns deposit rates



## getRates

> RatesResponse getRates(ratesRequest)

Returns deposit rates

Returns current and historical deposit rates from US banks and credit unions — APY, previous APY, national APY averages, terms, and minimum balances — across CD, Savings, Interest Checking, Money Market, Fixed IRA, and Variable IRA products. Identifies where banks offer better rates than geographic competitors.  Covers 500+ financial institutions (US banks, credit unions, internet banks); 40+ data items. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DepositRatesApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new DepositRatesApi();
const ratesRequest = new factsetbanks.RatesRequest(); // RatesRequest | 

// Call api endpoint
apiInstance.getRates(ratesRequest).then(
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
 **ratesRequest** | [**RatesRequest**](RatesRequest.md)|  | 

### Return type

[**RatesResponse**](RatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

