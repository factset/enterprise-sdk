# vault.ComponentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVaultComponentById**](ComponentsApi.md#getVaultComponentById) | **GET** /analytics/engines/vault/v3/components/{id} | Get Vault component by id
[**getVaultComponents**](ComponentsApi.md#getVaultComponents) | **GET** /analytics/engines/vault/v3/components | Get Vault components



## getVaultComponentById

> VaultComponentRoot getVaultComponentById(id)

Get Vault component by id

This endpoint returns the default settings of a Vault component.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ComponentsApi();
const id = AFB43C61A6651B87988FEA62ED333638595AE7D8D7345A33AB9994CF23AFCC5D; // String | Unique identifier for a vault component. This is a sample example for illustration purposes only. Client should use a valid Vault API Component Id to get a successful response.

// Call api endpoint
apiInstance.getVaultComponentById(id).then(
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
 **id** | **String**| Unique identifier for a vault component. This is a sample example for illustration purposes only. Client should use a valid Vault API Component Id to get a successful response. | 

### Return type

[**VaultComponentRoot**](VaultComponentRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVaultComponents

> ComponentSummaryRoot getVaultComponents(document)

Get Vault components

This endpoint returns the list of Vault components in a given Vault document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ComponentsApi();
const document = CLIENT:/MAC/DEMO/DEMO_PS_EQ_EM_COUNTRY_ALPHA; // String | Document Name. This is a sample example for illustration purposes only. Client should use a valid Portfolio Insight Document to get a successful response.

// Call api endpoint
apiInstance.getVaultComponents(document).then(
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
 **document** | **String**| Document Name. This is a sample example for illustration purposes only. Client should use a valid Portfolio Insight Document to get a successful response. | 

### Return type

[**ComponentSummaryRoot**](ComponentSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

