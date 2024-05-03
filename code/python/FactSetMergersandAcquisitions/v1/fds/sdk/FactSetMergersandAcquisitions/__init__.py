# flake8: noqa

"""
    FactSet Mergers and Acquisitions API

    The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.0"

# import ApiClient
from fds.sdk.FactSetMergersandAcquisitions.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetMergersandAcquisitions.configuration import Configuration

# import exceptions
from fds.sdk.FactSetMergersandAcquisitions.exceptions import OpenApiException
from fds.sdk.FactSetMergersandAcquisitions.exceptions import ApiAttributeError
from fds.sdk.FactSetMergersandAcquisitions.exceptions import ApiTypeError
from fds.sdk.FactSetMergersandAcquisitions.exceptions import ApiValueError
from fds.sdk.FactSetMergersandAcquisitions.exceptions import ApiKeyError
from fds.sdk.FactSetMergersandAcquisitions.exceptions import ApiException
