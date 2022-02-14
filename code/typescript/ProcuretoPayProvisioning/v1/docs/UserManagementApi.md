# procuretopayprovisioning.UserManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelIndividualPost**](UserManagementApi.md#cancelIndividualPost) | **POST** /cancelIndividual | Cancels an individual&#39;s serial and all productIds
[**createIndividualPost**](UserManagementApi.md#createIndividualPost) | **POST** /createIndividual | Provisions an individual for FactSet
[**getIndividualGet**](UserManagementApi.md#getIndividualGet) | **GET** /getIndividual | Returns an individual&#39;s details by uniqueId
[**listIndividualsGet**](UserManagementApi.md#listIndividualsGet) | **GET** /listIndividuals | Lists all individuals with details at all locations.
[**modifyIndividualPost**](UserManagementApi.md#modifyIndividualPost) | **POST** /modifyIndividual | Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.



## cancelIndividualPost

> InlineResponse202 cancelIndividualPost(opts)

Cancels an individual&#39;s serial and all productIds

### Example

```javascript
const { ApiClient, UserManagementApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new UserManagementApi();
const opts = {
  'cancelIndividual': new procuretopayprovisioning.CancelIndividual() // CancelIndividual | 
};

// Call api endpoint
apiInstance.cancelIndividualPost(opts).then(
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
 **cancelIndividual** | [**CancelIndividual**](CancelIndividual.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain


## createIndividualPost

> InlineResponse202 createIndividualPost(opts)

Provisions an individual for FactSet

### Example

```javascript
const { ApiClient, UserManagementApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new UserManagementApi();
const opts = {
  'createIndividual': new procuretopayprovisioning.CreateIndividual() // CreateIndividual | 
};

// Call api endpoint
apiInstance.createIndividualPost(opts).then(
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
 **createIndividual** | [**CreateIndividual**](CreateIndividual.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain


## getIndividualGet

> GetIndividual getIndividualGet(uniqueid)

Returns an individual&#39;s details by uniqueId

### Example

```javascript
const { ApiClient, UserManagementApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new UserManagementApi();
const uniqueid = jdoe113901; // String | uniqueId to query

// Call api endpoint
apiInstance.getIndividualGet(uniqueid).then(
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
 **uniqueid** | **String**| uniqueId to query | 

### Return type

[**GetIndividual**](GetIndividual.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain


## listIndividualsGet

> [Object] listIndividualsGet(opts)

Lists all individuals with details at all locations.

### Example

```javascript
const { ApiClient, UserManagementApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new UserManagementApi();
const opts = {
  'includeProductIds': true // Boolean | <br>Optional, if =TRUE will return additional product array per object with all productIds for all returned individuals.</br>
};

// Call api endpoint
apiInstance.listIndividualsGet(opts).then(
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
 **includeProductIds** | **Boolean**| &lt;br&gt;Optional, if &#x3D;TRUE will return additional product array per object with all productIds for all returned individuals.&lt;/br&gt; | [optional] 

### Return type

**[Object]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain


## modifyIndividualPost

> InlineResponse202 modifyIndividualPost(opts)

Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.

### Example

```javascript
const { ApiClient, UserManagementApi } = require('@factset/sdk-procuretopayprovisioning');
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

const apiInstance = new UserManagementApi();
const opts = {
  'modifyIndividual': new procuretopayprovisioning.ModifyIndividual() // ModifyIndividual | 
};

// Call api endpoint
apiInstance.modifyIndividualPost(opts).then(
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
 **modifyIndividual** | [**ModifyIndividual**](ModifyIndividual.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain

