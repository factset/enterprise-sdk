[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Trading client library for Java

[![API Version](https://img.shields.io/badge/api-v0.5.0-blue)](https://developer.factset.com/api-catalog/factset-trading-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/factsettrading/0.26.2)](https://central.sonatype.com/artifact/com.factset.sdk/factsettrading/0.26.2)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allow clients to trade orders.

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.5.0
- SDK version: 0.26.2
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
  <artifactId>factsettrading</artifactId>
  <version>0.26.2</version>
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
    implementation "com.factset.sdk:factsettrading:0.26.2"
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
import com.factset.sdk.FactSetTrading.*;
import com.factset.sdk.FactSetTrading.auth.*;
import com.factset.sdk.FactSetTrading.models.*;
import com.factset.sdk.FactSetTrading.api.ChildOrdersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class ChildOrdersApiExample {

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

        ChildOrdersApi apiInstance = new ChildOrdersApi(defaultClient);
        CancelChildOrdersRoot cancelChildOrdersRoot = new CancelChildOrdersRoot(); // CancelChildOrdersRoot | 
        try {
            ChildOrdersResponseRoot result = apiInstance.cancelChildOrder(cancelChildOrdersRoot);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChildOrdersApi#cancelChildOrder");
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
import com.factset.sdk.FactSetTrading.*;
import com.factset.sdk.FactSetTrading.api.ChildOrdersApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

ChildOrdersApi apiInstance = new ChildOrdersApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.FactSetTrading.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChildOrdersApi* | [**cancelChildOrder**](docs/ChildOrdersApi.md#cancelChildOrder) | **POST** /child-orders/cancel | Cancel Child Orders on Trading system
*ChildOrdersApi* | [**createChildOrder**](docs/ChildOrdersApi.md#createChildOrder) | **POST** /child-orders/create | Create Child Orders on Trading system.
*ChildOrdersApi* | [**replaceChildOrder**](docs/ChildOrdersApi.md#replaceChildOrder) | **POST** /child-orders/replace | Replace the Child Orders on Trading system.
*InboundOrdersApi* | [**cancel**](docs/InboundOrdersApi.md#cancel) | **POST** /inbound-orders/cancel | Cancel the inbound orders on Trading system.
*InboundOrdersApi* | [**create**](docs/InboundOrdersApi.md#create) | **POST** /inbound-orders/create | Send inbound orders to Trading system for execution.
*InboundOrdersApi* | [**replace**](docs/InboundOrdersApi.md#replace) | **POST** /inbound-orders/replace | Replace the inbound orders on Trading system.
*ParentOrdersApi* | [**updateParentOrder**](docs/ParentOrdersApi.md#updateParentOrder) | **PUT** /parent-orders/update | Update Parent Orders


## Documentation for Models

 - [CancelChildOrder](docs/CancelChildOrder.md)
 - [CancelChildOrders](docs/CancelChildOrders.md)
 - [CancelChildOrdersRoot](docs/CancelChildOrdersRoot.md)
 - [CancelInboundOrder](docs/CancelInboundOrder.md)
 - [CancelInboundOrders](docs/CancelInboundOrders.md)
 - [CancelInboundOrdersRoot](docs/CancelInboundOrdersRoot.md)
 - [ChildOrder](docs/ChildOrder.md)
 - [ChildOrderInfo](docs/ChildOrderInfo.md)
 - [ChildOrderRejectInfo](docs/ChildOrderRejectInfo.md)
 - [ChildOrders](docs/ChildOrders.md)
 - [ChildOrdersResponse](docs/ChildOrdersResponse.md)
 - [ChildOrdersResponseRoot](docs/ChildOrdersResponseRoot.md)
 - [ChildOrdersRoot](docs/ChildOrdersRoot.md)
 - [ClientErrorResponse](docs/ClientErrorResponse.md)
 - [CreateChildOrderInfo](docs/CreateChildOrderInfo.md)
 - [CreateChildOrderRejectInfo](docs/CreateChildOrderRejectInfo.md)
 - [CreateChildOrdersResponse](docs/CreateChildOrdersResponse.md)
 - [CreateChildOrdersResponseRoot](docs/CreateChildOrdersResponseRoot.md)
 - [Error](docs/Error.md)
 - [ErrorSource](docs/ErrorSource.md)
 - [InboundOrder](docs/InboundOrder.md)
 - [InboundOrderMetadata](docs/InboundOrderMetadata.md)
 - [InboundOrders](docs/InboundOrders.md)
 - [InboundOrdersResponse](docs/InboundOrdersResponse.md)
 - [InboundOrdersResponseRoot](docs/InboundOrdersResponseRoot.md)
 - [InboundOrdersRoot](docs/InboundOrdersRoot.md)
 - [Instrument](docs/Instrument.md)
 - [ParentId](docs/ParentId.md)
 - [ParentOrder](docs/ParentOrder.md)
 - [ParentOrdersUpdate](docs/ParentOrdersUpdate.md)
 - [ParentOrdersUpdateResponse](docs/ParentOrdersUpdateResponse.md)
 - [ParentOrdersUpdateResponseRoot](docs/ParentOrdersUpdateResponseRoot.md)
 - [ParentOrdersUpdateRoot](docs/ParentOrdersUpdateRoot.md)
 - [ReplaceChildOrder](docs/ReplaceChildOrder.md)
 - [ReplaceChildOrders](docs/ReplaceChildOrders.md)
 - [ReplaceChildOrdersRoot](docs/ReplaceChildOrdersRoot.md)
 - [ReplaceInboundOrder](docs/ReplaceInboundOrder.md)
 - [ReplaceInboundOrders](docs/ReplaceInboundOrders.md)
 - [ReplaceInboundOrdersRoot](docs/ReplaceInboundOrdersRoot.md)
 - [ResponseParentId](docs/ResponseParentId.md)
 - [TimeInForce](docs/TimeInForce.md)


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
