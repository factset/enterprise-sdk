# documentsdistributordocuments.NewsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asynchNewsV1CheckStatusGet**](NewsAPIApi.md#asynchNewsV1CheckStatusGet) | **GET** /asynch/news/v1/check-status | Returns the status and percentDone of the requested jobID and source
[**asynchNewsV1GetFilesGet**](NewsAPIApi.md#asynchNewsV1GetFilesGet) | **GET** /asynch/news/v1/get-files | Returns the news filings for the specified daterange and source
[**asynchNewsV1RequestFilesGet**](NewsAPIApi.md#asynchNewsV1RequestFilesGet) | **GET** /asynch/news/v1/request-files | Returns the jobID



## asynchNewsV1CheckStatusGet

> NewscheckstatusResponse asynchNewsV1CheckStatusGet(jobID, source, opts)

Returns the status and percentDone of the requested jobID and source

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsAPIApi } = require('@factset/sdk-documentsdistributordocuments');
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

const apiInstance = new NewsAPIApi();
const jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to know the status and percentDone
const source = "source_example"; // String | This parameter filters the results based on the source of the filings document
const opts = {
  'paginationLimit': 56, // Number | Specifies the maximum number of results to return per result
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
};

// Call api endpoint
apiInstance.asynchNewsV1CheckStatusGet(jobID, source, opts).then(
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
 **source** | **String**| This parameter filters the results based on the source of the filings document | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type

[**NewscheckstatusResponse**](NewscheckstatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## asynchNewsV1GetFilesGet

> NewsgetfilesResponse asynchNewsV1GetFilesGet(jobID, source, opts)

Returns the news filings for the specified daterange and source

Need to plug-in the source and jobID got from /request-files into /get-files endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsAPIApi } = require('@factset/sdk-documentsdistributordocuments');
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

const apiInstance = new NewsAPIApi();
const jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to collect the results of the query
const source = "source_example"; // String | This parameter filters the results based on the source of the filings document
const opts = {
  'paginationLimit': 56, // Number | Specifies the maximum number of results to return per result
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
};

// Call api endpoint
apiInstance.asynchNewsV1GetFilesGet(jobID, source, opts).then(
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
 **source** | **String**| This parameter filters the results based on the source of the filings document | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type

[**NewsgetfilesResponse**](NewsgetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## asynchNewsV1RequestFilesGet

> NewsrequestfilesResponse asynchNewsV1RequestFilesGet(startDate, endDate, source)

Returns the jobID

Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format.  This API only supports adhoc requests to retrieve historical files. &lt;p&gt;MT Newswire has two different products that enables 1 year of rolling history and 5 years of rolling history.&lt;/p&gt;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsAPIApi } = require('@factset/sdk-documentsdistributordocuments');
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

const apiInstance = new NewsAPIApi();
const startDate = new Date("2013-10-20"); // Date | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
const endDate = new Date("2013-10-20"); // Date | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
const source = "source_example"; // String | This parameter filters the results based on the document source.

// Call api endpoint
apiInstance.asynchNewsV1RequestFilesGet(startDate, endDate, source).then(
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
 **source** | **String**| This parameter filters the results based on the document source. | 

### Return type

[**NewsrequestfilesResponse**](NewsrequestfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

