# naturallanguageprocessing.ThemesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitiveNlpV1ThemesPost**](ThemesApi.md#cognitiveNlpV1ThemesPost) | **POST** /cognitive/nlp/v1/themes | POST request to extract themes from text



## cognitiveNlpV1ThemesPost

> ThemesRoot cognitiveNlpV1ThemesPost(themeParametersRoot)

POST request to extract themes from text

This endpoint extracts themes from unstructured text. Each theme (&#x60;themeText&#x60;) is also given a score (&#x60;themeScore&#x60;). This score shows the relevancy of the theme within the text.  Example Output: &#x60;&#x60;&#x60;json {   \&quot;data\&quot;: [   {     \&quot;themeText\&quot;: \&quot;home entertainment results\&quot;,     \&quot;themeScore\&quot;: 0.92   },   {     \&quot;themeText\&quot;: \&quot;.....\&quot;,     \&quot;themeScore\&quot;: .....   }] } &#x60;&#x60;&#x60; 

### Example

```javascript
const { ApiClient, ThemesApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new ThemesApi();
const themeParametersRoot = new naturallanguageprocessing.ThemeParametersRoot(); // ThemeParametersRoot | 

// Call api endpoint
apiInstance.cognitiveNlpV1ThemesPost(themeParametersRoot).then(
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
 **themeParametersRoot** | [**ThemeParametersRoot**](ThemeParametersRoot.md)|  | 

### Return type

[**ThemesRoot**](ThemesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

