# factsetpeople.JobHistoryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleJobs**](JobHistoryApi.md#getPeopleJobs) | **GET** /factset-people/v1/jobs | Returns the Job history of the person.
[**getPeopleJobsForList**](JobHistoryApi.md#getPeopleJobsForList) | **POST** /factset-people/v1/jobs | Returns the Job history for the large list of people.



## getPeopleJobs

> PeopleJobsResponse getPeopleJobs(ids, opts)

Returns the Job history of the person.

Returns the &#x60;Job&#x60; history of the person referenced by the entityId specified in the request. 

### Example

```javascript
const { ApiClient, JobHistoryApi } = require('@factset/sdk-factsetpeople');
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

const apiInstance = new JobHistoryApi();
const ids = ["0DPHLH-E","07MZV9-E"]; // [String] | List of FactSet Person Entity identifier.
const opts = {
  'status': "'ALL'", // String | Select only Jobs with a certain status primary, active, or inactive.
  'level': "'DETAIL'", // String | Select the level of detail only main Jobs or include other Jobs at a company.
  'type': "'ALL'" // String | Select only Jobs of a certain type board member or employee.
};

// Call api endpoint
apiInstance.getPeopleJobs(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of FactSet Person Entity identifier. | 
 **status** | **String**| Select only Jobs with a certain status primary, active, or inactive. | [optional] [default to &#39;ALL&#39;]
 **level** | **String**| Select the level of detail only main Jobs or include other Jobs at a company. | [optional] [default to &#39;DETAIL&#39;]
 **type** | **String**| Select only Jobs of a certain type board member or employee. | [optional] [default to &#39;ALL&#39;]

### Return type

[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPeopleJobsForList

> PeopleJobsResponse getPeopleJobsForList(peopleJobsRequest)

Returns the Job history for the large list of people.

Returns the &#x60;Job&#x60; history of the person referenced by the entityId specified in the request. 

### Example

```javascript
const { ApiClient, JobHistoryApi } = require('@factset/sdk-factsetpeople');
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

const apiInstance = new JobHistoryApi();
const peopleJobsRequest = new factsetpeople.PeopleJobsRequest(); // PeopleJobsRequest | 

// Call api endpoint
apiInstance.getPeopleJobsForList(peopleJobsRequest).then(
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
 **peopleJobsRequest** | [**PeopleJobsRequest**](PeopleJobsRequest.md)|  | 

### Return type

[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

