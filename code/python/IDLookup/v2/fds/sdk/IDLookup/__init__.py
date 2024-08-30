# flake8: noqa

"""
    ID Lookup API

    The ID Lookup API is a fuzzy search service that allows users to resolve symbols but are unable to find them elsewhere. The ID Lookup API allows users to search for entities in a wide variety of ways including, but not limited to, tickers, CUSIPs, URLs, a company’s brands, names and descriptions. The API does not require a complete query and will return different lists of results with each additional character, which enables users to iterate and adjust queries to return the desired results. Each search query returns a list of suggestions that can include every entity type offered by the API based on a matching and ranking algorithm.   The API response returns multiple different symbols that map to both internal FactSet identifiers like security or entity IDs as well as external identifiers like exchange tickers, Morningstar symbols and ISINs. This gives users flexibility in mapping identifiers across the FactSet universe.  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.10.1"

# import ApiClient
from fds.sdk.IDLookup.api_client import ApiClient

# import Configuration
from fds.sdk.IDLookup.configuration import Configuration

# import exceptions
from fds.sdk.IDLookup.exceptions import OpenApiException
from fds.sdk.IDLookup.exceptions import ApiAttributeError
from fds.sdk.IDLookup.exceptions import ApiTypeError
from fds.sdk.IDLookup.exceptions import ApiValueError
from fds.sdk.IDLookup.exceptions import ApiKeyError
from fds.sdk.IDLookup.exceptions import ApiException
