# conversationalapipoweredbyfactsetmercury.MultipleQuestionChatApi

All URIs are relative to *https://api.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChatResult**](MultipleQuestionChatApi.md#getChatResult) | **POST** /result | Retrieve the completed response for your query.
[**getChatStatus**](MultipleQuestionChatApi.md#getChatStatus) | **POST** /status | Retrieve the status of a chat response process.
[**queryChat**](MultipleQuestionChatApi.md#queryChat) | **POST** /query | Create a query request for a given natural language query.



## getChatResult

> QueryResponse getChatResult(chatPollingRequest)

Retrieve the completed response for your query.

Returns FactSet content and data in response to the query provided to the &#x60;/query&#x60; endpoint. This endpoint is the final step in the query request process. Responses contain a combination of Microsoft Adaptive Cards for data/tables and markdown for text. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MultipleQuestionChatApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new MultipleQuestionChatApi();
const chatPollingRequest = new conversationalapipoweredbyfactsetmercury.ChatPollingRequest(); // ChatPollingRequest | ID representing the chat process for your query

// Call api endpoint
apiInstance.getChatResult(chatPollingRequest).then(
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
 **chatPollingRequest** | [**ChatPollingRequest**](ChatPollingRequest.md)| ID representing the chat process for your query | 

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## getChatStatus

> StatusPollResponse getChatStatus(chatPollingRequest)

Retrieve the status of a chat response process.

Returns the status of a chat response for a given chat job ID (recevied from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready. Answers may take minutes to generate, depending on the complexity of the query. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MultipleQuestionChatApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new MultipleQuestionChatApi();
const chatPollingRequest = new conversationalapipoweredbyfactsetmercury.ChatPollingRequest(); // ChatPollingRequest | ID representing the chat process for your query

// Call api endpoint
apiInstance.getChatStatus(chatPollingRequest).then(
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
 **chatPollingRequest** | [**ChatPollingRequest**](ChatPollingRequest.md)| ID representing the chat process for your query | 

### Return type

[**StatusPollResponse**](StatusPollResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## queryChat

> QueryChatResponse queryChat(queryChatRequest)

Create a query request for a given natural language query.

Returns a job ID for polling the response to a natural language query for financial data as well as a chat ID to continue asking questions in the same conversational context. This endpoint is an interface for initiating responses from FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. Use the &#x60;/query&#x60; endpoint to generate responses for questions in or out of a conversational message chain context. Responses contain a job ID, used to request the status and result of the current question, and a chat ID, used to ask further questions in the same conversation message chain. Requests to &#x60;/query&#x60; without a chat ID will initialize a conversation, while requests with a chat ID will continue the conversation in the context of all previous sent and received messages in that conversation. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, MultipleQuestionChatApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new MultipleQuestionChatApi();
const queryChatRequest = new conversationalapipoweredbyfactsetmercury.QueryChatRequest(); // QueryChatRequest | Natural language query for FactSet data

// Call api endpoint
apiInstance.queryChat(queryChatRequest).then(
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
 **queryChatRequest** | [**QueryChatRequest**](QueryChatRequest.md)| Natural language query for FactSet data | 

### Return type

[**QueryChatResponse**](QueryChatResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain

