# stocksapifordigitalportals.StockApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStockCompositeProfileGetByNotation**](StockApi.md#getStockCompositeProfileGetByNotation) | **GET** /stock/composite/profile/getByNotation | Provides key elements of a stock profile together with the profile of the issuing company.
[**getStockDividendTypeList**](StockApi.md#getStockDividendTypeList) | **GET** /stock/dividend/type/list | List of dividend types.
[**getStockNotationKeyFiguresBenchmarkMonth1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth1Get) | **GET** /stock/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
[**getStockNotationKeyFiguresBenchmarkMonth3Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth3Get) | **GET** /stock/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
[**getStockNotationKeyFiguresBenchmarkMonth6Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth6Get) | **GET** /stock/notation/keyFigures/benchmark/month/6/get | End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
[**getStockNotationKeyFiguresBenchmarkWeek1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkWeek1Get) | **GET** /stock/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
[**getStockNotationKeyFiguresBenchmarkYear1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkYear1Get) | **GET** /stock/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
[**getStockNotationKeyFiguresBenchmarkYear3Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkYear3Get) | **GET** /stock/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
[**getStockNotationKeyFiguresBenchmarkYear5Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkYear5Get) | **GET** /stock/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
[**getStockOwnerList**](StockApi.md#getStockOwnerList) | **GET** /stock/owner/list | List of owners for a specific type of a company&#39;s shares.
[**getStockRecommendationAggregateGet**](StockApi.md#getStockRecommendationAggregateGet) | **GET** /stock/recommendation/aggregate/get | Target price and aggregated recommendations for a stock.
[**getStockRecommendationAggregateHistoryList**](StockApi.md#getStockRecommendationAggregateHistoryList) | **GET** /stock/recommendation/aggregate/history/list | Current and historical trade recommendations and target prices for a stock.
[**postStockDividendList**](StockApi.md#postStockDividendList) | **POST** /stock/dividend/list | List of dividends for a stock.
[**postStockNotationRankingIntradayList**](StockApi.md#postStockNotationRankingIntradayList) | **POST** /stock/notation/ranking/intraday/list | Ranking of stocks&#39; notations using intraday figures.
[**postStockNotationScreenerSearch**](StockApi.md#postStockNotationScreenerSearch) | **POST** /stock/notation/screener/search | Screener for stocks&#39; notations based on stock-specific parameters.
[**postStockNotationScreenerValueRangesGet**](StockApi.md#postStockNotationScreenerValueRangesGet) | **POST** /stock/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.



## getStockCompositeProfileGetByNotation

> InlineResponse2009 getStockCompositeProfileGetByNotation(identifier, identifierType, opts)

Provides key elements of a stock profile together with the profile of the issuing company.

Provides key elements of a stock profile together with the profile of the issuing company.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockCompositeProfileGetByNotation(identifier, identifierType, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockDividendTypeList

> InlineResponse20011 getStockDividendTypeList(opts)

List of dividend types.

List of dividend types.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockDividendTypeList(opts).then(
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
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkMonth1Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth1Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkMonth1Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkMonth3Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth3Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkMonth3Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkMonth6Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth6Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of six months.

End-of-day (EOD) benchmark key figures of a stock for the time range of six months.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkMonth6Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkWeek1Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkWeek1Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkWeek1Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkYear1Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear1Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkYear1Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkYear3Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear3Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkYear3Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockNotationKeyFiguresBenchmarkYear5Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear5Get(identifier, identifierType, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const idNotationBenchmark = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockNotationKeyFiguresBenchmarkYear5Get(identifier, identifierType, idNotationBenchmark, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **idNotationBenchmark** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockOwnerList

> InlineResponse2008 getStockOwnerList(identifier, identifierType, opts)

List of owners for a specific type of a company&#39;s shares.

List of top-20 owners for a specific type of a company&#39;s shares.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getStockOwnerList(identifier, identifierType, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockRecommendationAggregateGet

> InlineResponse2003 getStockRecommendationAggregateGet(identifier, identifierType, opts)

Target price and aggregated recommendations for a stock.

Target price and aggregated recommendations for a stock.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getStockRecommendationAggregateGet(identifier, identifierType, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStockRecommendationAggregateHistoryList

> InlineResponse2004 getStockRecommendationAggregateHistoryList(identifier, identifierType, snapshots, opts)

Current and historical trade recommendations and target prices for a stock.

Current and historical trade recommendations and target prices for a stock.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const identifier = "identifier_example"; // String | 
const identifierType = "identifierType_example"; // String | 
const snapshots = ["null"]; // [String] | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getStockRecommendationAggregateHistoryList(identifier, identifierType, snapshots, opts).then(
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
 **identifier** | **String**|  | 
 **identifierType** | **String**|  | 
 **snapshots** | [**[String]**](String.md)|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postStockDividendList

> InlineResponse20010 postStockDividendList(opts)

List of dividends for a stock.

List of dividends for a stock.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const opts = {
  'postStockDividendListRequest': new stocksapifordigitalportals.PostStockDividendListRequest() // PostStockDividendListRequest | 
};

// Call api endpoint
apiInstance.postStockDividendList(opts).then(
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
 **postStockDividendListRequest** | [**PostStockDividendListRequest**](PostStockDividendListRequest.md)|  | [optional] 

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postStockNotationRankingIntradayList

> InlineResponse20013 postStockNotationRankingIntradayList(opts)

Ranking of stocks&#39; notations using intraday figures.

Ranking of stocks&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter &#x60;currency&#x60; has not been specified.&#x60;  The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const opts = {
  'postStockNotationRankingIntradayListRequest': new stocksapifordigitalportals.PostStockNotationRankingIntradayListRequest() // PostStockNotationRankingIntradayListRequest | 
};

// Call api endpoint
apiInstance.postStockNotationRankingIntradayList(opts).then(
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
 **postStockNotationRankingIntradayListRequest** | [**PostStockNotationRankingIntradayListRequest**](PostStockNotationRankingIntradayListRequest.md)|  | [optional] 

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postStockNotationScreenerSearch

> InlineResponse20014 postStockNotationScreenerSearch(opts)

Screener for stocks&#39; notations based on stock-specific parameters.

Screener for stocks&#39; notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.  Currency dependent current figures on company level (see attribute &#x60;currentKeyFigures.company.currencyDependent&#x60;) or on share instrument level (see attribute &#x60;currentKeyFigures.shareInstrument.currencyDependent&#x60;) are only returned if the currency (see parameter &#x60;currentKeyFigures.company.currencyDependent.currency.isoCode&#x60; or parameter &#x60;currentKeyFigures.shareInstrument.currencyDependent.currency.isoCode&#x60; respectively) are set.  Parameters for up to three fiscal years might be used in one request, see attribute &#x60;reportedKeyFigures&#x60;; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute &#x60;estimates&#x60;. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter &#x60;reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode&#x60; and parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60; respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter &#x60;reportedKeyFigures.fiscalYear&#x60;) or for the estimates (see parameter &#x60;estimates.fiscalYear&#x60;) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.  A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const opts = {
  'postStockNotationScreenerSearchRequest': new stocksapifordigitalportals.PostStockNotationScreenerSearchRequest() // PostStockNotationScreenerSearchRequest | 
};

// Call api endpoint
apiInstance.postStockNotationScreenerSearch(opts).then(
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
 **postStockNotationScreenerSearchRequest** | [**PostStockNotationScreenerSearchRequest**](PostStockNotationScreenerSearchRequest.md)|  | [optional] 

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postStockNotationScreenerValueRangesGet

> InlineResponse20015 postStockNotationScreenerValueRangesGet(opts)

Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/stock/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the &#x60;/notation/keyFigures/&#x60; endpoints.

### Example

```javascript
const { ApiClient, StockApi } = require('@factset/sdk-stocksapifordigitalportals');
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

const apiInstance = new StockApi();
const opts = {
  'postStockNotationScreenerValueRangesGetRequest': new stocksapifordigitalportals.PostStockNotationScreenerValueRangesGetRequest() // PostStockNotationScreenerValueRangesGetRequest | 
};

// Call api endpoint
apiInstance.postStockNotationScreenerValueRangesGet(opts).then(
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
 **postStockNotationScreenerValueRangesGetRequest** | [**PostStockNotationScreenerValueRangesGetRequest**](PostStockNotationScreenerValueRangesGetRequest.md)|  | [optional] 

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

