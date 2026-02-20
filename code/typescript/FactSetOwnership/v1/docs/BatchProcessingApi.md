# factsetownership.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchData**](BatchProcessingApi.md#getBatchData) | **GET** /batch-result | Returns the response for the Batch Request
[**getBatchStatus**](BatchProcessingApi.md#getBatchStatus) | **GET** /batch-status | Returns the latest status and metadata for the Batch Request.



## getBatchData

> BatchResultResponse getBatchData(id)

Returns the response for the Batch Request

Returns the response data for the specified batch id upon successful completion.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetownership');
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
const id = "id_example"; // String | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.

// Call api endpoint
apiInstance.getBatchData(id).then(
  data => {

      // data is a responsewrapper: GetBatchDataResponseWrapper
      switch (data.statusCode) {

          case 200:
             // BatchResultResponse
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
 **id** | **String**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. | 

### Return type

[**BatchResultResponse**](BatchResultResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBatchStatus

> BatchStatusResponse getBatchStatus(id)

Returns the latest status and metadata for the Batch Request.

Returns the current processing status of the batch request identified by the specified batch Id. Use this endpoint to monitor and track the progress or completion of long-running batch operations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-factsetownership');
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
const id = "id_example"; // String | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.

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
 **id** | **String**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. | 

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

