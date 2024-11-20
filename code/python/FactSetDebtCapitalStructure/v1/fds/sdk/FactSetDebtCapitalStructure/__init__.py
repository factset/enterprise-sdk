# flake8: noqa

"""
    FactSet Debt Capital Structure API

    The FactSet Debt Capital Structure API offers insights into public and private company debt financing for 69,000+ entities globally. Analyze at the individual-instrument level through summary and detailed information of the debt structure with history available back through 2006. Instrument types covered include Revolving Credit, Term Loans, Notes, and Bonds.   **How to Programmatically Download API Specification file:**  Please use the below link to download the FactSet Debt Capital Structure API Specification file in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also access by selecting the \"Download Spec\" button to the right of the version below.  [https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml](https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml)  This API is rate-limited to 10 requests per second and 10 concurrent requests per user.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.1.2"

# import ApiClient
from fds.sdk.FactSetDebtCapitalStructure.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetDebtCapitalStructure.configuration import Configuration

# import exceptions
from fds.sdk.FactSetDebtCapitalStructure.exceptions import OpenApiException
from fds.sdk.FactSetDebtCapitalStructure.exceptions import ApiAttributeError
from fds.sdk.FactSetDebtCapitalStructure.exceptions import ApiTypeError
from fds.sdk.FactSetDebtCapitalStructure.exceptions import ApiValueError
from fds.sdk.FactSetDebtCapitalStructure.exceptions import ApiKeyError
from fds.sdk.FactSetDebtCapitalStructure.exceptions import ApiException
