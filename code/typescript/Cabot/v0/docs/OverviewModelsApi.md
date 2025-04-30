# cabot.OverviewModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConstructionModelAnalytic**](OverviewModelsApi.md#getConstructionModelAnalytic) | **POST** /models/construction | Cabot main path for Construction API
[**getHitRateModelAnalytic**](OverviewModelsApi.md#getHitRateModelAnalytic) | **POST** /models/hit-rate | Cabot main path for Hit Rate API
[**getResultsModelAnalytic**](OverviewModelsApi.md#getResultsModelAnalytic) | **POST** /models/results | Cabot main path for Results API
[**getSkillsModelAnalytic**](OverviewModelsApi.md#getSkillsModelAnalytic) | **POST** /models/skills | Cabot main path for Skills API



## getConstructionModelAnalytic

> ConstructionResponseRoot getConstructionModelAnalytic(constructionRequestBodyRoot)

Cabot main path for Construction API

Cabot main path for Construction API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OverviewModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new OverviewModelsApi();
const constructionRequestBodyRoot = new cabot.ConstructionRequestBodyRoot(); // ConstructionRequestBodyRoot | 

// Call api endpoint
apiInstance.getConstructionModelAnalytic(constructionRequestBodyRoot).then(
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
 **constructionRequestBodyRoot** | [**ConstructionRequestBodyRoot**](ConstructionRequestBodyRoot.md)|  | 

### Return type

[**ConstructionResponseRoot**](ConstructionResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getHitRateModelAnalytic

> HitRateResponseRoot getHitRateModelAnalytic(hitRateRequestBodyRoot)

Cabot main path for Hit Rate API

Cabot main path for Hit Rate API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OverviewModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new OverviewModelsApi();
const hitRateRequestBodyRoot = new cabot.HitRateRequestBodyRoot(); // HitRateRequestBodyRoot | 

// Call api endpoint
apiInstance.getHitRateModelAnalytic(hitRateRequestBodyRoot).then(
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
 **hitRateRequestBodyRoot** | [**HitRateRequestBodyRoot**](HitRateRequestBodyRoot.md)|  | 

### Return type

[**HitRateResponseRoot**](HitRateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getResultsModelAnalytic

> ResultsResponseRoot getResultsModelAnalytic(resultsRequestBodyRoot)

Cabot main path for Results API

Cabot main path for Results API.     Describes portfolio returns in comparison to its benchmark. A positive value indicates excess returns while a negative value indicates underperformance.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OverviewModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new OverviewModelsApi();
const resultsRequestBodyRoot = new cabot.ResultsRequestBodyRoot(); // ResultsRequestBodyRoot | 

// Call api endpoint
apiInstance.getResultsModelAnalytic(resultsRequestBodyRoot).then(
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
 **resultsRequestBodyRoot** | [**ResultsRequestBodyRoot**](ResultsRequestBodyRoot.md)|  | 

### Return type

[**ResultsResponseRoot**](ResultsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSkillsModelAnalytic

> SkillsResponseRoot getSkillsModelAnalytic(skillsRequestBodyRoot)

Cabot main path for Skills API

Cabot main path for Skills API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OverviewModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new OverviewModelsApi();
const skillsRequestBodyRoot = new cabot.SkillsRequestBodyRoot(); // SkillsRequestBodyRoot | 

// Call api endpoint
apiInstance.getSkillsModelAnalytic(skillsRequestBodyRoot).then(
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
 **skillsRequestBodyRoot** | [**SkillsRequestBodyRoot**](SkillsRequestBodyRoot.md)|  | 

### Return type

[**SkillsResponseRoot**](SkillsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

