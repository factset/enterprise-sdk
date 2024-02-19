# analyticsdatastore.DocumentsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocumentsEndPoint**](DocumentsApi.md#getDocumentsEndPoint) | **POST** /analytics/pub-datastore/tag-search/v1/documents/search | Gets a list of Documents that a user has access to.
[**getProductTypes**](DocumentsApi.md#getProductTypes) | **POST** /analytics/pub-datastore/tag-search/v1/product-types/search | Gets a list of product types that a user has access to.
[**getSingleTagEndPoint**](DocumentsApi.md#getSingleTagEndPoint) | **GET** /analytics/pub-datastore/tag-search/v1/tags/{name} | Get a single tag definition based on its name
[**getTagValuesEndPoint**](DocumentsApi.md#getTagValuesEndPoint) | **POST** /analytics/pub-datastore/tag-search/v1/tags/{name}/values | Gets a list of tag values for the given name
[**getTagsEndPoint**](DocumentsApi.md#getTagsEndPoint) | **GET** /analytics/pub-datastore/tag-search/v1/tags | Gets a list of tag definitions for the user.



## getDocumentsEndPoint

> DocumentListResponse getDocumentsEndPoint(documentRequest)

Gets a list of Documents that a user has access to.

Retrieves metadata around documents stored in the Analytics Datastore Service. Each Document will have a &#39;url&#39; property which will act as a re-direct to the underlying document data    This end point supports pagination and filtering through the use of the request body listed below.    To discover what tags are available to filter on, see GET /tags and GET /tags/{name}/values to retrieve these filter values.    Similarly, to discover what product types are available to filter on, see POST /product-types/search to retrieve a list of product types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-analyticsdatastore');
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
const documentRequest = new analyticsdatastore.DocumentRequest(); // DocumentRequest | Example request of a filtered Documents search call

// Call api endpoint
apiInstance.getDocumentsEndPoint(documentRequest).then(
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
 **documentRequest** | [**DocumentRequest**](DocumentRequest.md)| Example request of a filtered Documents search call | 

### Return type

[**DocumentListResponse**](DocumentListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getProductTypes

> ProductTypeListResponse getProductTypes(tagFilterModel)

Gets a list of product types that a user has access to.

Retrieves a list of product types that have been specified across all documents the user has access to

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-analyticsdatastore');
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
const tagFilterModel = new analyticsdatastore.TagFilterModel(); // TagFilterModel | Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object.

// Call api endpoint
apiInstance.getProductTypes(tagFilterModel).then(
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
 **tagFilterModel** | [**TagFilterModel**](TagFilterModel.md)| Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. | 

### Return type

[**ProductTypeListResponse**](ProductTypeListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getSingleTagEndPoint

> TagResponse getSingleTagEndPoint(name)

Get a single tag definition based on its name

Retrieve a tag definition based on its name

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-analyticsdatastore');
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
const name = "name_example"; // String | The name of the tag

// Call api endpoint
apiInstance.getSingleTagEndPoint(name).then(
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
 **name** | **String**| The name of the tag | 

### Return type

[**TagResponse**](TagResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTagValuesEndPoint

> TagValuesListResponse getTagValuesEndPoint(name, tagFilterModel)

Gets a list of tag values for the given name

Returns a list of tag values depending on the name provided. Supports filtering on additional tag name value pairs, which operates as an &#39;AND&#39; where the Document must have the tag name specified in the path AND the filtered parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-analyticsdatastore');
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
const name = "name_example"; // String | The name of the tag
const tagFilterModel = new analyticsdatastore.TagFilterModel(); // TagFilterModel | Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object.

// Call api endpoint
apiInstance.getTagValuesEndPoint(name, tagFilterModel).then(
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
 **name** | **String**| The name of the tag | 
 **tagFilterModel** | [**TagFilterModel**](TagFilterModel.md)| Request body to apply when filtering on this end point. Pagination controls are applied through the pagination object and additional tag filters can be used by supplying the tag name and its value in the tags object. | 

### Return type

[**TagValuesListResponse**](TagValuesListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getTagsEndPoint

> TagListResponse getTagsEndPoint(opts)

Gets a list of tag definitions for the user.

Tag definitions consist of a name and a type. Use this end point to see a list of pre-existing tags that can be used to filter on the Documents end point.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, DocumentsApi } = require('@factset/sdk-analyticsdatastore');
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
  'paginationOffset': 0, // Number | The offset integer on where to begin paginating
  'paginationLimit': 50 // Number | The limit of records to return when paginating
};

// Call api endpoint
apiInstance.getTagsEndPoint(opts).then(
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
 **paginationOffset** | **Number**| The offset integer on where to begin paginating | [optional] [default to 0]
 **paginationLimit** | **Number**| The limit of records to return when paginating | [optional] [default to 50]

### Return type

[**TagListResponse**](TagListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

