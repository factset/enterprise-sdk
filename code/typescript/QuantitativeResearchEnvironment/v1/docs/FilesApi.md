# quantitativeresearchenvironment.FilesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsQuantQreV1FilesServerFilePost**](FilesApi.md#analyticsQuantQreV1FilesServerFilePost) | **POST** /analytics/quant/qre/v1/files/{server}/{file} | Starts a file upload
[**analyticsQuantQreV1FilesUploadsIdGet**](FilesApi.md#analyticsQuantQreV1FilesUploadsIdGet) | **GET** /analytics/quant/qre/v1/files/uploads/{id} | Get upload status by id



## analyticsQuantQreV1FilesServerFilePost

> FileUploadStatus analyticsQuantQreV1FilesServerFilePost(server, file, opts)

Starts a file upload

This endpoint takes a file and uploads it

### Example

```javascript
const { ApiClient, FilesApi } = require('@factset/sdk-quantitativeresearchenvironment');
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

const apiInstance = new FilesApi();
const server = "server_example"; // String | The server to upload the file to. Either `interactive` or `batch`.
const file = "file_example"; // String | The file name to upload the file to. Existing directory can be specified.
const opts = {
  'body': "/path/to/file" // File | 
};

// Call api endpoint
apiInstance.analyticsQuantQreV1FilesServerFilePost(server, file, opts).then(
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
 **server** | **String**| The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. | 
 **file** | **String**| The file name to upload the file to. Existing directory can be specified. | 
 **body** | **File**|  | [optional] 

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: *
- **Accept**: application/json


## analyticsQuantQreV1FilesUploadsIdGet

> FileUploadStatus analyticsQuantQreV1FilesUploadsIdGet(id)

Get upload status by id

This is the endpoint to check on the progress of a previous upload request.

### Example

```javascript
const { ApiClient, FilesApi } = require('@factset/sdk-quantitativeresearchenvironment');
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

const apiInstance = new FilesApi();
const id = "id_example"; // String | From url, provided by location header or response body in the upload start endpoint

// Call api endpoint
apiInstance.analyticsQuantQreV1FilesUploadsIdGet(id).then(
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
 **id** | **String**| From url, provided by location header or response body in the upload start endpoint | 

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

