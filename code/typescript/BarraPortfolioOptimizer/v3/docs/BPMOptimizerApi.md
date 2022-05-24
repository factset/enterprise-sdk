# barraportfoliooptimizer.BPMOptimizerApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOptimizationById**](BPMOptimizerApi.md#cancelOptimizationById) | **DELETE** /analytics/engines/bpm/v3/optimizations/{id} | Cancel BPM optimization by id
[**getOptimizationParameters**](BPMOptimizerApi.md#getOptimizationParameters) | **GET** /analytics/engines/bpm/v3/optimizations/{id} | Get BPM optimization parameters by id
[**getOptimizationResult**](BPMOptimizerApi.md#getOptimizationResult) | **GET** /analytics/engines/bpm/v3/optimizations/{id}/result | Get BPM optimization result by id
[**getOptimizationStatusById**](BPMOptimizerApi.md#getOptimizationStatusById) | **GET** /analytics/engines/bpm/v3/optimizations/{id}/status | Get BPM optimization status by id
[**postAndOptimize**](BPMOptimizerApi.md#postAndOptimize) | **POST** /analytics/engines/bpm/v3/optimizations | Create and Run BPM optimization
[**putAndOptimize**](BPMOptimizerApi.md#putAndOptimize) | **PUT** /analytics/engines/bpm/v3/optimizations/{id} | Create or Update BPM optimization and run it.



## cancelOptimizationById

> cancelOptimizationById(id)

Cancel BPM optimization by id

This is the endpoint to cancel a previously submitted optimization.

### Example

```javascript
const { ApiClient, BPMOptimizerApi } = require('@factset/sdk-barraportfoliooptimizer');
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

const apiInstance = new BPMOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run BPM optimization endpoint

// Call api endpoint
apiInstance.cancelOptimizationById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run BPM optimization endpoint | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## getOptimizationParameters

> BPMOptimizationParametersRoot getOptimizationParameters(id)

Get BPM optimization parameters by id

This is the endpoint that returns the optimization parameters passed for an optimization.

### Example

```javascript
const { ApiClient, BPMOptimizerApi } = require('@factset/sdk-barraportfoliooptimizer');
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

const apiInstance = new BPMOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run BPM optimization endpoint

// Call api endpoint
apiInstance.getOptimizationParameters(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run BPM optimization endpoint | 

### Return type

[**BPMOptimizationParametersRoot**](BPMOptimizationParametersRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptimizationResult

> ObjectRoot getOptimizationResult(id)

Get BPM optimization result by id

This is the endpoint to get the result of a previously requested optimization.

### Example

```javascript
const { ApiClient, BPMOptimizerApi } = require('@factset/sdk-barraportfoliooptimizer');
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

const apiInstance = new BPMOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Get BPM optimization status by id endpoint

// Call api endpoint
apiInstance.getOptimizationResult(id).then(
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
 **id** | **String**| from url, provided from the location header in the Get BPM optimization status by id endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptimizationStatusById

> ObjectRoot getOptimizationStatusById(id)

Get BPM optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.

### Example

```javascript
const { ApiClient, BPMOptimizerApi } = require('@factset/sdk-barraportfoliooptimizer');
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

const apiInstance = new BPMOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run BPM optimization endpoint

// Call api endpoint
apiInstance.getOptimizationStatusById(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run BPM optimization endpoint | 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAndOptimize

> ObjectRoot postAndOptimize(opts)

Create and Run BPM optimization

This endpoint creates and runs BPM optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

```javascript
const { ApiClient, BPMOptimizerApi } = require('@factset/sdk-barraportfoliooptimizer');
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

const apiInstance = new BPMOptimizerApi();
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts no-store, max-age, max-stale.
  'bPMOptimizationParametersRoot': new barraportfoliooptimizer.BPMOptimizationParametersRoot() // BPMOptimizationParametersRoot | Optimization Parameters
};

// Call api endpoint
apiInstance.postAndOptimize(opts).then(
  data => {

      // data is a responsewrapper: PostAndOptimizeResponseWrapper
      switch (data.statusCode) {

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationInfoRoot
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
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts no-store, max-age, max-stale. | [optional] 
 **bPMOptimizationParametersRoot** | [**BPMOptimizationParametersRoot**](BPMOptimizationParametersRoot.md)| Optimization Parameters | [optional] 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## putAndOptimize

> ObjectRoot putAndOptimize(id, opts)

Create or Update BPM optimization and run it.

This endpoint updates and run the BPM optimization specified in the PUT body parameters. It also allows the creation of new BPM optimization with custom id.

### Example

```javascript
const { ApiClient, BPMOptimizerApi } = require('@factset/sdk-barraportfoliooptimizer');
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

const apiInstance = new BPMOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run BPM optimization endpoint
const opts = {
  'xFactSetApiLongRunningDeadline': 56, // Number | Long running deadline in seconds.
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts no-store, max-age, max-stale.
  'bPMOptimizationParametersRoot': new barraportfoliooptimizer.BPMOptimizationParametersRoot() // BPMOptimizationParametersRoot | Optimization Parameters
};

// Call api endpoint
apiInstance.putAndOptimize(id, opts).then(
  data => {

      // data is a responsewrapper: PutAndOptimizeResponseWrapper
      switch (data.statusCode) {

          case 201:
             // ObjectRoot
             console.log(data.getResponse201());
             break;

          case 202:
             // CalculationInfoRoot
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
 **id** | **String**| from url, provided from the location header in the Create and Run BPM optimization endpoint | 
 **xFactSetApiLongRunningDeadline** | **Number**| Long running deadline in seconds. | [optional] 
 **cacheControl** | **String**| Standard HTTP header.  Accepts no-store, max-age, max-stale. | [optional] 
 **bPMOptimizationParametersRoot** | [**BPMOptimizationParametersRoot**](BPMOptimizationParametersRoot.md)| Optimization Parameters | [optional] 

### Return type

[**ObjectRoot**](ObjectRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

