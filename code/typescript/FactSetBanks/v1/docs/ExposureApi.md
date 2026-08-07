# factsetbanks.ExposureApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountryExposure**](ExposureApi.md#getCountryExposure) | **POST** /country-exposure | Returns country exposure data (Form 009a)



## getCountryExposure

> ExposureResponse getCountryExposure(exposureRequest)

Returns country exposure data (Form 009a)

Returns Form 009a country exposure data — the distribution by country of claims on foreigners held by US banks — for screening countries and assessing risks in US bank lending activities. Viewable by metric and by country.  Covers ~100 US commercial banks; history since 2013. Updated quarterly.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;EXPOSURE&#x60; * **subcategory**: &#x60;COUNTRY&#x60; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ExposureApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new ExposureApi();
const exposureRequest = new factsetbanks.ExposureRequest(); // ExposureRequest | 

// Call api endpoint
apiInstance.getCountryExposure(exposureRequest).then(
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
 **exposureRequest** | [**ExposureRequest**](ExposureRequest.md)|  | 

### Return type

[**ExposureResponse**](ExposureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

