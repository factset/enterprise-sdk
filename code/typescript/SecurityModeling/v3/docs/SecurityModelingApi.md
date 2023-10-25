# securitymodeling.SecurityModelingApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSecurities**](SecurityModelingApi.md#deleteSecurities) | **POST** /analytics/security-modeling/v3/securities/delete | Delete existing securities
[**getSecurities**](SecurityModelingApi.md#getSecurities) | **POST** /analytics/security-modeling/v3/securities/retrieve | Get existing securities
[**upsertSecurities**](SecurityModelingApi.md#upsertSecurities) | **POST** /analytics/security-modeling/v3/securities/upsert | Create or update securities



## deleteSecurities

> SMDeleteResponseRoot deleteSecurities(opts)

Delete existing securities

This endpoint deletes existing securities.

### Example

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const opts = {
  'sMDeleteParametersRoot': new securitymodeling.SMDeleteParametersRoot() // SMDeleteParametersRoot | 
};

// Call api endpoint
apiInstance.deleteSecurities(opts).then(
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
 **sMDeleteParametersRoot** | [**SMDeleteParametersRoot**](SMDeleteParametersRoot.md)|  | [optional] 

### Return type

[**SMDeleteResponseRoot**](SMDeleteResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSecurities

> SMRetrieveResponseRoot getSecurities(opts)

Get existing securities

This endpoint gets all existing securities.

### Example

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const opts = {
  'sMRetrieveParametersRoot': new securitymodeling.SMRetrieveParametersRoot() // SMRetrieveParametersRoot | 
};

// Call api endpoint
apiInstance.getSecurities(opts).then(
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
 **sMRetrieveParametersRoot** | [**SMRetrieveParametersRoot**](SMRetrieveParametersRoot.md)|  | [optional] 

### Return type

[**SMRetrieveResponseRoot**](SMRetrieveResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## upsertSecurities

> SMCreateResponseRoot upsertSecurities(opts)

Create or update securities

This endpoint is to create or update existing securities.

### Example

```javascript
const { ApiClient, SecurityModelingApi } = require('@factset/sdk-securitymodeling');
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

const apiInstance = new SecurityModelingApi();
const opts = {
  'sMCreateParametersRoot': new securitymodeling.SMCreateParametersRoot() // SMCreateParametersRoot | 
};

// Call api endpoint
apiInstance.upsertSecurities(opts).then(
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
 **sMCreateParametersRoot** | [**SMCreateParametersRoot**](SMCreateParametersRoot.md)|  | [optional] 

### Return type

[**SMCreateResponseRoot**](SMCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

