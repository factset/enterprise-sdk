# securitizedderivativesapifordigitalportals.SecuritizedDerivativeApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecuritizedDerivativeBarrierTypeList**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeBarrierTypeList) | **GET** /securitized-derivative/barrier/type/list | List of barrier types.
[**getSecuritizedDerivativeGet**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeGet) | **GET** /securitized-derivative/get | Fundamental data for a single securitized derivative.
[**getSecuritizedDerivativeKeyFiguresNotationGet**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeKeyFiguresNotationGet) | **GET** /securitized-derivative/key-figures/notation/get | Notation-based key figures of a securitized derivative.
[**getSecuritizedDerivativeUnderlyingList**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeUnderlyingList) | **GET** /securitized-derivative/underlying/list | List of underlyings with barrier and cash flow information.
[**postSecuritizedDerivativeIssuerSearch**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeIssuerSearch) | **POST** /securitized-derivative/issuer/search | Search for issuers of securitized derivatives.
[**postSecuritizedDerivativeNotationRankingIntradayList**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationRankingIntradayList) | **POST** /securitized-derivative/notation/ranking/intraday/list | Ranking of securitized derivatives&#39; notations using intraday figures.
[**postSecuritizedDerivativeNotationScreenerSearch**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationScreenerSearch) | **POST** /securitized-derivative/notation/screener/search | Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
[**postSecuritizedDerivativeNotationScreenerValueRangesGet**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationScreenerValueRangesGet) | **POST** /securitized-derivative/notation/screener/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivative/notation/screener/search&#x60;.



## getSecuritizedDerivativeBarrierTypeList

> InlineResponse2001 getSecuritizedDerivativeBarrierTypeList(opts)

List of barrier types.

