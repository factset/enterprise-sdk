# flake8: noqa

"""
    Exchange DataFeed Snapshot

    FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 300 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.21.15"

# import ApiClient
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.api_client import ApiClient

# import Configuration
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.configuration import Configuration

# import exceptions
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.exceptions import OpenApiException
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.exceptions import ApiAttributeError
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.exceptions import ApiTypeError
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.exceptions import ApiValueError
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.exceptions import ApiKeyError
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.exceptions import ApiException
