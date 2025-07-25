[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# StreetAccount News client library for JavaScript

[![API Version](https://img.shields.io/badge/api-v1.2.0-blue)](https://developer.factset.com/api-catalog/streetaccount-news-api)
[![npm](https://img.shields.io/badge/npm-v2.3.0-orange)](https://www.npmjs.com/package/@factset/sdk-streetaccountnews/v/2.3.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.

**StreetAccount Filters, Headlines, and Views:**

These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.

This TypeScript/JavaScript package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.2.0
- SDK version: 2.3.0
- Build package: com.factset.sdk.codegen.FactSetJavascriptClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Node.js >= 18

## Installation

### npm

```shell
npm install @factset/sdk-utils @factset/sdk-streetaccountnews@2.3.0
```

### yarn

```shell
yarn add @factset/sdk-utils @factset/sdk-streetaccountnews@2.3.0
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Node.js environment
   1. Install and activate Node.js >=18. If you're using [nvm](https://github.com/nvm-sh/nvm):

      ```sh
      nvm install 18
      nvm use 18
      ```

   2. (optional) [Install yarn](https://yarnpkg.com/getting-started/install).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code


```javascript
const { ApiClient, FiltersApi } = require('@factset/sdk-streetaccountnews');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new FiltersApi();
const opts = {
  'attributes': ["null"] // [String] | Specify the type(s) of filters to be returned. Accepted values are `structured` and/or `flattened`. If not specified, all filters are returned. 
};

// Call api endpoint
apiInstance.getStreetAccountFilters(opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


## Using a Proxy

To add a HTTP proxy for the API client, you can set the proxyUrl for the ApiClient instance:

```javascript
const { ApiClient } = require('@factset/sdk-streetaccountnews');

const apiClient = ApiClient.instance;
apiClient.setProxyUrl('http://username:password@proxy.example.com:8080');
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*streetaccountnews.FiltersApi* | [**getStreetAccountFilters**](docs/FiltersApi.md#getStreetAccountFilters) | **GET** /filters | Retrieve all StreetAccount filters
*streetaccountnews.FiltersApi* | [**getStreetAccountFiltersCategories**](docs/FiltersApi.md#getStreetAccountFiltersCategories) | **GET** /filters/categories | Retrieve all StreetAccount filter categories
*streetaccountnews.FiltersApi* | [**getStreetAccountFiltersRegions**](docs/FiltersApi.md#getStreetAccountFiltersRegions) | **GET** /filters/regions | Retrieve all StreetAccount filter regions
*streetaccountnews.FiltersApi* | [**getStreetAccountFiltersSectors**](docs/FiltersApi.md#getStreetAccountFiltersSectors) | **GET** /filters/sectors | Retrieve all StreetAccount filter sectors
*streetaccountnews.FiltersApi* | [**getStreetAccountFiltersTopics**](docs/FiltersApi.md#getStreetAccountFiltersTopics) | **GET** /filters/topics | Retrieve all StreetAccount filter topics
*streetaccountnews.FiltersApi* | [**getStreetAccountFiltersWatchlists**](docs/FiltersApi.md#getStreetAccountFiltersWatchlists) | **GET** /filters/watchlists | Retrieve all StreetAccount filter watchlists
*streetaccountnews.HeadlinesApi* | [**getStreetAccountHeadlines**](docs/HeadlinesApi.md#getStreetAccountHeadlines) | **POST** /headlines | Retrieve StreetAccount headlines for given filters
*streetaccountnews.HeadlinesApi* | [**getStreetAccountHeadlinesByView**](docs/HeadlinesApi.md#getStreetAccountHeadlinesByView) | **POST** /headlines/view | Retrieve StreetAccount headlines for given view
*streetaccountnews.ViewsApi* | [**createQuickAlertForView**](docs/ViewsApi.md#createQuickAlertForView) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
*streetaccountnews.ViewsApi* | [**createStreetAccountView**](docs/ViewsApi.md#createStreetAccountView) | **POST** /views/create | Creates and saves a StreetAccount view
*streetaccountnews.ViewsApi* | [**deleteQuickalertView**](docs/ViewsApi.md#deleteQuickalertView) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
*streetaccountnews.ViewsApi* | [**deleteStreetAccountView**](docs/ViewsApi.md#deleteStreetAccountView) | **POST** /views/delete | Deletes an existing StreetAccount view
*streetaccountnews.ViewsApi* | [**editStreetAccountView**](docs/ViewsApi.md#editStreetAccountView) | **POST** /views/update | Edits and saves an existing StreetAccount view
*streetaccountnews.ViewsApi* | [**getStreetAccountViews**](docs/ViewsApi.md#getStreetAccountViews) | **GET** /views | Retrieves StreetAccount search views


## Documentation for Models

 - [streetaccountnews.CreateOrEditViewBody](docs/CreateOrEditViewBody.md)
 - [streetaccountnews.CreateOrEditViewBodyData](docs/CreateOrEditViewBodyData.md)
 - [streetaccountnews.CreateOrEditViewTickers](docs/CreateOrEditViewTickers.md)
 - [streetaccountnews.CreateViewResponse](docs/CreateViewResponse.md)
 - [streetaccountnews.CreateViewResponseData](docs/CreateViewResponseData.md)
 - [streetaccountnews.DeleteViewBody](docs/DeleteViewBody.md)
 - [streetaccountnews.DeleteViewBodyData](docs/DeleteViewBodyData.md)
 - [streetaccountnews.Error](docs/Error.md)
 - [streetaccountnews.ErrorObject](docs/ErrorObject.md)
 - [streetaccountnews.FilterCategoriesResponse](docs/FilterCategoriesResponse.md)
 - [streetaccountnews.FilterCategoriesResponseData](docs/FilterCategoriesResponseData.md)
 - [streetaccountnews.FilterRegionsResponse](docs/FilterRegionsResponse.md)
 - [streetaccountnews.FilterRegionsResponseData](docs/FilterRegionsResponseData.md)
 - [streetaccountnews.FilterResponse](docs/FilterResponse.md)
 - [streetaccountnews.FilterResponseData](docs/FilterResponseData.md)
 - [streetaccountnews.FilterSectorsResponse](docs/FilterSectorsResponse.md)
 - [streetaccountnews.FilterSectorsResponseData](docs/FilterSectorsResponseData.md)
 - [streetaccountnews.FilterTopicResponse](docs/FilterTopicResponse.md)
 - [streetaccountnews.FilterTopicResponseData](docs/FilterTopicResponseData.md)
 - [streetaccountnews.FilterWatchlistsResponse](docs/FilterWatchlistsResponse.md)
 - [streetaccountnews.FilterWatchlistsResponseData](docs/FilterWatchlistsResponseData.md)
 - [streetaccountnews.FlattenedFilters](docs/FlattenedFilters.md)
 - [streetaccountnews.FlattenedFiltersCategories](docs/FlattenedFiltersCategories.md)
 - [streetaccountnews.FlattenedFiltersCategoriesObject](docs/FlattenedFiltersCategoriesObject.md)
 - [streetaccountnews.FlattenedFiltersRegions](docs/FlattenedFiltersRegions.md)
 - [streetaccountnews.FlattenedFiltersRegionsObject](docs/FlattenedFiltersRegionsObject.md)
 - [streetaccountnews.FlattenedFiltersSectors](docs/FlattenedFiltersSectors.md)
 - [streetaccountnews.FlattenedFiltersSectorsObject](docs/FlattenedFiltersSectorsObject.md)
 - [streetaccountnews.FlattenedFiltersTopics](docs/FlattenedFiltersTopics.md)
 - [streetaccountnews.FlattenedFiltersTopicsObject](docs/FlattenedFiltersTopicsObject.md)
 - [streetaccountnews.FlattenedFiltersWatchlists](docs/FlattenedFiltersWatchlists.md)
 - [streetaccountnews.FlattenedFiltersWatchlistsObject](docs/FlattenedFiltersWatchlistsObject.md)
 - [streetaccountnews.HeadlinesRequest](docs/HeadlinesRequest.md)
 - [streetaccountnews.HeadlinesRequestByView](docs/HeadlinesRequestByView.md)
 - [streetaccountnews.HeadlinesRequestByViewData](docs/HeadlinesRequestByViewData.md)
 - [streetaccountnews.HeadlinesRequestByViewDataSearchTime](docs/HeadlinesRequestByViewDataSearchTime.md)
 - [streetaccountnews.HeadlinesRequestByViewMeta](docs/HeadlinesRequestByViewMeta.md)
 - [streetaccountnews.HeadlinesRequestData](docs/HeadlinesRequestData.md)
 - [streetaccountnews.HeadlinesRequestDataSearchTime](docs/HeadlinesRequestDataSearchTime.md)
 - [streetaccountnews.HeadlinesRequestMeta](docs/HeadlinesRequestMeta.md)
 - [streetaccountnews.HeadlinesRequestMetaPagination](docs/HeadlinesRequestMetaPagination.md)
 - [streetaccountnews.HeadlinesRequestTickersObject](docs/HeadlinesRequestTickersObject.md)
 - [streetaccountnews.HeadlinesResponse](docs/HeadlinesResponse.md)
 - [streetaccountnews.HeadlinesResponseMeta](docs/HeadlinesResponseMeta.md)
 - [streetaccountnews.HeadlinesResponseMetaPagination](docs/HeadlinesResponseMetaPagination.md)
 - [streetaccountnews.QuickAlertsBody](docs/QuickAlertsBody.md)
 - [streetaccountnews.QuickAlertsBodyData](docs/QuickAlertsBodyData.md)
 - [streetaccountnews.QuickAlertsResponse](docs/QuickAlertsResponse.md)
 - [streetaccountnews.SearchResponseArrayObject](docs/SearchResponseArrayObject.md)
 - [streetaccountnews.StructuredFilters](docs/StructuredFilters.md)
 - [streetaccountnews.StructuredFiltersCategories](docs/StructuredFiltersCategories.md)
 - [streetaccountnews.StructuredFiltersCategoriesObject](docs/StructuredFiltersCategoriesObject.md)
 - [streetaccountnews.StructuredFiltersChildrenObjectCategories](docs/StructuredFiltersChildrenObjectCategories.md)
 - [streetaccountnews.StructuredFiltersChildrenObjectRegions](docs/StructuredFiltersChildrenObjectRegions.md)
 - [streetaccountnews.StructuredFiltersChildrenObjectSectors](docs/StructuredFiltersChildrenObjectSectors.md)
 - [streetaccountnews.StructuredFiltersChildrenObjectTopics](docs/StructuredFiltersChildrenObjectTopics.md)
 - [streetaccountnews.StructuredFiltersChildrenObjectTopicsNested](docs/StructuredFiltersChildrenObjectTopicsNested.md)
 - [streetaccountnews.StructuredFiltersChildrenObjectTopicsNested2](docs/StructuredFiltersChildrenObjectTopicsNested2.md)
 - [streetaccountnews.StructuredFiltersRegions](docs/StructuredFiltersRegions.md)
 - [streetaccountnews.StructuredFiltersRegionsObject](docs/StructuredFiltersRegionsObject.md)
 - [streetaccountnews.StructuredFiltersSectors](docs/StructuredFiltersSectors.md)
 - [streetaccountnews.StructuredFiltersSectorsObject](docs/StructuredFiltersSectorsObject.md)
 - [streetaccountnews.StructuredFiltersTopics](docs/StructuredFiltersTopics.md)
 - [streetaccountnews.StructuredFiltersTopicsObject](docs/StructuredFiltersTopicsObject.md)
 - [streetaccountnews.StructuredFiltersWatchlists](docs/StructuredFiltersWatchlists.md)
 - [streetaccountnews.StructuredFiltersWatchlistsObject](docs/StructuredFiltersWatchlistsObject.md)
 - [streetaccountnews.Views](docs/Views.md)
 - [streetaccountnews.ViewsObject](docs/ViewsObject.md)


## Documentation for Authorization



### FactSetApiKey

- **Type**: HTTP basic authentication



### FactSetOAuth2


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


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
