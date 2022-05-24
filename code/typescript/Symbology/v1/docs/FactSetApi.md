# symbology.FactSetApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTranslateFactset**](FactSetApi.md#batchTranslateFactset) | **POST** /symbology/v1/factset | Translate market security symbols into FactSet Permanent Identifiers.
[**translateFactset**](FactSetApi.md#translateFactset) | **GET** /symbology/v1/factset | Translate market security symbols into FactSet Permanent Identifiers.



## batchTranslateFactset

> FactsetTranslationResponse batchTranslateFactset(factsetTranslationRequest)

Translate market security symbols into FactSet Permanent Identifiers.

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.

### Example

```javascript
const { ApiClient, FactSetApi } = require('@factset/sdk-symbology');
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

const apiInstance = new FactSetApi();
const factsetTranslationRequest = new symbology.FactsetTranslationRequest(); // FactsetTranslationRequest | Request Body for FactSet Symbology Translation

// Call api endpoint
apiInstance.batchTranslateFactset(factsetTranslationRequest).then(
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
 **factsetTranslationRequest** | [**FactsetTranslationRequest**](FactsetTranslationRequest.md)| Request Body for FactSet Symbology Translation | 

### Return type

[**FactsetTranslationResponse**](FactsetTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## translateFactset

> FactsetTranslationResponse translateFactset(ids)

Translate market security symbols into FactSet Permanent Identifiers.

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. &lt;p&gt;*GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it&#39;s advised to use POST method to retrieve the same response model.*&lt;/P&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;

### Example

```javascript
const { ApiClient, FactSetApi } = require('@factset/sdk-symbology');
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

const apiInstance = new FactSetApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.

// Call api endpoint
apiInstance.translateFactset(ids).then(
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

[**FactsetTranslationResponse**](FactsetTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

