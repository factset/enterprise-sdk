# factsetportfoliooptimizer.StrategyDocumentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFPOStrategyDocuments**](StrategyDocumentsApi.md#getFPOStrategyDocuments) | **GET** /analytics/engines/fpo/v3/strategies/{path} | Get FactSet Portfolio Optimizer strategy documents and sub-directories in a directory



## getFPOStrategyDocuments

> DocumentDirectoriesRoot getFPOStrategyDocuments(path)

Get FactSet Portfolio Optimizer strategy documents and sub-directories in a directory

This endpoint looks up all FactSet Portfolio Optimizer strategy documents and sub-directories in a given directory.

### Example

```javascript
const { ApiClient, StrategyDocumentsApi } = require('@factset/sdk-factsetportfoliooptimizer');
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

const apiInstance = new StrategyDocumentsApi();
const path = "'Client:folder1/folder2'"; // String | The directory to get the strategy documents and sub-directories in

// Call api endpoint
apiInstance.getFPOStrategyDocuments(path).then(
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
 **path** | **String**| The directory to get the strategy documents and sub-directories in | [default to &#39;Client:folder1/folder2&#39;]

### Return type

[**DocumentDirectoriesRoot**](DocumentDirectoriesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

