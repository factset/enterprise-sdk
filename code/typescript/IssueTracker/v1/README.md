[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Issue Tracker client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v1.4.0-blue)](https://developer.factset.com/api-catalog/issue-tracker-api)
[![npm](https://img.shields.io/badge/npm-v0.6.0-orange)](https://www.npmjs.com/package/@factset/sdk-issuetracker/v/0.6.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

This API is used to file issues

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.4.0
- SDK version: 0.6.0
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 18

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-issuetracker@0.6.0
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-issuetracker@0.6.0
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Node.js environment
   1. Install and activate Node.js >=18. If you're using [nvm](https://github.com/nvm-sh/nvm):

      ```sh
      nvm install 18
      nvm use 18
      ```

   2. (optional) [Install yarn](https://yarnpkg.com/getting-started/install).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code


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


## Using a Proxy

To add a HTTP proxy for the API client, you can set the proxyUrl for the ApiClient instance:

```javascript
const { ApiClient } = require('@factset/sdk-issuetracker');

const apiClient = ApiClient.instance;
apiClient.setProxyUrl('http://username:password@proxy.example.com:8080');
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*issuetracker.AttachmentApi* | [**getFileAttachment**](docs/AttachmentApi.md#getFileAttachment) | **GET** /attachments/{id}/{name} | get the matched file attachment
*issuetracker.AttachmentApi* | [**getFileExtensions**](docs/AttachmentApi.md#getFileExtensions) | **GET** /attachments/file-extensions | Allowed file types GET endpoint
*issuetracker.AttachmentApi* | [**postFileAttachment**](docs/AttachmentApi.md#postFileAttachment) | **POST** /attachments | Post file attachment to Issue Tracker Issue or comment
*issuetracker.IssueApi* | [**getIssue**](docs/IssueApi.md#getIssue) | **GET** /issues/{id} | Get the matched issue details
*issuetracker.IssueApi* | [**patchIssue**](docs/IssueApi.md#patchIssue) | **PATCH** /issues/{id} | Update severity and subject of issue or productId and categoryId of issue
*issuetracker.IssueApi* | [**postIssue**](docs/IssueApi.md#postIssue) | **POST** /issues | Creates a Issue Tracker issue
*issuetracker.IssueApi* | [**postReply**](docs/IssueApi.md#postReply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue


## Documentation for Models

 - [issuetracker.Attachment](docs/Attachment.md)
 - [issuetracker.AttachmentResponse](docs/AttachmentResponse.md)
 - [issuetracker.Comment](docs/Comment.md)
 - [issuetracker.CommentRequest](docs/CommentRequest.md)
 - [issuetracker.CommentRequestData](docs/CommentRequestData.md)
 - [issuetracker.Error](docs/Error.md)
 - [issuetracker.ErrorResponse](docs/ErrorResponse.md)
 - [issuetracker.FileExtension](docs/FileExtension.md)
 - [issuetracker.IdResponse](docs/IdResponse.md)
 - [issuetracker.IdResponseData](docs/IdResponseData.md)
 - [issuetracker.Issue](docs/Issue.md)
 - [issuetracker.IssueData](docs/IssueData.md)
 - [issuetracker.IssueRequest](docs/IssueRequest.md)
 - [issuetracker.IssueRequestData](docs/IssueRequestData.md)
 - [issuetracker.UpdateIssueRequest](docs/UpdateIssueRequest.md)
 - [issuetracker.UpdateIssueRequestData](docs/UpdateIssueRequestData.md)


## Documentation for Authorization



### FactSetApiKey

- **Type**: HTTP basic authentication



### FactSetOAuth2


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


# Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

# Copyright

Copyright 2025 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
