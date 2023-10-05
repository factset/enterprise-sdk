# portfolioreportingbatcher.JobsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailsForJob**](JobsApi.md#getDetailsForJob) | **GET** /jobs/{type}/{name} | Get details for the given PRB job



## getDetailsForJob

> JobDetailsResponse getDetailsForJob(type, name, opts)

Get details for the given PRB job

Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.

### Example

```javascript
const { ApiClient, JobsApi } = require('@factset/sdk-portfolioreportingbatcher');
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

const apiInstance = new JobsApi();
const type = new portfolioreportingbatcher.JobTypes(); // JobTypes | The jobs type
const name = "name_example"; // String | The jobs name
const opts = {
  'attribute': ["null"] // [String] | The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job.
};

// Call api endpoint
apiInstance.getDetailsForJob(type, name, opts).then(
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

