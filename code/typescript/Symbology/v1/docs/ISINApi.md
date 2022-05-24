# symbology.ISINApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchIsinHistory**](ISINApi.md#batchIsinHistory) | **POST** /symbology/v1/isin-history | Retrieve the full history or as of a specific date of ISIN changes for a requested ID.
[**batchTranslateIsin**](ISINApi.md#batchTranslateIsin) | **POST** /symbology/v1/isin | Translate market security symbols into ISIN.
[**isinHistory**](ISINApi.md#isinHistory) | **GET** /symbology/v1/isin-history | Retrieve the full history or as of a specific date of ISIN changes for the requested ID(s).
[**translateIsin**](ISINApi.md#translateIsin) | **GET** /symbology/v1/isin | Translate market security symbols into ISIN.



## batchIsinHistory

> IsinHistoryTranslationResponse batchIsinHistory(isinHistoryTranslationRequest)

Retrieve the full history or as of a specific date of ISIN changes for a requested ID.

Return the full history of ISIN changes for a given market security or FactSet Permanent Id. 

### Example

```javascript
const { ApiClient, ISINApi } = require('@factset/sdk-symbology');
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

const apiInstance = new ISINApi();
const isinHistoryTranslationRequest = new symbology.IsinHistoryTranslationRequest(); // IsinHistoryTranslationRequest | Request Body for ISIN History

// Call api endpoint
apiInstance.batchIsinHistory(isinHistoryTranslationRequest).then(
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
 **isinHistoryTranslationRequest** | [**IsinHistoryTranslationRequest**](IsinHistoryTranslationRequest.md)| Request Body for ISIN History | 

### Return type

[**IsinHistoryTranslationResponse**](IsinHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## batchTranslateIsin

> IsinTranslationResponse batchTranslateIsin(isinTranslationRequest)

Translate market security symbols into ISIN.

Translate market security symbols into ISIN and FactSet Permanent Identifiers. 

### Example

```javascript
const { ApiClient, ISINApi } = require('@factset/sdk-symbology');
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

const apiInstance = new ISINApi();
const isinTranslationRequest = new symbology.IsinTranslationRequest(); // IsinTranslationRequest | Request Body for ISIN Symbology Translation

// Call api endpoint
apiInstance.batchTranslateIsin(isinTranslationRequest).then(
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
 **isinTranslationRequest** | [**IsinTranslationRequest**](IsinTranslationRequest.md)| Request Body for ISIN Symbology Translation | 

### Return type

[**IsinTranslationResponse**](IsinTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## isinHistory

> IsinHistoryTranslationResponse isinHistory(ids)

Retrieve the full history or as of a specific date of ISIN changes for the requested ID(s).

Returns the full history of ISIN changes for a given security. 

### Example

```javascript
const { ApiClient, ISINApi } = require('@factset/sdk-symbology');
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

const apiInstance = new ISINApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.

// Call api endpoint
apiInstance.isinHistory(ids).then(
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

[**IsinHistoryTranslationResponse**](IsinHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## translateIsin

> IsinTranslationResponse translateIsin(ids, opts)

Translate market security symbols into ISIN.

Translate market security symbols into ISIN and FactSet Permanent Identifiers.  

### Example

```javascript
const { ApiClient, ISINApi } = require('@factset/sdk-symbology');
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

const apiInstance = new ISINApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
const opts = {
  'asOfDate': 2010-01-01 // String | As-Of date for historical symbol request in YYYY-MM-DD format.
};

// Call api endpoint
apiInstance.translateIsin(ids, opts).then(
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
 **asOfDate** | **String**| As-Of date for historical symbol request in YYYY-MM-DD format. | [optional] 

### Return type

[**IsinTranslationResponse**](IsinTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

