# factsetprivateequityandventurecapital.TransactionsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions | Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.
[**getTransactionMAActivity**](TransactionsApi.md#getTransactionMAActivity) | **GET** /transactions/ma-activity | Retrieve detailed M&amp;A advisory and investment information for specified transactions.
[**searchTransactions**](TransactionsApi.md#searchTransactions) | **POST** /transactions/search | Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.



## getTransaction

> TransactionDetailsResponse getTransaction(ids)

Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.

Retrieves rich, fundamental data for one or more private investment transactions, such as a **Venture Capital funding round** or a **Private Equity buyout**. This includes the **deal size** (transaction amount), **transaction date**, participating **investors**, **security type** (e.g., common stock, preferred stock), and the round&#39;s **stage**.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new TransactionsApi();
const ids = [1000001,1000002]; // [Number] | A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID.

// Call api endpoint
apiInstance.getTransaction(ids).then(
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
 **ids** | [**[Number]**](Number.md)| A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. | 

### Return type

[**TransactionDetailsResponse**](TransactionDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTransactionMAActivity

> TransactionMaActivityResponse getTransactionMAActivity(ids)

Retrieve detailed M&amp;A advisory and investment information for specified transactions.

Provides specific details related to Mergers &amp; Acquisitions (M&amp;A) activity for a given transaction. This includes information on M&amp;A **advisors** (e.g., financial, legal) and the specific **investments** made by General Partner and Limited Partner investors in the context of the M&amp;A deal.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new TransactionsApi();
const ids = [1000001,1000002]; // [Number] | A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID.

// Call api endpoint
apiInstance.getTransactionMAActivity(ids).then(
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
 **ids** | [**[Number]**](Number.md)| A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. | 

### Return type

[**TransactionMaActivityResponse**](TransactionMaActivityResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## searchTransactions

> TransactionSearchResponse searchTransactions(transactionSearchRequest)

Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.

Allows users to query the universe of private transactions using a set of powerful filters. Filters can include specific **portfolio companies**, **investment stages** (e.g., Seed, Growth, Late), **transaction date range**, and **minimum/maximum transaction amounts** in USD.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new TransactionsApi();
const transactionSearchRequest = new factsetprivateequityandventurecapital.TransactionSearchRequest(); // TransactionSearchRequest | 

// Call api endpoint
apiInstance.searchTransactions(transactionSearchRequest).then(
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
 **transactionSearchRequest** | [**TransactionSearchRequest**](TransactionSearchRequest.md)|  | 

### Return type

[**TransactionSearchResponse**](TransactionSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

