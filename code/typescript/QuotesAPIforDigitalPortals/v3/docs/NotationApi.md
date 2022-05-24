# quotesapifordigitalportals.NotationApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotationCrossReferenceFactSetIdentifierGet**](NotationApi.md#getNotationCrossReferenceFactSetIdentifierGet) | **GET** /notation/crossReference/factSetIdentifier/get | Retrieve FactSet identifiers for a given notation.
[**getNotationCrossReferenceGetByFactSetMarketSymbol**](NotationApi.md#getNotationCrossReferenceGetByFactSetMarketSymbol) | **GET** /notation/crossReference/getByFactSetMarketSymbol | Translate a FactSet market symbol to a notation.
[**getNotationGet**](NotationApi.md#getNotationGet) | **GET** /notation/get | Basic data for a notation.
[**getNotationKeyFiguresMonth1Get**](NotationApi.md#getNotationKeyFiguresMonth1Get) | **GET** /notation/keyFigures/month/1/get | End-of-day (EOD) key figures for the time range of one month.
[**getNotationKeyFiguresMonth1List**](NotationApi.md#getNotationKeyFiguresMonth1List) | **GET** /notation/keyFigures/month/1/list | End-of-day (EOD) key figures for the time range of one month, for a list of notations.
[**getNotationKeyFiguresMonth3Get**](NotationApi.md#getNotationKeyFiguresMonth3Get) | **GET** /notation/keyFigures/month/3/get | End-of-day (EOD) key figures for the time range of three months.
[**getNotationKeyFiguresMonth3List**](NotationApi.md#getNotationKeyFiguresMonth3List) | **GET** /notation/keyFigures/month/3/list | End-of-day (EOD) key figures for the time range of three months, for a list of notations.
[**getNotationKeyFiguresMonth6Get**](NotationApi.md#getNotationKeyFiguresMonth6Get) | **GET** /notation/keyFigures/month/6/get | End-of-day (EOD) key figures for the time range of six months.
[**getNotationKeyFiguresMonth6List**](NotationApi.md#getNotationKeyFiguresMonth6List) | **GET** /notation/keyFigures/month/6/list | End-of-day (EOD) key figures for the time range of six months, for a list of notations.
[**getNotationKeyFiguresWeek1Get**](NotationApi.md#getNotationKeyFiguresWeek1Get) | **GET** /notation/keyFigures/week/1/get | End-of-day (EOD) key figures for the time range of one week.
[**getNotationKeyFiguresWeek1List**](NotationApi.md#getNotationKeyFiguresWeek1List) | **GET** /notation/keyFigures/week/1/list | End-of-day (EOD) key figures for the time range of one week, for a list of notations.
[**getNotationKeyFiguresYear1Get**](NotationApi.md#getNotationKeyFiguresYear1Get) | **GET** /notation/keyFigures/year/1/get | End-of-day (EOD) key figures for the time range of one year.
[**getNotationKeyFiguresYear1List**](NotationApi.md#getNotationKeyFiguresYear1List) | **GET** /notation/keyFigures/year/1/list | End-of-day (EOD) key figures for the time range of one year, for a list of notations.
[**getNotationKeyFiguresYear3Get**](NotationApi.md#getNotationKeyFiguresYear3Get) | **GET** /notation/keyFigures/year/3/get | End-of-day (EOD) key figures for the time range of three years.
[**getNotationKeyFiguresYear3List**](NotationApi.md#getNotationKeyFiguresYear3List) | **GET** /notation/keyFigures/year/3/list | End-of-day (EOD) key figures for the time range of three years, for a list of notations.
[**getNotationKeyFiguresYear5Get**](NotationApi.md#getNotationKeyFiguresYear5Get) | **GET** /notation/keyFigures/year/5/get | End-of-day (EOD) key figures for the time range of five years.
[**getNotationKeyFiguresYear5List**](NotationApi.md#getNotationKeyFiguresYear5List) | **GET** /notation/keyFigures/year/5/list | End-of-day (EOD) key figures for the time range of five years, for a list of notations.
[**getNotationKeyFiguresYearToDateGet**](NotationApi.md#getNotationKeyFiguresYearToDateGet) | **GET** /notation/keyFigures/yearToDate/get | End-of-day (EOD) key figures for the time range year-to-date (YTD)..
[**getNotationKeyFiguresYearToDateList**](NotationApi.md#getNotationKeyFiguresYearToDateList) | **GET** /notation/keyFigures/yearToDate/list | End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..
[**getNotationList**](NotationApi.md#getNotationList) | **GET** /notation/list | Basic data for a list of notations.
[**getNotationSearchBasic**](NotationApi.md#getNotationSearchBasic) | **GET** /notation/search/basic | Basic search for notations.
[**getNotationSearchByTextRankedByVolume**](NotationApi.md#getNotationSearchByTextRankedByVolume) | **GET** /notation/searchByTextRankedByVolume | Basic search for notations.
[**getNotationStatusGet**](NotationApi.md#getNotationStatusGet) | **GET** /notation/status/get | Intraday trading status of a notation.
[**postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier**](NotationApi.md#postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier) | **POST** /notation/crossReference/factSetIdentifier/listByFactSetIdentifier | Retrieve a list of notations for a given FactSet identifier.
[**postNotationCrossReferenceFactSetIdentifierListByInstrument**](NotationApi.md#postNotationCrossReferenceFactSetIdentifierListByInstrument) | **POST** /notation/crossReference/factSetIdentifier/listByInstrument | Retrieve a list of FactSet identifiers for a given instrument.
[**postNotationCrossReferenceListByISIN**](NotationApi.md#postNotationCrossReferenceListByISIN) | **POST** /notation/crossReference/listByISIN | List of entitled notations.
[**postNotationCrossReferenceListByInstrument**](NotationApi.md#postNotationCrossReferenceListByInstrument) | **POST** /notation/crossReference/listByInstrument | List of entitled notations.
[**postNotationCrossReferenceListBySymbol**](NotationApi.md#postNotationCrossReferenceListBySymbol) | **POST** /notation/crossReference/listBySymbol | List of entitled notations.
[**postNotationSearchByText**](NotationApi.md#postNotationSearchByText) | **POST** /notation/searchByText | Text-based search for notations.



## getNotationCrossReferenceFactSetIdentifierGet

> InlineResponse20069 getNotationCrossReferenceFactSetIdentifierGet(id, opts)

Retrieve FactSet identifiers for a given notation.

&lt;p&gt;Retrieve FactSet identifiers for a given notation. Security and listing-level identifiers are always included, regional level identifiers are included, if available.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of a notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationCrossReferenceFactSetIdentifierGet(id, opts).then(
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
 **id** | **String**| Identifier of a notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20069**](InlineResponse20069.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationCrossReferenceGetByFactSetMarketSymbol

> InlineResponse20066 getNotationCrossReferenceGetByFactSetMarketSymbol(factSetMarketSymbol, opts)

Translate a FactSet market symbol to a notation.

Translate a FactSet market symbol to a notation. This symbol is also known as TICKER_EXCHANGE.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const factSetMarketSymbol = "factSetMarketSymbol_example"; // String | Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE).
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getNotationCrossReferenceGetByFactSetMarketSymbol(factSetMarketSymbol, opts).then(
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
 **factSetMarketSymbol** | **String**| Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE). | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse20066**](InlineResponse20066.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationGet

> InlineResponse20064 getNotationGet(id, opts)

Basic data for a notation.

Basic data for a notation.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of a notation.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getNotationGet(id, opts).then(
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
 **id** | **String**| Identifier of a notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresMonth1Get

> InlineResponse20072 getNotationKeyFiguresMonth1Get(id, opts)

End-of-day (EOD) key figures for the time range of one month.

End-of-day (EOD) key figures for the time range of one month.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresMonth1Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresMonth1List

> InlineResponse20073 getNotationKeyFiguresMonth1List(ids, opts)

End-of-day (EOD) key figures for the time range of one month, for a list of notations.

End-of-day (EOD) key figures for the time range of one month, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresMonth1List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresMonth3Get

> InlineResponse20074 getNotationKeyFiguresMonth3Get(id, opts)

End-of-day (EOD) key figures for the time range of three months.

End-of-day (EOD) key figures for the time range of three months.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresMonth3Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresMonth3List

> InlineResponse20075 getNotationKeyFiguresMonth3List(ids, opts)

End-of-day (EOD) key figures for the time range of three months, for a list of notations.

End-of-day (EOD) key figures for the time range of three months, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresMonth3List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresMonth6Get

> InlineResponse20074 getNotationKeyFiguresMonth6Get(id, opts)

End-of-day (EOD) key figures for the time range of six months.

End-of-day (EOD) key figures for the time range of six months.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresMonth6Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresMonth6List

> InlineResponse20075 getNotationKeyFiguresMonth6List(ids, opts)

End-of-day (EOD) key figures for the time range of six months, for a list of notations.

End-of-day (EOD) key figures for the time range of six months, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresMonth6List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresWeek1Get

> InlineResponse20072 getNotationKeyFiguresWeek1Get(id, opts)

End-of-day (EOD) key figures for the time range of one week.

End-of-day (EOD) key figures for the time range of one week.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresWeek1Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresWeek1List

> InlineResponse20073 getNotationKeyFiguresWeek1List(ids, opts)

End-of-day (EOD) key figures for the time range of one week, for a list of notations.

End-of-day (EOD) key figures for the time range of one week, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresWeek1List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYear1Get

> InlineResponse20072 getNotationKeyFiguresYear1Get(id, opts)

End-of-day (EOD) key figures for the time range of one year.

End-of-day (EOD) key figures for the time range of one year.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYear1Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYear1List

> InlineResponse20073 getNotationKeyFiguresYear1List(ids, opts)

End-of-day (EOD) key figures for the time range of one year, for a list of notations.

End-of-day (EOD) key figures for the time range of one year, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYear1List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYear3Get

> InlineResponse20074 getNotationKeyFiguresYear3Get(id, opts)

End-of-day (EOD) key figures for the time range of three years.

End-of-day (EOD) key figures for the time range of three years.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYear3Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYear3List

> InlineResponse20075 getNotationKeyFiguresYear3List(ids, opts)

End-of-day (EOD) key figures for the time range of three years, for a list of notations.

End-of-day (EOD) key figures for the time range of three years, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYear3List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYear5Get

> InlineResponse20074 getNotationKeyFiguresYear5Get(id, opts)

End-of-day (EOD) key figures for the time range of five years.

End-of-day (EOD) key figures for the time range of five years.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYear5Get(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYear5List

> InlineResponse20075 getNotationKeyFiguresYear5List(ids, opts)

End-of-day (EOD) key figures for the time range of five years, for a list of notations.

End-of-day (EOD) key figures for the time range of five years, for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYear5List(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYearToDateGet

> InlineResponse20076 getNotationKeyFiguresYearToDateGet(id, opts)

End-of-day (EOD) key figures for the time range year-to-date (YTD)..

End-of-day (EOD) key figures for the time range year-to-date (YTD). The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent trading day of the current calendar year for which EOD prices are available..

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of the notation.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYearToDateGet(id, opts).then(
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
 **id** | **String**| Identifier of the notation. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20076**](InlineResponse20076.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationKeyFiguresYearToDateList

> InlineResponse20077 getNotationKeyFiguresYearToDateList(ids, opts)

End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..

End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations. The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent tradingday of the current calendar year for which EOD prices are available..

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationKeyFiguresYearToDateList(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20077**](InlineResponse20077.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationList

> InlineResponse20065 getNotationList(ids, opts)

Basic data for a list of notations.

Basic data for a list of notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const ids = ["null"]; // [String] | List of notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getNotationList(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| List of notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse20065**](InlineResponse20065.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationSearchBasic

> InlineResponse20088 getNotationSearchBasic(searchValue, opts)

Basic search for notations.

Search for a notation whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered. Better matching results appear in the response before less relevant matches. If the parameter popularity is set to true, the popularity of the notation is the primary sort criterion. Popularity is affected mostly by the request frequency of the notation.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const searchValue = "searchValue_example"; // String | Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
const opts = {
  'nsins': ["null"], // [String] | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched.
  'assetClass': "assetClass_example", // String | A parameter to limit the output to a particular asset class.
  'onlyActive': true, // Boolean | If true, restricts the result to active notations.
  'popularity': false, // Boolean | If true, the results are sorted by descending popularity.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | ISO 639-1 code of the language.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.getNotationSearchBasic(searchValue, opts).then(
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
 **searchValue** | **String**| Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. | 
 **nsins** | [**[String]**](String.md)| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] 
 **assetClass** | **String**| A parameter to limit the output to a particular asset class. | [optional] 
 **onlyActive** | **Boolean**| If true, restricts the result to active notations. | [optional] [default to true]
 **popularity** | **Boolean**| If true, the results are sorted by descending popularity. | [optional] [default to false]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20088**](InlineResponse20088.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationSearchByTextRankedByVolume

> InlineResponse20090 getNotationSearchByTextRankedByVolume(searchValue, opts)

Basic search for notations.

Search for notations whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const searchValue = "searchValue_example"; // String | Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
const opts = {
  'idMarkets': [null], // [Number] | List of market identifiers. Limits the results to the given markets. For possible values, see endpoint `/basic/market/list`.
  'nsins': ["null"], // [String] | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched.
  'assetClass': ["null"], // [String] | Limits the results to a particular asset class.
  'onlyActive': true, // Boolean | If true, restricts the result to active notations.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example", // String | ISO 639-1 code of the language.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.getNotationSearchByTextRankedByVolume(searchValue, opts).then(
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
 **searchValue** | **String**| Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. | 
 **idMarkets** | [**[Number]**](Number.md)| List of market identifiers. Limits the results to the given markets. For possible values, see endpoint &#x60;/basic/market/list&#x60;. | [optional] 
 **nsins** | [**[String]**](String.md)| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] 
 **assetClass** | [**[String]**](String.md)| Limits the results to a particular asset class. | [optional] 
 **onlyActive** | **Boolean**| If true, restricts the result to active notations. | [optional] [default to true]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20090**](InlineResponse20090.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNotationStatusGet

> InlineResponse20078 getNotationStatusGet(id, opts)

Intraday trading status of a notation.

Intraday trading status of a notation.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const id = "id_example"; // String | Identifier of a notation.
const opts = {
  'quality': "'DLY'", // String | Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD).
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNotationStatusGet(id, opts).then(
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
 **id** | **String**| Identifier of a notation. | 
 **quality** | **String**| Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD). | [optional] [default to &#39;DLY&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20078**](InlineResponse20078.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier

> InlineResponse20070 postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier(body)

Retrieve a list of notations for a given FactSet identifier.

&lt;p&gt;Retrieve a list of notations for a given FactSet identifier, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.&lt;/p&gt;&lt;p&gt;The notation corresponding to the security&#39;s primary listing has the attributes &lt;big&gt;&lt;tt&gt;regional.isPrimary&lt;/tt&gt;&lt;/big&gt; and &lt;big&gt;&lt;tt&gt;regional.listing.isPrimary&lt;/tt&gt;&lt;/big&gt; both set to true.The security&#39;s primary listing might not be among the results depending on the entitlement.&lt;/p&gt;&lt;p&gt;See the group description for more information about the security&#39;s primary listing.&lt;/p&gt;

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const body = new quotesapifordigitalportals.InlineObject19(); // InlineObject19 | 

// Call api endpoint
apiInstance.postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier(body).then(
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
 **body** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type

[**InlineResponse20070**](InlineResponse20070.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNotationCrossReferenceFactSetIdentifierListByInstrument

> InlineResponse20071 postNotationCrossReferenceFactSetIdentifierListByInstrument(body)

Retrieve a list of FactSet identifiers for a given instrument.

&lt;p&gt;Retrieve a list of FactSet identifiers for a given instrument, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.&lt;/p&gt;&lt;p&gt;The notation corresponding to the security&#39;s primary listing has the attributes &lt;big&gt;&lt;tt&gt;regional.isPrimary&lt;/tt&gt;&lt;/big&gt; and &lt;big&gt;&lt;tt&gt;regional.listing.isPrimary&lt;/tt&gt;&lt;/big&gt; both set to true.The security&#39;s primary listing might not be among the results depending on the entitlement.&lt;/p&gt;&lt;p&gt;The result contains only notations that have at least one FactSet identifier (see &lt;big&gt;&lt;tt&gt;listing.permanentIdentifier&lt;/tt&gt;&lt;/big&gt;, &lt;big&gt;&lt;tt&gt;listing.tickerExchange&lt;/tt&gt;&lt;/big&gt;).&lt;/p&gt;&lt;p&gt;See the group description for more information about the security&#39;s primary listing.&lt;/p&gt;

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const body = new quotesapifordigitalportals.InlineObject20(); // InlineObject20 | 

// Call api endpoint
apiInstance.postNotationCrossReferenceFactSetIdentifierListByInstrument(body).then(
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
 **body** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNotationCrossReferenceListByISIN

> InlineResponse20067 postNotationCrossReferenceListByISIN(opts)

List of entitled notations.

List of entitled notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const opts = {
  'body': new quotesapifordigitalportals.InlineObject17() // InlineObject17 | 
};

// Call api endpoint
apiInstance.postNotationCrossReferenceListByISIN(opts).then(
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
 **body** | [**InlineObject17**](InlineObject17.md)|  | [optional] 

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNotationCrossReferenceListByInstrument

> InlineResponse20067 postNotationCrossReferenceListByInstrument(opts)

List of entitled notations.

List of entitled notations.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const opts = {
  'body': new quotesapifordigitalportals.InlineObject16() // InlineObject16 | 
};

// Call api endpoint
apiInstance.postNotationCrossReferenceListByInstrument(opts).then(
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
 **body** | [**InlineObject16**](InlineObject16.md)|  | [optional] 

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNotationCrossReferenceListBySymbol

> InlineResponse20068 postNotationCrossReferenceListBySymbol(opts)

List of entitled notations.

List of entitled notations. Symbols are not globally unique; therefore, a given symbol interpreted in different markets might refer to different instruments.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const opts = {
  'body': new quotesapifordigitalportals.InlineObject18() // InlineObject18 | 
};

// Call api endpoint
apiInstance.postNotationCrossReferenceListBySymbol(opts).then(
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
 **body** | [**InlineObject18**](InlineObject18.md)|  | [optional] 

### Return type

[**InlineResponse20068**](InlineResponse20068.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNotationSearchByText

> InlineResponse20089 postNotationSearchByText(body)

Text-based search for notations.

Text-based search for notations in selected identifier and name attributes according to a tolerant full-text match algorithm. The results satisfy all selected filters; sorting by various attributes is possible. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.       The result is limited to 10000 notations. All identifiers used as parameters must be valid and entitled.

### Example

```javascript
const { ApiClient, NotationApi } = require('@factset/sdk-quotesapifordigitalportals');
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

const apiInstance = new NotationApi();
const body = new quotesapifordigitalportals.InlineObject22(); // InlineObject22 | 

// Call api endpoint
apiInstance.postNotationSearchByText(body).then(
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
 **body** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type

[**InlineResponse20089**](InlineResponse20089.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

