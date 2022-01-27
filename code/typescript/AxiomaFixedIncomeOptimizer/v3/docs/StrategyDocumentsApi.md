# axiomafixedincomeoptimizer.StrategyDocumentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAxiomaFIStrategyDocuments**](StrategyDocumentsApi.md#getAxiomaFIStrategyDocuments) | **GET** /analytics/engines/afi/v3/strategies/{path} | Get Axioma FI strategy documents and sub-directories in a directory



## getAxiomaFIStrategyDocuments

> DocumentDirectoriesRoot getAxiomaFIStrategyDocuments(path)

Get Axioma FI strategy documents and sub-directories in a directory

This endpoint looks up all Axioma FI strategy documents and sub-directories in a given directory.

### Example

```javascript
const { ApiClient, StrategyDocumentsApi } = require('@factset/sdk-axiomafixedincomeoptimizer');
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
const path = "''"; // String | The directory to get the strategy documents and sub-directories in

// Call api endpoint
apiInstance.getAxiomaFIStrategyDocuments(path).then(
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
 **path** | **String**| The directory to get the strategy documents and sub-directories in | [default to &#39;&#39;]

### Return type

[**DocumentDirectoriesRoot**](DocumentDirectoriesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

