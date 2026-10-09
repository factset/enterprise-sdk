# factsetner.AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAdvancedNerExtraction**](AdvancedApi.md#postAdvancedNerExtraction) | **POST** /advanced/extract | Advanced Processing



## postAdvancedNerExtraction

> OutputRoot postAdvancedNerExtraction(advancedRequestRoot)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.  Optionally select a model via &#x60;data.model&#x60; in the request body. Supported models: - GPT 5.2 - Claude Sonnet 4.6 - Llama 4 Scout Instruct (the default)  Requests are limited to a 30-second timeout. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AdvancedApi } = require('@factset/sdk-factsetner');
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

const apiInstance = new AdvancedApi();
const advancedRequestRoot = {"data":{"input":"Solar photovoltaic (PV) cell maker Jupiter International has raised about $22.2 million (Rs 170 crore) from funds managed by Edelweiss Alternative Asset Advisors Ltd. The company trades at a valuation of 5x revenue.","entities":["organization","numerical","location","commodity"],"includeOffsets":true,"performLookup":true}}; // AdvancedRequestRoot | 

// Call api endpoint
apiInstance.postAdvancedNerExtraction(advancedRequestRoot).then(
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
 **advancedRequestRoot** | [**AdvancedRequestRoot**](AdvancedRequestRoot.md)|  | 

### Return type

[**OutputRoot**](OutputRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

