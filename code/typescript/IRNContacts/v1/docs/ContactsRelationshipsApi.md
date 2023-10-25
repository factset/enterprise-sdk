# irncontacts.ContactsRelationshipsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContactRelationship**](ContactsRelationshipsApi.md#createContactRelationship) | **POST** /v1/contact-relationships | Create a contact relationship
[**deleteContactRelationship**](ContactsRelationshipsApi.md#deleteContactRelationship) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**getAllRelationshipsTaggingAContact**](ContactsRelationshipsApi.md#getAllRelationshipsTaggingAContact) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**getContactRelationship**](ContactsRelationshipsApi.md#getContactRelationship) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**patchContactRelationship**](ContactsRelationshipsApi.md#patchContactRelationship) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship



## createContactRelationship

> NewItemDto createContactRelationship(opts)

Create a contact relationship

### Example

```javascript
const { ApiClient, ContactsRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsRelationshipsApi();
const opts = {
  'contactRelationshipTwoSidedSaveDto': new irncontacts.ContactRelationshipTwoSidedSaveDto() // ContactRelationshipTwoSidedSaveDto | contactRelationship object to save
};

// Call api endpoint
apiInstance.createContactRelationship(opts).then(
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
 **contactRelationshipTwoSidedSaveDto** | [**ContactRelationshipTwoSidedSaveDto**](ContactRelationshipTwoSidedSaveDto.md)| contactRelationship object to save | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteContactRelationship

> deleteContactRelationship(contactRelationshipId)

Delete a contact relationship

### Example

```javascript
const { ApiClient, ContactsRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsRelationshipsApi();
const contactRelationshipId = "contactRelationshipId_example"; // String | contactRelationshipId to delete associated record

// Call api endpoint
apiInstance.deleteContactRelationship(contactRelationshipId).then(
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
 **contactRelationshipId** | **String**| contactRelationshipId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAllRelationshipsTaggingAContact

> [ContactRelationshipTwoSidedDto] getAllRelationshipsTaggingAContact(opts)

Get all the relationships where the given symbol or contact identifier has been tagged in a relationship

### Example

```javascript
const { ApiClient, ContactsRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsRelationshipsApi();
const opts = {
  'symbol': "symbol_example", // String | 
  'contactId': "contactId_example", // String | 
  'relationshipId': "relationshipId_example" // String | 
};

// Call api endpoint
apiInstance.getAllRelationshipsTaggingAContact(opts).then(
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
 **symbol** | **String**|  | [optional] 
 **contactId** | **String**|  | [optional] 
 **relationshipId** | **String**|  | [optional] 

### Return type

[**[ContactRelationshipTwoSidedDto]**](ContactRelationshipTwoSidedDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getContactRelationship

> ContactRelationshipTwoSidedDto getContactRelationship(contactRelationshipId)

Get details on a specific contact relationship

### Example

```javascript
const { ApiClient, ContactsRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsRelationshipsApi();
const contactRelationshipId = "contactRelationshipId_example"; // String | contactRelationshipId to get associated record

// Call api endpoint
apiInstance.getContactRelationship(contactRelationshipId).then(
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
 **contactRelationshipId** | **String**| contactRelationshipId to get associated record | 

### Return type

[**ContactRelationshipTwoSidedDto**](ContactRelationshipTwoSidedDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchContactRelationship

> patchContactRelationship(contactRelationshipId, opts)

Update a contact relationship

### Example

```javascript
const { ApiClient, ContactsRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsRelationshipsApi();
const contactRelationshipId = "contactRelationshipId_example"; // String | contactRelationshipId to update associated record
const opts = {
  'operation': [new irncontacts.Operation()] // [Operation] | contactRelationshipPatch object to update
};

// Call api endpoint
apiInstance.patchContactRelationship(contactRelationshipId, opts).then(
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
 **contactRelationshipId** | **String**| contactRelationshipId to update associated record | 
 **operation** | [**[Operation]**](Operation.md)| contactRelationshipPatch object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

