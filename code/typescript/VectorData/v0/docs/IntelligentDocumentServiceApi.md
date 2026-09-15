# vectordata.IntelligentDocumentServiceApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdsDocumentUpload**](IntelligentDocumentServiceApi.md#createIdsDocumentUpload) | **POST** /documents/register | Register a document and receive a presigned upload URL
[**getIdsDocumentDownload**](IntelligentDocumentServiceApi.md#getIdsDocumentDownload) | **POST** /documents/download | Get a presigned URL to download processed document output.
[**getIdsDocumentStatus**](IntelligentDocumentServiceApi.md#getIdsDocumentStatus) | **POST** /documents/status | Retrieve ingestion status for one or more documents.
[**listAllIdsDocuments**](IntelligentDocumentServiceApi.md#listAllIdsDocuments) | **GET** /documents/list | List all uploaded documents
[**searchIdsDocuments**](IntelligentDocumentServiceApi.md#searchIdsDocuments) | **POST** /documents/search | Semantically search uploaded documents



## createIdsDocumentUpload

> IdsDocumentUploadResponse createIdsDocumentUpload(idsDocumentUploadRequest)

Register a document and receive a presigned upload URL

Registers a document for Intelligent Document Service ingestion and returns a document ID plus a short-lived presigned HTTPS URL. PUT the file to that URL, then poll &#x60;/documents/status&#x60; until the document reaches a terminal state (&#x60;success&#x60; or &#x60;failed&#x60;). Supported file types include Pdf, Text, Html, Md and Xml.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IntelligentDocumentServiceApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new IntelligentDocumentServiceApi();
const idsDocumentUploadRequest = new vectordata.IdsDocumentUploadRequest(); // IdsDocumentUploadRequest | Document registration request.

// Call api endpoint
apiInstance.createIdsDocumentUpload(idsDocumentUploadRequest).then(
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
 **idsDocumentUploadRequest** | [**IdsDocumentUploadRequest**](IdsDocumentUploadRequest.md)| Document registration request. | 

### Return type

[**IdsDocumentUploadResponse**](IdsDocumentUploadResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getIdsDocumentDownload

> IdsDocumentDownloadResponse getIdsDocumentDownload(idsDocumentDownloadRequest)

Get a presigned URL to download processed document output.

Returns a short-lived presigned HTTPS URL for each requested document so the client can download the processed output JSON. Accepts one or more &#x60;documentIDs&#x60;. Available only when a document status is &#x60;Success&#x60; — returns &#x60;422&#x60; if status is not &#x60;Success&#x60;, and &#x60;202&#x60; if the document is still inprogress (&#x60;AwaitingUpload&#x60; or &#x60;Processing&#x60;). Prefer polling &#x60;/documents/status&#x60; until terminal before calling this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IntelligentDocumentServiceApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new IntelligentDocumentServiceApi();
const idsDocumentDownloadRequest = new vectordata.IdsDocumentDownloadRequest(); // IdsDocumentDownloadRequest | Document download request.

// Call api endpoint
apiInstance.getIdsDocumentDownload(idsDocumentDownloadRequest).then(
  data => {

      // data is a responsewrapper: GetIdsDocumentDownloadResponseWrapper
      switch (data.statusCode) {

          case 200:
             // IdsDocumentDownloadResponse
             console.log(data.getResponse200());
             break;

          case 202:
             // IdsDocumentStatusResponse
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
 **idsDocumentDownloadRequest** | [**IdsDocumentDownloadRequest**](IdsDocumentDownloadRequest.md)| Document download request. | 

### Return type

[**IdsDocumentDownloadResponse**](IdsDocumentDownloadResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getIdsDocumentStatus

> IdsDocumentStatusResponse getIdsDocumentStatus(idsDocumentStatusRequest)

Retrieve ingestion status for one or more documents.

Returns the current lifecycle state for each requested document ID, including timestamps and any pipeline failure details. Accepts one or more &#x60;documentIDs&#x60;. Returns &#x60;201&#x60; when all requested documents are in a terminal state (&#x60;Success&#x60;or &#x60;Failed&#x60;), and &#x60;202&#x60; while any are still in progress (&#x60;AwaitingUpload&#x60; or&#x60;Processing&#x60;). Poll until a &#x60;201&#x60; is received before calling&#x60;/documents/download&#x60; or &#x60;/documents/search&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IntelligentDocumentServiceApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new IntelligentDocumentServiceApi();
const idsDocumentStatusRequest = new vectordata.IdsDocumentStatusRequest(); // IdsDocumentStatusRequest | Document status request.

// Call api endpoint
apiInstance.getIdsDocumentStatus(idsDocumentStatusRequest).then(
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
 **idsDocumentStatusRequest** | [**IdsDocumentStatusRequest**](IdsDocumentStatusRequest.md)| Document status request. | 

### Return type

[**IdsDocumentStatusResponse**](IdsDocumentStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## listAllIdsDocuments

> IdsDocumentsListResponse listAllIdsDocuments(opts)

List all uploaded documents

Returns a paginated list of all documents uploaded by the authenticated tenant.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IntelligentDocumentServiceApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new IntelligentDocumentServiceApi();
const opts = {
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Page number of the results to return. 
};

// Call api endpoint
apiInstance.listAllIdsDocuments(opts).then(
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
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 10]
 **paginationOffset** | **Number**| Page number of the results to return.  | [optional] [default to 0]

### Return type

[**IdsDocumentsListResponse**](IdsDocumentsListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## searchIdsDocuments

> IdsDocumentSearchResponse searchIdsDocuments(idsDocumentSearchRequest)

Semantically search uploaded documents

Performs natural-language semantic search across documents ingested through the Intelligent Document Service and returns matching chunks ranked by similarity score. Requires a &#x60;query&#x60; and one or more &#x60;sources&#x60;. Optionally restrict results to specific &#x60;documentIDs&#x60;. Supports offset pagination and sorting by &#x60;SimilarityScore&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, IntelligentDocumentServiceApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new IntelligentDocumentServiceApi();
const idsDocumentSearchRequest = new vectordata.IdsDocumentSearchRequest(); // IdsDocumentSearchRequest | Document search request.

// Call api endpoint
apiInstance.searchIdsDocuments(idsDocumentSearchRequest).then(
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
 **idsDocumentSearchRequest** | [**IdsDocumentSearchRequest**](IdsDocumentSearchRequest.md)| Document search request. | 

### Return type

[**IdsDocumentSearchResponse**](IdsDocumentSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

