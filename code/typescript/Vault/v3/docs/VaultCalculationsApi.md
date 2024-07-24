# vault.VaultCalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelCalculationById**](VaultCalculationsApi.md#cancelCalculationById) | **DELETE** /analytics/engines/vault/v3/calculations/{id} | Cancel Vault calculation by id
[**getAllCalculations**](VaultCalculationsApi.md#getAllCalculations) | **GET** /analytics/engines/vault/v3/calculations | Get all calculations
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = 3d06d752c26d4fafaafa1dacd958670c; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint

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
- **Accept**: application/json


## getAllCalculations

> CalculationsSummaryRoot getAllCalculations(opts)

Get all calculations

This endpoints returns all calculation requests.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const opts = {
  'pageNumber': 1 // Number | 
};

// Call api endpoint
apiInstance.getAllCalculations(opts).then(
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
 **pageNumber** | **Number**|  | [optional] [default to 1]

### Return type

[**CalculationsSummaryRoot**](CalculationsSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCalculationParameters

> VaultCalculationParametersRoot getCalculationParameters(id)

Get Vault calculation parameters by id

This is the endpoint that returns the calculation parameters passed for a calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = 3d06d752c26d4fafaafa1dacd958670c; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = 3d06d752c26d4fafaafa1dacd958670c; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = 3d06d752c26d4fafaafa1dacd958670c; // String | from url, provided from the location header in the Get Vault calculation status by id endpoint
const unitId = vault1; // String | from url, provided from the location header in the Get Vault calculation status by id endpoint

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 10, // Number | Long running deadline in seconds when only one unit is passed in the POST body. Example value is set to 10s. Please update it as per requirement before triggering a calculation.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'vaultCalculationParametersRoot': {"data":{"vault1":{"componentid":"7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935","account":{"id":"CLIENT:/MAC/DEMO/DEMO_PS_EQ_EM_COUNTRY_ALPHA.ACCT"},"dates":{"startdate":"20180501","enddate":"20180601","frequency":"Monthly"},"configid":"e95ef921-b4d4-4bb7-93ba-60eca8e3247a"}}} // VaultCalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.postAndCalculate(opts).then(
  data => {

      // data is a responsewrapper: PostAndCalculateResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CalculationStatusRoot
             console.log(data.getResponse200());
             break;

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationStatusRoot
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the POST body. Example value is set to 10s. Please update it as per requirement before triggering a calculation. | [optional] 
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VaultCalculationsApi } = require('@factset/sdk-vault');
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

const apiInstance = new VaultCalculationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run Vault calculation endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 10, // Number | Long running deadline in seconds when only one unit is passed in the PUT body. Example value is set to 10s. Please update it as per requirement before triggering a calculation.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'vaultCalculationParametersRoot': {"data":{"vault1":{"componentid":"7CF4BCEB46020A5D3C78344108905FF73A4937F5E37CFF6BD97EC29545341935","account":{"id":"CLIENT:/MAC/DEMO/DEMO_PS_EQ_EM_COUNTRY_ALPHA.ACCT"},"dates":{"startdate":"20180501","enddate":"20180601","frequency":"Monthly"},"configid":"e95ef921-b4d4-4bb7-93ba-60eca8e3247a"}}} // VaultCalculationParametersRoot | Calculation Parameters
};

// Call api endpoint
apiInstance.putAndCalculate(id, opts).then(
  data => {

      // data is a responsewrapper: PutAndCalculateResponseWrapper
      switch (data.statusCode) {

          case 200:
             // CalculationStatusRoot
             console.log(data.getResponse200());
             break;

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationStatusRoot
             console.log(data.getResponse202());
             break;

      }

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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds when only one unit is passed in the PUT body. Example value is set to 10s. Please update it as per requirement before triggering a calculation. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **vaultCalculationParametersRoot** | [**VaultCalculationParametersRoot**](VaultCalculationParametersRoot.md)| Calculation Parameters | [optional] 

### Return type

[**CalculationStatusRoot**](CalculationStatusRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-protobuf

