# factsetbanks.UBPRPerformanceApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPerformance**](UBPRPerformanceApi.md#getPerformance) | **POST** /ubpr | Returns UBPR performance metrics



## getPerformance

> PerformanceResponse getPerformance(performanceRequest)

Returns UBPR performance metrics

Returns Uniform Bank Performance Report (UBPR) metrics — financial ratios, peer group rankings, and performance analytics — sourced from FFIEC reports of condition and income (call reports). Supports analysis of earnings, liquidity, capital, asset/liability management, and growth across three data views: the bank&#39;s own data, peer group data (banks similar in size and economic environment), and percentile rankings.  Covers 10,000+ insured commercial banks and FDIC-supervised savings banks across 249 peer groups. Quarterly history since 2002; 1,600+ data items.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;PERFORMANCE&#x60; * **subcategory**: &#x60;UBPR&#x60; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, UBPRPerformanceApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new UBPRPerformanceApi();
const performanceRequest = new factsetbanks.PerformanceRequest(); // PerformanceRequest | 

// Call api endpoint
apiInstance.getPerformance(performanceRequest).then(
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
 **performanceRequest** | [**PerformanceRequest**](PerformanceRequest.md)|  | 

### Return type

[**PerformanceResponse**](PerformanceResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

