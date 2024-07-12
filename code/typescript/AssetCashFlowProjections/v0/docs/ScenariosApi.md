# assetcashflowprojections.ScenariosApi

All URIs are relative to *https://api.factset.com/analytics/asset-cash-flow-projections/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUploadStatus**](ScenariosApi.md#getUploadStatus) | **GET** /scenarios/{uploadId}/status | Get scenarios upload status
[**uploadScenarios**](ScenariosApi.md#uploadScenarios) | **POST** /scenarios/upload | Upload actuarial scenarios



## getUploadStatus

> UploadStatusResponse getUploadStatus(uploadId)

Get scenarios upload status

This endpoint is used for getting the status of a file

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScenariosApi } = require('@factset/sdk-assetcashflowprojections');
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

const apiInstance = new ScenariosApi();
const uploadId = "uploadId_example"; // String | Check the status for a particular file

// Call api endpoint
apiInstance.getUploadStatus(uploadId).then(
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
 **uploadId** | **String**| Check the status for a particular file | 

### Return type

[**UploadStatusResponse**](UploadStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## uploadScenarios

> ClientUploadResponse uploadScenarios(opts)

Upload actuarial scenarios

This endpoint is used for uploading asset cash flow scenarios

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScenariosApi } = require('@factset/sdk-assetcashflowprojections');
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

const apiInstance = new ScenariosApi();
const opts = {
  'clientScenariosUpload': {"data":{"fileName":"my_scenarios.csv","asOfDate":"2024-03-01","overwrite":false,"replaceSpecialCharacters":false}} // ClientScenariosUpload | Request body
};

// Call api endpoint
apiInstance.uploadScenarios(opts).then(
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
 **clientScenariosUpload** | [**ClientScenariosUpload**](ClientScenariosUpload.md)| Request body | [optional] 

### Return type

[**ClientUploadResponse**](ClientUploadResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

