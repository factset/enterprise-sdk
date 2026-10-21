# conversational.ChatApi

All URIs are relative to *https://api.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatCompletion**](ChatApi.md#chatCompletion) | **POST** /chat/completions | Ask a question and stream back the answer (OpenAI-compatible)
[**listModels**](ChatApi.md#listModels) | **GET** /models | List the models you can use (OpenAI-compatible)



## chatCompletion

> ChatCompletionChunk chatCompletion(chatCompletionRequest, opts)

Ask a question and stream back the answer (OpenAI-compatible)

Send a question and get the answer back as a live stream of small pieces of text, rather than one big response at the end, formatted the way OpenAI&#39;s Chat Completions API formats its output.  You send your question in the &#x60;messages&#x60; array, using the same shape OpenAI uses. The API looks for the last message where &#x60;role&#x60; is &#x60;\&quot;user\&quot;&#x60; and treats that as the question being asked right now — any earlier messages in the array, or a system prompt, are not read.  To have a back-and-forth conversation, include the &#x60;factset_configuration.conversation_id&#x60; you received from a previous call, and the assistant will pick up where that conversation left off. Leave it out to start a brand new conversation — you&#39;ll be given a fresh id in the first piece of the response, which you should hold onto and send back next time. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChatApi } = require('@factset/sdk-conversational');
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
const chatCompletionRequest = {"model":"fds-answer-2.0","stream":true,"messages":[{"role":"user","content":"Give me price of FDS-US"}]}; // ChatCompletionRequest | 
const opts = {
  'consumer': developer-portal // String | A short name identifying which application or integration is making this call, used for FactSet's own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected.
};

// Call api endpoint
apiInstance.chatCompletion(chatCompletionRequest, opts).then(
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
 **chatCompletionRequest** | [**ChatCompletionRequest**](ChatCompletionRequest.md)|  | 
 **consumer** | **String**| A short name identifying which application or integration is making this call, used for FactSet&#39;s own usage tracking. If omitted, usage is tracked under a generic default value rather than the request being rejected. | [optional] 

### Return type

[**ChatCompletionChunk**](ChatCompletionChunk.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/event-stream, text/plain


## listModels

> ModelList listModels()

List the models you can use (OpenAI-compatible)

Returns the list of model names you&#39;re allowed to use with &#x60;/chat/completions&#x60;. This mirrors the shape of OpenAI&#39;s own &#x60;GET /v1/models&#x60; endpoint, so tools built for OpenAI can discover which model names are valid without any special handling.  There are currently two models, and they behave the same way except for one difference: &#x60;fds-web-answer-2.0&#x60; is allowed to search the public web for extra information when answering, while &#x60;fds-answer-2.0&#x60; only uses FactSet&#39;s own data. There&#39;s no separate switch to turn web search on or off — you choose it by picking which model to use. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, ChatApi } = require('@factset/sdk-conversational');
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

// Call api endpoint
apiInstance.listModels().then(
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

[**ModelList**](ModelList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

