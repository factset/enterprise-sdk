[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Barra Portfolio Optimizer client library for Java

[![API Version](https://img.shields.io/badge/api-v3-blue)]()
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/barraportfoliooptimizer/0.22.2)](https://central.sonatype.com/artifact/com.factset.sdk/barraportfoliooptimizer/0.22.2)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allow clients to fetch Analytics through APIs.

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3
- SDK version: 0.22.2
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
  <artifactId>barraportfoliooptimizer</artifactId>
  <version>0.22.2</version>
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
    implementation "com.factset.sdk:barraportfoliooptimizer:0.22.2"
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
import com.factset.sdk.BarraPortfolioOptimizer.*;
import com.factset.sdk.BarraPortfolioOptimizer.auth.*;
import com.factset.sdk.BarraPortfolioOptimizer.models.*;
import com.factset.sdk.BarraPortfolioOptimizer.api.AccountsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class AccountsApiExample {

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

        AccountsApi apiInstance = new AccountsApi(defaultClient);
        String path = "Client:Foo/Bar"; // String | The directory to get the accounts and sub-directories in
        try {
            AccountDirectoriesRoot result = apiInstance.getAccounts(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccounts");
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
import com.factset.sdk.BarraPortfolioOptimizer.*;
import com.factset.sdk.BarraPortfolioOptimizer.api.AccountsApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

AccountsApi apiInstance = new AccountsApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.BarraPortfolioOptimizer.ApiClient;

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
*AccountsApi* | [**getAccounts**](docs/AccountsApi.md#getAccounts) | **GET** /analytics/lookups/v3/accounts/{path} | Get accounts and sub-directories in a directory
*BpmOptimizerApi* | [**cancelOptimizationById**](docs/BpmOptimizerApi.md#cancelOptimizationById) | **DELETE** /analytics/engines/bpm/v3/optimizations/{id} | Cancel BPM optimization by id
*BpmOptimizerApi* | [**getOptimizationParameters**](docs/BpmOptimizerApi.md#getOptimizationParameters) | **GET** /analytics/engines/bpm/v3/optimizations/{id} | Get BPM optimization parameters by id
*BpmOptimizerApi* | [**getOptimizationResult**](docs/BpmOptimizerApi.md#getOptimizationResult) | **GET** /analytics/engines/bpm/v3/optimizations/{id}/result | Get BPM optimization result by id
*BpmOptimizerApi* | [**getOptimizationStatusById**](docs/BpmOptimizerApi.md#getOptimizationStatusById) | **GET** /analytics/engines/bpm/v3/optimizations/{id}/status | Get BPM optimization status by id
*BpmOptimizerApi* | [**postAndOptimize**](docs/BpmOptimizerApi.md#postAndOptimize) | **POST** /analytics/engines/bpm/v3/optimizations | Create and Run BPM optimization
*BpmOptimizerApi* | [**putAndOptimize**](docs/BpmOptimizerApi.md#putAndOptimize) | **PUT** /analytics/engines/bpm/v3/optimizations/{id} | Create or Update BPM optimization and run it.
*CurrenciesApi* | [**getCurrencies**](docs/CurrenciesApi.md#getCurrencies) | **GET** /analytics/lookups/v3/currencies | Get currencies
*StrategyDocumentsApi* | [**getBarraStrategyDocuments**](docs/StrategyDocumentsApi.md#getBarraStrategyDocuments) | **GET** /analytics/engines/bpm/v3/strategies/{path} | Get Barra strategy documents and sub-directories in a directory


## Documentation for Models

 - [AccountDirectories](docs/AccountDirectories.md)
 - [AccountDirectoriesRoot](docs/AccountDirectoriesRoot.md)
 - [BPMOptimization](docs/BPMOptimization.md)
 - [BPMOptimizationParameters](docs/BPMOptimizationParameters.md)
 - [BPMOptimizationParametersRoot](docs/BPMOptimizationParametersRoot.md)
 - [BPMOptimizerStrategy](docs/BPMOptimizerStrategy.md)
 - [BPMOptimizerStrategyAlphaOverride](docs/BPMOptimizerStrategyAlphaOverride.md)
 - [BPMOptimizerStrategyOverrides](docs/BPMOptimizerStrategyOverrides.md)
 - [CalculationInfo](docs/CalculationInfo.md)
 - [CalculationInfoRoot](docs/CalculationInfoRoot.md)
 - [ClientErrorResponse](docs/ClientErrorResponse.md)
 - [ConstraintAction](docs/ConstraintAction.md)
 - [Currency](docs/Currency.md)
 - [CurrencyRoot](docs/CurrencyRoot.md)
 - [DocumentDirectories](docs/DocumentDirectories.md)
 - [DocumentDirectoriesRoot](docs/DocumentDirectoriesRoot.md)
 - [Error](docs/Error.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [ObjectRoot](docs/ObjectRoot.md)
 - [OptimalPortfolio](docs/OptimalPortfolio.md)
 - [OptimizerAccount](docs/OptimizerAccount.md)
 - [OptimizerAccountOverrides](docs/OptimizerAccountOverrides.md)
 - [OptimizerOptimalHoldings](docs/OptimizerOptimalHoldings.md)
 - [OptimizerOutputTypes](docs/OptimizerOutputTypes.md)
 - [OptimizerTradesList](docs/OptimizerTradesList.md)


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
