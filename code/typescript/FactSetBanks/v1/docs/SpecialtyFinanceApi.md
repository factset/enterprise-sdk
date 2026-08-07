# factsetbanks.SpecialtyFinanceApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAUM**](SpecialtyFinanceApi.md#getAUM) | **POST** /aum | Returns Form ADV AUM data
[**getFOCUS**](SpecialtyFinanceApi.md#getFOCUS) | **POST** /focus | Returns FOCUS report data



## getAUM

> AUMResponse getAUM(aUMRequest)

Returns Form ADV AUM data

Returns SEC Form ADV assets under management data for investment advisers — 19,000+ public and private US companies, wealth managers, traditional asset managers, private equity hedge funds, and Business Development Companies (BDCs). BDC coverage includes 120+ companies with annual history since 2014.  Form ADV history since 2017. Updated annually.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;SPECIALTY_FINANCE&#x60; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SpecialtyFinanceApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new SpecialtyFinanceApi();
const aUMRequest = new factsetbanks.AUMRequest(); // AUMRequest | 

// Call api endpoint
apiInstance.getAUM(aUMRequest).then(
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
 **aUMRequest** | [**AUMRequest**](AUMRequest.md)|  | 

### Return type

[**AUMResponse**](AUMResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFOCUS

> FOCUSResponse getFOCUS(fOCUSRequest)

Returns FOCUS report data

Returns FOCUS report financial data for SEC-registered broker-dealers, derived from Form X-17A-5 — income statement, balance sheet, and net capital data covering financial and operating status.  Covers 3,000+ broker-dealers; 300+ data items; history since 2015. Updated annually.  Income statement data is rarely reported by filers, so it is expected that users will see income statement values populated infrequently.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;SPECIALTY_FINANCE&#x60; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SpecialtyFinanceApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new SpecialtyFinanceApi();
const fOCUSRequest = new factsetbanks.FOCUSRequest(); // FOCUSRequest | 

// Call api endpoint
apiInstance.getFOCUS(fOCUSRequest).then(
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
 **fOCUSRequest** | [**FOCUSRequest**](FOCUSRequest.md)|  | 

### Return type

[**FOCUSResponse**](FOCUSResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

