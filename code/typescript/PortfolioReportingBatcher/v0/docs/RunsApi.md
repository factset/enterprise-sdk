# portfolioreportingbatcher.RunsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkRunStatus**](RunsApi.md#checkRunStatus) | **GET** /runs/{id}/status | check the status for a particular run ID
[**startJobRun**](RunsApi.md#startJobRun) | **POST** /runs | trigger PRB jobs



## checkRunStatus

> IdStatus checkRunStatus(id)

check the status for a particular run ID

Use this endpoint to check the status of a run using the id from the POST /runs endpoint

### Example

```javascript
const { ApiClient, RunsApi } = require('@factset/sdk-portfolioreportingbatcher');
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

const apiInstance = new RunsApi();
const id = 1013456; // String | run id

// Call api endpoint
apiInstance.checkRunStatus(id).then(
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
 **id** | **String**| run id | 

### Return type

[**IdStatus**](IdStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## startJobRun

> StartJobRunResponse startJobRun(opts)

trigger PRB jobs

Use this endpoint with with POST method to trigger PRB jobs.

### Example

```javascript
const { ApiClient, RunsApi } = require('@factset/sdk-portfolioreportingbatcher');
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

const apiInstance = new RunsApi();
const opts = {
  'startJobRoot': {"data":{"jobType":"ADF","jobName":"adf_multi_date","overrides":{"dates":{"start":"2023-11-10","end":"2023-12-10"},"frequency":"daily","calendar":"sevenDay","runAsSerialNumber":"894550"}}} // StartJobRoot | The main object in the request body contains details for the job to be triggered. The \"name\" and \"type\" fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job's type.
};

// Call api endpoint
apiInstance.startJobRun(opts).then(
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
 **startJobRoot** | [**StartJobRoot**](StartJobRoot.md)| The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. | [optional] 

### Return type

[**StartJobRunResponse**](StartJobRunResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

