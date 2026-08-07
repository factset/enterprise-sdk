# factsetdebtcapitalstructure.LiquidityApi

All URIs are relative to *https://api.factset.com/content/factset-dcs/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLiquidityPost**](LiquidityApi.md#getLiquidityPost) | **POST** /liquidity | Returns liquidity information for specified metrics and date ranges.



## getLiquidityPost

> LiquidityResponse getLiquidityPost(liquidityRequest)

Returns liquidity information for specified metrics and date ranges.

Gets liquidity detail and summary information (includes all instrument details). 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, LiquidityApi } = require('@factset/sdk-factsetdebtcapitalstructure');
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

const apiInstance = new LiquidityApi();
const liquidityRequest = new factsetdebtcapitalstructure.LiquidityRequest(); // LiquidityRequest | Request object for `Liquidity`.

// Call api endpoint
apiInstance.getLiquidityPost(liquidityRequest).then(
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
 **liquidityRequest** | [**LiquidityRequest**](LiquidityRequest.md)| Request object for &#x60;Liquidity&#x60;. | 

### Return type

[**LiquidityResponse**](LiquidityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

