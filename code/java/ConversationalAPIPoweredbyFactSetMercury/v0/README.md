[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Conversational API Powered by FactSet Mercury client library for Java

[![API Version](https://img.shields.io/badge/api-v0.6.0-blue)](https://developer.factset.com/api-catalog/conversational-api-powered-factset-mercury)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/conversationalapipoweredbyfactsetmercury)](https://search.maven.org/artifact/com.factset.sdk/conversationalapipoweredbyfactsetmercury)
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


This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.6.0
- SDK version: 0.1.1
- Build package: org.openapitools.codegen.languages.JavaClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Java JDK >= 1.8

## Installation

### Maven

Add these dependencies to your project's POM:

```xml
<dependency>
  <groupId>com.factset.sdk</groupId>
  <artifactId>utils</artifactId>
  <version>1.1.0</version>
</dependency>
<dependency>
  <groupId>com.factset.sdk</groupId>
  <artifactId>conversationalapipoweredbyfactsetmercury</artifactId>
  <version>0.1.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle

Add these dependencies to your project's build file:

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
    implementation "com.factset.sdk:utils:1.1.0"
    implementation "com.factset.sdk:conversationalapipoweredbyfactsetmercury:0.1.1"
  }
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Java environment.
   1. Install and activate Java 1.8+
   2. Install [maven](https://maven.apache.org/install.html) or [gradle](https://gradle.org/install/)
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```java
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.auth.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api.DownloadApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class DownloadApiExample {

    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        DownloadApi apiInstance = new DownloadApi(defaultClient);
        FileDownloadRequest fileDownloadRequest = new FileDownloadRequest(); // FileDownloadRequest | ID refers to the file ID in the NextStep action returned from the `/result` endpoint
        try {
            File result = apiInstance.downloadFile(fileDownloadRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DownloadApi#downloadFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Using a Proxy

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api.DownloadApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

DownloadApi apiInstance = new DownloadApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/conversational/v0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DownloadApi* | [**downloadFile**](docs/DownloadApi.md#downloadFile) | **POST** /download/file | Retrieve data file based on file ID.
*FeedbackApi* | [**sendFeedback**](docs/FeedbackApi.md#sendFeedback) | **POST** /feedback | Send feedback on the response to a query.
*MultipleQuestionChatApi* | [**getChatResult**](docs/MultipleQuestionChatApi.md#getChatResult) | **POST** /result | Retrieve the completed response for your query.
*MultipleQuestionChatApi* | [**getChatStatus**](docs/MultipleQuestionChatApi.md#getChatStatus) | **POST** /status | Retrieve the status of a chat response process.
*MultipleQuestionChatApi* | [**queryChat**](docs/MultipleQuestionChatApi.md#queryChat) | **POST** /query | Create a query request for a given natural language query.


## Documentation for Models

 - [AdaptiveCard](docs/AdaptiveCard.md)
 - [AdaptiveCardBodyElement](docs/AdaptiveCardBodyElement.md)
 - [AdaptiveCardData](docs/AdaptiveCardData.md)
 - [ChatPollingRequest](docs/ChatPollingRequest.md)
 - [ChatPollingRequestData](docs/ChatPollingRequestData.md)
 - [Download](docs/Download.md)
 - [Error](docs/Error.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [FederationData](docs/FederationData.md)
 - [FeedbackRequest](docs/FeedbackRequest.md)
 - [FeedbackRequestData](docs/FeedbackRequestData.md)
 - [FileDownloadRequest](docs/FileDownloadRequest.md)
 - [FileDownloadRequestData](docs/FileDownloadRequestData.md)
 - [NextStep](docs/NextStep.md)
 - [NextStepItem](docs/NextStepItem.md)
 - [OpenUrl](docs/OpenUrl.md)
 - [OpenUrlUrl](docs/OpenUrlUrl.md)
 - [Phrase](docs/Phrase.md)
 - [PromptItem](docs/PromptItem.md)
 - [PromptParameter](docs/PromptParameter.md)
 - [PromptParameters](docs/PromptParameters.md)
 - [QueryChatRequest](docs/QueryChatRequest.md)
 - [QueryChatRequestData](docs/QueryChatRequestData.md)
 - [QueryChatResponse](docs/QueryChatResponse.md)
 - [QueryChatResponseData](docs/QueryChatResponseData.md)
 - [QueryResponse](docs/QueryResponse.md)
 - [QueryResponseData](docs/QueryResponseData.md)
 - [RateLimitExceededError](docs/RateLimitExceededError.md)
 - [ResponseString](docs/ResponseString.md)
 - [SpeakerInfo](docs/SpeakerInfo.md)
 - [StatusPollResponse](docs/StatusPollResponse.md)
 - [StatusPollResponseData](docs/StatusPollResponseData.md)
 - [SuggestedPrompts](docs/SuggestedPrompts.md)
 - [Table](docs/Table.md)
 - [TableData](docs/TableData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### FactSetApiKey


- **Type**: HTTP basic authentication

### FactSetOAuth2


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multi-threaded environment to avoid any potential issues.

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
