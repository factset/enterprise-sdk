# irncontacts.RelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RelationshipsGet**](RelationshipsApi.md#v1RelationshipsGet) | **GET** /v1/relationships | Get list of the relationships configured in your group
[**v1RelationshipsPost**](RelationshipsApi.md#v1RelationshipsPost) | **POST** /v1/relationships | Create a relationship type
[**v1RelationshipsRelationshipIdDelete**](RelationshipsApi.md#v1RelationshipsRelationshipIdDelete) | **DELETE** /v1/relationships/{relationshipId} | Delete a relationship type
[**v1RelationshipsRelationshipIdPut**](RelationshipsApi.md#v1RelationshipsRelationshipIdPut) | **PUT** /v1/relationships/{relationshipId} | Edit a relationship type



## v1RelationshipsGet

> [RelationshipDto] v1RelationshipsGet(opts)

Get list of the relationships configured in your group

### Example

```javascript
const { ApiClient, RelationshipsApi } = require('@factset/sdk-irncontacts');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new RelationshipsApi();
const opts = {
  'type': new irncontacts.RelationshipType() // RelationshipType | 
};

// Call api endpoint
apiInstance.v1RelationshipsGet(opts).then(
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
 **type** | [**RelationshipType**](.md)|  | [optional] 

### Return type

[**[RelationshipDto]**](RelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1RelationshipsPost

> String v1RelationshipsPost(opts)

Create a relationship type

### Example

```javascript
const { ApiClient, RelationshipsApi } = require('@factset/sdk-irncontacts');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new RelationshipsApi();
const opts = {
  'relationshipSaveDto': new irncontacts.RelationshipSaveDto() // RelationshipSaveDto | RelationshipSaveDto object to save
};

// Call api endpoint
apiInstance.v1RelationshipsPost(opts).then(
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
 **relationshipSaveDto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to save | [optional] 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## v1RelationshipsRelationshipIdDelete

> v1RelationshipsRelationshipIdDelete(relationshipId)

Delete a relationship type

### Example

```javascript
const { ApiClient, RelationshipsApi } = require('@factset/sdk-irncontacts');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new RelationshipsApi();
const relationshipId = "relationshipId_example"; // String | relationshipId to delete associated record

// Call api endpoint
apiInstance.v1RelationshipsRelationshipIdDelete(relationshipId).then(
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
 **relationshipId** | **String**| relationshipId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1RelationshipsRelationshipIdPut

> v1RelationshipsRelationshipIdPut(relationshipId, opts)

Edit a relationship type

### Example

```javascript
const { ApiClient, RelationshipsApi } = require('@factset/sdk-irncontacts');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new RelationshipsApi();
const relationshipId = "relationshipId_example"; // String | relationshipId to update associated record
const opts = {
  'relationshipSaveDto': new irncontacts.RelationshipSaveDto() // RelationshipSaveDto | RelationshipSaveDto object to update
};

// Call api endpoint
apiInstance.v1RelationshipsRelationshipIdPut(relationshipId, opts).then(
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
 **relationshipId** | **String**| relationshipId to update associated record | 
 **relationshipSaveDto** | [**RelationshipSaveDto**](RelationshipSaveDto.md)| RelationshipSaveDto object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

