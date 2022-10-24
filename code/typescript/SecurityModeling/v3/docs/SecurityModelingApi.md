# securitymodeling.SecurityModelingApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**upsertSecurities**](SecurityModelingApi.md#upsertSecurities) | **POST** /analytics/security-modeling/v3/securities/upsert | Create or update securities



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

