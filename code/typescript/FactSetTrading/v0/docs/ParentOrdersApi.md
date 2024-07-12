# factsettrading.ParentOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateParentOrder**](ParentOrdersApi.md#updateParentOrder) | **PUT** /parent-orders/update | Update Parent Orders



## updateParentOrder

> ParentOrdersUpdateResponseRoot updateParentOrder(opts)

Update Parent Orders

This endpoint allows the user to update parent orders which are already present in Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ParentOrdersApi } = require('@factset/sdk-factsettrading');
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

const apiInstance = new ParentOrdersApi();
const opts = {
  'parentOrdersUpdateRoot': {"data":{"parentOrders":[{"parentId":{"symbol":"AMZN US","basketId":"valid basket id"},"userGroup":"API","userDefinedFields":{"currency":"INR"}}]}} // ParentOrdersUpdateRoot | 
};

// Call api endpoint
apiInstance.updateParentOrder(opts).then(
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
 **parentOrdersUpdateRoot** | [**ParentOrdersUpdateRoot**](ParentOrdersUpdateRoot.md)|  | [optional] 

### Return type

[**ParentOrdersUpdateResponseRoot**](ParentOrdersUpdateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

