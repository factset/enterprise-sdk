# paengine.ColumnsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPAColumnById**](ColumnsApi.md#getPAColumnById) | **GET** /analytics/lookups/v2/engines/pa/columns/{id} | Get PA column settings
[**getPAColumns**](ColumnsApi.md#getPAColumns) | **GET** /analytics/lookups/v2/engines/pa/columns | Get PA columns



## getPAColumnById

> Column getPAColumnById(id)

Get PA column settings

This endpoint returns the default settings of a PA column.

### Example

```javascript
const { ApiClient, ColumnsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new ColumnsApi();
const id = "'2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5'"; // String | Unique identifier for a column

// Call api endpoint
apiInstance.getPAColumnById(id).then(
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
 **id** | **String**| Unique identifier for a column | [default to &#39;2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5&#39;]

### Return type

[**Column**](Column.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPAColumns

> {String: ColumnSummary} getPAColumns(opts)

Get PA columns

This endpoint lists all the PA columns that can be applied to a calculation.

### Example

```javascript
const { ApiClient, ColumnsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new ColumnsApi();
const opts = {
  'name': "''", // String | 
  'category': "''", // String | 
  'directory': "''" // String | 
};

// Call api endpoint
apiInstance.getPAColumns(opts).then(
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
 **name** | **String**|  | [optional] [default to &#39;&#39;]
 **category** | **String**|  | [optional] [default to &#39;&#39;]
 **directory** | **String**|  | [optional] [default to &#39;&#39;]

### Return type

[**{String: ColumnSummary}**](ColumnSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

