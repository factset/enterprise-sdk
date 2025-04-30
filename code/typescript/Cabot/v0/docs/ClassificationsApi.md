# cabot.ClassificationsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolioClassifications**](ClassificationsApi.md#getPortfolioClassifications) | **GET** /classifications | Cabot main path for Classifications API



## getPortfolioClassifications

> ClassificationsResponseRoot getPortfolioClassifications(accountPath, benchmarkPath)

Cabot main path for Classifications API

Cabot main path for Classifications API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ClassificationsApi } = require('@factset/sdk-cabot');
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

const apiInstance = new ClassificationsApi();
const accountPath = "accountPath_example"; // String | The account path of the portfolio you want to retrieve the data for.<br /><br />
const benchmarkPath = "benchmarkPath_example"; // String | The path of the benchmark you want to retrieve the data for.<br /><br />

// Call api endpoint
apiInstance.getPortfolioClassifications(accountPath, benchmarkPath).then(
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
 **accountPath** | **String**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 
 **benchmarkPath** | **String**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; | 

### Return type

[**ClassificationsResponseRoot**](ClassificationsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

