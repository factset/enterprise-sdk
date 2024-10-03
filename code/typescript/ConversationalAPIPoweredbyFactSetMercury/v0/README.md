[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Conversational API Powered by FactSet Mercury client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v0.6.0-blue)](https://developer.factset.com/api-catalog/conversational-api-powered-factset-mercury)
[![npm](https://img.shields.io/npm/v/@factset/sdk-conversationalapipoweredbyfactsetmercury)](https://www.npmjs.com/package/@factset/sdk-conversationalapipoweredbyfactsetmercury)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

### OVERVIEW

The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.

Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.

If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.

We also encourage you to provide feedback on your responses using the `/feedback` endpoint!

**Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.

**Try the Conversational API and view Available Content**

In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.

Some of the prompts supported are:

- What is Tesla's enterprise value?
- Create a chart showing CME price relative to the S&P 500
- What were the highlights from Palantir's recent earnings call?

**Adaptive Card Format**

The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.

**STACH Format**

The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data.
<details>
  <summary><u>**STACH Example**</u></summary>
  ```json
  {
    \"version\": \"3.1\",
    \"table\": {
      \"primaryKeys\": [
        \"Insider Holders\",
        \"MV (M,$)\",
        \"% O/S\"
      ],
      \"totalNumRows\": 5
    },
    \"views\": [
      {
        \"name\": \"view\",
        \"displayName\": \"who are the suppliers of nike\",
        \"table\": {
          \"columns\": [
            \"Insider Holders\",
            \"MV (M,$)\",
            \"% O/S\"
          ],
          \"headers\": {
            \"Insider Holders\": \"Insider Holders\",
            \"MV (M,$)\": \"MV (M,$)\",
            \"% O/S\": \"% O/S\"
          }
        }
      }
    ],
    \"columns\": [
      {
        \"name\": \"Insider Holders\",
        \"contextualType\": \"string\",
        \"customMetadata\": {
          \"relevancy\": {
            \"contextualType\": \"int32\",
            \"value\": 100
          }
        }
      },
      {
        \"name\": \"MV (M,$)\",
        \"contextualType\": \"real\",
        \"customMetadata\": {
          \"relevancy\": {
            \"contextualType\": \"int32\",
            \"value\": 67
          }
        }
      },
      {
        \"name\": \"% O/S\",
        \"contextualType\": \"real\",
        \"customMetadata\": {
          \"relevancy\": {
            \"contextualType\": \"int32\",
            \"value\": 34
          }
        }
      }
    ],
    \"rows\": [
      {
        \"Insider Holders\": \"Knight Philip Hampson\",
        \"MV (M,$)\": 3156.8,
        \"% O/S\": 1.531
      },
      {
        \"Insider Holders\": \"Knight Travis A\",
        \"MV (M,$)\": 601.6,
        \"% O/S\": 0.496
      },
      {
        \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",
        \"MV (M,$)\": 225.5,
        \"% O/S\": 0.105
      },
      {
        \"Insider Holders\": \"Parker Mark G\",
        \"MV (M,$)\": 100.1,
        \"% O/S\": 0.056
      },
      {
        \"Insider Holders\": \"Donahoe John J Ii\",
        \"MV (M,$)\": 19.8,
        \"% O/S\": 0.018
      }
    ]
  }
  ```
</details>

**Citations**

Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources.
**Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document.
<details>
  <summary><u>**Citation Example**</u></summary>
  ```json
  {
    \"type\": \"string\",
    \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"
    \"citations\": {
      \"[1]\": [
        \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",
        \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",
        \"speakerInfo\": {
          \"companyId\": \"0016YD-E\",
          \"companyName\": \"FactSet Research Systems, Inc.\",
          \"speakerId\": \"0DPHLH-E\",
          \"speakerName\": \"Philip Snow\",
          \"speakerTitle\": \"Chief Executive Officer & Director\"
        },
        \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"
      ]
    }
  }
  ```
</details>


This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.6.0
- SDK version: 0.1.0
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 14

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-conversationalapipoweredbyfactsetmercury@0.1.0
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-conversationalapipoweredbyfactsetmercury@0.1.0
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Node.js environment
   1. Install and activate Node.js >=14. If you're using [nvm](https://github.com/nvm-sh/nvm):

      ```sh
      nvm install 16
      nvm use 16
      ```

   2. (optional) [Install yarn](https://yarnpkg.com/getting-started/install).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code


```javascript
const { ApiClient, DownloadApi } = require('@factset/sdk-conversationalapipoweredbyfactsetmercury');
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

const apiInstance = new DownloadApi();
const fileDownloadRequest = new conversationalapipoweredbyfactsetmercury.FileDownloadRequest(); // FileDownloadRequest | ID refers to the file ID in the NextStep action returned from the `/result` endpoint

// Call api endpoint
apiInstance.downloadFile(fileDownloadRequest).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/conversational/v0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*conversationalapipoweredbyfactsetmercury.DownloadApi* | [**downloadFile**](docs/DownloadApi.md#downloadFile) | **POST** /download/file | Retrieve data file based on file ID.
*conversationalapipoweredbyfactsetmercury.FeedbackApi* | [**sendFeedback**](docs/FeedbackApi.md#sendFeedback) | **POST** /feedback | Send feedback on the response to a query.
*conversationalapipoweredbyfactsetmercury.MultipleQuestionChatApi* | [**getChatResult**](docs/MultipleQuestionChatApi.md#getChatResult) | **POST** /result | Retrieve the completed response for your query.
*conversationalapipoweredbyfactsetmercury.MultipleQuestionChatApi* | [**getChatStatus**](docs/MultipleQuestionChatApi.md#getChatStatus) | **POST** /status | Retrieve the status of a chat response process.
*conversationalapipoweredbyfactsetmercury.MultipleQuestionChatApi* | [**queryChat**](docs/MultipleQuestionChatApi.md#queryChat) | **POST** /query | Create a query request for a given natural language query.


## Documentation for Models

 - [conversationalapipoweredbyfactsetmercury.AdaptiveCard](docs/AdaptiveCard.md)
 - [conversationalapipoweredbyfactsetmercury.AdaptiveCardBodyElement](docs/AdaptiveCardBodyElement.md)
 - [conversationalapipoweredbyfactsetmercury.AdaptiveCardData](docs/AdaptiveCardData.md)
 - [conversationalapipoweredbyfactsetmercury.ChatPollingRequest](docs/ChatPollingRequest.md)
 - [conversationalapipoweredbyfactsetmercury.ChatPollingRequestData](docs/ChatPollingRequestData.md)
 - [conversationalapipoweredbyfactsetmercury.Download](docs/Download.md)
 - [conversationalapipoweredbyfactsetmercury.Error](docs/Error.md)
 - [conversationalapipoweredbyfactsetmercury.ErrorObject](docs/ErrorObject.md)
 - [conversationalapipoweredbyfactsetmercury.FederationData](docs/FederationData.md)
 - [conversationalapipoweredbyfactsetmercury.FeedbackRequest](docs/FeedbackRequest.md)
 - [conversationalapipoweredbyfactsetmercury.FeedbackRequestData](docs/FeedbackRequestData.md)
 - [conversationalapipoweredbyfactsetmercury.FileDownloadRequest](docs/FileDownloadRequest.md)
 - [conversationalapipoweredbyfactsetmercury.FileDownloadRequestData](docs/FileDownloadRequestData.md)
 - [conversationalapipoweredbyfactsetmercury.NextStep](docs/NextStep.md)
 - [conversationalapipoweredbyfactsetmercury.NextStepItem](docs/NextStepItem.md)
 - [conversationalapipoweredbyfactsetmercury.OpenUrl](docs/OpenUrl.md)
 - [conversationalapipoweredbyfactsetmercury.OpenUrlUrl](docs/OpenUrlUrl.md)
 - [conversationalapipoweredbyfactsetmercury.Phrase](docs/Phrase.md)
 - [conversationalapipoweredbyfactsetmercury.PromptItem](docs/PromptItem.md)
 - [conversationalapipoweredbyfactsetmercury.PromptParameter](docs/PromptParameter.md)
 - [conversationalapipoweredbyfactsetmercury.PromptParameters](docs/PromptParameters.md)
 - [conversationalapipoweredbyfactsetmercury.QueryChatRequest](docs/QueryChatRequest.md)
 - [conversationalapipoweredbyfactsetmercury.QueryChatRequestData](docs/QueryChatRequestData.md)
 - [conversationalapipoweredbyfactsetmercury.QueryChatResponse](docs/QueryChatResponse.md)
 - [conversationalapipoweredbyfactsetmercury.QueryChatResponseData](docs/QueryChatResponseData.md)
 - [conversationalapipoweredbyfactsetmercury.QueryResponse](docs/QueryResponse.md)
 - [conversationalapipoweredbyfactsetmercury.QueryResponseData](docs/QueryResponseData.md)
 - [conversationalapipoweredbyfactsetmercury.RateLimitExceededError](docs/RateLimitExceededError.md)
 - [conversationalapipoweredbyfactsetmercury.ResponseString](docs/ResponseString.md)
 - [conversationalapipoweredbyfactsetmercury.SpeakerInfo](docs/SpeakerInfo.md)
 - [conversationalapipoweredbyfactsetmercury.StatusPollResponse](docs/StatusPollResponse.md)
 - [conversationalapipoweredbyfactsetmercury.StatusPollResponseData](docs/StatusPollResponseData.md)
 - [conversationalapipoweredbyfactsetmercury.SuggestedPrompts](docs/SuggestedPrompts.md)
 - [conversationalapipoweredbyfactsetmercury.Table](docs/Table.md)
 - [conversationalapipoweredbyfactsetmercury.TableData](docs/TableData.md)


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

Copyright 2022 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
