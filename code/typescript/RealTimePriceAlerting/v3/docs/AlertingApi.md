# realtimepricealerting.AlertingApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertingPricesBasicAlertGet**](AlertingApi.md#getAlertingPricesBasicAlertGet) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
[**getAlertingPricesBasicAlertList**](AlertingApi.md#getAlertingPricesBasicAlertList) | **GET** /alerting/prices/basic/alert/list | List of alerts.
[**getAlertingPricesBasicTriggerGet**](AlertingApi.md#getAlertingPricesBasicTriggerGet) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
[**postAlertingPricesBasicTriggerList**](AlertingApi.md#postAlertingPricesBasicTriggerList) | **POST** /alerting/prices/basic/trigger/list | List of triggers.



## getAlertingPricesBasicAlertGet

> InlineResponse200 getAlertingPricesBasicAlertGet(id, opts)

Details of an alert.

Details of an alert. The details include the trigger definition at the time of alert creation.

### Example

```javascript
const { ApiClient, AlertingApi } = require('@factset/sdk-realtimepricealerting');
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

const apiInstance = new AlertingApi();
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getAlertingPricesBasicAlertGet(id, opts).then(
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAlertingPricesBasicAlertList

> InlineResponse2001 getAlertingPricesBasicAlertList(opts)

List of alerts.

List of alerts in descending order of creation.

### Example

```javascript
const { ApiClient, AlertingApi } = require('@factset/sdk-realtimepricealerting');
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

const apiInstance = new AlertingApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'subscriptionMinimumInterval': 0, // Number | Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately.
  'paginationCursor': "paginationCursor_example", // String | Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default).
  'paginationLimit': 20 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.getAlertingPricesBasicAlertList(opts).then(
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
 **subscriptionMinimumInterval** | **Number**| Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. | [optional] [default to 0]
 **paginationCursor** | **String**| Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). | [optional] 
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAlertingPricesBasicTriggerGet

> InlineResponse2002 getAlertingPricesBasicTriggerGet(id, opts)

Details of a trigger.

Details of a trigger.

### Example

```javascript
const { ApiClient, AlertingApi } = require('@factset/sdk-realtimepricealerting');
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

const apiInstance = new AlertingApi();
const id = "id_example"; // String | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getAlertingPricesBasicTriggerGet(id, opts).then(
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postAlertingPricesBasicTriggerList

> InlineResponse2003 postAlertingPricesBasicTriggerList(opts)

List of triggers.

Returns a list of triggers sorted in descending order of creation.

### Example

```javascript
const { ApiClient, AlertingApi } = require('@factset/sdk-realtimepricealerting');
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

const apiInstance = new AlertingApi();
const opts = {
  'postAlertingPricesBasicTriggerListRequest': new realtimepricealerting.PostAlertingPricesBasicTriggerListRequest() // PostAlertingPricesBasicTriggerListRequest | Request Body
};

// Call api endpoint
apiInstance.postAlertingPricesBasicTriggerList(opts).then(
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
 **postAlertingPricesBasicTriggerListRequest** | [**PostAlertingPricesBasicTriggerListRequest**](PostAlertingPricesBasicTriggerListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

