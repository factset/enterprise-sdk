# symbology.BloombergFIGIApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTranslateBloomberg**](BloombergFIGIApi.md#batchTranslateBloomberg) | **POST** /symbology/v1/bloomberg | Translate market security symbols into Bloomberg Identifiers.
[**translateBloomberg**](BloombergFIGIApi.md#translateBloomberg) | **GET** /symbology/v1/bloomberg | Translate FactSet symbols into Bloomberg Identifiers.



## batchTranslateBloomberg

> BloombergTranslationResponse batchTranslateBloomberg(bloombergTranslationRequest)

Translate market security symbols into Bloomberg Identifiers.

Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;

### Example

```javascript
const { ApiClient, BloombergFIGIApi } = require('@factset/sdk-symbology');
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

const apiInstance = new BloombergFIGIApi();
const bloombergTranslationRequest = new symbology.BloombergTranslationRequest(); // BloombergTranslationRequest | Request Body for Bloomberg FIGIs.

// Call api endpoint
apiInstance.batchTranslateBloomberg(bloombergTranslationRequest).then(
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
 **bloombergTranslationRequest** | [**BloombergTranslationRequest**](BloombergTranslationRequest.md)| Request Body for Bloomberg FIGIs. | 

### Return type

[**BloombergTranslationResponse**](BloombergTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## translateBloomberg

> BloombergTranslationResponse translateBloomberg(ids)

Translate FactSet symbols into Bloomberg Identifiers.

Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.

### Example

```javascript
const { ApiClient, BloombergFIGIApi } = require('@factset/sdk-symbology');
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

const apiInstance = new BloombergFIGIApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.

// Call api endpoint
apiInstance.translateBloomberg(ids).then(
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
 **ids** | [**[String]**](String.md)| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. | 

### Return type

[**BloombergTranslationResponse**](BloombergTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

