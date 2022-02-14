# factsetentity.EntityStructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityStructure**](EntityStructureApi.md#getEntityStructure) | **GET** /factset-entity/v1/entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.
[**getUltimateEntityStructure**](EntityStructureApi.md#getUltimateEntityStructure) | **GET** /factset-entity/v1/ultimate-entity-structures | Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
[**postEntityStructure**](EntityStructureApi.md#postEntityStructure) | **POST** /factset-entity/v1/entity-structures | Returns all active or inactive entities below the requested entity id.
[**postUltimateEntityStructure**](EntityStructureApi.md#postUltimateEntityStructure) | **POST** /factset-entity/v1/ultimate-entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.



## getEntityStructure

> EntityStructureResponse getEntityStructure(ids, opts)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities below the requested entity id. 

### Example

```javascript
const { ApiClient, EntityStructureApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntityStructureApi();
const ids = ["AAPL-US","0FPWZZ-E","TSLA-US"]; // [String] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
const opts = {
  'level': -1, // Number | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.
  'active': -1 // Number | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.
};

// Call api endpoint
apiInstance.getEntityStructure(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **level** | **Number**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
 **active** | **Number**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

### Return type

[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getUltimateEntityStructure

> UltimateEntityStructureResponse getUltimateEntityStructure(ids, opts)

Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.

Returns full ultimate entity structure including ultimate parent and all subordinates. Will accept entity from any level of entity structure or active vs. inactive status of entity. 

### Example

```javascript
const { ApiClient, EntityStructureApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntityStructureApi();
const ids = ["AAPL-US","0FPWZZ-E","TSLA-US"]; // [String] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
const opts = {
  'level': -1, // Number | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.
  'active': -1 // Number | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.
};

// Call api endpoint
apiInstance.getUltimateEntityStructure(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **level** | **Number**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
 **active** | **Number**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

### Return type

[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postEntityStructure

> EntityStructureResponse postEntityStructure(entityStructureRequest)

Returns all active or inactive entities below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id. 

### Example

```javascript
const { ApiClient, EntityStructureApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntityStructureApi();
const entityStructureRequest = new factsetentity.EntityStructureRequest(); // EntityStructureRequest | Request Body to request a list of Entity Structure objects.

// Call api endpoint
apiInstance.postEntityStructure(entityStructureRequest).then(
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
 **entityStructureRequest** | [**EntityStructureRequest**](EntityStructureRequest.md)| Request Body to request a list of Entity Structure objects. | 

### Return type

[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postUltimateEntityStructure

> UltimateEntityStructureResponse postUltimateEntityStructure(ultimateEntityStructureRequest)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id. 

### Example

```javascript
const { ApiClient, EntityStructureApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntityStructureApi();
const ultimateEntityStructureRequest = new factsetentity.UltimateEntityStructureRequest(); // UltimateEntityStructureRequest | Request Body to request a list of Ultimate Entity Structure objects.

// Call api endpoint
apiInstance.postUltimateEntityStructure(ultimateEntityStructureRequest).then(
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
 **ultimateEntityStructureRequest** | [**UltimateEntityStructureRequest**](UltimateEntityStructureRequest.md)| Request Body to request a list of Ultimate Entity Structure objects. | 

### Return type

[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

