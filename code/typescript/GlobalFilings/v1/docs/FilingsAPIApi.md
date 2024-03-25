# globalfilings.FilingsAPIApi

All URIs are relative to *https://api.factset.com/global-filings/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCount**](FilingsAPIApi.md#getCount) | **GET** /count | Returns the count of filings for specified source.
[**getFilings**](FilingsAPIApi.md#getFilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**getFormtype**](FilingsAPIApi.md#getFormtype) | **GET** /reference/form-types | Returns the form types of EDGAR.
[**getSources**](FilingsAPIApi.md#getSources) | **GET** /reference/sources | Returns the sources.
[**getTimezone**](FilingsAPIApi.md#getTimezone) | **GET** /reference/time-zones | Returns the time zones.
[**getcategories**](FilingsAPIApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



## getCount

> ResponseCount getCount(sources, opts)

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
const sources = ["EDG"]; // [String] | Code for document source to include.This is a comma-separated list. Use the ```/reference/sources``` endpoint to get the list of available sources.  
const opts = {
  'startDate': 20231222, // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
  'endDate': 20231223, // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'ids': ["MODN-US"] // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
};

// Call api endpoint
apiInstance.getCount(sources, opts).then(
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
 **sources** | [**[String]**](String.md)| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources.   | 
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] [default to &#39;0&#39;]
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
const sources = ["EDG"]; // [String] | Code for document source to include.  This is a comma-separated list. Use the ```/reference/sources``` endpoint to get the list of available sources.
const opts = {
  'ids': ["MODN-US"], // [String] | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
  'startDate': 20231222, // String | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
  'endDate': 20231223, // String | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 56, // Number | Page number of the results to return.
  'timeZone': "'America/New_York'", // String | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry.
  'sort': "'desc'", // String | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation. 
  'categories': ["CN:US","LN:EN"], // [String] | Code for categories to include.  This is a comma-separated list. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories.
  'primaryId': false, // Boolean | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier.
  'searchText': Updates, // String | Restricts the search to include only document stories which include the text searched.
  'edgarFormType': "edgarFormType_example", // String | Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.** 
  'edgarAccession': "edgarAccession_example" // String | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.  **Note:  When used in conjunction with the 'source' parameter set to 'EDGAR', the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.**
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
 **sources** | [**[String]**](String.md)| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources. | 
 **ids** | [**[String]**](String.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **startDate** | **String**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] [default to &#39;0&#39;]
 **endDate** | **String**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &#39;0&#39;]
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Number**| Page number of the results to return. | [optional] 
 **timeZone** | **String**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to &#39;America/New_York&#39;]
 **sort** | **String**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] [default to &#39;desc&#39;]
 **categories** | [**[String]**](String.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **Boolean**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **edgarFormType** | **String**| Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  | [optional] 
 **edgarAccession** | **String**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.  **Note:  When used in conjunction with the &#39;source&#39; parameter set to &#39;EDGAR&#39;, the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** | [optional] 

### Return type

[**InvestmentResearch**](InvestmentResearch.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFormtype

> ResponseFormtype getFormtype()

Returns the form types of EDGAR.

 Retrieves and delivers a comprehensive list of all available  &#x60;formTypes&#x60;.

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

// Call api endpoint
apiInstance.getFormtype().then(
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

[**ResponseFormtype**](ResponseFormtype.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSources

> ResponseSources getSources()

Returns the sources.

Retrieves and delivers a comprehensive list of all available &#x60;sources&#x60;.

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

// Call api endpoint
apiInstance.getSources().then(
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

[**ResponseSources**](ResponseSources.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTimezone

> ResponseTime getTimezone()

Returns the time zones.

Retrieves and delivers a comprehensive list of all available &#x60;timeZones&#x60;.

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


## getcategories

> ResponseCategies getcategories()

Returns the categories.

Retrieves and delivers a comprehensive list of all available &#x60;categories&#x60;.

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

[**ResponseCategies**](ResponseCategies.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

