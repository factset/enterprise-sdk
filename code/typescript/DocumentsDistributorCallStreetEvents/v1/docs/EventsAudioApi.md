# documentsdistributorcallstreetevents.EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocsDistributorAudioV1HistoryFiles**](EventsAudioApi.md#getDocsDistributorAudioV1HistoryFiles) | **GET** /docs-distributor/audio/v1/history-files | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**getDocsDistributorAudioV1ListFiles**](EventsAudioApi.md#getDocsDistributorAudioV1ListFiles) | **GET** /docs-distributor/audio/v1/list-files | Retrieve latest audio recordings and related metadata within FactSet coverage.



## getDocsDistributorAudioV1HistoryFiles

> EventsAudioHistory getDocsDistributorAudioV1HistoryFiles(opts)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 * Returns the **untrimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns the **trimmed** historical audio recordings and related metadata dating back from May 10, 2011 to Dec 31, 2022.    Query parameters can be used to filter and narrow down the results. 

### Example

```javascript
const { ApiClient, EventsAudioApi } = require('@factset/sdk-documentsdistributorcallstreetevents');
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

const apiInstance = new EventsAudioApi();
const opts = {
  'paginationLimit': 25, // Number | Specifies the number of results to return per page. [ Min=0 ; Max=500 ]
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
  'year': 2021, // Number | Specifies the year for which the historical audio recordings and related metadata are to be retrieved.
  'trimmed': true // Boolean | Specifies if trimmed/untrimmed historical audio recordings should be returned.
};

// Call api endpoint
apiInstance.getDocsDistributorAudioV1HistoryFiles(opts).then(
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
 **paginationLimit** | **Number**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] [default to 25]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **year** | **Number**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved. | [optional] 
 **trimmed** | **Boolean**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] [default to false]

### Return type

[**EventsAudioHistory**](EventsAudioHistory.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDocsDistributorAudioV1ListFiles

> EventsAudio getDocsDistributorAudioV1ListFiles(opts)

Retrieve latest audio recordings and related metadata within FactSet coverage.

Returns the latest audio recordings. Query parameters can be used to filter and narrow down the results.

### Example

```javascript
const { ApiClient, EventsAudioApi } = require('@factset/sdk-documentsdistributorcallstreetevents');
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

const apiInstance = new EventsAudioApi();
const opts = {
  'sort': "'-startDate'", // String | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default.
  'paginationLimit': 25, // Number | Specifies the number of results to return per page. [ Min=0 ; Max=500 ]
  'startDate': 2022-01-01T00:00:00.000Z, // String | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday).
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
  'endDate': 2022-06-01T00:00:00.000Z, // String | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today).
  'reportId': 2666621, // Number | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.
  'audioSourceId': 56, // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.
  'ids': ["SPWH-US"], // [String] | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.
  'sourceCode': "sourceCode_example", // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay)
  'fileName': 835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3, // String | This parameter is used to filter the data on based on the file name.
  'trimmed': true, // Boolean | This parameters helps to search trimmed audio files.
  'uploadTime': 56 // Number | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored.
};

// Call api endpoint
apiInstance.getDocsDistributorAudioV1ListFiles(opts).then(
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
 **sort** | **String**| Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. | [optional] [default to &#39;-startDate&#39;]
 **paginationLimit** | **Number**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] [default to 25]
 **startDate** | **String**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **endDate** | **String**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). | [optional] 
 **reportId** | **Number**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. | [optional] 
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. | [optional] 
 **ids** | [**[String]**](String.md)| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. | [optional] 
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] 
 **fileName** | **String**| This parameter is used to filter the data on based on the file name. | [optional] 
 **trimmed** | **Boolean**| This parameters helps to search trimmed audio files. | [optional] 
 **uploadTime** | **Number**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored. | [optional] 

### Return type

[**EventsAudio**](EventsAudio.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

