# quotesapifordigitalportals.PricesApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPricesBidAskGet**](PricesApi.md#getPricesBidAskGet) | **GET** /prices/bidAsk/get | Current bid and ask prices (best bid / offer) for a notation.
[**getPricesBidAskList**](PricesApi.md#getPricesBidAskList) | **GET** /prices/bidAsk/list | Current bid and ask prices (best bid / offer) for a list of notations.
[**getPricesGet**](PricesApi.md#getPricesGet) | **GET** /prices/get | Overview of trading on the current trading day, including the latest price, for a notation.
[**getPricesList**](PricesApi.md#getPricesList) | **GET** /prices/list | Overview of trading on the current trading day, including the latest price, for a list of notations.
[**getPricesOrderbookAggregatedGet**](PricesApi.md#getPricesOrderbookAggregatedGet) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**getPricesOrderbookFullGet**](PricesApi.md#getPricesOrderbookFullGet) | **GET** /prices/orderbook/full/get | Full orderbook
[**getPricesTradingScheduleEventTypeList**](PricesApi.md#getPricesTradingScheduleEventTypeList) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**postPricesTradingScheduleEventList**](PricesApi.md#postPricesTradingScheduleEventList) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.



## getPricesBidAskGet

> InlineResponse20081 getPricesBidAskGet(id, opts)

Current bid and ask prices (best bid / offer) for a notation.

Current bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute &#x60;_subscriptionMinimalInterval&#x60; for valid update rates.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'quality': "'DLY'", // String | Quality of the price.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'subscriptionMinimumInterval': 5000.0 // Number | Minimum number of milliseconds at which updates are send.
};

// Call api endpoint
apiInstance.getPricesBidAskGet(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **quality** | **String**| Quality of the price. | [optional] [default to &#39;DLY&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **Number**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000.0]

### Return type

[**InlineResponse20081**](InlineResponse20081.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPricesBidAskList

> InlineResponse20082 getPricesBidAskList(ids, opts)

Current bid and ask prices (best bid / offer) for a list of notations.

Current bid and ask prices (best bid / offer) for a list of notations.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'quality': "'DLY'", // String | Quality of the price.
  'sameQuality': true, // Boolean | Assure that the prices for all notations are of the same quality.
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getPricesBidAskList(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **quality** | **String**| Quality of the price. | [optional] [default to &#39;DLY&#39;]
 **sameQuality** | **Boolean**| Assure that the prices for all notations are of the same quality. | [optional] [default to true]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20082**](InlineResponse20082.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPricesGet

> InlineResponse20079 getPricesGet(id, opts)

Overview of trading on the current trading day, including the latest price, for a notation.

Overview of trading on the current trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute &#x60;_subscriptionMinimalInterval&#x60; for valid update rates.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'quality': "'DLY'", // String | Quality of the price.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'subscriptionMinimumInterval': 5000.0 // Number | Minimum number of milliseconds at which updates are send.
};

// Call api endpoint
apiInstance.getPricesGet(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **quality** | **String**| Quality of the price. | [optional] [default to &#39;DLY&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **subscriptionMinimumInterval** | **Number**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000.0]

### Return type

[**InlineResponse20079**](InlineResponse20079.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPricesList

> InlineResponse20080 getPricesList(ids, opts)

Overview of trading on the current trading day, including the latest price, for a list of notations.

Overview of trading on the current trading day, including the latest price, for a list of notations.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'quality': "'DLY'", // String | Quality of the price.
  'sameQuality': true, // Boolean | Assure that the prices for all notations are of the same quality.
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getPricesList(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **quality** | **String**| Quality of the price. | [optional] [default to &#39;DLY&#39;]
 **sameQuality** | **Boolean**| Assure that the prices for all notations are of the same quality. | [optional] [default to true]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20080**](InlineResponse20080.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPricesOrderbookAggregatedGet

> InlineResponse20083 getPricesOrderbookAggregatedGet(id, opts)

Orderbook aggregated by price.

Orderbook aggregated by price.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'quality': "'RLT'", // String | Quality of the price.
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getPricesOrderbookAggregatedGet(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **quality** | **String**| Quality of the price. | [optional] [default to &#39;RLT&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20083**](InlineResponse20083.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPricesOrderbookFullGet

> InlineResponse20084 getPricesOrderbookFullGet(id, opts)

Full orderbook

Full orderbook

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'quality': "'RLT'", // String | Quality of the price.
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getPricesOrderbookFullGet(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **quality** | **String**| Quality of the price. | [optional] [default to &#39;RLT&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20084**](InlineResponse20084.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPricesTradingScheduleEventTypeList

> InlineResponse20086 getPricesTradingScheduleEventTypeList(opts)

Trading schedule event types.

Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getPricesTradingScheduleEventTypeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20086**](InlineResponse20086.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postPricesTradingScheduleEventList

> InlineResponse20085 postPricesTradingScheduleEventList(body)

Sequence of market-related events.

Sequence of market-related events like the opening time or closing time of a market of a specific notation.

### Example

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new PricesApi();
const body = new quotesapifordigitalportals.InlineObject21(); // InlineObject21 | 

// Call api endpoint
apiInstance.postPricesTradingScheduleEventList(body).then(
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
 **body** | [**InlineObject21**](InlineObject21.md)|  | 

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

