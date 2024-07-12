# idlookup.FactSetIDLookupApi

All URIs are relative to *https://api.factset.com/idsearch/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**helper**](FactSetIDLookupApi.md#helper) | **GET** /metadata/fields/list-by-dataset | Helper endpoint offering a list of supported fields and values to filter a requested dataset.
[**search**](FactSetIDLookupApi.md#search) | **POST** /lookup | Search functionality to return tickers, company names, and unique identifiers for FactSet data.



## helper

> HelperEndpoint helper(dataset)

Helper endpoint offering a list of supported fields and values to filter a requested dataset.

By querying this helper endpoint, users can retrieve a comprehensive list of supported fields, each associated with its permissible values. This functionality enhances the usability of the API by empowering users to construct precise queries tailored to their requirements when accessing the requested dataset. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetIDLookupApi } = require('@factset/sdk-idlookup');
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

const apiInstance = new FactSetIDLookupApi();
const dataset = "dataset_example"; // String | Type of dataset.

// Call api endpoint
apiInstance.helper(dataset).then(
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
 **dataset** | **String**| Type of dataset. | 

### Return type

[**HelperEndpoint**](HelperEndpoint.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search

> LookupResponse search(lookupRequest)

Search functionality to return tickers, company names, and unique identifiers for FactSet data.

This functionality enables users to input search queries, such as company names or keywords, and receive results containing matching entities along with their associated tickers and unique identifiers.   Essentially, it provides a streamlined means of locating specific data points within the FactSet database, facilitating the efficient retrieval of essential information related to companies or financial instruments.  The dataset names provided in the table below can be used in the request body.  | Dataset Name                | Dataset Description                 | ID Type           | ID Example   | |-----------------------------|-------------------------------------|-------------------|--------------| | *&#x60;bankLoans&#x60;*               | Bank Loans                          | symbol            | LX056750     | | *&#x60;commodities&#x60;*             | Commodities                         | symbol            | DUBAIM-FDS   | | *&#x60;cepBonds&#x60;*                | Continuous Evaluated Pricing        | tickerExchange    | N3ZWW5.FI-CEP| | *&#x60;countries&#x60;*               | Countries                           | symbol            | CC_MA        | | *&#x60;deals&#x60;*                   | Deals                               | symbol            | 4161715      | | *&#x60;economicReports&#x60;*             | Economic Reports                    | symbol            | USKEY-ECON   | | *&#x60;economicSeries&#x60;*          | Economic Series                     | symbol            | EUZ.GDPR     | | *&#x60;equities&#x60;*                | Equities                            | tickerRegion      | AAPL-US      | | *&#x60;equitiesRealTime&#x60;*        | Equities RealTime                   | tickerExchange    | M-BKK        | | *&#x60;etfs&#x60;*                    | ETFs                                | tickerRegion      | ACWI-US      | | *&#x60;etfsRealTime&#x60;*            | ETFs RealTime                       | symbol            | JPNA | *&#x60;exchangeRatesRealTime&#x60;*   | Exchange Rates RealTime             | symbol            | AUDUSD-FX1   | | *&#x60;bonds&#x60;*                   | Fixed Income                        | symbol            | XS2027359756 | | *&#x60;forex&#x60;*                   | Foreign Exchange                    | symbol            | USDARS       | | *&#x60;futures&#x60;*                 | Futures (continuous)                | symbol            | AP00-SFE     | | *&#x60;indices&#x60;*                 | Indices                             | symbol            | 186745       | | *&#x60;indicesRealTime&#x60;*         | Indices RealTime                    | symbol            | BB3MUS.A-PSE | | *&#x60;industries&#x60;*              | Industries                          | symbol            | FI1225R1     | | *&#x60;markitLoans&#x60;*             | Markit Loans                        | symbol            | LX111044-USA | | *&#x60;mutualFunds&#x60;*             | Mutual Funds                        | tickerRegion      | AMECX-US     | | *&#x60;mutualFundsRealTime&#x60;*     | Mutual Funds RealTime               | symbol            | 015414       | | *&#x60;ownershipHolders&#x60;*        | Ownership Holders                   | symbol            | F5102330     | | *&#x60;people&#x60;*                  | People                              | entityId          | 065SLB-E     | | *&#x60;privateCompanies&#x60;*        | Private Companies                   | entityId          | 0CBD2D-E     | | *&#x60;pevcFirms&#x60;*               | Private Equity/Venture Capital Firms| entityId          | 000BKX-E     | | *&#x60;pevcFunds&#x60;*               | Private Equity/Venture Capital Funds| entityId          | 0WCD0X-E     | | *&#x60;regions&#x60;*                 | Region                              | symbol            | RG_AMER      | | *&#x60;yields&#x60;*                  | Yields                              | symbol            | TRYAU10Y-FDS | | *&#x60;options&#x60;*                 | options                             | tickerExchange           | A#P1924C100000-USA| 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FactSetIDLookupApi } = require('@factset/sdk-idlookup');
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

const apiInstance = new FactSetIDLookupApi();
const lookupRequest = new idlookup.LookupRequest(); // LookupRequest | Request body to lookup any FactSet identifiers.

// Call api endpoint
apiInstance.search(lookupRequest).then(
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
 **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Request body to lookup any FactSet identifiers. | 

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

