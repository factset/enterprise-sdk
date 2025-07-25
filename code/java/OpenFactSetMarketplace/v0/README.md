[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Open:FactSet Marketplace client library for Java

[![API Version](https://img.shields.io/badge/api-v0.1.0-blue)](https://developer.factset.com/api-catalog/openfactset-marketplace-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/openfactsetmarketplace/0.0.1)](https://central.sonatype.com/artifact/com.factset.sdk/openfactsetmarketplace/0.0.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

This API provides read-only access to marketplace products and partners.

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.1.0
- SDK version: 0.0.1
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
  <artifactId>openfactsetmarketplace</artifactId>
  <version>0.0.1</version>
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
    implementation "com.factset.sdk:openfactsetmarketplace:0.0.1"
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
import com.factset.sdk.OpenFactSetMarketplace.*;
import com.factset.sdk.OpenFactSetMarketplace.auth.*;
import com.factset.sdk.OpenFactSetMarketplace.models.*;
import com.factset.sdk.OpenFactSetMarketplace.api.PartnersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class PartnersApiExample {

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

        PartnersApi apiInstance = new PartnersApi(defaultClient);
        String id = "id_example"; // String | ID of the product or partner
        try {
            PartnerSuccessResponse result = apiInstance.getPartnerById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartnersApi#getPartnerById");
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
import com.factset.sdk.OpenFactSetMarketplace.*;
import com.factset.sdk.OpenFactSetMarketplace.api.PartnersApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

PartnersApi apiInstance = new PartnersApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.OpenFactSetMarketplace.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/ofs/v0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PartnersApi* | [**getPartnerById**](docs/PartnersApi.md#getPartnerById) | **GET** /partner/{id} | 
*PartnersApi* | [**getPartners**](docs/PartnersApi.md#getPartners) | **GET** /partners | 
*ProductsApi* | [**getProductById**](docs/ProductsApi.md#getProductById) | **GET** /product/{id} | 
*ProductsApi* | [**getProducts**](docs/ProductsApi.md#getProducts) | **GET** /products | 


## Documentation for Models

 - [AttributesGroupsItem](docs/AttributesGroupsItem.md)
 - [DocumentsItems](docs/DocumentsItems.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Meta](docs/Meta.md)
 - [MetaPagination](docs/MetaPagination.md)
 - [Partner](docs/Partner.md)
 - [PartnerAddress](docs/PartnerAddress.md)
 - [PartnerSocialMedia](docs/PartnerSocialMedia.md)
 - [PartnerSuccessResponse](docs/PartnerSuccessResponse.md)
 - [PartnersSuccessResponse](docs/PartnersSuccessResponse.md)
 - [Product](docs/Product.md)
 - [ProductPartner](docs/ProductPartner.md)
 - [ProductSuccessResponse](docs/ProductSuccessResponse.md)
 - [ProductsSuccessResponse](docs/ProductsSuccessResponse.md)
 - [RelatedProducts](docs/RelatedProducts.md)
 - [ThirdPartyUrls](docs/ThirdPartyUrls.md)


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
