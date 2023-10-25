# openfactsetpartnersdocuments.OrbitApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChineseTranscriptsDaily**](OrbitApi.md#getChineseTranscriptsDaily) | **GET** /orbit/transcripts/daily | Returns the daily files from Open:FactSet Partner - Orbit.
[**getChineseTranscriptsHistory**](OrbitApi.md#getChineseTranscriptsHistory) | **GET** /orbit/transcripts/history | Returns the history files from Open:FactSet Partner - Orbit



## getChineseTranscriptsDaily

> OrbitResponse getChineseTranscriptsDaily(opts)

Returns the daily files from Open:FactSet Partner - Orbit.

Returns the daily files from Open:FactSet Partner - Orbit.

### Example

```javascript
const { ApiClient, OrbitApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OrbitApi();
const opts = {
  'sort': "'-startDate'", // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'startDate': 2021-09-01, // Date | The earliest date of the Orbit file the API should fetching for based on fileTimestamp.
  'endDate': 2021-10-08, // Date | The latest date of the Orbit file the API should fetching for based on fileTimestamp.
  'stockCode': 601236, // String | The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers. 
  'fileName': "fileName_example", // String | This parameter is used to filters the results based on file name.
  'title': 投资者关系活动记录表2022-001 // String | This parameter is used to filter the results based on the headline of the transcript.
};

// Call api endpoint
apiInstance.getChineseTranscriptsDaily(opts).then(
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
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to &#39;-startDate&#39;]
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **startDate** | **Date**| The earliest date of the Orbit file the API should fetching for based on fileTimestamp. | [optional] 
 **endDate** | **Date**| The latest date of the Orbit file the API should fetching for based on fileTimestamp. | [optional] 
 **stockCode** | **String**| The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  | [optional] 
 **fileName** | **String**| This parameter is used to filters the results based on file name. | [optional] 
 **title** | **String**| This parameter is used to filter the results based on the headline of the transcript. | [optional] 

### Return type

[**OrbitResponse**](OrbitResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getChineseTranscriptsHistory

> OrbithistoryResponse getChineseTranscriptsHistory(opts)

Returns the history files from Open:FactSet Partner - Orbit

Returns the historical files from February 28th, 2005 to current date. 

### Example

```javascript
const { ApiClient, OrbitApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OrbitApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'fileName': "fileName_example" // String | This parameter is used to filters the results based on file name.
};

// Call api endpoint
apiInstance.getChineseTranscriptsHistory(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **fileName** | **String**| This parameter is used to filters the results based on file name. | [optional] 

### Return type

[**OrbithistoryResponse**](OrbithistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

