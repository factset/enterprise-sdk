[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Analytics Datastore client library for Java

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)](https://developer.factset.com/api-catalog/analytics-datastore-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/analyticsdatastore/0.23.2)](https://central.sonatype.com/artifact/com.factset.sdk/analyticsdatastore/0.23.2)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allow clients to fetch precalculated Analytics through predeterministic URLs.

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 0.23.2
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
  <artifactId>analyticsdatastore</artifactId>
  <version>0.23.2</version>
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
    implementation "com.factset.sdk:analyticsdatastore:0.23.2"
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
import com.factset.sdk.AnalyticsDatastore.*;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.DocumentsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class DocumentsApiExample {

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

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        DocumentRequest documentRequest = new DocumentRequest(); // DocumentRequest | Example request of a filtered Documents search call
        try {
            DocumentListResponse result = apiInstance.getDocumentsEndPoint(documentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#getDocumentsEndPoint");
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
import com.factset.sdk.AnalyticsDatastore.*;
import com.factset.sdk.AnalyticsDatastore.api.DocumentsApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

DocumentsApi apiInstance = new DocumentsApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.AnalyticsDatastore.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**getDocumentsEndPoint**](docs/DocumentsApi.md#getDocumentsEndPoint) | **POST** /analytics/pub-datastore/tag-search/v1/documents/search | Gets a list of Documents that a user has access to.
*DocumentsApi* | [**getProductTypes**](docs/DocumentsApi.md#getProductTypes) | **POST** /analytics/pub-datastore/tag-search/v1/product-types/search | Gets a list of product types that a user has access to.
*DocumentsApi* | [**getSingleTagEndPoint**](docs/DocumentsApi.md#getSingleTagEndPoint) | **GET** /analytics/pub-datastore/tag-search/v1/tags/{name} | Get a single tag definition based on its name
*DocumentsApi* | [**getTagValuesEndPoint**](docs/DocumentsApi.md#getTagValuesEndPoint) | **POST** /analytics/pub-datastore/tag-search/v1/tags/{name}/values | Gets a list of tag values for the given name
*DocumentsApi* | [**getTagsEndPoint**](docs/DocumentsApi.md#getTagsEndPoint) | **GET** /analytics/pub-datastore/tag-search/v1/tags | Gets a list of tag definitions for the user.
*MappingsApi* | [**getInsightMapping**](docs/MappingsApi.md#getInsightMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{configId}/{date} | Redirects to the underlying Insight/Vault data in a Stach format.
*MappingsApi* | [**getPdfPptMapping**](docs/MappingsApi.md#getPdfPptMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{accountId}/{date} | Redirects to the raw PPT/PDF output created by the Publisher service.
*MappingsApi* | [**getStachMapping**](docs/MappingsApi.md#getStachMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{date} | Redirects to the underlying PA/SPAR data represented in a Stach format.
*MappingsApi* | [**getStachMappingNoDate**](docs/MappingsApi.md#getStachMappingNoDate) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId} | Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.
*ObjectsApi* | [**getCargoEndpoint**](docs/ObjectsApi.md#getCargoEndpoint) | **GET** /analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId} | Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.


## Documentation for Models

 - [DocumentListResponse](docs/DocumentListResponse.md)
 - [DocumentModel](docs/DocumentModel.md)
 - [DocumentRequest](docs/DocumentRequest.md)
 - [DocumentRequestData](docs/DocumentRequestData.md)
 - [MetaModel](docs/MetaModel.md)
 - [MetaModelPagination](docs/MetaModelPagination.md)
 - [MetaRequestModel](docs/MetaRequestModel.md)
 - [MetaRequestModelPagination](docs/MetaRequestModelPagination.md)
 - [ProductTypeListResponse](docs/ProductTypeListResponse.md)
 - [StringOrNumberTagValue](docs/StringOrNumberTagValue.md)
 - [TagFilterModel](docs/TagFilterModel.md)
 - [TagFilterModelData](docs/TagFilterModelData.md)
 - [TagListResponse](docs/TagListResponse.md)
 - [TagModel](docs/TagModel.md)
 - [TagResponse](docs/TagResponse.md)
 - [TagValuesListResponse](docs/TagValuesListResponse.md)


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
