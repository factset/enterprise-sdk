[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Real-Time News client library for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/realtimenews)](https://search.maven.org/artifact/com.factset.sdk/realtimenews)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with
[quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals),
[time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals),
[watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.

Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.

All search and list endpoints can be subscribed to receive streamed updates.

News providers include:

* APA
* AWP 
* Businesswire
* Cercle Finance
* Direkt News SE
* Dow Jones News
* dpa
* dpa-AFX 
* EUWAX
* GlobenewsWire
* Kauppalehti
* MT Newswires
* MoneyAM
* newsaktuell
* OMX
* PR Newswire 
* Ritzau Finans
* StreetAccount News
* TDN News
      
See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed
price and performance information, plus basic support for security identifier cross-reference.


This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.0.0
- Package version: 0.11.0
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
  <artifactId>realtimenews</artifactId>
  <version>0.11.0</version>
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
    implementation "com.factset.sdk:realtimenews:0.11.0"
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
import com.factset.sdk.RealTimeNews.*;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.NewsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class NewsApiExample {

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        String code = "code_example"; // String | 
        Boolean includeMedia = false; // Boolean | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse200 result = apiInstance.getNewsArticleGet(code, includeMedia, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsArticleGet");
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
import com.factset.sdk.RealTimeNews.*;
import com.factset.sdk.RealTimeNews.api.NewsApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

NewsApi apiInstance = new NewsApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.RealTimeNews.ApiClient;

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
*NewsApi* | [**getNewsArticleGet**](docs/NewsApi.md#getNewsArticleGet) | **GET** /news/article/get | Details for a news article.
*NewsApi* | [**getNewsArticleTypeGet**](docs/NewsApi.md#getNewsArticleTypeGet) | **GET** /news/article/type/get | Details for a news article type.
*NewsApi* | [**getNewsArticleTypeList**](docs/NewsApi.md#getNewsArticleTypeList) | **GET** /news/article/type/list | List of news article types.
*NewsApi* | [**getNewsDistributorGet**](docs/NewsApi.md#getNewsDistributorGet) | **GET** /news/distributor/get | Details of a distributor.
*NewsApi* | [**getNewsDistributorList**](docs/NewsApi.md#getNewsDistributorList) | **GET** /news/distributor/list | List of distributors.
*NewsApi* | [**getNewsPublisherGet**](docs/NewsApi.md#getNewsPublisherGet) | **GET** /news/publisher/get | Details of a publisher.
*NewsApi* | [**getNewsPublisherList**](docs/NewsApi.md#getNewsPublisherList) | **GET** /news/publisher/list | List of publishers.
*NewsApi* | [**getNewsPublisherListByDistributor**](docs/NewsApi.md#getNewsPublisherListByDistributor) | **GET** /news/publisher/listByDistributor | List of publishers provided by the given distributor.
*NewsApi* | [**postNewsArticleList**](docs/NewsApi.md#postNewsArticleList) | **POST** /news/article/list | List of news articles.
*NewsApi* | [**postNewsArticleListByChain**](docs/NewsApi.md#postNewsArticleListByChain) | **POST** /news/article/listByChain | List news articles of an article chain.
*NewsApi* | [**postNewsArticleListByIndex**](docs/NewsApi.md#postNewsArticleListByIndex) | **POST** /news/article/listByIndex | News articles for instruments that are constituents of the given indices.
*NewsApi* | [**postNewsArticleListByInstrument**](docs/NewsApi.md#postNewsArticleListByInstrument) | **POST** /news/article/listByInstrument | News articles for instruments.
*NewsApi* | [**postNewsArticleListByMediaKind**](docs/NewsApi.md#postNewsArticleListByMediaKind) | **POST** /news/article/listByMediaKind | List news articles which contain media of specific media kinds.
*NewsApi* | [**postNewsArticleSearchByText**](docs/NewsApi.md#postNewsArticleSearchByText) | **POST** /news/article/searchByText | Search for news articles using a fulltext search.
*NewsApi* | [**postNewsPublisherSearchByName**](docs/NewsApi.md#postNewsPublisherSearchByName) | **POST** /news/publisher/searchByName | Search for publishers.


## Documentation for Models

 - [CursorBasedPaginationOutputObject](docs/CursorBasedPaginationOutputObject.md)
 - [CursorBasedPaginationOutputObjectWithoutTotal](docs/CursorBasedPaginationOutputObjectWithoutTotal.md)
 - [ErrorMetaObject](docs/ErrorMetaObject.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20010Data](docs/InlineResponse20010Data.md)
 - [InlineResponse20010Meta](docs/InlineResponse20010Meta.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20011Data](docs/InlineResponse20011Data.md)
 - [InlineResponse2001Categories](docs/InlineResponse2001Categories.md)
 - [InlineResponse2001Chain](docs/InlineResponse2001Chain.md)
 - [InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [InlineResponse2001Distributor](docs/InlineResponse2001Distributor.md)
 - [InlineResponse2001Fsym](docs/InlineResponse2001Fsym.md)
 - [InlineResponse2001FsymSecurity](docs/InlineResponse2001FsymSecurity.md)
 - [InlineResponse2001Instruments](docs/InlineResponse2001Instruments.md)
 - [InlineResponse2001Language](docs/InlineResponse2001Language.md)
 - [InlineResponse2001Meta](docs/InlineResponse2001Meta.md)
 - [InlineResponse2001Publisher](docs/InlineResponse2001Publisher.md)
 - [InlineResponse2001Types](docs/InlineResponse2001Types.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Data](docs/InlineResponse2002Data.md)
 - [InlineResponse2002DataArticles](docs/InlineResponse2002DataArticles.md)
 - [InlineResponse2002DataDistributor](docs/InlineResponse2002DataDistributor.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003Data](docs/InlineResponse2003Data.md)
 - [InlineResponse2003DataIdentifiers](docs/InlineResponse2003DataIdentifiers.md)
 - [InlineResponse2003DataStatus](docs/InlineResponse2003DataStatus.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004Data](docs/InlineResponse2004Data.md)
 - [InlineResponse2004DataIdentifiers](docs/InlineResponse2004DataIdentifiers.md)
 - [InlineResponse2004DataStatus](docs/InlineResponse2004DataStatus.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005Data](docs/InlineResponse2005Data.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2006Data](docs/InlineResponse2006Data.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2007Data](docs/InlineResponse2007Data.md)
 - [InlineResponse2007DataDelivery](docs/InlineResponse2007DataDelivery.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2008Data](docs/InlineResponse2008Data.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse2009Data](docs/InlineResponse2009Data.md)
 - [InlineResponse2009DataDistributor](docs/InlineResponse2009DataDistributor.md)
 - [InlineResponse200Data](docs/InlineResponse200Data.md)
 - [InlineResponse200DataCategories](docs/InlineResponse200DataCategories.md)
 - [InlineResponse200DataDistributor](docs/InlineResponse200DataDistributor.md)
 - [InlineResponse200DataFsym](docs/InlineResponse200DataFsym.md)
 - [InlineResponse200DataFsymSecurity](docs/InlineResponse200DataFsymSecurity.md)
 - [InlineResponse200DataInstruments](docs/InlineResponse200DataInstruments.md)
 - [InlineResponse200DataLanguage](docs/InlineResponse200DataLanguage.md)
 - [InlineResponse200DataMedia](docs/InlineResponse200DataMedia.md)
 - [InlineResponse200DataPublisher](docs/InlineResponse200DataPublisher.md)
 - [InlineResponse200DataTypes](docs/InlineResponse200DataTypes.md)
 - [InlineResponse200Meta](docs/InlineResponse200Meta.md)
 - [OffsetBasedPaginationOutputObject](docs/OffsetBasedPaginationOutputObject.md)
 - [OffsetBasedPaginationOutputObjectWithoutTotal](docs/OffsetBasedPaginationOutputObjectWithoutTotal.md)
 - [PartialOutputObject](docs/PartialOutputObject.md)
 - [PostNewsArticleListByChainRequest](docs/PostNewsArticleListByChainRequest.md)
 - [PostNewsArticleListByChainRequestData](docs/PostNewsArticleListByChainRequestData.md)
 - [PostNewsArticleListByChainRequestDataFilter](docs/PostNewsArticleListByChainRequestDataFilter.md)
 - [PostNewsArticleListByIndexRequest](docs/PostNewsArticleListByIndexRequest.md)
 - [PostNewsArticleListByIndexRequestData](docs/PostNewsArticleListByIndexRequestData.md)
 - [PostNewsArticleListByIndexRequestDataIdentifier](docs/PostNewsArticleListByIndexRequestDataIdentifier.md)
 - [PostNewsArticleListByInstrumentRequest](docs/PostNewsArticleListByInstrumentRequest.md)
 - [PostNewsArticleListByInstrumentRequestData](docs/PostNewsArticleListByInstrumentRequestData.md)
 - [PostNewsArticleListByInstrumentRequestDataIdentifier](docs/PostNewsArticleListByInstrumentRequestDataIdentifier.md)
 - [PostNewsArticleListByMediaKindRequest](docs/PostNewsArticleListByMediaKindRequest.md)
 - [PostNewsArticleListByMediaKindRequestData](docs/PostNewsArticleListByMediaKindRequestData.md)
 - [PostNewsArticleListRequest](docs/PostNewsArticleListRequest.md)
 - [PostNewsArticleListRequestData](docs/PostNewsArticleListRequestData.md)
 - [PostNewsArticleListRequestDataFilter](docs/PostNewsArticleListRequestDataFilter.md)
 - [PostNewsArticleListRequestDataFilterCategories](docs/PostNewsArticleListRequestDataFilterCategories.md)
 - [PostNewsArticleListRequestDataFilterDistributor](docs/PostNewsArticleListRequestDataFilterDistributor.md)
 - [PostNewsArticleListRequestDataFilterLanguage](docs/PostNewsArticleListRequestDataFilterLanguage.md)
 - [PostNewsArticleListRequestDataFilterPublisher](docs/PostNewsArticleListRequestDataFilterPublisher.md)
 - [PostNewsArticleListRequestDataFilterRange](docs/PostNewsArticleListRequestDataFilterRange.md)
 - [PostNewsArticleListRequestDataFilterRegions](docs/PostNewsArticleListRequestDataFilterRegions.md)
 - [PostNewsArticleListRequestDataFilterTypes](docs/PostNewsArticleListRequestDataFilterTypes.md)
 - [PostNewsArticleListRequestMeta](docs/PostNewsArticleListRequestMeta.md)
 - [PostNewsArticleListRequestMetaPagination](docs/PostNewsArticleListRequestMetaPagination.md)
 - [PostNewsArticleListRequestMetaSubscription](docs/PostNewsArticleListRequestMetaSubscription.md)
 - [PostNewsArticleSearchByTextRequest](docs/PostNewsArticleSearchByTextRequest.md)
 - [PostNewsArticleSearchByTextRequestData](docs/PostNewsArticleSearchByTextRequestData.md)
 - [PostNewsArticleSearchByTextRequestDataCategories](docs/PostNewsArticleSearchByTextRequestDataCategories.md)
 - [PostNewsArticleSearchByTextRequestDataCriteria](docs/PostNewsArticleSearchByTextRequestDataCriteria.md)
 - [PostNewsArticleSearchByTextRequestDataDistributor](docs/PostNewsArticleSearchByTextRequestDataDistributor.md)
 - [PostNewsArticleSearchByTextRequestDataIndices](docs/PostNewsArticleSearchByTextRequestDataIndices.md)
 - [PostNewsArticleSearchByTextRequestDataInstruments](docs/PostNewsArticleSearchByTextRequestDataInstruments.md)
 - [PostNewsArticleSearchByTextRequestDataLanguage](docs/PostNewsArticleSearchByTextRequestDataLanguage.md)
 - [PostNewsArticleSearchByTextRequestDataPublisher](docs/PostNewsArticleSearchByTextRequestDataPublisher.md)
 - [PostNewsArticleSearchByTextRequestDataRegions](docs/PostNewsArticleSearchByTextRequestDataRegions.md)
 - [PostNewsArticleSearchByTextRequestDataText](docs/PostNewsArticleSearchByTextRequestDataText.md)
 - [PostNewsArticleSearchByTextRequestDataTextCriteria](docs/PostNewsArticleSearchByTextRequestDataTextCriteria.md)
 - [PostNewsArticleSearchByTextRequestDataTypes](docs/PostNewsArticleSearchByTextRequestDataTypes.md)
 - [PostNewsPublisherSearchByNameRequest](docs/PostNewsPublisherSearchByNameRequest.md)
 - [PostNewsPublisherSearchByNameRequestData](docs/PostNewsPublisherSearchByNameRequestData.md)
 - [PostNewsPublisherSearchByNameRequestDataFilter](docs/PostNewsPublisherSearchByNameRequestDataFilter.md)
 - [PostNewsPublisherSearchByNameRequestDataFilterDelivery](docs/PostNewsPublisherSearchByNameRequestDataFilterDelivery.md)
 - [PostNewsPublisherSearchByNameRequestDataFilterDistributor](docs/PostNewsPublisherSearchByNameRequestDataFilterDistributor.md)
 - [PostNewsPublisherSearchByNameRequestMeta](docs/PostNewsPublisherSearchByNameRequestMeta.md)
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