# factsetownership.TransactionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipInsiderTransactions**](TransactionsApi.md#getOwnershipInsiderTransactions) | **GET** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**getOwnershipInstitutionalTransactions**](TransactionsApi.md#getOwnershipInstitutionalTransactions) | **GET** /factset-ownership/v1/transactions/institutional | Get institutional transaction details for a list of requested identifiers.
[**postOwnershipInsiderTransactions**](TransactionsApi.md#postOwnershipInsiderTransactions) | **POST** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**postOwnershipInstituionalTransactions**](TransactionsApi.md#postOwnershipInstituionalTransactions) | **POST** /factset-ownership/v1/transactions/institutional | Gets institutional transaction details for a list of requested identifiers.



## getOwnershipInsiderTransactions

> InsiderTransactionsResponse getOwnershipInsiderTransactions(ids, startDate, endDate, opts)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetownership');
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
const ids = ["TSLA-US"]; // [String] | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
const startDate = 2020-06-30; // Date | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
const endDate = 2021-06-30; // Date | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
const opts = {
  'transactionType': "'A'", // String | Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** = All Transaction Types - returns all available transaction types.   * **P** = Open Market Purchases - shares on the open market.   * **S** =  Open Market Sales - selling shares on the open market.   * **PS** = Open Market Purchases & Sales - buying and selling shares on the open market.   * **O** = Options Exercised - executing stock options to acquire shares.   * **M** = Other Transactions - any other types of equity-related actions not covered above. 
  'rowExclusion': "'DB'", // String | Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** =  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** = Blank Transaction Types - excludes only blank transaction types.   * **N** =   None - includes all transaction types without exclusion. 
  'currency': USD // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
};

// Call api endpoint
apiInstance.getOwnershipInsiderTransactions(ids, startDate, endDate, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. | 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **transactionType** | **String**| Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  | [optional] [default to &#39;A&#39;]
 **rowExclusion** | **String**| Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  | [optional] [default to &#39;DB&#39;]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &#39;LOCAL&#39;]

### Return type

[**InsiderTransactionsResponse**](InsiderTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOwnershipInstitutionalTransactions

> InstitutionalTransactionsResponse getOwnershipInstitutionalTransactions(ids, startDate, endDate, opts)

Get institutional transaction details for a list of requested identifiers.

Get institutional transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetownership');
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
const ids = ["TSLA-US"]; // [String] | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
const startDate = 2020-06-30; // Date | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
const endDate = 2021-06-30; // Date | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
const opts = {
  'currency': USD, // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
  'frequency': "'M'", // String | Controls the display frequency of the data returned.   * **M** = Monthly, based on the last trading day of the month.   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date. 
  'topNHolders': "'25'", // String | Specifies the number of top holders whose data is returned.   * **ALL** = All holders   * **5** = Top 5 Institutional Holders   * **10** = Top 10 Institutional Holders   * **25** = Top 25 Institutional Holders   * **50** = Top 50 Institutional Holders   * **100** = Top 100 Institutional Holders 
  'holderType': "'F'" // String | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners 
};

// Call api endpoint
apiInstance.getOwnershipInstitutionalTransactions(ids, startDate, endDate, opts).then(
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
 **ids** | [**[String]**](String.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. | 
 **startDate** | **Date**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **Date**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  | 
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] [default to &#39;LOCAL&#39;]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] [default to &#39;M&#39;]
 **topNHolders** | **String**| Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  | [optional] [default to &#39;25&#39;]
 **holderType** | **String**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] [default to &#39;F&#39;]

### Return type

[**InstitutionalTransactionsResponse**](InstitutionalTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postOwnershipInsiderTransactions

> InsiderTransactionsResponse postOwnershipInsiderTransactions(insiderTransactionsRequest)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetownership');
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
const insiderTransactionsRequest = new factsetownership.InsiderTransactionsRequest(); // InsiderTransactionsRequest | Requesting Insider Transaction Details

// Call api endpoint
apiInstance.postOwnershipInsiderTransactions(insiderTransactionsRequest).then(
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
 **insiderTransactionsRequest** | [**InsiderTransactionsRequest**](InsiderTransactionsRequest.md)| Requesting Insider Transaction Details | 

### Return type

[**InsiderTransactionsResponse**](InsiderTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postOwnershipInstituionalTransactions

> InstitutionalTransactionsResponse postOwnershipInstituionalTransactions(institutionalTransactionsRequest)

Gets institutional transaction details for a list of requested identifiers.

Gets institutional transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TransactionsApi } = require('@factset/sdk-factsetownership');
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
const institutionalTransactionsRequest = new factsetownership.InstitutionalTransactionsRequest(); // InstitutionalTransactionsRequest | Requesting Institutional Transaction Details

// Call api endpoint
apiInstance.postOwnershipInstituionalTransactions(institutionalTransactionsRequest).then(
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
 **institutionalTransactionsRequest** | [**InstitutionalTransactionsRequest**](InstitutionalTransactionsRequest.md)| Requesting Institutional Transaction Details | 

### Return type

[**InstitutionalTransactionsResponse**](InstitutionalTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

