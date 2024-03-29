[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Virtual Portfolio API for Digital Portals client library for Python

[![PyPi](https://img.shields.io/pypi/v/fds.sdk.VirtualPortfolioAPIforDigitalPortals)](https://pypi.org/project/fds.sdk.VirtualPortfolioAPIforDigitalPortals/)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The virtual portfolio enables the analysis of the current allocation, broken down by asset classes, currencies, 
regions, sectors, style, capitalization, style, maturity, risk, and more.

Relative performance and monthly returns can be measured against benchmarks, using portfolio position transaction (buy/sell) data.
Both the realized profit/loss (resulting from closed transactions) and the potential profit/loss (resulting from positions that have not been sold yet) can be queried.

Portfolio endpoints allow creation and managing a transaction-based portfolio. A transaction-based portfolio contains a gapless history of all transactions to be able to accurately reproduce the investment record of the portfolio.

An instrument added to a portfolio is called a position. Each position consists of multiple buy and sell events called transactions.
Portfolios are limited to 100 positions and 1000 transactions; adding more will result in an error.

A transaction-based portfolio can consist of the following transactions:

* A buy transaction opens or adds to a position in the portfolio, decreasing the cash value by the purchase price at the same time. If there is not enough cash in the portfolio to cover the transaction, the cash value becomes negative.
* A sell transaction decreases or closes a position in the portfolio, increasing the cash value by the sale price at the same time. A sell transaction can only be created if the number of shares of a given position exceeds the number being sold.
* A cash transaction increases or decreases the cash position of the portfolio. A portfolio can have only one cash position. The cash position is tracked automatically as each buy or sell transaction implicitly affects it. The cash position can be negative as a buy transaction does not check whether enough cash is available. The cash position does not generate interest; its performance is always 0%.

The chosen prices and key figures in the endpoints are using the same quality, which is configurable per application. Possible values are delayed (DLY), best (BST), end-of-day (EOD) or realtime (RLT). The default value for the price quality is BST.

The portfolio endpoints use different methods to calculate key figures. All key figures except the risk in /portfolio/detail/list, /portfolio/get, and /portfolio/position/list are calculated on-the-fly with current prices. The risk key figures are calculated on-the-fly with current prices, but the result is cached for 24 hours. The key figures in /portfolio/evaluation/list are calculated on end-of-day basis.

The Virtual Portfolio API for Digital Portals is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments in a watchlist. This also supports basic security identifier cross-reference. To complement the Watchlist API and Virtual Portfolio API with direct access to price histories, please refer to the Time Series API for Digital Portals.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2
- Package version: 0.9.5
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.VirtualPortfolioAPIforDigitalPortals
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.VirtualPortfolioAPIforDigitalPortals
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

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api import portfolio_api
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = portfolio_api.PortfolioApi(api_client)
    id = "id_example" # str | 
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a portfolio.
        api_response = api_instance.get_portfolio_get(id, attributes=attributes)
        pprint(api_response)
    except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PortfolioApi->get_portfolio_get: %s\n" % e)

    # Get response, http status code and response headers
    # try:
    #     # Details of a portfolio.
    #     api_response, http_status_code, response_headers = api_instance.get_portfolio_get_with_http_info(id, attributes=attributes)
    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
    #     print("Exception when calling PortfolioApi->get_portfolio_get: %s\n" % e)

    # Get response asynchronous
    # try:
    #     # Details of a portfolio.
    #     async_result = api_instance.get_portfolio_get_async(id, attributes=attributes)
    #     api_response = async_result.get()
    #     pprint(api_response)
    # except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
    #     print("Exception when calling PortfolioApi->get_portfolio_get: %s\n" % e)

    # Get response, http status code and response headers asynchronous
    # try:
    #     # Details of a portfolio.
    #     async_result = api_instance.get_portfolio_get_with_http_info_async(id, attributes=attributes)
    #     api_response, http_status_code, response_headers = async_result.get()
    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException as e:
    #     print("Exception when calling PortfolioApi->get_portfolio_get: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/wealth/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PortfolioApi* | [**get_portfolio_get**](docs/PortfolioApi.md#get_portfolio_get) | **GET** /portfolio/get | Details of a portfolio.
*PortfolioApi* | [**get_portfolio_list**](docs/PortfolioApi.md#get_portfolio_list) | **GET** /portfolio/list | List of portfolios with keyfigures.
*PortfolioApi* | [**get_portfolio_name_list**](docs/PortfolioApi.md#get_portfolio_name_list) | **GET** /portfolio/name/list | List of portfolios.
*PortfolioApi* | [**get_portfolio_position_list**](docs/PortfolioApi.md#get_portfolio_position_list) | **GET** /portfolio/position/list | List all open positions of a portfolio.
*PortfolioApi* | [**get_portfolio_transaction_list**](docs/PortfolioApi.md#get_portfolio_transaction_list) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
*PortfolioApi* | [**post_portfolio_create**](docs/PortfolioApi.md#post_portfolio_create) | **POST** /portfolio/create | Create a portfolio.
*PortfolioApi* | [**post_portfolio_delete**](docs/PortfolioApi.md#post_portfolio_delete) | **POST** /portfolio/delete | Delete a portfolio.
*PortfolioApi* | [**post_portfolio_evaluation_list**](docs/PortfolioApi.md#post_portfolio_evaluation_list) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
*PortfolioApi* | [**post_portfolio_modify**](docs/PortfolioApi.md#post_portfolio_modify) | **POST** /portfolio/modify | Modify a portfolio.
*PortfolioApi* | [**post_portfolio_payout_create**](docs/PortfolioApi.md#post_portfolio_payout_create) | **POST** /portfolio/payout/create | Add a payout to a portfolio.
*PortfolioApi* | [**post_portfolio_payout_delete**](docs/PortfolioApi.md#post_portfolio_payout_delete) | **POST** /portfolio/payout/delete | Delete a payout of a portfolio.
*PortfolioApi* | [**post_portfolio_payout_list**](docs/PortfolioApi.md#post_portfolio_payout_list) | **POST** /portfolio/payout/list | List of payouts in a portfolio.
*PortfolioApi* | [**post_portfolio_payout_modify**](docs/PortfolioApi.md#post_portfolio_payout_modify) | **POST** /portfolio/payout/modify | Modify a payout in a portfolio.
*PortfolioApi* | [**post_portfolio_position_closed_list**](docs/PortfolioApi.md#post_portfolio_position_closed_list) | **POST** /portfolio/position/closed/list | List all closed positions of a portfolio.
*PortfolioApi* | [**post_portfolio_transaction_cash_create**](docs/PortfolioApi.md#post_portfolio_transaction_cash_create) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
*PortfolioApi* | [**post_portfolio_transaction_cash_delete**](docs/PortfolioApi.md#post_portfolio_transaction_cash_delete) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
*PortfolioApi* | [**post_portfolio_transaction_create**](docs/PortfolioApi.md#post_portfolio_transaction_create) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
*PortfolioApi* | [**post_portfolio_transaction_delete**](docs/PortfolioApi.md#post_portfolio_transaction_delete) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
*PortfolioApi* | [**post_portfolio_transaction_modify**](docs/PortfolioApi.md#post_portfolio_transaction_modify) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.
*WatchlistApi* | [**get_watchlist_get**](docs/WatchlistApi.md#get_watchlist_get) | **GET** /watchlist/get | Details of a watchlist.
*WatchlistApi* | [**get_watchlist_list**](docs/WatchlistApi.md#get_watchlist_list) | **GET** /watchlist/list | List of watchlists.
*WatchlistApi* | [**get_watchlist_position_list**](docs/WatchlistApi.md#get_watchlist_position_list) | **GET** /watchlist/position/list | List of positions of a watchlist.
*WatchlistApi* | [**post_watchlist_create**](docs/WatchlistApi.md#post_watchlist_create) | **POST** /watchlist/create | Create a watchlist.
*WatchlistApi* | [**post_watchlist_delete**](docs/WatchlistApi.md#post_watchlist_delete) | **POST** /watchlist/delete | Delete a watchlist.
*WatchlistApi* | [**post_watchlist_modify**](docs/WatchlistApi.md#post_watchlist_modify) | **POST** /watchlist/modify | Modify a watchlist.
*WatchlistApi* | [**post_watchlist_position_create**](docs/WatchlistApi.md#post_watchlist_position_create) | **POST** /watchlist/position/create | Add a position to a watchlist.
*WatchlistApi* | [**post_watchlist_position_delete**](docs/WatchlistApi.md#post_watchlist_position_delete) | **POST** /watchlist/position/delete | Delete a position of a watchlist.
*WatchlistApi* | [**post_watchlist_position_get**](docs/WatchlistApi.md#post_watchlist_position_get) | **POST** /watchlist/position/get | Details of the position of a watchlist.
*WatchlistApi* | [**post_watchlist_position_modify**](docs/WatchlistApi.md#post_watchlist_position_modify) | **POST** /watchlist/position/modify | Modify a position in a watchlist.


## Documentation For Models

 - [AttributesMember](docs/AttributesMember.md)
 - [CursorBasedPaginationOutputObject](docs/CursorBasedPaginationOutputObject.md)
 - [CursorBasedPaginationOutputObjectWithoutTotal](docs/CursorBasedPaginationOutputObjectWithoutTotal.md)
 - [ErrorMetaObject](docs/ErrorMetaObject.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [InlineObject10](docs/InlineObject10.md)
 - [InlineObject11](docs/InlineObject11.md)
 - [InlineObject12](docs/InlineObject12.md)
 - [InlineObject13](docs/InlineObject13.md)
 - [InlineObject14](docs/InlineObject14.md)
 - [InlineObject15](docs/InlineObject15.md)
 - [InlineObject16](docs/InlineObject16.md)
 - [InlineObject17](docs/InlineObject17.md)
 - [InlineObject18](docs/InlineObject18.md)
 - [InlineObject19](docs/InlineObject19.md)
 - [InlineObject2](docs/InlineObject2.md)
 - [InlineObject20](docs/InlineObject20.md)
 - [InlineObject3](docs/InlineObject3.md)
 - [InlineObject4](docs/InlineObject4.md)
 - [InlineObject5](docs/InlineObject5.md)
 - [InlineObject6](docs/InlineObject6.md)
 - [InlineObject7](docs/InlineObject7.md)
 - [InlineObject8](docs/InlineObject8.md)
 - [InlineObject9](docs/InlineObject9.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20010Data](docs/InlineResponse20010Data.md)
 - [InlineResponse20010DataInstrument](docs/InlineResponse20010DataInstrument.md)
 - [InlineResponse20010DataPayout](docs/InlineResponse20010DataPayout.md)
 - [InlineResponse20010DataPositions](docs/InlineResponse20010DataPositions.md)
 - [InlineResponse20010DataProfitLoss](docs/InlineResponse20010DataProfitLoss.md)
 - [InlineResponse20010DataTransaction](docs/InlineResponse20010DataTransaction.md)
 - [InlineResponse20010DataTransactionBuy](docs/InlineResponse20010DataTransactionBuy.md)
 - [InlineResponse20010DataTransactionBuyCurrency](docs/InlineResponse20010DataTransactionBuyCurrency.md)
 - [InlineResponse20010DataTransactionBuyNotation](docs/InlineResponse20010DataTransactionBuyNotation.md)
 - [InlineResponse20010DataTransactionSell](docs/InlineResponse20010DataTransactionSell.md)
 - [InlineResponse20010DataTransactionSellCurrency](docs/InlineResponse20010DataTransactionSellCurrency.md)
 - [InlineResponse20010DataTransactionSellNotation](docs/InlineResponse20010DataTransactionSellNotation.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20011Data](docs/InlineResponse20011Data.md)
 - [InlineResponse20011Notation](docs/InlineResponse20011Notation.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20012Data](docs/InlineResponse20012Data.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20013Data](docs/InlineResponse20013Data.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20014Data](docs/InlineResponse20014Data.md)
 - [InlineResponse20014DataNotation](docs/InlineResponse20014DataNotation.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20015Data](docs/InlineResponse20015Data.md)
 - [InlineResponse20015Notation](docs/InlineResponse20015Notation.md)
 - [InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [InlineResponse2001DataCurrency](docs/InlineResponse2001DataCurrency.md)
 - [InlineResponse2001DataLifecycle](docs/InlineResponse2001DataLifecycle.md)
 - [InlineResponse2001DataLifecycleTransaction](docs/InlineResponse2001DataLifecycleTransaction.md)
 - [InlineResponse2001DataProfitLoss](docs/InlineResponse2001DataProfitLoss.md)
 - [InlineResponse2001DataProfitLossPotential](docs/InlineResponse2001DataProfitLossPotential.md)
 - [InlineResponse2001DataProfitLossRealized](docs/InlineResponse2001DataProfitLossRealized.md)
 - [InlineResponse2001DataProfitLossToday](docs/InlineResponse2001DataProfitLossToday.md)
 - [InlineResponse2001DataProfitLossTotal](docs/InlineResponse2001DataProfitLossTotal.md)
 - [InlineResponse2001DataRiskKeyFigures](docs/InlineResponse2001DataRiskKeyFigures.md)
 - [InlineResponse2001DataSummary](docs/InlineResponse2001DataSummary.md)
 - [InlineResponse2001DataSummaryCash](docs/InlineResponse2001DataSummaryCash.md)
 - [InlineResponse2001DataSummaryTransactions](docs/InlineResponse2001DataSummaryTransactions.md)
 - [InlineResponse2001DataSummaryTransactionsBuy](docs/InlineResponse2001DataSummaryTransactionsBuy.md)
 - [InlineResponse2001DataSummaryTransactionsSell](docs/InlineResponse2001DataSummaryTransactionsSell.md)
 - [InlineResponse2001DataSummaryTransactionsTotal](docs/InlineResponse2001DataSummaryTransactionsTotal.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2002Currency](docs/InlineResponse2002Currency.md)
 - [InlineResponse2002Data](docs/InlineResponse2002Data.md)
 - [InlineResponse2002ProfitLoss](docs/InlineResponse2002ProfitLoss.md)
 - [InlineResponse2002Summary](docs/InlineResponse2002Summary.md)
 - [InlineResponse2002SummaryTransactions](docs/InlineResponse2002SummaryTransactions.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004Data](docs/InlineResponse2004Data.md)
 - [InlineResponse2004DataKeyfigures](docs/InlineResponse2004DataKeyfigures.md)
 - [InlineResponse2004DataPeriod](docs/InlineResponse2004DataPeriod.md)
 - [InlineResponse2004DataPeriodProfitLoss](docs/InlineResponse2004DataPeriodProfitLoss.md)
 - [InlineResponse2004DataProfitLoss](docs/InlineResponse2004DataProfitLoss.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005Data](docs/InlineResponse2005Data.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2007Data](docs/InlineResponse2007Data.md)
 - [InlineResponse2007Instrument](docs/InlineResponse2007Instrument.md)
 - [InlineResponse2007Meta](docs/InlineResponse2007Meta.md)
 - [InlineResponse2007Notation](docs/InlineResponse2007Notation.md)
 - [InlineResponse2007Transaction](docs/InlineResponse2007Transaction.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse2009Data](docs/InlineResponse2009Data.md)
 - [InlineResponse2009DataCurrency](docs/InlineResponse2009DataCurrency.md)
 - [InlineResponse2009DataInstrument](docs/InlineResponse2009DataInstrument.md)
 - [InlineResponse2009DataInstrumentAssetClass](docs/InlineResponse2009DataInstrumentAssetClass.md)
 - [InlineResponse2009DataInstrumentType](docs/InlineResponse2009DataInstrumentType.md)
 - [InlineResponse2009DataNotation](docs/InlineResponse2009DataNotation.md)
 - [InlineResponse2009DataNotationPrice](docs/InlineResponse2009DataNotationPrice.md)
 - [InlineResponse2009DataPositions](docs/InlineResponse2009DataPositions.md)
 - [InlineResponse2009DataProfitLoss](docs/InlineResponse2009DataProfitLoss.md)
 - [InlineResponse2009DataProfitLossIntraday](docs/InlineResponse2009DataProfitLossIntraday.md)
 - [InlineResponse2009DataProfitLossPotential](docs/InlineResponse2009DataProfitLossPotential.md)
 - [InlineResponse2009DataPurchase](docs/InlineResponse2009DataPurchase.md)
 - [InlineResponse2009DataShares](docs/InlineResponse2009DataShares.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [InlineResponse2011Data](docs/InlineResponse2011Data.md)
 - [InlineResponse2012](docs/InlineResponse2012.md)
 - [InlineResponse2012Data](docs/InlineResponse2012Data.md)
 - [InlineResponse2013](docs/InlineResponse2013.md)
 - [InlineResponse2013Data](docs/InlineResponse2013Data.md)
 - [InlineResponse2014](docs/InlineResponse2014.md)
 - [InlineResponse2014Data](docs/InlineResponse2014Data.md)
 - [InlineResponse201Data](docs/InlineResponse201Data.md)
 - [InlineResponse201Meta](docs/InlineResponse201Meta.md)
 - [LanguageMember](docs/LanguageMember.md)
 - [OffsetBasedPaginationOutputObject](docs/OffsetBasedPaginationOutputObject.md)
 - [OffsetBasedPaginationOutputObjectWithoutTotal](docs/OffsetBasedPaginationOutputObjectWithoutTotal.md)
 - [PartialOutputObject](docs/PartialOutputObject.md)
 - [PortfolioCreateData](docs/PortfolioCreateData.md)
 - [PortfolioCreateDataCurrency](docs/PortfolioCreateDataCurrency.md)
 - [PortfolioCreateMeta](docs/PortfolioCreateMeta.md)
 - [PortfolioDeleteData](docs/PortfolioDeleteData.md)
 - [PortfolioEvaluationListData](docs/PortfolioEvaluationListData.md)
 - [PortfolioEvaluationListDataRange](docs/PortfolioEvaluationListDataRange.md)
 - [PortfolioModifyData](docs/PortfolioModifyData.md)
 - [PortfolioPayoutCreateData](docs/PortfolioPayoutCreateData.md)
 - [PortfolioPayoutCreateDataNotation](docs/PortfolioPayoutCreateDataNotation.md)
 - [PortfolioPayoutCreateDataTransaction](docs/PortfolioPayoutCreateDataTransaction.md)
 - [PortfolioPayoutDeleteData](docs/PortfolioPayoutDeleteData.md)
 - [PortfolioPayoutDeleteDataPayout](docs/PortfolioPayoutDeleteDataPayout.md)
 - [PortfolioPayoutListData](docs/PortfolioPayoutListData.md)
 - [PortfolioPayoutListDataFilter](docs/PortfolioPayoutListDataFilter.md)
 - [PortfolioPayoutListDataFilterInstrument](docs/PortfolioPayoutListDataFilterInstrument.md)
 - [PortfolioPayoutListMeta](docs/PortfolioPayoutListMeta.md)
 - [PortfolioPayoutListMetaPagination](docs/PortfolioPayoutListMetaPagination.md)
 - [PortfolioPayoutModifyData](docs/PortfolioPayoutModifyData.md)
 - [PortfolioPayoutModifyDataPayout](docs/PortfolioPayoutModifyDataPayout.md)
 - [PortfolioPayoutModifyDataPayoutNotation](docs/PortfolioPayoutModifyDataPayoutNotation.md)
 - [PortfolioPayoutModifyDataPayoutTransaction](docs/PortfolioPayoutModifyDataPayoutTransaction.md)
 - [PortfolioPositionClosedListData](docs/PortfolioPositionClosedListData.md)
 - [PortfolioPositionClosedListDataRange](docs/PortfolioPositionClosedListDataRange.md)
 - [PortfolioPositionClosedListMeta](docs/PortfolioPositionClosedListMeta.md)
 - [PortfolioPositionClosedListMetaPagination](docs/PortfolioPositionClosedListMetaPagination.md)
 - [PortfolioTransactionCashCreateData](docs/PortfolioTransactionCashCreateData.md)
 - [PortfolioTransactionCashDeleteData](docs/PortfolioTransactionCashDeleteData.md)
 - [PortfolioTransactionCreateData](docs/PortfolioTransactionCreateData.md)
 - [PortfolioTransactionCreateDataParentTransaction](docs/PortfolioTransactionCreateDataParentTransaction.md)
 - [PortfolioTransactionDeleteData](docs/PortfolioTransactionDeleteData.md)
 - [PortfolioTransactionDeleteDataTransaction](docs/PortfolioTransactionDeleteDataTransaction.md)
 - [PortfolioTransactionModifyData](docs/PortfolioTransactionModifyData.md)
 - [PortfolioTransactionModifyDataTransaction](docs/PortfolioTransactionModifyDataTransaction.md)
 - [StatusObject](docs/StatusObject.md)
 - [WatchlistCreateData](docs/WatchlistCreateData.md)
 - [WatchlistDeleteData](docs/WatchlistDeleteData.md)
 - [WatchlistModifyData](docs/WatchlistModifyData.md)
 - [WatchlistPositionCreateData](docs/WatchlistPositionCreateData.md)
 - [WatchlistPositionDeleteData](docs/WatchlistPositionDeleteData.md)
 - [WatchlistPositionDeleteDataPosition](docs/WatchlistPositionDeleteDataPosition.md)
 - [WatchlistPositionGetData](docs/WatchlistPositionGetData.md)
 - [WatchlistPositionGetDataPosition](docs/WatchlistPositionGetDataPosition.md)
 - [WatchlistPositionModifyData](docs/WatchlistPositionModifyData.md)
 - [WatchlistPositionModifyDataPosition](docs/WatchlistPositionModifyDataPosition.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.VirtualPortfolioAPIforDigitalPortals.apis and fds.sdk.VirtualPortfolioAPIforDigitalPortals.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.VirtualPortfolioAPIforDigitalPortals.api.default_api import DefaultApi`
- `from fds.sdk.VirtualPortfolioAPIforDigitalPortals.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.VirtualPortfolioAPIforDigitalPortals
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.apis import *
from fds.sdk.VirtualPortfolioAPIforDigitalPortals.models import *
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

