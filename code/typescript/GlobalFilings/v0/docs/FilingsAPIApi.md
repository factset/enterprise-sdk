# globalfilings.FilingsAPIApi

All URIs are relative to *https://api.factset.com/global-filings/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCount**](FilingsAPIApi.md#getCount) | **GET** /count | Returns the count of filings for specified source
[**getFilings**](FilingsAPIApi.md#getFilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**getHelper**](FilingsAPIApi.md#getHelper) | **GET** /helper | Returns the static values for various parameters



## getCount

> ResponseCount getCount(report, sources, opts)

Returns the count of filings for specified source

Returns the count of filings documents along with other response fields.

### Example

```javascript
const { ApiClient, FilingsAPIApi } = require('@factset/sdk-globalfilings');
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

const apiInstance = new FilingsAPIApi();
const report = "report_example"; // String | retrives count of source.
const sources = ["EDG"]; // [String] | Code for document source to include.This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.  
const opts = {
  'startDate': 20231222, // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'endDate': 20231223, // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'ids': ["MODN-US"] // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
};

// Call api endpoint
apiInstance.getCount(report, sources, opts).then(
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
 **report** | **String**| retrives count of source. | 
 **sources** | [**[String]**](String.md)| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources.   | 
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &#39;0&#39;]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &#39;0&#39;]
 **ids** | [**[String]**](String.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 

### Return type

[**ResponseCount**](ResponseCount.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFilings

> InvestmentResearch getFilings(sources, opts)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields

### Example

```javascript
const { ApiClient, FilingsAPIApi } = require('@factset/sdk-globalfilings');
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

const apiInstance = new FilingsAPIApi();
const sources = ["EDG"]; // [String] | Code for document source to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.
const opts = {
  'ids': ["MODN-US"], // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
  'startDate': 20231222, // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'endDate': 20231223, // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 56, // Number | Page number of the results to return.
  'timezone': "'America/New_York'", // String | Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings.
  'sort': "'desc'", // String | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation. 
  'categories': ["CN:US","LN:EN"], // [String] | Code for categories to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available categories.  Default = All categories.
  'primaryId': "'N'", // String | Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s).
  'searchText': Updates, // String | Restricts the search to include only document stories which include the text searched.
  'formType': "formType_example", // String | Restricts the search to include any form types of EDGAR.
  'accession': "accession_example" // String | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG
};

// Call api endpoint
apiInstance.getFilings(sources, opts).then(
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
 **sources** | [**[String]**](String.md)| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources. | 
 **ids** | [**[String]**](String.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &#39;0&#39;]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &#39;0&#39;]
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] 
 **timezone** | **String**| Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. | [optional] [default to &#39;America/New_York&#39;]
 **sort** | **String**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] [default to &#39;desc&#39;]
 **categories** | [**[String]**](String.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **String**| Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). | [optional] [default to &#39;N&#39;]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **formType** | **String**| Restricts the search to include any form types of EDGAR. | [optional] 
 **accession** | **String**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG | [optional] 

### Return type

[**InvestmentResearch**](InvestmentResearch.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getHelper

> ResponseHelper getHelper(opts)

Returns the static values for various parameters

Returns the static values for sources,formTypes,timeZones,categories based on the specified parameter

### Example

```javascript
const { ApiClient, FilingsAPIApi } = require('@factset/sdk-globalfilings');
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

const apiInstance = new FilingsAPIApi();
const opts = {
  'fields': "fields_example" // String | Request data for given field.
};

// Call api endpoint
apiInstance.getHelper(opts).then(
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
 **fields** | **String**| Request data for given field. | [optional] 

### Return type

[**ResponseHelper**](ResponseHelper.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

