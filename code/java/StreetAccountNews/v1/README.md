[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# StreetAccount News client library for Java

[![API Version](https://img.shields.io/badge/api-v1.1.0-blue)](https://developer.factset.com/api-catalog/streetaccount-news-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/streetaccountnews)](https://search.maven.org/artifact/com.factset.sdk/streetaccountnews)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.

**StreetAccount Filters, Headlines, and Views:**

These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.

 **StreetAccount Historical Stories:**

These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Create, Status, and Get.

Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.

The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.

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
  <artifactId>streetaccountnews</artifactId>
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
    implementation "com.factset.sdk:streetaccountnews:1.1.0"
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
import com.factset.sdk.StreetAccountNews.*;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.FiltersApi;

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
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterResponse result = apiInstance.getStreetAccountFilters(attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getStreetAccountFilters");
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
import com.factset.sdk.StreetAccountNews.*;
import com.factset.sdk.StreetAccountNews.api.FiltersApi;

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
import com.factset.sdk.StreetAccountNews.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FiltersApi* | [**getStreetAccountFilters**](docs/FiltersApi.md#getStreetAccountFilters) | **GET** /filters | Retrieve all StreetAccount filters
*FiltersApi* | [**getStreetAccountFiltersCategories**](docs/FiltersApi.md#getStreetAccountFiltersCategories) | **GET** /filters/categories | Retrieve all StreetAccount filter categories
*FiltersApi* | [**getStreetAccountFiltersRegions**](docs/FiltersApi.md#getStreetAccountFiltersRegions) | **GET** /filters/regions | Retrieve all StreetAccount filter regions
*FiltersApi* | [**getStreetAccountFiltersSectors**](docs/FiltersApi.md#getStreetAccountFiltersSectors) | **GET** /filters/sectors | Retrieve all StreetAccount filter sectors
*FiltersApi* | [**getStreetAccountFiltersTopics**](docs/FiltersApi.md#getStreetAccountFiltersTopics) | **GET** /filters/topics | Retrieve all StreetAccount filter topics
*FiltersApi* | [**getStreetAccountFiltersWatchlists**](docs/FiltersApi.md#getStreetAccountFiltersWatchlists) | **GET** /filters/watchlists | Retrieve all StreetAccount filter watchlists
*HeadlinesApi* | [**getStreetAccountHeadlines**](docs/HeadlinesApi.md#getStreetAccountHeadlines) | **POST** /headlines | Retrieve StreetAccount headlines for given filters
*HeadlinesApi* | [**getStreetAccountHeadlinesByView**](docs/HeadlinesApi.md#getStreetAccountHeadlinesByView) | **POST** /headlines/view | Retrieve StreetAccount headlines for given view
*StreetAccountHistoricalStoriesApi* | [**getFilesData**](docs/StreetAccountHistoricalStoriesApi.md#getFilesData) | **GET** /historical/files/get | Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
*StreetAccountHistoricalStoriesApi* | [**getStatusData**](docs/StreetAccountHistoricalStoriesApi.md#getStatusData) | **GET** /historical/files/status | Returns the status of the request
*StreetAccountHistoricalStoriesApi* | [**requestFiles**](docs/StreetAccountHistoricalStoriesApi.md#requestFiles) | **POST** /historical/files/create | Requests the creation of StreetAccount News Files with historical data.
*ViewsApi* | [**createQuickAlertForView**](docs/ViewsApi.md#createQuickAlertForView) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
*ViewsApi* | [**createStreetAccountView**](docs/ViewsApi.md#createStreetAccountView) | **POST** /views/create | Creates and saves a StreetAccount view
*ViewsApi* | [**deleteQuickalertView**](docs/ViewsApi.md#deleteQuickalertView) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
*ViewsApi* | [**deleteStreetAccountView**](docs/ViewsApi.md#deleteStreetAccountView) | **POST** /views/delete | Deletes an existing StreetAccount view
*ViewsApi* | [**editStreetAccountView**](docs/ViewsApi.md#editStreetAccountView) | **POST** /views/update | Edits and saves an existing StreetAccount view
*ViewsApi* | [**getStreetAccountViews**](docs/ViewsApi.md#getStreetAccountViews) | **GET** /views | Retrieves StreetAccount search views


## Documentation for Models

 - [AcceptedResponse](docs/AcceptedResponse.md)
 - [CreateFilesRequest](docs/CreateFilesRequest.md)
 - [CreateFilesRequestObject](docs/CreateFilesRequestObject.md)
 - [CreateOrEditViewBody](docs/CreateOrEditViewBody.md)
 - [CreateOrEditViewBodyData](docs/CreateOrEditViewBodyData.md)
 - [CreateOrEditViewTickers](docs/CreateOrEditViewTickers.md)
 - [CreateViewResponse](docs/CreateViewResponse.md)
 - [CreateViewResponseData](docs/CreateViewResponseData.md)
 - [DateTimeRangeObject](docs/DateTimeRangeObject.md)
 - [DeleteViewBody](docs/DeleteViewBody.md)
 - [DeleteViewBodyData](docs/DeleteViewBodyData.md)
 - [Error](docs/Error.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [FilterCategoriesResponse](docs/FilterCategoriesResponse.md)
 - [FilterCategoriesResponseData](docs/FilterCategoriesResponseData.md)
 - [FilterRegionsResponse](docs/FilterRegionsResponse.md)
 - [FilterRegionsResponseData](docs/FilterRegionsResponseData.md)
 - [FilterResponse](docs/FilterResponse.md)
 - [FilterResponseData](docs/FilterResponseData.md)
 - [FilterSectorsResponse](docs/FilterSectorsResponse.md)
 - [FilterSectorsResponseData](docs/FilterSectorsResponseData.md)
 - [FilterTopicResponse](docs/FilterTopicResponse.md)
 - [FilterTopicResponseData](docs/FilterTopicResponseData.md)
 - [FilterWatchlistsResponse](docs/FilterWatchlistsResponse.md)
 - [FilterWatchlistsResponseData](docs/FilterWatchlistsResponseData.md)
 - [FlattenedFilters](docs/FlattenedFilters.md)
 - [FlattenedFiltersCategories](docs/FlattenedFiltersCategories.md)
 - [FlattenedFiltersCategoriesObject](docs/FlattenedFiltersCategoriesObject.md)
 - [FlattenedFiltersRegions](docs/FlattenedFiltersRegions.md)
 - [FlattenedFiltersRegionsObject](docs/FlattenedFiltersRegionsObject.md)
 - [FlattenedFiltersSectors](docs/FlattenedFiltersSectors.md)
 - [FlattenedFiltersSectorsObject](docs/FlattenedFiltersSectorsObject.md)
 - [FlattenedFiltersTopics](docs/FlattenedFiltersTopics.md)
 - [FlattenedFiltersTopicsObject](docs/FlattenedFiltersTopicsObject.md)
 - [FlattenedFiltersWatchlists](docs/FlattenedFiltersWatchlists.md)
 - [FlattenedFiltersWatchlistsObject](docs/FlattenedFiltersWatchlistsObject.md)
 - [Getfiles](docs/Getfiles.md)
 - [GetfilesResponse](docs/GetfilesResponse.md)
 - [HeadlinesRequest](docs/HeadlinesRequest.md)
 - [HeadlinesRequestByView](docs/HeadlinesRequestByView.md)
 - [HeadlinesRequestByViewData](docs/HeadlinesRequestByViewData.md)
 - [HeadlinesRequestByViewMeta](docs/HeadlinesRequestByViewMeta.md)
 - [HeadlinesRequestData](docs/HeadlinesRequestData.md)
 - [HeadlinesRequestDataSearchTime](docs/HeadlinesRequestDataSearchTime.md)
 - [HeadlinesRequestMeta](docs/HeadlinesRequestMeta.md)
 - [HeadlinesRequestMetaPagination](docs/HeadlinesRequestMetaPagination.md)
 - [HeadlinesRequestTickersObject](docs/HeadlinesRequestTickersObject.md)
 - [HeadlinesResponse](docs/HeadlinesResponse.md)
 - [HeadlinesResponseMeta](docs/HeadlinesResponseMeta.md)
 - [HeadlinesResponseMetaPagination](docs/HeadlinesResponseMetaPagination.md)
 - [MetaOne](docs/MetaOne.md)
 - [Model202ErrorObject](docs/Model202ErrorObject.md)
 - [PaginationOne](docs/PaginationOne.md)
 - [QuickAlertsBody](docs/QuickAlertsBody.md)
 - [QuickAlertsBodyData](docs/QuickAlertsBodyData.md)
 - [QuickAlertsResponse](docs/QuickAlertsResponse.md)
 - [SearchResponseArrayObject](docs/SearchResponseArrayObject.md)
 - [StatusOne](docs/StatusOne.md)
 - [StructuredFilters](docs/StructuredFilters.md)
 - [StructuredFiltersCategories](docs/StructuredFiltersCategories.md)
 - [StructuredFiltersCategoriesObject](docs/StructuredFiltersCategoriesObject.md)
 - [StructuredFiltersChildrenObjectCategories](docs/StructuredFiltersChildrenObjectCategories.md)
 - [StructuredFiltersChildrenObjectRegions](docs/StructuredFiltersChildrenObjectRegions.md)
 - [StructuredFiltersChildrenObjectSectors](docs/StructuredFiltersChildrenObjectSectors.md)
 - [StructuredFiltersChildrenObjectTopics](docs/StructuredFiltersChildrenObjectTopics.md)
 - [StructuredFiltersRegions](docs/StructuredFiltersRegions.md)
 - [StructuredFiltersRegionsObject](docs/StructuredFiltersRegionsObject.md)
 - [StructuredFiltersSectors](docs/StructuredFiltersSectors.md)
 - [StructuredFiltersSectorsObject](docs/StructuredFiltersSectorsObject.md)
 - [StructuredFiltersTopics](docs/StructuredFiltersTopics.md)
 - [StructuredFiltersTopicsObject](docs/StructuredFiltersTopicsObject.md)
 - [StructuredFiltersWatchlists](docs/StructuredFiltersWatchlists.md)
 - [StructuredFiltersWatchlistsObject](docs/StructuredFiltersWatchlistsObject.md)
 - [SubmittedResponse](docs/SubmittedResponse.md)
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
