# vault.ComponentsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVaultComponentById**](ComponentsApi.md#getVaultComponentById) | **GET** /analytics/lookups/v2/engines/vault/components/{id} | Get Vault component by id
[**getVaultComponents**](ComponentsApi.md#getVaultComponents) | **GET** /analytics/lookups/v2/engines/vault/components | Get Vault components



## getVaultComponentById

> VaultComponent getVaultComponentById(id)

Get Vault component by id

This endpoint returns the default settings of a Vault component.

### Example

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ComponentsApi();
const id = "'7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935'"; // String | Unique identifier for a vault component

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
 **id** | **String**| Unique identifier for a vault component | [default to &#39;7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935&#39;]

### Return type

[**VaultComponent**](VaultComponent.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVaultComponents

> {String: ComponentSummary} getVaultComponents(document)

Get Vault components

This endpoint returns the list of Vault components in a given Vault document.

### Example

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-vault');
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

const apiInstance = new ComponentsApi();
const document = "'Client:Foo'"; // String | Document Name

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
 **document** | **String**| Document Name | [default to &#39;Client:Foo&#39;]

### Return type

[**{String: ComponentSummary}**](ComponentSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

