# ofdb.CreateApi

All URIs are relative to *https://api.factset.com/analytics/ofdb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatabase**](CreateApi.md#createDatabase) | **POST** /v1/database/ | 
[**v1DatabasePathDatesDateSymbolsPost**](CreateApi.md#v1DatabasePathDatesDateSymbolsPost) | **POST** /v1/database/{path}/dates/{date}/symbols | 
[**v1DatabasePathDatesPost**](CreateApi.md#v1DatabasePathDatesPost) | **POST** /v1/database/{path}/dates | 
[**v1DatabasePathSymbolsPost**](CreateApi.md#v1DatabasePathSymbolsPost) | **POST** /v1/database/{path}/symbols | 



## createDatabase

> InlineResponse201 createDatabase(opts)



Creates a 2d or 3d database(OFDB)

### Example

```javascript
const { ApiClient, CreateApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new CreateApi();
const opts = {
  'databaseSchema': new ofdb.DatabaseSchema() // DatabaseSchema | 
};

// Call api endpoint
apiInstance.createDatabase(opts).then(
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
 **databaseSchema** | [**DatabaseSchema**](DatabaseSchema.md)|  | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1DatabasePathDatesDateSymbolsPost

> SuccessPostResponse v1DatabasePathDatesDateSymbolsPost(path, date, postnewsymboldate)



Creates a new symbol for a given date in 3d database(OFDB)

### Example

```javascript
const { ApiClient, CreateApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new CreateApi();
const path = "path_example"; // String | Encode database path
const date = 56; // Number | Date in YYYYMMDD format
const postnewsymboldate = new ofdb.Postnewsymboldate(); // Postnewsymboldate | Data for creating symbol specific to a date in the database. At least one 3d field is required along with symbol.

// Call api endpoint
apiInstance.v1DatabasePathDatesDateSymbolsPost(path, date, postnewsymboldate).then(
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
 **postnewsymboldate** | [**Postnewsymboldate**](Postnewsymboldate.md)| Data for creating symbol specific to a date in the database. At least one 3d field is required along with symbol. | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1DatabasePathDatesPost

> SuccessPostResponse v1DatabasePathDatesPost(path, postDatesymbol)



Creates a new date with single/multiple symbols for a 3d database(OFDB).

### Example

```javascript
const { ApiClient, CreateApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new CreateApi();
const path = "path_example"; // String | Encode database path
const postDatesymbol = new ofdb.PostDatesymbol(); // PostDatesymbol | Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

// Call api endpoint
apiInstance.v1DatabasePathDatesPost(path, postDatesymbol).then(
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
 **postDatesymbol** | [**PostDatesymbol**](PostDatesymbol.md)| Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400. | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1DatabasePathSymbolsPost

> SuccessPostResponse v1DatabasePathSymbolsPost(path, createSymbols)



Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)

### Example

```javascript
const { ApiClient, CreateApi } = require('@factset/sdk-ofdb');
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

const apiInstance = new CreateApi();
const path = "path_example"; // String | Encode database path
const createSymbols = {"symbol":"FACTSET","data":[{"date":20200202,"field":"value"}]}; // CreateSymbols | Data for creating symbol in the database

// Call api endpoint
apiInstance.v1DatabasePathSymbolsPost(path, createSymbols).then(
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
 **createSymbols** | [**CreateSymbols**](CreateSymbols.md)| Data for creating symbol in the database | 

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

