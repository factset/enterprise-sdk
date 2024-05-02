# flake8: noqa

"""
    StreetAccount News API

    The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.40.1"

# import ApiClient
from fds.sdk.StreetAccountNews.api_client import ApiClient

# import Configuration
from fds.sdk.StreetAccountNews.configuration import Configuration

# import exceptions
from fds.sdk.StreetAccountNews.exceptions import OpenApiException
from fds.sdk.StreetAccountNews.exceptions import ApiAttributeError
from fds.sdk.StreetAccountNews.exceptions import ApiTypeError
from fds.sdk.StreetAccountNews.exceptions import ApiValueError
from fds.sdk.StreetAccountNews.exceptions import ApiKeyError
from fds.sdk.StreetAccountNews.exceptions import ApiException
