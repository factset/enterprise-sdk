# eventsandtranscripts.EventsAudioApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocsDistributorAudioV1HistoryFiles**](EventsAudioApi.md#getDocsDistributorAudioV1HistoryFiles) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**getDocsDistributorAudioV1ListFilesDate**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesDate) | **GET** /audio/by-date | Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
[**getDocsDistributorAudioV1ListFilesFileName**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesFileName) | **GET** /audio/by-file-name | Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
[**getDocsDistributorAudioV1ListFilesIds**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesIds) | **GET** /audio/by-ids | Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
[**getDocsDistributorAudioV1ListFilesUploadTime**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesUploadTime) | **GET** /audio/by-upload-time | Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.



## getDocsDistributorAudioV1HistoryFiles

> EventsAudioHistory getDocsDistributorAudioV1HistoryFiles(year, opts)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music &amp; non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2022. 

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
apiInstance.getDocsDistributorAudioV1HistoryFiles(year, opts).then(
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

[**EventsAudioHistory**](EventsAudioHistory.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDocsDistributorAudioV1ListFilesDate

> EventsAudioDaily getDocsDistributorAudioV1ListFilesDate(opts)

Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.

Retrieves the most recent audio recordings based on specified dates and allows filtering through both source code and Ids.

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
const opts = {
  'startDate': 2020-10-01T00:00:00.000Z, // Date | The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD). 
  'endDate': 2020-12-26T00:00:00.000Z, // Date | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). 
  'startDateRelative': 56, // Number | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.* 
  'endDateRelative': 56, // Number | The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  - Either `endDate` or `endDateRelative` should be used, but not both. - If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error. - If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data. 
  'sourceCode': Webcast, // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay
  'ids': ["SPWH-US"], // [String] | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. 
  'trimmed': false, // Boolean | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022. 
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on startDate. 
  'paginationLimit': 25, // Number | Specifies the number of results to return per page.
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getDocsDistributorAudioV1ListFilesDate(opts).then(
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
 **startDate** | **Date**| The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  | [optional] 
 **endDate** | **Date**| The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  | [optional] 
 **startDateRelative** | **Number**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional] 
 **endDateRelative** | **Number**| The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  | [optional] 
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] 
 **ids** | [**[String]**](String.md)| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional] 
 **trimmed** | **Boolean**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] [default to false]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDocsDistributorAudioV1ListFilesFileName

> EventsAudioDailyFileName getDocsDistributorAudioV1ListFilesFileName(opts)

Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.

Retrieves the latest audio recordings corresponding to the provided file name.

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
const opts = {
  'fileName': 835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3 // String | This parameter is used to filter the data on based on the file name.
};

// Call api endpoint
apiInstance.getDocsDistributorAudioV1ListFilesFileName(opts).then(
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
 **fileName** | **String**| This parameter is used to filter the data on based on the file name. | [optional] 

### Return type

[**EventsAudioDailyFileName**](EventsAudioDailyFileName.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDocsDistributorAudioV1ListFilesIds

> EventsAudioDailyIds getDocsDistributorAudioV1ListFilesIds(opts)

Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.

Retrieves the latest audio recordings based on the provided report ID and audio source ID.

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
const opts = {
  'reportId': 3015749, // Number | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. 
  'audioSourceId': 594948, // Number | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. 
  'trimmed': false // Boolean | This parameters helps to search trimmed audio files.
};

// Call api endpoint
apiInstance.getDocsDistributorAudioV1ListFilesIds(opts).then(
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
 **reportId** | **Number**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  | [optional] 
 **audioSourceId** | **Number**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  | [optional] 
 **trimmed** | **Boolean**| This parameters helps to search trimmed audio files. | [optional] [default to false]

### Return type

[**EventsAudioDailyIds**](EventsAudioDailyIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDocsDistributorAudioV1ListFilesUploadTime

> EventsAudioDaily getDocsDistributorAudioV1ListFilesUploadTime(opts)

Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.

Returns the latest audio recordings based on upload time and allows filtering through both source code and Ids.

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
const opts = {
  'uploadTime': -20, // Number | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168
  'sourceCode': Webcast, // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay
  'ids': ["SNA-AR"], // [String] | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. 
  'trimmed': false, // Boolean | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022. 
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on uploadTime. 
  'paginationLimit': 25, // Number | Specifies the number of results to return per page.
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getDocsDistributorAudioV1ListFilesUploadTime(opts).then(
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
 **uploadTime** | **Number**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168 | [optional] 
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] 
 **ids** | [**[String]**](String.md)| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional] 
 **trimmed** | **Boolean**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] [default to false]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on uploadTime.  | [optional] 
 **paginationLimit** | **Number**| Specifies the number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

