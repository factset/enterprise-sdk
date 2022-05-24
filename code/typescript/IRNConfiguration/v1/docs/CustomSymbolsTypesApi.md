# irnconfiguration.CustomSymbolsTypesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomSymbolType**](CustomSymbolsTypesApi.md#createCustomSymbolType) | **POST** /v1/custom-symbol-types | Create a Custom symbol type
[**deleteCustomSymbolTypeAsync**](CustomSymbolsTypesApi.md#deleteCustomSymbolTypeAsync) | **DELETE** /v1/custom-symbol-types/{customSymbolTypeId} | Delete a Custom symbol type
[**getCustomSymbolType**](CustomSymbolsTypesApi.md#getCustomSymbolType) | **GET** /v1/custom-symbol-types/{customSymbolTypeId} | Get a specific Custom symbol type&#39;s details
[**getCustomSymbolTypes**](CustomSymbolsTypesApi.md#getCustomSymbolTypes) | **GET** /v1/custom-symbol-types | Get all the custom symbol types
[**getSymbolCustomFieldsForCustomSymbolType**](CustomSymbolsTypesApi.md#getSymbolCustomFieldsForCustomSymbolType) | **GET** /v1/custom-symbol-types/{customSymbolTypeId}/custom-fields | Get Custom fields for Custom Symbol type
[**updateCustomSymbolType**](CustomSymbolsTypesApi.md#updateCustomSymbolType) | **PUT** /v1/custom-symbol-types/{customSymbolTypeId} | Edit a Custom symbol type
[**updateCustomSymbolTypeOrder**](CustomSymbolsTypesApi.md#updateCustomSymbolTypeOrder) | **POST** /v1/custom-symbol-types/reorder | 



## createCustomSymbolType

> NewItemDto createCustomSymbolType(opts)

Create a Custom symbol type

### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();
const opts = {
  'saveCustomSymbolTypeDto': new irnconfiguration.SaveCustomSymbolTypeDto() // SaveCustomSymbolTypeDto | saveCustomSymbolTypeDto object to save
};

// Call api endpoint
apiInstance.createCustomSymbolType(opts).then(
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
 **saveCustomSymbolTypeDto** | [**SaveCustomSymbolTypeDto**](SaveCustomSymbolTypeDto.md)| saveCustomSymbolTypeDto object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteCustomSymbolTypeAsync

> deleteCustomSymbolTypeAsync(customSymbolTypeId)

Delete a Custom symbol type

### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();
const customSymbolTypeId = "customSymbolTypeId_example"; // String | customSymbolTypeId to delete associated record

// Call api endpoint
apiInstance.deleteCustomSymbolTypeAsync(customSymbolTypeId).then(
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
 **customSymbolTypeId** | **String**| customSymbolTypeId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbolType

> CustomSymbolTypeDetailDto getCustomSymbolType(customSymbolTypeId)

Get a specific Custom symbol type&#39;s details

### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();
const customSymbolTypeId = "customSymbolTypeId_example"; // String | customSymbolTypeId to get associated record

// Call api endpoint
apiInstance.getCustomSymbolType(customSymbolTypeId).then(
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
 **customSymbolTypeId** | **String**| customSymbolTypeId to get associated record | 

### Return type

[**CustomSymbolTypeDetailDto**](CustomSymbolTypeDetailDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbolTypes

> [CustomSymbolTypeDto] getCustomSymbolTypes()

Get all the custom symbol types

### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();

// Call api endpoint
apiInstance.getCustomSymbolTypes().then(
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

[**[CustomSymbolTypeDto]**](CustomSymbolTypeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSymbolCustomFieldsForCustomSymbolType

> [CustomSymbolCustomFieldConfigDto] getSymbolCustomFieldsForCustomSymbolType(customSymbolTypeId)

Get Custom fields for Custom Symbol type

### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();
const customSymbolTypeId = "customSymbolTypeId_example"; // String | customSymbolTypeId to get associated Custom fileds

// Call api endpoint
apiInstance.getSymbolCustomFieldsForCustomSymbolType(customSymbolTypeId).then(
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
 **customSymbolTypeId** | **String**| customSymbolTypeId to get associated Custom fileds | 

### Return type

[**[CustomSymbolCustomFieldConfigDto]**](CustomSymbolCustomFieldConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateCustomSymbolType

> updateCustomSymbolType(customSymbolTypeId, opts)

Edit a Custom symbol type

### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();
const customSymbolTypeId = "customSymbolTypeId_example"; // String | customSymbolTypeId to update associated record
const opts = {
  'updateCustomSymbolTypeDto': new irnconfiguration.UpdateCustomSymbolTypeDto() // UpdateCustomSymbolTypeDto | updateCustomSymbolTypeDto object to update
};

// Call api endpoint
apiInstance.updateCustomSymbolType(customSymbolTypeId, opts).then(
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
 **customSymbolTypeId** | **String**| customSymbolTypeId to update associated record | 
 **updateCustomSymbolTypeDto** | [**UpdateCustomSymbolTypeDto**](UpdateCustomSymbolTypeDto.md)| updateCustomSymbolTypeDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## updateCustomSymbolTypeOrder

> updateCustomSymbolTypeOrder(opts)



### Example

```javascript
const { ApiClient, CustomSymbolsTypesApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsTypesApi();
const opts = {
  'reorderCustomSymbolTypeDto': new irnconfiguration.ReorderCustomSymbolTypeDto() // ReorderCustomSymbolTypeDto | 
};

// Call api endpoint
apiInstance.updateCustomSymbolTypeOrder(opts).then(
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
 **reorderCustomSymbolTypeDto** | [**ReorderCustomSymbolTypeDto**](ReorderCustomSymbolTypeDto.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

