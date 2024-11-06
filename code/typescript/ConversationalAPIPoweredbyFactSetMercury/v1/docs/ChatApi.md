# conversationalapipoweredbyfactsetmercury.ChatApi

All URIs are relative to *https://api.factset.com/conversational/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChatResult**](ChatApi.md#getChatResult) | **POST** /result | Retrieve the completed response for your query
[**getChatStatus**](ChatApi.md#getChatStatus) | **POST** /status | Retrieve the status of a chat response generation process
[**sendQuery**](ChatApi.md#sendQuery) | **POST** /query | Send a natural language query to FactSet Mercury



## getChatResult

> QueryResponse getChatResult(chatPollingRequest)

Retrieve the completed response for your query

Use this endpoint to retrieve the results of your query to FactSet Mercury. This endpoint is the final step in the query polling process. Once the status for your jobId is &#x60;created&#x60;, you can retrieve the query response using this &#x60;/result&#x60; endpoint.  The response will contain the natural language answer to your query, supporting data and content that FactSet Mercury has surfaced, and suggestions for further engagement with FactSet Mercury.   Data and content will be returned using various defined and standard formats, such as markdown and Microsoft Adaptive Cards. Please see the examples and data schemas associated with the &#x60;/result&#x60; endpoint for details.  **Please note:** The ID contained in the response represents the ID for the response itself, it does not match the chatId or jobId. Please use this response ID at the &#x60;/feedback&#x60; endpoint to provide feedback on the response. 

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
const chatPollingRequest = {"data":{"jobId":"9c1031c2-5463-47ae-81b3-126a68f0c2a6"}}; // ChatPollingRequest | Polling request body, containing the job ID for your response generation process

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
 **chatPollingRequest** | [**ChatPollingRequest**](ChatPollingRequest.md)| Polling request body, containing the job ID for your response generation process | 

### Return type

[**QueryResponse**](QueryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## getChatStatus

> StatusPollResponse getChatStatus(chatPollingRequest)

Retrieve the status of a chat response generation process

Use this endpoint to retrieve the status of a chat response for a given chat job ID (received from the &#x60;/query&#x60; endpoint). Poll the &#x60;/status&#x60; endpoint with your job ID to confirm when your data is ready.  Answers may take minutes to generate, depending on the complexity of the query.  Returns a 202 status code if the response is still processing, and a 201 status code if the response is ready. 

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
const chatPollingRequest = {"data":{"jobId":"9c1031c2-5463-47ae-81b3-126a68f0c2a6"}}; // ChatPollingRequest | Polling request body, containing the job ID for your response generation process

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
 **chatPollingRequest** | [**ChatPollingRequest**](ChatPollingRequest.md)| Polling request body, containing the job ID for your response generation process | 

### Return type

[**StatusPollResponse**](StatusPollResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## sendQuery

> QueryChatResponse sendQuery(queryChatRequest)

Send a natural language query to FactSet Mercury

Use this endpoint to send a natural language query to FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. A request to &#x60;/query&#x60; will initiate the response generation process for the given query. Queries can be sent as standalone questions or as part of a conversational message chain, using a chat ID to maintain context.  Responses from &#x60;/query&#x60; contain the following: * **jobId**: used in subsequent endpoints to poll the status of response generation and retrieve the response from FactSet Mercury. * **chatId**: optionally used to ask further questions in the same conversational message chain.  Please see the [Conversational API Online Assistant page](https://my.apps.factset.com/oa/pages/23209) for details around available content and types of questions the Conversational API can answer. 

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
const queryChatRequest = new conversationalapipoweredbyfactsetmercury.QueryChatRequest(); // QueryChatRequest | Request body to the `/query` endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation.

// Call api endpoint
apiInstance.sendQuery(queryChatRequest).then(
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
 **queryChatRequest** | [**QueryChatRequest**](QueryChatRequest.md)| Request body to the &#x60;/query&#x60; endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation. | 

### Return type

[**QueryChatResponse**](QueryChatResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain

