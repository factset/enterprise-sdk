# factsetentity.EntitySecuritiesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntitySecurities**](EntitySecuritiesApi.md#getEntitySecurities) | **GET** /factset-entity/v1/entity-securities | Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
[**postEntitySecurities**](EntitySecuritiesApi.md#postEntitySecurities) | **POST** /factset-entity/v1/entity-securities | Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.



## getEntitySecurities

> EntitySecuritiesResponse getEntitySecurities(ids, opts)

Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.

Returns all Equity Exchange Listings (ticker-exchange) and all debt instruments (cusips) issued for the requested entity. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EntitySecuritiesApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntitySecuritiesApi();
const ids = ["AAPL-US","0FPWZZ-E","TSLA-US"]; // [String] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
const opts = {
  'securityType': EQ // String | The category describes which security types will be returned in the response. Defined as: * **EQ** = All related traded equity listings * **AEQ** = All active traded and non-traded equity listings * **PR** = All active preferred securities * **F** = All active funds * **FI** = All debt instruments * **ALL** = All related traded equity listings and debt 
};

// Call api endpoint
apiInstance.getEntitySecurities(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **securityType** | **String**| The category describes which security types will be returned in the response. Defined as: * **EQ** &#x3D; All related traded equity listings * **AEQ** &#x3D; All active traded and non-traded equity listings * **PR** &#x3D; All active preferred securities * **F** &#x3D; All active funds * **FI** &#x3D; All debt instruments * **ALL** &#x3D; All related traded equity listings and debt  | [optional] [default to &#39;EQ&#39;]

### Return type

[**EntitySecuritiesResponse**](EntitySecuritiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postEntitySecurities

> EntitySecuritiesResponse postEntitySecurities(entitySecuritiesRequest)

Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.

Returns all Equity Exchange Listings (ticker-exchange) and all debt instruments (cusips) issued for the requested entity. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, EntitySecuritiesApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new EntitySecuritiesApi();
const entitySecuritiesRequest = new factsetentity.EntitySecuritiesRequest(); // EntitySecuritiesRequest | Request Body to request a list of Entity Security objects.

// Call api endpoint
apiInstance.postEntitySecurities(entitySecuritiesRequest).then(
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
 **entitySecuritiesRequest** | [**EntitySecuritiesRequest**](EntitySecuritiesRequest.md)| Request Body to request a list of Entity Security objects. | 

### Return type

[**EntitySecuritiesResponse**](EntitySecuritiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

