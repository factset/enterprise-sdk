# irnnotes.IdentifiersApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIdentifiers**](IdentifiersApi.md#getIdentifiers) | **GET** /v1/identifiers | Get all the identifier details for given identifiers



## getIdentifiers

> [IdentifierResolutionDto] getIdentifiers(opts)

Get all the identifier details for given identifiers

### Example

```javascript
const { ApiClient, IdentifiersApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new IdentifiersApi();
const opts = {
  'identifiers': "identifiers_example" // String | Identifiers
};

// Call api endpoint
apiInstance.getIdentifiers(opts).then(
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
 **identifiers** | **String**| Identifiers | [optional] 

### Return type

[**[IdentifierResolutionDto]**](IdentifierResolutionDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

