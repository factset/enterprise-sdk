# paengine.LinkedPATemplatesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLinkedPATemplates**](LinkedPATemplatesApi.md#createLinkedPATemplates) | **POST** /analytics/engines/pa/v3/linked-templates | Create a linked PA template
[**deleteLinkedPATemplates**](LinkedPATemplatesApi.md#deleteLinkedPATemplates) | **DELETE** /analytics/engines/pa/v3/linked-templates/{id} | Delete a linked PA template.
[**getLinkedPATemplates**](LinkedPATemplatesApi.md#getLinkedPATemplates) | **GET** /analytics/engines/pa/v3/linked-templates | Get linked PA templates
[**getLinkedPATemplatesById**](LinkedPATemplatesApi.md#getLinkedPATemplatesById) | **GET** /analytics/engines/pa/v3/linked-templates/{id} | Get linked PA template by id
[**updateLinkedPATemplates**](LinkedPATemplatesApi.md#updateLinkedPATemplates) | **PUT** /analytics/engines/pa/v3/linked-templates/{id} | Update a linked PA template



## createLinkedPATemplates

> LinkedPATemplatePostSummaryRoot createLinkedPATemplates(linkedPATemplateParametersRoot)

Create a linked PA template

This endpoint creates a template from an **existing portfolio analysis tile**, allowing the user to replicate and fetch reports settings.    Remarks:    *   Mandatory fields are required to be passed in POST requests and Optional fields are not necessary.       If no mandatory fields are passed, then we can use the template as a component and skip the component creation.        *   Mandatory, optional and locked fields can be  \&quot;accounts\&quot;, \&quot;benchmarks\&quot;, \&quot;groups\&quot;, \&quot;columns\&quot;, \&quot;datasources\&quot;, \&quot;dates\&quot;, \&quot;currencyisocode\&quot; and \&quot;componentdetail\&quot;.    *   We cannot override the Locked fields when creating the Component.    *   Mandatory and locked strings are mutually exclusive.    *   Multi-horizon frequencies are not supported through this endpoint.

### Example

```javascript
const { ApiClient, LinkedPATemplatesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new LinkedPATemplatesApi();
const linkedPATemplateParametersRoot = {"data":{"directory":"Personal:LinkedPATemplates/","parentComponentId":"801B800245E468A52AEBEC4BE31CFF5AF82F371DAEF5F158AC2E98C2FA324B46","description":"This is a linked PA template that only returns security level data","content":{"mandatory":["accounts","benchmarks"],"optional":["groups","columns"],"locked":["componentdetail"]}}}; // LinkedPATemplateParametersRoot | Request Parameters

// Call api endpoint
apiInstance.createLinkedPATemplates(linkedPATemplateParametersRoot).then(
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
 **linkedPATemplateParametersRoot** | [**LinkedPATemplateParametersRoot**](LinkedPATemplateParametersRoot.md)| Request Parameters | 

### Return type

[**LinkedPATemplatePostSummaryRoot**](LinkedPATemplatePostSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteLinkedPATemplates

> deleteLinkedPATemplates(id)

Delete a linked PA template.

This endpoint deletes an existing linked PA template.

### Example

```javascript
const { ApiClient, LinkedPATemplatesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new LinkedPATemplatesApi();
const id = "'01234567890123456789012345678901'"; // String | Unique identifier for a linked PA template

// Call api endpoint
apiInstance.deleteLinkedPATemplates(id).then(
  () => {
    console.log('API called successfully.');
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Unique identifier for a linked PA template | [default to &#39;01234567890123456789012345678901&#39;]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


## getLinkedPATemplates

> LinkedPATemplateSummaryRoot getLinkedPATemplates(opts)

Get linked PA templates

This endpoint returns the list of linked PA templates in given path.

### Example

```javascript
const { ApiClient, LinkedPATemplatesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new LinkedPATemplatesApi();
const opts = {
  'directory': "'Personal:LinkedPATemplates/'", // String | Get linked PA templates in path.
  'documentDirectory': "documentDirectory_example", // String | Get linked PA templates for documents in document path
  'documentName': "documentName_example" // String | Get linked PA templates for documents by document name
};

// Call api endpoint
apiInstance.getLinkedPATemplates(opts).then(
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
 **directory** | **String**| Get linked PA templates in path. | [optional] [default to &#39;Personal:LinkedPATemplates/&#39;]
 **documentDirectory** | **String**| Get linked PA templates for documents in document path | [optional] 
 **documentName** | **String**| Get linked PA templates for documents by document name | [optional] 

### Return type

[**LinkedPATemplateSummaryRoot**](LinkedPATemplateSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLinkedPATemplatesById

> LinkedPATemplateRoot getLinkedPATemplatesById(id)

Get linked PA template by id

This endpoint fetches the linked PA template settings.

### Example

```javascript
const { ApiClient, LinkedPATemplatesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new LinkedPATemplatesApi();
const id = "'01234567890123456789012345678901'"; // String | Unique identifier for a linked PA template

// Call api endpoint
apiInstance.getLinkedPATemplatesById(id).then(
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
 **id** | **String**| Unique identifier for a linked PA template | [default to &#39;01234567890123456789012345678901&#39;]

### Return type

[**LinkedPATemplateRoot**](LinkedPATemplateRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateLinkedPATemplates

> LinkedPATemplatePostSummaryRoot updateLinkedPATemplates(id, linkedPATemplateUpdateParametersRoot)

Update a linked PA template

This endpoint allows the user to change the request body and description from an existing template.    Remarks:    *   Mandatory fields are required to be passed in POST requests and Optional fields are not necessary.       If no mandatory fields are passed, then we can use the template as a component and skip the component creation.        *   Mandatory, optional and locked fields can be  \&quot;accounts\&quot;, \&quot;benchmarks\&quot;, \&quot;groups\&quot;, \&quot;columns\&quot;, \&quot;datasources\&quot;, \&quot;dates\&quot;, \&quot;currencyisocode\&quot; and \&quot;componentdetail\&quot;.    *   We cannot override the Locked fields when creating the Component.    *   Mandatory and locked strings are mutually exclusive.    *   Multi-horizon frequencies are not supported through this endpoint.

### Example

```javascript
const { ApiClient, LinkedPATemplatesApi } = require('@factset/sdk-paengine');
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

const apiInstance = new LinkedPATemplatesApi();
const id = "'01234567890123456789012345678901'"; // String | Unique identifier for a linked PA template
const linkedPATemplateUpdateParametersRoot = {"data":{"parentComponentId":"801B800245E468A52AEBEC4BE31CFF5AF82F371DAEF5F158AC2E98C2FA324B46","description":"This is a linked PA template that only returns security level data","content":{"mandatory":["accounts","benchmarks"],"optional":["groups","columns"],"locked":["componentdetail"]}}}; // LinkedPATemplateUpdateParametersRoot | Request Parameters

// Call api endpoint
apiInstance.updateLinkedPATemplates(id, linkedPATemplateUpdateParametersRoot).then(
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
 **id** | **String**| Unique identifier for a linked PA template | [default to &#39;01234567890123456789012345678901&#39;]
 **linkedPATemplateUpdateParametersRoot** | [**LinkedPATemplateUpdateParametersRoot**](LinkedPATemplateUpdateParametersRoot.md)| Request Parameters | 

### Return type

[**LinkedPATemplatePostSummaryRoot**](LinkedPATemplatePostSummaryRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

