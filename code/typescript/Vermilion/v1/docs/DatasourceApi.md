# vermilion.DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataSources**](DatasourceApi.md#getAllDataSources) | **GET** /v1/{tenant}/data-sources | Lists all datasources
[**getDataSourceByCode**](DatasourceApi.md#getDataSourceByCode) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**getDataSourceData**](DatasourceApi.md#getDataSourceData) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource



## getAllDataSources

> DataSourceList getAllDataSources(tenant, opts)

Lists all datasources

List all datasources the user has permission to see

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DatasourceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new DatasourceApi();
const tenant = TENANT; // String | The code of the tenancy
const opts = {
  'sort': ["name"], // [String] | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return. Default is 25
  'paginationOffset': 0 // Number | Non-negative number of entries to skip. Default is 0
};

// Call api endpoint
apiInstance.getAllDataSources(tenant, opts).then(
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
 **tenant** | **String**| The code of the tenancy | 
 **sort** | [**[String]**](String.md)| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]

### Return type

[**DataSourceList**](DataSourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDataSourceByCode

> DataSourceData getDataSourceByCode(tenant, dataSourceCode)

Gets a datasource

Gets a datasource based on the code passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DatasourceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new DatasourceApi();
const tenant = TENANT; // String | The code of the tenancy
const dataSourceCode = DSCODE; // String | The code of the datasource

// Call api endpoint
apiInstance.getDataSourceByCode(tenant, dataSourceCode).then(
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
 **tenant** | **String**| The code of the tenancy | 
 **dataSourceCode** | **String**| The code of the datasource | 

### Return type

[**DataSourceData**](DataSourceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDataSourceData

> DataSourceDataInstance getDataSourceData(tenant, dataSourceCode, opts)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DatasourceApi } = require('@factset/sdk-vermilion');
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

const apiInstance = new DatasourceApi();
const tenant = TENANT; // String | The code of the tenancy
const dataSourceCode = DSCODE; // String | The code of the datasource
const opts = {
  'entityCodes': FUNDS, // String | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT~FUNDS
  'entityKeys': Test2, // String | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1~Test2
  'paginationLimit': 10, // Number | Non-negative maximum number of entries to return. Default is 25
  'paginationOffset': 0 // Number | Non-negative number of entries to skip. Default is 0
};

// Call api endpoint
apiInstance.getDataSourceData(tenant, dataSourceCode, opts).then(
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
 **tenant** | **String**| The code of the tenancy | 
 **dataSourceCode** | **String**| The code of the datasource | 
 **entityCodes** | **String**| A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT~FUNDS | [optional] 
 **entityKeys** | **String**| A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1~Test2 | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **Number**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]

### Return type

[**DataSourceDataInstance**](DataSourceDataInstance.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

