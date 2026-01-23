# eventsandtranscripts.TranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTranscriptsIntelligence**](TranscriptsApi.md#getTranscriptsIntelligence) | **GET** /transcripts/intelligence | Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
[**getTranscriptsInvestorSlides**](TranscriptsApi.md#getTranscriptsInvestorSlides) | **GET** /transcripts/investor-slides | Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
[**getTranscriptsinXML**](TranscriptsApi.md#getTranscriptsinXML) | **GET** /transcripts/response-type | Returns the requested response type of transcript
[**searchTranscripts**](TranscriptsApi.md#searchTranscripts) | **POST** /transcripts | Returns transcript documents and related metadata based on different search criteria.



## getTranscriptsIntelligence

> TranscriptsIntelligenceResponse getTranscriptsIntelligence(ids, opts)

Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the StreetAccount Transcript Intelligence documents within FactSet coverage along with other response fields.  All StreetAccount Transcript Intelligence stories originate from StreetAccount 

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
const ids = ["ADT-US"]; // [String] | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
const opts = {
  'startDate': 2025-05-01, // Date | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files. 
  'endDate': 2025-07-24, // Date | End Date (YYYY-MM-DD). If dates are not provided, default will return all files. 
  'startDateRelative': 56, // Number | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `startDate` or `startDateRelative` should be used, but not both.* - If dates are not provided, default will return all files. 
  'endDateRelative': 56, // Number | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `endDate` or `endDateRelative` should be used, but not both.* - If dates are not provided, default will return all files. 
  'categories': ["CN:US"], // [String] | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.  
  'timeZone': America/New_York, // String | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the `/meta/time-zones` endpoint to get the list of available time zones.
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
};

// Call api endpoint
apiInstance.getTranscriptsIntelligence(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
 **startDate** | **Date**| Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
 **endDate** | **Date**| End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
 **startDateRelative** | **Number**| The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
 **endDateRelative** | **Number**| The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
 **categories** | [**[String]**](String.md)| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional] 
 **timeZone** | **String**| Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to &#39;America/New_York&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**TranscriptsIntelligenceResponse**](TranscriptsIntelligenceResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscriptsInvestorSlides

> InvestorSlidesResponse getTranscriptsInvestorSlides(ids, startDate, endDate, opts)

Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the Factset Callstreet Investor Slides documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Investor Slides. 

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
const ids = ["ADT-US"]; // [String] | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
const startDate = 2025-07-23; // Date | Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
const endDate = 2025-07-24; // Date | End Date. Format is YYYY-MM-DD.
const opts = {
  'eventIds': ["1203806069"], // [String] | Requests Event IDs. This is a list with a maximum limit of 1000.
  'categories': ["CN:US"], // [String] | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.  
  'searchText': presentation, // String | Restricts the search to include only document stories which include the text searched.    
  'sort': ["null"], // [String] | Enables sorting data in ascending or descending chronological order based on eventDate. 
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
};

// Call api endpoint
apiInstance.getTranscriptsInvestorSlides(ids, startDate, endDate, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
 **startDate** | **Date**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | 
 **endDate** | **Date**| End Date. Format is YYYY-MM-DD. | 
 **eventIds** | [**[String]**](String.md)| Requests Event IDs. This is a list with a maximum limit of 1000. | [optional] 
 **categories** | [**[String]**](String.md)| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional] 
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched.     | [optional] 
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**InvestorSlidesResponse**](InvestorSlidesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTranscriptsinXML

> ResponseType getTranscriptsinXML(reportIds, format, opts)

Returns the requested response type of transcript

Returns the Factset Callstreet documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Transcripts 

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
const reportIds = ["3022837"]; // [String] | Requests Report IDs. This is a list with a maximum limit of 1000
const format = "format_example"; // String | The format of the output file. Allowed values:   - `XML`: Structured data format ideal for integrations and parsing.   - `PDF`: Printable document format preserving layout and design.   - `DocViewer`: Web-friendly format rendered in an in-browser document viewer.   - `ContentXML`: XML containing only the core content without layout or styling metadata. 
const opts = {
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
};

// Call api endpoint
apiInstance.getTranscriptsinXML(reportIds, format, opts).then(
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
 **reportIds** | [**[String]**](String.md)| Requests Report IDs. This is a list with a maximum limit of 1000 | 
 **format** | **String**| The format of the output file. Allowed values:   - &#x60;XML&#x60;: Structured data format ideal for integrations and parsing.   - &#x60;PDF&#x60;: Printable document format preserving layout and design.   - &#x60;DocViewer&#x60;: Web-friendly format rendered in an in-browser document viewer.   - &#x60;ContentXML&#x60;: XML containing only the core content without layout or styling metadata.  | 
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**ResponseType**](ResponseType.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


## searchTranscripts

> TranscriptsResponse searchTranscripts(transcriptsRequest)

Returns transcript documents and related metadata based on different search criteria.

Retrieves transcript documents in XML format and related metadata within FactSet coverage based on various criteria like date range, search text, specific IDs, or event details. Use the appropriate parameters within the &#x60;data&#x60; object of the request body to specify the search method. Pagination and sorting are controlled via the &#x60;meta&#x60; object.  All transcripts originate from Factset Callstreet Transcripts. 

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
const transcriptsRequest = new eventsandtranscripts.TranscriptsRequest(); // TranscriptsRequest | Criteria to search for transcripts. Select one mode of search.

// Call api endpoint
apiInstance.searchTranscripts(transcriptsRequest).then(
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
 **transcriptsRequest** | [**TranscriptsRequest**](TranscriptsRequest.md)| Criteria to search for transcripts. Select one mode of search. | 

### Return type

[**TranscriptsResponse**](TranscriptsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

