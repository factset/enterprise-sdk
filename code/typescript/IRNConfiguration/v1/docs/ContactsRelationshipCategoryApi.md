# irnconfiguration.ContactsRelationshipCategoryApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelationshipCategory**](ContactsRelationshipCategoryApi.md#createRelationshipCategory) | **POST** /v1/relationship-categories | Create a relationship category
[**deleteRelationshipCategory**](ContactsRelationshipCategoryApi.md#deleteRelationshipCategory) | **DELETE** /v1/relationship-categories/{relationshipCategoryId} | Delete a relationship category
[**editRelationshipCategory**](ContactsRelationshipCategoryApi.md#editRelationshipCategory) | **PUT** /v1/relationship-categories/{relationshipCategoryId} | Edit a relationship category
[**getRelationshipCategories**](ContactsRelationshipCategoryApi.md#getRelationshipCategories) | **GET** /v1/relationship-categories | Get list of the relationship categories configured in your group
[**updateRelationshipCategoryOrder**](ContactsRelationshipCategoryApi.md#updateRelationshipCategoryOrder) | **POST** /v1/relationship-categories/reorder | Reorder relationship categories



## createRelationshipCategory

> NewItemDto createRelationshipCategory(opts)

Create a relationship category

### Example

```javascript
const { ApiClient, ContactsRelationshipCategoryApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new ContactsRelationshipCategoryApi();
const opts = {
  'relationshipCategorySaveDto': new irnconfiguration.RelationshipCategorySaveDto() // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to save
};

// Call api endpoint
apiInstance.createRelationshipCategory(opts).then(
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
 **relationshipCategorySaveDto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteRelationshipCategory

> deleteRelationshipCategory(relationshipCategoryId)

Delete a relationship category

### Example

```javascript
const { ApiClient, ContactsRelationshipCategoryApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new ContactsRelationshipCategoryApi();
const relationshipCategoryId = "relationshipCategoryId_example"; // String | relationshipCategoryId to delete associated record

// Call api endpoint
apiInstance.deleteRelationshipCategory(relationshipCategoryId).then(
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
 **relationshipCategoryId** | **String**| relationshipCategoryId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## editRelationshipCategory

> editRelationshipCategory(relationshipCategoryId, opts)

Edit a relationship category

### Example

```javascript
const { ApiClient, ContactsRelationshipCategoryApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new ContactsRelationshipCategoryApi();
const relationshipCategoryId = "relationshipCategoryId_example"; // String | relationshipCategoryId to update associated record
const opts = {
  'relationshipCategorySaveDto': new irnconfiguration.RelationshipCategorySaveDto() // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to update
};

// Call api endpoint
apiInstance.editRelationshipCategory(relationshipCategoryId, opts).then(
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
 **relationshipCategoryId** | **String**| relationshipCategoryId to update associated record | 
 **relationshipCategorySaveDto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## getRelationshipCategories

> [RelationshipCategoryDto] getRelationshipCategories()

Get list of the relationship categories configured in your group

### Example

```javascript
const { ApiClient, ContactsRelationshipCategoryApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new ContactsRelationshipCategoryApi();

// Call api endpoint
apiInstance.getRelationshipCategories().then(
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

[**[RelationshipCategoryDto]**](RelationshipCategoryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateRelationshipCategoryOrder

> updateRelationshipCategoryOrder(opts)

Reorder relationship categories

### Example

```javascript
const { ApiClient, ContactsRelationshipCategoryApi } = require('@factset/sdk-irnconfiguration');
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

const apiInstance = new ContactsRelationshipCategoryApi();
const opts = {
  'relationshipCategoryListDto': new irnconfiguration.RelationshipCategoryListDto() // RelationshipCategoryListDto | List of Guid
};

// Call api endpoint
apiInstance.updateRelationshipCategoryOrder(opts).then(
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
 **relationshipCategoryListDto** | [**RelationshipCategoryListDto**](RelationshipCategoryListDto.md)| List of Guid | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

