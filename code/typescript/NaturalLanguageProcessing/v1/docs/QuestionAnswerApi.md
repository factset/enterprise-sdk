# naturallanguageprocessing.QuestionAnswerApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qnaGetAnswers**](QuestionAnswerApi.md#qnaGetAnswers) | **GET** /qna/answers/{id} | Get the answer(s)
[**qnaGetStatus**](QuestionAnswerApi.md#qnaGetStatus) | **GET** /qna/answers/{id}/status | Get the completion status
[**qnaPostQuestion**](QuestionAnswerApi.md#qnaPostQuestion) | **POST** /qna/answers | Post a question for answer(s)



## qnaGetAnswers

> QnAAnswerRoot qnaGetAnswers(id)

Get the answer(s)

Obtain the results from the original task request. The &#x60;id&#x60; parameter represents the identifier from the task and comes from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.

### Example

```javascript
const { ApiClient, QuestionAnswerApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new QuestionAnswerApi();
const id = "id_example"; // String | Identifier from the Question & Answer task and comes from the POST request which created the task

// Call api endpoint
apiInstance.qnaGetAnswers(id).then(
  data => {

      // data is a responsewrapper: QnaGetAnswersResponseWrapper
      switch (data.statusCode) {

          case 200:
             // QnAAnswerRoot
             console.log(data.getResponse200());
             break;

          case 202:
             // QnATaskRoot
             console.log(data.getResponse202());
             break;

      }

  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task | 

### Return type

[**QnAAnswerRoot**](QnAAnswerRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## qnaGetStatus

> QnATaskRoot qnaGetStatus(id)

Get the completion status

Endpoint to obtain the status of the task request. The &#x60;id&#x60; parameter represents the identifier of the task created and comes from the POST request which created the task.

### Example

```javascript
const { ApiClient, QuestionAnswerApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new QuestionAnswerApi();
const id = "id_example"; // String | Identifier from the Question & Answer task and comes from the POST request which created the task

// Call api endpoint
apiInstance.qnaGetStatus(id).then(
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
 **id** | **String**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task | 

### Return type

[**QnATaskRoot**](QnATaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## qnaPostQuestion

> QnATaskRoot qnaPostQuestion(qnAAnswerParametersRoot)

Post a question for answer(s)

Create a task submission by providing plain text and question(s). The underlying model will answer the question. The created task needs to be polled to obtain the results. Please check the schema(s) for each of the status codes for more details about the task.

### Example

```javascript
const { ApiClient, QuestionAnswerApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new QuestionAnswerApi();
const qnAAnswerParametersRoot = new naturallanguageprocessing.QnAAnswerParametersRoot(); // QnAAnswerParametersRoot | 

// Call api endpoint
apiInstance.qnaPostQuestion(qnAAnswerParametersRoot).then(
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
 **qnAAnswerParametersRoot** | [**QnAAnswerParametersRoot**](QnAAnswerParametersRoot.md)|  | 

### Return type

[**QnATaskRoot**](QnATaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

