# factsetprices.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchData**](BatchProcessingApi.md#getBatchData) | **GET** /batch/v1/result | Returns the response for a Batch Request
[**getBatchDataWithPost**](BatchProcessingApi.md#getBatchDataWithPost) | **POST** /batch/v1/result | Returns the response for a Batch Request
[**getBatchStatus**](BatchProcessingApi.md#getBatchStatus) | **GET** /batch/v1/status | Returns the status for a Batch Request
[**getBatchStatusWithPost**](BatchProcessingApi.md#getBatchStatusWithPost) | **POST** /batch/v1/status | Returns the status for a Batch Request



## getBatchData

> BatchDataResponse getBatchData(id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.

### Example

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new BatchProcessingApi();
const id = "id_example"; // String | Batch Request identifier.

// Call api endpoint
apiInstance.getBatchData(id).then(
  data => {

      // data is a responsewrapper: GetBatchDataResponseWrapper
      switch (data.statusCode) {

          case 200:
             // BatchDataResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
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
 **id** | **String**| Batch Request identifier. | 

### Return type

[**BatchDataResponse**](BatchDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBatchDataWithPost

> BatchDataResponse getBatchDataWithPost(batchDataRequest)

Returns the response for a Batch Request

Return the response data for the underlying batch request that is specified by the id. 

### Example

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new BatchProcessingApi();
const batchDataRequest = new factsetprices.BatchDataRequest(); // BatchDataRequest | Batch Data Request Post Body

// Call api endpoint
apiInstance.getBatchDataWithPost(batchDataRequest).then(
  data => {

      // data is a responsewrapper: GetBatchDataWithPostResponseWrapper
      switch (data.statusCode) {

          case 200:
             // BatchDataResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // BatchStatusResponse
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
 **batchDataRequest** | [**BatchDataRequest**](BatchDataRequest.md)| Batch Data Request Post Body | 

### Return type

[**BatchDataResponse**](BatchDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getBatchStatus

> BatchStatusResponse getBatchStatus(id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.

### Example

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new BatchProcessingApi();
const id = "id_example"; // String | Batch Request identifier.

// Call api endpoint
apiInstance.getBatchStatus(id).then(
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
 **id** | **String**| Batch Request identifier. | 

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBatchStatusWithPost

> BatchStatusResponse getBatchStatusWithPost(batchStatusRequest)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id. 

### Example

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetprices');
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

const apiInstance = new BatchProcessingApi();
const batchStatusRequest = new factsetprices.BatchStatusRequest(); // BatchStatusRequest | Batch Status Request Post Body

// Call api endpoint
apiInstance.getBatchStatusWithPost(batchStatusRequest).then(
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
 **batchStatusRequest** | [**BatchStatusRequest**](BatchStatusRequest.md)| Batch Status Request Post Body | 

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

