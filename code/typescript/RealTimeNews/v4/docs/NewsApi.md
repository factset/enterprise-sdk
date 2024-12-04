# realtimenews.NewsApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNewsArticleGet**](NewsApi.md#getNewsArticleGet) | **GET** /news/article/get | Details for a news article.
[**getNewsArticleTypeGet**](NewsApi.md#getNewsArticleTypeGet) | **GET** /news/article/type/get | Details for a news article type.
[**getNewsArticleTypeList**](NewsApi.md#getNewsArticleTypeList) | **GET** /news/article/type/list | List of news article types.
[**getNewsDistributorGet**](NewsApi.md#getNewsDistributorGet) | **GET** /news/distributor/get | Details of a distributor.
[**getNewsDistributorList**](NewsApi.md#getNewsDistributorList) | **GET** /news/distributor/list | List of distributors.
[**getNewsPublisherGet**](NewsApi.md#getNewsPublisherGet) | **GET** /news/publisher/get | Details of a publisher.
[**getNewsPublisherList**](NewsApi.md#getNewsPublisherList) | **GET** /news/publisher/list | List of publishers.
[**getNewsPublisherListByDistributor**](NewsApi.md#getNewsPublisherListByDistributor) | **GET** /news/publisher/list-by-distributor | List of publishers provided by the given distributor.
[**postNewsArticleList**](NewsApi.md#postNewsArticleList) | **POST** /news/article/list | List of news articles.
[**postNewsArticleListByChain**](NewsApi.md#postNewsArticleListByChain) | **POST** /news/article/list-by-chain | List news articles of an article chain.
[**postNewsArticleListByIndex**](NewsApi.md#postNewsArticleListByIndex) | **POST** /news/article/list-by-index | News articles for instruments that are constituents of the given indices.
[**postNewsArticleListByInstrument**](NewsApi.md#postNewsArticleListByInstrument) | **POST** /news/article/list-by-instrument | News articles for instruments.
[**postNewsArticleListByMediaKind**](NewsApi.md#postNewsArticleListByMediaKind) | **POST** /news/article/list-by-media-kind | List news articles which contain media of specific media kinds.
[**postNewsArticleSearchByText**](NewsApi.md#postNewsArticleSearchByText) | **POST** /news/article/search-by-text | Search for news articles using a fulltext search.
[**postNewsPublisherSearchByName**](NewsApi.md#postNewsPublisherSearchByName) | **POST** /news/publisher/search-by-name | Search for publishers.



## getNewsArticleGet

> InlineResponse20043 getNewsArticleGet(code, opts)

Details for a news article.

Details for a news article.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const code = 1234567890FactSet; // String | Identifier of a news article.
const opts = {
  'includeMedia': true, // Boolean | If true, media references are included if available.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'metaLanguage': en // String | ISO 639-1 code of the language.
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
 **code** | **String**| Identifier of a news article. | 
 **includeMedia** | **Boolean**| If true, media references are included if available. | [optional] [default to false]
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsArticleTypeGet

> InlineResponse20050 getNewsArticleTypeGet(id, opts)

Details for a news article type.

Details for a news article type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const id = 3; // Number | Identifier of a news article type.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'metaLanguage': en // String | ISO 639-1 code of the language.
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
 **id** | **Number**| Identifier of a news article type. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsArticleTypeList

> InlineResponse20051 getNewsArticleTypeList(opts)

List of news article types.

List of news article types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
  'metaLanguage': en // String | ISO 639-1 code of the language.
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsDistributorGet

> InlineResponse20052 getNewsDistributorGet(id, opts)

Details of a distributor.

Details of a distributor.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const id = 1; // Number | Identifier of a distributor.
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
 **id** | **Number**| Identifier of a distributor. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsDistributorList

> InlineResponse20053 getNewsDistributorList(opts)

List of distributors.

List of distributors.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
  'ids': [2], // [Number] | Identifiers of distributors.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["-name"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
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
 **ids** | [**[Number]**](Number.md)| Identifiers of distributors. | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   | [optional] 

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsPublisherGet

> InlineResponse20054 getNewsPublisherGet(id, opts)

Details of a publisher.

Details of a publisher.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const id = 4; // Number | Identifier of a publisher.
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
 **id** | **Number**| Identifier of a publisher. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsPublisherList

> InlineResponse20055 getNewsPublisherList(opts)

List of publishers.

List of publishers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
  'ids': [2], // [Number] | Identifiers of publishers.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["name"], // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
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
 **ids** | [**[Number]**](Number.md)| Identifiers of publishers. | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   | [optional] 
 **paginationOffset** | **Number**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **Number**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getNewsPublisherListByDistributor

> InlineResponse20056 getNewsPublisherListByDistributor(id, opts)

List of publishers provided by the given distributor.

List of publishers provided by the given distributor.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const id = 3; // Number | Identifier of a distributor.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'sort': ["-name"] // [String] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
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
 **id** | **Number**| Identifier of a distributor. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**[String]**](String.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   | [optional] 

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postNewsArticleList

> InlineResponse20044 postNewsArticleList(opts)

List of news articles.

List of news articles.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
  'postNewsArticleListRequest': {"data":{"filter":{"range":{"start":"2024-01-01T00:00:00.000Z","end":"2024-12-24T18:00:00.000000Z"},"categories":{"ids":[5]},"regions":{"ids":[4]},"distributor":{"ids":[3]},"publisher":{"ids":[2]},"language":{"ids":[5]},"types":{"ids":[2]}}},"meta":{"attributes":[],"subscription":{"minimumInterval":4156},"pagination":{"cursor":"Lorem ipsum","limit":20}}} // PostNewsArticleListRequest | Request Body
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
 **postNewsArticleListRequest** | [**PostNewsArticleListRequest**](PostNewsArticleListRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByChain

> InlineResponse20045 postNewsArticleListByChain(postNewsArticleListByChainRequest)

List news articles of an article chain.

List news articles of an article chain.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const postNewsArticleListByChainRequest = {"data":{"id":"4004","filter":{"range":{"start":"2024-12-24T18:00:00.000000Z","end":"2024-01-01T00:00:00.000Z"}}},"meta":{"attributes":[],"subscription":{"minimumInterval":3401},"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostNewsArticleListByChainRequest | Request Body

// Call api endpoint
apiInstance.postNewsArticleListByChain(postNewsArticleListByChainRequest).then(
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
 **postNewsArticleListByChainRequest** | [**PostNewsArticleListByChainRequest**](PostNewsArticleListByChainRequest.md)| Request Body | 

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByIndex

> InlineResponse20046 postNewsArticleListByIndex(postNewsArticleListByIndexRequest)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const postNewsArticleListByIndexRequest = {"data":{"identifier":{"values":["FDS-US"],"type":"tickerRegion"},"filter":{"range":{"start":"2024-12-24T18:00:00.000000Z","end":"2024-01-01T00:00:00.000Z"},"categories":{"ids":[3]},"regions":{"ids":[3]},"distributor":{"ids":[4]},"publisher":{"ids":[3]},"language":{"ids":[2]},"types":{"ids":[3]}}},"meta":{"attributes":[],"subscription":{"minimumInterval":3450},"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostNewsArticleListByIndexRequest | Request Body

// Call api endpoint
apiInstance.postNewsArticleListByIndex(postNewsArticleListByIndexRequest).then(
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
 **postNewsArticleListByIndexRequest** | [**PostNewsArticleListByIndexRequest**](PostNewsArticleListByIndexRequest.md)| Request Body | 

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByInstrument

> InlineResponse20047 postNewsArticleListByInstrument(postNewsArticleListByInstrumentRequest)

News articles for instruments.

News articles for instruments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const postNewsArticleListByInstrumentRequest = {"data":{"identifier":{"values":["FDS-US"],"type":"tickerRegion"},"filter":{"range":{"start":"2024-12-24T18:00:00.000000Z","end":"2024-12-24T18:00:00.000000Z"},"categories":{"ids":[2]},"regions":{"ids":[3]},"distributor":{"ids":[2]},"publisher":{"ids":[5]},"language":{"ids":[5]},"types":{"ids":[3]}}},"meta":{"attributes":[],"subscription":{"minimumInterval":1290},"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostNewsArticleListByInstrumentRequest | Request Body

// Call api endpoint
apiInstance.postNewsArticleListByInstrument(postNewsArticleListByInstrumentRequest).then(
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
 **postNewsArticleListByInstrumentRequest** | [**PostNewsArticleListByInstrumentRequest**](PostNewsArticleListByInstrumentRequest.md)| Request Body | 

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleListByMediaKind

> InlineResponse20048 postNewsArticleListByMediaKind(postNewsArticleListByMediaKindRequest)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const postNewsArticleListByMediaKindRequest = {"data":{"ids":[5],"filter":{"range":{"start":"2024-12-24T18:00:00.000000Z","end":"2024-01-01T00:00:00.000Z"},"categories":{"ids":[5]},"regions":{"ids":[4]},"distributor":{"ids":[1]},"publisher":{"ids":[4]},"language":{"ids":[4]},"types":{"ids":[4]}}},"meta":{"attributes":[],"subscription":{"minimumInterval":1484},"pagination":{"cursor":"Lorem ipsum","limit":20}}}; // PostNewsArticleListByMediaKindRequest | Request Body

// Call api endpoint
apiInstance.postNewsArticleListByMediaKind(postNewsArticleListByMediaKindRequest).then(
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
 **postNewsArticleListByMediaKindRequest** | [**PostNewsArticleListByMediaKindRequest**](PostNewsArticleListByMediaKindRequest.md)| Request Body | 

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsArticleSearchByText

> InlineResponse20049 postNewsArticleSearchByText(opts)

Search for news articles using a fulltext search.

Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \&quot;include\&quot; requires the criterion to evaluate to true, \&quot;exclude\&quot; requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
  'postNewsArticleSearchByTextRequest': {"data":{"text":{"criteria":{"selectionType":"include","phrases":["Lorem Ipsum"],"minimumMatchScore":0.7,"scope":"all"}},"criteria":[{"selectionType":"include","range":{"start":"2024-12-24T18:00:00.000000Z","end":"2024-12-24T18:00:00.000000Z"},"indices":{"ids":["5005"]},"instruments":{"ids":["5005"]},"types":{"ids":[2]},"categories":{"ids":[5]},"regions":{"ids":[4]},"distributor":{"ids":[5]},"publisher":{"ids":[2]},"language":{"ids":[3]}}]},"meta":{"attributes":[],"subscription":{"minimumInterval":2670},"pagination":{"cursor":"Lorem ipsum","limit":20}}} // PostNewsArticleSearchByTextRequest | Request Body
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
 **postNewsArticleSearchByTextRequest** | [**PostNewsArticleSearchByTextRequest**](PostNewsArticleSearchByTextRequest.md)| Request Body | [optional] 

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postNewsPublisherSearchByName

> InlineResponse20057 postNewsPublisherSearchByName(postNewsPublisherSearchByNameRequest)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, NewsApi } = require('@factset/sdk-realtimenews');
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
const postNewsPublisherSearchByNameRequest = {"data":{"searchValue":"Lorem ipsum","matchType":"contains","filter":{"distributor":{"id":5},"delivery":{"id":5}}},"meta":{"attributes":[],"sort":["id"]}}; // PostNewsPublisherSearchByNameRequest | Request Body

// Call api endpoint
apiInstance.postNewsPublisherSearchByName(postNewsPublisherSearchByNameRequest).then(
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
 **postNewsPublisherSearchByNameRequest** | [**PostNewsPublisherSearchByNameRequest**](PostNewsPublisherSearchByNameRequest.md)| Request Body | 

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

