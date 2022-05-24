# documentsdistributordocuments.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalFilingsV1ListFilesGet**](GlobalFilingsAPIApi.md#globalFilingsV1ListFilesGet) | **GET** /global-filings/v1/list-files | Retrieve filings within FactSet coverage



## globalFilingsV1ListFilesGet

> [FilingsFiles] globalFilingsV1ListFilesGet(dataset, startDate, endDate)

Retrieve filings within FactSet coverage

Parameters can be used to get the filings

### Example

```javascript
const { ApiClient, GlobalFilingsAPIApi } = require('@factset/sdk-documentsdistributordocuments');
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

const apiInstance = new GlobalFilingsAPIApi();
const dataset = "dataset_example"; // String | This parameter filters the results based on the dataset of the filings documents.
const startDate = new Date("2013-10-20"); // Date | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format
const endDate = new Date("2013-10-20"); // Date | The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format

// Call api endpoint
apiInstance.globalFilingsV1ListFilesGet(dataset, startDate, endDate).then(
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
 **dataset** | **String**| This parameter filters the results based on the dataset of the filings documents. | 
 **startDate** | **Date**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | 
 **endDate** | **Date**| The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format | 

### Return type

[**[FilingsFiles]**](FilingsFiles.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

