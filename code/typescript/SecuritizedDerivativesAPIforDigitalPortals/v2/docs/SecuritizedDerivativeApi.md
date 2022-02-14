# securitizedderivativesapifordigitalportals.SecuritizedDerivativeApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecuritizedDerivativeBarrierTypeList**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeBarrierTypeList) | **GET** /securitizedDerivative/barrier/type/list | List of barrier types.
[**getSecuritizedDerivativeGet**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeGet) | **GET** /securitizedDerivative/get | Fundamental data for a single securitized derivative.
[**getSecuritizedDerivativeKeyFiguresNotationGet**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeKeyFiguresNotationGet) | **GET** /securitizedDerivative/keyFigures/notation/get | Notation-based key figures of a securitized derivative.
[**getSecuritizedDerivativeUnderlyingList**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeUnderlyingList) | **GET** /securitizedDerivative/underlying/list | List of underlyings with barrier and cash flow information.
[**postSecuritizedDerivativeIssuerSearch**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeIssuerSearch) | **POST** /securitizedDerivative/issuer/search | Search for issuers of securitized derivatives.
[**postSecuritizedDerivativeNotationRankingIntradayList**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationRankingIntradayList) | **POST** /securitizedDerivative/notation/ranking/intraday/list | Ranking of securitized derivatives&#39; notations using intraday figures.
[**postSecuritizedDerivativeNotationScreenerSearch**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationScreenerSearch) | **POST** /securitizedDerivative/notation/screener/search | Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
[**postSecuritizedDerivativeNotationScreenerValueRangesGet**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationScreenerValueRangesGet) | **POST** /securitizedDerivative/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/securitizedDerivative/notation/screener/search&#x60;.



## getSecuritizedDerivativeBarrierTypeList

> InlineResponse2001 getSecuritizedDerivativeBarrierTypeList(opts)

List of barrier types.

List of barrier types.

### Example

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

> InlineResponse200 getSecuritizedDerivativeGet(id, opts)

Fundamental data for a single securitized derivative.

Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.

### Example

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const id = "id_example"; // String | Identifier of the instrument.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeGet(id, opts).then(
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecuritizedDerivativeKeyFiguresNotationGet

> InlineResponse2003 getSecuritizedDerivativeKeyFiguresNotationGet(id, opts)

Notation-based key figures of a securitized derivative.

Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute &#x60;underlyings.coverRatio&#x60; in endpoint &#x60;/securitizedDerivative/underlying/list&#x60;.  Various barrier types (e.g. strike, knock in) - see endpoint &#x60;/securitizedDerivative/barrier/type/list&#x60;.  Exercise right - see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitizedDerivative/get&#x60;.  Issue price - see attribute &#x60;issue.price&#x60; in endpoint &#x60;/securitizedDerivative/get&#x60;.  Ask price - see attribute &#x60;prices.ask&#x60;.  Bid price - see attribute &#x60;prices.bid&#x60;.

### Example

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const id = "id_example"; // String | Identifier of a notation.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeKeyFiguresNotationGet(id, opts).then(
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSecuritizedDerivativeUnderlyingList

> InlineResponse2007 getSecuritizedDerivativeUnderlyingList(id, opts)

List of underlyings with barrier and cash flow information.

Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.

### Example

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const id = "id_example"; // String | Identifier of an instrument.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getSecuritizedDerivativeUnderlyingList(id, opts).then(
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
 **id** | **String**| Identifier of an instrument. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postSecuritizedDerivativeIssuerSearch

> InlineResponse2002 postSecuritizedDerivativeIssuerSearch(opts)

Search for issuers of securitized derivatives.

Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'body': new securitizedderivativesapifordigitalportals.InlineObject() // InlineObject | 
};

// Call api endpoint
apiInstance.postSecuritizedDerivativeIssuerSearch(opts).then(
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

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'body': new securitizedderivativesapifordigitalportals.InlineObject1() // InlineObject1 | 
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

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

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'body': new securitizedderivativesapifordigitalportals.InlineObject3() // InlineObject3 | 
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
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postSecuritizedDerivativeNotationScreenerValueRangesGet

> InlineResponse2005 postSecuritizedDerivativeNotationScreenerValueRangesGet(opts)

Possible values and value ranges for the parameters used in the endpoint &#x60;/securitizedDerivative/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint &#x60;/securitizedDerivatives/notation/screener/search&#x60;. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches, only the notation with the best market priority (according to the parameter &#x60;market.priority&#x60;) or, in the absence of market priorities, with the highest monetary trading volume, averaged over 30 trading days, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the &#x60;/securitizedDerivatives/notation/screener/search&#x60; endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \&quot;level\&quot; is used instead of \&quot;price\&quot;, e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

```javascript
const { ApiClient, SecuritizedDerivativeApi } = require('@factset/sdk-securitizedderivativesapifordigitalportals');
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

const apiInstance = new SecuritizedDerivativeApi();
const opts = {
  'body': new securitizedderivativesapifordigitalportals.InlineObject2() // InlineObject2 | 
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

