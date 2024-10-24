# eventsandtranscripts.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Calls) | **GET** /nrt/by-ticker | Returns the active calls happening at the moment based on ticker,call status and entity ID.
[**getBulkDocumentsNrtV1CallsByAudioSourceId**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1CallsByAudioSourceId) | **GET** /nrt/by-ids | Returns the active calls happening at the moment based on audio source ID and report ID.
[**getBulkDocumentsNrtV1Indexedrt**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Indexedrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**getBulkDocumentsNrtV1SpeakerIds**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1SpeakerIds) | **GET** /nrt/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



## getBulkDocumentsNrtV1Calls

> NrtCalls getBulkDocumentsNrtV1Calls(opts)

Returns the active calls happening at the moment based on ticker,call status and entity ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new NearRealTimeTranscriptsApi();
const opts = {
  'ticker': AZZ-US, // String | Ticker-region identifier for the company hosting the event.
  'entityId': 000CGP-E, // String | Factset entity level identifier for the company hosting the event.
  'callStatus': Ended, // String | Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource.
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1Calls(opts).then(
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
 **ticker** | **String**| Ticker-region identifier for the company hosting the event. | [optional] 
 **entityId** | **String**| Factset entity level identifier for the company hosting the event. | [optional] 
 **callStatus** | **String**| Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1CallsByAudioSourceId

> NrtCalls getBulkDocumentsNrtV1CallsByAudioSourceId(opts)

Returns the active calls happening at the moment based on audio source ID and report ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new NearRealTimeTranscriptsApi();
const opts = {
  'audioSourceId': 471849, // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
  'reportId': 2683372, // Number | Unique identifier for an event.
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1CallsByAudioSourceId(opts).then(
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
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional] 
 **reportId** | **Number**| Unique identifier for an event. | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1Indexedrt

> IndexedNrt getBulkDocumentsNrtV1Indexedrt(audioSourceId, opts)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new NearRealTimeTranscriptsApi();
const audioSourceId = 471849; // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
const opts = {
  'paginationLimit': 5, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1Indexedrt(audioSourceId, opts).then(
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
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**IndexedNrt**](IndexedNrt.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1SpeakerIds

> NrtSpeakerIds getBulkDocumentsNrtV1SpeakerIds(audioSourceId, opts)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the confidence scores generated for an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new NearRealTimeTranscriptsApi();
const audioSourceId = 471849; // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
const opts = {
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on the start offset of the speaker. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1SpeakerIds(audioSourceId, opts).then(
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
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**NrtSpeakerIds**](NrtSpeakerIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

