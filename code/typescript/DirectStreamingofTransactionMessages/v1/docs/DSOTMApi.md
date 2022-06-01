# directstreamingoftransactionmessages.DSOTMApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendTransactions**](DSOTMApi.md#sendTransactions) | **POST** /analytics/dsotm/v1/transactions | Push transactions data into FactSet&#39;s systems.



## sendTransactions

> sendTransactions(opts)

Push transactions data into FactSet&#39;s systems.

This endpoint takes the transactions data and pushes them into FactSet&#39;s systems.

### Example

```javascript
const { ApiClient, DSOTMApi } = require('@factset/sdk-directstreamingoftransactionmessages');
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

const apiInstance = new DSOTMApi();
const opts = {
  'transactions': new directstreamingoftransactionmessages.Transactions() // Transactions | 
};

// Call api endpoint
apiInstance.sendTransactions(opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactions** | [**Transactions**](Transactions.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

