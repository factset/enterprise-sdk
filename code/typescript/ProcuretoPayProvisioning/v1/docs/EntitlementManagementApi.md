# procuretopayprovisioning.EntitlementManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductsPost**](EntitlementManagementApi.md#addProductsPost) | **POST** /addProducts | Adds listed productIds to an individual
[**removeProductsPost**](EntitlementManagementApi.md#removeProductsPost) | **POST** /removeProducts | Removes listed productIds from an individual



## addProductsPost

> InlineResponse202 addProductsPost(opts)

Adds listed productIds to an individual

### Example

```javascript
const { ApiClient, EntitlementManagementApi } = require('@factset/sdk-procuretopayprovisioning');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new EntitlementManagementApi();
const opts = {
  'manageProductIds': new procuretopayprovisioning.ManageProductIds() // ManageProductIds | 
};

// Call api endpoint
apiInstance.addProductsPost(opts).then(
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
 **manageProductIds** | [**ManageProductIds**](ManageProductIds.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain


## removeProductsPost

> InlineResponse202 removeProductsPost(opts)

Removes listed productIds from an individual

### Example

```javascript
const { ApiClient, EntitlementManagementApi } = require('@factset/sdk-procuretopayprovisioning');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Configure HTTP basic authorization: FactSetApiKey
const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
FactSetApiKey.username = 'YOUR USERNAME';
FactSetApiKey.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: FactSetOAuth2
const FactSetOAuth2 = apiClient.authentications['FactSetOAuth2'];
FactSetOAuth2.accessToken = 'YOUR ACCESS TOKEN';

// Configure OAuth2 access with ConfidentialClient
apiClient.factsetOauth2Client = new ConfidentialClient('./config.json');

const apiInstance = new EntitlementManagementApi();
const opts = {
  'manageProductIds': new procuretopayprovisioning.ManageProductIds() // ManageProductIds | 
};

// Call api endpoint
apiInstance.removeProductsPost(opts).then(
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
 **manageProductIds** | [**ManageProductIds**](ManageProductIds.md)|  | [optional] 

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain

