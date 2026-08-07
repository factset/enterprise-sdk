# factsetbanks.FinancialsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancials**](FinancialsApi.md#getFinancials) | **POST** /financials | Returns bank financial statement data



## getFinancials

> FinancialsResponse getFinancials(financialsRequest)

Returns bank financial statement data

Returns regulatory financial statements for banks and financial institutions. Use the &#x60;coverage&#x60; field to specify the data source:  * **US** — US banks, thrifts, and depository institutions (FFIEC/FDIC/Federal Reserve sources). Covers 11,000+ bank holding companies (forms FR Y-9C/SP/LP/15) and 10,000+ banking institutions (FFIEC 031/041/051/101/102), with history back to 1991 for BHCs and 2002 for institutions. Includes demographics (charter class, specialization, established and deposit-insurance dates) and 3,000+ metrics covering profitability, capital adequacy (Basel III), loan/deposit composition, asset quality, yields, and funding costs. Also includes industry aggregates for 800+ US banking institutions with annual, quarterly, LTM, and YTD data since 2010. * **CANADA** — Canadian banks regulated by OSFI. 148+ institutions; 800+ data items; history since 2017. Balance sheet data is updated monthly; supplementary reports (Capital Components, Credit Losses, Derivative Contracts, Foreign Bank Branch, Income Statement) are updated quarterly. * **AUSTRALIA** — Australian banks regulated by APRA. 100+ institutions, interim-period balance sheet data; LTM history since 2002; 30+ data items. * **CREDIT_UNION** — US credit unions regulated by NCUA. 5,800+ credit unions, quarterly data since 2017; 2,400+ data items.  Find available metrics via [&#x60;/metrics&#x60;](#operation/getMetrics) with:  * **category**: &#x60;FINANCIALS&#x60; * **subcategory**: &#x60;US&#x60;, &#x60;CANADA&#x60;, &#x60;AUSTRALIA&#x60;, &#x60;CREDIT_UNION&#x60;, &#x60;INDUSTRY&#x60; 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, FinancialsApi } = require('@factset/sdk-factsetbanks');
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

const apiInstance = new FinancialsApi();
const financialsRequest = new factsetbanks.FinancialsRequest(); // FinancialsRequest | 

// Call api endpoint
apiInstance.getFinancials(financialsRequest).then(
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
 **financialsRequest** | [**FinancialsRequest**](FinancialsRequest.md)|  | 

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

