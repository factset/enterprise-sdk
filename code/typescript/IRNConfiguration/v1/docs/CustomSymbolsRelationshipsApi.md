# irnconfiguration.CustomSymbolsRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSymbolRelationshipType**](CustomSymbolsRelationshipsApi.md#createSymbolRelationshipType) | **POST** /v1/symbols-relationships | Create a symbol relationship
[**deleteSymbolsRelationship**](CustomSymbolsRelationshipsApi.md#deleteSymbolsRelationship) | **DELETE** /v1/symbols-relationships/{symbolsRelationshipId} | Delete a symbol relationship
[**editSymbolsRelationship**](CustomSymbolsRelationshipsApi.md#editSymbolsRelationship) | **PUT** /v1/symbols-relationships/{symbolsRelationshipId} | Edit a symbol relationship
[**getSymbolsRelationships**](CustomSymbolsRelationshipsApi.md#getSymbolsRelationships) | **GET** /v1/symbols-relationships | Get all the Symbols Relationships



## createSymbolRelationshipType

> NewItemDto createSymbolRelationshipType(opts)

Create a symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsRelationshipsApi();
const opts = {
  'symbolsRelationShipSaveDto': new irnconfiguration.SymbolsRelationShipSaveDto() // SymbolsRelationShipSaveDto | symbolsRelationshipSaveDto object to save
};

// Call api endpoint
apiInstance.createSymbolRelationshipType(opts).then(
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
 **symbolsRelationShipSaveDto** | [**SymbolsRelationShipSaveDto**](SymbolsRelationShipSaveDto.md)| symbolsRelationshipSaveDto object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteSymbolsRelationship

> deleteSymbolsRelationship(symbolsRelationshipId)

Delete a symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsRelationshipsApi();
const symbolsRelationshipId = "symbolsRelationshipId_example"; // String | symbolsRelationshipId to delete associated record

// Call api endpoint
apiInstance.deleteSymbolsRelationship(symbolsRelationshipId).then(
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
 **symbolsRelationshipId** | **String**| symbolsRelationshipId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## editSymbolsRelationship

> editSymbolsRelationship(symbolsRelationshipId, opts)

Edit a symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsRelationshipsApi();
const symbolsRelationshipId = "symbolsRelationshipId_example"; // String | symbolsRelationshipId to update associated record
const opts = {
  'symbolsRelationShipSaveDto': new irnconfiguration.SymbolsRelationShipSaveDto() // SymbolsRelationShipSaveDto | SymbolsRelationShipSaveDto object to update
};

// Call api endpoint
apiInstance.editSymbolsRelationship(symbolsRelationshipId, opts).then(
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
 **symbolsRelationshipId** | **String**| symbolsRelationshipId to update associated record | 
 **symbolsRelationShipSaveDto** | [**SymbolsRelationShipSaveDto**](SymbolsRelationShipSaveDto.md)| SymbolsRelationShipSaveDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## getSymbolsRelationships

> [SymbolsRelationshipDto] getSymbolsRelationships()

Get all the Symbols Relationships

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsRelationshipsApi();

// Call api endpoint
apiInstance.getSymbolsRelationships().then(
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

This endpoint does not need any parameter.

### Return type

[**[SymbolsRelationshipDto]**](SymbolsRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

