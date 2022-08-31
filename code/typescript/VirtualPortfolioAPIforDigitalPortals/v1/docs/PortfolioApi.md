# virtualportfolioapifordigitalportals.PortfolioApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolioGet**](PortfolioApi.md#getPortfolioGet) | **GET** /portfolio/get | Details of a portfolio.
[**getPortfolioList**](PortfolioApi.md#getPortfolioList) | **GET** /portfolio/list | List of portfolios with keyfigures.
[**getPortfolioNameList**](PortfolioApi.md#getPortfolioNameList) | **GET** /portfolio/name/list | List of portfolios.
[**getPortfolioPositionList**](PortfolioApi.md#getPortfolioPositionList) | **GET** /portfolio/position/list | List all open positions of a portfolio.
[**getPortfolioTransactionList**](PortfolioApi.md#getPortfolioTransactionList) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
[**postPortfolioCreate**](PortfolioApi.md#postPortfolioCreate) | **POST** /portfolio/create | Create a portfolio.
[**postPortfolioDelete**](PortfolioApi.md#postPortfolioDelete) | **POST** /portfolio/delete | Delete a portfolio.
[**postPortfolioEvaluationList**](PortfolioApi.md#postPortfolioEvaluationList) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
[**postPortfolioModify**](PortfolioApi.md#postPortfolioModify) | **POST** /portfolio/modify | Modify a portfolio.
[**postPortfolioPayoutCreate**](PortfolioApi.md#postPortfolioPayoutCreate) | **POST** /portfolio/payout/create | Add a payout to a portfolio.
[**postPortfolioPayoutDelete**](PortfolioApi.md#postPortfolioPayoutDelete) | **POST** /portfolio/payout/delete | Delete a payout of a portfolio.
[**postPortfolioPayoutList**](PortfolioApi.md#postPortfolioPayoutList) | **POST** /portfolio/payout/list | List of payouts in a portfolio.
[**postPortfolioPayoutModify**](PortfolioApi.md#postPortfolioPayoutModify) | **POST** /portfolio/payout/modify | Modify a payout in a portfolio.
[**postPortfolioPositionClosedList**](PortfolioApi.md#postPortfolioPositionClosedList) | **POST** /portfolio/position/closed/list | List all closed positions of a portfolio.
[**postPortfolioTransactionCashCreate**](PortfolioApi.md#postPortfolioTransactionCashCreate) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
[**postPortfolioTransactionCashDelete**](PortfolioApi.md#postPortfolioTransactionCashDelete) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
[**postPortfolioTransactionCreate**](PortfolioApi.md#postPortfolioTransactionCreate) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
[**postPortfolioTransactionDelete**](PortfolioApi.md#postPortfolioTransactionDelete) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
[**postPortfolioTransactionModify**](PortfolioApi.md#postPortfolioTransactionModify) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.



## getPortfolioGet

> InlineResponse2001 getPortfolioGet(id, opts)

Details of a portfolio.

Details of a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getPortfolioGet(id, opts).then(
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
 **id** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPortfolioList

> InlineResponse2002 getPortfolioList(opts)

List of portfolios with keyfigures.

List of portfolios with keyfigures.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getPortfolioList(opts).then(
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
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPortfolioNameList

> InlineResponse2005 getPortfolioNameList(opts)

List of portfolios.

List of portfolios.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getPortfolioNameList(opts).then(
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
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPortfolioPositionList

> InlineResponse2009 getPortfolioPositionList(id, opts)

List all open positions of a portfolio.

List all open positions of a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"], // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.
  'paginationOffset': 0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.getPortfolioPositionList(id, opts).then(
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
 **id** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPortfolioTransactionList

> InlineResponse20011 getPortfolioTransactionList(id, opts)

List of transactions in a portfolio.

List of transactions in a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"], // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed.
  'paginationOffset': 0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.getPortfolioTransactionList(id, opts).then(
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
 **id** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postPortfolioCreate

> InlineResponse201 postPortfolioCreate(inlineObject)

Create a portfolio.

Create a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of portfolios would exceed 100.|400 Bad Request|

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const inlineObject = new virtualportfolioapifordigitalportals.InlineObject(); // InlineObject | 

// Call api endpoint
apiInstance.postPortfolioCreate(inlineObject).then(
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioDelete

> InlineResponse200 postPortfolioDelete(opts)

Delete a portfolio.

Delete a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject1': new virtualportfolioapifordigitalportals.InlineObject1() // InlineObject1 | 
};

// Call api endpoint
apiInstance.postPortfolioDelete(opts).then(
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioEvaluationList

> InlineResponse2004 postPortfolioEvaluationList(opts)

Evaluate a portfolio.

Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject3': new virtualportfolioapifordigitalportals.InlineObject3() // InlineObject3 | 
};

// Call api endpoint
apiInstance.postPortfolioEvaluationList(opts).then(
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioModify

> InlineResponse2003 postPortfolioModify(opts)

Modify a portfolio.

Modify a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject2': new virtualportfolioapifordigitalportals.InlineObject2() // InlineObject2 | 
};

// Call api endpoint
apiInstance.postPortfolioModify(opts).then(
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioPayoutCreate

> InlineResponse2011 postPortfolioPayoutCreate(opts)

Add a payout to a portfolio.

Add a payout to a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject4': new virtualportfolioapifordigitalportals.InlineObject4() // InlineObject4 | 
};

// Call api endpoint
apiInstance.postPortfolioPayoutCreate(opts).then(
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional] 

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioPayoutDelete

> InlineResponse2006 postPortfolioPayoutDelete(opts)

Delete a payout of a portfolio.

Delete a payout of a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |Invalid payout identifier.|400 Bad Request|

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject5': new virtualportfolioapifordigitalportals.InlineObject5() // InlineObject5 | 
};

// Call api endpoint
apiInstance.postPortfolioPayoutDelete(opts).then(
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioPayoutList

> InlineResponse2007 postPortfolioPayoutList(inlineObject6)

List of payouts in a portfolio.

List of payouts in a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const inlineObject6 = new virtualportfolioapifordigitalportals.InlineObject6(); // InlineObject6 | 

// Call api endpoint
apiInstance.postPortfolioPayoutList(inlineObject6).then(
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioPayoutModify

> InlineResponse2008 postPortfolioPayoutModify(opts)

Modify a payout in a portfolio.

Modify a payout in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;notation&#x60;, &#x60;type&#x60;, &#x60;amount&#x60;, &#x60;transaction&#x60; or &#x60;time&#x60; must be set.|400 Bad Request| |Invalid payout identifier.|400 Bad Request|

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject7': new virtualportfolioapifordigitalportals.InlineObject7() // InlineObject7 | 
};

// Call api endpoint
apiInstance.postPortfolioPayoutModify(opts).then(
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
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioPositionClosedList

> InlineResponse20010 postPortfolioPositionClosedList(opts)

List all closed positions of a portfolio.

List all closed positions of a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject8': new virtualportfolioapifordigitalportals.InlineObject8() // InlineObject8 | 
};

// Call api endpoint
apiInstance.postPortfolioPositionClosedList(opts).then(
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
 **inlineObject8** | [**InlineObject8**](InlineObject8.md)|  | [optional] 

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioTransactionCashCreate

> InlineResponse2012 postPortfolioTransactionCashCreate(opts)

Add a cash transaction to a portfolio.

Add a cash transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject12': new virtualportfolioapifordigitalportals.InlineObject12() // InlineObject12 | 
};

// Call api endpoint
apiInstance.postPortfolioTransactionCashCreate(opts).then(
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
 **inlineObject12** | [**InlineObject12**](InlineObject12.md)|  | [optional] 

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioTransactionCashDelete

> InlineResponse2006 postPortfolioTransactionCashDelete(opts)

Delete a cash transaction.

Delete a cash transaction.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject13': new virtualportfolioapifordigitalportals.InlineObject13() // InlineObject13 | 
};

// Call api endpoint
apiInstance.postPortfolioTransactionCashDelete(opts).then(
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
 **inlineObject13** | [**InlineObject13**](InlineObject13.md)|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioTransactionCreate

> InlineResponse2012 postPortfolioTransactionCreate(opts)

Add a transaction to a portfolio.

Add a transaction to a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |The number of transactions would exceed 1000.|400 Bad Request|

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject9': new virtualportfolioapifordigitalportals.InlineObject9() // InlineObject9 | 
};

// Call api endpoint
apiInstance.postPortfolioTransactionCreate(opts).then(
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
 **inlineObject9** | [**InlineObject9**](InlineObject9.md)|  | [optional] 

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioTransactionDelete

> InlineResponse2006 postPortfolioTransactionDelete(opts)

Delete a transaction of a portfolio.

Delete a transaction of a portfolio.

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject10': new virtualportfolioapifordigitalportals.InlineObject10() // InlineObject10 | 
};

// Call api endpoint
apiInstance.postPortfolioTransactionDelete(opts).then(
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postPortfolioTransactionModify

> InlineResponse2008 postPortfolioTransactionModify(opts)

Modify a transaction in a portfolio.

Modify a transaction in a portfolio.  Certain error conditions yield errors as follows:   |Error Condition|HTTP Error| |-------|--------| |At least one of the parameters &#x60;numberShares&#x60;, &#x60;price&#x60;, &#x60;charges&#x60;, &#x60;exchangeRate&#x60; or &#x60;time&#x60; must be set.|400 Bad Request|

### Example

```javascript
const { ApiClient, PortfolioApi } = require('@factset/sdk-virtualportfolioapifordigitalportals');
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

const apiInstance = new PortfolioApi();
const opts = {
  'inlineObject11': new virtualportfolioapifordigitalportals.InlineObject11() // InlineObject11 | 
};

// Call api endpoint
apiInstance.postPortfolioTransactionModify(opts).then(
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
 **inlineObject11** | [**InlineObject11**](InlineObject11.md)|  | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

