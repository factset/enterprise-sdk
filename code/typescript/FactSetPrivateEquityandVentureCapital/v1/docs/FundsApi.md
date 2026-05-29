# factsetprivateequityandventurecapital.FundsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFund**](FundsApi.md#getFund) | **GET** /funds | Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
[**getFundCashflows**](FundsApi.md#getFundCashflows) | **POST** /funds/cashflows | Retrieve time-series cash flow data (contributions and distributions) for specified funds.
[**getFundFundraising**](FundsApi.md#getFundFundraising) | **GET** /funds/fundraising | Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
[**getFundPortfolioCompanies**](FundsApi.md#getFundPortfolioCompanies) | **GET** /funds/portfolio-companies | Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.



## getFund

> FundDetailsResponse getFund(ids)

Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.

Retrieves the main descriptive and profile information for one or more Private Equity or Venture Capital funds identified by their FactSet entity IDs. This includes key characteristics like fund status (e.g., Open, Closed), fund type (e.g., Venture, Buyout), vintage year, and high-level strategy details.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FundsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new FundsApi();
const ids = ["001JYM-E","005GEM-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

// Call api endpoint
apiInstance.getFund(ids).then(
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
 **ids** | [**[String]**](String.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type

[**FundDetailsResponse**](FundDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundCashflows

> FundCashflowsResponse getFundCashflows(fundCashflowsRequest)

Retrieve time-series cash flow data (contributions and distributions) for specified funds.

Provides **quarterly** cash flow data for one or more funds, including **contributions** (capital calls) and **distributions** (payouts). This raw data is fundamental for calculating net cash flows and performance metrics like DPI, TVPI, and IRR.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FundsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new FundsApi();
const fundCashflowsRequest = new factsetprivateequityandventurecapital.FundCashflowsRequest(); // FundCashflowsRequest | 

// Call api endpoint
apiInstance.getFundCashflows(fundCashflowsRequest).then(
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
 **fundCashflowsRequest** | [**FundCashflowsRequest**](FundCashflowsRequest.md)|  | 

### Return type

[**FundCashflowsResponse**](FundCashflowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFundFundraising

> FundFundraisingResponse getFundFundraising(ids)

Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.

Provides detailed information on the **fundraising lifecycle** of one or more funds, including data on interim and **final closes**, the **total amount raised** (fund size), and the as-reported currency for each fundraising round.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FundsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new FundsApi();
const ids = ["001JYM-E","005GEM-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

// Call api endpoint
apiInstance.getFundFundraising(ids).then(
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
 **ids** | [**[String]**](String.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type

[**FundFundraisingResponse**](FundFundraisingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundPortfolioCompanies

> FundPortfolioCompaniesResponse getFundPortfolioCompanies(ids)

Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.

Provides a list of **FactSet entity identifiers** for the portfolio companies in which a specified fund has invested. This endpoint is key for analyzing a fund&#39;s holdings and exposure to different companies in the private market.  Use the &#x60;/universe&#x60; endpoint, set the &#x60;entityType&#x60; parameter to &#x60;VEN&#x60; (Venture Capital Fund), &#x60;PVF&#x60; (Private Equity Fund/Alt Investment), or &#x60;FAF&#x60; (Family of Funds (Venture Capital/Private Equity)). Submit the fund&#39;s name. The returned &#x60;entityId&#x60; is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FundsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new FundsApi();
const ids = ["001JYM-E","005GEM-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

// Call api endpoint
apiInstance.getFundPortfolioCompanies(ids).then(
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
 **ids** | [**[String]**](String.md)| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint | 

### Return type

[**FundPortfolioCompaniesResponse**](FundPortfolioCompaniesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

