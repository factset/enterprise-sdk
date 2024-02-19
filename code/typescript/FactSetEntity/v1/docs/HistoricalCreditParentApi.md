# factsetentity.HistoricalCreditParentApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistCredParent**](HistoricalCreditParentApi.md#getHistCredParent) | **GET** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).
[**postHistCredParent**](HistoricalCreditParentApi.md#postHistCredParent) | **POST** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).



## getHistCredParent

> CreditParentResponse getHistCredParent(ids, opts)

Returns historical credit parents for the requested id(s).

Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, HistoricalCreditParentApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new HistoricalCreditParentApi();
const ids = ["CYQYNL-S","G17920AA0","US40434YTB38"]; // [String] | The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
const opts = {
  'asOfDate': 2020-01-01 // String | The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned. 
};

// Call api endpoint
apiInstance.getHistCredParent(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.&lt;p&gt;**Max Ids Limit set to 50 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **asOfDate** | **String**| The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned.  | [optional] 

### Return type

[**CreditParentResponse**](CreditParentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postHistCredParent

> CreditParentResponse postHistCredParent(creditParentRequest)

Returns historical credit parents for the requested id(s).

Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, HistoricalCreditParentApi } = require('@factset/sdk-factsetentity');
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

const apiInstance = new HistoricalCreditParentApi();
const creditParentRequest = new factsetentity.CreditParentRequest(); // CreditParentRequest | Request Body to request a list of credit parent objects.

// Call api endpoint
apiInstance.postHistCredParent(creditParentRequest).then(
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
 **creditParentRequest** | [**CreditParentRequest**](CreditParentRequest.md)| Request Body to request a list of credit parent objects. | 

### Return type

[**CreditParentResponse**](CreditParentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

