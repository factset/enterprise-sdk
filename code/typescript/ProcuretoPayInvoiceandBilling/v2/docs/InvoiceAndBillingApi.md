# procuretopayinvoiceandbilling.InvoiceAndBillingApi

All URIs are relative to *https://api.factset.com/procure-to-pay/invoice-and-billing/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadInvoice**](InvoiceAndBillingApi.md#downloadInvoice) | **GET** /invoices/{id}/download | Get a PDF of the provided invoiceId
[**fitsReport**](InvoiceAndBillingApi.md#fitsReport) | **GET** /invoices/{id}/fits-report | Get FITS report
[**invoiceDetails**](InvoiceAndBillingApi.md#invoiceDetails) | **GET** /invoices/{id} | Get invoice details
[**listAccounts**](InvoiceAndBillingApi.md#listAccounts) | **GET** /accounts | Returns a list of available accounts



## downloadInvoice

> File downloadInvoice(id)

Get a PDF of the provided invoiceId

Returns and downloads .PDF invoice by provided invoiceId. &lt;b&gt;InvoiceId&lt;/b&gt; is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

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
const id = AB2C2503; // String | Concatenation of AccountID and Date as YYMM

// Call api endpoint
apiInstance.downloadInvoice(id).then(
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
 **id** | **String**| Concatenation of AccountID and Date as YYMM | 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## fitsReport

> ProductGroups fitsReport(id)

Get FITS report

Returns machine readable FITS report by provided fitsId. &lt;b&gt;fitsId&lt;/b&gt; is determined by concatenating the AccountId and 2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the fitsId would be: AB2C2312.         All prices in the report are provided without currency information. For currency details, please refer to the &#39;/invoices/{id}&#39; endpoint.

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
const id = AB2C2503; // String | Concatenation of AccountID and Date as YYMM

// Call api endpoint
apiInstance.fitsReport(id).then(
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
 **id** | **String**| Concatenation of AccountID and Date as YYMM | 

### Return type

[**ProductGroups**](ProductGroups.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## invoiceDetails

> Invoice invoiceDetails(id)

Get invoice details

Returns a machine readable invoice report by provided invoiceId. &lt;b&gt;InvoiceId&lt;/b&gt; is determined by concatenating the AccountId and  2-Digit date, representing year and 2-Digit month. E.G. For the December 2023 Invoice the invoiceId would be: AB2C2312

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
const id = AB2C2503; // String | Concatenation of AccountID and Date as YYMM

// Call api endpoint
apiInstance.invoiceDetails(id).then(
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
 **id** | **String**| Concatenation of AccountID and Date as YYMM | 

### Return type

[**Invoice**](Invoice.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listAccounts

> Accounts listAccounts()

Returns a list of available accounts

Returns a list of accounts containing information such as AccountName and AccountId.

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
apiInstance.listAccounts().then(
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

[**Accounts**](Accounts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

