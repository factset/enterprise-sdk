# issuetracker.AttachmentApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileAttachment**](AttachmentApi.md#getFileAttachment) | **GET** /attachments/{id}/{name} | get the matched file attachment
[**getFileExtensions**](AttachmentApi.md#getFileExtensions) | **GET** /attachments/file-extensions | Allowed file types GET endpoint
[**postFileAttachment**](AttachmentApi.md#postFileAttachment) | **POST** /attachments | Post file attachment to Issue Tracker Issue or comment



## getFileAttachment

> File getFileAttachment(id, name)

get the matched file attachment

It retreive matched file. However, File read won&#39;t work until it used in any issue tracker issue/comment.     Note: the Accept header gets ignored and the originally uploaded content-type is returned

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AttachmentApi } = require('@factset/sdk-issuetracker');
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

const apiInstance = new AttachmentApi();
const id = "id_example"; // String | identity value of file attachment
const name = "name_example"; // String | name of the file

// Call api endpoint
apiInstance.getFileAttachment(id, name).then(
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
 **id** | **String**| identity value of file attachment | 
 **name** | **String**| name of the file | 

### Return type

**File**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/bmp, image/png, image/gif, image/jpeg, application/pdf, text/csv, application/vnd.openxmlformats-officedocument.wordprocessingml.document, text/plain, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/x-r-source, application/x-dosexec, text/html, application/xml, application/sql, application/vnd.ms-officetheme, application/msword, application/vnd.openxmlformats-officedocument.wordprocessingml.template, application/vnd.openxmlformats-officedocument.presentationml.template, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/zip, application/x-7z-compressed, application/octet-stream, text/tab-separated-values, application/x-iwork-keynote, application/vnd.ms-word.document.macroEnabled.12, application/vnd.ms-word.template.macroEnabled.12, application/vnd.ms-excel.sheet.macroEnabled.12, application/json


## getFileExtensions

> FileExtension getFileExtensions()

Allowed file types GET endpoint

This will provide information about file extensions allowed to attachments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AttachmentApi } = require('@factset/sdk-issuetracker');
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

const apiInstance = new AttachmentApi();

// Call api endpoint
apiInstance.getFileExtensions().then(
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

This endpoint does not need any parameter.

### Return type

[**FileExtension**](FileExtension.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## postFileAttachment

> AttachmentResponse postFileAttachment(file)

Post file attachment to Issue Tracker Issue or comment

  This endpoint upload file attachments into Issue Tracker and it allows only single file at a time. It will throws error when tries to upload multiple files in single call.     File size should not exceed 10Mb. More info provided in examples. It allows only few type of files for attachments. Please review \&quot;attachments/file-extensions\&quot; endpoint for list allowed file types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, AttachmentApi } = require('@factset/sdk-issuetracker');
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

const apiInstance = new AttachmentApi();
const file = "/path/to/file"; // File | input file for upload

// Call api endpoint
apiInstance.postFileAttachment(file).then(
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
 **file** | **File**| input file for upload | 

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/plain

