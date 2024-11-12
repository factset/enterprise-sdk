# procuretopayinvoiceandbilling.InvoiceAndBillingApi

All URIs are relative to *https://api-sandbox.factset.com/procuretopay/invoice-and-billing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFitsReportGet**](InvoiceAndBillingApi.md#getFitsReportGet) | **GET** /getFitsReport | Returns Fits report by given FITSID
[**getInvoiceGet**](InvoiceAndBillingApi.md#getInvoiceGet) | **GET** /getInvoice | Returns PDF of specific invoice
[**invoiceDetailsGet**](InvoiceAndBillingApi.md#invoiceDetailsGet) | **GET** /invoiceDetails | Returns details on specific invoice.
[**listInvoicesGet**](InvoiceAndBillingApi.md#listInvoicesGet) | **GET** /listInvoices | Returns all available invoices



## getFitsReportGet

> [Object] getFitsReportGet(fitsID)

Returns Fits report by given FITSID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InvoiceAndBillingApi } = require('@factset/sdk-procuretopayinvoiceandbilling');
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

const apiInstance = new InvoiceAndBillingApi();
const fitsID = AB2C2101; // String | FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint.

// Call api endpoint
apiInstance.getFitsReportGet(fitsID).then(
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
 **fitsID** | **String**| FITSID can be determined by concatenating the AccountNumber + two-digit year (e.g 21 for 2021) and two-digit month (e.g. 01 for January). Available AccountNumbers are available from the /listInvoices endpoint. | 

### Return type

**[Object]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain


## getInvoiceGet

> File getInvoiceGet(invoiceId)

Returns PDF of specific invoice

A .PDF File

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InvoiceAndBillingApi } = require('@factset/sdk-procuretopayinvoiceandbilling');
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

const apiInstance = new InvoiceAndBillingApi();
const invoiceId = 11963874; // String | Invoice code you wish to download

// Call api endpoint
apiInstance.getInvoiceGet(invoiceId).then(
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
 **invoiceId** | **String**| Invoice code you wish to download | 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: appliction/pdf, application/json; charset=utf-8, text/plain


## invoiceDetailsGet

> InvoiceDetails invoiceDetailsGet(invoiceId)

Returns details on specific invoice.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InvoiceAndBillingApi } = require('@factset/sdk-procuretopayinvoiceandbilling');
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

const apiInstance = new InvoiceAndBillingApi();
const invoiceId = 11963874; // String | Invoice code to query. See /listInvoices endpoint for list of available invoices to query.

// Call api endpoint
apiInstance.invoiceDetailsGet(invoiceId).then(
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
 **invoiceId** | **String**| Invoice code to query. See /listInvoices endpoint for list of available invoices to query. | 

### Return type

[**InvoiceDetails**](InvoiceDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain


## listInvoicesGet

> [Object] listInvoicesGet()

Returns all available invoices

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, InvoiceAndBillingApi } = require('@factset/sdk-procuretopayinvoiceandbilling');
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

const apiInstance = new InvoiceAndBillingApi();

// Call api endpoint
apiInstance.listInvoicesGet().then(
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

This endpoint does not need any parameter.

### Return type

**[Object]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

