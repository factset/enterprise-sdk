# flake8: noqa

"""
    FactSet People API

    The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>   # noqa: E501

    The version of the OpenAPI document: 1.3.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.15"

# import ApiClient
from fds.sdk.FactSetPeople.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetPeople.configuration import Configuration

# import exceptions
from fds.sdk.FactSetPeople.exceptions import OpenApiException
from fds.sdk.FactSetPeople.exceptions import ApiAttributeError
from fds.sdk.FactSetPeople.exceptions import ApiTypeError
from fds.sdk.FactSetPeople.exceptions import ApiValueError
from fds.sdk.FactSetPeople.exceptions import ApiKeyError
from fds.sdk.FactSetPeople.exceptions import ApiException
