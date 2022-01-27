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

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

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

> SuccessPostResponse v1DatabasePathDatesDatePut(path, date, inlineObject3)



Updates an existing date field value for single/multiple symbols or adds a new date/symbol within a date if not present in 3d database(OFDB).

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format
const inlineObject3 = new ofdb.InlineObject3(); // InlineObject3 | 

// Call api endpoint
apiInstance.v1DatabasePathDatesDatePut(path, date, inlineObject3).then(
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | 

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

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

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

> SuccessPostResponse v1DatabasePathDatesDateSymbolsSymbolPut(path, date, symbol, inlineObject5)



Updates a symbol field value for a given date of 3d database(OFDB)

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format
const symbol = "symbol_example"; // String | Symbol with in the ofdb
const inlineObject5 = new ofdb.InlineObject5(); // InlineObject5 | 

// Call api endpoint
apiInstance.v1DatabasePathDatesDateSymbolsSymbolPut(path, date, symbol, inlineObject5).then(
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | 

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

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

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

> SuccessPostResponse v1DatabasePathSymbolsSymbolPut(path, symbol, inlineObject1)



Updates an existing symbol field value for single/multiple dates or adds a new symbol/date within a symbol if not present in 3d database(OFDB). Updates an existing symbol field value or adds a new symbol if not present in the 2d database(OFDB)

### Example

```javascript
const { ApiClient, ModifyApi } = require('@factset/sdk-ofdb');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new ModifyApi();
const path = "path_example"; // String | Encode database path
const symbol = "symbol_example"; // String | Symbol with in the ofdb
const inlineObject1 = new ofdb.InlineObject1(); // InlineObject1 | 

// Call api endpoint
apiInstance.v1DatabasePathSymbolsSymbolPut(path, symbol, inlineObject1).then(
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

