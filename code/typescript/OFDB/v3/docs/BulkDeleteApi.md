# ofdb.BulkDeleteApi

All URIs are relative to *https://api.factset.com/analytics/ofdb/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBulkItems**](BulkDeleteApi.md#deleteBulkItems) | **POST** /database/bulk-delete | 
[**getResourceDeleteBulkItems**](BulkDeleteApi.md#getResourceDeleteBulkItems) | **GET** /database/job/result/bulk-delete/get | 



## deleteBulkItems

> InlineResponse201 deleteBulkItems(opts)



Allows users to delete various combinations of symbols, dates, and fields from the desired database

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BulkDeleteApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new BulkDeleteApi();
const opts = {
  'bulkDeleteRoot': {"data":{"databasePath":"Client:/Folder1/Database.OFDB","content":[{"symbol":"FDS"},{"date":"2022-02-02"},{"date":"2022-03-03"},{"field":"PRICE"},{"symbol":"AAPL","date":"2023-04-04"},{"symbol":"AAPL","field":"SHARES"},{"date":"2023-05-05","field":"SHARES"},{"symbol":"TSLA","date":"2023-06-06","field":"SHARES"}]}} // BulkDeleteRoot | 
};

// Call api endpoint
apiInstance.deleteBulkItems(opts).then(
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
 **bulkDeleteRoot** | [**BulkDeleteRoot**](BulkDeleteRoot.md)|  | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getResourceDeleteBulkItems

> InlineResponse2003 getResourceDeleteBulkItems(jobId)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BulkDeleteApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new BulkDeleteApi();
const jobId = "jobId_example"; // String | jobId generated from the audit endpoint.

// Call api endpoint
apiInstance.getResourceDeleteBulkItems(jobId).then(
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
 **jobId** | **String**| jobId generated from the audit endpoint. | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