List of barrier types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeBarrierTypeList(opts).then(
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecuritizedDerivativeGet

> InlineResponse200 getSecuritizedDerivativeGet(identifier, identifierType, opts)

Fundamental data for a single securitized derivative.

Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const identifier = FDS-US; // String | Identifier to resolve.
const identifierType = tickerRegion; // String | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'metaLanguage': de // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeGet(identifier, identifierType, opts).then(
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


## getSecuritizedDerivativeKeyFiguresNotationGet

> InlineResponse2003 getSecuritizedDerivativeKeyFiguresNotationGet(identifier, identifierType, opts)

Notation-based key figures of a securitized derivative.

Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute &#x60;underlyings.coverRatio&#x60; in endpoint &#x60;/securitized-derivative/underlying/list&#x60;.  Various barrier types (e.g. strike, knock in) - see endpoint &#x60;/securitized-derivative/barrier/type/list&#x60;.  Exercise right - see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;.  Issue price - see attribute &#x60;issue.price&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;.  Ask price - see attribute &#x60;prices.ask&#x60;.  Bid price - see attribute &#x60;prices.bid&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const identifier = FDS-US; // String | Identifier to resolve.
const identifierType = tickerRegion; // String | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'metaLanguage': en // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeKeyFiguresNotationGet(identifier, identifierType, opts).then(
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecuritizedDerivativeUnderlyingList

> InlineResponse2007 getSecuritizedDerivativeUnderlyingList(identifier, identifierType, opts)

List of underlyings with barrier and cash flow information.

Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const identifier = FDS-US; // String | Identifier to resolve.
const identifierType = tickerRegion; // String | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'metaLanguage': de // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeUnderlyingList(identifier, identifierType, opts).then(
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postSecuritizedDerivativeIssuerSearch

> InlineResponse2002 postSecuritizedDerivativeIssuerSearch(postSecuritizedDerivativeIssuerSearchRequest)

Search for issuers of securitized derivatives.

Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const postSecuritizedDerivativeIssuerSearchRequest = {"data":{"role":"issuerGroup","name":{"searchValue":"Lorem ipsum"},"withPriceEntitlement":true,"category":{"ids":[5]},"underlying":{"instrument":{"ids":["2002"]}},"factorCertificates":{"effectiveUnderlying":{"instrument":{"ids":["5005"]}}},"registrationCountry":{"restrict":{"ids":[3]},"exclude":{"ids":[3]}},"market":{"restrict":{"ids":[1]},"exclude":{"ids":[4]}}},"meta":{"attributes":[]}}; // PostSecuritizedDerivativeIssuerSearchRequest | Request Body

// Call api endpoint
apiInstance.postSecuritizedDerivativeIssuerSearch(postSecuritizedDerivativeIssuerSearchRequest).then(
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
 **postSecuritizedDerivativeIssuerSearchRequest** | [**PostSecuritizedDerivativeIssuerSearchRequest**](PostSecuritizedDerivativeIssuerSearchRequest.md)| Request Body | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postSecuritizedDerivativeNotationRankingIntradayList

> InlineResponse2004 postSecuritizedDerivativeNotationRankingIntradayList(opts)

Ranking of securitized derivatives&#39; notations using intraday figures.

Ranking of securitized derivatives&#39; notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, the selection of the notation depends on the sort attribute: - absolute and relative performance (see the response attributes &#x60;trade.performance.absolute&#x60; and &#x60;trade.performance.relative&#x60;) - the notation with the most recent trade price is used - number trades, trading value and trading volume (see the response attributes &#x60;accumulated.numberTrades&#x60;, &#x60;accumulated.tradingVolume&#x60; and &#x60;accumulated.tradingValue&#x60;) - the notation with highest (lowest) value is used  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute &#x60;trade.performance.relative&#x60;. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameters &#x60;valueUnit&#x60; and/or &#x60;currency&#x60; have not been specified.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'postSecuritizedDerivativeNotationRankingIntradayListRequest': {"data":{"prices":{"quality":"DLY"},"valueUnit":{"id":5},"currency":{"id":4},"market":{"ids":[2]},"instrumentRestrictionList":{"ids":[4]},"notationRestrictionList":{"ids":[2]},"category":{"ids":[3]},"registrationCountry":{"ids":[5]},"lifeCycle":{"maturity":{"perpetual":"include"}},"issuer":{"ids":[3]},"exercise":{"right":"put"},"underlying":{"instrument":{"ids":["4004"]},"notation":{"ids":["2002"]}},"factorCertificates":{"effectiveUnderlying":{"instrument":{"ids":["2002"]}},"participation":"long"},"knockedOut":"exclude","knockedIn":"exclude","performance":{"relative":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}}}},"meta":{"attributes":[],"language":"en","sort":["accumulated.tradingVolume"],"pagination":{"offset":0,"limit":10}}} // PostSecuritizedDerivativeNotationRankingIntradayListRequest | Request Body
};

// Call api endpoint
apiInstance.postSecuritizedDerivativeNotationRankingIntradayList(opts).then(
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
 **postSecuritizedDerivativeNotationRankingIntradayListRequest** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequest**](PostSecuritizedDerivativeNotationRankingIntradayListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postSecuritizedDerivativeNotationScreenerSearch

> InlineResponse2006 postSecuritizedDerivativeNotationScreenerSearch(opts)

Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.

Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifiers used as parameters must be valid and entitled.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.   The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'postSecuritizedDerivativeNotationScreenerSearchRequest': {"data":{"validation":{"onlyActive":true,"prices":{"quality":"DLY","latest":{"availableOnly":false,"minimumDate":"2024-12-24"},"previous":{"availableOnly":false,"minimumDate":"2024-01-01"}},"valueUnit":{"selection":{"restrict":{"ids":[1]},"exclude":{"ids":[2]}}},"market":{"selection":{"restrict":{"ids":[4]},"exclude":{"ids":[1]}},"priority":{"ids":[4]}},"instrumentRestrictionList":{"ids":[5]},"notationRestrictionList":{"ids":[4]}},"category":{"ids":[4]},"registrationCountry":{"ids":[3]},"lifeCycle":{"issue":{"start":"2024-12-24","end":"2024-01-01"},"maturity":{"restriction":{"date":{"start":"2024-01-01","end":"2024-01-01"},"remainingTermDays":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}},"perpetual":"only"},"callable":false,"valuation":{"start":"2024-01-01","end":"2024-12-24"},"repayment":{"start":"2024-12-24","end":"2024-12-24"}},"issuer":{"ids":[3]},"exercise":{"right":"call","style":"american"},"settlement":"physical","collateralized":true,"quanto":true,"capitalProtection":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"underlying":{"instrument":{"ids":["4004"]},"notation":{"ids":["5005"]}},"cashFlowCurrency":{"id":4},"singleBarriers":[{"type":"cap","observation":{"type":"eod"},"level":{"absolute":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}}},"distance":{"absolute":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"relative":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}}},"breach":{"breached":"exclude"},"cashFlow":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}}}],"rangeBarriers":[{"type":"rangeKnockOut","observation":{"type":"eod"},"upper":{"level":{"absolute":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}}},"lower":{"level":{"absolute":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}}}},"breach":{"breached":"exclude"},"cashFlow":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}}],"factorCertificates":{"effectiveUnderlying":{"instrument":{"ids":["1001"]}},"participation":"short","constantLeverage":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}}},"nominalCurrency":{"id":3},"currentInterestRate":{"type":"variable","value":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}}},"keyFigures":{"bonusYield":{"absolute":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"relative":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"annualized":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":1,"inclusive":true}}},"sidewaysYield":{"absolute":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"relative":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":1,"inclusive":true}},"annualized":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}}},"maximumYield":{"absolute":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"relative":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":1,"inclusive":true}},"annualized":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}}},"agio":{"absolute":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"relative":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"annualized":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0,"inclusive":true}}},"discount":{"absolute":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"relative":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}}},"breakEven":{"breakEvenPoint":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"distance":{"absolute":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"relative":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0,"inclusive":true}}}},"spread":{"harmonized":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"relative":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}}},"delta":{"effective":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"unadjusted":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}}},"thetaOneWeek":{"effective":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}},"unadjusted":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}},"vega":{"effective":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":3.03,"inclusive":true}},"unadjusted":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}}},"leverage":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"omega":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"impliedVolatility":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"intrinsicValue":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"timeValue":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"outperformancePoint":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"parity":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}}},"performance":{"intraday":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}},"sinceIssue":{"ask":{"minimum":{"value":0,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"bid":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}}},"endOfDay":{"day1":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"week1":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"month1":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"months3":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"months6":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"year1":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"years3":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}},"years5":{"minimum":{"value":0,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}},"yearToDate":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}}}},"volatility":{"week1":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"month1":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"months3":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"months6":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"year1":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"years3":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"years5":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"yearToDate":{"minimum":{"value":0,"inclusive":true},"maximum":{"value":0,"inclusive":true}}}},"meta":{"attributes":[],"language":"en","sort":["-keyFigures.omega"],"pagination":{"offset":0,"limit":20}}} // PostSecuritizedDerivativeNotationScreenerSearchRequest | Request Body
};

