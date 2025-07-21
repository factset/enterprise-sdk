# eventsandtranscripts.EventsAudioApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAudioHistoryFiles**](EventsAudioApi.md#getAudioHistoryFiles) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**searchEventsAudio**](EventsAudioApi.md#searchEventsAudio) | **POST** /audio | Retrieve latest audio recordings and related metadata based on different search criteria.



## getAudioHistoryFiles

> EventsAudioHistoryResponse getAudioHistoryFiles(year, opts)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music &amp; non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2024.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2024. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EventsAudioApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new EventsAudioApi();
const year = 2021; // Number | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. 
const opts = {
  'trimmed': true // Boolean | Specifies if trimmed/untrimmed historical audio recordings should be returned.
};

// Call api endpoint
apiInstance.getAudioHistoryFiles(year, opts).then(
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
 **year** | **Number**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  | 
 **trimmed** | **Boolean**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] [default to false]

### Return type

[**EventsAudioHistoryResponse**](EventsAudioHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## searchEventsAudio

> AudioResponse searchEventsAudio(audioRequest)

Retrieve latest audio recordings and related metadata based on different search criteria.

Retrieves the most recent audio recordings and their metadata based on various criteria like date range, upload time, file name, or specific IDs. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EventsAudioApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new EventsAudioApi();
const audioRequest = new eventsandtranscripts.AudioRequest(); // AudioRequest | Criteria to search for audio files. Select one mode of search.

// Call api endpoint
apiInstance.searchEventsAudio(audioRequest).then(
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
 **audioRequest** | [**AudioRequest**](AudioRequest.md)| Criteria to search for audio files. Select one mode of search. | 

### Return type

[**AudioResponse**](AudioResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

