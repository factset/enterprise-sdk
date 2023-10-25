# documentsdistributorcallstreetevents.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment.
[**getBulkDocumentsNrtV1IndexedNrt**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1IndexedNrt) | **GET** /bulk-documents/nrt/v1/indexed-nrt | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**getBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1ListSnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest transcript snippets from an active call.
[**getBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



## getBulkDocumentsNrtV1Calls

> NRTCalls getBulkDocumentsNrtV1Calls(opts)

Returns the active calls happening at the moment.

Returns the active calls happening at the moment

### Example

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-documentsdistributorcallstreetevents');
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
  'paginationLimit': 5, // Number | Specifies the  number of results to return per page. [ Min=0; Max=500]
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
  'audioSourceId': 471849, // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
  'reportId': 2683372, // Number | Unique identifier for an event.
  'sort': "'-startDate'", // String | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used.
  'entityId': 000CGP-E, // String | Factset entity level identifier for the company hosting the event.
  'ticker': AZZ-US, // String | Ticker-region identifier for the company hosting the event.
  'callStatus': "callStatus_example" // String | Status of the call i.e. ended or inProgress or ewn or issueAtSource.
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
 **paginationLimit** | **Number**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional] 
 **reportId** | **Number**| Unique identifier for an event. | [optional] 
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used. | [optional] [default to &#39;-startDate&#39;]
 **entityId** | **String**| Factset entity level identifier for the company hosting the event. | [optional] 
 **ticker** | **String**| Ticker-region identifier for the company hosting the event. | [optional] 
 **callStatus** | **String**| Status of the call i.e. ended or inProgress or ewn or issueAtSource. | [optional] 

### Return type

[**NRTCalls**](NRTCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1IndexedNrt

> IndexedNRT getBulkDocumentsNrtV1IndexedNrt(audioSourceId, opts)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-documentsdistributorcallstreetevents');
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
  'paginationLimit': 5, // Number | Specifies the  number of results to return per page. [ Min=0; Max=50 ]
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
  'reportId': 2683372 // Number | Unique identifier for an event.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1IndexedNrt(audioSourceId, opts).then(
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
 **paginationLimit** | **Number**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] | [optional] [default to 25]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **reportId** | **Number**| Unique identifier for an event. | [optional] 

### Return type

[**IndexedNRT**](IndexedNRT.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1ListSnippets

> NRTSnippets getBulkDocumentsNrtV1ListSnippets(audioSourceId, opts)

Returns the latest transcript snippets from an active call.

Returns the latest snippets from an active call

### Example

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-documentsdistributorcallstreetevents');
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
  'paginationLimit': 5, // Number | Specifies the  number of results to return per page. [ Min=0; Max=500]
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
  'reportId': 2683372 // Number | Unique identifier for an event.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1ListSnippets(audioSourceId, opts).then(
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
 **paginationLimit** | **Number**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **reportId** | **Number**| Unique identifier for an event. | [optional] 

### Return type

[**NRTSnippets**](NRTSnippets.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1Speakerids

> NRTSpeakerids getBulkDocumentsNrtV1Speakerids(audioSourceId, opts)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.

### Example

```javascript
const { ApiClient, NearRealTimeTranscriptsApi } = require('@factset/sdk-documentsdistributorcallstreetevents');
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
  'paginationLimit': 5, // Number | Specifies the  number of results to return per page. [ Min=0; Max=500]
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
  'sort': "'startDate'" // String | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used.
};

// Call api endpoint
apiInstance.getBulkDocumentsNrtV1Speakerids(audioSourceId, opts).then(
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
 **paginationLimit** | **Number**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used. | [optional] [default to &#39;startDate&#39;]

### Return type

[**NRTSpeakerids**](NRTSpeakerids.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

