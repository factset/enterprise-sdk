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

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

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

