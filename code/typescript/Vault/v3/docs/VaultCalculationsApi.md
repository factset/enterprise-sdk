# vault.VaultCalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](VaultCalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/vault/v3/calculations/{id} | Cancel Vault calculation by id
[**getCalculationParameters**](VaultCalculationsApi.md#getCalculationParameters) | **GET** /analytics/engines/vault/v3/calculations/{id} | Get Vault calculation parameters by id
[**getCalculationStatusById**](VaultCalculationsApi.md#getCalculationStatusById) | **GET** /analytics/engines/vault/v3/calculations/{id}/status | Get Vault calculation status by id
[**getCalculationUnitResultById**](VaultCalculationsApi.md#getCalculationUnitResultById) | **GET** /analytics/engines/vault/v3/calculations/{id}/units/{unitId}/result | Get Vault calculation result by id
[**postAndCalculate**](VaultCalculationsApi.md#postAndCalculate) | **POST** /analytics/engines/vault/v3/calculations | Create and Run Vault calculation
[**putAndCalculate**](VaultCalculationsApi.md#putAndCalculate) | **PUT** /analytics/engines/vault/v3/calculations/{id} | Create or Update Vault calculation and run it.



## cancelCalculationById

> cancelCalculationById(id)

Cancel Vault calculation by id

This is the endpoint to cancel a previously submitted calculation.

### Example

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint

// Call api endpoint
apiInstance.cancelCalculationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Vault calculation endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## getCalculationParameters

> VaultCalculationParametersRoot getCalculationParameters(id)

Get Vault calculation parameters by id

This is the endpoint that returns the calculation parameters passed for a calculation.

### Example

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint

// Call api endpoint
apiInstance.getCalculationParameters(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Vault calculation endpoint | 

### Return type

[**VaultCalculationParametersRoot**](VaultCalculationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationStatusById

> CalculationStatusRoot getCalculationStatusById(id)

Get Vault calculation status by id

This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the location header will point to the result url.

### Example

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint

// Call api endpoint
apiInstance.getCalculationStatusById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Vault calculation endpoint | 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationUnitResultById

> ObjectRoot getCalculationUnitResultById(id, unitId)

Get Vault calculation result by id

This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.

### Example

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Get Vault calculation status by id endpoint
const unitId = "unitId_example"; // String | from url, provided from the location header in the Get Vault calculation status by id endpoint

// Call api endpoint
apiInstance.getCalculationUnitResultById(id, unitId).then(
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
 **id** | **String**| from url, provided from the location header in the Get Vault calculation status by id endpoint | 
 **unitId** | **String**| from url, provided from the location header in the Get Vault calculation status by id endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/x-protobuf


## postAndCalculate

> CalculationStatusRoot postAndCalculate(opts)

Create and Run Vault calculation

This endpoint runs the Vault calculation specified in the POST body parameters.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration&#39;s min and max date range

### Example

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds when only one unit is passed in the POST body.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'vaultCalculationParametersRoot': {"data":{"1":{"componentid":"B0FF076DFF8640B1616462B82BE1F21FBF23E0E9DE62247F4A947B17F81C9A79","account":{"id":"CLIENT:/BISAM/REPOSITORY/QA/SMALL_PORT.ACCT"},"dates":{"startdate":"20180101","enddate":"20180329","frequency":"Monthly"},"configid":"12ed7b1a-8ac2-4871-a7bf-2d5da5aaa116"},"2":{"componentid":"B75D10A84BBD26C9D0C91E78BC5723A4DE70FFE4192070820B9788E382D17E42","account":{"id":"CLIENT:/BISAM/REPOSITORY/QA/SMALL_PORT.ACCT"},"configid":"c1671411-7807-4505-9296-989fe2ffc450"}},"meta":{"contentorganization":"SimplifiedRow","contenttype":"Json"}} // VaultCalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.postAndCalculate(opts).then(
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the POST body. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **vaultCalculationParametersRoot** | [**VaultCalculationParametersRoot**](VaultCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf


## putAndCalculate

> CalculationStatusRoot putAndCalculate(id, opts)

Create or Update Vault calculation and run it.

This endpoint updates and run the Vault calculation specified in the PUT body parameters. This also allows creating new Vault calculations with custom ids.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration&#39;s min and max date range

### Example

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds when only one unit is passed in the PUT body.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'vaultCalculationParametersRoot': {"data":{"1":{"componentid":"B0FF076DFF8640B1616462B82BE1F21FBF23E0E9DE62247F4A947B17F81C9A79","account":{"id":"CLIENT:/BISAM/REPOSITORY/QA/SMALL_PORT.ACCT"},"dates":{"startdate":"20180101","enddate":"20180329","frequency":"Monthly"},"configid":"12ed7b1a-8ac2-4871-a7bf-2d5da5aaa116"},"2":{"componentid":"B75D10A84BBD26C9D0C91E78BC5723A4DE70FFE4192070820B9788E382D17E42","account":{"id":"CLIENT:/BISAM/REPOSITORY/QA/SMALL_PORT.ACCT"},"configid":"c1671411-7807-4505-9296-989fe2ffc450"}},"meta":{"contentorganization":"SimplifiedRow","contenttype":"Json"}} // VaultCalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.putAndCalculate(id, opts).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run Vault calculation endpoint | 
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the PUT body. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **vaultCalculationParametersRoot** | [**VaultCalculationParametersRoot**](VaultCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf

