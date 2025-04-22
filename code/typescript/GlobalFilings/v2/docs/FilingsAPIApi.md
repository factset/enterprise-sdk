# globalfilings.FilingsAPIApi

All URIs are relative to *https://api.factset.com/content/global-filings/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCount**](FilingsAPIApi.md#getCount) | **GET** /count | Returns the count of filings for specified source.
[**getFilings**](FilingsAPIApi.md#getFilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.



## getCount

> CountResponse getCount(ids, sources, opts)

Returns the count of filings for specified source.

Returns the count of filings documents along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const ids = ["MODN-US"]; // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 10.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
const sources = ["EDG"]; // [String] | Code for document source to include.This is a comma-separated list. Use the `/meta/sources` endpoint to get the list of available sources.  
const opts = {
  'startDate': 20240601, // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
  'endDate': 20241101 // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
};

// Call api endpoint
apiInstance.getCount(ids, sources, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 10.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | 
 **sources** | [**[String]**](String.md)| Code for document source to include.This is a comma-separated list. Use the &#x60;/meta/sources&#x60; endpoint to get the list of available sources.   | 
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional] 
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] 

### Return type

[**CountResponse**](CountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFilings

> SearchResponse getFilings(ids, sources, opts)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const ids = ["MODN-US"]; // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
const sources = ["EDG"]; // [String] | 
const opts = {
  'startDate': 20240601, // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). 
  'endDate': 20241101, // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0, // Number | Page number of the results to return. 
  'timeZone': "'America/New_York'", // String | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry.
  'sort': ["filingsDateTime"], // [String] | Enables sorting data in ascending or descending  order based on filingsDateTime.   * `filingsDateTime` - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  `-filingsDateTime` - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.
  'categories': ["CN:US"], // [String] | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories.
  'primaryId': false, // Boolean | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier.
  'searchText': Officer, // String | Restricts the search to include only document stories which include the text searched.
  'formTypes': ["15-12G"], // [String] | The search to include any form types of given sources
  'edgarAccession': "edgarAccession_example" // String | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.   > **Note:**  > When used in conjunction with the 'sources' parameter set to 'EDGAR, the API considers this accession for data retrieval.  > For non-EDGAR sources, this parameter is ignored.
};

// Call api endpoint
apiInstance.getFilings(ids, sources, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | 
 **sources** | [**[String]**](String.md)|  | 
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional] 
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] 
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return.  | [optional] [default to 0]
 **timeZone** | **String**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to &#39;America/New_York&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending  order based on filingsDateTime.   * &#x60;filingsDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  &#x60;-filingsDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query. | [optional] 
 **categories** | [**[String]**](String.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **Boolean**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **formTypes** | [**[String]**](String.md)| The search to include any form types of given sources | [optional] 
 **edgarAccession** | **String**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.   &gt; **Note:**  &gt; When used in conjunction with the &#39;sources&#39; parameter set to &#39;EDGAR, the API considers this accession for data retrieval.  &gt; For non-EDGAR sources, this parameter is ignored. | [optional] 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

