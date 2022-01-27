# sparengine.BenchmarksApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSPARBenchmarkById**](BenchmarksApi.md#getSPARBenchmarkById) | **GET** /analytics/engines/spar/v3/benchmarks | Get SPAR benchmark details



## getSPARBenchmarkById

> SPARBenchmarkRoot getSPARBenchmarkById(id)

Get SPAR benchmark details

This endpoint returns the details of a given SPAR benchmark identifier.

### Example

```javascript
const { ApiClient, BenchmarksApi } = require('@factset/sdk-sparengine');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new BenchmarksApi();
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

[**SPARBenchmarkRoot**](SPARBenchmarkRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

