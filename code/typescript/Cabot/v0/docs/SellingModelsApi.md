# cabot.SellingModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSellTimingModelAnalytic**](SellingModelsApi.md#getSellTimingModelAnalytic) | **POST** /models/sell-timing | Cabot main path for Sell Timing API
[**getStopLossModelAnalytic**](SellingModelsApi.md#getStopLossModelAnalytic) | **POST** /models/stop-loss | Cabot main path for Stop Loss API



## getSellTimingModelAnalytic

> SellTimingResponseRoot getSellTimingModelAnalytic(sellTimingRequestBodyRoot)

Cabot main path for Sell Timing API

Cabot main path for Sell Timing API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SellingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SellingModelsApi();
const sellTimingRequestBodyRoot = new cabot.SellTimingRequestBodyRoot(); // SellTimingRequestBodyRoot | 

// Call api endpoint
apiInstance.getSellTimingModelAnalytic(sellTimingRequestBodyRoot).then(
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
 **sellTimingRequestBodyRoot** | [**SellTimingRequestBodyRoot**](SellTimingRequestBodyRoot.md)|  | 

### Return type

[**SellTimingResponseRoot**](SellTimingResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getStopLossModelAnalytic

> StopLossResponseRoot getStopLossModelAnalytic(stopLossRequestBodyRoot)

Cabot main path for Stop Loss API

Cabot main path for Stop Loss API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SellingModelsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new SellingModelsApi();
const stopLossRequestBodyRoot = new cabot.StopLossRequestBodyRoot(); // StopLossRequestBodyRoot | 

// Call api endpoint
apiInstance.getStopLossModelAnalytic(stopLossRequestBodyRoot).then(
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
 **stopLossRequestBodyRoot** | [**StopLossRequestBodyRoot**](StopLossRequestBodyRoot.md)|  | 

### Return type

[**StopLossResponseRoot**](StopLossResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

