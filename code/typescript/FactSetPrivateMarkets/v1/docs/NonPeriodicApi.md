# factsetprivatemarkets.NonPeriodicApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNonPeriodic**](NonPeriodicApi.md#getNonPeriodic) | **GET** /factset-private-markets/v1/non-periodic | Returns Private Company reference data for a list of ids.
[**getNonPeriodicForList**](NonPeriodicApi.md#getNonPeriodicForList) | **POST** /factset-private-markets/v1/non-periodic | Returns Private Company reference data for a list of ids.



## getNonPeriodic

> NonPeriodicResponse getNonPeriodic(ids, fields)

Returns Private Company reference data for a list of ids.

Returns Private Company reference information. 

### Example

```javascript
const { ApiClient, NonPeriodicApi } = require('@factset/sdk-factsetprivatemarkets');
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

const apiInstance = new NonPeriodicApi();
const ids = ["000BFG-E","000BGZ-E","000C64-E"]; // [String] | The requested FactSet Private Market Entity Identifier in XXXXXX-E format.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
const fields = ["amtRaisedUsd"]; // [String] | Private Markets Non-Periodic Fields. 

// Call api endpoint
apiInstance.getNonPeriodic(ids, fields).then(
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
 **ids** | [**[String]**](String.md)| The requested FactSet Private Market Entity Identifier in XXXXXX-E format.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **fields** | [**[String]**](String.md)| Private Markets Non-Periodic Fields.  | 

### Return type

[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNonPeriodicForList

> NonPeriodicResponse getNonPeriodicForList(nonPeriodicRequest)

Returns Private Company reference data for a list of ids.

Returns a private markets reference object for the requested ids. 

### Example

```javascript
const { ApiClient, NonPeriodicApi } = require('@factset/sdk-factsetprivatemarkets');
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

const apiInstance = new NonPeriodicApi();
const nonPeriodicRequest = new factsetprivatemarkets.NonPeriodicRequest(); // NonPeriodicRequest | Request Body to request a list of Private Market non-periodic objects.

// Call api endpoint
apiInstance.getNonPeriodicForList(nonPeriodicRequest).then(
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
 **nonPeriodicRequest** | [**NonPeriodicRequest**](NonPeriodicRequest.md)| Request Body to request a list of Private Market non-periodic objects. | 

### Return type

[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

