# flake8: noqa

"""
    FactSet Options API

    The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.14"

# import ApiClient
from fds.sdk.FactSetOptions.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetOptions.configuration import Configuration

# import exceptions
from fds.sdk.FactSetOptions.exceptions import OpenApiException
from fds.sdk.FactSetOptions.exceptions import ApiAttributeError
from fds.sdk.FactSetOptions.exceptions import ApiTypeError
from fds.sdk.FactSetOptions.exceptions import ApiValueError
from fds.sdk.FactSetOptions.exceptions import ApiKeyError
from fds.sdk.FactSetOptions.exceptions import ApiException
