# sparengine.ComponentsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSPARComponents**](ComponentsApi.md#getSPARComponents) | **GET** /analytics/lookups/v2/engines/spar/components | Get SPAR components



## getSPARComponents

> {String: ComponentSummary} getSPARComponents(document)

Get SPAR components

This endpoint returns the list of SPAR components in a given SPAR document.

### Example

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-sparengine');
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

const apiInstance = new ComponentsApi();
const document = "'Client:Foo'"; // String | Document Name

// Call api endpoint
apiInstance.getSPARComponents(document).then(
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
 **document** | **String**| Document Name | [default to &#39;Client:Foo&#39;]

### Return type

[**{String: ComponentSummary}**](ComponentSummary.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

