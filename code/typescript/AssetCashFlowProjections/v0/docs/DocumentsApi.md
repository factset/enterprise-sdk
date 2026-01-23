# assetcashflowprojections.DocumentsApi

All URIs are relative to *https://api.factset.com/analytics/asset-cash-flow-projections/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocumentDetails**](DocumentsApi.md#getDocumentDetails) | **GET** /documents/{documentPath} | Retrieve a document
[**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /documents | Gives all the ACFP documents in the given directory.
[**postDocument**](DocumentsApi.md#postDocument) | **POST** /documents | Create new document based on existing document - Save as
[**putDocument**](DocumentsApi.md#putDocument) | **PUT** /documents/{documentPath} | Update existing document - Save



## getDocumentDetails

> UpdateNewDocument getDocumentDetails(documentPath)

Retrieve a document

Provides information about the document settings.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-assetcashflowprojections');
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

const apiInstance = new DocumentsApi();
const documentPath = Client:/ACFP/Scenario_01; // String | Enter the path to existing document name

// Call api endpoint
apiInstance.getDocumentDetails(documentPath).then(
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
 **documentPath** | **String**| Enter the path to existing document name | 

### Return type

[**UpdateNewDocument**](UpdateNewDocument.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDocuments

> DocumentResponse getDocuments(directoryPath)

Gives all the ACFP documents in the given directory.

Provides the list of all documents in a specified directory

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-assetcashflowprojections');
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

const apiInstance = new DocumentsApi();
const directoryPath = Client:/ACFP; // String | The directory path to retrieve documents from.

// Call api endpoint
apiInstance.getDocuments(directoryPath).then(
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
 **directoryPath** | **String**| The directory path to retrieve documents from. | 

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postDocument

> postDocument(opts)

Create new document based on existing document - Save as

This will create a new document based on existing one.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-assetcashflowprojections');
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

const apiInstance = new DocumentsApi();
const opts = {
  'createNewDocument': {"data":{"existingDocumentName":"Client:/ACFP/OldTestScenario100","portfolios":["Client:/ACFP/PORTFOLIO1.OFDB","Client:/ACFP/PORTFOLIO2.ACTM"],"scenarios":["Client:Scenario1.CSV","Client:Scenario2.SCN"],"asOfDate":"2025-04-21","newDocumentName":"Client:/ACFP/NewTestScenario100"}} // CreateNewDocument | 
};

// Call api endpoint
apiInstance.postDocument(opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createNewDocument** | [**CreateNewDocument**](CreateNewDocument.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## putDocument

> putDocument(documentPath, opts)

Update existing document - Save

This will update existing document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-assetcashflowprojections');
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

const apiInstance = new DocumentsApi();
const documentPath = Client:/ACFP/Scenario_01; // String | Enter the path to existing document name
const opts = {
  'updateNewDocument': {"data":{"portfolios":["Client:/ACFP/PORTFOLIO1.OFDB","Client:/ACFP/PORTFOLIO2.ACTM"],"scenarios":["Client:Scenario1.CSV","Client:Scenario2.SCN"],"asOfDate":"2019-08-24"}} // UpdateNewDocument | 
};

// Call api endpoint
apiInstance.putDocument(documentPath, opts).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentPath** | **String**| Enter the path to existing document name | 
 **updateNewDocument** | [**UpdateNewDocument**](UpdateNewDocument.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

