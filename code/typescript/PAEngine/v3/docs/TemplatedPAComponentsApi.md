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

This endpoint creates new component based off of linked PA template or unlinked PA template.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&amp;H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data).    *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is &#39;securities&#39;.      Additionally, while &#39;groupsall&#39; returns all the group levels in the PA component,      setting componentdetail to &#39;groups&#39; only returns the expanded or collapsed group levels within the PA component.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding grouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const templatedPAComponentParametersRoot = {"data":{"directory":"Personal:TemplatedPAComponents/","parentTemplateId":"01234567890123456789012345678901","description":"This is a templated PA component","componentData":{"accounts":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"MSCI_USA:984000","holdingsmode":"B&H"}],"benchmarks":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"DJGX:AMERICAS","holdingsmode":"B&H"}],"groups":[{"id":"5BCFFD17598FAEBD88EB4934EFB5FEF53849867D607ECEF232CD42D3369BBBCA","frequency":"BeginningOfPeriod"}],"columns":[{"id":"BD1720474AB8A80BDD79777F5B9CA594F4151C0554E30F9C916BA73BFAFC1FE0","statistics":["eb9d6d91416e4224bacadc261787e56f"]}],"datasources":{"portfoliopricingsources":[{"id":"39A1C0C7BD46731552B29D913804EC5F3ED91E6B991AF298DEC88CCA2A9FC6B3"}],"benchmarkpricingsources":[{"id":"9BB2A3142C450AF54A7486C1D37A210A64474B2499A1E4A30E19801B9FC55E8C"}],"useportfoliopricingsourcesforbenchmark":false},"currencyisocode":"USD","componentdetail":"GROUPS"}}}; // TemplatedPAComponentParametersRoot | Request Parameters

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
- **Accept**: application/json


## deleteTemplatedPAComponents

> deleteTemplatedPAComponents(id)

Delete templated PA component

This endpoint deletes an existing templated PA component

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const id = 01234567890123456789012345678901; // String | Unique identifier for a templated PA component

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
 **id** | **String**| Unique identifier for a templated PA component | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTemplatedPAComponentById

> TemplatedPAComponentRoot getTemplatedPAComponentById(id)

Get templated PA component by id

This endpoint fetches the templated PA component settings.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const id = 01234567890123456789012345678901; // String | Unique identifier for a templated PA component

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
 **id** | **String**| Unique identifier for a templated PA component | 

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const directory = Personal:TemplatedPAComponents/; // String | Get templated PA components in path

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
 **directory** | **String**| Get templated PA components in path | 

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

This endpoint allows the user to change the request body from an existing templated PA component.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&amp;H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data).     *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is &#39;securities&#39;.      Additionally, while &#39;groupsall&#39; returns all the group levels in the PA component,      setting componentdetail to &#39;groups&#39; only returns the expanded or collapsed group levels within the PA component.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding grouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TemplatedPAComponentsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new TemplatedPAComponentsApi();
const id = 01234567890123456789012345678901; // String | Unique identifier for a templated PA component
const templatedPAComponentUpdateParametersRoot = {"data":{"parentTemplateId":"01234567890123456789012345678901","description":"This is a templated PA component","componentData":{"accounts":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"MSCI_USA:984000","holdingsmode":"B&H"}],"benchmarks":[{"id":"SPN:SP50","holdingsmode":"B&H"},{"id":"DJGX:AMERICAS","holdingsmode":"B&H"}],"groups":[{"id":"5BCFFD17598FAEBD88EB4934EFB5FEF53849867D607ECEF232CD42D3369BBBCA","frequency":"BeginningOfPeriod"}],"columns":[{"id":"BD1720474AB8A80BDD79777F5B9CA594F4151C0554E30F9C916BA73BFAFC1FE0","statistics":["eb9d6d91416e4224bacadc261787e56f"]}],"datasources":{"portfoliopricingsources":[{"id":"39A1C0C7BD46731552B29D913804EC5F3ED91E6B991AF298DEC88CCA2A9FC6B3"}],"benchmarkpricingsources":[{"id":"9BB2A3142C450AF54A7486C1D37A210A64474B2499A1E4A30E19801B9FC55E8C"}],"useportfoliopricingsourcesforbenchmark":false},"currencyisocode":"USD","componentdetail":"GROUPS"}}}; // TemplatedPAComponentUpdateParametersRoot | Request Parameters

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
 **id** | **String**| Unique identifier for a templated PA component | 
 **templatedPAComponentUpdateParametersRoot** | [**TemplatedPAComponentUpdateParametersRoot**](TemplatedPAComponentUpdateParametersRoot.md)| Request Parameters | 

### Return type

[**TemplatedPAComponentPostSummaryRoot**](TemplatedPAComponentPostSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

