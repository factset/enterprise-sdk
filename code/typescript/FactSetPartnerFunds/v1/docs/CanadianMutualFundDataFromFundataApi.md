# factsetpartnerfunds.CanadianMutualFundDataFromFundataApi

All URIs are relative to *https://api.factset.com/content/partner-funds/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssetAllocations**](CanadianMutualFundDataFromFundataApi.md#getAssetAllocations) | **GET** /fundata/asset-allocations | Fund asset allocations
[**getDistribution**](CanadianMutualFundDataFromFundataApi.md#getDistribution) | **GET** /fundata/distribution | Fund distributions
[**getFees**](CanadianMutualFundDataFromFundataApi.md#getFees) | **GET** /fundata/fees | Fund fees
[**getGeographicAllocations**](CanadianMutualFundDataFromFundataApi.md#getGeographicAllocations) | **GET** /fundata/geographic-allocations | Fund geographic allocations
[**getGrowthOfTenK**](CanadianMutualFundDataFromFundataApi.md#getGrowthOfTenK) | **GET** /fundata/growth-of-10k | Fund growth of 10K
[**getHoldings**](CanadianMutualFundDataFromFundataApi.md#getHoldings) | **GET** /fundata/holdings | Fund holdings
[**getProfile**](CanadianMutualFundDataFromFundataApi.md#getProfile) | **GET** /fundata/profile | Fund profile
[**getRankings**](CanadianMutualFundDataFromFundataApi.md#getRankings) | **GET** /fundata/rankings | Fund rankings
[**getReturns**](CanadianMutualFundDataFromFundataApi.md#getReturns) | **GET** /fundata/returns | Fund returns
[**getRisk**](CanadianMutualFundDataFromFundataApi.md#getRisk) | **GET** /fundata/risk | Fund risk
[**getSectorAllocations**](CanadianMutualFundDataFromFundataApi.md#getSectorAllocations) | **GET** /fundata/sector-allocations | Fund sector allocations



## getAssetAllocations

> AssetAllocationsResponse getAssetAllocations(ids, opts)

Fund asset allocations

This endpoint provides asset allocations for Canadian mutual fund aggregated by asset. The result is default sorted in descending order of asset weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'language': "'EN'", // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
  'sort': ["weight"] // [String] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
};

// Call api endpoint
apiInstance.getAssetAllocations(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to &#39;EN&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type

[**AssetAllocationsResponse**](AssetAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDistribution

> DistributionsResponse getDistribution(ids)

Fund distributions

This endpoint provides distribution data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

// Call api endpoint
apiInstance.getDistribution(ids).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type

[**DistributionsResponse**](DistributionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFees

> FeesResponse getFees(ids, opts)

Fund fees

This endpoint provides fees data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'language': "'EN'" // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
};

// Call api endpoint
apiInstance.getFees(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to &#39;EN&#39;]

### Return type

[**FeesResponse**](FeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGeographicAllocations

> GeoAllocationsResponse getGeographicAllocations(ids, opts)

Fund geographic allocations

This endpoint provides geographic allocations (which can be countries or regions) of the holdings within Canadian mutual funds. The result is default sorted in descending order of geographic weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'language': "'EN'", // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
  'sort': ["weight"] // [String] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
};

// Call api endpoint
apiInstance.getGeographicAllocations(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to &#39;EN&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type

[**GeoAllocationsResponse**](GeoAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getGrowthOfTenK

> GrowthOfTenKResponse getGrowthOfTenK(ids, opts)

Fund growth of 10K

This endpoint provides growth of 10K data for Canadian mutual funds. The result is default sorted in descending order of asOfDate.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'timePeriod': "'1Y'", // String | Periodicity or frequency of the fiscal period.
  'sort': ["weight"] // [String] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
};

// Call api endpoint
apiInstance.getGrowthOfTenK(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **timePeriod** | **String**| Periodicity or frequency of the fiscal period. | [optional] [default to &#39;1Y&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type

[**GrowthOfTenKResponse**](GrowthOfTenKResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getHoldings

> HoldingsResponse getHoldings(ids)

Fund holdings

This endpoint provides top 10 holdings for Canadian mutual funds. The result is default sorted in descending order of weight of the holdings.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

// Call api endpoint
apiInstance.getHoldings(ids).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type

[**HoldingsResponse**](HoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getProfile

> ProfileResponse getProfile(ids, opts)

Fund profile

This endpoint provides profile information for Canadian mutual funds such as objective, manager, and basic returns.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'language': "'EN'" // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
};

// Call api endpoint
apiInstance.getProfile(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to &#39;EN&#39;]

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRankings

> PerformanceRankingsResponse getRankings(ids)

Fund rankings

This endpoint provides rankings for Canadian mutual funds as compared to benchmarks and peers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

// Call api endpoint
apiInstance.getRankings(ids).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type

[**PerformanceRankingsResponse**](PerformanceRankingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getReturns

> PerformanceReturnsResponse getReturns(ids)

Fund returns

This endpoint provides all the comparative performance values for Canadian mutual funds and their respective benchmark indices. Please note: all periods greater than one year are annualized. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

// Call api endpoint
apiInstance.getReturns(ids).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type

[**PerformanceReturnsResponse**](PerformanceReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRisk

> RiskResponse getRisk(ids, opts)

Fund risk

This endpoint provides risk data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'language': "'EN'", // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
  'numYears': 5 // Number | Number of years of risk data to return. 
};

// Call api endpoint
apiInstance.getRisk(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to &#39;EN&#39;]
 **numYears** | **Number**| Number of years of risk data to return.  | [optional] [default to 5]

### Return type

[**RiskResponse**](RiskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSectorAllocations

> SectorAllocationsResponse getSectorAllocations(ids, opts)

Fund sector allocations

This endpoint provides Canadian mutual fund data aggregated by sector. The result is default sorted in descending order of sector weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CanadianMutualFundDataFromFundataApi } = require('@factset/sdk-factsetpartnerfunds');
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

const apiInstance = new CanadianMutualFundDataFromFundataApi();
const ids = ["AGF10450"]; // [String] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
const opts = {
  'language': "'EN'", // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
  'sort': ["weight"] // [String] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
};

// Call api endpoint
apiInstance.getSectorAllocations(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to &#39;EN&#39;]
 **sort** | [**[String]**](String.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type

[**SectorAllocationsResponse**](SectorAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

