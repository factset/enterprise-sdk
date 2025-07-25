[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Best Execution Analytics for Smarter Trading (BEAST) client library for Python

[![API Version](https://img.shields.io/badge/api-v2.0.0-blue)](https://developer.factset.com/api-catalog/)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST/0.2.1)](https://pypi.org/project/fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST/v/0.2.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- SDK version: 0.2.1
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST==0.2.1
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST==0.2.1
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

import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api import market_impact_api
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models import *
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
configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = market_impact_api.MarketImpactApi(api_client)
    security_id = "FDS-US" # str | ISIN for European securities, otherwise TICKER
    region = "US" # str | The two character ISO country code of the trading region. EMEA is used for the European trading region
    currency = "USD" # str | The ISO 4217 currency code
    order_volume = 100000 # float | Order Volume
    strategy = "vwap" # str | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional)
    date = "2024-08-29" # str | Date in the format YYYY-MM-DD (optional)
    isin = "isin_example" # str | International securities identification number (optional)
    start_time = "10:00:00" # str | Start Time in the format HH:MM:SS (optional)
    end_time = "15:00:00" # str | End Time in the format HH:MM:SS (optional)
    front_load_half_life = 1000 # float | Front Load Half Life (optional)
    rear_load_half_life = 0 # float | Rear Load Half Life (optional)
    rear_ratio = 1 # float | Rear Ratio (optional)
    risk_aversion = 0.3 # float | Risk Aversion (optional)
    apply_momentum = False # bool | Flag to apply stock momentum. Specify true to include momentum (optional)
    side = "side_example" # str | Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. (optional)

    try:
        # Get Cost Impact
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_cost_impact(security_id, region, currency, order_volume, strategy=strategy, date=date, isin=isin, start_time=start_time, end_time=end_time, front_load_half_life=front_load_half_life, rear_load_half_life=rear_load_half_life, rear_ratio=rear_ratio, risk_aversion=risk_aversion, apply_momentum=apply_momentum, side=side)

        pprint(api_response)
    except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
        print("Exception when calling MarketImpactApi->get_cost_impact: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Get Cost Impact
    #     api_response, http_status_code, response_headers = api_instance.get_cost_impact_with_http_info(security_id, region, currency, order_volume, strategy=strategy, date=date, isin=isin, start_time=start_time, end_time=end_time, front_load_half_life=front_load_half_life, rear_load_half_life=rear_load_half_life, rear_ratio=rear_ratio, risk_aversion=risk_aversion, apply_momentum=apply_momentum, side=side)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
    #     print("Exception when calling MarketImpactApi->get_cost_impact: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Get Cost Impact
    #     async_result = api_instance.get_cost_impact_async(security_id, region, currency, order_volume, strategy=strategy, date=date, isin=isin, start_time=start_time, end_time=end_time, front_load_half_life=front_load_half_life, rear_load_half_life=rear_load_half_life, rear_ratio=rear_ratio, risk_aversion=risk_aversion, apply_momentum=apply_momentum, side=side)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
    #     print("Exception when calling MarketImpactApi->get_cost_impact: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Get Cost Impact
    #     async_result = api_instance.get_cost_impact_with_http_info_async(security_id, region, currency, order_volume, strategy=strategy, date=date, isin=isin, start_time=start_time, end_time=end_time, front_load_half_life=front_load_half_life, rear_load_half_life=rear_load_half_life, rear_ratio=rear_ratio, risk_aversion=risk_aversion, apply_momentum=apply_momentum, side=side)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.ApiException as e:
    #     print("Exception when calling MarketImpactApi->get_cost_impact: %s\n" % e)

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
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST

configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
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
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST

configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST

configuration = fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MarketImpactApi* | [**get_cost_impact**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/MarketImpactApi.md#get_cost_impact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact
*OrderDetailsApi* | [**get_order_fill_count**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_fill_count) | **GET** /tca/order/fill-count | Get Order Fill Count
*OrderDetailsApi* | [**get_order_index_etf**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_index_etf) | **GET** /tca/order/index-etf | Get Index ETF data
*OrderDetailsApi* | [**get_order_info**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_info) | **GET** /tca/order/order-info | Get Order Information
*OrderDetailsApi* | [**get_order_intra_stats**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_intra_stats) | **GET** /tca/order/intra-order-stats | Get Intra Order Stats
*OrderDetailsApi* | [**get_order_investment_timing**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_investment_timing) | **GET** /tca/order/investment-timing | Get Order Investment Timings
*OrderDetailsApi* | [**get_order_price_time_fills**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_price_time_fills) | **GET** /tca/order/price-time-fills | Get Price Time Fills
*OrderDetailsApi* | [**get_order_price_time_quotes**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_price_time_quotes) | **GET** /tca/order/price-time-quotes | Get Price Time Quotes
*OrderDetailsApi* | [**get_order_price_time_trades**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_price_time_trades) | **GET** /tca/order/price-time-trades | Get Price Time Trades
*OrderDetailsApi* | [**get_order_volume_price**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_volume_price) | **GET** /tca/order/volume-price | Get Order Volume Prices
*OrderDetailsApi* | [**get_order_volume_time**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_volume_time) | **GET** /tca/order/volume-time | Get Order Volume Times
*OrderDetailsApi* | [**get_order_volume_venue**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#get_order_volume_venue) | **GET** /tca/order/volume-venue | Get Order Volume Venues
*OrderSearchApi* | [**get_field_values**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderSearchApi.md#get_field_values) | **GET** /tca/search/field-values | Get Order field values
*OrderSearchApi* | [**get_orders**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderSearchApi.md#get_orders) | **GET** /tca/search/orders | Get Orders by field values
*OutliersApi* | [**get_outlier_metrics_by_percentile**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutliersApi.md#get_outlier_metrics_by_percentile) | **GET** /tca/outlier/metrics-by-percentile | Get Outlier Metrics by percentile
*OutliersApi* | [**get_outlier_metrics_standard**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutliersApi.md#get_outlier_metrics_standard) | **GET** /tca/outlier/metrics-standard | Get Outlier Metrics by standard deviation
*QuoteAnalyticsApi* | [**get_quote_inside_size**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteAnalyticsApi.md#get_quote_inside_size) | **GET** /la/quote/inside-size | Get Quote Analytics
*ReportsApi* | [**get_parent_aggregate_analysis**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportsApi.md#get_parent_aggregate_analysis) | **GET** /tca/report/parent-aggregate-analysis | Get Parent Aggregate Analysis
*TradeAnalyticsApi* | [**get_trade_analytics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsApi.md#get_trade_analytics) | **GET** /la/trade/trade-analytics | Get Trade Analytics
*TradeAnalyticsApi* | [**get_volume_analytics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsApi.md#get_volume_analytics) | **GET** /la/trade/volume-analytics | Get Volume Analytics
*ZScoreApi* | [**get_z_score_quotes**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreApi.md#get_z_score_quotes) | **GET** /la/zscore/quotes | Get Quote Z-Scores
*ZScoreApi* | [**get_z_score_trades**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreApi.md#get_z_score_trades) | **GET** /la/zscore/trades | Get Trade Z-Scores


## Documentation For Models

 - [CostImpact](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/CostImpact.md)
 - [CostImpactResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/CostImpactResponseRoot.md)
 - [Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/Error.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ErrorResponse.md)
 - [FieldValuesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/FieldValuesResponse.md)
 - [FieldValuesResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/FieldValuesResponseRoot.md)
 - [IndexETF](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IndexETF.md)
 - [IndexETFResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IndexETFResponse.md)
 - [IndexETFResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IndexETFResponseRoot.md)
 - [IntraOrderStat](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IntraOrderStat.md)
 - [IntraOrderStatResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IntraOrderStatResponse.md)
 - [IntraOrderStatResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IntraOrderStatResponseRoot.md)
 - [InvestmentTiming](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/InvestmentTiming.md)
 - [InvestmentTimingResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/InvestmentTimingResponse.md)
 - [InvestmentTimingResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/InvestmentTimingResponseRoot.md)
 - [MultiDayBenchmarks](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/MultiDayBenchmarks.md)
 - [Order](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/Order.md)
 - [OrderFillCountResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderFillCountResponse.md)
 - [OrderFillCountResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderFillCountResponseRoot.md)
 - [OrderInfoResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderInfoResponse.md)
 - [OrderInfoResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderInfoResponseRoot.md)
 - [OrdersResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrdersResponse.md)
 - [OrdersResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrdersResponseRoot.md)
 - [Outlier](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/Outlier.md)
 - [OutlierData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierData.md)
 - [OutlierDataResult](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierDataResult.md)
 - [OutlierMetrics](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierMetrics.md)
 - [OutlierResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierResponse.md)
 - [OutlierResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierResponseRoot.md)
 - [OutputStrategyBinData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutputStrategyBinData.md)
 - [PriceTimeFill](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeFill.md)
 - [PriceTimeFillResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeFillResponse.md)
 - [PriceTimeFillResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeFillResponseRoot.md)
 - [PriceTimeQuote](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeQuote.md)
 - [PriceTimeQuoteResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeQuoteResponse.md)
 - [PriceTimeQuoteResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeQuoteResponseRoot.md)
 - [PriceTimeTrade](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeTrade.md)
 - [PriceTimeTradeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeTradeResponse.md)
 - [PriceTimeTradeResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeTradeResponseRoot.md)
 - [QuoteInsideSize](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteInsideSize.md)
 - [QuoteInsideSizeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteInsideSizeResponse.md)
 - [QuoteInsideSizeResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteInsideSizeResponseRoot.md)
 - [ReportRecord](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportRecord.md)
 - [ReportResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportResponse.md)
 - [ReportResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportResponseRoot.md)
 - [TradeAnalytic](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalytic.md)
 - [TradeAnalyticsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsResponse.md)
 - [TradeAnalyticsResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsResponseRoot.md)
 - [VolumeAnalytic](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeAnalytic.md)
 - [VolumeAnalyticsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeAnalyticsResponse.md)
 - [VolumeAnalyticsResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeAnalyticsResponseRoot.md)
 - [VolumePrice](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePrice.md)
 - [VolumePriceBin](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceBin.md)
 - [VolumePriceMetrics](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceMetrics.md)
 - [VolumePriceResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceResponse.md)
 - [VolumePriceResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceResponseRoot.md)
 - [VolumeTime](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeTime.md)
 - [VolumeTimeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeTimeResponse.md)
 - [VolumeTimeResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeTimeResponseRoot.md)
 - [VolumeVenue](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeVenue.md)
 - [VolumeVenueResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeVenueResponse.md)
 - [VolumeVenueResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeVenueResponseRoot.md)
 - [ZScore](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScore.md)
 - [ZScoreResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreResponse.md)
 - [ZScoreResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreResponseRoot.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.apis and fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api.default_api import DefaultApi`
- `from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.apis import *
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.models import *
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

