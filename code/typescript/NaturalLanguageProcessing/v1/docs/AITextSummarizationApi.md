# naturallanguageprocessing.AITextSummarizationApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitiveNlpV1SummarizationHeadlineAndSummaryPost**](AITextSummarizationApi.md#cognitiveNlpV1SummarizationHeadlineAndSummaryPost) | **POST** /cognitive/nlp/v1/summarization/headline-and-summary | POST request for summarizing an input text
[**cognitiveNlpV1SummarizationHeadlinePost**](AITextSummarizationApi.md#cognitiveNlpV1SummarizationHeadlinePost) | **POST** /cognitive/nlp/v1/summarization/headline | POST request for summarizing an input text
[**cognitiveNlpV1SummarizationResultResultIdGet**](AITextSummarizationApi.md#cognitiveNlpV1SummarizationResultResultIdGet) | **GET** /cognitive/nlp/v1/summarization/result/{result_id} | GET request for obtaining response of a particular processing job
[**cognitiveNlpV1SummarizationSummaryPost**](AITextSummarizationApi.md#cognitiveNlpV1SummarizationSummaryPost) | **POST** /cognitive/nlp/v1/summarization/summary | POST request for summarizing an input text



## cognitiveNlpV1SummarizationHeadlineAndSummaryPost

> SummarizationResultID cognitiveNlpV1SummarizationHeadlineAndSummaryPost(opts)

POST request for summarizing an input text

### Example

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const opts = {
  'summarizationRequest': new naturallanguageprocessing.SummarizationRequest() // SummarizationRequest | 
};

// Call api endpoint
apiInstance.cognitiveNlpV1SummarizationHeadlineAndSummaryPost(opts).then(
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional] 

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## cognitiveNlpV1SummarizationHeadlinePost

> SummarizationResultID cognitiveNlpV1SummarizationHeadlinePost(opts)

POST request for summarizing an input text

### Example

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const opts = {
  'summarizationRequest': new naturallanguageprocessing.SummarizationRequest() // SummarizationRequest | 
};

// Call api endpoint
apiInstance.cognitiveNlpV1SummarizationHeadlinePost(opts).then(
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional] 

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## cognitiveNlpV1SummarizationResultResultIdGet

> SummarizationResult cognitiveNlpV1SummarizationResultResultIdGet(resultId)

GET request for obtaining response of a particular processing job

### Example

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const resultId = "resultId_example"; // String | 

// Call api endpoint
apiInstance.cognitiveNlpV1SummarizationResultResultIdGet(resultId).then(
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

[**SummarizationResult**](SummarizationResult.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cognitiveNlpV1SummarizationSummaryPost

> SummarizationResultID cognitiveNlpV1SummarizationSummaryPost(opts)

POST request for summarizing an input text

### Example

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const opts = {
  'summarizationRequest': new naturallanguageprocessing.SummarizationRequest() // SummarizationRequest | 
};

// Call api endpoint
apiInstance.cognitiveNlpV1SummarizationSummaryPost(opts).then(
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional] 

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

