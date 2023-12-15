# fixedincomecalculation.DiscountCurvesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllFIDiscountCurves**](DiscountCurvesApi.md#getAllFIDiscountCurves) | **GET** /analytics/engines/fi/v3/discount-curves | Get Discount Curves



## getAllFIDiscountCurves

> FIDiscountCurveInfoRoot getAllFIDiscountCurves(opts)

Get Discount Curves

This endpoint lists all the discount curves that can be applied to a FI calculation.

### Example

```javascript
const { ApiClient, DiscountCurvesApi } = require('@factset/sdk-fixedincomecalculation');
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

const apiInstance = new DiscountCurvesApi();
const opts = {
  'currency': "currency_example" // String | 
};

// Call api endpoint
apiInstance.getAllFIDiscountCurves(opts).then(
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
 **currency** | **String**|  | [optional] 

### Return type

[**FIDiscountCurveInfoRoot**](FIDiscountCurveInfoRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

