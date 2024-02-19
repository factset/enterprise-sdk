# factsettrading.ChildOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelChildOrder**](ChildOrdersApi.md#cancelChildOrder) | **POST** /child-orders/cancel | Cancel Child Orders
[**createChildOrder**](ChildOrdersApi.md#createChildOrder) | **POST** /child-orders/create | Create Child Orders
[**replaceChildOrder**](ChildOrdersApi.md#replaceChildOrder) | **POST** /child-orders/replace | Replace the Child Orders on EMS system.



## cancelChildOrder

> EMSChildOrdersResponseRoot cancelChildOrder(opts)

Cancel Child Orders

This endpoint is to cancel a specific child order.

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
  'eMSCancelChildOrdersRoot': new factsettrading.EMSCancelChildOrdersRoot() // EMSCancelChildOrdersRoot | 
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
 **eMSCancelChildOrdersRoot** | [**EMSCancelChildOrdersRoot**](EMSCancelChildOrdersRoot.md)|  | [optional] 

### Return type

[**EMSChildOrdersResponseRoot**](EMSChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createChildOrder

> EMSCreateChildOrdersResponseRoot createChildOrder(opts)

Create Child Orders

This endpoint is used to create child orders.

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
  'eMSChildOrdersRoot': new factsettrading.EMSChildOrdersRoot() // EMSChildOrdersRoot | 
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
 **eMSChildOrdersRoot** | [**EMSChildOrdersRoot**](EMSChildOrdersRoot.md)|  | [optional] 

### Return type

[**EMSCreateChildOrdersResponseRoot**](EMSCreateChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## replaceChildOrder

> EMSChildOrdersResponseRoot replaceChildOrder(opts)

Replace the Child Orders on EMS system.

This endpoint takes the child order to be replaced on the EMS system.

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
  'eMSReplaceChildOrdersRoot': new factsettrading.EMSReplaceChildOrdersRoot() // EMSReplaceChildOrdersRoot | 
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
 **eMSReplaceChildOrdersRoot** | [**EMSReplaceChildOrdersRoot**](EMSReplaceChildOrdersRoot.md)|  | [optional] 

### Return type

[**EMSChildOrdersResponseRoot**](EMSChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

