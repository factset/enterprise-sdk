# etfprofileandprices.FactsetApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**factsetEtfAllocationAssetListBySymbolGet**](FactsetApi.md#factsetEtfAllocationAssetListBySymbolGet) | **GET** /factset/etf/allocation/asset/listBySymbol | This endpoint returns selected ETP&#39;s asset allocations.
[**factsetEtfAllocationCountryListBySymbolGet**](FactsetApi.md#factsetEtfAllocationCountryListBySymbolGet) | **GET** /factset/etf/allocation/country/listBySymbol | This endpoint returns selected ETP&#39;s country allocations.
[**factsetEtfAllocationExchangeListBySymbolGet**](FactsetApi.md#factsetEtfAllocationExchangeListBySymbolGet) | **GET** /factset/etf/allocation/exchange/listBySymbol | This endpoint returns selected ETP&#39;s exchange allocations.
[**factsetEtfAllocationRegionListBySymbolGet**](FactsetApi.md#factsetEtfAllocationRegionListBySymbolGet) | **GET** /factset/etf/allocation/region/listBySymbol | This endpoint returns selected ETP&#39;s region allocations.
[**factsetEtfAllocationSectorListBySymbolGet**](FactsetApi.md#factsetEtfAllocationSectorListBySymbolGet) | **GET** /factset/etf/allocation/sector/listBySymbol | This endpoint returns selected ETP&#39;s sector allocations.
[**factsetEtfCharacteristicsGetBySymbolGet**](FactsetApi.md#factsetEtfCharacteristicsGetBySymbolGet) | **GET** /factset/etf/characteristics/getBySymbol | Retrieve basic characteristic information for a specified ETP.
[**factsetEtfClassCategoryBroadListGet**](FactsetApi.md#factsetEtfClassCategoryBroadListGet) | **GET** /factset/etf/class/category/broad/list | List of ETP class broad categories.
[**factsetEtfClassCategoryFocusListGet**](FactsetApi.md#factsetEtfClassCategoryFocusListGet) | **GET** /factset/etf/class/category/focus/list | List of ETP class focus categories.
[**factsetEtfClassCategoryNicheListGet**](FactsetApi.md#factsetEtfClassCategoryNicheListGet) | **GET** /factset/etf/class/category/niche/list | List of ETP class niche categories.
[**factsetEtfClassGeographyListGet**](FactsetApi.md#factsetEtfClassGeographyListGet) | **GET** /factset/etf/class/geography/list | List of ETP class geographies.
[**factsetEtfClassGetBySymbolGet**](FactsetApi.md#factsetEtfClassGetBySymbolGet) | **GET** /factset/etf/class/getBySymbol | Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.
[**factsetEtfDistributionGetBySymbolGet**](FactsetApi.md#factsetEtfDistributionGetBySymbolGet) | **GET** /factset/etf/distribution/getBySymbol | Retrieve an ETP&#39;s current distribution details.
[**factsetEtfFundFlowsGetBySymbolGet**](FactsetApi.md#factsetEtfFundFlowsGetBySymbolGet) | **GET** /factset/etf/fundFlows/getBySymbol | Retrieve an ETP&#39;s cash inflow/outflows for various time periods.
[**factsetEtfGetBySymbolGet**](FactsetApi.md#factsetEtfGetBySymbolGet) | **GET** /factset/etf/getBySymbol | Retrieve basic profile information for a specified ETP.
[**factsetEtfGrowthOfTenKListBySymbolGet**](FactsetApi.md#factsetEtfGrowthOfTenKListBySymbolGet) | **GET** /factset/etf/growthOfTenK/listBySymbol | This endpoint returns selected ETP&#39;s Growth of 10K calculated values.
[**factsetEtfHoldingsListBySymbolGet**](FactsetApi.md#factsetEtfHoldingsListBySymbolGet) | **GET** /factset/etf/holdings/listBySymbol | Holdings details for an individual ETP.
[**factsetEtfPriceGetBySymbolGet**](FactsetApi.md#factsetEtfPriceGetBySymbolGet) | **GET** /factset/etf/price/getBySymbol | Retrieve historical ETP NAV values.
[**factsetEtfReturnsGetBySymbolGet**](FactsetApi.md#factsetEtfReturnsGetBySymbolGet) | **GET** /factset/etf/returns/getBySymbol | Retrieve total return data for a specified ETP.
[**factsetEtfStrategyGetBySymbolGet**](FactsetApi.md#factsetEtfStrategyGetBySymbolGet) | **GET** /factset/etf/strategy/getBySymbol | Retrieve various classification details for a specified ETP.
[**factsetEtfStrategySegmentListGet**](FactsetApi.md#factsetEtfStrategySegmentListGet) | **GET** /factset/etf/strategy/segment/list | Retrieve a list of ETP strategy segments.
[**factsetEtfStructureGetBySymbolGet**](FactsetApi.md#factsetEtfStructureGetBySymbolGet) | **GET** /factset/etf/structure/getBySymbol | Retrieve the basic structure information for a specified ETP.
[**factsetEtfTaxesAndFeesUsGetBySymbolGet**](FactsetApi.md#factsetEtfTaxesAndFeesUsGetBySymbolGet) | **GET** /factset/etf/taxesAndFees/us/getBySymbol | Retrieve the tax and fee related information for a specified ETP.
[**factsetEtfTimeSeriesListBySymbolGet**](FactsetApi.md#factsetEtfTimeSeriesListBySymbolGet) | **GET** /factset/etf/timeSeries/listBySymbol | Retrieve historical NAV data for a specified ETP.



## factsetEtfAllocationAssetListBySymbolGet

> InlineResponse2001 factsetEtfAllocationAssetListBySymbolGet(symbol, opts)

This endpoint returns selected ETP&#39;s asset allocations.

This endpoint returns selected ETP&#39;s allocations grouped by asset class. The response will be sorted by weight in descending order.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfAllocationAssetListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfAllocationCountryListBySymbolGet

> InlineResponse2002 factsetEtfAllocationCountryListBySymbolGet(symbol, opts)

This endpoint returns selected ETP&#39;s country allocations.

This endpoint returns selected ETP&#39;s allocations grouped by country names. The response will be sorted by weight in descending order.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfAllocationCountryListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfAllocationExchangeListBySymbolGet

> InlineResponse2003 factsetEtfAllocationExchangeListBySymbolGet(symbol, opts)

This endpoint returns selected ETP&#39;s exchange allocations.

This endpoint returns selected ETP&#39;s allocations grouped by exchanges. The response will be sorted by weight in descending order.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfAllocationExchangeListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfAllocationRegionListBySymbolGet

> InlineResponse2004 factsetEtfAllocationRegionListBySymbolGet(symbol, opts)

This endpoint returns selected ETP&#39;s region allocations.

This endpoint returns selected ETP&#39;s allocations grouped by region names. The response will be sorted by weight in descending order.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfAllocationRegionListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfAllocationSectorListBySymbolGet

> InlineResponse2005 factsetEtfAllocationSectorListBySymbolGet(symbol, opts)

This endpoint returns selected ETP&#39;s sector allocations.

This endpoint returns selected ETP&#39;s allocations grouped by sector names. The response will be sorted by weight in descending order.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfAllocationSectorListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfCharacteristicsGetBySymbolGet

> InlineResponse2006 factsetEtfCharacteristicsGetBySymbolGet(symbol, opts)

Retrieve basic characteristic information for a specified ETP.

An ETP has many unique characteristics specific to its composition that differentiate it from other products. This includes details on leverage, hedging, derivatives, and service providers.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETF defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfCharacteristicsGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETF defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfClassCategoryBroadListGet

> InlineResponse2008 factsetEtfClassCategoryBroadListGet(opts)

List of ETP class broad categories.

List of ETP class broad categories.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfClassCategoryBroadListGet(opts).then(
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

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfClassCategoryFocusListGet

> InlineResponse2009 factsetEtfClassCategoryFocusListGet(opts)

List of ETP class focus categories.

List of ETP class focus categories.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfClassCategoryFocusListGet(opts).then(
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
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfClassCategoryNicheListGet

> InlineResponse20010 factsetEtfClassCategoryNicheListGet(opts)

List of ETP class niche categories.

List of ETP class niche categories.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfClassCategoryNicheListGet(opts).then(
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
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfClassGeographyListGet

> InlineResponse20011 factsetEtfClassGeographyListGet(opts)

List of ETP class geographies.

List of ETP class geographies.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfClassGeographyListGet(opts).then(
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

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfClassGetBySymbolGet

> InlineResponse2007 factsetEtfClassGetBySymbolGet(symbol, opts)

Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.

ETP classification is divided into three categories: Asset Class, Geography, and Investment Strategy. Asset class is determined based on the various asset types held by the fund, A fund&#39;s geography can be classified by region (e.g. Asia-Pac), specific geography (e.g. China) or economic development (e.g. BRIC). An ETP&#39;s investment strategy is classified in broad categories (e.g. Large Cap) and more granular categorizations.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfClassGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfDistributionGetBySymbolGet

> InlineResponse20012 factsetEtfDistributionGetBySymbolGet(symbol, opts)

Retrieve an ETP&#39;s current distribution details.

Retrieve distribution-related details for a specific ETP including dividend and capital gain distribution details.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfDistributionGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfFundFlowsGetBySymbolGet

> InlineResponse20013 factsetEtfFundFlowsGetBySymbolGet(symbol, opts)

Retrieve an ETP&#39;s cash inflow/outflows for various time periods.

Retrieve the amount invested or divested in a specific ETP over various time periods including one-day, one-week, one-month, one-year, and YTD.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfFundFlowsGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfGetBySymbolGet

> InlineResponse200 factsetEtfGetBySymbolGet(symbol, opts)

Retrieve basic profile information for a specified ETP.

An ETP can be profiled by defining several common attributes such as issuer, fund description, and benchmark.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfGrowthOfTenKListBySymbolGet

> InlineResponse20014 factsetEtfGrowthOfTenKListBySymbolGet(symbol, opts)

This endpoint returns selected ETP&#39;s Growth of 10K calculated values.

Growth of 10K (or growth of 10,000) is a commonly used chart that highlights the change in the value of an initial 10,000 investment in the ETP during a given period of time. Often, this period of time is either since inception or the calculation between the pre-defined range.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'timePeriod': "timePeriod_example", // String | Historice NAV date value.
  'calculationType': "calculationType_example", // String | Historice NAV date value.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfGrowthOfTenKListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **timePeriod** | **String**| Historice NAV date value. | [optional] 
 **calculationType** | **String**| Historice NAV date value. | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfHoldingsListBySymbolGet

> InlineResponse20015 factsetEtfHoldingsListBySymbolGet(symbol, opts)

Holdings details for an individual ETP.

Retrieve an ETP&#39;s holdings information including security, shares held, and weight.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfHoldingsListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfPriceGetBySymbolGet

> InlineResponse20016 factsetEtfPriceGetBySymbolGet(symbol, opts)

Retrieve historical ETP NAV values.

Retrieve an ETP&#39;s historical NAV and shares outstanding for a specified time range.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfPriceGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfReturnsGetBySymbolGet

> InlineResponse20017 factsetEtfReturnsGetBySymbolGet(symbol, opts)

Retrieve total return data for a specified ETP.

An ETP&#39;s total return data can be returned for various time frames including 1-month, 3-month, YTD, 1-year, 3-year, and 5-year. Total return market price is used to calcualte price returns. Total return nav is used to calcualte nav returns.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'returnType': "'price'", // String | Return type.
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfReturnsGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **returnType** | **String**| Return type. | [optional] [default to &#39;price&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfStrategyGetBySymbolGet

> InlineResponse20018 factsetEtfStrategyGetBySymbolGet(symbol, opts)

Retrieve various classification details for a specified ETP.

ETP&#39;s can be classified in many different ways including investment strategy, security weightings, and fund composition.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfStrategyGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfStrategySegmentListGet

> InlineResponse20019 factsetEtfStrategySegmentListGet(opts)

Retrieve a list of ETP strategy segments.

Retrieve the various segments assigned to a specific ETP. Segment data is used to group funds for comparison and relative performance analyses.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfStrategySegmentListGet(opts).then(
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
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfStructureGetBySymbolGet

> InlineResponse20020 factsetEtfStructureGetBySymbolGet(symbol, opts)

Retrieve the basic structure information for a specified ETP.

Retrieve details on a fund&#39;s structure including its type, investment style (active/passive), and legal structure.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfStructureGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfTaxesAndFeesUsGetBySymbolGet

> InlineResponse20021 factsetEtfTaxesAndFeesUsGetBySymbolGet(symbol, opts)

Retrieve the tax and fee related information for a specified ETP.

Retrieve various fee and tax related details on a specified ETP including expense ratio and tax treatment for dividends and capital gains.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.factsetEtfTaxesAndFeesUsGetBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## factsetEtfTimeSeriesListBySymbolGet

> InlineResponse20022 factsetEtfTimeSeriesListBySymbolGet(symbol, opts)

Retrieve historical NAV data for a specified ETP.

Retrieve the historical NAV data and the respective fund flows and shares outstanding for a specified fund and time period. Please refer currency.fund in /factset/etf/getBySymbol for currency value.

### Example

```javascript
const { ApiClient, FactsetApi } = require('@factset/sdk-etfprofileandprices');
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

const apiInstance = new FactsetApi();
const symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
const opts = {
  'timePeriod': "'1Y'", // String | Time frame of the data.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'paginationOffset': 0.0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20.0 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.factsetEtfTimeSeriesListBySymbolGet(symbol, opts).then(
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
 **symbol** | **String**| Market symbol of ETP defined by FactSet. | 
 **timePeriod** | **String**| Time frame of the data. | [optional] [default to &#39;1Y&#39;]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

