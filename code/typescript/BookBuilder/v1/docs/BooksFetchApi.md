# bookbuilder.BooksFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadBook**](BooksFetchApi.md#downloadBook) | **GET** /download-api-book-aws/{book_id} | Retrieves book in PDF format
[**getBookList**](BooksFetchApi.md#getBookList) | **GET** /book-list | Check out the books that are in the book library



## downloadBook

> EnableBookDownload downloadBook(bookId)

Retrieves book in PDF format

This endpoint uses the BookId returned from any of the request above. Returns the URL to load the book for the book ID requested. The URL will be in JSON format, the final book will be in PDF format. &lt;br&gt;&lt;br&gt; NOTE -- The execution of this endpoint requires an extra step within the developer portal due to authentication limitations. When using the actual API, a successful response for this endpoint will be the PDF book rather than the URL to the PDF. &lt;br&gt;&lt;br&gt;&lt;b&gt;&lt;i&gt;The actual endpoint is &lt;/b&gt;&lt;font color&#x3D;blue&gt;https://api.factset.com/book-builder-api/v1/download-api-book/{book_id}&lt;/font&gt;&lt;/i&gt;

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BooksFetchApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new BooksFetchApi();
const bookId = 20200331093828132; // String | A string representing the unique ID for a specific book. This ID must be provided in the URL path.

// Call api endpoint
apiInstance.downloadBook(bookId).then(
  data => {

      // data is a responsewrapper: DownloadBookResponseWrapper
      switch (data.statusCode) {

          case 200:
             // EnableBookDownload
             console.log(data.getResponse200());
             break;

          case 202:
             // [BookProcessingResponseItem]
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookId** | **String**| A string representing the unique ID for a specific book. This ID must be provided in the URL path. | 

### Return type

[**EnableBookDownload**](EnableBookDownload.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBookList

> [BookInfo] getBookList()

Check out the books that are in the book library

Retrieves the list of books that were previously created and are available in the client&#39;s book library

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, BooksFetchApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new BooksFetchApi();

// Call api endpoint
apiInstance.getBookList().then(
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

[**[BookInfo]**](BookInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

