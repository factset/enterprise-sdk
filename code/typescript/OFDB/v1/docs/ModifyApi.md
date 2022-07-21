# ofdb.ModifyApi

All URIs are relative to *https://api.factset.com/analytics/ofdb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1DatabasePathDatesDateDelete**](ModifyApi.md#v1DatabasePathDatesDateDelete) | **DELETE** /v1/database/{path}/dates/{date} | 
[**v1DatabasePathDatesDatePut**](ModifyApi.md#v1DatabasePathDatesDatePut) | **PUT** /v1/database/{path}/dates/{date} | 
[**v1DatabasePathDatesDateSymbolsSymbolDelete**](ModifyApi.md#v1DatabasePathDatesDateSymbolsSymbolDelete) | **DELETE** /v1/database/{path}/dates/{date}/symbols/{symbol} | 
[**v1DatabasePathDatesDateSymbolsSymbolPut**](ModifyApi.md#v1DatabasePathDatesDateSymbolsSymbolPut) | **PUT** /v1/database/{path}/dates/{date}/symbols/{symbol} | 
[**v1DatabasePathSymbolsSymbolDelete**](ModifyApi.md#v1DatabasePathSymbolsSymbolDelete) | **DELETE** /v1/database/{path}/symbols/{symbol} | 
[**v1DatabasePathSymbolsSymbolPut**](ModifyApi.md#v1DatabasePathSymbolsSymbolPut) | **PUT** /v1/database/{path}/symbols/{symbol} | 



## v1DatabasePathDatesDateDelete

> Object v1DatabasePathDatesDateDelete(path, date)



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
apiInstance.v1DatabasePathDatesDateDelete(path, date).then(
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

**Object**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1DatabasePathDatesDatePut

> SuccessPostResponse v1DatabasePathDatesDatePut(path, date, modifydatespecific)



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
const modifydatespecific = new ofdb.Modifydatespecific(); // Modifydatespecific | Required data for updating date in the database

// Call api endpoint
apiInstance.v1DatabasePathDatesDatePut(path, date, modifydatespecific).then(
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
 **modifydatespecific** | [**Modifydatespecific**](Modifydatespecific.md)| Required data for updating date in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1DatabasePathDatesDateSymbolsSymbolDelete

> Object v1DatabasePathDatesDateSymbolsSymbolDelete(path, date, symbol)



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
apiInstance.v1DatabasePathDatesDateSymbolsSymbolDelete(path, date, symbol).then(
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

**Object**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1DatabasePathDatesDateSymbolsSymbolPut

> SuccessPostResponse v1DatabasePathDatesDateSymbolsSymbolPut(path, date, symbol, modifysymboldate)



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
const modifysymboldate = new ofdb.Modifysymboldate(); // Modifysymboldate | Data for updating symbol in the database

// Call api endpoint
apiInstance.v1DatabasePathDatesDateSymbolsSymbolPut(path, date, symbol, modifysymboldate).then(
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
 **modifysymboldate** | [**Modifysymboldate**](Modifysymboldate.md)| Data for updating symbol in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1DatabasePathSymbolsSymbolDelete

> Object v1DatabasePathSymbolsSymbolDelete(path, symbol)



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
apiInstance.v1DatabasePathSymbolsSymbolDelete(path, symbol).then(
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

**Object**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1DatabasePathSymbolsSymbolPut

> SuccessPostResponse v1DatabasePathSymbolsSymbolPut(path, symbol, modifySymbols)



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
const modifySymbols = {"data":[{"date":20200202,"field":"value"}]}; // ModifySymbols | Data for updating symbol in the database

// Call api endpoint
apiInstance.v1DatabasePathSymbolsSymbolPut(path, symbol, modifySymbols).then(
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
 **modifySymbols** | [**ModifySymbols**](ModifySymbols.md)| Data for updating symbol in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

