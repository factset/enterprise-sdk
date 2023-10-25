# newsapifordigitalportals.NewsApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNewsArticleGet**](NewsApi.md#getNewsArticleGet) | **GET** /news/article/get | Details for a news article.
[**getNewsArticleTypeGet**](NewsApi.md#getNewsArticleTypeGet) | **GET** /news/article/type/get | Details for a news article type.
[**getNewsArticleTypeList**](NewsApi.md#getNewsArticleTypeList) | **GET** /news/article/type/list | List of news article types.
[**getNewsDistributorGet**](NewsApi.md#getNewsDistributorGet) | **GET** /news/distributor/get | Details of a distributor.
[**getNewsDistributorList**](NewsApi.md#getNewsDistributorList) | **GET** /news/distributor/list | List of distributors.
[**getNewsPublisherGet**](NewsApi.md#getNewsPublisherGet) | **GET** /news/publisher/get | Details of a publisher.
[**getNewsPublisherList**](NewsApi.md#getNewsPublisherList) | **GET** /news/publisher/list | List of publishers.
[**getNewsPublisherListByDistributor**](NewsApi.md#getNewsPublisherListByDistributor) | **GET** /news/publisher/listByDistributor | List of publishers provided by the given distributor.
[**postNewsArticleList**](NewsApi.md#postNewsArticleList) | **POST** /news/article/list | List of news articles.
[**postNewsArticleListByChain**](NewsApi.md#postNewsArticleListByChain) | **POST** /news/article/listByChain | List news articles of an article chain.
[**postNewsArticleListByIndex**](NewsApi.md#postNewsArticleListByIndex) | **POST** /news/article/listByIndex | News articles for instruments that are constituents of the given indices.
[**postNewsArticleListByInstrument**](NewsApi.md#postNewsArticleListByInstrument) | **POST** /news/article/listByInstrument | News articles for instruments.
[**postNewsArticleListByMediaKind**](NewsApi.md#postNewsArticleListByMediaKind) | **POST** /news/article/listByMediaKind | List news articles which contain media of specific media kinds.
[**postNewsArticleSearchByText**](NewsApi.md#postNewsArticleSearchByText) | **POST** /news/article/searchByText | Search for news articles using a fulltext search.
[**postNewsPublisherSearchByName**](NewsApi.md#postNewsPublisherSearchByName) | **POST** /news/publisher/searchByName | Search for publishers.



## getNewsArticleGet

> InlineResponse200 getNewsArticleGet(code, opts)

Details for a news article.

Details for a news article.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const code = "code_example"; // String | 
const opts = {
  'includeMedia': false, // Boolean | 
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getNewsArticleGet(code, opts).then(
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
 **code** | **String**|  | 
 **includeMedia** | **Boolean**|  | [optional] [default to false]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsArticleTypeGet

> InlineResponse2005 getNewsArticleTypeGet(id, opts)

Details for a news article type.

Details for a news article type.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getNewsArticleTypeGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsArticleTypeList

> InlineResponse2006 getNewsArticleTypeList(opts)

List of news article types.

List of news article types.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | 
};

// Call api endpoint
apiInstance.getNewsArticleTypeList(opts).then(
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
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsDistributorGet

> InlineResponse2007 getNewsDistributorGet(id, opts)

Details of a distributor.

Details of a distributor.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNewsDistributorGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsDistributorList

> InlineResponse2008 getNewsDistributorList(opts)

List of distributors.

List of distributors.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'ids': [null], // [Number] | 
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getNewsDistributorList(opts).then(
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
 **ids** | [**[Number]**](Number.md)|  | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsPublisherGet

> InlineResponse2009 getNewsPublisherGet(id, opts)

Details of a publisher.

Details of a publisher.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"] // [String] | Limit the attributes returned in the response to the specified set.
};

// Call api endpoint
apiInstance.getNewsPublisherGet(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsPublisherList

> InlineResponse20010 getNewsPublisherList(opts)

List of publishers.

List of publishers.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'ids': [null], // [Number] | 
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["null"], // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
  'paginationOffset': 0, // Number | Non-negative number of entries to skip, or 0 (default).
  'paginationLimit': 20 // Number | Non-negative maximum number of entries to return.
};

// Call api endpoint
apiInstance.getNewsPublisherList(opts).then(
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
 **ids** | [**[Number]**](Number.md)|  | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsPublisherListByDistributor

> InlineResponse20011 getNewsPublisherListByDistributor(id, opts)

List of publishers provided by the given distributor.

List of publishers provided by the given distributor.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const id = 3.4; // Number | 
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["null"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
};

// Call api endpoint
apiInstance.getNewsPublisherListByDistributor(id, opts).then(
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
 **id** | **Number**|  | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postNewsArticleList

> InlineResponse2001 postNewsArticleList(opts)

List of news articles.

List of news articles.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsArticleListRequest': new newsapifordigitalportals.PostNewsArticleListRequest() // PostNewsArticleListRequest | 
};

// Call api endpoint
apiInstance.postNewsArticleList(opts).then(
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
 **postNewsArticleListRequest** | [**PostNewsArticleListRequest**](PostNewsArticleListRequest.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByChain

> InlineResponse2002 postNewsArticleListByChain(opts)

List news articles of an article chain.

List news articles of an article chain.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsArticleListByChainRequest': new newsapifordigitalportals.PostNewsArticleListByChainRequest() // PostNewsArticleListByChainRequest | 
};

// Call api endpoint
apiInstance.postNewsArticleListByChain(opts).then(
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
 **postNewsArticleListByChainRequest** | [**PostNewsArticleListByChainRequest**](PostNewsArticleListByChainRequest.md)|  | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByIndex

> InlineResponse2003 postNewsArticleListByIndex(opts)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsArticleListByIndexRequest': new newsapifordigitalportals.PostNewsArticleListByIndexRequest() // PostNewsArticleListByIndexRequest | 
};

// Call api endpoint
apiInstance.postNewsArticleListByIndex(opts).then(
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
 **postNewsArticleListByIndexRequest** | [**PostNewsArticleListByIndexRequest**](PostNewsArticleListByIndexRequest.md)|  | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByInstrument

> InlineResponse2004 postNewsArticleListByInstrument(opts)

News articles for instruments.

News articles for instruments.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsArticleListByInstrumentRequest': new newsapifordigitalportals.PostNewsArticleListByInstrumentRequest() // PostNewsArticleListByInstrumentRequest | 
};

// Call api endpoint
apiInstance.postNewsArticleListByInstrument(opts).then(
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
 **postNewsArticleListByInstrumentRequest** | [**PostNewsArticleListByInstrumentRequest**](PostNewsArticleListByInstrumentRequest.md)|  | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByMediaKind

> InlineResponse2001 postNewsArticleListByMediaKind(opts)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsArticleListByMediaKindRequest': new newsapifordigitalportals.PostNewsArticleListByMediaKindRequest() // PostNewsArticleListByMediaKindRequest | 
};

// Call api endpoint
apiInstance.postNewsArticleListByMediaKind(opts).then(
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
 **postNewsArticleListByMediaKindRequest** | [**PostNewsArticleListByMediaKindRequest**](PostNewsArticleListByMediaKindRequest.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleSearchByText

> InlineResponse2001 postNewsArticleSearchByText(opts)

Search for news articles using a fulltext search.

Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \&quot;include\&quot; requires the criterion to evaluate to true, \&quot;exclude\&quot; requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsArticleSearchByTextRequest': new newsapifordigitalportals.PostNewsArticleSearchByTextRequest() // PostNewsArticleSearchByTextRequest | 
};

// Call api endpoint
apiInstance.postNewsArticleSearchByText(opts).then(
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
 **postNewsArticleSearchByTextRequest** | [**PostNewsArticleSearchByTextRequest**](PostNewsArticleSearchByTextRequest.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsPublisherSearchByName

> InlineResponse20011 postNewsPublisherSearchByName(opts)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-newsapifordigitalportals');
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

const apiInstance = new NewsApi();
const opts = {
  'postNewsPublisherSearchByNameRequest': new newsapifordigitalportals.PostNewsPublisherSearchByNameRequest() // PostNewsPublisherSearchByNameRequest | 
};

// Call api endpoint
apiInstance.postNewsPublisherSearchByName(opts).then(
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
 **postNewsPublisherSearchByNameRequest** | [**PostNewsPublisherSearchByNameRequest**](PostNewsPublisherSearchByNameRequest.md)|  | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

