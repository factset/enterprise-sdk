# irncontacts.ContactsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ContactsContactIdAboutGet**](ContactsApi.md#v1ContactsContactIdAboutGet) | **GET** /v1/contacts/{contactId}/about | Get the About field content for a specific contact
[**v1ContactsContactIdDelete**](ContactsApi.md#v1ContactsContactIdDelete) | **DELETE** /v1/contacts/{contactId} | Delete a contact
[**v1ContactsContactIdEventsGet**](ContactsApi.md#v1ContactsContactIdEventsGet) | **GET** /v1/contacts/{contactId}/events | Get a contact’s audit history
[**v1ContactsContactIdGet**](ContactsApi.md#v1ContactsContactIdGet) | **GET** /v1/contacts/{contactId} | Get all custom field and standard field details on a specific contact
[**v1ContactsContactIdPatch**](ContactsApi.md#v1ContactsContactIdPatch) | **PATCH** /v1/contacts/{contactId} | Edit a contact’s standard field and custom field data
[**v1ContactsContactIdRecordsGet**](ContactsApi.md#v1ContactsContactIdRecordsGet) | **GET** /v1/contacts/{contactId}/records | Get all notes and meetings where a specific contact was tagged
[**v1ContactsContactIdRelationshipsGet**](ContactsApi.md#v1ContactsContactIdRelationshipsGet) | **GET** /v1/contacts/{contactId}/relationships | Returns a list of a contact’s relationships
[**v1ContactsGet**](ContactsApi.md#v1ContactsGet) | **GET** /v1/contacts | Get list of all contacts in your group along with some of their standard field data
[**v1ContactsPost**](ContactsApi.md#v1ContactsPost) | **POST** /v1/contacts | Create a contact



## v1ContactsContactIdAboutGet

> String v1ContactsContactIdAboutGet(contactId)

Get the About field content for a specific contact

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId of associated record

// Call api endpoint
apiInstance.v1ContactsContactIdAboutGet(contactId).then(
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
 **contactId** | **String**| contactId of associated record | 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsContactIdDelete

> v1ContactsContactIdDelete(contactId)

Delete a contact

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId to delete associated record

// Call api endpoint
apiInstance.v1ContactsContactIdDelete(contactId).then(
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
 **contactId** | **String**| contactId to delete associated record | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsContactIdEventsGet

> [ContactEventDto] v1ContactsContactIdEventsGet(contactId)

Get a contact’s audit history

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId to get associated records

// Call api endpoint
apiInstance.v1ContactsContactIdEventsGet(contactId).then(
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
 **contactId** | **String**| contactId to get associated records | 

### Return type

[**[ContactEventDto]**](ContactEventDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsContactIdGet

> ContactDto v1ContactsContactIdGet(contactId)

Get all custom field and standard field details on a specific contact

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId to get associated record

// Call api endpoint
apiInstance.v1ContactsContactIdGet(contactId).then(
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
 **contactId** | **String**| contactId to get associated record | 

### Return type

[**ContactDto**](ContactDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsContactIdPatch

> v1ContactsContactIdPatch(contactId, opts)

Edit a contact’s standard field and custom field data

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId to update associated record
const opts = {
  'operation': [new irncontacts.Operation()] // [Operation] | contactSaveDtoPatch object to update
};

// Call api endpoint
apiInstance.v1ContactsContactIdPatch(contactId, opts).then(
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
 **contactId** | **String**| contactId to update associated record | 
 **operation** | [**[Operation]**](Operation.md)| contactSaveDtoPatch object to update | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## v1ContactsContactIdRecordsGet

> [RecordPreviewDto] v1ContactsContactIdRecordsGet(contactId)

Get all notes and meetings where a specific contact was tagged

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId to get associated records

// Call api endpoint
apiInstance.v1ContactsContactIdRecordsGet(contactId).then(
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
 **contactId** | **String**| contactId to get associated records | 

### Return type

[**[RecordPreviewDto]**](RecordPreviewDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsContactIdRelationshipsGet

> [ContactRelationshipDto] v1ContactsContactIdRelationshipsGet(contactId)

Returns a list of a contact’s relationships

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const contactId = "contactId_example"; // String | contactId to get associated records

// Call api endpoint
apiInstance.v1ContactsContactIdRelationshipsGet(contactId).then(
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
 **contactId** | **String**| contactId to get associated records | 

### Return type

[**[ContactRelationshipDto]**](ContactRelationshipDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsGet

> [ContactSummaryDto] v1ContactsGet(opts)

Get list of all contacts in your group along with some of their standard field data

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const opts = {
  'fullName': "fullName_example", // String | Filter results on fullName
  'emailAddress': "emailAddress_example", // String | Filter results on emailAddress
  'identifier': "identifier_example", // String | Filter results on identifier
  'employerName': "employerName_example", // String | Filter results on employerName
  'customFieldValues': false, // Boolean | Includes custom field values in response if true
  'search': "search_example", // String | Filter results on the combination of fullName, emailAddress, identifier and employerName
  'sort': "sort_example", // String | 
  'includeLastMeetingDate': false, // Boolean | If true, returns when they were last tagged as an attendee in an IRN meeting
  'limit': 0 // Number | Restrict number of records returned
};

// Call api endpoint
apiInstance.v1ContactsGet(opts).then(
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
 **fullName** | **String**| Filter results on fullName | [optional] 
 **emailAddress** | **String**| Filter results on emailAddress | [optional] 
 **identifier** | **String**| Filter results on identifier | [optional] 
 **employerName** | **String**| Filter results on employerName | [optional] 
 **customFieldValues** | **Boolean**| Includes custom field values in response if true | [optional] [default to false]
 **search** | **String**| Filter results on the combination of fullName, emailAddress, identifier and employerName | [optional] 
 **sort** | **String**|  | [optional] 
 **includeLastMeetingDate** | **Boolean**| If true, returns when they were last tagged as an attendee in an IRN meeting | [optional] [default to false]
 **limit** | **Number**| Restrict number of records returned | [optional] [default to 0]

### Return type

[**[ContactSummaryDto]**](ContactSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ContactsPost

> String v1ContactsPost(opts)

Create a contact

### Example

```javascript
const { ApiClient, ContactsApi } = require('@factset/sdk-irncontacts');
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

const apiInstance = new ContactsApi();
const opts = {
  'contactSaveDto': new irncontacts.ContactSaveDto() // ContactSaveDto | contactSaveDto object to save
};

// Call api endpoint
apiInstance.v1ContactsPost(opts).then(
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
 **contactSaveDto** | [**ContactSaveDto**](ContactSaveDto.md)| contactSaveDto object to save | [optional] 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