// Call api endpoint
apiInstance.postSecuritizedDerivativeNotationScreenerSearch(opts).then(
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
 **postSecuritizedDerivativeNotationScreenerSearchRequest** | [**PostSecuritizedDerivativeNotationScreenerSearchRequest**](PostSecuritizedDerivativeNotationScreenerSearchRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postSecuritizedDerivativeNotationScreenerValueRangesGet

> InlineResponse2005 postSecuritizedDerivativeNotationScreenerValueRangesGet(opts)

Possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivative/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivatives/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/securitized-derivatives/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'postSecuritizedDerivativeNotationScreenerValueRangesGetRequest': {"data":{"validation":{"onlyActive":true,"prices":{"quality":"DLY","latest":{"availableOnly":false,"minimumDate":"2024-01-01"},"previous":{"availableOnly":false,"minimumDate":"2024-01-01"}},"valueUnit":{"selection":{"restrict":{"ids":[1]},"exclude":{"ids":[3]}}},"market":{"selection":{"restrict":{"ids":[2]},"exclude":{"ids":[3]}},"priority":{"ids":[3]}},"instrumentRestrictionList":{"ids":[3]},"notationRestrictionList":{"ids":[3]}},"category":{"ids":[5]},"registrationCountry":{"ids":[1]},"lifeCycle":{"issue":{"start":"2024-01-01","end":"2024-12-24"},"maturity":{"restriction":{"date":{"start":"2024-01-01","end":"2024-12-24"},"remainingTermDays":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}},"perpetual":"exclude"},"callable":true,"valuation":{"start":"2024-01-01","end":"2024-12-24"},"repayment":{"start":"2024-01-01","end":"2024-12-24"}},"issuer":{"ids":[3]},"exercise":{"right":"call","style":"european"},"settlement":"either","collateralized":true,"quanto":false,"capitalProtection":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}},"underlying":{"instrument":{"ids":["1001"]},"notation":{"ids":["1001"]}},"cashFlowCurrency":{"id":3},"singleBarriers":[{"type":"strike","observation":{"type":"continuous"},"level":{"absolute":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}}},"distance":{"absolute":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}},"relative":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}}},"breach":{"breached":"exclude"},"cashFlow":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}}}],"rangeBarriers":[{"type":"rangeKnockOut","observation":{"type":"continuous"},"upper":{"level":{"absolute":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}}},"lower":{"level":{"absolute":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}}}},"breach":{"breached":"exclude"},"cashFlow":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}}}],"factorCertificates":{"effectiveUnderlying":{"instrument":{"ids":["4004"]}},"participation":"short","constantLeverage":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}}},"nominalCurrency":{"id":2},"currentInterestRate":{"type":"fixed","value":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}}},"keyFigures":{"bonusYield":{"absolute":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"relative":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":1,"inclusive":true}},"annualized":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}}},"sidewaysYield":{"absolute":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"relative":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"annualized":{"minimum":{"value":0,"inclusive":true},"maximum":{"value":0,"inclusive":true}}},"maximumYield":{"absolute":{"minimum":{"value":3.03,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"relative":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"annualized":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}}},"agio":{"absolute":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}},"relative":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"annualized":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}}},"discount":{"absolute":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":1.01,"inclusive":true}},"relative":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}}},"breakEven":{"breakEvenPoint":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"distance":{"absolute":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"relative":{"minimum":{"value":0,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}}}},"spread":{"harmonized":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}},"relative":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}}},"delta":{"effective":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"unadjusted":{"minimum":{"value":4.04,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}}},"thetaOneWeek":{"effective":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":2.02,"inclusive":true}},"unadjusted":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}}},"vega":{"effective":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"unadjusted":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}}},"leverage":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}},"omega":{"minimum":{"value":2.02,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"impliedVolatility":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"intrinsicValue":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":5.05,"inclusive":true}},"timeValue":{"minimum":{"value":1.01,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"outperformancePoint":{"minimum":{"value":5.05,"inclusive":true},"maximum":{"value":3.1415,"inclusive":true}},"parity":{"minimum":{"value":3.1415,"inclusive":true},"maximum":{"value":4.04,"inclusive":true}}},"performance":{"intraday":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":1,"inclusive":true}},"sinceIssue":{"ask":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"bid":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}}},"endOfDay":{"day1":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"week1":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"month1":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"months3":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"months6":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}},"year1":{"minimum":{"value":0.2,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"years3":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0,"inclusive":true}},"years5":{"minimum":{"value":0,"inclusive":true},"maximum":{"value":0.1,"inclusive":true}},"yearToDate":{"minimum":{"value":1,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}}}},"volatility":{"week1":{"minimum":{"value":0.3,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"month1":{"minimum":{"value":0.4,"inclusive":true},"maximum":{"value":0.2,"inclusive":true}},"months3":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"months6":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"year1":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.5,"inclusive":true}},"years3":{"minimum":{"value":0.5,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}},"years5":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.4,"inclusive":true}},"yearToDate":{"minimum":{"value":0.1,"inclusive":true},"maximum":{"value":0.3,"inclusive":true}}}},"meta":{"attributes":[],"language":"en"}} // PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest | Request Body
};

// Call api endpoint
apiInstance.postSecuritizedDerivativeNotationScreenerValueRangesGet(opts).then(
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
 **postSecuritizedDerivativeNotationScreenerValueRangesGetRequest** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

