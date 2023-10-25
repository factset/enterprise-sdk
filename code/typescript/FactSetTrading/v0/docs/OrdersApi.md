# factsettrading.OrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](OrdersApi.md#cancel) | **POST** /orders/cancel | Cancel the orders on EMS system.
[**create**](OrdersApi.md#create) | **POST** /orders/create | Send orders to EMS for execution.
[**replace**](OrdersApi.md#replace) | **POST** /orders/replace | Replace the orders on EMS system.



## cancel

> EMSOrdersCreateResponseRoot cancel(opts)

Cancel the orders on EMS system.

This endpoint takes the list of orders to be cancelled on the EMS system.

### Example

```javascript
const { ApiClient, OrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new OrdersApi();
const opts = {
  'eMSCancelOrdersRoot': new factsettrading.EMSCancelOrdersRoot() // EMSCancelOrdersRoot | 
};

// Call api endpoint
apiInstance.cancel(opts).then(
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
 **eMSCancelOrdersRoot** | [**EMSCancelOrdersRoot**](EMSCancelOrdersRoot.md)|  | [optional] 

### Return type

[**EMSOrdersCreateResponseRoot**](EMSOrdersCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create

> EMSOrdersCreateResponseRoot create(opts)

Send orders to EMS for execution.

This endpoint takes the list of orders and place them on EMS for execution.

### Example

```javascript
const { ApiClient, OrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new OrdersApi();
const opts = {
  'eMSOrdersRoot': {"data":{"investorId":"MyOrganization","orders":[{"orderId":"OR0000001","instrument":{"symbol":"GOOGL"},"side":"buy","orderType":"market","orderQuantity":1000,"price":450,"currency":"USD","handlingInstructions":"auto_ord_pub"},{"orderId":"OR0000002","instrument":{"symbol":"MSFT"},"side":"sell","orderType":"limit","orderQuantity":1000,"price":450,"currency":"USD","handlingInstructions":"auto_ord_pub"},{"orderId":"OR0000003","instrument":{"symbol":"TSLA"},"side":"buy","orderType":"market_on_close","orderQuantity":1000,"price":450,"currency":"USD","handlingInstructions":"auto_ord_pub"}]}} // EMSOrdersRoot | 
};

// Call api endpoint
apiInstance.create(opts).then(
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
 **eMSOrdersRoot** | [**EMSOrdersRoot**](EMSOrdersRoot.md)|  | [optional] 

### Return type

[**EMSOrdersCreateResponseRoot**](EMSOrdersCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## replace

> EMSOrdersCreateResponseRoot replace(opts)

Replace the orders on EMS system.

This endpoint takes the list of orders to be replaced on the EMS system.

### Example

```javascript
const { ApiClient, OrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new OrdersApi();
const opts = {
  'eMSReplaceOrdersRoot': new factsettrading.EMSReplaceOrdersRoot() // EMSReplaceOrdersRoot | 
};

// Call api endpoint
apiInstance.replace(opts).then(
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
 **eMSReplaceOrdersRoot** | [**EMSReplaceOrdersRoot**](EMSReplaceOrdersRoot.md)|  | [optional] 

### Return type

[**EMSOrdersCreateResponseRoot**](EMSOrdersCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

