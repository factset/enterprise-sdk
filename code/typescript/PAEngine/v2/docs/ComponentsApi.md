# paengine.ComponentsApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPAComponentById**](ComponentsApi.md#getPAComponentById) | **GET** /analytics/lookups/v2/engines/pa/components/{id} | Get PA component by id
[**getPAComponents**](ComponentsApi.md#getPAComponents) | **GET** /analytics/lookups/v2/engines/pa/components | Get PA components



## getPAComponentById

> PAComponent getPAComponentById(id)

Get PA component by id

This endpoint returns the default settings of a PA component.

### Example

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-paengine');
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
const id = "'782DA0A0C9CCCA9F80C2F3622FC1373AED30E1B7C1CF58F4677FE8C4C4901A53'"; // String | Unique identifier for a PA component

// Call api endpoint
apiInstance.getPAComponentById(id).then(
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
 **id** | **String**| Unique identifier for a PA component | [default to &#39;782DA0A0C9CCCA9F80C2F3622FC1373AED30E1B7C1CF58F4677FE8C4C4901A53&#39;]

### Return type

[**PAComponent**](PAComponent.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPAComponents

> {String: ComponentSummary} getPAComponents(document)

Get PA components

This endpoint returns the list of PA components in a given PA document.

### Example

```javascript
const { ApiClient, ComponentsApi } = require('@factset/sdk-paengine');
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
apiInstance.getPAComponents(document).then(
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

