# formula.BatchProcessingApi

All URIs are relative to *https://api.factset.com/formula-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatchJob**](BatchProcessingApi.md#cancelBatchJob) | **DELETE** /batch-cancel | Cancels individual ongoing Batch Request
[**getBatchData**](BatchProcessingApi.md#getBatchData) | **GET** /batch-result | Returns the response for a Batch Request
[**getBatchDataWithPost**](BatchProcessingApi.md#getBatchDataWithPost) | **POST** /batch-result | Returns the response for a Batch Request
[**getBatchList**](BatchProcessingApi.md#getBatchList) | **GET** /batch-list | Returns a list of all available Batch Requests submitted by a user
[**getBatchStatus**](BatchProcessingApi.md#getBatchStatus) | **GET** /batch-status | Returns the status for a Batch Request



## cancelBatchJob

> cancelBatchJob(id)

Cancels individual ongoing Batch Request

Cancel individual batch requests that are specified by the id via the &#x60;/batch-cancel&#x60; endpoint. The batch request cannot be canceled if it has already completed processing or if it has failed. Canceling a batch request releases a concurrency slot, allowing users to initiate a new batch request immediately.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-formula');
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
const id = 2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c; // String | Batch Request identifier.

// Call api endpoint
apiInstance.cancelBatchJob(id).then(
  () => {
    console.log('API called successfully.');
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

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBatchData

> BatchDataResponse getBatchData(id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter for both the &#x60;/time-series&#x60; and &#x60;/cross-sectional&#x60; endpoint. All batch requests expire within 48 hours of completion.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-formula');
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
const id = 2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c; // String | Batch Request identifier.

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

Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter for both the &#x60;/time-series&#x60; and &#x60;/cross-sectional&#x60; endpoint. All batch requests expire within 48 hours of completion.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-formula');
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
const batchDataRequest = {"data":{"id":"2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c"}}; // BatchDataRequest | 

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
 **batchDataRequest** | [**BatchDataRequest**](BatchDataRequest.md)|  | 

### Return type

[**BatchDataResponse**](BatchDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getBatchList

> BatchListResponse getBatchList()

Returns a list of all available Batch Requests submitted by a user

Return a list of all batch requests submitted by a user that have not yet expired. The &#x60;/batch-list&#x60; endpoint will return the batch &#x60;id&#x60;, &#x60;status&#x60;, &#x60;error&#x60;, and &#x60;expiration&#x60; for all ongoing or unexpired batch requests. All batch requests expire within 48 hours of completion.     *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-formula');
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

// Call api endpoint
apiInstance.getBatchList().then(
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

This endpoint does not need any parameter.

### Return type

[**BatchListResponse**](BatchListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBatchStatus

> BatchStatusResponse getBatchStatus(id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **30 minutes** via the &#x60;batch&#x60; parameter for both the &#x60;/time-series&#x60; and &#x60;/cross-sectional&#x60; endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BatchProcessingApi } = require('@factset/sdk-formula');
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
const id = 2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c; // String | Batch Request identifier.

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

