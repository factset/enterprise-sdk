# factsettermsandconditions.RedemptionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFixedIncomeRedemptionPrices**](RedemptionsApi.md#getFixedIncomeRedemptionPrices) | **GET** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a Fixed Income security.
[**getFixedIncomeRedemptionPricesForList**](RedemptionsApi.md#getFixedIncomeRedemptionPricesForList) | **POST** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a list of Fixed Income securities.



## getFixedIncomeRedemptionPrices

> RedemptionPricesResponse getFixedIncomeRedemptionPrices(ids, categories)

Return Redemption Prices for a Fixed Income security.

Returns Redemption Prices for the Fixed Income security. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RedemptionsApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new RedemptionsApi();
const ids = ["30231GBJ","88579EAA"]; // [String] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
const categories = "'ALL'"; // String | Filters the list of Redemption Prices Categories -   * **CALL** = Call prices.   * **PUT** = Put prices.   * **SF** = Sinking Fund prices. 

// Call api endpoint
apiInstance.getFixedIncomeRedemptionPrices(ids, categories).then(
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
 **ids** | [**[String]**](String.md)| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
 **categories** | **String**| Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  | [default to &#39;ALL&#39;]

### Return type

[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFixedIncomeRedemptionPricesForList

> RedemptionPricesResponse getFixedIncomeRedemptionPricesForList(redemptionPricesRequest)

Return Redemption Prices for a list of Fixed Income securities.

Returns Redemption Prices for a list of Fixed Income securities. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, RedemptionsApi } = require('@factset/sdk-factsettermsandconditions');
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

const apiInstance = new RedemptionsApi();
const redemptionPricesRequest = new factsettermsandconditions.RedemptionPricesRequest(); // RedemptionPricesRequest | Request object for Fixed Income Redemption Prices.

// Call api endpoint
apiInstance.getFixedIncomeRedemptionPricesForList(redemptionPricesRequest).then(
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
 **redemptionPricesRequest** | [**RedemptionPricesRequest**](RedemptionPricesRequest.md)| Request object for Fixed Income Redemption Prices. | 

### Return type

[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

