# vault.ConfigurationsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVaultConfigurationById**](ConfigurationsApi.md#getVaultConfigurationById) | **GET** /analytics/lookups/v2/engines/vault/configurations/{id} | Get Vault configuration by id
[**getVaultConfigurations**](ConfigurationsApi.md#getVaultConfigurations) | **GET** /analytics/lookups/v2/engines/vault/configurations | Get Vault configurations



## getVaultConfigurationById

> VaultConfiguration getVaultConfigurationById(id)

Get Vault configuration by id

This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.

### Example

```javascript
const { ApiClient, ConfigurationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ConfigurationsApi();
const id = "'E522DF7D-C286-4EF1-AE34-0AA104AF602F'"; // String | Vault configuration id to get the details of

// Call api endpoint
apiInstance.getVaultConfigurationById(id).then(
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
 **id** | **String**| Vault configuration id to get the details of | [default to &#39;E522DF7D-C286-4EF1-AE34-0AA104AF602F&#39;]

### Return type

[**VaultConfiguration**](VaultConfiguration.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVaultConfigurations

> {String: VaultConfigurationSummary} getVaultConfigurations(account)

Get Vault configurations

This endpoint returns all the Vault configurations saved in the provided account.

### Example

```javascript
const { ApiClient, ConfigurationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ConfigurationsApi();
const account = "'Client:Foo/Bar/myaccount.acct'"; // String | Required account query parameter to filter configurations for a specific account

// Call api endpoint
apiInstance.getVaultConfigurations(account).then(
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
 **account** | **String**| Required account query parameter to filter configurations for a specific account | [default to &#39;Client:Foo/Bar/myaccount.acct&#39;]

### Return type

[**{String: VaultConfigurationSummary}**](VaultConfigurationSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

