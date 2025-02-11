# portfolioreportingbatcher.JobsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1GetDetailsForJob**](JobsApi.md#v1GetDetailsForJob) | **GET** /jobs/{type}/{name} | Get details for the given PRB job
[**v1GetPrbJobs**](JobsApi.md#v1GetPrbJobs) | **GET** /jobs | Get a list of existing jobs



## v1GetDetailsForJob

> JobDetailsResponse v1GetDetailsForJob(type, name, opts)

Get details for the given PRB job

Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, JobsApi } = require('@factset/sdk-portfolioreportingbatcher');
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

const apiInstance = new JobsApi();
const type = new portfolioreportingbatcher.JobTypes(); // JobTypes | The jobs type
const name = "name_example"; // String | The jobs name
const opts = {
  'attribute': ["null"] // [String] | The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job.
};

// Call api endpoint
apiInstance.v1GetDetailsForJob(type, name, opts).then(
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
 **type** | [**JobTypes**](.md)| The jobs type | 
 **name** | **String**| The jobs name | 
 **attribute** | [**[String]**](String.md)| The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. | [optional] 

### Return type

[**JobDetailsResponse**](JobDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1GetPrbJobs

> JobListResponse v1GetPrbJobs(opts)

Get a list of existing jobs

Use this endpoint with the optional &#39;type&#39; or &#39;name&#39; filters to get a list of PRB jobs. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, JobsApi } = require('@factset/sdk-portfolioreportingbatcher');
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

const apiInstance = new JobsApi();
const opts = {
  'type': new portfolioreportingbatcher.JobTypes(), // JobTypes | The job type
  'name': "name_example", // String | The job name
  'paginationOffset': 0, // Number | The number of jobs to skip (please note the jobs are ordered by last modified in descending order, i.e. most recently modified will show on the
  'paginationLimit': 56 // Number | The number of jobs to bring back (maximum 50)
};

// Call api endpoint
apiInstance.v1GetPrbJobs(opts).then(
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
 **type** | [**JobTypes**](.md)| The job type | [optional] 
 **name** | **String**| The job name | [optional] 
 **paginationOffset** | **Number**| The number of jobs to skip (please note the jobs are ordered by last modified in descending order, i.e. most recently modified will show on the | [optional] 
 **paginationLimit** | **Number**| The number of jobs to bring back (maximum 50) | [optional] 

### Return type

[**JobListResponse**](JobListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

