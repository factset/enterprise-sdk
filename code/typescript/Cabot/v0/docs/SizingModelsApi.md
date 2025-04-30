# cabot.SizingModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddTrimModelAnalytic**](SizingModelsApi.md#getAddTrimModelAnalytic) | **POST** /models/add-trim | Cabot main path for Add Trim API
[**getRampDownModelAnalytic**](SizingModelsApi.md#getRampDownModelAnalytic) | **POST** /models/ramp-down | Cabot main path for Ramp Down API
[**getRampUpModelAnalytic**](SizingModelsApi.md#getRampUpModelAnalytic) | **POST** /models/ramp-up | Cabot main path for Ramp Up API



## getAddTrimModelAnalytic

> AddTrimResponseRoot getAddTrimModelAnalytic(addTrimRequestBodyRoot)

Cabot main path for Add Trim API

Cabot main path for Add Trim API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SizingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SizingModelsApi();
const addTrimRequestBodyRoot = new cabot.AddTrimRequestBodyRoot(); // AddTrimRequestBodyRoot | 

// Call api endpoint
apiInstance.getAddTrimModelAnalytic(addTrimRequestBodyRoot).then(
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
 **addTrimRequestBodyRoot** | [**AddTrimRequestBodyRoot**](AddTrimRequestBodyRoot.md)|  | 

### Return type

[**AddTrimResponseRoot**](AddTrimResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getRampDownModelAnalytic

> RampDownResponseRoot getRampDownModelAnalytic(rampDownRequestBodyRoot)

Cabot main path for Ramp Down API

Cabot main path for Ramp Down API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SizingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SizingModelsApi();
const rampDownRequestBodyRoot = new cabot.RampDownRequestBodyRoot(); // RampDownRequestBodyRoot | 

// Call api endpoint
apiInstance.getRampDownModelAnalytic(rampDownRequestBodyRoot).then(
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
 **rampDownRequestBodyRoot** | [**RampDownRequestBodyRoot**](RampDownRequestBodyRoot.md)|  | 

### Return type

[**RampDownResponseRoot**](RampDownResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getRampUpModelAnalytic

> RampUpResponseRoot getRampUpModelAnalytic(rampUpRequestBodyRoot)

Cabot main path for Ramp Up API

Cabot main path for Ramp Up API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SizingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SizingModelsApi();
const rampUpRequestBodyRoot = new cabot.RampUpRequestBodyRoot(); // RampUpRequestBodyRoot | 

// Call api endpoint
apiInstance.getRampUpModelAnalytic(rampUpRequestBodyRoot).then(
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
 **rampUpRequestBodyRoot** | [**RampUpRequestBodyRoot**](RampUpRequestBodyRoot.md)|  | 

### Return type

[**RampUpResponseRoot**](RampUpResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

