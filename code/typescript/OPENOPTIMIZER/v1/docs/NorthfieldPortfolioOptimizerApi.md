# openoptimizer.NorthfieldPortfolioOptimizerApi

All URIs are relative to *https://api.factset.com/open-optimizer/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalVariablesNPO**](NorthfieldPortfolioOptimizerApi.md#getGlobalVariablesNPO) | **GET** /npo/settings/global-variables | Returns a dictionary with the name-value pairs for all global variables.
[**getOptimizationResultByIdNPO**](NorthfieldPortfolioOptimizerApi.md#getOptimizationResultByIdNPO) | **GET** /npo/{id} | Get NPO optimization result by id
[**getOptimizationStatusByIdNPO**](NorthfieldPortfolioOptimizerApi.md#getOptimizationStatusByIdNPO) | **GET** /npo/{id}/status | Get NPO optimization status by id
[**postAndOptimizeNPO**](NorthfieldPortfolioOptimizerApi.md#postAndOptimizeNPO) | **POST** /npo/optimize | Create and Run NPO optimization
[**postComponentsNPO**](NorthfieldPortfolioOptimizerApi.md#postComponentsNPO) | **POST** /npo/settings/components | Returns a dictionary with individually-filtered metadata for each component type.
[**postStrategiesNPO**](NorthfieldPortfolioOptimizerApi.md#postStrategiesNPO) | **POST** /npo/settings/strategies | Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.



## getGlobalVariablesNPO

> SettingsGlobalVarsResponse getGlobalVariablesNPO(opts)

Returns a dictionary with the name-value pairs for all global variables.

Fetch all available global variables

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NorthfieldPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new NorthfieldPortfolioOptimizerApi();
const opts = {
  'cacheControl': "cacheControl_example" // String | Standard HTTP header.  Accepts max-stale.
};

// Call api endpoint
apiInstance.getGlobalVariablesNPO(opts).then(
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
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 

### Return type

[**SettingsGlobalVarsResponse**](SettingsGlobalVarsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptimizationResultByIdNPO

> ResultResponse getOptimizationResultByIdNPO(id)

Get NPO optimization result by id

This is the endpoint to get optimization result.  If the optimization result is available, a 200 is returned.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NorthfieldPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new NorthfieldPortfolioOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run FPO optimization endpoint

// Call api endpoint
apiInstance.getOptimizationResultByIdNPO(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run FPO optimization endpoint | 

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptimizationStatusByIdNPO

> OptimizationStatus getOptimizationStatusByIdNPO(id)

Get NPO optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, a 201 is returned and the result can be fetched using /npo/{id} endpoint.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NorthfieldPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new NorthfieldPortfolioOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run NPO optimization endpoint

// Call api endpoint
apiInstance.getOptimizationStatusByIdNPO(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run NPO optimization endpoint | 

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAndOptimizeNPO

> OptimizationStatus postAndOptimizeNPO(opts)

Create and Run NPO optimization

This endpoint runs NPO optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NorthfieldPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new NorthfieldPortfolioOptimizerApi();
const opts = {
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'nPOOptimizationParametersRequest': {"data":{"strategy":{"id":"Client:/Optimizer/USS_MODEL"},"optimization":{"riskModelDate":"2023-04-30","backtestDate":"202-304-30","cashFlow":"0"},"outputTypes":{"trades":{"identifierType":"cusip","includeCash":true},"holdings":{"identifierType":"cusip","includeCash":true,"excludeZeroShares":false},"stats":true}}} // NPOOptimizationParametersRequest | Optimization Parameters
};

// Call api endpoint
apiInstance.postAndOptimizeNPO(opts).then(
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
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **nPOOptimizationParametersRequest** | [**NPOOptimizationParametersRequest**](NPOOptimizationParametersRequest.md)| Optimization Parameters | [optional] 

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postComponentsNPO

> AvailableComponentsResponse postComponentsNPO(opts)

Returns a dictionary with individually-filtered metadata for each component type.

Fetch metadata for all FPO component types. Output is individually-filtered for each component type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NorthfieldPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new NorthfieldPortfolioOptimizerApi();
const opts = {
  'bPMNPOAvailableComponentsInput': new openoptimizer.BPMNPOAvailableComponentsInput() // BPMNPOAvailableComponentsInput | 
};

// Call api endpoint
apiInstance.postComponentsNPO(opts).then(
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
 **bPMNPOAvailableComponentsInput** | [**BPMNPOAvailableComponentsInput**](BPMNPOAvailableComponentsInput.md)|  | [optional] 

### Return type

[**AvailableComponentsResponse**](AvailableComponentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postStrategiesNPO

> AvailableStrategiesResponse postStrategiesNPO(opts)

Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.

Fetch available FPO Strategies

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NorthfieldPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new NorthfieldPortfolioOptimizerApi();
const opts = {
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'availableStrategiesInput': new openoptimizer.AvailableStrategiesInput() // AvailableStrategiesInput | 
};

// Call api endpoint
apiInstance.postStrategiesNPO(opts).then(
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
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **availableStrategiesInput** | [**AvailableStrategiesInput**](AvailableStrategiesInput.md)|  | [optional] 

### Return type

[**AvailableStrategiesResponse**](AvailableStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

