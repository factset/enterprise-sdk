# factsetentity.EntityReferenceChineseApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityReferenceChi**](EntityReferenceChineseApi.md#getEntityReferenceChi) | **GET** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.
[**getEntityReferenceChiForList**](EntityReferenceChineseApi.md#getEntityReferenceChiForList) | **POST** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.



## getEntityReferenceChi

> EntityReferenceChiResponse getEntityReferenceChi(ids)

Returns entity reference data in Chinese for an individual entity.

Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 

### Example

```javascript
const { ApiClient, EntityReferenceChineseApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntityReferenceChineseApi();
const ids = ["05X6LC-E","062T6N-E"]; // [String] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 1500 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

// Call api endpoint
apiInstance.getEntityReferenceChi(ids).then(
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
 **ids** | [**[String]**](String.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 1500 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 

### Return type

[**EntityReferenceChiResponse**](EntityReferenceChiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEntityReferenceChiForList

> EntityReferenceChiResponse getEntityReferenceChiForList(entityReferenceChiRequest)

Returns entity reference data in Chinese for an individual entity.

Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 

### Example

```javascript
const { ApiClient, EntityReferenceChineseApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntityReferenceChineseApi();
const entityReferenceChiRequest = new factsetentity.EntityReferenceChiRequest(); // EntityReferenceChiRequest | Request Body to request a list of Entity Reference Chinese objects.

// Call api endpoint
apiInstance.getEntityReferenceChiForList(entityReferenceChiRequest).then(
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
 **entityReferenceChiRequest** | [**EntityReferenceChiRequest**](EntityReferenceChiRequest.md)| Request Body to request a list of Entity Reference Chinese objects. | 

### Return type

[**EntityReferenceChiResponse**](EntityReferenceChiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

