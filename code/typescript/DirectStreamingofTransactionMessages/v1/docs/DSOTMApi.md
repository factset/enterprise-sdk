# directstreamingoftransactionmessages.DSOTMApi

All URIs are relative to *https://api.factset.com/analytics/dsotm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendTransactions**](DSOTMApi.md#sendTransactions) | **POST** /transactions | Push transactions data into FactSet.



## sendTransactions

> sendTransactions(opts)

Push transactions data into FactSet.

This endpoint takes the transactions data and pushes them into FactSet.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DSOTMApi } = require('@factset/sdk-directstreamingoftransactionmessages');
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
- **Accept**: application/json

