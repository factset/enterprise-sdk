# factsetprivatecompany.MetricsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetrics**](MetricsApi.md#getMetrics) | **GET** /metrics | Returns available private company metrics, and ratios.



## getMetrics

> MetricsResponse getMetrics(opts)

Returns available private company metrics, and ratios.

Returns list of available Private Company metrics, and ratios that can be used in the &#x60;metrics&#x60; parameter of related endpoints. These are related to FactSet Private Company standardized data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MetricsApi } = require('@factset/sdk-factsetprivatecompany');
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

const apiInstance = new MetricsApi();
const opts = {
  'category': FINANCIALS // String | Filters the list of available metrics per endpoint  - </br>   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA. </br>   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. 
};

// Call api endpoint
apiInstance.getMetrics(opts).then(
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
 **category** | **String**| Filters the list of available metrics per endpoint  - &lt;/br&gt;   * **FINANCIALS** &#x3D; Financials endpoint data items, such as Assets, Liabilities, and EBITDA. &lt;/br&gt;   * **NON_PERIODIC** &#x3D; Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List.  | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

