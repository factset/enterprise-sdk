# portfolio.ModelAccountsApi

All URIs are relative to *https://api.factset.com/analytics/accounts/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateModelAccount**](ModelAccountsApi.md#createOrUpdateModelAccount) | **PUT** /models/{name} | Create or update an existing model account
[**deleteAModelAccount**](ModelAccountsApi.md#deleteAModelAccount) | **DELETE** /models/{name} | Delete model account, takes an account path and name and deletes it.
[**deleteModelAccountByDate**](ModelAccountsApi.md#deleteModelAccountByDate) | **DELETE** /models/{name}/dates/{date} | Delete all entries for a date or specific symbol entries for a date from a previously created account.
[**deleteModelAccountBySymbol**](ModelAccountsApi.md#deleteModelAccountBySymbol) | **DELETE** /models/{name}/symbols/{symbol} | Delete all entries for a symbol or specific date entries for a symbol from a previously created account.
[**getAccount**](ModelAccountsApi.md#getAccount) | **GET** /models/{name} | Get account endpoint, takes an account name and returns underlying data
[**getAccountForDate**](ModelAccountsApi.md#getAccountForDate) | **GET** /models/{name}/dates/{date} | Get account endpoint, takes an account name, date and returns underlying data for that date
[**getAccountForDateAndSymbol**](ModelAccountsApi.md#getAccountForDateAndSymbol) | **GET** /models/{name}/dates/{date}/symbols/{symbol} | Get account endpoint, takes an account name and returns underlying data
[**getAccountForSymbol**](ModelAccountsApi.md#getAccountForSymbol) | **GET** /models/{name}/symbols/{symbol} | Get account endpoint, takes an account name, symbol and returns underlying data for that symbol
[**getAccountSchema**](ModelAccountsApi.md#getAccountSchema) | **GET** /models/{name}/schema | Get account schema endpoint, takes an account name and returns its schema



## createOrUpdateModelAccount

> createOrUpdateModelAccount(name, opts)

Create or update an existing model account

This endpoint creates and/or updates the model account specified in the URL using the holdings provided in the PUT body.  It must be used first, before fetching or cancelling endpoints.  A successful response will contain the URL of the resource in the Location header.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of the model account to create or update
const opts = {
  'modelAccountFieldsRoot': {"data":{"iterative":{"20191010":{"FDS":{"weight":"20","price":"50","priceiso":"USD"},"GOOGL":{"weight":"20","price":"50","priceiso":"USD"}}},"nonIterative":{"GOOGL":{"taxable":"false"},"FDS":{"taxable":"false"}},"additionalFields":[{"iteration":false,"name":"TAXABLE","type":"STRING","description":"Taxable","splitDirection":"NONE","size":0}]},"meta":{"description":"Test desc"}} // ModelAccountFieldsRoot | The object containing the input values
};

// Call api endpoint
apiInstance.createOrUpdateModelAccount(name, opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The path and filename of the model account to create or update | 
 **modelAccountFieldsRoot** | [**ModelAccountFieldsRoot**](ModelAccountFieldsRoot.md)| The object containing the input values | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteAModelAccount

> deleteAModelAccount(name)

Delete model account, takes an account path and name and deletes it.

This endpoint takes an account path and deletes a previously created account.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of model account to delete

// Call api endpoint
apiInstance.deleteAModelAccount(name).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The path and filename of model account to delete | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteModelAccountByDate

> deleteModelAccountByDate(name, date, opts)

Delete all entries for a date or specific symbol entries for a date from a previously created account.

This endpoint is used to delete data for entire date or specific symbols for a date from a previously created account.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The filename of model account to delete
const date = 20191010; // String | The date from the given file name to delete
const opts = {
  'symbols': ["null"] // [String] | The symbols from the given file name and date to delete (Maximum 10 symbols are allowed)
};

// Call api endpoint
apiInstance.deleteModelAccountByDate(name, date, opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The filename of model account to delete | 
 **date** | **String**| The date from the given file name to delete | 
 **symbols** | [**[String]**](String.md)| The symbols from the given file name and date to delete (Maximum 10 symbols are allowed) | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteModelAccountBySymbol

> deleteModelAccountBySymbol(name, symbol, opts)

Delete all entries for a symbol or specific date entries for a symbol from a previously created account.

This endpoint is used to delete entire symbol or specific dates for a symbol from a previously created account.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The filename of model account to delete
const symbol = FDS; // String | The symbol from the given file name to delete
const opts = {
  'dates': ["null"] // [String] | The dates from the given file name and symbol to delete (Maximum 10 dates are allowed)
};

// Call api endpoint
apiInstance.deleteModelAccountBySymbol(name, symbol, opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The filename of model account to delete | 
 **symbol** | **String**| The symbol from the given file name to delete | 
 **dates** | [**[String]**](String.md)| The dates from the given file name and symbol to delete (Maximum 10 dates are allowed) | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAccount

> DataAndMetaModel getAccount(name, opts)

Get account endpoint, takes an account name and returns underlying data

This endpoint takes an account name and returns underlying data.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of the account to get
const opts = {
  'format': "'JsonStach'" // String | Optional format for the response, supported formats are JsonStach and AccountModel
};

// Call api endpoint
apiInstance.getAccount(name, opts).then(
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
 **name** | **String**| The path and filename of the account to get | 
 **format** | **String**| Optional format for the response, supported formats are JsonStach and AccountModel | [optional] [default to &#39;JsonStach&#39;]

### Return type

[**DataAndMetaModel**](DataAndMetaModel.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAccountForDate

> DataAndMetaModel getAccountForDate(name, date, opts)

Get account endpoint, takes an account name, date and returns underlying data for that date

This endpoint takes an account name, date and returns underlying data for that date.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of the account to get
const date = 20191010; // String | The date for which data needs to be updated
const opts = {
  'format': "'JsonStach'" // String | Optional format for the response, supported formats are JsonStach and AccountModel
};

// Call api endpoint
apiInstance.getAccountForDate(name, date, opts).then(
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
 **name** | **String**| The path and filename of the account to get | 
 **date** | **String**| The date for which data needs to be updated | 
 **format** | **String**| Optional format for the response, supported formats are JsonStach and AccountModel | [optional] [default to &#39;JsonStach&#39;]

### Return type

[**DataAndMetaModel**](DataAndMetaModel.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAccountForDateAndSymbol

> DataAndMetaModel getAccountForDateAndSymbol(name, symbol, date, opts)

Get account endpoint, takes an account name and returns underlying data

This endpoint takes an account name, symbol and date and returns underlying data.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of the account to get
const symbol = FDS; // String | The symbol for which data needs to be updated
const date = 20191010; // String | The date for which data needs to be updated
const opts = {
  'format': "'JsonStach'" // String | Optional format for the response, supported formats are JsonStach and AccountModel
};

// Call api endpoint
apiInstance.getAccountForDateAndSymbol(name, symbol, date, opts).then(
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
 **name** | **String**| The path and filename of the account to get | 
 **symbol** | **String**| The symbol for which data needs to be updated | 
 **date** | **String**| The date for which data needs to be updated | 
 **format** | **String**| Optional format for the response, supported formats are JsonStach and AccountModel | [optional] [default to &#39;JsonStach&#39;]

### Return type

[**DataAndMetaModel**](DataAndMetaModel.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAccountForSymbol

> DataAndMetaModel getAccountForSymbol(name, symbol, opts)

Get account endpoint, takes an account name, symbol and returns underlying data for that symbol

This endpoint takes an account name, symbol and returns underlying data for that symbol.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of the account to get
const symbol = FDS; // String | The symbol for which data needs to be updated
const opts = {
  'format': "'JsonStach'" // String | Optional format for the response, supported formats are JsonStach and AccountModel
};

// Call api endpoint
apiInstance.getAccountForSymbol(name, symbol, opts).then(
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
 **name** | **String**| The path and filename of the account to get | 
 **symbol** | **String**| The symbol for which data needs to be updated | 
 **format** | **String**| Optional format for the response, supported formats are JsonStach and AccountModel | [optional] [default to &#39;JsonStach&#39;]

### Return type

[**DataAndMetaModel**](DataAndMetaModel.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAccountSchema

> ModelAccountSchemaRoot getAccountSchema(name)

Get account schema endpoint, takes an account name and returns its schema

This endpoint returns the Schema for a previously created account.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ModelAccountsApi } = require('@factset/sdk-portfolio');
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

const apiInstance = new ModelAccountsApi();
const name = Client:/Folder1/AccountName.Acct; // String | The path and filename of the account to get its schema

// Call api endpoint
apiInstance.getAccountSchema(name).then(
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
 **name** | **String**| The path and filename of the account to get its schema | 

### Return type

[**ModelAccountSchemaRoot**](ModelAccountSchemaRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

