# irnconfiguration.CustomSymbolsCustomFieldsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#createCustomSymbolCustomField) | **POST** /v1/custom-symbol-custom-fields | Create a Custom symbol custom field
[**deleteCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#deleteCustomSymbolCustomField) | **DELETE** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Delete a Custom symbol custom field
[**getCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#getCustomSymbolCustomField) | **GET** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Get a specific Custom symbol custom field&#39;s details
[**getCustomSymbolCustomFields**](CustomSymbolsCustomFieldsApi.md#getCustomSymbolCustomFields) | **GET** /v1/custom-symbol-custom-fields | Get all the Custom symbol custom fields
[**patchCustomSymbolCustomField**](CustomSymbolsCustomFieldsApi.md#patchCustomSymbolCustomField) | **PATCH** /v1/custom-symbol-custom-fields/{customSymbolCustomFieldId} | Edit a Custom symbol custom field



## createCustomSymbolCustomField

> NewItemDto createCustomSymbolCustomField(opts)

Create a Custom symbol custom field

### Example

```javascript
const { ApiClient, CustomSymbolsCustomFieldsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsCustomFieldsApi();
const opts = {
  'createCustomSymbolCustomFieldDto': new irnconfiguration.CreateCustomSymbolCustomFieldDto() // CreateCustomSymbolCustomFieldDto | createCustomSymbolCustomFieldDto object to save
};

// Call api endpoint
apiInstance.createCustomSymbolCustomField(opts).then(
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
 **createCustomSymbolCustomFieldDto** | [**CreateCustomSymbolCustomFieldDto**](CreateCustomSymbolCustomFieldDto.md)| createCustomSymbolCustomFieldDto object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteCustomSymbolCustomField

> deleteCustomSymbolCustomField(customSymbolCustomFieldId)

Delete a Custom symbol custom field

### Example

```javascript
const { ApiClient, CustomSymbolsCustomFieldsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsCustomFieldsApi();
const customSymbolCustomFieldId = "customSymbolCustomFieldId_example"; // String | customSymbolCustomFieldId to delete associated record

// Call api endpoint
apiInstance.deleteCustomSymbolCustomField(customSymbolCustomFieldId).then(
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
 **customSymbolCustomFieldId** | **String**| customSymbolCustomFieldId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbolCustomField

> CustomSymbolCustomFieldConfigDto getCustomSymbolCustomField(customSymbolCustomFieldId)

Get a specific Custom symbol custom field&#39;s details

### Example

```javascript
const { ApiClient, CustomSymbolsCustomFieldsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsCustomFieldsApi();
const customSymbolCustomFieldId = "customSymbolCustomFieldId_example"; // String | customSymbolCustomFieldId to get associated record

// Call api endpoint
apiInstance.getCustomSymbolCustomField(customSymbolCustomFieldId).then(
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
 **customSymbolCustomFieldId** | **String**| customSymbolCustomFieldId to get associated record | 

### Return type

[**CustomSymbolCustomFieldConfigDto**](CustomSymbolCustomFieldConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbolCustomFields

> [CustomSymbolCustomFieldConfigDto] getCustomSymbolCustomFields()

Get all the Custom symbol custom fields

### Example

```javascript
const { ApiClient, CustomSymbolsCustomFieldsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsCustomFieldsApi();

// Call api endpoint
apiInstance.getCustomSymbolCustomFields().then(
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

[**[CustomSymbolCustomFieldConfigDto]**](CustomSymbolCustomFieldConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchCustomSymbolCustomField

> patchCustomSymbolCustomField(customSymbolCustomFieldId, opts)

Edit a Custom symbol custom field

### Example

```javascript
const { ApiClient, CustomSymbolsCustomFieldsApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new CustomSymbolsCustomFieldsApi();
const customSymbolCustomFieldId = "customSymbolCustomFieldId_example"; // String | customSymbolCustomFieldId to update associated record
const opts = {
  'operation': [new irnconfiguration.Operation()] // [Operation] | customSymbolCustomFieldUpdateDto object to update
};

// Call api endpoint
apiInstance.patchCustomSymbolCustomField(customSymbolCustomFieldId, opts).then(
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
 **customSymbolCustomFieldId** | **String**| customSymbolCustomFieldId to update associated record | 
 **operation** | [**[Operation]**](Operation.md)| customSymbolCustomFieldUpdateDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

