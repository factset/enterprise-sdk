# exchangedatafeeddatamodel.ExchangeInformationApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchanges**](ExchangeInformationApi.md#getExchanges) | **GET** /exchanges | Request metadata for covered Real-Time market data venues at FactSet.



## getExchanges

> ExchangesResponse getExchanges(opts)

Request metadata for covered Real-Time market data venues at FactSet.

Returns a list of exchanges with details like exchange code, name, market open and close times, etc.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExchangeInformationApi } = require('@factset/sdk-exchangedatafeeddatamodel');
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

const apiInstance = new ExchangeInformationApi();
const opts = {
  'productCode': [9001,10001,10010], // [Number] | Allows filtering of specific product codes in the response.
  'exchangeCode': [14034,36,25], // [Number] | Allows filtering of specific exchange codes in the response.
  'isoCode': ["USA","LON","PAR"], // [String] | Allows filtering on specific ISO code in the response.
  'format': json // String | The format of the output file.
};

// Call api endpoint
apiInstance.getExchanges(opts).then(
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
 **productCode** | [**[Number]**](Number.md)| Allows filtering of specific product codes in the response. | [optional] 
 **exchangeCode** | [**[Number]**](Number.md)| Allows filtering of specific exchange codes in the response. | [optional] 
 **isoCode** | [**[String]**](String.md)| Allows filtering on specific ISO code in the response. | [optional] 
 **format** | **String**| The format of the output file. | [optional] 

### Return type

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

