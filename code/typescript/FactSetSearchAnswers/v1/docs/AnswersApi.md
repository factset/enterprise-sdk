# factsetsearchanswers.AnswersApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchForAdaptiveCardAnswer**](AnswersApi.md#searchForAdaptiveCardAnswer) | **GET** /search/answers/v1/adaptive-card | Fetch FactSet answer in Adaptive Card format
[**searchForDataAnswer**](AnswersApi.md#searchForDataAnswer) | **GET** /search/answers/v1/data | Fetch FactSet answer in data format



## searchForAdaptiveCardAnswer

> AdaptiveCardAnswerSuccessResponse searchForAdaptiveCardAnswer(query, opts)

Fetch FactSet answer in Adaptive Card format

Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AnswersApi } = require('@factset/sdk-factsetsearchanswers');
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

const apiInstance = new AnswersApi();
const query = "query_example"; // String | Query for desired answer (e.g., \"fds price\")
const opts = {
  'includeThumbnail': false, // Boolean | Includes thumbnail of Adaptive Card in response
  'disableNoAnswerResponses': true, // Boolean | Disables no-result answer responses (no-results and answer without data)
  'theme': "'Light'" // String | Theme for desired answer (e.g., \"Light\", \"Dark\")
};

// Call api endpoint
apiInstance.searchForAdaptiveCardAnswer(query, opts).then(
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
 **query** | **String**| Query for desired answer (e.g., \&quot;fds price\&quot;) | 
 **includeThumbnail** | **Boolean**| Includes thumbnail of Adaptive Card in response | [optional] [default to false]
 **disableNoAnswerResponses** | **Boolean**| Disables no-result answer responses (no-results and answer without data) | [optional] [default to true]
 **theme** | **String**| Theme for desired answer (e.g., \&quot;Light\&quot;, \&quot;Dark\&quot;) | [optional] [default to &#39;Light&#39;]

### Return type

[**AdaptiveCardAnswerSuccessResponse**](AdaptiveCardAnswerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## searchForDataAnswer

> DataAnswerSuccessResponse searchForDataAnswer(query, opts)

Fetch FactSet answer in data format

Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AnswersApi } = require('@factset/sdk-factsetsearchanswers');
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

const apiInstance = new AnswersApi();
const query = "query_example"; // String | Query for desired answer (e.g., \"fds price\")
const opts = {
  'consumingApplication': "'Developer Portal'" // String | Name of application consuming the API (used for analytics purposes)
};

// Call api endpoint
apiInstance.searchForDataAnswer(query, opts).then(
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
 **query** | **String**| Query for desired answer (e.g., \&quot;fds price\&quot;) | 
 **consumingApplication** | **String**| Name of application consuming the API (used for analytics purposes) | [optional] [default to &#39;Developer Portal&#39;]

### Return type

[**DataAnswerSuccessResponse**](DataAnswerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

