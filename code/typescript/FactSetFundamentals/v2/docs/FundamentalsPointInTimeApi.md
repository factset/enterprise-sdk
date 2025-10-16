# factsetfundamentals.FundamentalsPointInTimeApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postFundamentalsFiscalPeriods**](FundamentalsPointInTimeApi.md#postFundamentalsFiscalPeriods) | **POST** /periods | Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.
[**postFundamentalsPITData**](FundamentalsPointInTimeApi.md#postFundamentalsPITData) | **POST** /point-in-time | Retrieve Point-in-Time data for multiple securities.



## postFundamentalsFiscalPeriods

> BatchStatusResponse postFundamentalsFiscalPeriods(periodsRequest)

Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.

This endpoint initiates an asynchronous batch job to fetch detailed information about fiscal periods. The request allows filtering for fiscal periods ending within a specified calendar date range. The response provides Point-in-Time (PIT) details, showing when each period&#39;s information was first published and when it was superseded. This is crucial for historical backtesting. All requests will return a &#x60;202 Accepted&#x60; response with a &#x60;Location&#x60; header pointing to the &#x60;/batch-status&#x60; endpoint. Use the &#x60;id&#x60; from the status response to check for completion and retrieve the result from the &#x60;/batch-result&#x60; endpoint. **All timestamps are in UTC.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FundamentalsPointInTimeApi } = require('@factset/sdk-factsetfundamentals');
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

const apiInstance = new FundamentalsPointInTimeApi();
const periodsRequest = {"data":{"ids":["FDS-US","AAPL-US"],"periodicity":"QTR","fiscalPeriodStart":"2021-01-01","fiscalPeriodEnd":"2021-12-31"}}; // PeriodsRequest | Request object containing parameters for the fiscal periods request.

// Call api endpoint
apiInstance.postFundamentalsFiscalPeriods(periodsRequest).then(
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
 **periodsRequest** | [**PeriodsRequest**](PeriodsRequest.md)| Request object containing parameters for the fiscal periods request. | 

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postFundamentalsPITData

> BatchStatusResponse postFundamentalsPITData(fundamentalsPITRequest)

Retrieve Point-in-Time data for multiple securities.

This endpoint initiates an asynchronous batch job to fetch Point-in-Time (PIT) data. PIT data allows you to view fundamentals data as it was known on a specific date. This is crucial for backtesting trading strategies, performing academic research, and avoiding lookahead bias. All requests will return a &#x60;202 Accepted&#x60; response with a &#x60;Location&#x60; header pointing to the &#x60;/batch-status&#x60; endpoint. Use the &#x60;id&#x60; from the status response to check for completion and retrieve the result from the &#x60;/batch-result&#x60; endpoint. **All timestamps are in UTC.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FundamentalsPointInTimeApi } = require('@factset/sdk-factsetfundamentals');
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

const apiInstance = new FundamentalsPointInTimeApi();
const fundamentalsPITRequest = new factsetfundamentals.FundamentalsPITRequest(); // FundamentalsPITRequest | Request object containing parameters for the PIT fundamentals request.

// Call api endpoint
apiInstance.postFundamentalsPITData(fundamentalsPITRequest).then(
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
 **fundamentalsPITRequest** | [**FundamentalsPITRequest**](FundamentalsPITRequest.md)| Request object containing parameters for the PIT fundamentals request. | 

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

