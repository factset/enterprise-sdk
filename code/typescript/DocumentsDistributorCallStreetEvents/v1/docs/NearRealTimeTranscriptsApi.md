# documentsdistributorcallstreetevents.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment
[**getBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1ListSnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest snippets from an active call
[**getBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



## getBulkDocumentsNrtV1Calls

> NRTCalls getBulkDocumentsNrtV1Calls(opts)

Returns the active calls happening at the moment

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
  'sort': "'-startDate'", // String | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used
  'reportId': 56, // Number | Unique identifier for an event
  'audioSourceId': 56, // Number | Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids.
  'entityId': "entityId_example", // String | Factset entity level identifier for the company hosting the event
  'ticker': "ticker_example", // String | Ticker-region identifier for the company hosting the event
  'callStatus': "callStatus_example", // String | Status of the call i.e. ended or inProgress or ewn or issueAtSource
  'paginationLimit': 56, // Number | Specifies the number of results to return per page.[ Min=0 ; Max=500 ]
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
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
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used | [optional] [default to &#39;-startDate&#39;]
 **reportId** | **Number**| Unique identifier for an event | [optional] 
 **audioSourceId** | **Number**| Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. | [optional] 
 **entityId** | **String**| Factset entity level identifier for the company hosting the event | [optional] 
 **ticker** | **String**| Ticker-region identifier for the company hosting the event | [optional] 
 **callStatus** | **String**| Status of the call i.e. ended or inProgress or ewn or issueAtSource | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type

[**NRTCalls**](NRTCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBulkDocumentsNrtV1ListSnippets

> NRTSnippets getBulkDocumentsNrtV1ListSnippets(audioSourceId, opts)

Returns the latest snippets from an active call

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
const audioSourceId = 56; // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids.
const opts = {
  'reportId': 56, // Number | Unique identifier for an event
  'paginationLimit': 56, // Number | Specifies the  number of results to return per page. [ Min=0; Max=500 ]
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
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
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. | 
 **reportId** | **Number**| Unique identifier for an event | [optional] 
 **paginationLimit** | **Number**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500 ] | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

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
const audioSourceId = 56; // Number | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids. 
const opts = {
  'sort': "'startDate'", // String | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used
  'paginationLimit': 56, // Number | Specifies the number of results to return per page.[ Min=0 ; Max=500 ]
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
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
 **audioSourceId** | **Number**| The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.  | 
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used | [optional] [default to &#39;startDate&#39;]
 **paginationLimit** | **Number**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type

[**NRTSpeakerids**](NRTSpeakerids.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

