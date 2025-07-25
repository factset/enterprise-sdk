[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# StreetAccount News client library for Python

[![API Version](https://img.shields.io/badge/api-v1.2.0-blue)](https://developer.factset.com/api-catalog/streetaccount-news-api)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.StreetAccountNews/1.3.0)](https://pypi.org/project/fds.sdk.StreetAccountNews/v/1.3.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.

**StreetAccount Filters, Headlines, and Views:**

These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.2.0
- SDK version: 1.3.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.StreetAccountNews==1.3.0
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.StreetAccountNews==1.3.0
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Python environment.
   1. Install and activate python 3.7+. If you're using [pyenv](https://github.com/pyenv/pyenv):

      ```sh
      pyenv install 3.9.7
      pyenv shell 3.9.7
      ```

   2. (optional) [Install poetry](https://python-poetry.org/docs/#installation).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient

import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import filters_api
from fds.sdk.StreetAccountNews.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filters_api.FiltersApi(api_client)
    attributes = [
        "structured",
    ] # [str] | Specify the type(s) of filters to be returned. Accepted values are `structured` and/or `flattened`. If not specified, all filters are returned.  (optional)

    try:
        # Retrieve all StreetAccount filters
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_street_account_filters(attributes=attributes)

        pprint(api_response)
    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling FiltersApi->get_street_account_filters: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Retrieve all StreetAccount filters
    #     api_response, http_status_code, response_headers = api_instance.get_street_account_filters_with_http_info(attributes=attributes)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.StreetAccountNews.ApiException as e:
    #     print("Exception when calling FiltersApi->get_street_account_filters: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Retrieve all StreetAccount filters
    #     async_result = api_instance.get_street_account_filters_async(attributes=attributes)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.StreetAccountNews.ApiException as e:
    #     print("Exception when calling FiltersApi->get_street_account_filters: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Retrieve all StreetAccount filters
    #     async_result = api_instance.get_street_account_filters_with_http_info_async(attributes=attributes)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.StreetAccountNews.ApiException as e:
    #     print("Exception when calling FiltersApi->get_street_account_filters: %s\n" % e)

```

### Using Pandas

To convert an API response to a Pandas DataFrame, it is necessary to transform it first to a dictionary.
```python
import pandas as pd

response_dict = api_response.to_dict()['data']

simple_json_response = pd.DataFrame(response_dict)
nested_json_response = pd.json_normalize(response_dict)
```

### Debugging

The SDK uses the standard library [`logging`](https://docs.python.org/3/library/logging.html#module-logging) module.

Setting `debug` to `True` on an instance of the `Configuration` class sets the log-level of related packages to `DEBUG`
and enables additional logging in Pythons [HTTP Client](https://docs.python.org/3/library/http.client.html).

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```python
import logging
import fds.sdk.StreetAccountNews

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.StreetAccountNews.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.StreetAccountNews

configuration = fds.sdk.StreetAccountNews.Configuration(
    # ...
    proxy="http://secret:password@localhost:5050",
    proxy_headers={
        "Custom-Proxy-Header": "Custom-Proxy-Header-Value"
    }
)
```

### Custom SSL Certificate

TLS/SSL certificate verification can be configured with the following Configuration parameters:

* `ssl_ca_cert`: a path to the certificate to use for verification in `PEM` format.
* `verify_ssl`: setting this to `False` disables the verification of certificates.
  Disabling the verification is not recommended, but it might be useful during
  local development or testing.

```python
import fds.sdk.StreetAccountNews

configuration = fds.sdk.StreetAccountNews.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.StreetAccountNews

configuration = fds.sdk.StreetAccountNews.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FiltersApi* | [**get_street_account_filters**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FiltersApi.md#get_street_account_filters) | **GET** /filters | Retrieve all StreetAccount filters
*FiltersApi* | [**get_street_account_filters_categories**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FiltersApi.md#get_street_account_filters_categories) | **GET** /filters/categories | Retrieve all StreetAccount filter categories
*FiltersApi* | [**get_street_account_filters_regions**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FiltersApi.md#get_street_account_filters_regions) | **GET** /filters/regions | Retrieve all StreetAccount filter regions
*FiltersApi* | [**get_street_account_filters_sectors**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FiltersApi.md#get_street_account_filters_sectors) | **GET** /filters/sectors | Retrieve all StreetAccount filter sectors
*FiltersApi* | [**get_street_account_filters_topics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FiltersApi.md#get_street_account_filters_topics) | **GET** /filters/topics | Retrieve all StreetAccount filter topics
*FiltersApi* | [**get_street_account_filters_watchlists**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FiltersApi.md#get_street_account_filters_watchlists) | **GET** /filters/watchlists | Retrieve all StreetAccount filter watchlists
*HeadlinesApi* | [**get_street_account_headlines**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesApi.md#get_street_account_headlines) | **POST** /headlines | Retrieve StreetAccount headlines for given filters
*HeadlinesApi* | [**get_street_account_headlines_by_view**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesApi.md#get_street_account_headlines_by_view) | **POST** /headlines/view | Retrieve StreetAccount headlines for given view
*ViewsApi* | [**create_quick_alert_for_view**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsApi.md#create_quick_alert_for_view) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
*ViewsApi* | [**create_street_account_view**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsApi.md#create_street_account_view) | **POST** /views/create | Creates and saves a StreetAccount view
*ViewsApi* | [**delete_quickalert_view**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsApi.md#delete_quickalert_view) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
*ViewsApi* | [**delete_street_account_view**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsApi.md#delete_street_account_view) | **POST** /views/delete | Deletes an existing StreetAccount view
*ViewsApi* | [**edit_street_account_view**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsApi.md#edit_street_account_view) | **POST** /views/update | Edits and saves an existing StreetAccount view
*ViewsApi* | [**get_street_account_views**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsApi.md#get_street_account_views) | **GET** /views | Retrieves StreetAccount search views


## Documentation For Models

 - [CreateOrEditViewBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/CreateOrEditViewBody.md)
 - [CreateOrEditViewBodyData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/CreateOrEditViewBodyData.md)
 - [CreateOrEditViewTickers](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/CreateOrEditViewTickers.md)
 - [CreateViewResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/CreateViewResponse.md)
 - [CreateViewResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/CreateViewResponseData.md)
 - [DeleteViewBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/DeleteViewBody.md)
 - [DeleteViewBodyData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/DeleteViewBodyData.md)
 - [Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/Error.md)
 - [ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ErrorObject.md)
 - [FilterCategoriesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterCategoriesResponse.md)
 - [FilterCategoriesResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterCategoriesResponseData.md)
 - [FilterRegionsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterRegionsResponse.md)
 - [FilterRegionsResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterRegionsResponseData.md)
 - [FilterResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterResponse.md)
 - [FilterResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterResponseData.md)
 - [FilterSectorsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterSectorsResponse.md)
 - [FilterSectorsResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterSectorsResponseData.md)
 - [FilterTopicResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterTopicResponse.md)
 - [FilterTopicResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterTopicResponseData.md)
 - [FilterWatchlistsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterWatchlistsResponse.md)
 - [FilterWatchlistsResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FilterWatchlistsResponseData.md)
 - [FlattenedFilters](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFilters.md)
 - [FlattenedFiltersCategories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersCategories.md)
 - [FlattenedFiltersCategoriesObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersCategoriesObject.md)
 - [FlattenedFiltersRegions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersRegions.md)
 - [FlattenedFiltersRegionsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersRegionsObject.md)
 - [FlattenedFiltersSectors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersSectors.md)
 - [FlattenedFiltersSectorsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersSectorsObject.md)
 - [FlattenedFiltersTopics](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersTopics.md)
 - [FlattenedFiltersTopicsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersTopicsObject.md)
 - [FlattenedFiltersWatchlists](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersWatchlists.md)
 - [FlattenedFiltersWatchlistsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/FlattenedFiltersWatchlistsObject.md)
 - [HeadlinesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequest.md)
 - [HeadlinesRequestByView](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestByView.md)
 - [HeadlinesRequestByViewData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestByViewData.md)
 - [HeadlinesRequestByViewDataSearchTime](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestByViewDataSearchTime.md)
 - [HeadlinesRequestByViewMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestByViewMeta.md)
 - [HeadlinesRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestData.md)
 - [HeadlinesRequestDataSearchTime](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestDataSearchTime.md)
 - [HeadlinesRequestMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestMeta.md)
 - [HeadlinesRequestMetaPagination](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestMetaPagination.md)
 - [HeadlinesRequestTickersObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesRequestTickersObject.md)
 - [HeadlinesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesResponse.md)
 - [HeadlinesResponseMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesResponseMeta.md)
 - [HeadlinesResponseMetaPagination](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/HeadlinesResponseMetaPagination.md)
 - [QuickAlertsBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/QuickAlertsBody.md)
 - [QuickAlertsBodyData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/QuickAlertsBodyData.md)
 - [QuickAlertsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/QuickAlertsResponse.md)
 - [SearchResponseArrayObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/SearchResponseArrayObject.md)
 - [StructuredFilters](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFilters.md)
 - [StructuredFiltersCategories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersCategories.md)
 - [StructuredFiltersCategoriesObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersCategoriesObject.md)
 - [StructuredFiltersChildrenObjectCategories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersChildrenObjectCategories.md)
 - [StructuredFiltersChildrenObjectRegions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersChildrenObjectRegions.md)
 - [StructuredFiltersChildrenObjectSectors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersChildrenObjectSectors.md)
 - [StructuredFiltersChildrenObjectTopics](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersChildrenObjectTopics.md)
 - [StructuredFiltersChildrenObjectTopicsNested](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersChildrenObjectTopicsNested.md)
 - [StructuredFiltersChildrenObjectTopicsNested2](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersChildrenObjectTopicsNested2.md)
 - [StructuredFiltersRegions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersRegions.md)
 - [StructuredFiltersRegionsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersRegionsObject.md)
 - [StructuredFiltersSectors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersSectors.md)
 - [StructuredFiltersSectorsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersSectorsObject.md)
 - [StructuredFiltersTopics](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersTopics.md)
 - [StructuredFiltersTopicsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersTopicsObject.md)
 - [StructuredFiltersWatchlists](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersWatchlists.md)
 - [StructuredFiltersWatchlistsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/StructuredFiltersWatchlistsObject.md)
 - [Views](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/Views.md)
 - [ViewsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/StreetAccountNews/v1/docs/ViewsObject.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.StreetAccountNews.apis and fds.sdk.StreetAccountNews.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.StreetAccountNews.api.default_api import DefaultApi`
- `from fds.sdk.StreetAccountNews.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.apis import *
from fds.sdk.StreetAccountNews.models import *
```

## Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

## Copyright

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

