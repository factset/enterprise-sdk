# ofdb.ModifyApi

All URIs are relative to *https://api.factset.com/analytics/ofdb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDates**](ModifyApi.md#deleteDates) | **DELETE** /v1/database/{path}/dates/{date} | 
[**deleteSymbolDate3D**](ModifyApi.md#deleteSymbolDate3D) | **DELETE** /v1/database/{path}/dates/{date}/symbols/{symbol} | 
[**deleteSymbols**](ModifyApi.md#deleteSymbols) | **DELETE** /v1/database/{path}/symbols/{symbol} | 
[**updateSymbolDate**](ModifyApi.md#updateSymbolDate) | **PUT** /v1/database/{path}/dates/{date} | 
[**updateSymbolDate3D**](ModifyApi.md#updateSymbolDate3D) | **PUT** /v1/database/{path}/dates/{date}/symbols/{symbol} | 
[**updateSymbols**](ModifyApi.md#updateSymbols) | **PUT** /v1/database/{path}/symbols/{symbol} | 



## deleteDates

> InlineResponse202 deleteDates(path, date)



Deletes all data specific to the date in 3d database(OFDB). This includes all the symbols related to that date

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format

// Call api endpoint
apiInstance.deleteDates(path, date).then(
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
 **path** | **String**| Encode database path | 
 **date** | **Number**| Date in YYYYMMDD format | 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteSymbolDate3D

> InlineResponse202 deleteSymbolDate3D(path, date, symbol)



Deletes data specific to the symbol and date from a 3d database(OFDB).

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format
const symbol = "symbol_example"; // String | Symbol with in the ofdb

// Call api endpoint
apiInstance.deleteSymbolDate3D(path, date, symbol).then(
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
 **path** | **String**| Encode database path | 
 **date** | **Number**| Date in YYYYMMDD format | 
 **symbol** | **String**| Symbol with in the ofdb | 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteSymbols

> InlineResponse202 deleteSymbols(path, symbol)



Deletes all data specific to the symbol in both 2d and 3d database(OFDB). This includes all the dates related to that symbols in 3d database(OFDB)

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const symbol = "symbol_example"; // String | Symbol with in the ofdb

// Call api endpoint
apiInstance.deleteSymbols(path, symbol).then(
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
 **path** | **String**| Encode database path | 
 **symbol** | **String**| Symbol with in the ofdb | 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateSymbolDate

> SuccessPostResponse updateSymbolDate(path, date, updateSymbolDate)



Updates an existing date field value for single/multiple symbols or adds a new date/symbol within a date if not present in 3d database(OFDB).

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format
const updateSymbolDate = new ofdb.UpdateSymbolDate(); // UpdateSymbolDate | Required data for updating date in the database

// Call api endpoint
apiInstance.updateSymbolDate(path, date, updateSymbolDate).then(
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
 **path** | **String**| Encode database path | 
 **date** | **Number**| Date in YYYYMMDD format | 
 **updateSymbolDate** | [**UpdateSymbolDate**](UpdateSymbolDate.md)| Required data for updating date in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateSymbolDate3D

> SuccessPostResponse updateSymbolDate3D(path, date, symbol, updateSymbolDate3D)



Updates a symbol field value for a given date of 3d database(OFDB)

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format
const symbol = "symbol_example"; // String | Symbol with in the ofdb
const updateSymbolDate3D = new ofdb.UpdateSymbolDate3D(); // UpdateSymbolDate3D | Data for updating symbol in the database

// Call api endpoint
apiInstance.updateSymbolDate3D(path, date, symbol, updateSymbolDate3D).then(
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
 **path** | **String**| Encode database path | 
 **date** | **Number**| Date in YYYYMMDD format | 
 **symbol** | **String**| Symbol with in the ofdb | 
 **updateSymbolDate3D** | [**UpdateSymbolDate3D**](UpdateSymbolDate3D.md)| Data for updating symbol in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateSymbols

> SuccessPostResponse updateSymbols(path, symbol, updateSymbols)



Updates an existing symbol field value for single/multiple dates or adds a new symbol/date within a symbol if not present in 3d database(OFDB). Updates an existing symbol field value or adds a new symbol if not present in the 2d database(OFDB)

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const symbol = "symbol_example"; // String | Symbol with in the ofdb
const updateSymbols = {"data":[{"date":"20200202","price":"999"}]}; // UpdateSymbols | Data for updating symbol in the database

// Call api endpoint
apiInstance.updateSymbols(path, symbol, updateSymbols).then(
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
 **path** | **String**| Encode database path | 
 **symbol** | **String**| Symbol with in the ofdb | 
 **updateSymbols** | [**UpdateSymbols**](UpdateSymbols.md)| Data for updating symbol in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

