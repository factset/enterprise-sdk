# factsetownership.FundHoldingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipHoldings**](FundHoldingsApi.md#getOwnershipHoldings) | **GET** /factset-ownership/v1/fund-holdings | Get underlying holdings information for a requested fund identifer.
[**postOwnershipHoldings**](FundHoldingsApi.md#postOwnershipHoldings) | **POST** /factset-ownership/v1/fund-holdings | Get holdings for a list of funds.



## getOwnershipHoldings

> FundHoldingsResponse getOwnershipHoldings(ids, opts)

Get underlying holdings information for a requested fund identifer.

Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type. 

### Example

```javascript
const { ApiClient, FundHoldingsApi } = require('@factset/sdk-factsetownership');
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

const apiInstance = new FundHoldingsApi();
const ids = ["VTI-USA"]; // [String] | List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>
const opts = {
  'date': 2019-12-31, // String | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.
  'topn': 5, // String | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.
  'assetType': EQ, // String | Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL 
  'currency': USD // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getOwnershipHoldings(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of requested fund identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p&gt; | 
 **date** | **String**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional] 
 **topn** | **String**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] [default to &#39;ALL&#39;]
 **assetType** | **String**| Filter holdings by the following major asset classes -   * **EQ**  &#x3D; Equity   * **FI** &#x3D; Fixed Income   * **ALL** &#x3D; ALL  | [optional] [default to &#39;EQ&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type

[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postOwnershipHoldings

> FundHoldingsResponse postOwnershipHoldings(fundHoldingsRequest)

Get holdings for a list of funds.

Gets Holding information for a long list of Fund objects.

### Example

```javascript
const { ApiClient, FundHoldingsApi } = require('@factset/sdk-factsetownership');
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

const apiInstance = new FundHoldingsApi();
const fundHoldingsRequest = new factsetownership.FundHoldingsRequest(); // FundHoldingsRequest | Requesting Underlying Holdings for a list of Fund Identifiers.

// Call api endpoint
apiInstance.postOwnershipHoldings(fundHoldingsRequest).then(
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
 **fundHoldingsRequest** | [**FundHoldingsRequest**](FundHoldingsRequest.md)| Requesting Underlying Holdings for a list of Fund Identifiers. | 

### Return type

[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

