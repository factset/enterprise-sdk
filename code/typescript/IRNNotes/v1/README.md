[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# IRN Notes client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v1-blue)](https://developer.factset.com/api-catalog/irn-notes-api#apiDocumentation)
[![npm](https://img.shields.io/badge/npm-v4.0.1-orange)](https://www.npmjs.com/package/@factset/sdk-irnnotes/v/4.0.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allows users to extract, create, update and configure IRN data.

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1
- SDK version: 4.0.1
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 18

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-irnnotes@4.0.1
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-irnnotes@4.0.1
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
const { ApiClient, AttachmentsApi } = require('@factset/sdk-irnnotes');
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

const apiInstance = new AttachmentsApi();
const noteId = "noteId_example"; // String | Note Id
const file = "/path/to/file"; // File | 

// Call api endpoint
apiInstance.createAttachment(noteId, file).then(
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
const { ApiClient } = require('@factset/sdk-irnnotes');

const apiClient = ApiClient.instance;
apiClient.setProxyUrl('http://username:password@proxy.example.com:8080');
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/research/irn/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*irnnotes.AttachmentsApi* | [**createAttachment**](docs/AttachmentsApi.md#createAttachment) | **POST** /notes/{noteId}/attachments | Create an attachment for an existing note
*irnnotes.AttachmentsApi* | [**downloadAttachment**](docs/AttachmentsApi.md#downloadAttachment) | **GET** /notes/{noteId}/attachments/{attachmentId}/download | Download an attachment from a Note
*irnnotes.AttachmentsApi* | [**getAttachments**](docs/AttachmentsApi.md#getAttachments) | **GET** /notes/{noteId}/attachments | Get all the attachments belonging to a note
*irnnotes.AttachmentsApi* | [**softDeleteNoteAttachment**](docs/AttachmentsApi.md#softDeleteNoteAttachment) | **DELETE** /notes/{noteId}/attachments/{attachmentId} | Delete attachment from note
*irnnotes.CommentsApi* | [**createComment**](docs/CommentsApi.md#createComment) | **POST** /notes/{noteId}/comments | Create a comment to a Note
*irnnotes.CommentsApi* | [**createCommentAttachment**](docs/CommentsApi.md#createCommentAttachment) | **POST** /notes/{noteId}/comments/{commentId}/attachments | Create a comment attachment to a Note
*irnnotes.CommentsApi* | [**deleteComment**](docs/CommentsApi.md#deleteComment) | **DELETE** /notes/{noteId}/comments/{commentId} | Delete a Comment from a Note
*irnnotes.CommentsApi* | [**downloadCommentAttachmentForComment**](docs/CommentsApi.md#downloadCommentAttachmentForComment) | **GET** /notes/{noteId}/comments/{commentId}/attachments/{attachmentId}/download | Download single attachment detail of a comment belonging to a note
*irnnotes.CommentsApi* | [**getComment**](docs/CommentsApi.md#getComment) | **GET** /notes/{noteId}/comments/{commentId} | Get details of a comment belonging to a note
*irnnotes.CommentsApi* | [**getCommentAttachments**](docs/CommentsApi.md#getCommentAttachments) | **GET** /notes/{noteId}/comments/{commentId}/attachments | Get attachments summary of a comment belonging to a note
*irnnotes.CommentsApi* | [**getComments**](docs/CommentsApi.md#getComments) | **GET** /notes/{noteId}/comments | Get all comments for a note
*irnnotes.CommentsApi* | [**patchComment**](docs/CommentsApi.md#patchComment) | **PATCH** /notes/{noteId}/comments/{commentId} | Edit a comment for a note
*irnnotes.EventsApi* | [**getAllEvents**](docs/EventsApi.md#getAllEvents) | **GET** /events | Get all the record events in the specified date range filtered on the given types
*irnnotes.EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /notes/{noteId}/events | Get all the record events that belong to a note
*irnnotes.EventsApi* | [**getRecordEvent**](docs/EventsApi.md#getRecordEvent) | **GET** /notes/{noteId}/events/{recordEventId} | Get details of a record event of a note
*irnnotes.IdentifiersApi* | [**getIdentifiers**](docs/IdentifiersApi.md#getIdentifiers) | **GET** /identifiers | Get all the identifier details for given identifiers
*irnnotes.NotesApi* | [**createNote**](docs/NotesApi.md#createNote) | **POST** /notes | Create a note
*irnnotes.NotesApi* | [**deleteNote**](docs/NotesApi.md#deleteNote) | **DELETE** /notes/{noteId} | Delete a Note
*irnnotes.NotesApi* | [**getNote**](docs/NotesApi.md#getNote) | **GET** /notes/{noteId} | Get details of a note
*irnnotes.NotesApi* | [**getNotes**](docs/NotesApi.md#getNotes) | **GET** /notes | Get all the notes in the specified date range filtered on the given identifiers
*irnnotes.NotesApi* | [**updateNote**](docs/NotesApi.md#updateNote) | **PUT** /notes/{noteId} | Updates a note by replacing existing note with new data


## Documentation for Models

 - [irnnotes.AttachmentSummaryDto](docs/AttachmentSummaryDto.md)
 - [irnnotes.CommentDto](docs/CommentDto.md)
 - [irnnotes.CommentSummaryDto](docs/CommentSummaryDto.md)
 - [irnnotes.CreateBodyDto](docs/CreateBodyDto.md)
 - [irnnotes.CreateCommentDto](docs/CreateCommentDto.md)
 - [irnnotes.CreateCustomFieldValueDto](docs/CreateCustomFieldValueDto.md)
 - [irnnotes.CreateNoteDto](docs/CreateNoteDto.md)
 - [irnnotes.CustomFieldValueDto](docs/CustomFieldValueDto.md)
 - [irnnotes.EventSnippetDto](docs/EventSnippetDto.md)
 - [irnnotes.NewItemDto](docs/NewItemDto.md)
 - [irnnotes.NoteDto](docs/NoteDto.md)
 - [irnnotes.NoteEventDto](docs/NoteEventDto.md)
 - [irnnotes.NoteSummaryDto](docs/NoteSummaryDto.md)
 - [irnnotes.Operation](docs/Operation.md)
 - [irnnotes.OperationType](docs/OperationType.md)
 - [irnnotes.ProblemDetails](docs/ProblemDetails.md)
 - [irnnotes.RecordChangeDto](docs/RecordChangeDto.md)
 - [irnnotes.RecordEventSummaryDto](docs/RecordEventSummaryDto.md)
 - [irnnotes.RelatedRecordsDto](docs/RelatedRecordsDto.md)
 - [irnnotes.SubcommentSummaryDto](docs/SubcommentSummaryDto.md)
 - [irnnotes.UpdateNoteDto](docs/UpdateNoteDto.md)
 - [irnnotes.UserSerialDto](docs/UserSerialDto.md)
 - [irnnotes.UserTeamLookupDto](docs/UserTeamLookupDto.md)


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
