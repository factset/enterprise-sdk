# bestexecutionanalyticsforsmartertradingbeast.OrderSearchApi

All URIs are relative to *https://api.factset.com/analytics/beast/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFieldValues**](OrderSearchApi.md#getFieldValues) | **GET** /tca/search/field-values | Get Order field values
[**getOrders**](OrderSearchApi.md#getOrders) | **GET** /tca/search/orders | Find Orders by field values



## getFieldValues

> FieldValuesResponseRoot getFieldValues(startDate, endDate)

Get Order field values

Get lists of Order field values for symbol, trader, region, strategy and broker fields

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OrderSearchApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new OrderSearchApi();
const startDate = 2024-07-29; // String | Search start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | Search end date in the format YYYY-MM-DD

// Call api endpoint
apiInstance.getFieldValues(startDate, endDate).then(
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
 **startDate** | **String**| Search start date in the format YYYY-MM-DD | 
 **endDate** | **String**| Search end date in the format YYYY-MM-DD | 

### Return type

[**FieldValuesResponseRoot**](FieldValuesResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOrders

> OrdersResponseRoot getOrders(startDate, endDate, opts)

Find Orders by field values

Find Orders by specific field values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OrderSearchApi } = require('@factset/sdk-bestexecutionanalyticsforsmartertradingbeast');
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

const apiInstance = new OrderSearchApi();
const startDate = 2024-07-29; // String | Search start date in the format YYYY-MM-DD
const endDate = 2024-08-29; // String | Search end date in the format YYYY-MM-DD
const opts = {
  'securityId': FDS, // String | ISIN for European securities, otherwise TICKER
  'trader': "trader_example", // String | Order Trader
  'region': US, // String | The two character ISO country code of the trading region. EMEA is used for the European trading region
  'strategy': "strategy_example", // String | Order Strategy
  'broker': "broker_example", // String | Order Broker
  'searchText': "searchText_example", // String | Free text field for searching all fields
  'hierarchical': true // Boolean | Return order records in hierarchical format or as flat records
};

// Call api endpoint
apiInstance.getOrders(startDate, endDate, opts).then(
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
 **startDate** | **String**| Search start date in the format YYYY-MM-DD | 
 **endDate** | **String**| Search end date in the format YYYY-MM-DD | 
 **securityId** | **String**| ISIN for European securities, otherwise TICKER | [optional] 
 **trader** | **String**| Order Trader | [optional] 
 **region** | **String**| The two character ISO country code of the trading region. EMEA is used for the European trading region | [optional] 
 **strategy** | **String**| Order Strategy | [optional] 
 **broker** | **String**| Order Broker | [optional] 
 **searchText** | **String**| Free text field for searching all fields | [optional] 
 **hierarchical** | **Boolean**| Return order records in hierarchical format or as flat records | [optional] [default to true]

### Return type

[**OrdersResponseRoot**](OrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

