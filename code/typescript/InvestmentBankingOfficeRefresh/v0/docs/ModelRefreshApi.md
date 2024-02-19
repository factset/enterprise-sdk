# investmentbankingofficerefresh.ModelRefreshApi

All URIs are relative to *https://api.factset.com/office-refresh/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileById**](ModelRefreshApi.md#getFileById) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**getStatusById**](ModelRefreshApi.md#getStatusById) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**postWorkbook**](ModelRefreshApi.md#postWorkbook) | **POST** /refresh | Upload a model



## getFileById

> File getFileById(id, opts)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelRefreshApi } = require('@factset/sdk-investmentbankingofficerefresh');
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

const apiInstance = new ModelRefreshApi();
const id = "id_example"; // String | Resource ID
const opts = {
  'outputFileName': "outputFileName_example" // String | Optional name for returned output file as set in the Content-Disposition response header.
};

// Call api endpoint
apiInstance.getFileById(id, opts).then(
  data => {

      // data is a responsewrapper: GetFileByIdResponseWrapper
      switch (data.statusCode) {

          case 200:
             // File
             console.log(data.getResponse200());
             break;

          case 202:
             // JobStatus
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
 **id** | **String**| Resource ID | 
 **outputFileName** | **String**| Optional name for returned output file as set in the Content-Disposition response header. | [optional] 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json


## getStatusById

> JobStatus getStatusById(id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelRefreshApi } = require('@factset/sdk-investmentbankingofficerefresh');
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

const apiInstance = new ModelRefreshApi();
const id = "id_example"; // String | Resource ID

// Call api endpoint
apiInstance.getStatusById(id).then(
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
 **id** | **String**| Resource ID | 

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postWorkbook

> JobStatus postWorkbook(body, opts)

Upload a model

Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelRefreshApi } = require('@factset/sdk-investmentbankingofficerefresh');
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

const apiInstance = new ModelRefreshApi();
const body = "/path/to/file"; // File | 
const opts = {
  'nowHandlingEnabled': true, // Boolean | Option to handle =NOW codes.
  'refreshAutoFilters': true, // Boolean | Option to refresh codes in autofilters.
  'resizeArrays': true // Boolean | Option to resize arrays
};

// Call api endpoint
apiInstance.postWorkbook(body, opts).then(
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
 **body** | **File**|  | 
 **nowHandlingEnabled** | **Boolean**| Option to handle &#x3D;NOW codes. | [optional] 
 **refreshAutoFilters** | **Boolean**| Option to refresh codes in autofilters. | [optional] 
 **resizeArrays** | **Boolean**| Option to resize arrays | [optional] 

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
- **Accept**: application/json

