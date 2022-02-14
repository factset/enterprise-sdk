# procuretopayprovisioning.OrderStatusApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionStatusGet**](OrderStatusApi.md#transactionStatusGet) | **GET** /transactionStatus | Check status of order by transactionCode



## transactionStatusGet

> TransactionStatus transactionStatusGet(transactioncode)

Check status of order by transactionCode

### Example

```javascript
const { ApiClient, OrderStatusApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new OrderStatusApi();
const transactioncode = 7B27AA857B664F18AB4886A08A9A3D9C; // String | Transaction Code to query

// Call api endpoint
apiInstance.transactionStatusGet(transactioncode).then(
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
 **transactioncode** | **String**| Transaction Code to query | 

### Return type

[**TransactionStatus**](TransactionStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

