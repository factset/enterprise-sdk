# bookbuilder.BooksCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBook**](BooksCreationApi.md#createBook) | **POST** /create-book | Kicks off request to create a book with reports of your choice
[**createBookFromTemplate**](BooksCreationApi.md#createBookFromTemplate) | **POST** /create-book-from-template | Kicks off request to create a book with template
[**getAvailableReports**](BooksCreationApi.md#getAvailableReports) | **GET** /available-report/{ticker} | This endpoint retrieves all available sections and reports based on a ticker.



## createBook

> EnableBookInfo createBook(createBookPostRequest)

Kicks off request to create a book with reports of your choice

This end point retrieves book name and book_id for the PDF book you create. All the book options such as name of the book, ticker, pagination options, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BooksCreationApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new BooksCreationApi();
const createBookPostRequest = {"book_name":"Company Book for FDS","ticker":"FDS-US","pagination":{"cover":true,"divider":true,"toc":true,"footer":true,"timestamp":false},"content":[{"section_id":"COMPANY_OVERVIEW","reports":["COMPANY_SNAPSHOT_IB","COMPANY_SNAPSHOT_IM","ENTITY_STRUCTURE"]}]}; // CreateBookPostRequest | 

// Call api endpoint
apiInstance.createBook(createBookPostRequest).then(
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
 **createBookPostRequest** | [**CreateBookPostRequest**](CreateBookPostRequest.md)|  | 

### Return type

[**EnableBookInfo**](EnableBookInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createBookFromTemplate

> EnableBookInfoFromTemplate createBookFromTemplate(createBookFromTemplatePostRequest)

Kicks off request to create a book with template

This endpoint retrieves book status, book name, and book ID for ticker requested in JSON format. This end-point excepts ticker and template_id as inputs. If the template_id input is not used, a book will be created with FactSet&#39;s default template.&lt;/br&gt;&lt;/br&gt;Please try out the below template ids to quickly get the FactSet curated books&lt;/br&gt;&lt;/br&gt;Company Quick Book - &lt;b&gt;g_20210415065838185&lt;/b&gt;&lt;/br&gt;Post-Earnings Call - &lt;b&gt;g_20210415070044785&lt;/b&gt; &lt;/br&gt;Public Information Book(PIB) - &lt;b&gt;g_20210415070353151&lt;/b&gt;&lt;/br&gt;&lt;/br&gt; Take a look at the example books attached under API documentation below.&lt;/br&gt;&lt;/br&gt;If you are scheduling Post Earnings Call curated book, please note that in contains Corrected Transcript that takes a little while to be available.&lt;/br&gt; &lt;/br&gt;Once a Raw Transcript is published, FactSet&#39;s editors review the call to produce a Corrected Transcript. They listen to the entire audio file again to confirm that all of the terms and numbers are correctly transcribed. FactSet aims to publish a Corrected Transcript within six times the length of the event, measured from the beginning of the event. That means for a typical one-hour call, FactSet will produce a Corrected Transcript within approximately five hours of the call&#39;s completion. Visit [OA 13208](https://my.apps.factset.com/oa/pages/13208)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BooksCreationApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new BooksCreationApi();
const createBookFromTemplatePostRequest = {"ticker":"FDS-US","template_id":"g_20210415065838185"}; // CreateBookFromTemplatePostRequest | 

// Call api endpoint
apiInstance.createBookFromTemplate(createBookFromTemplatePostRequest).then(
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
 **createBookFromTemplatePostRequest** | [**CreateBookFromTemplatePostRequest**](CreateBookFromTemplatePostRequest.md)|  | 

### Return type

[**EnableBookInfoFromTemplate**](EnableBookInfoFromTemplate.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getAvailableReports

> AvailableReportsList getAvailableReports(ticker)

This endpoint retrieves all available sections and reports based on a ticker.

This endpoint retrieves all available sections and reports for a specified ticker. The only parameter required is the ticker.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BooksCreationApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new BooksCreationApi();
const ticker = APPL-US; // String | A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path.

// Call api endpoint
apiInstance.getAvailableReports(ticker).then(
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
 **ticker** | **String**| A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path. | 

### Return type

[**AvailableReportsList**](AvailableReportsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

