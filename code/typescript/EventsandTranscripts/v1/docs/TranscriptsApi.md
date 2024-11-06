# eventsandtranscripts.TranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimezone**](TranscriptsApi.md#getTimezone) | **GET** /reference/time-zones | Returns the time zones.
[**getTranscripts**](TranscriptsApi.md#getTranscripts) | **GET** /transcripts/search | Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
[**getTranscriptsDates**](TranscriptsApi.md#getTranscriptsDates) | **GET** /transcripts/dates | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
[**getTranscriptsEvents**](TranscriptsApi.md#getTranscriptsEvents) | **GET** /transcripts/events | Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
[**getTranscriptsIds**](TranscriptsApi.md#getTranscriptsIds) | **GET** /transcripts/ids | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
[**getTranscriptsTime**](TranscriptsApi.md#getTranscriptsTime) | **GET** /transcripts/times | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.
[**getcategories**](TranscriptsApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



## getTimezone

> ResponseTime getTimezone()

Returns the time zones.

Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();

// Call api endpoint
apiInstance.getTimezone().then(
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

This endpoint does not need any parameter.

### Return type

[**ResponseTime**](ResponseTime.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscripts

> Transcripts getTranscripts(opts)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();
const opts = {
  'searchText': Updates, // String | Restricts the search to include only document stories which include the text searched.
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getTranscripts(opts).then(
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
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscriptsDates

> Transcripts getTranscriptsDates(opts)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();
const opts = {
  'startDate': 2020-10-01, // Date | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.** 
  'endDate': 2020-12-26, // Date | End Date. Format is YYYY-MM-DD.
  'startDateRelative': 56, // Number | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.* 
  'endDateRelative': 56, // Number | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.* 
  'timeZone': America/New_York, // String | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone.
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getTranscriptsDates(opts).then(
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
 **startDate** | **Date**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] 
 **endDate** | **Date**| End Date. Format is YYYY-MM-DD. | [optional] 
 **startDateRelative** | **Number**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional] 
 **endDateRelative** | **Number**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional] 
 **timeZone** | **String**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. | [optional] [default to &#39;America/New_York&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscriptsEvents

> Transcripts getTranscriptsEvents(opts)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();
const opts = {
  'eventIds': ["1202993804"], // [String] | Requests Event IDs. This is a comma-separated list with a maximum limit of 1000.
  'eventType': Earnings, // String | Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition).
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getTranscriptsEvents(opts).then(
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
 **eventIds** | [**[String]**](String.md)| Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. | [optional] 
 **eventType** | **String**| Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscriptsIds

> TranscriptsOne getTranscriptsIds(opts)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();
const opts = {
  'primaryId': false, // Boolean | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier.
  'ids': ["RTO-GB"], // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
  'startDate': 2020-10-01, // Date | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.** 
  'endDate': 2020-12-26, // Date | End Date. Format is YYYY-MM-DD.
  'searchText': Updates, // String | Restricts the search to include only document stories which include the text searched.
  'reportIds': ["3022837"], // [String] | Requests Report IDs. This is a comma-separated list with a maximum limit of 1000
  'categories': ["CN:GB"], // [String] | Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories.
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getTranscriptsIds(opts).then(
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
 **primaryId** | **Boolean**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **ids** | [**[String]**](String.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **startDate** | **Date**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] 
 **endDate** | **Date**| End Date. Format is YYYY-MM-DD. | [optional] 
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **reportIds** | [**[String]**](String.md)| Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 | [optional] 
 **categories** | [**[String]**](String.md)| Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**TranscriptsOne**](TranscriptsOne.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscriptsTime

> TranscriptsTimes getTranscriptsTime(opts)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();
const opts = {
  'startDateTime': 2020-10-01T00:00:00Z, // Date |  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**   
  'endDateTime': 2020-10-26T10:00:00Z, // Date | The date to which data is required
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page. Maximum value: 1000. 
  'paginationOffset': 0 // Number | Page number of the results to return.
};

// Call api endpoint
apiInstance.getTranscriptsTime(opts).then(
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
 **startDateTime** | **Date**|  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**    | [optional] 
 **endDateTime** | **Date**| The date to which data is required | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**TranscriptsTimes**](TranscriptsTimes.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getcategories

> ResponseCategories getcategories()

Returns the categories.

Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;which are defined as country, industry, and subject codes. The data is returned as a comma-separated list.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TranscriptsApi } = require('@factset/sdk-eventsandtranscripts');
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

const apiInstance = new TranscriptsApi();

// Call api endpoint
apiInstance.getcategories().then(
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

This endpoint does not need any parameter.

### Return type

[**ResponseCategories**](ResponseCategories.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

