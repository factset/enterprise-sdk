# recommendationlistapifordigitalportals.RecommendationListApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecommendationListGet**](RecommendationListApi.md#getRecommendationListGet) | **GET** /recommendationList/get | Attributes of a single list.
[**getRecommendationListRevisionElementList**](RecommendationListApi.md#getRecommendationListRevisionElementList) | **GET** /recommendationList/revision/element/list | List of elements of a given revision.
[**getRecommendationListRevisionGet**](RecommendationListApi.md#getRecommendationListRevisionGet) | **GET** /recommendationList/revision/get | Attributes of a single revision.
[**getRecommendationListRevisionSearch**](RecommendationListApi.md#getRecommendationListRevisionSearch) | **GET** /recommendationList/revision/search | Search for revisions of a recommendation list.
[**getRecommendationListSearch**](RecommendationListApi.md#getRecommendationListSearch) | **GET** /recommendationList/search | Search for recommendation lists.
[**postRecommendationListRevisionList**](RecommendationListApi.md#postRecommendationListRevisionList) | **POST** /recommendationList/revision/list | List of revisions of a recommendation list.



## getRecommendationListGet

> InlineResponse200 getRecommendationListGet(id, opts)

Attributes of a single list.

Attributes of a single list, including data about its active revision.

### Example

```javascript
const { ApiClient, RecommendationListApi } = require('@factset/sdk-recommendationlistapifordigitalportals');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new RecommendationListApi();
const id = 3.4; // Number | Identifier of the list.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getRecommendationListGet(id, opts).then(
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
 **id** | **Number**| Identifier of the list. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRecommendationListRevisionElementList

> InlineResponse2005 getRecommendationListRevisionElementList(idRevision, opts)

List of elements of a given revision.

List of elements of a given revision.

### Example

```javascript
const { ApiClient, RecommendationListApi } = require('@factset/sdk-recommendationlistapifordigitalportals');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new RecommendationListApi();
const idRevision = 3.4; // Number | Identifier of the revision.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getRecommendationListRevisionElementList(idRevision, opts).then(
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
 **idRevision** | **Number**| Identifier of the revision. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRecommendationListRevisionGet

> InlineResponse2002 getRecommendationListRevisionGet(id, opts)

Attributes of a single revision.

Attributes of a single revision.

### Example

```javascript
const { ApiClient, RecommendationListApi } = require('@factset/sdk-recommendationlistapifordigitalportals');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new RecommendationListApi();
const id = 3.4; // Number | Identifier of the revision.
const opts = {
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getRecommendationListRevisionGet(id, opts).then(
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
 **id** | **Number**| Identifier of the revision. | 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRecommendationListRevisionSearch

> InlineResponse2004 getRecommendationListRevisionSearch(opts)

Search for revisions of a recommendation list.

Search for revisions of a recommendation list.

### Example

```javascript
const { ApiClient, RecommendationListApi } = require('@factset/sdk-recommendationlistapifordigitalportals');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new RecommendationListApi();
const opts = {
  'idNotation': "idNotation_example", // String | Restrict the search to revisions containing an element associated with the identified notation.
  'idInstrument': "idInstrument_example", // String | Restrict the search to revisions pointing to the identified instrument.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getRecommendationListRevisionSearch(opts).then(
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
 **idNotation** | **String**| Restrict the search to revisions containing an element associated with the identified notation. | [optional] 
 **idInstrument** | **String**| Restrict the search to revisions pointing to the identified instrument. | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRecommendationListSearch

> InlineResponse2001 getRecommendationListSearch(opts)

Search for recommendation lists.

Search for recommendation lists, delivering an array of recommendation lists matching the specified filter criteria. The data provided for each recommendation list includes the currently active revision (or null in case no active revision exists).

### Example

```javascript
const { ApiClient, RecommendationListApi } = require('@factset/sdk-recommendationlistapifordigitalportals');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new RecommendationListApi();
const opts = {
  'name': "name_example", // String | Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match.
  'onlyActive': true, // Boolean | Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list's activeRange.end date). If set to false, recommendation lists will be returned regardless of their state.
  'attributes': ["null"], // [String] | Limit the attributes returned in the response to the specified set.
  'language': "language_example" // String | ISO 639-1 code of the language.
};

// Call api endpoint
apiInstance.getRecommendationListSearch(opts).then(
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
 **name** | **String**| Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match. | [optional] 
 **onlyActive** | **Boolean**| Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list&#39;s activeRange.end date). If set to false, recommendation lists will be returned regardless of their state. | [optional] 
 **attributes** | [**[String]**](String.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **String**| ISO 639-1 code of the language. | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postRecommendationListRevisionList

> InlineResponse2003 postRecommendationListRevisionList(body)

List of revisions of a recommendation list.

List of revisions of a recommendation list, excluding the elements of each revision.

### Example

```javascript
const { ApiClient, RecommendationListApi } = require('@factset/sdk-recommendationlistapifordigitalportals');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new RecommendationListApi();
const body = new recommendationlistapifordigitalportals.InlineObject(); // InlineObject | 

// Call api endpoint
apiInstance.postRecommendationListRevisionList(body).then(
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
 **body** | [**InlineObject**](InlineObject.md)|  | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

