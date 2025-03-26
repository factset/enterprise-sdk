# procuretopayapiscim.ServiceProviderConfigurationApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getServiceProviderConfig**](ServiceProviderConfigurationApi.md#getServiceProviderConfig) | **GET** /ServiceProviderConfig | Get service provider configuration.



## getServiceProviderConfig

> ServiceProviderConfig getServiceProviderConfig()

Get service provider configuration.

Get service provider configuration, which describes the SCIM specification features available. See RFC 7644 section 4.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ServiceProviderConfigurationApi } = require('@factset/sdk-procuretopayapiscim');
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

const apiInstance = new ServiceProviderConfigurationApi();

// Call api endpoint
apiInstance.getServiceProviderConfig().then(
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

This endpoint does not need any parameter.

### Return type

[**ServiceProviderConfig**](ServiceProviderConfig.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json

