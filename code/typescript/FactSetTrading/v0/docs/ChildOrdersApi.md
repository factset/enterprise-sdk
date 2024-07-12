# factsettrading.ChildOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelChildOrder**](ChildOrdersApi.md#cancelChildOrder) | **POST** /child-orders/cancel | Cancel Child Orders on Trading system
[**createChildOrder**](ChildOrdersApi.md#createChildOrder) | **POST** /child-orders/create | Create Child Orders on Trading system.
[**replaceChildOrder**](ChildOrdersApi.md#replaceChildOrder) | **POST** /child-orders/replace | Replace the Child Orders on Trading system.



## cancelChildOrder

> ChildOrdersResponseRoot cancelChildOrder(opts)

Cancel Child Orders on Trading system

This endpoint is used to cancel a specific child order on Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChildOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new ChildOrdersApi();
const opts = {
  'cancelChildOrdersRoot': new factsettrading.CancelChildOrdersRoot() // CancelChildOrdersRoot | 
};

// Call api endpoint
apiInstance.cancelChildOrder(opts).then(
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
 **cancelChildOrdersRoot** | [**CancelChildOrdersRoot**](CancelChildOrdersRoot.md)|  | [optional] 

### Return type

[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createChildOrder

> CreateChildOrdersResponseRoot createChildOrder(opts)

Create Child Orders on Trading system.

This endpoint is used to create child orders on Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChildOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new ChildOrdersApi();
const opts = {
  'childOrdersRoot': {"data":{"childOrders":[{"parentId":{"basketId":"FACTSET_OMS-100823_12345","symbol":"FDS-USA"},"orderType":"market","destination":"PAPER","orderQuantity":250.01,"text":"Routing 10 orders to PAPER destination"},{"parentId":{"basketId":"FACTSET_OMS-100823_12346","symbol":"AMZN-USA"},"orderType":"market","destination":"PAPER","orderQuantity":421.01,"text":"Routing 5 orders to PAPER destination"}]}} // ChildOrdersRoot | 
};

// Call api endpoint
apiInstance.createChildOrder(opts).then(
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
 **childOrdersRoot** | [**ChildOrdersRoot**](ChildOrdersRoot.md)|  | [optional] 

### Return type

[**CreateChildOrdersResponseRoot**](CreateChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## replaceChildOrder

> ChildOrdersResponseRoot replaceChildOrder(opts)

Replace the Child Orders on Trading system.

This endpoint takes the child order to be replaced on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChildOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new ChildOrdersApi();
const opts = {
  'replaceChildOrdersRoot': new factsettrading.ReplaceChildOrdersRoot() // ReplaceChildOrdersRoot | 
};

// Call api endpoint
apiInstance.replaceChildOrder(opts).then(
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
 **replaceChildOrdersRoot** | [**ReplaceChildOrdersRoot**](ReplaceChildOrdersRoot.md)|  | [optional] 

### Return type

[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

