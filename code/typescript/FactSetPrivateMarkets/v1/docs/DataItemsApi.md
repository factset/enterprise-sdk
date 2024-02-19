# factsetprivatemarkets.DataItemsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFields**](DataItemsApi.md#getFields) | **GET** /factset-private-markets/v1/fields | Available private company fields, metrics, and ratios.



## getFields

> FieldsResponse getFields(opts)

Available private company fields, metrics, and ratios.

Returns list of available Private Company fields that can be used in the &#x60;fields&#x60; parameter of related endpoints. These are related to FactSet Private Company standardized data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DataItemsApi } = require('@factset/sdk-factsetprivatemarkets');
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

const apiInstance = new DataItemsApi();
const opts = {
  'category': FINANCIALS // String | Filters the list of available fields per endpoint  -   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA.   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. 
};

// Call api endpoint
apiInstance.getFields(opts).then(
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
 **category** | **String**| Filters the list of available fields per endpoint  -   * **FINANCIALS** &#x3D; Financials endpoint data items, such as Assets, Liabilities, and EBITDA.   * **NON_PERIODIC** &#x3D; Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List.  | [optional] 

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

