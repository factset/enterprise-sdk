# eventsandtranscripts.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndexedNrt**](NearRealTimeTranscriptsApi.md#getIndexedNrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**getSpeakerIds**](NearRealTimeTranscriptsApi.md#getSpeakerIds) | **GET** /nrt/speaker-ids | Returns the latest speakerIds with the confidence scores generated for an active call.
[**searchNrtCalls**](NearRealTimeTranscriptsApi.md#searchNrtCalls) | **POST** /nrt/calls | Returns the active calls happening at the moment based on ticker/entity or specific IDs.



## getIndexedNrt

> IndexedNrtResponse getIndexedNrt(audioSourceId, opts)

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
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
};

// Call api endpoint
apiInstance.getIndexedNrt(audioSourceId, opts).then(
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
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**IndexedNrtResponse**](IndexedNrtResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSpeakerIds

> NrtSpeakerIdsResponse getSpeakerIds(audioSourceId, opts)

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
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
};

// Call api endpoint
apiInstance.getSpeakerIds(audioSourceId, opts).then(
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
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**NrtSpeakerIdsResponse**](NrtSpeakerIdsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## searchNrtCalls

> NrtCallsResponse searchNrtCalls(nrtCallsRequest)

Returns the active calls happening at the moment based on ticker/entity or specific IDs.

Retrieves active Near Real-Time (NRT) calls based on either ticker/entity/status criteria or specific audio source/report IDs. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object. 

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
const nrtCallsRequest = new eventsandtranscripts.NrtCallsRequest(); // NrtCallsRequest | Criteria to search for NRT calls. Select one mode of search.

// Call api endpoint
apiInstance.searchNrtCalls(nrtCallsRequest).then(
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
 **nrtCallsRequest** | [**NrtCallsRequest**](NrtCallsRequest.md)| Criteria to search for NRT calls. Select one mode of search. | 

### Return type

[**NrtCallsResponse**](NrtCallsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

