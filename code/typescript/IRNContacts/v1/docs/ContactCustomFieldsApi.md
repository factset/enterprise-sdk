# irncontacts.ContactCustomFieldsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ContactCustomFieldsContactCustomFieldIdDelete**](ContactCustomFieldsApi.md#v1ContactCustomFieldsContactCustomFieldIdDelete) | **DELETE** /v1/contact-custom-fields/{contactCustomFieldId} | Delete a contact custom field
[**v1ContactCustomFieldsContactCustomFieldIdGet**](ContactCustomFieldsApi.md#v1ContactCustomFieldsContactCustomFieldIdGet) | **GET** /v1/contact-custom-fields/{contactCustomFieldId} | Get a specific Contact custom field&#39;s details
[**v1ContactCustomFieldsContactCustomFieldIdPatch**](ContactCustomFieldsApi.md#v1ContactCustomFieldsContactCustomFieldIdPatch) | **PATCH** /v1/contact-custom-fields/{contactCustomFieldId} | Edit a contact custom field
[**v1ContactCustomFieldsGet**](ContactCustomFieldsApi.md#v1ContactCustomFieldsGet) | **GET** /v1/contact-custom-fields | Get all the contact custom fields
[**v1ContactCustomFieldsPost**](ContactCustomFieldsApi.md#v1ContactCustomFieldsPost) | **POST** /v1/contact-custom-fields | Create a contact custom field
[**v1ContactCustomFieldsReorderPost**](ContactCustomFieldsApi.md#v1ContactCustomFieldsReorderPost) | **POST** /v1/contact-custom-fields/reorder | Reorder contact custom fields



## v1ContactCustomFieldsContactCustomFieldIdDelete

> v1ContactCustomFieldsContactCustomFieldIdDelete(contactCustomFieldId)

Delete a contact custom field

### Example

```javascript
const { ApiClient, ContactCustomFieldsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactCustomFieldsApi();
const contactCustomFieldId = "contactCustomFieldId_example"; // String | contactCustomFieldId to delete associated record

// Call api endpoint
apiInstance.v1ContactCustomFieldsContactCustomFieldIdDelete(contactCustomFieldId).then(
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
 **contactCustomFieldId** | **String**| contactCustomFieldId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactCustomFieldsContactCustomFieldIdGet

> ContactCustomFieldDto v1ContactCustomFieldsContactCustomFieldIdGet(contactCustomFieldId)

Get a specific Contact custom field&#39;s details

### Example

```javascript
const { ApiClient, ContactCustomFieldsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactCustomFieldsApi();
const contactCustomFieldId = "contactCustomFieldId_example"; // String | contactCustomFieldId to get associated record

// Call api endpoint
apiInstance.v1ContactCustomFieldsContactCustomFieldIdGet(contactCustomFieldId).then(
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
 **contactCustomFieldId** | **String**| contactCustomFieldId to get associated record | 

### Return type

[**ContactCustomFieldDto**](ContactCustomFieldDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactCustomFieldsContactCustomFieldIdPatch

> v1ContactCustomFieldsContactCustomFieldIdPatch(contactCustomFieldId, opts)

Edit a contact custom field

### Example

```javascript
const { ApiClient, ContactCustomFieldsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactCustomFieldsApi();
const contactCustomFieldId = "contactCustomFieldId_example"; // String | contactCustomFieldId to update associated record
const opts = {
  'operation': [new irncontacts.Operation()] // [Operation] | contactCustomFieldUpdateDto object to update
};

// Call api endpoint
apiInstance.v1ContactCustomFieldsContactCustomFieldIdPatch(contactCustomFieldId, opts).then(
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
 **contactCustomFieldId** | **String**| contactCustomFieldId to update associated record | 
 **operation** | [**[Operation]**](Operation.md)| contactCustomFieldUpdateDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## v1ContactCustomFieldsGet

> [ContactCustomFieldDto] v1ContactCustomFieldsGet()

Get all the contact custom fields

### Example

```javascript
const { ApiClient, ContactCustomFieldsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactCustomFieldsApi();

// Call api endpoint
apiInstance.v1ContactCustomFieldsGet().then(
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

[**[ContactCustomFieldDto]**](ContactCustomFieldDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactCustomFieldsPost

> String v1ContactCustomFieldsPost(opts)

Create a contact custom field

### Example

```javascript
const { ApiClient, ContactCustomFieldsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactCustomFieldsApi();
const opts = {
  'contactCustomFieldSaveDto': new irncontacts.ContactCustomFieldSaveDto() // ContactCustomFieldSaveDto | ContactCustomFieldSaveDto object to save
};

// Call api endpoint
apiInstance.v1ContactCustomFieldsPost(opts).then(
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
 **contactCustomFieldSaveDto** | [**ContactCustomFieldSaveDto**](ContactCustomFieldSaveDto.md)| ContactCustomFieldSaveDto object to save | [optional] 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## v1ContactCustomFieldsReorderPost

> v1ContactCustomFieldsReorderPost(opts)

Reorder contact custom fields

### Example

```javascript
const { ApiClient, ContactCustomFieldsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactCustomFieldsApi();
const opts = {
  'contactCustomFieldListDto': new irncontacts.ContactCustomFieldListDto() // ContactCustomFieldListDto | List of Guid
};

// Call api endpoint
apiInstance.v1ContactCustomFieldsReorderPost(opts).then(
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
 **contactCustomFieldListDto** | [**ContactCustomFieldListDto**](ContactCustomFieldListDto.md)| List of Guid | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

