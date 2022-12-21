# exchangedatafeeddatamodel.FactSetProductCodesApi

All URIs are relative to *https://api.factset.com/RTDataModel*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProducts**](FactSetProductCodesApi.md#getProducts) | **GET** /products | Request the enumeration table for FactSet product codes.



## getProducts

> RTDataModelProducts getProducts(opts)

Request the enumeration table for FactSet product codes.

 Data can be returned in CSV, JSON or XML format, use the &#x60;format&#x60; parameter to chnage from the default JSON format.    &#39;*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for &#39;&#39;Try it Out&#39;&#39; to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*&#39; 

### Example

```javascript
const { ApiClient, FactSetProductCodesApi } = require('@factset/sdk-exchangedatafeeddatamodel');
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

const apiInstance = new FactSetProductCodesApi();
const opts = {
  'format': "'json'" // String | The format of the output file.<p>**Try it Out** - All formats available</p>
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
 **format** | **String**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to &#39;json&#39;]

### Return type

[**RTDataModelProducts**](RTDataModelProducts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

