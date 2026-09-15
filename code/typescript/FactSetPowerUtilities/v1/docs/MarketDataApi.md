# factsetpowerutilities.MarketDataApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMarketData**](MarketDataApi.md#listMarketData) | **POST** /market-data | Returns balancing authority generation, demand, or interchange
[**listMarketDataCoverage**](MarketDataApi.md#listMarketDataCoverage) | **GET** /market-data/coverage | Returns balancing authority coverage



## listMarketData

> MarketDataResponse listMarketData(marketDataRequest)

Returns balancing authority generation, demand, or interchange

Returns balancing authority time-series data for one of three categories, selected via the &#x60;category&#x60; discriminator in the request body:  * **&#x60;Generation&#x60;** — Hourly net generation in MW by fuel type for the specified balancing authorities (&#x60;factsetBaId&#x60;) and date range. * **&#x60;Demand&#x60;** — Hourly electricity demand (load) in MW for the specified balancing authority sub-regions (&#x60;factsetBaSubRegId&#x60;). * **&#x60;Interchange&#x60;** — Hourly net interchange in MW between a reporting BA sub-region and its counterpart sub-regions. Positive values indicate net exports; negative values indicate net imports. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketDataApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new MarketDataApi();
const marketDataRequest = new factsetpowerutilities.MarketDataRequest(); // MarketDataRequest | 

// Call api endpoint
apiInstance.listMarketData(marketDataRequest).then(
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
 **marketDataRequest** | [**MarketDataRequest**](MarketDataRequest.md)|  | 

### Return type

[**MarketDataResponse**](MarketDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## listMarketDataCoverage

> MarketDataCoverageResponse listMarketDataCoverage(opts)

Returns balancing authority coverage

Returns the full list of balancing authority (BA) sub-regions available in the market data endpoints. Use the returned &#x60;factsetBaId&#x60; values as input for the &#x60;Generation&#x60; category, or &#x60;factsetBaSubRegId&#x60; values for the &#x60;Demand&#x60; and &#x60;Interchange&#x60; categories, of &#x60;POST /market-data&#x60;. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MarketDataApi } = require('@factset/sdk-factsetpowerutilities');
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

const apiInstance = new MarketDataApi();
const opts = {
  'country': United States, // String | Filter by country name.
  'paginationLimit': 100, // Number | Maximum number of results to return per request.
  'paginationOffset': 0 // Number | Number of results to skip.
};

// Call api endpoint
apiInstance.listMarketDataCoverage(opts).then(
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
 **country** | **String**| Filter by country name. | [optional] 
 **paginationLimit** | **Number**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **Number**| Number of results to skip. | [optional] [default to 0]

### Return type

[**MarketDataCoverageResponse**](MarketDataCoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

