# streetaccountnews.StreetAccountHistoricalStoriesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streetaccountHistoricalCheckStatusGet**](StreetAccountHistoricalStoriesApi.md#streetaccountHistoricalCheckStatusGet) | **GET** /streetaccount/historical/check-status | Returns the status and percentage of completion for the requested jobID
[**streetaccountHistoricalGetFilesGet**](StreetAccountHistoricalStoriesApi.md#streetaccountHistoricalGetFilesGet) | **GET** /streetaccount/historical/get-files | Returns the StreetAccount XML files for the specified date range
[**streetaccountHistoricalRequestFilesGet**](StreetAccountHistoricalStoriesApi.md#streetaccountHistoricalRequestFilesGet) | **GET** /streetaccount/historical/request-files | Returns the jobID



## streetaccountHistoricalCheckStatusGet

> CheckstatusResponse streetaccountHistoricalCheckStatusGet(jobID, opts)

Returns the status and percentage of completion for the requested jobID

Need to plug-in the jobID from /request-files into /check-status endpoint

### Example

```javascript
const { ApiClient, StreetAccountHistoricalStoriesApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new StreetAccountHistoricalStoriesApi();
const jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to know the status and percentDone
const opts = {
  'paginationLimit': 56, // Number | Specifies the maximum number of results to return per result
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
};

// Call api endpoint
apiInstance.streetaccountHistoricalCheckStatusGet(jobID, opts).then(
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
 **jobID** | **String**| jobID returned by the request-files endpoint to know the status and percentDone | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type

[**CheckstatusResponse**](CheckstatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## streetaccountHistoricalGetFilesGet

> GetfilesResponse streetaccountHistoricalGetFilesGet(jobID, opts)

Returns the StreetAccount XML files for the specified date range

Need to plug-in the jobID from /check-status into /get-files endpoint

### Example

```javascript
const { ApiClient, StreetAccountHistoricalStoriesApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new StreetAccountHistoricalStoriesApi();
const jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to collect the results of the query
const opts = {
  'paginationLimit': 56, // Number | Specifies the maximum number of results to return per result
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
};

// Call api endpoint
apiInstance.streetaccountHistoricalGetFilesGet(jobID, opts).then(
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
 **jobID** | **String**| jobID returned by the request-files endpoint to collect the results of the query | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type

[**GetfilesResponse**](GetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## streetaccountHistoricalRequestFilesGet

> RequestfilesResponse streetaccountHistoricalRequestFilesGet(startDate, endDate)

Returns the jobID

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

### Example

```javascript
const { ApiClient, StreetAccountHistoricalStoriesApi } = require('@factset/sdk-streetaccountnews');
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

const apiInstance = new StreetAccountHistoricalStoriesApi();
const startDate = new Date("2013-10-20T19:20:30+01:00"); // Date | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
const endDate = new Date("2013-10-20T19:20:30+01:00"); // Date | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format

// Call api endpoint
apiInstance.streetaccountHistoricalRequestFilesGet(startDate, endDate).then(
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
 **startDate** | **Date**| Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format | 
 **endDate** | **Date**| The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format | 

### Return type

[**RequestfilesResponse**](RequestfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

