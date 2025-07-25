[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Funds client library for Python

[![API Version](https://img.shields.io/badge/api-v1.4.0-blue)](https://developer.factset.com/api-catalog/factset-funds-api)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.FactSetFunds/2.0.0)](https://pypi.org/project/fds.sdk.FactSetFunds/v/2.0.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage 
  * Fund descriptions 
  * A seven-tier classification system
  * Leverage information
  * Fees and expenses 
  * Portfolio managers 
  
  FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage 
  * Net asset value
  * Fund flows 
  * Assets under management
  * Total return 
<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.4.0
- SDK version: 2.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.FactSetFunds==2.0.0
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.FactSetFunds==2.0.0
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

import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = distributions_api.DistributionsApi(api_client)
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    currency = "USD" # str | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional) if omitted the server will use the default value of "LOCAL"

    try:
        # Get Most Recent Fund Distributions
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_dist_current(ids, currency=currency)

        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling DistributionsApi->get_funds_dist_current: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Get Most Recent Fund Distributions
    #     api_response, http_status_code, response_headers = api_instance.get_funds_dist_current_with_http_info(ids, currency=currency)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetFunds.ApiException as e:
    #     print("Exception when calling DistributionsApi->get_funds_dist_current: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Get Most Recent Fund Distributions
    #     async_result = api_instance.get_funds_dist_current_async(ids, currency=currency)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.FactSetFunds.ApiException as e:
    #     print("Exception when calling DistributionsApi->get_funds_dist_current: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Get Most Recent Fund Distributions
    #     async_result = api_instance.get_funds_dist_current_with_http_info_async(ids, currency=currency)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetFunds.ApiException as e:
    #     print("Exception when calling DistributionsApi->get_funds_dist_current: %s\n" % e)

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
import fds.sdk.FactSetFunds

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.FactSetFunds.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.FactSetFunds

configuration = fds.sdk.FactSetFunds.Configuration(
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
import fds.sdk.FactSetFunds

configuration = fds.sdk.FactSetFunds.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.FactSetFunds

configuration = fds.sdk.FactSetFunds.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistributionsApi* | [**get_funds_dist_current**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistributionsApi.md#get_funds_dist_current) | **GET** /factset-funds/v1/distributions/current | Get Most Recent Fund Distributions
*DistributionsApi* | [**get_funds_dist_current_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistributionsApi.md#get_funds_dist_current_for_list) | **POST** /factset-funds/v1/distributions/current | Get Most Recent Fund Distributions
*DistributionsApi* | [**get_funds_dist_historical**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistributionsApi.md#get_funds_dist_historical) | **GET** /factset-funds/v1/distributions/historical | Get Historical Fund Distributions
*DistributionsApi* | [**get_funds_dist_historical_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistributionsApi.md#get_funds_dist_historical_for_list) | **POST** /factset-funds/v1/distributions/historical | Get Historical Fund Distributions
*FundFlowsAUMApi* | [**get_funds_aum**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundFlowsAUMApi.md#get_funds_aum) | **GET** /factset-funds/v1/aum | Get Fund AUM for a requested date range and list of ids
*FundFlowsAUMApi* | [**get_funds_aum_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundFlowsAUMApi.md#get_funds_aum_for_list) | **POST** /factset-funds/v1/aum | Get Fund AUM for a requested date range and large list of ids
*FundFlowsAUMApi* | [**get_funds_flows**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundFlowsAUMApi.md#get_funds_flows) | **GET** /factset-funds/v1/flows | Get Fund Flows for a requested date range and list of ids
*FundFlowsAUMApi* | [**get_funds_flows_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundFlowsAUMApi.md#get_funds_flows_for_list) | **POST** /factset-funds/v1/flows | Get Fund Flows for a requested date range and large list of ids
*GroupHoldingsApi* | [**get_group_holdings**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/GroupHoldingsApi.md#get_group_holdings) | **GET** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.
*GroupHoldingsApi* | [**get_group_holdings_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/GroupHoldingsApi.md#get_group_holdings_for_list) | **POST** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.
*HelperApi* | [**get_statuses**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/HelperApi.md#get_statuses) | **GET** /factset-funds/v1/status | Get Fund&#39;s current status and database availability
*HelperApi* | [**get_statuses_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/HelperApi.md#get_statuses_for_list) | **POST** /factset-funds/v1/status | Get Fund&#39;s current status and database availability for large list of ids.
*MarketAggregatesApi* | [**get_market_aggregates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/MarketAggregatesApi.md#get_market_aggregates) | **GET** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.
*MarketAggregatesApi* | [**get_market_aggregates_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/MarketAggregatesApi.md#get_market_aggregates_for_list) | **POST** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.
*PricesReturnsApi* | [**get_funds_prices**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_prices) | **GET** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested time-series
*PricesReturnsApi* | [**get_funds_prices_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_prices_for_list) | **POST** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested date range and large list of ids.
*PricesReturnsApi* | [**get_funds_returns**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_returns) | **GET** /factset-funds/v1/returns | Get Fund Returns for a requested time-series
*PricesReturnsApi* | [**get_funds_returns_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_returns_for_list) | **POST** /factset-funds/v1/returns | Get Fund Returns for a requested time-series and large list of ids
*PricesReturnsApi* | [**get_funds_returns_range**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_returns_range) | **GET** /factset-funds/v1/returns-range | Get Fund Returns for a user-defined date range
*PricesReturnsApi* | [**get_funds_returns_range_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_returns_range_for_list) | **POST** /factset-funds/v1/returns-range | Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.
*PricesReturnsApi* | [**get_funds_returns_snapshot**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_returns_snapshot) | **GET** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
*PricesReturnsApi* | [**get_funds_returns_snapshot_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/PricesReturnsApi.md#get_funds_returns_snapshot_for_list) | **POST** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
*ReferenceApi* | [**get_funds_benchmark_details**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_benchmark_details) | **GET** /factset-funds/v1/benchmark-details | Get the Fund&#39;s Primary and Segment Benchmark Details
*ReferenceApi* | [**get_funds_benchmark_details_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_benchmark_details_for_list) | **POST** /factset-funds/v1/benchmark-details | Get the Fund&#39;s Primary and Segment Benchmark details for large list of ids.
*ReferenceApi* | [**get_funds_classifications**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_classifications) | **GET** /factset-funds/v1/classifications | Get basic Fund Classifications
*ReferenceApi* | [**get_funds_classifications_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_classifications_for_list) | **POST** /factset-funds/v1/classifications | Get basic Fund Classifications for a large list of ids.
*ReferenceApi* | [**get_funds_costs_fees**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_costs_fees) | **GET** /factset-funds/v1/costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.
*ReferenceApi* | [**get_funds_costs_fees_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_costs_fees_for_list) | **POST** /factset-funds/v1/costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of ids.
*ReferenceApi* | [**get_funds_managers**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_managers) | **GET** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a list of ids.
*ReferenceApi* | [**get_funds_managers_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_managers_for_list) | **POST** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a large list of ids.
*ReferenceApi* | [**get_funds_summary**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_summary) | **GET** /factset-funds/v1/summary | Get basic reference summary data for a Fund.
*ReferenceApi* | [**get_funds_summary_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_funds_summary_for_list) | **POST** /factset-funds/v1/summary | Get basic reference data for a large list of Fund ids.
*ReferenceApi* | [**get_related_funds**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_related_funds) | **GET** /factset-funds/v1/related-funds | Get a list of Related Funds for a list of Fund ids.
*ReferenceApi* | [**get_related_funds_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReferenceApi.md#get_related_funds_for_list) | **POST** /factset-funds/v1/related-funds | Get a list of Related Funds for a large list of Fund ids.


## Documentation For Models

 - [Aum](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Aum.md)
 - [AumRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/AumRequest.md)
 - [AumResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/AumResponse.md)
 - [BenchmarkDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/BenchmarkDetails.md)
 - [BenchmarkDetailsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/BenchmarkDetailsRequest.md)
 - [BenchmarkDetailsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/BenchmarkDetailsResponse.md)
 - [Classifications](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Classifications.md)
 - [ClassificationsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ClassificationsRequest.md)
 - [ClassificationsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ClassificationsResponse.md)
 - [CostsFees](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/CostsFees.md)
 - [CostsFeesIds](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/CostsFeesIds.md)
 - [CostsFeesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/CostsFeesRequest.md)
 - [CostsFeesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/CostsFeesResponse.md)
 - [DataType](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DataType.md)
 - [DistCurrent](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistCurrent.md)
 - [DistCurrentRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistCurrentRequest.md)
 - [DistCurrentResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistCurrentResponse.md)
 - [DistHistorical](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistHistorical.md)
 - [DistHistoricalRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistHistoricalRequest.md)
 - [DistHistoricalResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistHistoricalResponse.md)
 - [DistributionOrYieldDist](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DistributionOrYieldDist.md)
 - [DividendAdjust](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/DividendAdjust.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ErrorResponse.md)
 - [ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ErrorResponseSubErrors.md)
 - [Flows](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Flows.md)
 - [FlowsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FlowsRequest.md)
 - [FlowsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FlowsResponse.md)
 - [Frequency](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Frequency.md)
 - [FrequencyAum](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FrequencyAum.md)
 - [FundsPricesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundsPricesRequest.md)
 - [FundsPricesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundsPricesResponse.md)
 - [FundsReturnsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundsReturnsRequest.md)
 - [FundsReturnsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundsReturnsResponse.md)
 - [FundsReturnsSnapshotRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundsReturnsSnapshotRequest.md)
 - [FundsReturnsSnapshotResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/FundsReturnsSnapshotResponse.md)
 - [Group](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Group.md)
 - [GroupHolding](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/GroupHolding.md)
 - [GroupHoldingsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/GroupHoldingsRequest.md)
 - [GroupHoldingsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/GroupHoldingsResponse.md)
 - [Ids](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Ids.md)
 - [Lang](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Lang.md)
 - [Managers](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Managers.md)
 - [ManagersRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ManagersRequest.md)
 - [ManagersResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ManagersResponse.md)
 - [MarketAggregate](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/MarketAggregate.md)
 - [MarketAggregatesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/MarketAggregatesRequest.md)
 - [MarketAggregatesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/MarketAggregatesResponse.md)
 - [Prices](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Prices.md)
 - [RelatedFunds](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/RelatedFunds.md)
 - [RelatedFundsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/RelatedFundsRequest.md)
 - [RelatedFundsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/RelatedFundsResponse.md)
 - [Returns](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Returns.md)
 - [ReturnsRange](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReturnsRange.md)
 - [ReturnsRangeRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReturnsRangeRequest.md)
 - [ReturnsRangeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReturnsRangeResponse.md)
 - [ReturnsSnapshot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/ReturnsSnapshot.md)
 - [SplitAdjust](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/SplitAdjust.md)
 - [Statuses](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Statuses.md)
 - [StatusesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/StatusesRequest.md)
 - [StatusesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/StatusesResponse.md)
 - [Summaries](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/Summaries.md)
 - [SummariesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/SummariesRequest.md)
 - [SummariesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetFunds/v1/docs/SummariesResponse.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.FactSetFunds.apis and fds.sdk.FactSetFunds.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.FactSetFunds.api.default_api import DefaultApi`
- `from fds.sdk.FactSetFunds.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.apis import *
from fds.sdk.FactSetFunds.models import *
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

