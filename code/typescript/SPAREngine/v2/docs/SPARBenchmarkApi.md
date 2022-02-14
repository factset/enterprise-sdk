# sparengine.SPARBenchmarkApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSPARBenchmarkById**](SPARBenchmarkApi.md#getSPARBenchmarkById) | **GET** /analytics/lookups/v2/engines/spar/benchmarks | Get SPAR benchmark details



## getSPARBenchmarkById

> SPARBenchmark getSPARBenchmarkById(id)

Get SPAR benchmark details

This endpoint returns the details of a given SPAR benchmark identifier.

### Example

```javascript
const { ApiClient, SPARBenchmarkApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new SPARBenchmarkApi();
const id = "'R.1000'"; // String | Benchmark Identifier

// Call api endpoint
apiInstance.getSPARBenchmarkById(id).then(
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
 **id** | **String**| Benchmark Identifier | [default to &#39;R.1000&#39;]

### Return type

[**SPARBenchmark**](SPARBenchmark.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

