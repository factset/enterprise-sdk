# factsetprivateequityandventurecapital.StrategiesApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityStrategies**](StrategiesApi.md#getEntityStrategies) | **GET** /entities/strategies | Retrieve detailed investment strategy mandates for a specified fund or General Partner.



## getEntityStrategies

> EntityStrategiesResponse getEntityStrategies(ids)

Retrieve detailed investment strategy mandates for a specified fund or General Partner.

Provides a granular breakdown of the defined investment mandate for a fund or General Partner (GP). The strategy is multi-faceted, covering areas such as target **geographic exposure** (region, country, state), preferred **industry/sector** focus, targeted **investment instruments** (e.g., debt, equity, convertible notes), and **control criteria**.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, StrategiesApi } = require('@factset/sdk-factsetprivateequityandventurecapital');
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

const apiInstance = new StrategiesApi();
const ids = ["001JYM-E","005GEM-E"]; // [String] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

// Call api endpoint
apiInstance.getEntityStrategies(ids).then(
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

[**EntityStrategiesResponse**](EntityStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

