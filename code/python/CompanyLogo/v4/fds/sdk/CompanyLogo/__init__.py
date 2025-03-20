# flake8: noqa

"""
    Company Logo API

    Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The logo API provides access to logos for a global universe of listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logo collection and maintenance takes into account IPOs, M&A notifications, and further consistency check mechanisms.  The Company Logo API seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api).     # noqa: E501

    The version of the OpenAPI document: 4.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.20.1"

# import ApiClient
from fds.sdk.CompanyLogo.api_client import ApiClient

# import Configuration
from fds.sdk.CompanyLogo.configuration import Configuration

# import exceptions
from fds.sdk.CompanyLogo.exceptions import OpenApiException
from fds.sdk.CompanyLogo.exceptions import ApiAttributeError
from fds.sdk.CompanyLogo.exceptions import ApiTypeError
from fds.sdk.CompanyLogo.exceptions import ApiValueError
from fds.sdk.CompanyLogo.exceptions import ApiKeyError
from fds.sdk.CompanyLogo.exceptions import ApiException
