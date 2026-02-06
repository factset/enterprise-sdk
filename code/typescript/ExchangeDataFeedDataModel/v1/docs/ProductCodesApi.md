# exchangedatafeeddatamodel.ProductCodesApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProducts**](ProductCodesApi.md#getProducts) | **GET** /products | Request the enumeration table for FactSet product codes.



## getProducts

> ProductsResponse getProducts(opts)

Request the enumeration table for FactSet product codes.

Data can be returned in CSV, JSON or XML format, use the &#x60;format&#x60; parameter to change from the default JSON format. *You must be logged into the Developer Portal and obtain an **[API key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response.  Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ProductCodesApi } = require('@factset/sdk-exchangedatafeeddatamodel');
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

const apiInstance = new ProductCodesApi();
const opts = {
  'productCode': [9001,10001,10010], // [Number] | Allows filtering of specific product codes in the response.
  'format': json, // String | The format of the output file.
  'accessFilter': "accessFilter_example" // String | Allows filtering based on Real-Time, delayed, or both access types. **Omit** this parameter for the complete list.
};

// Call api endpoint
apiInstance.getProducts(opts).then(
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
 **productCode** | [**[Number]**](Number.md)| Allows filtering of specific product codes in the response. | [optional] 
 **format** | **String**| The format of the output file. | [optional] 
 **accessFilter** | **String**| Allows filtering based on Real-Time, delayed, or both access types. **Omit** this parameter for the complete list. | [optional] 

### Return type

[**ProductsResponse**](ProductsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

