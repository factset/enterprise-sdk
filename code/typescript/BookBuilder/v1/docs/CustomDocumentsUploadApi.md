# bookbuilder.CustomDocumentsUploadApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadCustomDocument**](CustomDocumentsUploadApi.md#uploadCustomDocument) | **POST** /upload-custom-document | Upload a custom document



## uploadCustomDocument

> [Object] uploadCustomDocument(opts)

Upload a custom document

Upload any third-party documents that need to be included in the final PDF. Once uploaded, the successful response will be a unique fileurl that can be used to add the files to the PDF output using the create-book endpoint. Supported files include Powerpoint, Word, RTF, and PDF. The total size should not exceed 250MB and each file should not exceed 10MB. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, CustomDocumentsUploadApi } = require('@factset/sdk-bookbuilder');
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

const apiInstance = new CustomDocumentsUploadApi();
const opts = {
  'file': ["null"] // [File] | 
};

// Call api endpoint
apiInstance.uploadCustomDocument(opts).then(
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
 **file** | **[File]**|  | [optional] 

### Return type

**[Object]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

