# irncustomsymbols.HybridSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStandardSymbolMetadata**](HybridSymbolsApi.md#createStandardSymbolMetadata) | **POST** /v1/custom-symbols/standard-symbol-metadata | Create standard symbol metadata
[**getStandardSymbolMetadataGuid**](HybridSymbolsApi.md#getStandardSymbolMetadataGuid) | **GET** /v1/custom-symbols/standard-symbol-metadata/{standardSymbol} | Get all custom field and standard field details on a specific standard symbol
[**patchStandardSymbol**](HybridSymbolsApi.md#patchStandardSymbol) | **PATCH** /v1/custom-symbols/standard-symbol-metadata/{standardSymbolId} | Edit a standard symbol’s standard field and custom field data



## createStandardSymbolMetadata

> NewItemDto createStandardSymbolMetadata(opts)

Create standard symbol metadata

### Example

```javascript
const { ApiClient, HybridSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new HybridSymbolsApi();
const opts = {
  'createStandardSymbolMetadataDto': new irncustomsymbols.CreateStandardSymbolMetadataDto() // CreateStandardSymbolMetadataDto | createStandardSymbolMetadataDto object to save
};

// Call api endpoint
apiInstance.createStandardSymbolMetadata(opts).then(
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
 **createStandardSymbolMetadataDto** | [**CreateStandardSymbolMetadataDto**](CreateStandardSymbolMetadataDto.md)| createStandardSymbolMetadataDto object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## getStandardSymbolMetadataGuid

> String getStandardSymbolMetadataGuid(standardSymbol)

Get all custom field and standard field details on a specific standard symbol

### Example

```javascript
const { ApiClient, HybridSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new HybridSymbolsApi();
const standardSymbol = "standardSymbol_example"; // String | Standard symbol to get associated customSymbolId

// Call api endpoint
apiInstance.getStandardSymbolMetadataGuid(standardSymbol).then(
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
 **standardSymbol** | **String**| Standard symbol to get associated customSymbolId | 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchStandardSymbol

> patchStandardSymbol(standardSymbolId, opts)

Edit a standard symbol’s standard field and custom field data

### Example

```javascript
const { ApiClient, HybridSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new HybridSymbolsApi();
const standardSymbolId = "standardSymbolId_example"; // String | standardSymbolId to update associated standard symbol
const opts = {
  'operation': [new irncustomsymbols.Operation()] // [Operation] | updateCustomSymbolDto object to update
};

// Call api endpoint
apiInstance.patchStandardSymbol(standardSymbolId, opts).then(
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
 **standardSymbolId** | **String**| standardSymbolId to update associated standard symbol | 
 **operation** | [**[Operation]**](Operation.md)| updateCustomSymbolDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

