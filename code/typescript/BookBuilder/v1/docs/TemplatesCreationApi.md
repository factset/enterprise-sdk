# bookbuilder.TemplatesCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplatesCreationApi.md#createTemplate) | **POST** /create-template | Kick off request to create template with reports of your choice



## createTemplate

> EnableTemplateInfoPost createTemplate(createTemplatePostRequest)

Kick off request to create template with reports of your choice

This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, TemplatesCreationApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new TemplatesCreationApi();
const createTemplatePostRequest = {"tmpl_name":"Quick Financials","tmpl_type":"public","content":[{"section_id":"COMPANY_OVERVIEW","reports":["COMPANY_SNAPSHOT_IB","COMPANY_SNAPSHOT_IM","ENTITY_STRUCTURE","SNP_REPORT"]}]}; // CreateTemplatePostRequest | 

// Call api endpoint
apiInstance.createTemplate(createTemplatePostRequest).then(
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
 **createTemplatePostRequest** | [**CreateTemplatePostRequest**](CreateTemplatePostRequest.md)|  | 

### Return type

[**EnableTemplateInfoPost**](EnableTemplateInfoPost.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

