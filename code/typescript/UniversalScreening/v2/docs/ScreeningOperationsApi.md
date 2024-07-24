# universalscreening.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCalculateResults**](ScreeningOperationsApi.md#getCalculateResults) | **GET** /job/{id} | 
[**pollCalculate**](ScreeningOperationsApi.md#pollCalculate) | **GET** /job/{id}/status | 
[**submitArchiveOFDB**](ScreeningOperationsApi.md#submitArchiveOFDB) | **POST** /job/archive | 
[**submitCalculate**](ScreeningOperationsApi.md#submitCalculate) | **POST** /job/calculate | 



## getCalculateResults

> PaginatedCalculationResponse getCalculateResults(id, opts)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-universalscreening');
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

const apiInstance = new ScreeningOperationsApi();
const id = 123e4567-e89b-12d3-a456-426655440000; // String | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.
const opts = {
  'paginationLimit': 12345, // Number | Page size limit (minumum 1000, default 10,000, maximum 100,000)
  'paginationCursor': 0 // Number | Paging index (Initial request may omit)
};

// Call api endpoint
apiInstance.getCalculateResults(id, opts).then(
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
 **id** | **String**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. | 
 **paginationLimit** | **Number**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional] [default to 10000]
 **paginationCursor** | **Number**| Paging index (Initial request may omit) | [optional] [default to 0]

### Return type

[**PaginatedCalculationResponse**](PaginatedCalculationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pollCalculate

> ResourceStatusResponse pollCalculate(id)



Polls the job with a given screen ID and returns job status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-universalscreening');
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

const apiInstance = new ScreeningOperationsApi();
const id = 123e4567-e89b-12d3-a456-426655440000; // String | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.

// Call api endpoint
apiInstance.pollCalculate(id).then(
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
 **id** | **String**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. | 

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## submitArchiveOFDB

> ResourceStatusResponse submitArchiveOFDB(opts)



Begins archive of screen to OFDB. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-universalscreening');
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

const apiInstance = new ScreeningOperationsApi();
const opts = {
  'screenArchiveOFDBParameters': new universalscreening.ScreenArchiveOFDBParameters() // ScreenArchiveOFDBParameters | Data required for an archive to OFDB request
};

// Call api endpoint
apiInstance.submitArchiveOFDB(opts).then(
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
 **screenArchiveOFDBParameters** | [**ScreenArchiveOFDBParameters**](ScreenArchiveOFDBParameters.md)| Data required for an archive to OFDB request | [optional] 

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## submitCalculate

> ResourceStatusResponse submitCalculate(opts)



Begins calculation of screen. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-universalscreening');
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

const apiInstance = new ScreeningOperationsApi();
const opts = {
  'screenCalcParameters': new universalscreening.ScreenCalcParameters() // ScreenCalcParameters | Data required for a calculation request
};

// Call api endpoint
apiInstance.submitCalculate(opts).then(
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
 **screenCalcParameters** | [**ScreenCalcParameters**](ScreenCalcParameters.md)| Data required for a calculation request | [optional] 

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

