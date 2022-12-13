# ofdb.AddApi

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDates**](AddApi.md#addDates) | **POST** /database/{path}/dates | 
[**addFields**](AddApi.md#addFields) | **POST** /database/{path}/fields | 
[**addSymbols**](AddApi.md#addSymbols) | **POST** /database/{path}/symbols | 



## addDates

> SuccessPostResponse addDates(path, addDates)



Creates a new date with single/multiple symbols for a 3d database(OFDB).

### Example

```javascript
const { ApiClient, AddApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new AddApi();
const path = "path_example"; // String | Encode database path
const addDates = {"symbol":"FDS","data":[{"date":20220107,"price":"444"}]}; // AddDates | Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

// Call api endpoint
apiInstance.addDates(path, addDates).then(
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
 **addDates** | [**AddDates**](AddDates.md)| Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400. | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## addFields

> SuccessPostResponse addFields(path, addFields)



Allows users to add fields to existing OFDBs

### Example

```javascript
const { ApiClient, AddApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new AddApi();
const path = "path_example"; // String | Encode database path
const addFields = {"data":[{"description":"string","iteration":"2D","name":"string","size":0,"splitDirection":"NONE","type":"INT","codePageFlag":"ASCII"}]}; // AddFields | Data for creating fields in the database.

// Call api endpoint
apiInstance.addFields(path, addFields).then(
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
 **addFields** | [**AddFields**](AddFields.md)| Data for creating fields in the database. | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## addSymbols

> SuccessPostResponse addSymbols(path, addSymbols)



Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)

### Example

```javascript
const { ApiClient, AddApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new AddApi();
const path = "path_example"; // String | Encode database path
const addSymbols = {"data":[{"symbol":"FDS","content":[{"date":20220106,"price":"333"}]}]}; // AddSymbols | Data for creating symbol in the database

// Call api endpoint
apiInstance.addSymbols(path, addSymbols).then(
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
 **addSymbols** | [**AddSymbols**](AddSymbols.md)| Data for creating symbol in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

