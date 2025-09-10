# factsetfunds.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContentSet**](ScreeningOperationsApi.md#createContentSet) | **POST** /factset-funds/v1/screener/content-sets/create | Create a new custom content set with required fields from the default content sets.
[**deleteContentSet**](ScreeningOperationsApi.md#deleteContentSet) | **DELETE** /factset-funds/v1/screener/content-sets/{name} | Delete a custom content set.
[**getContentSets**](ScreeningOperationsApi.md#getContentSets) | **GET** /factset-funds/v1/screener/content-sets | Get the content sets that are permissioned for the user.
[**getDistinctCount**](ScreeningOperationsApi.md#getDistinctCount) | **POST** /factset-funds/v1/screener/distinct-count | Returns the number of records for a given field spread across all possible values.
[**getFields**](ScreeningOperationsApi.md#getFields) | **GET** /factset-funds/v1/screener/fields | Get the list of fields available for given content set.
[**getScreenerData**](ScreeningOperationsApi.md#getScreenerData) | **POST** /factset-funds/v1/screener/search | Returns all the records that match the given criteria.
[**getStatistics**](ScreeningOperationsApi.md#getStatistics) | **POST** /factset-funds/v1/screener/statistics | Returns the statistics and histogram data for a given field within the specified content sets.



## createContentSet

> CreateContentSetResponse createContentSet(createContentSetRequest)

Create a new custom content set with required fields from the default content sets.

Create a custom content set with the required set of fields. These fields are taken from the default content sets provided in the request.  The name for a custom content-set must be unique. The list of displayNames within each custom content-set must also be unique. Display names can be used as fieldName in other endpoints to perform screening operations.  The &#x60;/screener/content-sets&#x60; and &#x60;/screener/fields&#x60; endpoints provide the authoritative lists of available content sets and fields. Use these endpoints to construct custom content sets and ensure that all content set names and displayName values are unique. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();
const createContentSetRequest = new factsetfunds.CreateContentSetRequest(); // CreateContentSetRequest | Request object for create content-set endpoint.

// Call api endpoint
apiInstance.createContentSet(createContentSetRequest).then(
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
 **createContentSetRequest** | [**CreateContentSetRequest**](CreateContentSetRequest.md)| Request object for create content-set endpoint. | 

### Return type

[**CreateContentSetResponse**](CreateContentSetResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteContentSet

> deleteContentSet(name)

Delete a custom content set.

Delete a custom content set by providing the content set name.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();
const name = my-content-set; // String | The name of the content set to be deleted.

// Call api endpoint
apiInstance.deleteContentSet(name).then(
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
 **name** | **String**| The name of the content set to be deleted. | 

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getContentSets

> ContentSetsResponse getContentSets()

Get the content sets that are permissioned for the user.

Gets the content sets that are permissioned for the user. for example: &#x60;Factset Fundamentals&#x60;, &#x60;Factset Funds&#x60;, etc. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();

// Call api endpoint
apiInstance.getContentSets().then(
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

[**ContentSetsResponse**](ContentSetsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDistinctCount

> DistinctCountResponse getDistinctCount(distinctCountRequest)

Returns the number of records for a given field spread across all possible values.

Returns the number of records for a given field spread across all possible values that match the given criteria. Only string fields are supported. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();
const distinctCountRequest = new factsetfunds.DistinctCountRequest(); // DistinctCountRequest | Request object for `distinct-count`.

// Call api endpoint
apiInstance.getDistinctCount(distinctCountRequest).then(
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
 **distinctCountRequest** | [**DistinctCountRequest**](DistinctCountRequest.md)| Request object for &#x60;distinct-count&#x60;. | 

### Return type

[**DistinctCountResponse**](DistinctCountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getFields

> FieldsResponse getFields(contentSets)

Get the list of fields available for given content set.

Gets the list of fields available for a given content set (or combination of content sets). For example: &#x60;Factset Fundamentals&#x60;, &#x60;Factset Funds&#x60;, etc.  Both default and custom content sets are supported. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();
const contentSets = ["Factset Fundamentals"]; // [String] | The content sets from which the fields are requested. For example: `Factset Fundamentals`,  `Factset Funds`, etc. 

// Call api endpoint
apiInstance.getFields(contentSets).then(
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
 **contentSets** | [**[String]**](String.md)| The content sets from which the fields are requested. For example: &#x60;Factset Fundamentals&#x60;,  &#x60;Factset Funds&#x60;, etc.  | 

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getScreenerData

> SearchResponse getScreenerData(searchRequest)

Returns all the records that match the given criteria.

Returns the records that match the given criteria. The request object for &#x60;Search&#x60; allows the user to get back data for fields of their choosing. Along with the fields requested, a unique identifier such as the ticker symbol will be returned in the response.  Custom search of fields actually uses &#x60;displayName&#x60;. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();
const searchRequest = new factsetfunds.SearchRequest(); // SearchRequest | Request object for `Search`.

// Call api endpoint
apiInstance.getScreenerData(searchRequest).then(
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)| Request object for &#x60;Search&#x60;. | 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getStatistics

> StatisticsResponse getStatistics(statisticsRequest)

Returns the statistics and histogram data for a given field within the specified content sets.

Returns the statistics for a given field within the specified content sets. Only numerical fields are supported. If histogram flag is set to true, histogram data is also returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ScreeningOperationsApi } = require('@factset/sdk-factsetfunds');
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

const apiInstance = new ScreeningOperationsApi();
const statisticsRequest = new factsetfunds.StatisticsRequest(); // StatisticsRequest | Request object for `Statistics`.

// Call api endpoint
apiInstance.getStatistics(statisticsRequest).then(
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
 **statisticsRequest** | [**StatisticsRequest**](StatisticsRequest.md)| Request object for &#x60;Statistics&#x60;. | 

### Return type

[**StatisticsResponse**](StatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

