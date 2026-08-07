# factsetbanks.FilingsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTenDFilings**](FilingsApi.md#getTenDFilings) | **POST** /ten-d | Returns Form 10-D distribution reports
[**getUcc1Filings**](FilingsApi.md#getUcc1Filings) | **POST** /ucc1 | Returns UCC-1 filings data



## getTenDFilings

> Filings10DResponse getTenDFilings(tenDFilingsRequest)

Returns Form 10-D distribution reports

Returns SEC Form 10-D distribution reports for bank-issued asset-backed securities — pool performance and credit enhancement data including payments received, delinquencies, defaults, and cash flow distributions. Offers more frequent (monthly) insight into credit card receivables than 8-K/10-K filings.  Covers credit cards (110 data items) and auto loans (254 data items). History since 2017. Updated monthly.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FILINGS&#x60; * **subcategory**: &#x60;TEN_D&#x60; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FilingsApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new FilingsApi();
const tenDFilingsRequest = new factsetbanks.TenDFilingsRequest(); // TenDFilingsRequest | 

// Call api endpoint
apiInstance.getTenDFilings(tenDFilingsRequest).then(
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
 **tenDFilingsRequest** | [**TenDFilingsRequest**](TenDFilingsRequest.md)|  | 

### Return type

[**Filings10DResponse**](Filings10DResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getUcc1Filings

> FilingsUCC1Response getUcc1Filings(ucc1FilingsRequest)

Returns UCC-1 filings data

Returns UCC-1 financing statement filings — notices filed by creditors of an interest in a debtor&#39;s personal property. Includes secured party (banking institution), debtor name, and filing details such as expiration date.  Covers 4,500+ banking institutions; history since 2002. Updated monthly. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FilingsApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new FilingsApi();
const ucc1FilingsRequest = new factsetbanks.Ucc1FilingsRequest(); // Ucc1FilingsRequest | 

// Call api endpoint
apiInstance.getUcc1Filings(ucc1FilingsRequest).then(
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
 **ucc1FilingsRequest** | [**Ucc1FilingsRequest**](Ucc1FilingsRequest.md)|  | 

### Return type

[**FilingsUCC1Response**](FilingsUCC1Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

