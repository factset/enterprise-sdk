# openrisk.AboutApi

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentation**](AboutApi.md#documentation) | **GET** /linear/{version} | Get OpenAPI Specification documentation
[**healthStatus**](AboutApi.md#healthStatus) | **GET** /linear/{version}/health | Get health of service
[**listRiskModels**](AboutApi.md#listRiskModels) | **GET** /linear/{version}/riskmodels | Get available risk models
[**riskModelMetadata**](AboutApi.md#riskModelMetadata) | **GET** /linear/{version}/riskmodels/{modelCode} | Get risk model details
[**stats**](AboutApi.md#stats) | **GET** /linear/{version}/stats | Get available risk statistics details
[**statsNamesOnly**](AboutApi.md#statsNamesOnly) | **GET** /linear/{version}/stats-names-only | Get available risk statistics names



## documentation

> InlineResponse200 documentation(version)

Get OpenAPI Specification documentation

The service documentation as this OpenAPI Specification JSON document for the corresponding major version number

### Example

```javascript
const { ApiClient, AboutApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new AboutApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

// Call api endpoint
apiInstance.documentation(version).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## healthStatus

> InlineResponse2003 healthStatus(version)

Get health of service

Health status of the service

### Example

```javascript
const { ApiClient, AboutApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new AboutApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

// Call api endpoint
apiInstance.healthStatus(version).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## listRiskModels

> InlineResponse2001 listRiskModels(version)

Get available risk models

Get the list of available risk models, including their respective model codes required for use with other routes.

### Example

```javascript
const { ApiClient, AboutApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new AboutApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

// Call api endpoint
apiInstance.listRiskModels(version).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## riskModelMetadata

> InlineResponse2002 riskModelMetadata(version, modelCode)

Get risk model details

Get the meta data of the risk model for the corresponding modelCode. modelCode can be obtained via &#39;/linear/{version}/riskmodels/&#39; route.

### Example

```javascript
const { ApiClient, AboutApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new AboutApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
const modelCode = "modelCode_example"; // String | Model code

// Call api endpoint
apiInstance.riskModelMetadata(version, modelCode).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 
 **modelCode** | **String**| Model code | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## stats

> SupportedStats stats(version)

Get available risk statistics details

All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information.

### Example

```javascript
const { ApiClient, AboutApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new AboutApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

// Call api endpoint
apiInstance.stats(version).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 

### Return type

[**SupportedStats**](SupportedStats.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## statsNamesOnly

> SupportedStatsNamesOnly statsNamesOnly(version)

Get available risk statistics names

All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk)

### Example

```javascript
const { ApiClient, AboutApi } = require('@factset/sdk-openrisk');
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

const apiInstance = new AboutApi();
const version = v1; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

// Call api endpoint
apiInstance.statsNamesOnly(version).then(
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. | 

### Return type

[**SupportedStatsNamesOnly**](SupportedStatsNamesOnly.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

