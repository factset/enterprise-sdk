# factsetfunds.TaxesFeesAndRisksApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundsCostsFees**](TaxesFeesAndRisksApi.md#getFundsCostsFees) | **GET** /costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.
[**getFundsCostsFeesForList**](TaxesFeesAndRisksApi.md#getFundsCostsFeesForList) | **POST** /costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of IDs.
[**getTaxesAndRisks**](TaxesFeesAndRisksApi.md#getTaxesAndRisks) | **GET** /taxes-and-risks | Get Regulatory/Tax, Tax Exposure, and Risk Measures
[**getTaxesAndRisksForList**](TaxesFeesAndRisksApi.md#getTaxesAndRisksForList) | **POST** /taxes-and-risks | Get Regulatory/Tax, Tax Exposure, and Risk Measures.



## getFundsCostsFees

> CostsFeesResponse getFundsCostsFees(ids, opts)

Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.

Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. This subcategory includes management fees, 12b-1 fees, expense ratios, and several other data items. The value for each specified share class is expressed as a percentage of the AUM.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TaxesFeesAndRisksApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new TaxesFeesAndRisksApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'currency': USD, // String | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)
  'date': 2025-01-01 // Date | The date for costs and fees in YYYY-MM-DD format. Future dates (T+1) are not accepted in this endpoint.
};

// Call api endpoint
apiInstance.getFundsCostsFees(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **currency** | **String**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] [default to &#39;USD&#39;]
 **date** | **Date**| The date for costs and fees in YYYY-MM-DD format. Future dates (T+1) are not accepted in this endpoint. | [optional] 

### Return type

[**CostsFeesResponse**](CostsFeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getFundsCostsFeesForList

> CostsFeesResponse getFundsCostsFeesForList(costsFeesRequest)

Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of IDs.

Fetch the Fund&#39;s Costs, Investment minimums and Risk, and Fees. Data Items include Expense Ratios, investment minimums and maximums, swing prices, entry and exit expenses, and more.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TaxesFeesAndRisksApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new TaxesFeesAndRisksApi();
const costsFeesRequest = new factsetfunds.CostsFeesRequest(); // CostsFeesRequest | The Costs and Fees request body, allowing the user to specify a list of IDs.

// Call api endpoint
apiInstance.getFundsCostsFeesForList(costsFeesRequest).then(
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
 **costsFeesRequest** | [**CostsFeesRequest**](CostsFeesRequest.md)| The Costs and Fees request body, allowing the user to specify a list of IDs. | 

### Return type

[**CostsFeesResponse**](CostsFeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getTaxesAndRisks

> TaxesAndRisksResponse getTaxesAndRisks(ids, opts)

Get Regulatory/Tax, Tax Exposure, and Risk Measures

Returns tax and risk information (regulatory/tax compliance, tax exposure, or risk measures) based on the &#x60;taxItemsType&#x60; parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TaxesFeesAndRisksApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new TaxesFeesAndRisksApi();
const ids = ["MABAX-US"]; // [String] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
const opts = {
  'taxItemsType': new factsetfunds.TaxItemsType() // TaxItemsType | Returns type of tax and risk information.
};

// Call api endpoint
apiInstance.getTaxesAndRisks(ids, opts).then(
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
 **ids** | [**[String]**](String.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **taxItemsType** | [**TaxItemsType**](.md)| Returns type of tax and risk information. | [optional] 

### Return type

[**TaxesAndRisksResponse**](TaxesAndRisksResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTaxesAndRisksForList

> TaxesAndRisksResponse getTaxesAndRisksForList(taxesAndRisksRequest)

Get Regulatory/Tax, Tax Exposure, and Risk Measures.

Returns tax and risk information for a large list of IDs based on the &#x60;taxItemsType&#x60; parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TaxesFeesAndRisksApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new TaxesFeesAndRisksApi();
const taxesAndRisksRequest = new factsetfunds.TaxesAndRisksRequest(); // TaxesAndRisksRequest | 

// Call api endpoint
apiInstance.getTaxesAndRisksForList(taxesAndRisksRequest).then(
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
 **taxesAndRisksRequest** | [**TaxesAndRisksRequest**](TaxesAndRisksRequest.md)|  | 

### Return type

[**TaxesAndRisksResponse**](TaxesAndRisksResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

