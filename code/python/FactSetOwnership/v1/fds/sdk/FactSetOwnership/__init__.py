# flake8: noqa

"""
    FactSet Ownership API

    FactSet's Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p>   # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.14"

# import ApiClient
from fds.sdk.FactSetOwnership.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetOwnership.configuration import Configuration

# import exceptions
from fds.sdk.FactSetOwnership.exceptions import OpenApiException
from fds.sdk.FactSetOwnership.exceptions import ApiAttributeError
from fds.sdk.FactSetOwnership.exceptions import ApiTypeError
from fds.sdk.FactSetOwnership.exceptions import ApiValueError
from fds.sdk.FactSetOwnership.exceptions import ApiKeyError
from fds.sdk.FactSetOwnership.exceptions import ApiException
