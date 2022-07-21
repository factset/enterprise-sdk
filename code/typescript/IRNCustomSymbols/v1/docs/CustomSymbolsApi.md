# irncustomsymbols.CustomSymbolsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomSymbol**](CustomSymbolsApi.md#createCustomSymbol) | **POST** /v1/custom-symbols | Create a custom symbol
[**deleteCustomSymbol**](CustomSymbolsApi.md#deleteCustomSymbol) | **DELETE** /v1/custom-symbols/{customSymbolId} | Delete a custom symbol
[**getCustomSymbol**](CustomSymbolsApi.md#getCustomSymbol) | **GET** /v1/custom-symbols/{customSymbolId} | Get all custom field and standard field details on a specific custom symbol
[**getCustomSymbolRecords**](CustomSymbolsApi.md#getCustomSymbolRecords) | **GET** /v1/custom-symbols/{customSymbolId}/records | Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
[**getCustomSymbols**](CustomSymbolsApi.md#getCustomSymbols) | **GET** /v1/custom-symbols | Get list of all custom symbols in your group along with some of their standard field and custom fields data
[**linkCustomSymbolToStandardSymbol**](CustomSymbolsApi.md#linkCustomSymbolToStandardSymbol) | **POST** /v1/custom-symbols/{customSymbolId}/link-standard-symbol | Link custom symbol to standard symbol
[**patchCustomSymbol**](CustomSymbolsApi.md#patchCustomSymbol) | **PATCH** /v1/custom-symbols/{customSymbolId} | Edit a custom symbol’s standard field and custom field data



## createCustomSymbol

> NewItemDto createCustomSymbol(opts)

Create a custom symbol

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const opts = {
  'createCustomSymbolDto': new irncustomsymbols.CreateCustomSymbolDto() // CreateCustomSymbolDto | createCustomSymbolDto object to save
};

// Call api endpoint
apiInstance.createCustomSymbol(opts).then(
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
 **createCustomSymbolDto** | [**CreateCustomSymbolDto**](CreateCustomSymbolDto.md)| createCustomSymbolDto object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteCustomSymbol

> deleteCustomSymbol(customSymbolId)

Delete a custom symbol

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const customSymbolId = "customSymbolId_example"; // String | customSymbolId to delete associated custom symbol

// Call api endpoint
apiInstance.deleteCustomSymbol(customSymbolId).then(
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
 **customSymbolId** | **String**| customSymbolId to delete associated custom symbol | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbol

> CustomSymbolDto getCustomSymbol(customSymbolId, opts)

Get all custom field and standard field details on a specific custom symbol

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const customSymbolId = "customSymbolId_example"; // String | customSymbolId to get associated custom symbol
const opts = {
  'includeEvent': false // Boolean | Whether or not to include event
};

// Call api endpoint
apiInstance.getCustomSymbol(customSymbolId, opts).then(
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
 **customSymbolId** | **String**| customSymbolId to get associated custom symbol | 
 **includeEvent** | **Boolean**| Whether or not to include event | [optional] [default to false]

### Return type

[**CustomSymbolDto**](CustomSymbolDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbolRecords

> [RecordPreviewDto] getCustomSymbolRecords(customSymbolId)

Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const customSymbolId = "customSymbolId_example"; // String | CustomSymbolId to get associated records

// Call api endpoint
apiInstance.getCustomSymbolRecords(customSymbolId).then(
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
 **customSymbolId** | **String**| CustomSymbolId to get associated records | 

### Return type

[**[RecordPreviewDto]**](RecordPreviewDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomSymbols

> [CustomSymbolDto] getCustomSymbols(opts)

Get list of all custom symbols in your group along with some of their standard field and custom fields data

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const opts = {
  'typeName': "typeName_example", // String | filter custom symbols based on custom symbol type
  'query': "query_example", // String | filter custom symbols based on custom symbol code or name
  'includeCustomFieldValues': false, // Boolean | Whether or not to include customFieldValues
  'excludeLinkedCustomSymbol': false, // Boolean | Whether or not to exclude linked custom symbol
  'includeEvent': true // Boolean | Whether or not to include event
};

// Call api endpoint
apiInstance.getCustomSymbols(opts).then(
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
 **typeName** | **String**| filter custom symbols based on custom symbol type | [optional] 
 **query** | **String**| filter custom symbols based on custom symbol code or name | [optional] 
 **includeCustomFieldValues** | **Boolean**| Whether or not to include customFieldValues | [optional] [default to false]
 **excludeLinkedCustomSymbol** | **Boolean**| Whether or not to exclude linked custom symbol | [optional] [default to false]
 **includeEvent** | **Boolean**| Whether or not to include event | [optional] [default to true]

### Return type

[**[CustomSymbolDto]**](CustomSymbolDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## linkCustomSymbolToStandardSymbol

> linkCustomSymbolToStandardSymbol(customSymbolId, opts)

Link custom symbol to standard symbol

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const customSymbolId = "customSymbolId_example"; // String | customSymbolId associated with custom symbol
const opts = {
  'standardSymbolDto': new irncustomsymbols.StandardSymbolDto() // StandardSymbolDto | standard symbol name
};

// Call api endpoint
apiInstance.linkCustomSymbolToStandardSymbol(customSymbolId, opts).then(
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
 **customSymbolId** | **String**| customSymbolId associated with custom symbol | 
 **standardSymbolDto** | [**StandardSymbolDto**](StandardSymbolDto.md)| standard symbol name | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: Not defined


## patchCustomSymbol

> patchCustomSymbol(customSymbolId, opts)

Edit a custom symbol’s standard field and custom field data

### Example

```javascript
const { ApiClient, CustomSymbolsApi } = require('@factset/sdk-irncustomsymbols');
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

const apiInstance = new CustomSymbolsApi();
const customSymbolId = "customSymbolId_example"; // String | customSymbolId to update associated custom symbol
const opts = {
  'operation': [new irncustomsymbols.Operation()] // [Operation] | updateCustomSymbolDto object to update
};

// Call api endpoint
apiInstance.patchCustomSymbol(customSymbolId, opts).then(
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
 **customSymbolId** | **String**| customSymbolId to update associated custom symbol | 
 **operation** | [**[Operation]**](Operation.md)| updateCustomSymbolDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

