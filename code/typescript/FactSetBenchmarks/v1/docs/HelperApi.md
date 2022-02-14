# factsetbenchmarks.HelperApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBenchmarkIds**](HelperApi.md#getBenchmarkIds) | **GET** /factset-benchmarks/v1/id-list | Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
[**getBenchmarkIdsForList**](HelperApi.md#getBenchmarkIdsForList) | **POST** /factset-benchmarks/v1/id-list | Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.



## getBenchmarkIds

> BenchmarkIdListResponse getBenchmarkIds(opts)

Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.

Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your &#x60;ids&#x60; parameter in the /constituents endpoint to return constituents for that id.&lt;p&gt; *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support. *&lt;/p&gt;

### Example

```javascript
const { ApiClient, HelperApi } = require('@factset/sdk-factsetbenchmarks');
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

const apiInstance = new HelperApi();
const opts = {
  'familyFilter': "familyFilter_example" // String | Highest Level Filter to search by common Benchmark Families, such as S&P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA & HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans. * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe. * **MSCI** - MSCI All Country, Asia Pacific, Thematic & Strategy, Emerging, Developed, US. * **RUSSELL** - US, Global, and Nomura. * **S&P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX. * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) 
};

// Call api endpoint
apiInstance.getBenchmarkIds(opts).then(
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
 **familyFilter** | **String**| Highest Level Filter to search by common Benchmark Families, such as S&amp;P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA &amp; HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans. * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe. * **MSCI** - MSCI All Country, Asia Pacific, Thematic &amp; Strategy, Emerging, Developed, US. * **RUSSELL** - US, Global, and Nomura. * **S&amp;P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX. * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301)  | [optional] 

### Return type

[**BenchmarkIdListResponse**](BenchmarkIdListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBenchmarkIdsForList

> BenchmarkIdListResponse getBenchmarkIdsForList(benchmarkIdListRequest)

Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.

Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your &#x60;ids&#x60; parameter in the /constituents endpoint to return constituents for that id.&lt;p&gt; *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support.*&lt;/p&gt;

### Example

```javascript
const { ApiClient, HelperApi } = require('@factset/sdk-factsetbenchmarks');
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

const apiInstance = new HelperApi();
const benchmarkIdListRequest = new factsetbenchmarks.BenchmarkIdListRequest(); // BenchmarkIdListRequest | Requests a sample list of identifiers that can be used in other Benchmarks API endpoints.

// Call api endpoint
apiInstance.getBenchmarkIdsForList(benchmarkIdListRequest).then(
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
 **benchmarkIdListRequest** | [**BenchmarkIdListRequest**](BenchmarkIdListRequest.md)| Requests a sample list of identifiers that can be used in other Benchmarks API endpoints. | 

### Return type

[**BenchmarkIdListResponse**](BenchmarkIdListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

