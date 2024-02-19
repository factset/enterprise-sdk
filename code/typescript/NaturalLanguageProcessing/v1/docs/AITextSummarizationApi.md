# naturallanguageprocessing.AITextSummarizationApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**summarizationHeadline**](AITextSummarizationApi.md#summarizationHeadline) | **POST** /summarization/headline | Endpoint to generate a headline from text
[**summarizationHeadlineAndSummary**](AITextSummarizationApi.md#summarizationHeadlineAndSummary) | **POST** /summarization/headline-and-summary | Endpoint to summarize and generate a headline from text
[**summarizationResult**](AITextSummarizationApi.md#summarizationResult) | **GET** /summarization/result/{resultId} | Endpoint to obtain result of a particular summarization job
[**summarizationSummary**](AITextSummarizationApi.md#summarizationSummary) | **POST** /summarization/summary | Endpoint to summarize text



## summarizationHeadline

> SummarizationResultID summarizationHeadline(opts)

Endpoint to generate a headline from text

Generate a headline-length summary of plain text

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const opts = {
  'summarizationRequest': new naturallanguageprocessing.SummarizationRequest() // SummarizationRequest | 
};

// Call api endpoint
apiInstance.summarizationHeadline(opts).then(
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


## summarizationHeadlineAndSummary

> SummarizationResultID summarizationHeadlineAndSummary(opts)

Endpoint to summarize and generate a headline from text

Generate both a paragraph-length, and headline-length summary of plain text

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const opts = {
  'summarizationRequest': new naturallanguageprocessing.SummarizationRequest() // SummarizationRequest | 
};

// Call api endpoint
apiInstance.summarizationHeadlineAndSummary(opts).then(
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


## summarizationResult

> SummarizationResult summarizationResult(resultId)

Endpoint to obtain result of a particular summarization job

Retrieve the summarization result from a job started with the other summarization endpoints

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const resultId = "resultId_example"; // String | 

// Call api endpoint
apiInstance.summarizationResult(resultId).then(
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


## summarizationSummary

> SummarizationResultID summarizationSummary(opts)

Endpoint to summarize text

Generate a paragraph-length summary of plain text

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AITextSummarizationApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AITextSummarizationApi();
const opts = {
  'summarizationRequest': new naturallanguageprocessing.SummarizationRequest() // SummarizationRequest | 
};

// Call api endpoint
apiInstance.summarizationSummary(opts).then(
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

