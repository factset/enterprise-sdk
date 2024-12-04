# streetaccountnews.StreetAccountHistoricalStoriesApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFilesData**](StreetAccountHistoricalStoriesApi.md#getFilesData) | **GET** /historical/files/get | Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
[**getStatusData**](StreetAccountHistoricalStoriesApi.md#getStatusData) | **GET** /historical/files/status | Returns the status of the request
[**requestFiles**](StreetAccountHistoricalStoriesApi.md#requestFiles) | **POST** /historical/files/create | Requests the creation of StreetAccount News Files with historical data.



## getFilesData

> GetfilesResponse getFilesData(id, opts)

Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.

Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const id = "id_example"; // String | ID returned by the /historical/files/create endpoint to collect the results of the query
const opts = {
  'paginationLimit': 56, // Number | Specifies the maximum number of results to return per result
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
};

// Call api endpoint
apiInstance.getFilesData(id, opts).then(
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
 **id** | **String**| ID returned by the /historical/files/create endpoint to collect the results of the query | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type

[**GetfilesResponse**](GetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStatusData

> SubmittedResponse getStatusData(id, opts)

Returns the status of the request

Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const id = "id_example"; // String | ID returned by the /historical/files/create endpoint to know the status
const opts = {
  'paginationLimit': 56, // Number | Specifies the maximum number of results to return per result
  'paginationOffset': 56 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
};

// Call api endpoint
apiInstance.getStatusData(id, opts).then(
  data => {

      // data is a responsewrapper: GetStatusDataResponseWrapper
      switch (data.statusCode) {

          case 201:
             // SubmittedResponse
             console.log(data.getResponse201());
             break;

          case 202:
             // AcceptedResponse
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID returned by the /historical/files/create endpoint to know the status | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## requestFiles

> AcceptedResponse requestFiles(createFilesRequest)

Requests the creation of StreetAccount News Files with historical data.

Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
const createFilesRequest = new streetaccountnews.CreateFilesRequest(); // CreateFilesRequest | 

// Call api endpoint
apiInstance.requestFiles(createFilesRequest).then(
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
 **createFilesRequest** | [**CreateFilesRequest**](CreateFilesRequest.md)|  | 

### Return type

[**AcceptedResponse**](AcceptedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

