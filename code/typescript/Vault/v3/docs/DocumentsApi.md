# vault.DocumentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVaultDocuments**](DocumentsApi.md#getVaultDocuments) | **GET** /analytics/engines/vault/v3/documents/{path} | Get Vault documents and sub-directories in a directory



## getVaultDocuments

> DocumentDirectoriesRoot getVaultDocuments(path)

Get Vault documents and sub-directories in a directory

This endpoint looks up all Vault documents and sub-directories in a given directory.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-vault');
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

const apiInstance = new DocumentsApi();
const path = Client:; // String | The directory to get the documents in. This is a sample example for illustration purposes only. Client should use a valid Directory/Sub-Directory to get a successful response.

// Call api endpoint
apiInstance.getVaultDocuments(path).then(
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
 **path** | **String**| The directory to get the documents in. This is a sample example for illustration purposes only. Client should use a valid Directory/Sub-Directory to get a successful response. | 

### Return type

[**DocumentDirectoriesRoot**](DocumentDirectoriesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

