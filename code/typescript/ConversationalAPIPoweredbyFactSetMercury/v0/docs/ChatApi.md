# conversationalapipoweredbyfactsetmercury.ChatApi

All URIs are relative to *https://api.uat.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatCompletion**](ChatApi.md#chatCompletion) | **POST** /chat/completions | Stream a chat completion (OpenAI-compatible)
[**listModels**](ChatApi.md#listModels) | **GET** /models | List available models (OpenAI-compatible)



## chatCompletion

> ChatCompletionChunk chatCompletion(consumer, chatCompletionRequest)

Stream a chat completion (OpenAI-compatible)

Accepts an OpenAI-style Chat Completions request and streams &#x60;chat.completion.chunk&#x60; frames via Server-Sent Events.  The &#x60;messages&#x60; array is searched in reverse for the last entry with &#x60;role: user&#x60;; everything else is discarded before the request is forwarded to the agent. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChatApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new ChatApi();
const consumer = developer-portal; // String | Identify the requestor
const chatCompletionRequest = {"model":"fds-answer-2.0","stream":true,"messages":[{"role":"user","content":"Give me price of FDS-US"}]}; // ChatCompletionRequest | 

// Call api endpoint
apiInstance.chatCompletion(consumer, chatCompletionRequest).then(
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
 **consumer** | **String**| Identify the requestor | 
 **chatCompletionRequest** | [**ChatCompletionRequest**](ChatCompletionRequest.md)|  | 

### Return type

[**ChatCompletionChunk**](ChatCompletionChunk.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/event-stream, application/json


## listModels

> ModelList listModels(consumer)

List available models (OpenAI-compatible)

Returns the static list of models accepted by &#x60;/chat/completions&#x60;. Mirrors the OpenAI &#x60;GET /v1/models&#x60; shape so OpenAI-compatible clients can discover the model ID. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChatApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new ChatApi();
const consumer = developer-portal; // String | Identify the requestor

// Call api endpoint
apiInstance.listModels(consumer).then(
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
 **consumer** | **String**| Identify the requestor | 

### Return type

[**ModelList**](ModelList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

