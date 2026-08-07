# factsetbanks.BranchesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **POST** /branches | Returns bank branch and location data



## getBranches

> BranchesResponse getBranches(branchesRequest)

Returns bank branch and location data

Returns branch and location data for banks and financial institutions. Use the &#x60;coverage&#x60; field to specify the data source:  * **US** — FDIC-insured bank branches with branch counts and deposit market share by county, ZIP, and MSA. 85,000+ current branches across 9,000+ banks and BHCs. Sourced from the FDIC Summary of Deposits (annual) and Institutions and Locations (weekly). Current-only feed; deposit balances as of the most recent June 30. * **CREDIT_UNION** — US credit union branches and ATMs with service flags. 5,800+ credit unions, 21,000+ branches, and 17,000+ ATM addresses; reported quarterly since September 2022. * **AUSTRALIA** — Service channel locations with remoteness classifications. 149+ banks; 30,000+ branches, 47,000+ ATMs, 6,600+ other face-to-face, and 4.9M+ EFTPOS channels. Annual data as of June 30. * **GLOBAL** — Global bank branches and ATMs ex-US with country, region, city, lat/long, postal, and street details where available. 300,000+ banks, 800,000+ locations, 180+ countries. Current-only feed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BranchesApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new BranchesApi();
const branchesRequest = new factsetbanks.BranchesRequest(); // BranchesRequest | 

// Call api endpoint
apiInstance.getBranches(branchesRequest).then(
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
 **branchesRequest** | [**BranchesRequest**](BranchesRequest.md)|  | 

### Return type

[**BranchesResponse**](BranchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

