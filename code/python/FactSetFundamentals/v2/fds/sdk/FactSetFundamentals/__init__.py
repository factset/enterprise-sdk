# flake8: noqa

"""
    FactSet Fundamentals API

    Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>   # noqa: E501

    The version of the OpenAPI document: 2.2.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "2.3.2"

# import ApiClient
from fds.sdk.FactSetFundamentals.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetFundamentals.configuration import Configuration

# import exceptions
from fds.sdk.FactSetFundamentals.exceptions import OpenApiException
from fds.sdk.FactSetFundamentals.exceptions import ApiAttributeError
from fds.sdk.FactSetFundamentals.exceptions import ApiTypeError
from fds.sdk.FactSetFundamentals.exceptions import ApiValueError
from fds.sdk.FactSetFundamentals.exceptions import ApiKeyError
from fds.sdk.FactSetFundamentals.exceptions import ApiException
