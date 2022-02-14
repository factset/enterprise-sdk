# irncontacts.RelationshipCategoriesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RelationshipCategoriesGet**](RelationshipCategoriesApi.md#v1RelationshipCategoriesGet) | **GET** /v1/relationship-categories | Get list of the relationship categories configured in your group
[**v1RelationshipCategoriesPost**](RelationshipCategoriesApi.md#v1RelationshipCategoriesPost) | **POST** /v1/relationship-categories | Create a relationship category
[**v1RelationshipCategoriesRelationshipCategoryIdDelete**](RelationshipCategoriesApi.md#v1RelationshipCategoriesRelationshipCategoryIdDelete) | **DELETE** /v1/relationship-categories/{relationshipCategoryId} | Delete a relationship category
[**v1RelationshipCategoriesRelationshipCategoryIdPut**](RelationshipCategoriesApi.md#v1RelationshipCategoriesRelationshipCategoryIdPut) | **PUT** /v1/relationship-categories/{relationshipCategoryId} | Edit a relationship category
[**v1RelationshipCategoriesReorderPost**](RelationshipCategoriesApi.md#v1RelationshipCategoriesReorderPost) | **POST** /v1/relationship-categories/reorder | Reorder relationship categories



## v1RelationshipCategoriesGet

> [RelationshipCategoryDto] v1RelationshipCategoriesGet()

Get list of the relationship categories configured in your group

### Example

```javascript
const { ApiClient, RelationshipCategoriesApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new RelationshipCategoriesApi();

// Call api endpoint
apiInstance.v1RelationshipCategoriesGet().then(
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


## v1RelationshipCategoriesPost

> String v1RelationshipCategoriesPost(opts)

Create a relationship category

### Example

```javascript
const { ApiClient, RelationshipCategoriesApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new RelationshipCategoriesApi();
const opts = {
  'relationshipCategorySaveDto': new irncontacts.RelationshipCategorySaveDto() // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to save
};

// Call api endpoint
apiInstance.v1RelationshipCategoriesPost(opts).then(
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

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## v1RelationshipCategoriesRelationshipCategoryIdDelete

> v1RelationshipCategoriesRelationshipCategoryIdDelete(relationshipCategoryId)

Delete a relationship category

### Example

```javascript
const { ApiClient, RelationshipCategoriesApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new RelationshipCategoriesApi();
const relationshipCategoryId = "relationshipCategoryId_example"; // String | relationshipCategoryId to delete associated record

// Call api endpoint
apiInstance.v1RelationshipCategoriesRelationshipCategoryIdDelete(relationshipCategoryId).then(
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


## v1RelationshipCategoriesRelationshipCategoryIdPut

> v1RelationshipCategoriesRelationshipCategoryIdPut(relationshipCategoryId, opts)

Edit a relationship category

### Example

```javascript
const { ApiClient, RelationshipCategoriesApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new RelationshipCategoriesApi();
const relationshipCategoryId = "relationshipCategoryId_example"; // String | relationshipCategoryId to update associated record
const opts = {
  'relationshipCategorySaveDto': new irncontacts.RelationshipCategorySaveDto() // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to update
};

// Call api endpoint
apiInstance.v1RelationshipCategoriesRelationshipCategoryIdPut(relationshipCategoryId, opts).then(
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


## v1RelationshipCategoriesReorderPost

> v1RelationshipCategoriesReorderPost(opts)

Reorder relationship categories

### Example

```javascript
const { ApiClient, RelationshipCategoriesApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new RelationshipCategoriesApi();
const opts = {
  'relationshipCategoryListDto': new irncontacts.RelationshipCategoryListDto() // RelationshipCategoryListDto | List of Guid
};

// Call api endpoint
apiInstance.v1RelationshipCategoriesReorderPost(opts).then(
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

