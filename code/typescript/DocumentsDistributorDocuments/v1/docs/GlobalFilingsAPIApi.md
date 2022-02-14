# documentsdistributordocuments.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalFilingsV1FormTypesGet**](GlobalFilingsAPIApi.md#globalFilingsV1FormTypesGet) | **GET** /global-filings/v1/form-types | Retrieve form types for each available Filings Source
[**globalFilingsV1ListFilesGet**](GlobalFilingsAPIApi.md#globalFilingsV1ListFilesGet) | **GET** /global-filings/v1/list-files | Retrieve filings and metadata within FactSet coverage



## globalFilingsV1FormTypesGet

> Response globalFilingsV1FormTypesGet(source)

Retrieve form types for each available Filings Source

Gets all available form types for the filings sources. Source parameter can be used to filter the results.

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
const source = "source_example"; // String | This parameter filters the results based on the source of the filings document.

// Call api endpoint
apiInstance.globalFilingsV1FormTypesGet(source).then(
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
 **source** | **String**| This parameter filters the results based on the source of the filings document. | 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## globalFilingsV1ListFilesGet

> Response globalFilingsV1ListFilesGet(source, paginationLimit, paginationOffset, opts)

Retrieve filings and metadata within FactSet coverage

Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results

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
const source = "source_example"; // String | This parameter filters the results based on the source of the filings documents.
const paginationLimit = 56; // Number | Specifies the maximum number of results to return per result (max. 25)
const paginationOffset = 56; // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
const opts = {
  'sort': "'-startDate'", // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
  'startDate': 2020-07-01, // String | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format
  'endDate': 2020-12-01, // String | The latest date the API should fetch for. Dates can be YYYY-MM-DD format
  'ids': AAPL, // String | This parameter filters the results based on ticker ID.
  'formType': 10-Q // String | This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source.
};

// Call api endpoint
apiInstance.globalFilingsV1ListFilesGet(source, paginationLimit, paginationOffset, opts).then(
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
 **source** | **String**| This parameter filters the results based on the source of the filings documents. | 
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result (max. 25) | 
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | 
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] [default to &#39;-startDate&#39;]
 **startDate** | **String**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional] 
 **endDate** | **String**| The latest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional] 
 **ids** | **String**| This parameter filters the results based on ticker ID. | [optional] 
 **formType** | **String**| This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. | [optional] 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

