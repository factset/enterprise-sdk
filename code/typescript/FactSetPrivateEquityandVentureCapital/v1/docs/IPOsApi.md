# factsetprivateequityandventurecapital.IPOsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIPO**](IPOsApi.md#getIPO) | **GET** /ipos | Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
[**searchIPOs**](IPOsApi.md#searchIPOs) | **POST** /ipos/search | Search and filter the universe of portfolio company IPOs by status, size, and date range.



## getIPO

> IPODetailsResponse getIPO(ids)

Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.

Provides comprehensive details on the **Initial Public Offering (IPO)** process for portfolio companies, typically representing an exit for a fund. Information includes the **IPO size**, **pricing**, date, and other relevant capital markets data.  Use the &#x60;/transactions/ma-activity&#x60; endpoint to find fund deal ids for your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IPOsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new IPOsApi();
const ids = [23682]; // [Number] | A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger & Acquisition (M&A) or Venture Capital (VC) deal**. This ID represents the main event being tracked.

// Call api endpoint
apiInstance.getIPO(ids).then(
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
 **ids** | [**[Number]**](Number.md)| A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger &amp; Acquisition (M&amp;A) or Venture Capital (VC) deal**. This ID represents the main event being tracked. | 

### Return type

[**IPODetailsResponse**](IPODetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## searchIPOs

> IPOSearchResponse searchIPOs(iPOSearchRequest)

Search and filter the universe of portfolio company IPOs by status, size, and date range.

Enables filtering of the IPO universe by criteria such as **IPO status** (e.g., Completed, Withdrawn), the **date range** of the IPO, and the minimum or maximum **offering size** in USD.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IPOsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new IPOsApi();
const iPOSearchRequest = new factsetprivateequityandventurecapital.IPOSearchRequest(); // IPOSearchRequest | 

// Call api endpoint
apiInstance.searchIPOs(iPOSearchRequest).then(
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
 **iPOSearchRequest** | [**IPOSearchRequest**](IPOSearchRequest.md)|  | 

### Return type

[**IPOSearchResponse**](IPOSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

