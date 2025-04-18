[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Real-Time News client library for Python

[![API Version](https://img.shields.io/badge/api-v3.0.0-blue)](https://developer.factset.com/api-catalog/)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.RealTimeNews/0.11.7)](https://pypi.org/project/fds.sdk.RealTimeNews/v/0.11.7)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with
[quotes](https://developer.factset.com/api-catalog/real-time-quotes-api),
[time series](https://developer.factset.com/api-catalog/real-time-time-series-api),
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
      
See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed
price and performance information, plus basic support for security identifier cross-reference.


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.0.0
- SDK version: 0.11.7
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.RealTimeNews==0.11.7
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.RealTimeNews==0.11.7
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

import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.api import news_api
from fds.sdk.RealTimeNews.models import *
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
configuration = fds.sdk.RealTimeNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api.NewsApi(api_client)
    code = "0" # str | 
    include_media = False # bool |  (optional) if omitted the server will use the default value of False
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str |  (optional)

    try:
        # Details for a news article.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_news_article_get(code, include_media=include_media, attributes=attributes, language=language)

        pprint(api_response)
    except fds.sdk.RealTimeNews.ApiException as e:
        print("Exception when calling NewsApi->get_news_article_get: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Details for a news article.
    #     api_response, http_status_code, response_headers = api_instance.get_news_article_get_with_http_info(code, include_media=include_media, attributes=attributes, language=language)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.RealTimeNews.ApiException as e:
    #     print("Exception when calling NewsApi->get_news_article_get: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Details for a news article.
    #     async_result = api_instance.get_news_article_get_async(code, include_media=include_media, attributes=attributes, language=language)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.RealTimeNews.ApiException as e:
    #     print("Exception when calling NewsApi->get_news_article_get: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Details for a news article.
    #     async_result = api_instance.get_news_article_get_with_http_info_async(code, include_media=include_media, attributes=attributes, language=language)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.RealTimeNews.ApiException as e:
    #     print("Exception when calling NewsApi->get_news_article_get: %s\n" % e)

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
import fds.sdk.RealTimeNews

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.RealTimeNews.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.RealTimeNews

configuration = fds.sdk.RealTimeNews.Configuration(
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
import fds.sdk.RealTimeNews

configuration = fds.sdk.RealTimeNews.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.RealTimeNews

configuration = fds.sdk.RealTimeNews.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/wealth/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*NewsApi* | [**get_news_article_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_article_get) | **GET** /news/article/get | Details for a news article.
*NewsApi* | [**get_news_article_type_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_article_type_get) | **GET** /news/article/type/get | Details for a news article type.
*NewsApi* | [**get_news_article_type_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_article_type_list) | **GET** /news/article/type/list | List of news article types.
*NewsApi* | [**get_news_distributor_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_distributor_get) | **GET** /news/distributor/get | Details of a distributor.
*NewsApi* | [**get_news_distributor_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_distributor_list) | **GET** /news/distributor/list | List of distributors.
*NewsApi* | [**get_news_publisher_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_publisher_get) | **GET** /news/publisher/get | Details of a publisher.
*NewsApi* | [**get_news_publisher_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_publisher_list) | **GET** /news/publisher/list | List of publishers.
*NewsApi* | [**get_news_publisher_list_by_distributor**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#get_news_publisher_list_by_distributor) | **GET** /news/publisher/listByDistributor | List of publishers provided by the given distributor.
*NewsApi* | [**post_news_article_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_article_list) | **POST** /news/article/list | List of news articles.
*NewsApi* | [**post_news_article_list_by_chain**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_article_list_by_chain) | **POST** /news/article/listByChain | List news articles of an article chain.
*NewsApi* | [**post_news_article_list_by_index**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_article_list_by_index) | **POST** /news/article/listByIndex | News articles for instruments that are constituents of the given indices.
*NewsApi* | [**post_news_article_list_by_instrument**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_article_list_by_instrument) | **POST** /news/article/listByInstrument | News articles for instruments.
*NewsApi* | [**post_news_article_list_by_media_kind**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_article_list_by_media_kind) | **POST** /news/article/listByMediaKind | List news articles which contain media of specific media kinds.
*NewsApi* | [**post_news_article_search_by_text**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_article_search_by_text) | **POST** /news/article/searchByText | Search for news articles using a fulltext search.
*NewsApi* | [**post_news_publisher_search_by_name**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/NewsApi.md#post_news_publisher_search_by_name) | **POST** /news/publisher/searchByName | Search for publishers.


## Documentation For Models

 - [AttributesMember](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/AttributesMember.md)
 - [CursorBasedPaginationOutputObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/CursorBasedPaginationOutputObject.md)
 - [CursorBasedPaginationOutputObjectWithoutTotal](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/CursorBasedPaginationOutputObjectWithoutTotal.md)
 - [ErrorMetaObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/ErrorMetaObject.md)
 - [ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/ErrorObject.md)
 - [InlineResponse200](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200.md)
 - [InlineResponse2001](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001.md)
 - [InlineResponse20010](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse20010.md)
 - [InlineResponse20010Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse20010Data.md)
 - [InlineResponse20010Meta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse20010Meta.md)
 - [InlineResponse20011](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse20011.md)
 - [InlineResponse20011Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse20011Data.md)
 - [InlineResponse2001Categories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Categories.md)
 - [InlineResponse2001Chain](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Chain.md)
 - [InlineResponse2001Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Data.md)
 - [InlineResponse2001Distributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Distributor.md)
 - [InlineResponse2001Fsym](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Fsym.md)
 - [InlineResponse2001FsymSecurity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001FsymSecurity.md)
 - [InlineResponse2001Instruments](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Instruments.md)
 - [InlineResponse2001Language](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Language.md)
 - [InlineResponse2001Meta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Meta.md)
 - [InlineResponse2001Publisher](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Publisher.md)
 - [InlineResponse2001Types](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2001Types.md)
 - [InlineResponse2002](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2002.md)
 - [InlineResponse2002Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2002Data.md)
 - [InlineResponse2002DataArticles](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2002DataArticles.md)
 - [InlineResponse2002DataDistributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2002DataDistributor.md)
 - [InlineResponse2003](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2003.md)
 - [InlineResponse2003Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2003Data.md)
 - [InlineResponse2003DataIdentifiers](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2003DataIdentifiers.md)
 - [InlineResponse2003DataStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2003DataStatus.md)
 - [InlineResponse2004](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2004.md)
 - [InlineResponse2004Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2004Data.md)
 - [InlineResponse2004DataIdentifiers](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2004DataIdentifiers.md)
 - [InlineResponse2004DataStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2004DataStatus.md)
 - [InlineResponse2005](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2005.md)
 - [InlineResponse2005Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2005Data.md)
 - [InlineResponse2006](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2006.md)
 - [InlineResponse2006Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2006Data.md)
 - [InlineResponse2007](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2007.md)
 - [InlineResponse2007Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2007Data.md)
 - [InlineResponse2007DataDelivery](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2007DataDelivery.md)
 - [InlineResponse2008](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2008.md)
 - [InlineResponse2008Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2008Data.md)
 - [InlineResponse2009](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2009.md)
 - [InlineResponse2009Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2009Data.md)
 - [InlineResponse2009DataDistributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse2009DataDistributor.md)
 - [InlineResponse200Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200Data.md)
 - [InlineResponse200DataCategories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataCategories.md)
 - [InlineResponse200DataDistributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataDistributor.md)
 - [InlineResponse200DataFsym](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataFsym.md)
 - [InlineResponse200DataFsymSecurity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataFsymSecurity.md)
 - [InlineResponse200DataInstruments](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataInstruments.md)
 - [InlineResponse200DataLanguage](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataLanguage.md)
 - [InlineResponse200DataMedia](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataMedia.md)
 - [InlineResponse200DataPublisher](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataPublisher.md)
 - [InlineResponse200DataTypes](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200DataTypes.md)
 - [InlineResponse200Meta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/InlineResponse200Meta.md)
 - [LanguageMember](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/LanguageMember.md)
 - [OffsetBasedPaginationOutputObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/OffsetBasedPaginationOutputObject.md)
 - [OffsetBasedPaginationOutputObjectWithoutTotal](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/OffsetBasedPaginationOutputObjectWithoutTotal.md)
 - [PartialOutputObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PartialOutputObject.md)
 - [PostNewsArticleListByChainRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByChainRequest.md)
 - [PostNewsArticleListByChainRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByChainRequestData.md)
 - [PostNewsArticleListByChainRequestDataFilter](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByChainRequestDataFilter.md)
 - [PostNewsArticleListByIndexRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByIndexRequest.md)
 - [PostNewsArticleListByIndexRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByIndexRequestData.md)
 - [PostNewsArticleListByIndexRequestDataIdentifier](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByIndexRequestDataIdentifier.md)
 - [PostNewsArticleListByInstrumentRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByInstrumentRequest.md)
 - [PostNewsArticleListByInstrumentRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByInstrumentRequestData.md)
 - [PostNewsArticleListByInstrumentRequestDataIdentifier](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByInstrumentRequestDataIdentifier.md)
 - [PostNewsArticleListByMediaKindRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByMediaKindRequest.md)
 - [PostNewsArticleListByMediaKindRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListByMediaKindRequestData.md)
 - [PostNewsArticleListRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequest.md)
 - [PostNewsArticleListRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestData.md)
 - [PostNewsArticleListRequestDataFilter](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilter.md)
 - [PostNewsArticleListRequestDataFilterCategories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterCategories.md)
 - [PostNewsArticleListRequestDataFilterDistributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterDistributor.md)
 - [PostNewsArticleListRequestDataFilterLanguage](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterLanguage.md)
 - [PostNewsArticleListRequestDataFilterPublisher](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterPublisher.md)
 - [PostNewsArticleListRequestDataFilterRange](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterRange.md)
 - [PostNewsArticleListRequestDataFilterRegions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterRegions.md)
 - [PostNewsArticleListRequestDataFilterTypes](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestDataFilterTypes.md)
 - [PostNewsArticleListRequestMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestMeta.md)
 - [PostNewsArticleListRequestMetaPagination](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestMetaPagination.md)
 - [PostNewsArticleListRequestMetaSubscription](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleListRequestMetaSubscription.md)
 - [PostNewsArticleSearchByTextRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequest.md)
 - [PostNewsArticleSearchByTextRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestData.md)
 - [PostNewsArticleSearchByTextRequestDataCategories](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataCategories.md)
 - [PostNewsArticleSearchByTextRequestDataCriteria](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataCriteria.md)
 - [PostNewsArticleSearchByTextRequestDataDistributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataDistributor.md)
 - [PostNewsArticleSearchByTextRequestDataIndices](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataIndices.md)
 - [PostNewsArticleSearchByTextRequestDataInstruments](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataInstruments.md)
 - [PostNewsArticleSearchByTextRequestDataLanguage](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataLanguage.md)
 - [PostNewsArticleSearchByTextRequestDataPublisher](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataPublisher.md)
 - [PostNewsArticleSearchByTextRequestDataRegions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataRegions.md)
 - [PostNewsArticleSearchByTextRequestDataText](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataText.md)
 - [PostNewsArticleSearchByTextRequestDataTextCriteria](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataTextCriteria.md)
 - [PostNewsArticleSearchByTextRequestDataTypes](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsArticleSearchByTextRequestDataTypes.md)
 - [PostNewsPublisherSearchByNameRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsPublisherSearchByNameRequest.md)
 - [PostNewsPublisherSearchByNameRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsPublisherSearchByNameRequestData.md)
 - [PostNewsPublisherSearchByNameRequestDataFilter](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsPublisherSearchByNameRequestDataFilter.md)
 - [PostNewsPublisherSearchByNameRequestDataFilterDelivery](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsPublisherSearchByNameRequestDataFilterDelivery.md)
 - [PostNewsPublisherSearchByNameRequestDataFilterDistributor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsPublisherSearchByNameRequestDataFilterDistributor.md)
 - [PostNewsPublisherSearchByNameRequestMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/PostNewsPublisherSearchByNameRequestMeta.md)
 - [StatusObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeNews/v3/docs/StatusObject.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.RealTimeNews.apis and fds.sdk.RealTimeNews.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.RealTimeNews.api.default_api import DefaultApi`
- `from fds.sdk.RealTimeNews.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.RealTimeNews
from fds.sdk.RealTimeNews.apis import *
from fds.sdk.RealTimeNews.models import *
```

## Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

## Copyright

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

