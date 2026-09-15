# vectordata.VectorSearchApi

All URIs are relative to *https://api.factset.com/content/vector/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormTypes**](VectorSearchApi.md#getFormTypes) | **GET** /form-types | Returns the available form types
[**getVector**](VectorSearchApi.md#getVector) | **GET** /vector | Returns vector data and metadata for specified vector IDs
[**postSearch**](VectorSearchApi.md#postSearch) | **POST** /search | Perform semantic search and return ranked results with similarity scores
[**retrieveSources**](VectorSearchApi.md#retrieveSources) | **GET** /sources | Returns the available data sources



## getFormTypes

> FormTypesResponse getFormTypes()

Returns the available form types

Retrieves and delivers a comprehensive list of all available &#x60;formTypes&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VectorSearchApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new VectorSearchApi();

// Call api endpoint
apiInstance.getFormTypes().then(
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

[**FormTypesResponse**](FormTypesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getVector

> VectorResponse getVector(vectorId, opts)

Returns vector data and metadata for specified vector IDs

Retrieves the complete vector embedding and all associated metadata for one or more vector IDs. Optionally returns trimmed vectors (metadata only) when the trimmed parameter is set to true.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VectorSearchApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new VectorSearchApi();
const vectorId = ["0001493152-24-046748-1_0001493152-24-046748-1_text_236_0"]; // [String] | Unique identifier for a document
const opts = {
  'trimmed': false, // Boolean | If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response.
  'paginationLimit': 20, // Number | Number of results to return per page.
  'paginationOffset': 0 // Number | Page number of the results to return. 
};

// Call api endpoint
apiInstance.getVector(vectorId, opts).then(
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
 **vectorId** | [**[String]**](String.md)| Unique identifier for a document | 
 **trimmed** | **Boolean**| If true, returns metadata only without vector embeddings. If false, includes full vector embeddings in the response. | [optional] [default to false]
 **paginationLimit** | **Number**| Number of results to return per page. | [optional] [default to 10]
 **paginationOffset** | **Number**| Page number of the results to return.  | [optional] [default to 0]

### Return type

[**VectorResponse**](VectorResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postSearch

> SearchResponse postSearch(searchRequest)

Perform semantic search and return ranked results with similarity scores

Performs semantic search across vectorized financial documents and returns results ranked by similarity score. Supports filtering by themes (including ESG themes and search concepts), sentiment, form types, date ranges, and entity identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VectorSearchApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new VectorSearchApi();
const searchRequest = new vectordata.SearchRequest(); // SearchRequest | Input parameters for semantic search.

// Call api endpoint
apiInstance.postSearch(searchRequest).then(
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| Input parameters for semantic search. | 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## retrieveSources

> SourceResponseData retrieveSources(opts)

Returns the available data sources

Retrieves and delivers a comprehensive list of all available &#x60;sources&#x60;.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, VectorSearchApi } = require('@factset/sdk-vectordata');
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

const apiInstance = new VectorSearchApi();
const opts = {
  'entitledSources': false, // Boolean | If true, returns only entitled sources. If false, returns all the available sources.
  'type': ["null"] // [String] | Filters type of sources.
};

// Call api endpoint
apiInstance.retrieveSources(opts).then(
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
 **entitledSources** | **Boolean**| If true, returns only entitled sources. If false, returns all the available sources. | [optional] [default to false]
 **type** | [**[String]**](String.md)| Filters type of sources. | [optional] 

### Return type

[**SourceResponseData**](SourceResponseData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

