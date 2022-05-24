# fundsapifordigitalportals.FundApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundHoldingListByInstrument**](FundApi.md#getFundHoldingListByInstrument) | **GET** /fund/holding/listByInstrument | Holdings of a fund.
[**getFundNotationKeyFiguresBenchmarkMonth1Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkMonth1Get) | **GET** /fund/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
[**getFundNotationKeyFiguresBenchmarkMonth3Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkMonth3Get) | **GET** /fund/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
[**getFundNotationKeyFiguresBenchmarkWeek1Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkWeek1Get) | **GET** /fund/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
[**getFundNotationKeyFiguresBenchmarkYear1Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkYear1Get) | **GET** /fund/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
[**getFundNotationKeyFiguresBenchmarkYear3Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkYear3Get) | **GET** /fund/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
[**getFundNotationKeyFiguresBenchmarkYear5Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkYear5Get) | **GET** /fund/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
[**getFundShareClassGet**](FundApi.md#getFundShareClassGet) | **GET** /fund/shareClass/get | Fundamental data for a share class of a fund.
[**postFundIssuerSearch**](FundApi.md#postFundIssuerSearch) | **POST** /fund/issuer/search | Search for issuers of funds.
[**postFundNotationScreenerSearch**](FundApi.md#postFundNotationScreenerSearch) | **POST** /fund/notation/screener/search | Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
[**postFundNotationScreenerValueRangesGet**](FundApi.md#postFundNotationScreenerValueRangesGet) | **POST** /fund/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.



## getFundHoldingListByInstrument

> InlineResponse200 getFundHoldingListByInstrument(id, opts)

Holdings of a fund.

Holdings of a fund. Only the top 10 holdings with regard to their weighting in the fund portfolio are returned. Therefore, the weights of the holdings do not add up to 1 (i.e. 100%).

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of an instrument of a fund share class.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getFundHoldingListByInstrument(id, opts).then(
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
 **id** | **String**| Identifier of an instrument of a fund share class. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundNotationKeyFiguresBenchmarkMonth1Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the notation.
const idNotationBenchmark = ["null"]; // [String] | List of benchmark notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, opts).then(
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
 **idNotationBenchmark** | [**[String]**](String.md)| List of benchmark notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundNotationKeyFiguresBenchmarkMonth3Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the notation.
const idNotationBenchmark = ["null"]; // [String] | List of benchmark notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, opts).then(
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
 **idNotationBenchmark** | [**[String]**](String.md)| List of benchmark notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundNotationKeyFiguresBenchmarkWeek1Get

> InlineResponse2003 getFundNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the notation.
const idNotationBenchmark = ["null"]; // [String] | List of benchmark notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, opts).then(
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
 **idNotationBenchmark** | [**[String]**](String.md)| List of benchmark notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundNotationKeyFiguresBenchmarkYear1Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the notation.
const idNotationBenchmark = ["null"]; // [String] | List of benchmark notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, opts).then(
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
 **idNotationBenchmark** | [**[String]**](String.md)| List of benchmark notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundNotationKeyFiguresBenchmarkYear3Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the notation.
const idNotationBenchmark = ["null"]; // [String] | List of benchmark notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, opts).then(
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
 **idNotationBenchmark** | [**[String]**](String.md)| List of benchmark notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundNotationKeyFiguresBenchmarkYear5Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, opts)

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the notation.
const idNotationBenchmark = ["null"]; // [String] | List of benchmark notations.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, opts).then(
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
 **idNotationBenchmark** | [**[String]**](String.md)| List of benchmark notations. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundShareClassGet

> InlineResponse2006 getFundShareClassGet(id, opts)

Fundamental data for a share class of a fund.

The provided fundamental data comprises share class-specific data and data applying to the fund and thus to all its share classes. An instrument other than a fund share class yields empty values for share class-specific or fund-specific attributes.   Dates are interpreted in the timezone of the fund company. For attributes referring to a country, see endpoint &#x60;/basic/region/country/list&#x60; for possible values.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const id = "id_example"; // String | Identifier of the instrument.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getFundShareClassGet(id, opts).then(
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
 **id** | **String**| Identifier of the instrument. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postFundIssuerSearch

> InlineResponse2001 postFundIssuerSearch(opts)

Search for issuers of funds.

Search for issuers of funds. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const opts = {
  'body': new fundsapifordigitalportals.InlineObject() // InlineObject | 
};

// Call api endpoint
apiInstance.postFundIssuerSearch(opts).then(
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
 **body** | [**InlineObject**](InlineObject.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postFundNotationScreenerSearch

> InlineResponse2004 postFundNotationScreenerSearch(opts)

Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.

Screener for notations of share classes of mutual and exchange traded funds (ETF) based on fund-specific parameters. The funds represent legal entities, juristic persons in particular, and may have more than one share class. The share classes represent instruments, and the notations represent price sources for the share classes. Some parameters apply to the fund as a whole, i.e. a notation for each share class of a fund matching the criteria is returned, for example &#x60;issuer.selection&#x60;. Others apply to the share classes, thus only notations of matching share classes are returned, for example &#x60;minimumInvestment.initial&#x60;. The result is limited to the notations that satisfy all the selected filters. In order to guarantee comparability when using the performance parameters, the endpoint is restricted to three markets only, Mountain-View Funds (&#x60;id&#x3D;1126&#x60;), FactSet Fund Prices (&#x60;id&#x3D;1127&#x60;) and WM Datenservice (&#x60;id&#x3D;1050&#x60;) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.       A specific set of share classes or share class notations can be restricted to or excluded by using customer-specific instrument or notation selection lists respectively. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const opts = {
  'body': new fundsapifordigitalportals.InlineObject1() // InlineObject1 | 
};

// Call api endpoint
apiInstance.postFundNotationScreenerSearch(opts).then(
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postFundNotationScreenerValueRangesGet

> InlineResponse2005 postFundNotationScreenerValueRangesGet(opts)

Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/fund/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty set of notations. In order to guarantee comparability when using the performance parameter, the endpoint is restricted to three markets only, Mountain-View Funds (&#x60;id&#x3D;1126&#x60;), FactSet Fund Prices (&#x60;id&#x3D;1127&#x60;), and WM Datenservice (&#x60;id&#x3D;1050&#x60;) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.

### Example

```javascript
const { ApiClient, FundApi } = require('@factset/sdk-fundsapifordigitalportals');
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

const apiInstance = new FundApi();
const opts = {
  'body': new fundsapifordigitalportals.InlineObject2() // InlineObject2 | 
};

// Call api endpoint
apiInstance.postFundNotationScreenerValueRangesGet(opts).then(
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

