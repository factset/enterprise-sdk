# investmentbankingofficerefresh.RefreshOperationsApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileById**](RefreshOperationsApi.md#getFileById) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**getStatusById**](RefreshOperationsApi.md#getStatusById) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**postWorkbook**](RefreshOperationsApi.md#postWorkbook) | **POST** /refresh/calculate | Refresh a spreadsheet file



## getFileById

> File getFileById(id, opts)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RefreshOperationsApi } = require('@factset/sdk-investmentbankingofficerefresh');
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

const apiInstance = new RefreshOperationsApi();
const id = "id_example"; // String | Unique identifier for the job (resource ID returned from FactSet).
const opts = {
  'deleteFile': true // Boolean | Delete the file from FactSet servers after completing the request.
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
 **id** | **String**| Unique identifier for the job (resource ID returned from FactSet). | 
 **deleteFile** | **Boolean**| Delete the file from FactSet servers after completing the request. | [optional] [default to true]

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

Check the status of the given job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RefreshOperationsApi } = require('@factset/sdk-investmentbankingofficerefresh');
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

const apiInstance = new RefreshOperationsApi();
const id = "id_example"; // String | Unique identifier for the job (resource ID returned from FactSet).

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
 **id** | **String**| Unique identifier for the job (resource ID returned from FactSet). | 

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postWorkbook

> JobStatus postWorkbook(body, opts)

Refresh a spreadsheet file

Start refreshing a spreadsheet file (in the Open Office XML format).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RefreshOperationsApi } = require('@factset/sdk-investmentbankingofficerefresh');
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

const apiInstance = new RefreshOperationsApi();
const body = "/path/to/file"; // File | 
const opts = {
  'nowHandlingEnabled': true, // Boolean | Return \\#VALUE for =FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118.
  'refreshAutoFilters': true, // Boolean | Option to refresh =FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
  'resizeArrays': true // Boolean | Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
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
 **nowHandlingEnabled** | **Boolean**| Return \\#VALUE for &#x3D;FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. | [optional] 
 **refreshAutoFilters** | **Boolean**| Option to refresh &#x3D;FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional] 
 **resizeArrays** | **Boolean**| Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional] 

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
- **Accept**: application/json

