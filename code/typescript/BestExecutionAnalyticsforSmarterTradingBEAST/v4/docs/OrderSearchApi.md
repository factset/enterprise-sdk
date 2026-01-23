# bestexecutionanalyticsforsmartertradingbeast.OrderSearchApi

All URIs are relative to *https://api.factset.com/analytics/beast/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFieldValues**](OrderSearchApi.md#getFieldValues) | **GET** /tca/search/field-values | Get Order field values
[**getOrders**](OrderSearchApi.md#getOrders) | **GET** /tca/search/orders | Get Orders by field values



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
const startDate = 2024-08-21; // Date | Date in the format YYYY-MM-DD
const endDate = 2024-08-29; // Date | Date in the format YYYY-MM-DD

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
 **startDate** | **Date**| Date in the format YYYY-MM-DD | 
 **endDate** | **Date**| Date in the format YYYY-MM-DD | 

### Return type

[**FieldValuesResponseRoot**](FieldValuesResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOrders

> OrdersResponseRoot getOrders(startDate, endDate, opts)

Get Orders by field values

Get Orders by specific field values.

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
const startDate = 2024-08-21; // Date | Date in the format YYYY-MM-DD
const endDate = 2024-08-29; // Date | Date in the format YYYY-MM-DD
const opts = {
  'securityId': FDS, // String | ISIN for European or India securities, otherwise TICKER. Works together with country and currency parameters.
  'trader': "trader_example", // String | Optionally specify a trader to filter by, Example : Ryan
  'country': US, // String | The two character ISO country code of the trading region, like US. EMEA is used for the European trading region
  'strategy': "strategy_example", // String | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom
  'broker': "broker_example", // String | Order Broker
  'orderFields': ["OrderId","Country","MasterOrderId","MessageType","ParentId"], // [String] | Specify order fields to select. The OrderId, Country, MasterOrderId, MessageType and ParentId fields are default fields and must be included if none are specified.
  'hierarchical': true, // Boolean | Return order records in hierarchical format or as flat records
  'messageType': "'Undefined'", // String | Return parent or child order records by messageType. Only apply when hierarchical is false
  'limit': 3000, // Number | Maximum number of records to return per page. Default with max value 50000
  'offset': 1 // Number | Starting position (offset) for paginated records. Specifies current page to return results. Default value 1
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
 **startDate** | **Date**| Date in the format YYYY-MM-DD | 
 **endDate** | **Date**| Date in the format YYYY-MM-DD | 
 **securityId** | **String**| ISIN for European or India securities, otherwise TICKER. Works together with country and currency parameters. | [optional] 
 **trader** | **String**| Optionally specify a trader to filter by, Example : Ryan | [optional] 
 **country** | **String**| The two character ISO country code of the trading region, like US. EMEA is used for the European trading region | [optional] 
 **strategy** | **String**| Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom | [optional] 
 **broker** | **String**| Order Broker | [optional] 
 **orderFields** | [**[String]**](String.md)| Specify order fields to select. The OrderId, Country, MasterOrderId, MessageType and ParentId fields are default fields and must be included if none are specified. | [optional] 
 **hierarchical** | **Boolean**| Return order records in hierarchical format or as flat records | [optional] [default to true]
 **messageType** | **String**| Return parent or child order records by messageType. Only apply when hierarchical is false | [optional] [default to &#39;Undefined&#39;]
 **limit** | **Number**| Maximum number of records to return per page. Default with max value 50000 | [optional] [default to 50000]
 **offset** | **Number**| Starting position (offset) for paginated records. Specifies current page to return results. Default value 1 | [optional] [default to 1]

### Return type

[**OrdersResponseRoot**](OrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

