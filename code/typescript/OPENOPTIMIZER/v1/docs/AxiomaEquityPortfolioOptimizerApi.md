# openoptimizer.AxiomaEquityPortfolioOptimizerApi

All URIs are relative to *https://api.factset.com/open-optimizer/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalVariablesAXP**](AxiomaEquityPortfolioOptimizerApi.md#getGlobalVariablesAXP) | **GET** /axp/settings/global-variables | Returns a dictionary with the name-value pairs for all global variables.
[**getOptimizationResultByIdAXP**](AxiomaEquityPortfolioOptimizerApi.md#getOptimizationResultByIdAXP) | **GET** /axp/{id} | Get AXP optimization result by id
[**getOptimizationStatusByIdAXP**](AxiomaEquityPortfolioOptimizerApi.md#getOptimizationStatusByIdAXP) | **GET** /axp/{id}/status | Get AXP optimization status by id
[**postAndOptimizeAXP**](AxiomaEquityPortfolioOptimizerApi.md#postAndOptimizeAXP) | **POST** /axp/optimize | Create and Run AXP optimization
[**postComponentsAXP**](AxiomaEquityPortfolioOptimizerApi.md#postComponentsAXP) | **POST** /axp/settings/components | Returns a dictionary with individually-filtered metadata for each component type.
[**postStrategiesAXP**](AxiomaEquityPortfolioOptimizerApi.md#postStrategiesAXP) | **POST** /axp/settings/strategies | Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.



## getGlobalVariablesAXP

> SettingsGlobalVarsResponse getGlobalVariablesAXP(opts)

Returns a dictionary with the name-value pairs for all global variables.

Fetch all available global variables

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AxiomaEquityPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new AxiomaEquityPortfolioOptimizerApi();
const opts = {
  'cacheControl': "cacheControl_example" // String | Standard HTTP header.  Accepts max-stale.
};

// Call api endpoint
apiInstance.getGlobalVariablesAXP(opts).then(
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


## getOptimizationResultByIdAXP

> ResultResponse getOptimizationResultByIdAXP(id)

Get AXP optimization result by id

This is the endpoint to get optimization result.  If the optimization result is available, a 200 is returned.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AxiomaEquityPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new AxiomaEquityPortfolioOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run FPO optimization endpoint

// Call api endpoint
apiInstance.getOptimizationResultByIdAXP(id).then(
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


## getOptimizationStatusByIdAXP

> OptimizationStatus getOptimizationStatusByIdAXP(id)

Get AXP optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, a 201 is returned and the result can be fetched using /axp/{id} endpoint.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AxiomaEquityPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new AxiomaEquityPortfolioOptimizerApi();
const id = "id_example"; // String | from url, provided from the location header in the Create and Run AXP optimization endpoint

// Call api endpoint
apiInstance.getOptimizationStatusByIdAXP(id).then(
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
 **id** | **String**| from url, provided from the location header in the Create and Run AXP optimization endpoint | 

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAndOptimizeAXP

> OptimizationStatus postAndOptimizeAXP(opts)

Create and Run AXP optimization

This endpoint runs AXP optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AxiomaEquityPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new AxiomaEquityPortfolioOptimizerApi();
const opts = {
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'aXPOptimizationParametersRequest': {"data":{"strategy":{"id":"Client:/Optimizer/AXP2_BASE_SET","overrides":{}},"optimization":{"riskModelDate":"2020-10-09","backtestDate":"2020-10-09","cashFlow":"0"},"outputTypes":{"trades":{"identifierType":"cusip","includeCash":true},"holdings":{"identifierType":"cusip","includeCash":true,"excludeZeroShares":false},"stats":false}}} // AXPOptimizationParametersRequest | Optimization Parameters
};

// Call api endpoint
apiInstance.postAndOptimizeAXP(opts).then(
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
 **aXPOptimizationParametersRequest** | [**AXPOptimizationParametersRequest**](AXPOptimizationParametersRequest.md)| Optimization Parameters | [optional] 

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postComponentsAXP

> AvailableComponentsResponse postComponentsAXP(opts)

Returns a dictionary with individually-filtered metadata for each component type.

Fetch metadata for all FPO component types. Output is individually-filtered for each component type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AxiomaEquityPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new AxiomaEquityPortfolioOptimizerApi();
const opts = {
  'aXPAvailableComponentsInput': new openoptimizer.AXPAvailableComponentsInput() // AXPAvailableComponentsInput | 
};

// Call api endpoint
apiInstance.postComponentsAXP(opts).then(
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
 **aXPAvailableComponentsInput** | [**AXPAvailableComponentsInput**](AXPAvailableComponentsInput.md)|  | [optional] 

### Return type

[**AvailableComponentsResponse**](AvailableComponentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postStrategiesAXP

> AvailableStrategiesResponse postStrategiesAXP(opts)

Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.

Fetch available FPO Strategies

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AxiomaEquityPortfolioOptimizerApi } = require('@factset/sdk-openoptimizer');
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

const apiInstance = new AxiomaEquityPortfolioOptimizerApi();
const opts = {
  'cacheControl': "cacheControl_example", // String | Standard HTTP header.  Accepts max-stale.
  'availableStrategiesInput': new openoptimizer.AvailableStrategiesInput() // AvailableStrategiesInput | 
};

// Call api endpoint
apiInstance.postStrategiesAXP(opts).then(
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

