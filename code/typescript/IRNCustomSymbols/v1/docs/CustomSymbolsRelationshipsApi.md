# irncustomsymbols.CustomSymbolsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSymbolRelationship**](CustomSymbolsRelationshipsApi.md#createSymbolRelationship) | **POST** /v1/symbol-relationships | Create a symbol relationship
[**deleteSymbolRelationship**](CustomSymbolsRelationshipsApi.md#deleteSymbolRelationship) | **DELETE** /v1/symbol-relationships/{symbolRelationshipId} | Delete a symbol relationship
[**editAndAddSymbolRelationship**](CustomSymbolsRelationshipsApi.md#editAndAddSymbolRelationship) | **PUT** /v1/symbol-relationships/{symbol} | Edit a symbol relationship
[**getSymbolRelationship**](CustomSymbolsRelationshipsApi.md#getSymbolRelationship) | **GET** /v1/symbol-relationships/{symbolRelationshipId} | Get details on a specific symbol relationship
[**getSymbolRelationships**](CustomSymbolsRelationshipsApi.md#getSymbolRelationships) | **GET** /v1/symbol-relationships/{symbolId}/relationships | Returns a list of a symbol’s relationships



## createSymbolRelationship

> createSymbolRelationship(opts)

Create a symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irncustomsymbols');
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
  'symbolRelationshipSaveDto': [new irncustomsymbols.SymbolRelationshipSaveDto()] // [SymbolRelationshipSaveDto] | symbolRelationship object to save
};

// Call api endpoint
apiInstance.createSymbolRelationship(opts).then(
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
 **symbolRelationshipSaveDto** | [**[SymbolRelationshipSaveDto]**](SymbolRelationshipSaveDto.md)| symbolRelationship object to save | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteSymbolRelationship

> deleteSymbolRelationship(symbolRelationshipId)

Delete a symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irncustomsymbols');
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
const symbolRelationshipId = "symbolRelationshipId_example"; // String | symbolRelationshipId to delete associated record

// Call api endpoint
apiInstance.deleteSymbolRelationship(symbolRelationshipId).then(
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
 **symbolRelationshipId** | **String**| symbolRelationshipId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## editAndAddSymbolRelationship

> editAndAddSymbolRelationship(symbol, opts)

Edit a symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irncustomsymbols');
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
const symbol = "symbol_example"; // String | 
const opts = {
  'symbolRelationshipUpdateDto': [new irncustomsymbols.SymbolRelationshipUpdateDto()] // [SymbolRelationshipUpdateDto] | symbolRelationship object to save
};

// Call api endpoint
apiInstance.editAndAddSymbolRelationship(symbol, opts).then(
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
 **symbol** | **String**|  | 
 **symbolRelationshipUpdateDto** | [**[SymbolRelationshipUpdateDto]**](SymbolRelationshipUpdateDto.md)| symbolRelationship object to save | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: Not defined


## getSymbolRelationship

> SymbolRelationshipDto getSymbolRelationship(symbolRelationshipId)

Get details on a specific symbol relationship

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irncustomsymbols');
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
const symbolRelationshipId = "symbolRelationshipId_example"; // String | symbolRelationshipId to get associated record

// Call api endpoint
apiInstance.getSymbolRelationship(symbolRelationshipId).then(
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
 **symbolRelationshipId** | **String**| symbolRelationshipId to get associated record | 

### Return type

[**SymbolRelationshipDto**](SymbolRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSymbolRelationships

> [SymbolRelationshipDto] getSymbolRelationships(symbolId)

Returns a list of a symbol’s relationships

### Example

```javascript
const { ApiClient, CustomSymbolsRelationshipsApi } = require('@factset/sdk-irncustomsymbols');
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
const symbolId = "symbolId_example"; // String | symbolId to get associated records

// Call api endpoint
apiInstance.getSymbolRelationships(symbolId).then(
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
 **symbolId** | **String**| symbolId to get associated records | 

### Return type

[**[SymbolRelationshipDto]**](SymbolRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

