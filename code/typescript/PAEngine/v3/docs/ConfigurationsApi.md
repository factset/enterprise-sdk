# paengine.ConfigurationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPACommentaryConfigurations**](ConfigurationsApi.md#getPACommentaryConfigurations) | **GET** /analytics/engines/pa/v3/commentary/configurations | Get PA commentary configurations in a directory



## getPACommentaryConfigurations

> PACommentaryConfigurationSummaryRoot getPACommentaryConfigurations(path)

Get PA commentary configurations in a directory

This endpoint returns all PA commentary configurations in a given directory.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ConfigurationsApi } = require('@factset/sdk-paengine');
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

const apiInstance = new ConfigurationsApi();
const path = Client:; // String | The directory to get the PA commentary configurations

// Call api endpoint
apiInstance.getPACommentaryConfigurations(path).then(
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
 **path** | **String**| The directory to get the PA commentary configurations | 

### Return type

[**PACommentaryConfigurationSummaryRoot**](PACommentaryConfigurationSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

