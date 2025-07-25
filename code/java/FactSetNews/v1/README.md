[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet News client library for Java

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)](https://developer.factset.com/api-catalog/factset-news-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/factsetnews/0.1.1)](https://central.sonatype.com/artifact/com.factset.sdk/factsetnews/0.1.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)


The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation.
This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:

* Watchlists/Indices/Tickers
* Sources
* Company Filters
* Market Topics
* Countries
* Regions


  


This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
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
  <artifactId>factsetnews</artifactId>
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
    implementation "com.factset.sdk:factsetnews:0.1.1"
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
import com.factset.sdk.FactSetNews.*;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class FiltersApiExample {

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterResponse result = apiInstance.getFilters(attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getFilters");
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
import com.factset.sdk.FactSetNews.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

FiltersApi apiInstance = new FiltersApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.FactSetNews.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content/news/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FiltersApi* | [**getFilters**](docs/FiltersApi.md#getFilters) | **GET** /filters | Retrieve all FactSet News filters
*FiltersApi* | [**getNewsFiltersCategories**](docs/FiltersApi.md#getNewsFiltersCategories) | **GET** /filters/categories | Retrieve all News filter categories
*FiltersApi* | [**getNewsFiltersCountries**](docs/FiltersApi.md#getNewsFiltersCountries) | **GET** /filters/countries | Retrieve all News filter countries
*FiltersApi* | [**getNewsFiltersRegions**](docs/FiltersApi.md#getNewsFiltersRegions) | **GET** /filters/regions | Retrieve all News filter regions
*FiltersApi* | [**getNewsFiltersSources**](docs/FiltersApi.md#getNewsFiltersSources) | **GET** /filters/sources | Retrieve all News filter sources
*FiltersApi* | [**getNewsFiltersTopics**](docs/FiltersApi.md#getNewsFiltersTopics) | **GET** /filters/topics | Retrieve all News filter topics
*FiltersApi* | [**getNewsFiltersWatchlists**](docs/FiltersApi.md#getNewsFiltersWatchlists) | **GET** /filters/watchlists | Retrieve all News filter watchlists
*HeadlinesApi* | [**getFactSetNewsHeadlines**](docs/HeadlinesApi.md#getFactSetNewsHeadlines) | **POST** /headlines | Retrieve FactSet News headlines for the given filters
*HeadlinesApi* | [**getFactSetNewsHeadlinesByView**](docs/HeadlinesApi.md#getFactSetNewsHeadlinesByView) | **POST** /headlines/view | Retrieve FactSet News headlines for given view
*ViewsApi* | [**createFactSetNewsView**](docs/ViewsApi.md#createFactSetNewsView) | **POST** /views/create | Creates and saves a FactSet News view
*ViewsApi* | [**createQuickAlertForView**](docs/ViewsApi.md#createQuickAlertForView) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
*ViewsApi* | [**deleteQuickalertView**](docs/ViewsApi.md#deleteQuickalertView) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
*ViewsApi* | [**deleteView**](docs/ViewsApi.md#deleteView) | **POST** /views/delete | Deletes an existing App view
*ViewsApi* | [**editFactSetNewsView**](docs/ViewsApi.md#editFactSetNewsView) | **POST** /views/update | Edit an existing FactSet News view with filters specified
*ViewsApi* | [**getFactSetNewsViews**](docs/ViewsApi.md#getFactSetNewsViews) | **GET** /views | Retrieves a list of search views created in News app


## Documentation for Models

 - [CreateOrEditViewBody](docs/CreateOrEditViewBody.md)
 - [CreateOrEditViewBodyData](docs/CreateOrEditViewBodyData.md)
 - [CreateOrEditViewTickers](docs/CreateOrEditViewTickers.md)
 - [CreateViewResponse](docs/CreateViewResponse.md)
 - [CreateViewResponseData](docs/CreateViewResponseData.md)
 - [Criteria](docs/Criteria.md)
 - [CriteriaDetail](docs/CriteriaDetail.md)
 - [CriteriaOneOf](docs/CriteriaOneOf.md)
 - [DeleteViewBody](docs/DeleteViewBody.md)
 - [DeleteViewBodyData](docs/DeleteViewBodyData.md)
 - [Error](docs/Error.md)
 - [ErrorResponseObject](docs/ErrorResponseObject.md)
 - [FilterCategoriesResponse](docs/FilterCategoriesResponse.md)
 - [FilterCategoriesResponseData](docs/FilterCategoriesResponseData.md)
 - [FilterCountriesResponse](docs/FilterCountriesResponse.md)
 - [FilterCountriesResponseData](docs/FilterCountriesResponseData.md)
 - [FilterRegionsResponse](docs/FilterRegionsResponse.md)
 - [FilterRegionsResponseData](docs/FilterRegionsResponseData.md)
 - [FilterResponse](docs/FilterResponse.md)
 - [FilterResponseData](docs/FilterResponseData.md)
 - [FilterSourcesResponse](docs/FilterSourcesResponse.md)
 - [FilterSourcesResponseData](docs/FilterSourcesResponseData.md)
 - [FilterTopicResponse](docs/FilterTopicResponse.md)
 - [FilterTopicResponseData](docs/FilterTopicResponseData.md)
 - [FilterWatchlistsResponse](docs/FilterWatchlistsResponse.md)
 - [FilterWatchlistsResponseData](docs/FilterWatchlistsResponseData.md)
 - [FlattenedFilters](docs/FlattenedFilters.md)
 - [FlattenedFiltersCategories](docs/FlattenedFiltersCategories.md)
 - [FlattenedFiltersCategoriesObject](docs/FlattenedFiltersCategoriesObject.md)
 - [FlattenedFiltersCountries](docs/FlattenedFiltersCountries.md)
 - [FlattenedFiltersCountriesObject](docs/FlattenedFiltersCountriesObject.md)
 - [FlattenedFiltersRegions](docs/FlattenedFiltersRegions.md)
 - [FlattenedFiltersRegionsObject](docs/FlattenedFiltersRegionsObject.md)
 - [FlattenedFiltersSources](docs/FlattenedFiltersSources.md)
 - [FlattenedFiltersSourcesObject](docs/FlattenedFiltersSourcesObject.md)
 - [FlattenedFiltersTopics](docs/FlattenedFiltersTopics.md)
 - [FlattenedFiltersTopicsObject](docs/FlattenedFiltersTopicsObject.md)
 - [FlattenedFiltersWatchlists](docs/FlattenedFiltersWatchlists.md)
 - [FlattenedFiltersWatchlistsObject](docs/FlattenedFiltersWatchlistsObject.md)
 - [HeadlinesRequest](docs/HeadlinesRequest.md)
 - [HeadlinesRequestByView](docs/HeadlinesRequestByView.md)
 - [HeadlinesRequestByViewData](docs/HeadlinesRequestByViewData.md)
 - [HeadlinesRequestByViewDataSearchTime](docs/HeadlinesRequestByViewDataSearchTime.md)
 - [HeadlinesRequestByViewMeta](docs/HeadlinesRequestByViewMeta.md)
 - [HeadlinesRequestByViewMetaPagination](docs/HeadlinesRequestByViewMetaPagination.md)
 - [HeadlinesRequestData](docs/HeadlinesRequestData.md)
 - [HeadlinesRequestDataSearchTime](docs/HeadlinesRequestDataSearchTime.md)
 - [HeadlinesRequestMeta](docs/HeadlinesRequestMeta.md)
 - [HeadlinesRequestTickersObject](docs/HeadlinesRequestTickersObject.md)
 - [QuickAlertsBody](docs/QuickAlertsBody.md)
 - [QuickAlertsBodyData](docs/QuickAlertsBodyData.md)
 - [QuickAlertsResponse](docs/QuickAlertsResponse.md)
 - [QuickAlertsResponseData](docs/QuickAlertsResponseData.md)
 - [RegionObject](docs/RegionObject.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchResponseArrayObject](docs/SearchResponseArrayObject.md)
 - [SearchResponseMeta](docs/SearchResponseMeta.md)
 - [SearchResponseMetaPagination](docs/SearchResponseMetaPagination.md)
 - [StructuredFilters](docs/StructuredFilters.md)
 - [StructuredFiltersCategories](docs/StructuredFiltersCategories.md)
 - [StructuredFiltersCategoriesObject](docs/StructuredFiltersCategoriesObject.md)
 - [StructuredFiltersChildrenObject](docs/StructuredFiltersChildrenObject.md)
 - [StructuredFiltersCountries](docs/StructuredFiltersCountries.md)
 - [StructuredFiltersCountriesObject](docs/StructuredFiltersCountriesObject.md)
 - [StructuredFiltersRegions](docs/StructuredFiltersRegions.md)
 - [StructuredFiltersRegionsObject](docs/StructuredFiltersRegionsObject.md)
 - [StructuredFiltersSources](docs/StructuredFiltersSources.md)
 - [StructuredFiltersSourcesChildrenObject](docs/StructuredFiltersSourcesChildrenObject.md)
 - [StructuredFiltersSourcesObject](docs/StructuredFiltersSourcesObject.md)
 - [StructuredFiltersTopics](docs/StructuredFiltersTopics.md)
 - [StructuredFiltersTopicsObject](docs/StructuredFiltersTopicsObject.md)
 - [StructuredFiltersWatchlists](docs/StructuredFiltersWatchlists.md)
 - [StructuredFiltersWatchlistsObject](docs/StructuredFiltersWatchlistsObject.md)
 - [Views](docs/Views.md)
 - [ViewsObject](docs/ViewsObject.md)


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
