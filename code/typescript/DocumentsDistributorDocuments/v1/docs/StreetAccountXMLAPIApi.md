# documentsdistributordocuments.StreetAccountXMLAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asynchStreetaccountV1CheckStatusGet**](StreetAccountXMLAPIApi.md#asynchStreetaccountV1CheckStatusGet) | **GET** /asynch/streetaccount/v1/check-status | Returns the status and percentDone of the requested jobID
[**asynchStreetaccountV1GetFilesGet**](StreetAccountXMLAPIApi.md#asynchStreetaccountV1GetFilesGet) | **GET** /asynch/streetaccount/v1/get-files | Returns the SA XML files for the specified daterange
[**asynchStreetaccountV1RequestFilesGet**](StreetAccountXMLAPIApi.md#asynchStreetaccountV1RequestFilesGet) | **GET** /asynch/streetaccount/v1/request-files | Returns the jobID



## asynchStreetaccountV1CheckStatusGet

> [Checkstatus] asynchStreetaccountV1CheckStatusGet(jobID)

Returns the status and percentDone of the requested jobID

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

```javascript
const { ApiClient, StreetAccountXMLAPIApi } = require('@factset/sdk-documentsdistributordocuments');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new StreetAccountXMLAPIApi();
const jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to know the status and percentDone

// Call api endpoint
apiInstance.asynchStreetaccountV1CheckStatusGet(jobID).then(
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

### Return type

[**[Checkstatus]**](Checkstatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## asynchStreetaccountV1GetFilesGet

> [Getfiles] asynchStreetaccountV1GetFilesGet(jobID)

Returns the SA XML files for the specified daterange

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

```javascript
const { ApiClient, StreetAccountXMLAPIApi } = require('@factset/sdk-documentsdistributordocuments');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new StreetAccountXMLAPIApi();
const jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to collect the results of the query

// Call api endpoint
apiInstance.asynchStreetaccountV1GetFilesGet(jobID).then(
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

### Return type

[**[Getfiles]**](Getfiles.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## asynchStreetaccountV1RequestFilesGet

> RequestfilesResponse asynchStreetaccountV1RequestFilesGet(startDate, endDate)

Returns the jobID

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format  This API only supports adhoc requests to retrieve historical files and does not support real-time       files and if you interested in require real-time push should consider the other three methods         (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

### Example

```javascript
const { ApiClient, StreetAccountXMLAPIApi } = require('@factset/sdk-documentsdistributordocuments');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new StreetAccountXMLAPIApi();
const startDate = new Date("2013-10-20"); // Date | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
const endDate = new Date("2013-10-20"); // Date | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format

// Call api endpoint
apiInstance.asynchStreetaccountV1RequestFilesGet(startDate, endDate).then(
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

