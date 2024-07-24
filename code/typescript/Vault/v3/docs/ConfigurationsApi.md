# vault.ConfigurationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVaultConfigurationById**](ConfigurationsApi.md#getVaultConfigurationById) | **GET** /analytics/engines/vault/v3/configurations/{id} | Get Vault configuration by id
[**getVaultConfigurations**](ConfigurationsApi.md#getVaultConfigurations) | **GET** /analytics/engines/vault/v3/configurations | Get Vault configurations



## getVaultConfigurationById

> VaultConfigurationRoot getVaultConfigurationById(id)

Get Vault configuration by id

This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.    The __lockingDate__ parameter in the response can help in identifying if the vault configuration data is locked or unlocked.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConfigurationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ConfigurationsApi();
const id = e95ef921-b4d4-4bb7-93ba-60eca8e3247a; // String | Vault configuration id to get the details of. This is a sample example for illustration purposes only. Client should use a valid Vault API Configuration Id to get a successful response.

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
 **id** | **String**| Vault configuration id to get the details of. This is a sample example for illustration purposes only. Client should use a valid Vault API Configuration Id to get a successful response. | 

### Return type

[**VaultConfigurationRoot**](VaultConfigurationRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVaultConfigurations

> VaultConfigurationSummaryRoot getVaultConfigurations(account)

Get Vault configurations

This endpoint returns all the Vault configurations saved in the provided account.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConfigurationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ConfigurationsApi();
const account = CLIENT:/MAC/DEMO/DEMO_PS_EQ_EM_COUNTRY_ALPHA.ACCT; // String | Required account query parameter to filter configurations for a specific account. This is a sample example for illustration purposes only. Client should use a valid Portfolio Insight Account to get a successful response.

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
 **account** | **String**| Required account query parameter to filter configurations for a specific account. This is a sample example for illustration purposes only. Client should use a valid Portfolio Insight Account to get a successful response. | 

### Return type

[**VaultConfigurationSummaryRoot**](VaultConfigurationSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

