# factsettrading.InboundOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](InboundOrdersApi.md#cancel) | **POST** /inbound-orders/cancel | Cancel the inbound orders on Trading system.
[**create**](InboundOrdersApi.md#create) | **POST** /inbound-orders/create | Send inbound orders to Trading system for execution.
[**replace**](InboundOrdersApi.md#replace) | **POST** /inbound-orders/replace | Replace the inbound orders on Trading system.



## cancel

> InboundOrdersResponseRoot cancel(opts)

Cancel the inbound orders on Trading system.

This endpoint takes the list of inbound orders to be cancelled on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InboundOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new InboundOrdersApi();
const opts = {
  'cancelInboundOrdersRoot': new factsettrading.CancelInboundOrdersRoot() // CancelInboundOrdersRoot | 
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
 **cancelInboundOrdersRoot** | [**CancelInboundOrdersRoot**](CancelInboundOrdersRoot.md)|  | [optional] 

### Return type

[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create

> InboundOrdersResponseRoot create(opts)

Send inbound orders to Trading system for execution.

This endpoint takes the list of inbound orders and place them on Trading system for execution.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InboundOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new InboundOrdersApi();
const opts = {
  'inboundOrdersRoot': {"data":{"investorId":"MyOrganization","inboundOrders":[{"clientOrderId":"OR0000001","instrument":{"symbol":"GOOGL"},"side":"buy","orderType":"market","orderQuantity":1000.01,"price":450.01,"currency":"USD","handlingInstructions":"autoOrderPublic"},{"clientOrderId":"OR0000002","instrument":{"symbol":"MSFT"},"side":"sell","orderType":"limit","orderQuantity":1000.01,"price":450.01,"currency":"USD","handlingInstructions":"autoOrderPublic"},{"clientOrderId":"OR0000003","instrument":{"symbol":"TSLA"},"side":"buy","orderType":"marketOnClose","orderQuantity":1000.01,"price":450.01,"currency":"USD","handlingInstructions":"autoOrderPublic"}]}} // InboundOrdersRoot | 
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
 **inboundOrdersRoot** | [**InboundOrdersRoot**](InboundOrdersRoot.md)|  | [optional] 

### Return type

[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## replace

> InboundOrdersResponseRoot replace(opts)

Replace the inbound orders on Trading system.

This endpoint takes the list of orders to be replaced on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InboundOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new InboundOrdersApi();
const opts = {
  'replaceInboundOrdersRoot': new factsettrading.ReplaceInboundOrdersRoot() // ReplaceInboundOrdersRoot | 
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
 **replaceInboundOrdersRoot** | [**ReplaceInboundOrdersRoot**](ReplaceInboundOrdersRoot.md)|  | [optional] 

### Return type

[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

