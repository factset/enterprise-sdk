[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Natural Language Processing client library for Java

[![API Version](https://img.shields.io/badge/api-v1.3.0-blue)]()
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/naturallanguageprocessing/0.24.2)](https://central.sonatype.com/artifact/com.factset.sdk/naturallanguageprocessing/0.24.2)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.3.0
- SDK version: 0.24.2
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
  <artifactId>naturallanguageprocessing</artifactId>
  <version>0.24.2</version>
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
    implementation "com.factset.sdk:naturallanguageprocessing:0.24.2"
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
import com.factset.sdk.NaturalLanguageProcessing.*;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiTextSummarizationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class AiTextSummarizationApiExample {

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

        AiTextSummarizationApi apiInstance = new AiTextSummarizationApi(defaultClient);
        SummarizationRequest summarizationRequest = new SummarizationRequest(); // SummarizationRequest | 
        try {
            SummarizationResultID result = apiInstance.summarizationHeadline(summarizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AiTextSummarizationApi#summarizationHeadline");
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
import com.factset.sdk.NaturalLanguageProcessing.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiTextSummarizationApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

AiTextSummarizationApi apiInstance = new AiTextSummarizationApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AiTextSummarizationApi* | [**summarizationHeadline**](docs/AiTextSummarizationApi.md#summarizationHeadline) | **POST** /summarization/headline | Endpoint to generate a headline from text
*AiTextSummarizationApi* | [**summarizationHeadlineAndSummary**](docs/AiTextSummarizationApi.md#summarizationHeadlineAndSummary) | **POST** /summarization/headline-and-summary | Endpoint to summarize and generate a headline from text
*AiTextSummarizationApi* | [**summarizationResult**](docs/AiTextSummarizationApi.md#summarizationResult) | **GET** /summarization/result/{resultId} | Endpoint to obtain result of a particular summarization job
*AiTextSummarizationApi* | [**summarizationSummary**](docs/AiTextSummarizationApi.md#summarizationSummary) | **POST** /summarization/summary | Endpoint to summarize text
*AiThemesApi* | [**themesExtractThemes**](docs/AiThemesApi.md#themesExtractThemes) | **POST** /themes | Endpoint to begin theme extraction job
*AiThemesApi* | [**themesGetStatus**](docs/AiThemesApi.md#themesGetStatus) | **GET** /themes/{id}/status | Endpoint to get the completion status of a themes job
*AiThemesApi* | [**themesGetThemes**](docs/AiThemesApi.md#themesGetThemes) | **GET** /themes/{id} | Endpoint to get a theme (and sentiments if requested) job result
*NamedEntityRecognitionApi* | [**nerEntities**](docs/NamedEntityRecognitionApi.md#nerEntities) | **POST** /ner/entities | Endpoint to detect entities from text
*QuestionAnswerApi* | [**qnaGetAnswers**](docs/QuestionAnswerApi.md#qnaGetAnswers) | **GET** /qna/answers/{id} | Endpoint to get the answer(s)
*QuestionAnswerApi* | [**qnaGetStatus**](docs/QuestionAnswerApi.md#qnaGetStatus) | **GET** /qna/answers/{id}/status | Endpoint to get the completion status for a Q&amp;A request
*QuestionAnswerApi* | [**qnaPostQuestion**](docs/QuestionAnswerApi.md#qnaPostQuestion) | **POST** /qna/answers | Endpoint to submit a question for answer(s)


## Documentation for Models

 - [Error](docs/Error.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [HTTPError](docs/HTTPError.md)
 - [HTTPErrorRoot](docs/HTTPErrorRoot.md)
 - [NEREntity](docs/NEREntity.md)
 - [NEREntityList](docs/NEREntityList.md)
 - [NERInputDataSchema](docs/NERInputDataSchema.md)
 - [NERInputSchema](docs/NERInputSchema.md)
 - [NEROrganization](docs/NEROrganization.md)
 - [NERResponseSchema](docs/NERResponseSchema.md)
 - [QnAAnswer](docs/QnAAnswer.md)
 - [QnAAnswerParameters](docs/QnAAnswerParameters.md)
 - [QnAAnswerParametersRoot](docs/QnAAnswerParametersRoot.md)
 - [QnAAnswerRoot](docs/QnAAnswerRoot.md)
 - [SummarizationHTTPError](docs/SummarizationHTTPError.md)
 - [SummarizationRequest](docs/SummarizationRequest.md)
 - [SummarizationResult](docs/SummarizationResult.md)
 - [SummarizationResultID](docs/SummarizationResultID.md)
 - [Task](docs/Task.md)
 - [TaskRoot](docs/TaskRoot.md)
 - [ThemeSentiment](docs/ThemeSentiment.md)
 - [ThemeSentimentsRoot](docs/ThemeSentimentsRoot.md)
 - [ThemesParameters](docs/ThemesParameters.md)
 - [ThemesParametersRoot](docs/ThemesParametersRoot.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorDetail](docs/ValidationErrorDetail.md)
 - [ValidationErrorDetailLocation](docs/ValidationErrorDetailLocation.md)


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
