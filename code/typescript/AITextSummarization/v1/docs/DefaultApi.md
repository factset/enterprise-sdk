# aitextsummarization.DefaultApi

All URIs are relative to *http://api.factset.com/cognitive/summarization/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResultV1ResultResultId**](DefaultApi.md#getResultV1ResultResultId) | **GET** /result/{result_id} | GET request that returns the full headline and summary results from the initial POST requests
[**postHeadlineAndSummaryV1HeadlineAndSummary**](DefaultApi.md#postHeadlineAndSummaryV1HeadlineAndSummary) | **POST** /headline-and-summary | POST request to create a 2-3 sentence summary from input text
[**postHeadlineV1Headline**](DefaultApi.md#postHeadlineV1Headline) | **POST** /headline | POST request to create a headline from input text
[**postSummaryV1Summary**](DefaultApi.md#postSummaryV1Summary) | **POST** /summary | POST request to create a headline and summary from input text



## getResultV1ResultResultId

> SuccessResponse getResultV1ResultResultId(resultId)

GET request that returns the full headline and summary results from the initial POST requests

Endpoint that returns the full headline and summary results from the initial POST requests.

### Example

```javascript
const { ApiClient, DefaultApi } = require('@factset/sdk-aitextsummarization');
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

const apiInstance = new DefaultApi();
const resultId = "resultId_example"; // String | 

// Call api endpoint
apiInstance.getResultV1ResultResultId(resultId).then(
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
 **resultId** | **String**|  | 

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postHeadlineAndSummaryV1HeadlineAndSummary

> String postHeadlineAndSummaryV1HeadlineAndSummary(payload)

POST request to create a 2-3 sentence summary from input text

Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.

### Example

```javascript
const { ApiClient, DefaultApi } = require('@factset/sdk-aitextsummarization');
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

const apiInstance = new DefaultApi();
const payload = new aitextsummarization.Request(); // Request | 

// Call api endpoint
apiInstance.postHeadlineAndSummaryV1HeadlineAndSummary(payload).then(
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
 **payload** | [**Request**](Request.md)|  | 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postHeadlineV1Headline

> String postHeadlineV1Headline(payload)

POST request to create a headline from input text

Endpoint for initiating a processing job to create a headline from input text.

### Example

```javascript
const { ApiClient, DefaultApi } = require('@factset/sdk-aitextsummarization');
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

const apiInstance = new DefaultApi();
const payload = new aitextsummarization.Request(); // Request | 

// Call api endpoint
apiInstance.postHeadlineV1Headline(payload).then(
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
 **payload** | [**Request**](Request.md)|  | 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## postSummaryV1Summary

> String postSummaryV1Summary(payload)

POST request to create a headline and summary from input text

Endpoint for initiating a processing job to create a headline and summary from input text.

### Example

```javascript
const { ApiClient, DefaultApi } = require('@factset/sdk-aitextsummarization');
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

const apiInstance = new DefaultApi();
const payload = new aitextsummarization.Request(); // Request | 

// Call api endpoint
apiInstance.postSummaryV1Summary(payload).then(
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
 **payload** | [**Request**](Request.md)|  | 

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

