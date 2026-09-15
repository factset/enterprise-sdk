# factsetpowerutilities.PricesApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPrices**](PricesApi.md#listPrices) | **POST** /prices | Returns power spot prices, spark spreads, capacity prices, or forward prices



## listPrices

> PricesResponse listPrices(pricesRequest)

Returns power spot prices, spark spreads, capacity prices, or forward prices

Returns power market price data for one of four categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Power&#x60;** — Daily spot power prices in $/MWh at major hubs and zones. Includes on-peak, off-peak, and around-the-clock prices. * **&#x60;SparkSpread&#x60;** — Natural gas spark spreads in $/MWh at four fixed assumed heat rates (7,000 / 8,000 / 10,000 / 12,000 MMBtu/MWh), representing the difference between the power price and the cost of gas needed to generate one MWh. * **&#x60;Capacity&#x60;** — Capacity auction clearing prices in $/MW-day from ISO/RTO forward capacity markets. Includes delivery year and auction type. * **&#x60;Forward&#x60;** — Forward power price curves in $/MWh for future delivery months, reported as a rolling 3-day average. Includes on-peak, off-peak, and around-the-clock products.  Use &#x60;GET /reference/location-mapping&#x60; to discover valid &#x60;ids&#x60; for the &#x60;Power&#x60;, &#x60;SparkSpread&#x60;, and &#x60;Forward&#x60; categories, or &#x60;GET /reference/zone-mapping&#x60; for the &#x60;Capacity&#x60; category. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, PricesApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new PricesApi();
const pricesRequest = new factsetpowerutilities.PricesRequest(); // PricesRequest | 

// Call api endpoint
apiInstance.listPrices(pricesRequest).then(
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
 **pricesRequest** | [**PricesRequest**](PricesRequest.md)|  | 

### Return type

[**PricesResponse**](PricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

