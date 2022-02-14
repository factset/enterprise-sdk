# symbology.TickerApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTickerHistory**](TickerApi.md#batchTickerHistory) | **POST** /symbology/v2/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
[**batchTranslateTicker**](TickerApi.md#batchTranslateTicker) | **POST** /symbology/v2/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security.
[**tickerHistory**](TickerApi.md#tickerHistory) | **GET** /symbology/v2/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
[**translateTicker**](TickerApi.md#translateTicker) | **GET** /symbology/v2/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security. - Current Only



## batchTickerHistory

> TickerHistoryTranslationResponse batchTickerHistory(tickerHistoryTranslationRequest)

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security. &lt;p&gt; This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;

### Example

```javascript
const { ApiClient, TickerApi } = require('@factset/sdk-symbology');
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

const apiInstance = new TickerApi();
const tickerHistoryTranslationRequest = new symbology.TickerHistoryTranslationRequest(); // TickerHistoryTranslationRequest | Response Body for Ticker History

// Call api endpoint
apiInstance.batchTickerHistory(tickerHistoryTranslationRequest).then(
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
 **tickerHistoryTranslationRequest** | [**TickerHistoryTranslationRequest**](TickerHistoryTranslationRequest.md)| Response Body for Ticker History | 

### Return type

[**TickerHistoryTranslationResponse**](TickerHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## batchTranslateTicker

> TickerTranslationResponse batchTranslateTicker(tickerTranslationRequest)

Returns the Ticker-Exchange or Ticker-Region for a given security.

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security. &lt;p&gt; This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;

### Example

```javascript
const { ApiClient, TickerApi } = require('@factset/sdk-symbology');
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

const apiInstance = new TickerApi();
const tickerTranslationRequest = new symbology.TickerTranslationRequest(); // TickerTranslationRequest | Request Body for Ticker History

// Call api endpoint
apiInstance.batchTranslateTicker(tickerTranslationRequest).then(
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
 **tickerTranslationRequest** | [**TickerTranslationRequest**](TickerTranslationRequest.md)| Request Body for Ticker History | 

### Return type

[**TickerTranslationResponse**](TickerTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## tickerHistory

> TickerHistoryTranslationResponse tickerHistory(ids, opts)

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.

Return the full history of Ticker changes for a given market security or FactSet Permanent Id. &lt;p&gt; *GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it&#39;s advised to use POST method to retrieve the same response model.*&lt;/p&gt;

### Example

```javascript
const { ApiClient, TickerApi } = require('@factset/sdk-symbology');
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

const apiInstance = new TickerApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'tickerType': REGION, // String | Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** = Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** = TIcker-Exchange (e.g. GOOGL-NAS) 
  'asOfDate': 2010-01-01 // String | As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null.
};

// Call api endpoint
apiInstance.tickerHistory(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **tickerType** | **String**| Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** &#x3D; Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** &#x3D; TIcker-Exchange (e.g. GOOGL-NAS)  | [optional] [default to &#39;REGION&#39;]
 **asOfDate** | **String**| As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. | [optional] 

### Return type

[**TickerHistoryTranslationResponse**](TickerHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## translateTicker

> TickerTranslationResponse translateTicker(ids, opts)

Returns the Ticker-Exchange or Ticker-Region for a given security. - Current Only

Returns the Ticker-Exchange or Ticker-Region for a given security.\\ 

### Example

```javascript
const { ApiClient, TickerApi } = require('@factset/sdk-symbology');
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

const apiInstance = new TickerApi();
const ids = ["GOOGL-US"]; // [String] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'tickerType': REGION // String | Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** = Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** = TIcker-Exchange (e.g. GOOGL-NAS) 
};

// Call api endpoint
apiInstance.translateTicker(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **tickerType** | **String**| Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** &#x3D; Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** &#x3D; TIcker-Exchange (e.g. GOOGL-NAS)  | [optional] [default to &#39;REGION&#39;]

### Return type

[**TickerTranslationResponse**](TickerTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

