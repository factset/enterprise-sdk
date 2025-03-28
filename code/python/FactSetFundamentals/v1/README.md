[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Fundamentals client library for Python

[![API Version](https://img.shields.io/badge/api-v1.1.0-blue)]()
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.FactSetFundamentals/1.0.13)](https://pypi.org/project/fds.sdk.FactSetFundamentals/v/1.0.13)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.1.0
- SDK version: 1.0.13
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.FactSetFundamentals==1.0.13
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.FactSetFundamentals==1.0.13
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

import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import data_items_api
from fds.sdk.FactSetFundamentals.models import *
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
configuration = fds.sdk.FactSetFundamentals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFundamentals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFundamentals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = data_items_api.DataItemsApi(api_client)
    category = "INCOME_STATEMENT" # str | Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** = Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** = Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** = Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** = Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** = Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** = Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** = Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** = General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing related market data.*   * **MISCELLANEOUS** = Corporation Data, Financial Records details, Indicators.   * **DATES** = Relevant Dates  (optional)
    subcategory = "INCOME_STATEMENT" # str | Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES  (optional)

    try:
        # Available fundamental metrics or ratios.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fds_fundamentals_metrics(category=category, subcategory=subcategory)

        pprint(api_response)
    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling DataItemsApi->get_fds_fundamentals_metrics: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Available fundamental metrics or ratios.
    #     api_response, http_status_code, response_headers = api_instance.get_fds_fundamentals_metrics_with_http_info(category=category, subcategory=subcategory)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetFundamentals.ApiException as e:
    #     print("Exception when calling DataItemsApi->get_fds_fundamentals_metrics: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Available fundamental metrics or ratios.
    #     async_result = api_instance.get_fds_fundamentals_metrics_async(category=category, subcategory=subcategory)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.FactSetFundamentals.ApiException as e:
    #     print("Exception when calling DataItemsApi->get_fds_fundamentals_metrics: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Available fundamental metrics or ratios.
    #     async_result = api_instance.get_fds_fundamentals_metrics_with_http_info_async(category=category, subcategory=subcategory)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetFundamentals.ApiException as e:
    #     print("Exception when calling DataItemsApi->get_fds_fundamentals_metrics: %s\n" % e)

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
import fds.sdk.FactSetFundamentals

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.FactSetFundamentals.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.FactSetFundamentals

configuration = fds.sdk.FactSetFundamentals.Configuration(
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
import fds.sdk.FactSetFundamentals

configuration = fds.sdk.FactSetFundamentals.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.FactSetFundamentals

configuration = fds.sdk.FactSetFundamentals.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataItemsApi* | [**get_fds_fundamentals_metrics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/DataItemsApi.md#get_fds_fundamentals_metrics) | **GET** /factset-fundamentals/v1/metrics | Available fundamental metrics or ratios.
*DataItemsApi* | [**get_fds_fundamentals_metrics_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/DataItemsApi.md#get_fds_fundamentals_metrics_for_list) | **POST** /factset-fundamentals/v1/metrics | Available fundamental metrics or ratios.
*FactSetFundamentalsApi* | [**get_fds_fundamentals**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/FactSetFundamentalsApi.md#get_fds_fundamentals) | **GET** /factset-fundamentals/v1/fundamentals | Returns the Company Fundamental Data.
*FactSetFundamentalsApi* | [**get_fds_fundamentals_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/FactSetFundamentalsApi.md#get_fds_fundamentals_for_list) | **POST** /factset-fundamentals/v1/fundamentals | Returns the Company Fundamental Data.


## Documentation For Models

 - [Category](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Category.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/ErrorResponse.md)
 - [ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/ErrorResponseSubErrors.md)
 - [Fundamental](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Fundamental.md)
 - [FundamentalsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/FundamentalsRequest.md)
 - [FundamentalsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/FundamentalsResponse.md)
 - [Ids](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Ids.md)
 - [Metric](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Metric.md)
 - [Metrics](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Metrics.md)
 - [MetricsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/MetricsRequest.md)
 - [MetricsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/MetricsResponse.md)
 - [Periodicity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Periodicity.md)
 - [Restated](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Restated.md)
 - [Subcategory](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFundamentals/v1/docs/Subcategory.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.FactSetFundamentals.apis and fds.sdk.FactSetFundamentals.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.FactSetFundamentals.api.default_api import DefaultApi`
- `from fds.sdk.FactSetFundamentals.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.apis import *
from fds.sdk.FactSetFundamentals.models import *
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

