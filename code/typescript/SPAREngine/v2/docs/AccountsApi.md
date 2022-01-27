# sparengine.AccountsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** /analytics/lookups/v2/accounts/{path} | Get accounts and sub-directories in a directory



## getAccounts

> AccountDirectories getAccounts(path)

Get accounts and sub-directories in a directory

This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.

### Example

```javascript
const { ApiClient, AccountsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new AccountsApi();
const path = "'Client:Foo/Bar'"; // String | The directory to get the accounts and sub-directories in

// Call api endpoint
apiInstance.getAccounts(path).then(
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
 **path** | **String**| The directory to get the accounts and sub-directories in | [default to &#39;Client:Foo/Bar&#39;]

### Return type

[**AccountDirectories**](AccountDirectories.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

