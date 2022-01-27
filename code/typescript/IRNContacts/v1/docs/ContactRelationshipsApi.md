# irncontacts.ContactRelationshipsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ContactRelationshipsContactRelationshipIdDelete**](ContactRelationshipsApi.md#v1ContactRelationshipsContactRelationshipIdDelete) | **DELETE** /v1/contact-relationships/{contactRelationshipId} | Delete a contact relationship
[**v1ContactRelationshipsContactRelationshipIdGet**](ContactRelationshipsApi.md#v1ContactRelationshipsContactRelationshipIdGet) | **GET** /v1/contact-relationships/{contactRelationshipId} | Get details on a specific contact relationship
[**v1ContactRelationshipsContactRelationshipIdPatch**](ContactRelationshipsApi.md#v1ContactRelationshipsContactRelationshipIdPatch) | **PATCH** /v1/contact-relationships/{contactRelationshipId} | Update a contact relationship
[**v1ContactRelationshipsGet**](ContactRelationshipsApi.md#v1ContactRelationshipsGet) | **GET** /v1/contact-relationships | Get all the relationships where the given symbol or contact identifier has been tagged in a relationship
[**v1ContactRelationshipsPost**](ContactRelationshipsApi.md#v1ContactRelationshipsPost) | **POST** /v1/contact-relationships | Create a contact relationship



## v1ContactRelationshipsContactRelationshipIdDelete

> v1ContactRelationshipsContactRelationshipIdDelete(contactRelationshipId)

Delete a contact relationship

### Example

```javascript
const { ApiClient, ContactRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactRelationshipsApi();
const contactRelationshipId = "contactRelationshipId_example"; // String | contactRelationshipId to delete associated record

// Call api endpoint
apiInstance.v1ContactRelationshipsContactRelationshipIdDelete(contactRelationshipId).then(
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


## v1ContactRelationshipsContactRelationshipIdGet

> ContactRelationshipTwoSidedDto v1ContactRelationshipsContactRelationshipIdGet(contactRelationshipId)

Get details on a specific contact relationship

### Example

```javascript
const { ApiClient, ContactRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactRelationshipsApi();
const contactRelationshipId = "contactRelationshipId_example"; // String | contactRelationshipId to get associated record

// Call api endpoint
apiInstance.v1ContactRelationshipsContactRelationshipIdGet(contactRelationshipId).then(
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


## v1ContactRelationshipsContactRelationshipIdPatch

> v1ContactRelationshipsContactRelationshipIdPatch(contactRelationshipId, opts)

Update a contact relationship

### Example

```javascript
const { ApiClient, ContactRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactRelationshipsApi();
const contactRelationshipId = "contactRelationshipId_example"; // String | contactRelationshipId to update associated record
const opts = {
  'operation': [new irncontacts.Operation()] // [Operation] | contactRelationshipPatch object to update
};

// Call api endpoint
apiInstance.v1ContactRelationshipsContactRelationshipIdPatch(contactRelationshipId, opts).then(
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


## v1ContactRelationshipsGet

> [ContactRelationshipTwoSidedDto] v1ContactRelationshipsGet(opts)

Get all the relationships where the given symbol or contact identifier has been tagged in a relationship

### Example

```javascript
const { ApiClient, ContactRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactRelationshipsApi();
const opts = {
  'symbol': "symbol_example", // String | 
  'contactId': "contactId_example", // String | 
  'relationshipId': "relationshipId_example" // String | 
};

// Call api endpoint
apiInstance.v1ContactRelationshipsGet(opts).then(
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


## v1ContactRelationshipsPost

> v1ContactRelationshipsPost(opts)

Create a contact relationship

### Example

```javascript
const { ApiClient, ContactRelationshipsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactRelationshipsApi();
const opts = {
  'contactRelationshipTwoSidedSaveDto': new irncontacts.ContactRelationshipTwoSidedSaveDto() // ContactRelationshipTwoSidedSaveDto | contactRelationship object to save
};

// Call api endpoint
apiInstance.v1ContactRelationshipsPost(opts).then(
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
 **contactRelationshipTwoSidedSaveDto** | [**ContactRelationshipTwoSidedSaveDto**](ContactRelationshipTwoSidedSaveDto.md)| contactRelationship object to save | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

