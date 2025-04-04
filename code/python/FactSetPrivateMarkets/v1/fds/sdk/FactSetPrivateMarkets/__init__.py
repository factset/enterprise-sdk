# flake8: noqa

"""
    FactSet Private Markets API

    FactSet Private Markets API encompasses Private Company Financials data to start. Private Company firmographics can be found in the FactSet Entity API. The future plans of this service will include additional Private Markets data, such as Private Equity/Venture Capital.<p><b>Rate limit is set to 10 requests per second</b>.</p>   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.14"

# import ApiClient
from fds.sdk.FactSetPrivateMarkets.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetPrivateMarkets.configuration import Configuration

# import exceptions
from fds.sdk.FactSetPrivateMarkets.exceptions import OpenApiException
from fds.sdk.FactSetPrivateMarkets.exceptions import ApiAttributeError
from fds.sdk.FactSetPrivateMarkets.exceptions import ApiTypeError
from fds.sdk.FactSetPrivateMarkets.exceptions import ApiValueError
from fds.sdk.FactSetPrivateMarkets.exceptions import ApiKeyError
from fds.sdk.FactSetPrivateMarkets.exceptions import ApiException
