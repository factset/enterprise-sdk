[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Mergers and Acquisitions client library for Java

[![API Version](https://img.shields.io/badge/api-v1.1.0-blue)](https://developer.factset.com/api-catalog/factset-mergers-acquisitions-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/factsetmergersandacquisitions/1.1.0)](https://central.sonatype.com/artifact/com.factset.sdk/factsetmergersandacquisitions/1.1.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.

  Monetary values returned by this API are converted and represented in USD.

  This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests.


This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.1.0
- SDK version: 1.1.0
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
  <artifactId>factsetmergersandacquisitions</artifactId>
  <version>1.1.0</version>
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
    implementation "com.factset.sdk:factsetmergersandacquisitions:1.1.0"
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
import com.factset.sdk.FactSetMergersandAcquisitions.*;
import com.factset.sdk.FactSetMergersandAcquisitions.auth.*;
import com.factset.sdk.FactSetMergersandAcquisitions.models.*;
import com.factset.sdk.FactSetMergersandAcquisitions.api.DealsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class DealsApiExample {

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

        DealsApi apiInstance = new DealsApi(defaultClient);
        DealsRequest dealsRequest = new DealsRequest(); // DealsRequest | Request object for `Deals`.
        try {
            DealsResponse result = apiInstance.getDealsByCompanyList(dealsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#getDealsByCompanyList");
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
import com.factset.sdk.FactSetMergersandAcquisitions.*;
import com.factset.sdk.FactSetMergersandAcquisitions.api.DealsApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

DealsApi apiInstance = new DealsApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.FactSetMergersandAcquisitions.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content/factset-mergers-acquisitions/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DealsApi* | [**getDealsByCompanyList**](docs/DealsApi.md#getDealsByCompanyList) | **POST** /deals/by-company | Returns details for a list of companies.
*DealsApi* | [**getDealsDetailsList**](docs/DealsApi.md#getDealsDetailsList) | **POST** /deals/details | Returns details for specified deals.
*DealsApi* | [**getPublicTargetDealsList**](docs/DealsApi.md#getPublicTargetDealsList) | **POST** /deals/public-targets | Returns a list of deals in which the target is a public company.


## Documentation for Models

 - [AdvisorParticipant](docs/AdvisorParticipant.md)
 - [Advisors](docs/Advisors.md)
 - [BuyersAdvisor](docs/BuyersAdvisor.md)
 - [DealCompany](docs/DealCompany.md)
 - [DealPublic](docs/DealPublic.md)
 - [DealValue](docs/DealValue.md)
 - [DealsPublicRequest](docs/DealsPublicRequest.md)
 - [DealsPublicRequestBody](docs/DealsPublicRequestBody.md)
 - [DealsPublicResponse](docs/DealsPublicResponse.md)
 - [DealsRequest](docs/DealsRequest.md)
 - [DealsRequestBody](docs/DealsRequestBody.md)
 - [DealsResponse](docs/DealsResponse.md)
 - [Detail](docs/Detail.md)
 - [DetailsRequest](docs/DetailsRequest.md)
 - [DetailsRequestBody](docs/DetailsRequestBody.md)
 - [DetailsResponse](docs/DetailsResponse.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Participant](docs/Participant.md)
 - [SellersAdvisor](docs/SellersAdvisor.md)
 - [Status](docs/Status.md)
 - [Target](docs/Target.md)


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
