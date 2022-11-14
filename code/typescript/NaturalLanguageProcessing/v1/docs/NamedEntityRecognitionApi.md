# naturallanguageprocessing.NamedEntityRecognitionApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitiveNlpV1NerEntitiesPost**](NamedEntityRecognitionApi.md#cognitiveNlpV1NerEntitiesPost) | **POST** /cognitive/nlp/v1/ner/entities | Endpoint to detect entities from text



## cognitiveNlpV1NerEntitiesPost

> NERResponseSchema cognitiveNlpV1NerEntitiesPost(opts)

Endpoint to detect entities from text

### Example

```javascript
const { ApiClient, NamedEntityRecognitionApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new NamedEntityRecognitionApi();
const opts = {
  'nERInputSchema': new naturallanguageprocessing.NERInputSchema() // NERInputSchema | 
};

// Call api endpoint
apiInstance.cognitiveNlpV1NerEntitiesPost(opts).then(
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
 **nERInputSchema** | [**NERInputSchema**](NERInputSchema.md)|  | [optional] 

### Return type

[**NERResponseSchema**](NERResponseSchema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

