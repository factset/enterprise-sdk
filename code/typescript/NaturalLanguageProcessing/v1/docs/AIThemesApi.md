# naturallanguageprocessing.AIThemesApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**themesExtractThemes**](AIThemesApi.md#themesExtractThemes) | **POST** /themes | Endpoint to begin theme extraction job
[**themesGetStatus**](AIThemesApi.md#themesGetStatus) | **GET** /themes/{id}/status | Endpoint to get the completion status of a themes job
[**themesGetThemes**](AIThemesApi.md#themesGetThemes) | **GET** /themes/{id} | Endpoint to get a theme (and sentiments if requested) job result



## themesExtractThemes

> TaskRoot themesExtractThemes(themesParametersRoot)

Endpoint to begin theme extraction job

Endpoint to extract themes from provided text. Optionally, can include sentiment for each theme extracted. Please check the schema(s) for each of the status codes for more details.

### Example

```javascript
const { ApiClient, AIThemesApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AIThemesApi();
const themesParametersRoot = new naturallanguageprocessing.ThemesParametersRoot(); // ThemesParametersRoot | 

// Call api endpoint
apiInstance.themesExtractThemes(themesParametersRoot).then(
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
 **themesParametersRoot** | [**ThemesParametersRoot**](ThemesParametersRoot.md)|  | 

### Return type

[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## themesGetStatus

> TaskRoot themesGetStatus(id)

Endpoint to get the completion status of a themes job

Endpoint to obtain the completion status of the themes task request. The &#x60;id&#x60; parameter represents the task.

### Example

```javascript
const { ApiClient, AIThemesApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AIThemesApi();
const id = "id_example"; // String | Long running task identifier

// Call api endpoint
apiInstance.themesGetStatus(id).then(
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
 **id** | **String**| Long running task identifier | 

### Return type

[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## themesGetThemes

> ThemeSentimentsRoot themesGetThemes(id)

Endpoint to get a theme (and sentiments if requested) job result

Endpoint to obtain the results from the original themes task request. The &#x60;id&#x60; parameter represents the identifier of the task generated from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.

### Example

```javascript
const { ApiClient, AIThemesApi } = require('@factset/sdk-naturallanguageprocessing');
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

const apiInstance = new AIThemesApi();
const id = "id_example"; // String | Long running task identifier

// Call api endpoint
apiInstance.themesGetThemes(id).then(
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
 **id** | **String**| Long running task identifier | 

### Return type

[**ThemeSentimentsRoot**](ThemeSentimentsRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

