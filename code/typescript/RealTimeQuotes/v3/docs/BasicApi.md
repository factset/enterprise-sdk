# realtimequotes.BasicApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBasicAssetClassList**](BasicApi.md#getBasicAssetClassList) | **GET** /basic/assetClass/list | List of asset classes.
[**getBasicBenchmarkTypeList**](BasicApi.md#getBasicBenchmarkTypeList) | **GET** /basic/benchmark/type/list | List of benchmark types.
[**getBasicFrequencyTypeList**](BasicApi.md#getBasicFrequencyTypeList) | **GET** /basic/frequency/type/list | List of frequency types.
[**getBasicLanguageGet**](BasicApi.md#getBasicLanguageGet) | **GET** /basic/language/get | Details for a language.
[**getBasicLanguageGetByCode**](BasicApi.md#getBasicLanguageGetByCode) | **GET** /basic/language/getByCode | Details for a language identified by code.
[**getBasicLanguageList**](BasicApi.md#getBasicLanguageList) | **GET** /basic/language/list | List of languages.
[**getBasicMarketGet**](BasicApi.md#getBasicMarketGet) | **GET** /basic/market/get | Details of a market.
[**getBasicMarketGroupList**](BasicApi.md#getBasicMarketGroupList) | **GET** /basic/market/group/list | List of market groups.
[**getBasicMarketTypeList**](BasicApi.md#getBasicMarketTypeList) | **GET** /basic/market/type/list | List of market types.
[**getBasicMediaKindList**](BasicApi.md#getBasicMediaKindList) | **GET** /basic/media/kind/list | List of media kinds.
[**getBasicRegionContinentGet**](BasicApi.md#getBasicRegionContinentGet) | **GET** /basic/region/continent/get | Details for a continent.
[**getBasicRegionContinentList**](BasicApi.md#getBasicRegionContinentList) | **GET** /basic/region/continent/list | List of continents.
[**getBasicRegionCountryGet**](BasicApi.md#getBasicRegionCountryGet) | **GET** /basic/region/country/get | Details for a country.
[**getBasicRegionCountryGetByCode**](BasicApi.md#getBasicRegionCountryGetByCode) | **GET** /basic/region/country/getByCode | Details for a country identified by code.
[**getBasicRegionCountryList**](BasicApi.md#getBasicRegionCountryList) | **GET** /basic/region/country/list | List of countries.
[**getBasicRegionGet**](BasicApi.md#getBasicRegionGet) | **GET** /basic/region/get | Details for a region.
[**getBasicRegionList**](BasicApi.md#getBasicRegionList) | **GET** /basic/region/list | List of regions.
[**getBasicTimezoneGet**](BasicApi.md#getBasicTimezoneGet) | **GET** /basic/timezone/get | Details of a timezone.
[**getBasicTimezoneGetByName**](BasicApi.md#getBasicTimezoneGetByName) | **GET** /basic/timezone/getByName | Details of a timezone identified by name.
[**getBasicValueUnitAlternativeList**](BasicApi.md#getBasicValueUnitAlternativeList) | **GET** /basic/valueUnit/alternative/list | List of alternative units.
[**getBasicValueUnitCurrencyFractionalGet**](BasicApi.md#getBasicValueUnitCurrencyFractionalGet) | **GET** /basic/valueUnit/currency/fractional/get | Details of a fractional currency.
[**getBasicValueUnitCurrencyFractionalList**](BasicApi.md#getBasicValueUnitCurrencyFractionalList) | **GET** /basic/valueUnit/currency/fractional/list | List of fractional currencies.
[**getBasicValueUnitGet**](BasicApi.md#getBasicValueUnitGet) | **GET** /basic/valueUnit/get | Details of a value unit.
[**postBasicBackgroundTextTypeList**](BasicApi.md#postBasicBackgroundTextTypeList) | **POST** /basic/backgroundText/type/list | List of background text types.
[**postBasicDeliveryList**](BasicApi.md#postBasicDeliveryList) | **POST** /basic/delivery/list | List of deliveries.
[**postBasicMarketList**](BasicApi.md#postBasicMarketList) | **POST** /basic/market/list | List of markets.
[**postBasicMediaTypeList**](BasicApi.md#postBasicMediaTypeList) | **POST** /basic/media/type/list | List of Internet media types.
[**postBasicMicOperatingList**](BasicApi.md#postBasicMicOperatingList) | **POST** /basic/mic/operating/list | List of operating market identifier codes (MIC).
[**postBasicTimezoneList**](BasicApi.md#postBasicTimezoneList) | **POST** /basic/timezone/list | List of timezones.
[**postBasicValueUnitCurrencyList**](BasicApi.md#postBasicValueUnitCurrencyList) | **POST** /basic/valueUnit/currency/list | List of currencies.
[**postBasicValueUnitCurrencyMainList**](BasicApi.md#postBasicValueUnitCurrencyMainList) | **POST** /basic/valueUnit/currency/main/list | List of main currencies.
[**postBasicValueUnitList**](BasicApi.md#postBasicValueUnitList) | **POST** /basic/valueUnit/list | List of value units.



## getBasicAssetClassList

> InlineResponse200 getBasicAssetClassList(opts)

List of asset classes.

List of asset classes as defined by FactSet Digital Solutions.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getBasicAssetClassList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicBenchmarkTypeList

> InlineResponse2002 getBasicBenchmarkTypeList(opts)

List of benchmark types.

List of benchmark types.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicBenchmarkTypeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicFrequencyTypeList

> InlineResponse2004 getBasicFrequencyTypeList(opts)

List of frequency types.

List of frequency types.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicFrequencyTypeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicLanguageGet

> InlineResponse2005 getBasicLanguageGet(id, opts)

Details for a language.

Details for a language.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicLanguageGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicLanguageGetByCode

> InlineResponse2006 getBasicLanguageGetByCode(code, opts)

Details for a language identified by code.

Details for a language identified by code.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const code = "code_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicLanguageGetByCode(code, opts).then(
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
 **code** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicLanguageList

> InlineResponse2007 getBasicLanguageList(opts)

List of languages.

List of languages.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicLanguageList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicMarketGet

> InlineResponse2008 getBasicMarketGet(id, opts)

Details of a market.

Details of a market.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicMarketGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicMarketGroupList

> InlineResponse20010 getBasicMarketGroupList(opts)

List of market groups.

List of market groups.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicMarketGroupList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicMarketTypeList

> InlineResponse20011 getBasicMarketTypeList(opts)

List of market types.

List of market types.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicMarketTypeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicMediaKindList

> InlineResponse20012 getBasicMediaKindList(opts)

List of media kinds.

List of media kinds.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getBasicMediaKindList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionContinentGet

> InlineResponse20017 getBasicRegionContinentGet(id, opts)

Details for a continent.

Details for a continent.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicRegionContinentGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionContinentList

> InlineResponse20018 getBasicRegionContinentList(opts)

List of continents.

List of continents.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicRegionContinentList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionCountryGet

> InlineResponse20019 getBasicRegionCountryGet(id, opts)

Details for a country.

Details for a country.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicRegionCountryGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionCountryGetByCode

> InlineResponse20020 getBasicRegionCountryGetByCode(code, opts)

Details for a country identified by code.

Details for a country identified by code.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const code = "code_example"; // String | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicRegionCountryGetByCode(code, opts).then(
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
 **code** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionCountryList

> InlineResponse20021 getBasicRegionCountryList(opts)

List of countries.

List of countries.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicRegionCountryList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionGet

> InlineResponse20015 getBasicRegionGet(id, opts)

Details for a region.

Details for a geographic, political, or economic region.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicRegionGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicRegionList

> InlineResponse20016 getBasicRegionList(opts)

List of regions.

List of geographic, political, and economic regions.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicRegionList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicTimezoneGet

> InlineResponse20022 getBasicTimezoneGet(id, opts)

Details of a timezone.

Details of a timezone identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getBasicTimezoneGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicTimezoneGetByName

> InlineResponse20022 getBasicTimezoneGetByName(name, opts)

Details of a timezone identified by name.

Details of a timezone identified by name, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const name = "name_example"; // String | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getBasicTimezoneGetByName(name, opts).then(
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
 **name** | **String**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicValueUnitAlternativeList

> InlineResponse20026 getBasicValueUnitAlternativeList(opts)

List of alternative units.

List of alternative units.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicValueUnitAlternativeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicValueUnitCurrencyFractionalGet

> InlineResponse20028 getBasicValueUnitCurrencyFractionalGet(id, opts)

Details of a fractional currency.

Details of a fractional currency.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicValueUnitCurrencyFractionalGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicValueUnitCurrencyFractionalList

> InlineResponse20029 getBasicValueUnitCurrencyFractionalList(opts)

List of fractional currencies.

List of fractional currencies.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | 
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getBasicValueUnitCurrencyFractionalList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBasicValueUnitGet

> InlineResponse20024 getBasicValueUnitGet(id, opts)

Details of a value unit.

Details of a value unit.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getBasicValueUnitGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postBasicBackgroundTextTypeList

> InlineResponse2001 postBasicBackgroundTextTypeList(opts)

List of background text types.

List of background text types.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicBackgroundTextTypeListRequest': new realtimequotes.PostBasicBackgroundTextTypeListRequest() // PostBasicBackgroundTextTypeListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicBackgroundTextTypeList(opts).then(
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
 **postBasicBackgroundTextTypeListRequest** | [**PostBasicBackgroundTextTypeListRequest**](PostBasicBackgroundTextTypeListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicDeliveryList

> InlineResponse2003 postBasicDeliveryList(opts)

List of deliveries.

List of deliveries.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicDeliveryListRequest': new realtimequotes.PostBasicDeliveryListRequest() // PostBasicDeliveryListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicDeliveryList(opts).then(
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
 **postBasicDeliveryListRequest** | [**PostBasicDeliveryListRequest**](PostBasicDeliveryListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicMarketList

> InlineResponse2009 postBasicMarketList(opts)

List of markets.

List of markets.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicMarketListRequest': new realtimequotes.PostBasicMarketListRequest() // PostBasicMarketListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicMarketList(opts).then(
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
 **postBasicMarketListRequest** | [**PostBasicMarketListRequest**](PostBasicMarketListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicMediaTypeList

> InlineResponse20013 postBasicMediaTypeList(opts)

List of Internet media types.

List of Internet media types. See http://www.iana.org/assignments/media-types/ for further details. Not all such Internet media types are available on the MDG.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicMediaTypeListRequest': new realtimequotes.PostBasicMediaTypeListRequest() // PostBasicMediaTypeListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicMediaTypeList(opts).then(
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
 **postBasicMediaTypeListRequest** | [**PostBasicMediaTypeListRequest**](PostBasicMediaTypeListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicMicOperatingList

> InlineResponse20014 postBasicMicOperatingList(opts)

List of operating market identifier codes (MIC).

List of operating market identifier codes (MIC).

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicMicOperatingListRequest': new realtimequotes.PostBasicMicOperatingListRequest() // PostBasicMicOperatingListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicMicOperatingList(opts).then(
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
 **postBasicMicOperatingListRequest** | [**PostBasicMicOperatingListRequest**](PostBasicMicOperatingListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicTimezoneList

> InlineResponse20023 postBasicTimezoneList(opts)

List of timezones.

List of timezones identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicTimezoneListRequest': new realtimequotes.PostBasicTimezoneListRequest() // PostBasicTimezoneListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicTimezoneList(opts).then(
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
 **postBasicTimezoneListRequest** | [**PostBasicTimezoneListRequest**](PostBasicTimezoneListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicValueUnitCurrencyList

> InlineResponse20027 postBasicValueUnitCurrencyList(opts)

List of currencies.

List of currencies.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicValueUnitCurrencyListRequest': new realtimequotes.PostBasicValueUnitCurrencyListRequest() // PostBasicValueUnitCurrencyListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicValueUnitCurrencyList(opts).then(
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
 **postBasicValueUnitCurrencyListRequest** | [**PostBasicValueUnitCurrencyListRequest**](PostBasicValueUnitCurrencyListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicValueUnitCurrencyMainList

> InlineResponse20030 postBasicValueUnitCurrencyMainList(opts)

List of main currencies.

List of main currencies.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicValueUnitCurrencyMainListRequest': new realtimequotes.PostBasicValueUnitCurrencyMainListRequest() // PostBasicValueUnitCurrencyMainListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicValueUnitCurrencyMainList(opts).then(
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
 **postBasicValueUnitCurrencyMainListRequest** | [**PostBasicValueUnitCurrencyMainListRequest**](PostBasicValueUnitCurrencyMainListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postBasicValueUnitList

> InlineResponse20025 postBasicValueUnitList(opts)

List of value units.

List of value units.

### Example

```javascript
const { ApiClient, BasicApi } = require('@factset/sdk-realtimequotes');
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

const apiInstance = new BasicApi();
const opts = {
  'postBasicValueUnitListRequest': new realtimequotes.PostBasicValueUnitListRequest() // PostBasicValueUnitListRequest | Request Body
};

// Call api endpoint
apiInstance.postBasicValueUnitList(opts).then(
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
 **postBasicValueUnitListRequest** | [**PostBasicValueUnitListRequest**](PostBasicValueUnitListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

