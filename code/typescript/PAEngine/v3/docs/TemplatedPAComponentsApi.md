# paengine.TemplatedPAComponentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplatedPAComponents**](TemplatedPAComponentsApi.md#createTemplatedPAComponents) | **POST** /analytics/engines/pa/v3/templated-components | Create templated PA component
[**deleteTemplatedPAComponents**](TemplatedPAComponentsApi.md#deleteTemplatedPAComponents) | **DELETE** /analytics/engines/pa/v3/templated-components/{id} | Delete templated PA component
[**getTemplatedPAComponentById**](TemplatedPAComponentsApi.md#getTemplatedPAComponentById) | **GET** /analytics/engines/pa/v3/templated-components/{id} | Get templated PA component by id
[**getTemplatedPAComponentsInPath**](TemplatedPAComponentsApi.md#getTemplatedPAComponentsInPath) | **GET** /analytics/engines/pa/v3/templated-components | Get templated PA components in path
[**updateTemplatedPAComponents**](TemplatedPAComponentsApi.md#updateTemplatedPAComponents) | **PUT** /analytics/engines/pa/v3/templated-components/{id} | Update templated PA component



## createTemplatedPAComponents

> TemplatedPAComponentPostSummaryRoot createTemplatedPAComponents(templatedPAComponentParametersRoot)

Create templated PA component

This endpoint creates new component based off of linked PA template or unlinked PA template.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, and totals as well but if we don&#39;t pass anything that defaults to securities.

### Example

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const templatedPAComponentParametersRoot = {"data":{"directory":"Personal:TemplatedPAComponents/","parentTemplateId":"01234567890123456789012345678901","description":"This is a templated PA component","componentData":{"accounts":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"MSCI_USA:984000","holdingsmode":"B&H"}],"benchmarks":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"DJGX:AMERICAS","holdingsmode":"B&H"}],"groups":[{"id":"5BCFFD17598FAEBD88EB4934EFB5FEF53849867D607ECEF232CD42D3369BBBCA"}],"columns":[{"id":"BD1720474AB8A80BDD79777F5B9CA594F4151C0554E30F9C916BA73BFAFC1FE0","statistics":["eb9d6d91416e4224bacadc261787e56f"]}],"currencyisocode":"USD","componentdetail":"GROUPS"}}}; // TemplatedPAComponentParametersRoot | Request Parameters

// Call api endpoint
apiInstance.createTemplatedPAComponents(templatedPAComponentParametersRoot).then(
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
 **templatedPAComponentParametersRoot** | [**TemplatedPAComponentParametersRoot**](TemplatedPAComponentParametersRoot.md)| Request Parameters | 

### Return type

[**TemplatedPAComponentPostSummaryRoot**](TemplatedPAComponentPostSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


## deleteTemplatedPAComponents

> deleteTemplatedPAComponents(id)

Delete templated PA component

This endpoint deletes an existing templated PA component

### Example

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const id = "'01234567890123456789012345678901'"; // String | Unique identifier for a templated PA component

// Call api endpoint
apiInstance.deleteTemplatedPAComponents(id).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier for a templated PA component | [default to &#39;01234567890123456789012345678901&#39;]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## getTemplatedPAComponentById

> TemplatedPAComponentRoot getTemplatedPAComponentById(id)

Get templated PA component by id

This endpoint fetches the templated PA component settings.

### Example

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const id = "'01234567890123456789012345678901'"; // String | Unique identifier for a templated PA component

// Call api endpoint
apiInstance.getTemplatedPAComponentById(id).then(
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
 **id** | **String**| Unique identifier for a templated PA component | [default to &#39;01234567890123456789012345678901&#39;]

### Return type

[**TemplatedPAComponentRoot**](TemplatedPAComponentRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTemplatedPAComponentsInPath

> TemplatedPAComponentSummaryRoot getTemplatedPAComponentsInPath(directory)

Get templated PA components in path

This endpoint returns the list of templated PA components in path.

### Example

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const directory = "'Personal:TemplatedPAComponents/'"; // String | Get templated PA components in path

// Call api endpoint
apiInstance.getTemplatedPAComponentsInPath(directory).then(
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
 **directory** | **String**| Get templated PA components in path | [default to &#39;Personal:TemplatedPAComponents/&#39;]

### Return type

[**TemplatedPAComponentSummaryRoot**](TemplatedPAComponentSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateTemplatedPAComponents

> TemplatedPAComponentPostSummaryRoot updateTemplatedPAComponents(id, templatedPAComponentUpdateParametersRoot)

Update templated PA component

This endpoint allows the user to change the request body from an existing templated PA component.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, and totals as well but if we don&#39;t pass anything that defaults to securities.

### Example

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const id = "'01234567890123456789012345678901'"; // String | Unique identifier for a templated PA component
const templatedPAComponentUpdateParametersRoot = {"data":{"parentTemplateId":"01234567890123456789012345678901","description":"This is a templated PA component","componentData":{"accounts":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"MSCI_USA:984000","holdingsmode":"B&H"}],"benchmarks":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"DJGX:AMERICAS","holdingsmode":"B&H"}],"groups":[{"id":"5BCFFD17598FAEBD88EB4934EFB5FEF53849867D607ECEF232CD42D3369BBBCA"}],"columns":[{"id":"BD1720474AB8A80BDD79777F5B9CA594F4151C0554E30F9C916BA73BFAFC1FE0","statistics":["eb9d6d91416e4224bacadc261787e56f"]}],"currencyisocode":"USD","componentdetail":"GROUPS"}}}; // TemplatedPAComponentUpdateParametersRoot | Request Parameters

// Call api endpoint
apiInstance.updateTemplatedPAComponents(id, templatedPAComponentUpdateParametersRoot).then(
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
 **id** | **String**| Unique identifier for a templated PA component | [default to &#39;01234567890123456789012345678901&#39;]
 **templatedPAComponentUpdateParametersRoot** | [**TemplatedPAComponentUpdateParametersRoot**](TemplatedPAComponentUpdateParametersRoot.md)| Request Parameters | 

### Return type

[**TemplatedPAComponentPostSummaryRoot**](TemplatedPAComponentPostSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

