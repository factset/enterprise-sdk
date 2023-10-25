# axiomaequityoptimizer.OptimizationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelAxiomaOptimizationById**](OptimizationsApi.md#cancelAxiomaOptimizationById) | **DELETE** /analytics/engines/axp/v1/optimizations/{id} | Cancel Axioma optimization by id
[**getAxiomaOptimizationById**](OptimizationsApi.md#getAxiomaOptimizationById) | **GET** /analytics/engines/axp/v1/optimizations/{id} | Get Axioma optimization by id
[**runAxiomaOptimization**](OptimizationsApi.md#runAxiomaOptimization) | **POST** /analytics/engines/axp/v1/optimizations | Run Axioma optimization



## cancelAxiomaOptimizationById

> cancelAxiomaOptimizationById(id)

Cancel Axioma optimization by id

This is the endpoint to cancel a previously submitted optimization. Instead of doing a GET on the polling URL, cancel the request by doing a DELETE.

### Example

```javascript
const { ApiClient, OptimizationsApi } = require('@factset/sdk-axiomaequityoptimizer');
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

const apiInstance = new OptimizationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Run Optimization endpoint

// Call api endpoint
apiInstance.cancelAxiomaOptimizationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Run Optimization endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getAxiomaOptimizationById

> getAxiomaOptimizationById(id)

Get Axioma optimization by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

```javascript
const { ApiClient, OptimizationsApi } = require('@factset/sdk-axiomaequityoptimizer');
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

const apiInstance = new OptimizationsApi();
const id = "id_example"; // String | from url, provided from the location header in the Run Optimization endpoint

// Call api endpoint
apiInstance.getAxiomaOptimizationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Run Optimization endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## runAxiomaOptimization

> runAxiomaOptimization(opts)

Run Axioma optimization

This endpoint runs Axioma optimization specified in the POST body parameters.  It must be used first before polling or cancelling endpoints.  A successful response will contain the URL to poll for the result of the optimization.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

```javascript
const { ApiClient, OptimizationsApi } = require('@factset/sdk-axiomaequityoptimizer');
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

const apiInstance = new OptimizationsApi();
const opts = {
  'axiomaEquityOptimizationParameters': new axiomaequityoptimizer.AxiomaEquityOptimizationParameters() // AxiomaEquityOptimizationParameters | 
};

// Call api endpoint
apiInstance.runAxiomaOptimization(opts).then(
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
 **axiomaEquityOptimizationParameters** | [**AxiomaEquityOptimizationParameters**](AxiomaEquityOptimizationParameters.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

