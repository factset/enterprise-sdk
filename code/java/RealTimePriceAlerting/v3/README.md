[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Real-Time Price Alerting client library for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/realtimepricealerting)](https://search.maven.org/artifact/com.factset.sdk/realtimepricealerting)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.

Alerting uses the concepts of triggers and alerts.

A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.

When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.

An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).

The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.

See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.

Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a
FactSet consultant and see https://endpointreference.factset.com.


This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.0.0
- Package version: 0.11.2
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
  <artifactId>realtimepricealerting</artifactId>
  <version>0.11.2</version>
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
    implementation "com.factset.sdk:realtimepricealerting:0.11.2"
  }
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Java environment.
   1. Install and activate Java 1.8+
   2. Install [maven](https://maven.apache.org/install.html) or [gradle](https://gradle.org/install/)
3. [Install dependencies](#installation).
4. Run the following:

```java
import com.factset.sdk.RealTimePriceAlerting.*;
import com.factset.sdk.RealTimePriceAlerting.auth.*;
import com.factset.sdk.RealTimePriceAlerting.models.*;
import com.factset.sdk.RealTimePriceAlerting.api.AlertingApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class AlertingApiExample {

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

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.getAlertingPricesBasicAlertGet(id, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingApi#getAlertingPricesBasicAlertGet");
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
import com.factset.sdk.RealTimePriceAlerting.*;
import com.factset.sdk.RealTimePriceAlerting.api.AlertingApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

AlertingApi apiInstance = new AlertingApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.RealTimePriceAlerting.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/wealth/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlertingApi* | [**getAlertingPricesBasicAlertGet**](docs/AlertingApi.md#getAlertingPricesBasicAlertGet) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
*AlertingApi* | [**getAlertingPricesBasicAlertList**](docs/AlertingApi.md#getAlertingPricesBasicAlertList) | **GET** /alerting/prices/basic/alert/list | List of alerts.
*AlertingApi* | [**getAlertingPricesBasicTriggerGet**](docs/AlertingApi.md#getAlertingPricesBasicTriggerGet) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
*AlertingApi* | [**postAlertingPricesBasicTriggerList**](docs/AlertingApi.md#postAlertingPricesBasicTriggerList) | **POST** /alerting/prices/basic/trigger/list | List of triggers.


## Documentation for Models

 - [CursorBasedPaginationOutputObject](docs/CursorBasedPaginationOutputObject.md)
 - [CursorBasedPaginationOutputObjectWithoutTotal](docs/CursorBasedPaginationOutputObjectWithoutTotal.md)
 - [ErrorMetaObject](docs/ErrorMetaObject.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [InlineResponse2001Meta](docs/InlineResponse2001Meta.md)
 - [InlineResponse2001Trigger](docs/InlineResponse2001Trigger.md)
 - [InlineResponse2001TriggerPrice](docs/InlineResponse2001TriggerPrice.md)
 - [InlineResponse2001TriggerStatus](docs/InlineResponse2001TriggerStatus.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Data](docs/InlineResponse2002Data.md)
 - [InlineResponse2002DataNotification](docs/InlineResponse2002DataNotification.md)
 - [InlineResponse2002DataNotificationChannel](docs/InlineResponse2002DataNotificationChannel.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003Data](docs/InlineResponse2003Data.md)
 - [InlineResponse200Data](docs/InlineResponse200Data.md)
 - [InlineResponse200DataNotification](docs/InlineResponse200DataNotification.md)
 - [InlineResponse200DataNotificationChannel](docs/InlineResponse200DataNotificationChannel.md)
 - [InlineResponse200DataNotificationStatus](docs/InlineResponse200DataNotificationStatus.md)
 - [InlineResponse200DataPrice](docs/InlineResponse200DataPrice.md)
 - [InlineResponse200DataTrigger](docs/InlineResponse200DataTrigger.md)
 - [InlineResponse200DataTriggerNotation](docs/InlineResponse200DataTriggerNotation.md)
 - [InlineResponse200DataTriggerNotification](docs/InlineResponse200DataTriggerNotification.md)
 - [InlineResponse200DataTriggerNotificationChannel](docs/InlineResponse200DataTriggerNotificationChannel.md)
 - [InlineResponse200DataTriggerPrice](docs/InlineResponse200DataTriggerPrice.md)
 - [InlineResponse200DataTriggerRange](docs/InlineResponse200DataTriggerRange.md)
 - [InlineResponse200DataTriggerStatus](docs/InlineResponse200DataTriggerStatus.md)
 - [InlineResponse200Meta](docs/InlineResponse200Meta.md)
 - [OffsetBasedPaginationOutputObject](docs/OffsetBasedPaginationOutputObject.md)
 - [OffsetBasedPaginationOutputObjectWithoutTotal](docs/OffsetBasedPaginationOutputObjectWithoutTotal.md)
 - [PartialOutputObject](docs/PartialOutputObject.md)
 - [PostAlertingPricesBasicTriggerListRequest](docs/PostAlertingPricesBasicTriggerListRequest.md)
 - [PostAlertingPricesBasicTriggerListRequestData](docs/PostAlertingPricesBasicTriggerListRequestData.md)
 - [PostAlertingPricesBasicTriggerListRequestDataFilter](docs/PostAlertingPricesBasicTriggerListRequestDataFilter.md)
 - [PostAlertingPricesBasicTriggerListRequestDataFilterStatus](docs/PostAlertingPricesBasicTriggerListRequestDataFilterStatus.md)
 - [PostAlertingPricesBasicTriggerListRequestMeta](docs/PostAlertingPricesBasicTriggerListRequestMeta.md)
 - [PostAlertingPricesBasicTriggerListRequestMetaPagination](docs/PostAlertingPricesBasicTriggerListRequestMetaPagination.md)
 - [StatusObject](docs/StatusObject.md)


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