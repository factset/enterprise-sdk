# realtimeoptions.OptionApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionGet**](OptionApi.md#getOptionGet) | **GET** /option/get | Fundamental data for an option contract.
[**getOptionKeyFiguresGet**](OptionApi.md#getOptionKeyFiguresGet) | **GET** /option/key-figures/get | Key figures of an option contract.
[**postOptionByClassList**](OptionApi.md#postOptionByClassList) | **POST** /option/by-class/list | List of option contracts for an option class.
[**postOptionByClassValueRangesGet**](OptionApi.md#postOptionByClassValueRangesGet) | **POST** /option/by-class/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.
[**postOptionClassScreenerSearch**](OptionApi.md#postOptionClassScreenerSearch) | **POST** /option/class/screener/search | Screener for option classes based on option class-specific parameters.



## getOptionGet

> InlineResponse200 getOptionGet(identifier, identifierType, opts)

Fundamental data for an option contract.

Fundamental data for an option contract; any other instrument yields empty             values for option contract-specific attributes. Dates are interpreted in the time             zone of the exchange. Option contracts are exchange-specific; each option contract             instrument has exactly one notation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OptionApi } = require('@factset/sdk-realtimeoptions');
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

const apiInstance = new OptionApi();
const identifier = FDS-US; // String | Identifier to resolve.
const identifierType = tickerRegion; // String | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'metaLanguage': de // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getOptionGet(identifier, identifierType, opts).then(
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
 **identifier** | **String**| Identifier to resolve. | 
 **identifierType** | **String**| Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOptionKeyFiguresGet

> InlineResponse2004 getOptionKeyFiguresGet(identifier, identifierType, opts)

Key figures of an option contract.

Key figures of an option contract.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OptionApi } = require('@factset/sdk-realtimeoptions');
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

const apiInstance = new OptionApi();
const identifier = FDS-US; // String | Identifier to resolve.
const identifierType = tickerRegion; // String | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getOptionKeyFiguresGet(identifier, identifierType, opts).then(
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
 **identifier** | **String**| Identifier to resolve. | 
 **identifierType** | **String**| Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postOptionByClassList

> InlineResponse2001 postOptionByClassList(opts)

List of option contracts for an option class.

List of option contracts for an option class. The list can be filtered based on option contract-specific parameters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OptionApi } = require('@factset/sdk-realtimeoptions');
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

const apiInstance = new OptionApi();
const opts = {
  'postOptionByClassListRequest': {"data":{"class":{"id":"2002"},"filter":{"validation":{"onlyActive":false,"price":{"quality":"DLY","latest":{"availableOnly":false,"minimumDate":"2024-01-01"},"previous":{"availableOnly":false,"minimumDate":"2024-12-24"}}}},"contract":{"excercise":{"right":"call","style":"american"},"strikePrice":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}}},"lifeCycle":{"maturity":{"date":{"start":"2024-01-01","end":"2024-12-24"},"interval":["monthly"]},"expiration":{"month":2,"year":-2}},"contractSize":{"restrict":{"values":[4.04]},"exclude":{"values":[4.04]}},"openInterest":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.03,"inclusive":true}},"keyFigures":{"moneyness":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"impliedVolatility":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}},"omega":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"leverage":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"delta":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"thetaOneWeek":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"vega":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"gamma":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"rho":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}}}},"meta":{"attributes":[],"language":"en","sort":["-keyFigures.impliedVolatility"],"pagination":{"offset":0,"limit":20}}} // PostOptionByClassListRequest | Request Body
};

// Call api endpoint
apiInstance.postOptionByClassList(opts).then(
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
 **postOptionByClassListRequest** | [**PostOptionByClassListRequest**](PostOptionByClassListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postOptionByClassValueRangesGet

> InlineResponse2002 postOptionByClassValueRangesGet(opts)

Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/option/by-class/list&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OptionApi } = require('@factset/sdk-realtimeoptions');
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

const apiInstance = new OptionApi();
const opts = {
  'postOptionByClassValueRangesGetRequest': {"data":{"class":{"id":"3003"},"filter":{"validation":{"onlyActive":false,"price":{"quality":"DLY","latest":{"availableOnly":false,"minimumDate":"2024-12-24"},"previous":{"availableOnly":false,"minimumDate":"2024-01-01"}}}},"contract":{"excercise":{"right":"call","style":"american"},"strikePrice":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}}},"lifeCycle":{"maturity":{"date":{"start":"2024-12-24","end":"2024-01-01"},"interval":["daily"]},"expiration":{"month":132,"year":-132}},"contractSize":{"restrict":{"values":[3.1415]},"exclude":{"values":[2.02]}},"openInterest":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":3.03,"inclusive":true}},"keyFigures":{"moneyness":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":3.03,"inclusive":true}},"impliedVolatility":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"omega":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.03,"inclusive":true}},"leverage":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"delta":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"thetaOneWeek":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"vega":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}},"gamma":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"rho":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}}}},"meta":{"attributes":[]}} // PostOptionByClassValueRangesGetRequest | Request Body
};

// Call api endpoint
apiInstance.postOptionByClassValueRangesGet(opts).then(
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
 **postOptionByClassValueRangesGetRequest** | [**PostOptionByClassValueRangesGetRequest**](PostOptionByClassValueRangesGetRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postOptionClassScreenerSearch

> InlineResponse2003 postOptionClassScreenerSearch(opts)

Screener for option classes based on option class-specific parameters.

Screener for option classes based on option class-specific parameters. An option class is defined by an exchange and includes all option contracts with the same reference data (e.g. underlying instrument). The result is limited to the 500 option classes with the most option contracts per class, that satisfy all the selected filters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OptionApi } = require('@factset/sdk-realtimeoptions');
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

const apiInstance = new OptionApi();
const opts = {
  'postOptionClassScreenerSearchRequest': {"data":{"text":{"attributes":["allEntitled"],"value":"FactSet"},"market":{"restrict":{"ids":[5]},"exclude":{"ids":[1]}},"underlying":{"instrument":{"id":"209485"},"notation":{"id":"1532562"}},"currency":{"restrict":{"ids":[3]},"exclude":{"ids":[2]}},"category":{"restrict":{"ids":[1]},"exclude":{"ids":[4]}}},"meta":{"attributes":[],"language":"en","sort":["-category.name"]}} // PostOptionClassScreenerSearchRequest | Request Body
};

// Call api endpoint
apiInstance.postOptionClassScreenerSearch(opts).then(
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
 **postOptionClassScreenerSearchRequest** | [**PostOptionClassScreenerSearchRequest**](PostOptionClassScreenerSearchRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

