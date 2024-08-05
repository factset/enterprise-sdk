# irnnotes.NotesApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNote**](NotesApi.md#createNote) | **POST** /notes | Create a note
[**deleteNote**](NotesApi.md#deleteNote) | **DELETE** /notes/{noteId} | Delete a Note
[**getNote**](NotesApi.md#getNote) | **GET** /notes/{noteId} | Get details of a note
[**getNotes**](NotesApi.md#getNotes) | **GET** /notes | Get all the notes in the specified date range filtered on the given identifiers
[**updateNote**](NotesApi.md#updateNote) | **PUT** /notes/{noteId} | Updates a note by replacing existing note with new data



## createNote

> NewItemDto createNote(createNoteDto, opts)

Create a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NotesApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new NotesApi();
const createNoteDto = new irnnotes.CreateNoteDto(); // CreateNoteDto | 
const opts = {
  'xIRNContributorUsername': "xIRNContributorUsername_example", // String | 
  'xIRNContributorSerial': "xIRNContributorSerial_example" // String | 
};

// Call api endpoint
apiInstance.createNote(createNoteDto, opts).then(
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
 **createNoteDto** | [**CreateNoteDto**](CreateNoteDto.md)|  | 
 **xIRNContributorUsername** | **String**|  | [optional] 
 **xIRNContributorSerial** | **String**|  | [optional] 

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json


## deleteNote

> deleteNote(noteId)

Delete a Note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NotesApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new NotesApi();
const noteId = "noteId_example"; // String | Note Id

// Call api endpoint
apiInstance.deleteNote(noteId).then(
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
 **noteId** | **String**| Note Id | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNote

> NoteDto getNote(noteId)

Get details of a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NotesApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new NotesApi();
const noteId = "noteId_example"; // String | Note Id

// Call api endpoint
apiInstance.getNote(noteId).then(
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
 **noteId** | **String**| Note Id | 

### Return type

[**NoteDto**](NoteDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotes

> [NoteSummaryDto] getNotes(opts)

Get all the notes in the specified date range filtered on the given identifiers

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NotesApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new NotesApi();
const opts = {
  'start': "start_example", // String | StartDate
  'end': "end_example", // String | EndDate
  'identifiers': ["null"], // [String] | Set of identifiers to filter on
  'authors': ["null"], // [String] | Set of authors to filter on
  'subjects': ["null"], // [String] | Set of subjects to filter on
  'recommendations': ["null"], // [String] | Set of recommendations to filter on
  'sentiments': ["null"], // [String] | Set of sentiments to filter on
  'limit': 56, // Number | Limit on the number of notes retrieved
  'offset': 56, // Number | Fetch notes after the offset
  'modifiedSince': "modifiedSince_example", // String | Only return notes which have been modified or created since a particular time
  'states': ["null"], // [String] | Set of states to filter on
  'filterOnRelatedSymbols': false, // Boolean | Include notes whose related symbols match the identifier filter
  'includeRelatedEntities': false, // Boolean | When set to true fetches notes tagged with all the entities related to identifiers param
  'xIRNIncludeDeleted': false // Boolean | 
};

// Call api endpoint
apiInstance.getNotes(opts).then(
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
 **start** | **String**| StartDate | [optional] 
 **end** | **String**| EndDate | [optional] 
 **identifiers** | [**[String]**](String.md)| Set of identifiers to filter on | [optional] 
 **authors** | [**[String]**](String.md)| Set of authors to filter on | [optional] 
 **subjects** | [**[String]**](String.md)| Set of subjects to filter on | [optional] 
 **recommendations** | [**[String]**](String.md)| Set of recommendations to filter on | [optional] 
 **sentiments** | [**[String]**](String.md)| Set of sentiments to filter on | [optional] 
 **limit** | **Number**| Limit on the number of notes retrieved | [optional] 
 **offset** | **Number**| Fetch notes after the offset | [optional] 
 **modifiedSince** | **String**| Only return notes which have been modified or created since a particular time | [optional] 
 **states** | [**[String]**](String.md)| Set of states to filter on | [optional] 
 **filterOnRelatedSymbols** | **Boolean**| Include notes whose related symbols match the identifier filter | [optional] [default to false]
 **includeRelatedEntities** | **Boolean**| When set to true fetches notes tagged with all the entities related to identifiers param | [optional] [default to false]
 **xIRNIncludeDeleted** | **Boolean**|  | [optional] [default to false]

### Return type

[**[NoteSummaryDto]**](NoteSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateNote

> updateNote(noteId, opts)

Updates a note by replacing existing note with new data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NotesApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new NotesApi();
const noteId = "noteId_example"; // String | Note Id
const opts = {
  'updateNoteDto': new irnnotes.UpdateNoteDto() // UpdateNoteDto | The new data for the note
};

// Call api endpoint
apiInstance.updateNote(noteId, opts).then(
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
 **noteId** | **String**| Note Id | 
 **updateNoteDto** | [**UpdateNoteDto**](UpdateNoteDto.md)| The new data for the note | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

