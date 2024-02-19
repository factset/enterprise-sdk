# paengine.PricingSourcesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPAPricingSources**](PricingSourcesApi.md#getPAPricingSources) | **GET** /analytics/engines/pa/v3/pricing-sources | Get PA pricing sources



## getPAPricingSources

> PAPricingSourceRoot getPAPricingSources(opts)

Get PA pricing sources

This endpoint lists all the PA pricing sources that can be applied to a PA calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricingSourcesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new PricingSourcesApi();
const opts = {
  'name': "''", // String | PA pricing sources name
  'category': "''", // String | PA pricing sources category
  'directory': "''" // String | The directory to get the PA pricing sources in
};

// Call api endpoint
apiInstance.getPAPricingSources(opts).then(
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
 **name** | **String**| PA pricing sources name | [optional] [default to &#39;&#39;]
 **category** | **String**| PA pricing sources category | [optional] [default to &#39;&#39;]
 **directory** | **String**| The directory to get the PA pricing sources in | [optional] [default to &#39;&#39;]

### Return type

[**PAPricingSourceRoot**](PAPricingSourceRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

