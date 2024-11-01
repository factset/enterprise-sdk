# flake8: noqa

"""
    Standard DataFeed (SDF) Download API

    [The Standard DataFeed (SDF) Download API](https://www.factset.com/marketplace/catalog/product/factset-standard-datafeed-download-api)  provides an alternative method for users to request and retrieve SDF packages (schemas & bundles).  This service is not a direct replacement and does not have 100% feature parity with the Loader Application.  This API provides an alternative for users who are unable to utilize the Loader application due to the following reasons:  * Inability to install 3rd party executables due to Corporate Security policies.  * Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed.  * Clients who are utilizing existing delivery methods like FTP, who may want to use a more secure & modern solution.  This API allows users to retrieve  * Both SDF and the QFL (Quant Factor Library (Factor Family & Factor Groups)) packages they have subscriptions for, with data available since January 1, 1995.  Additional parameters are available to filter requests to get the exact files users are looking for.  QFL data is delivered through Content API & Bulk Data API (SDF API).  * Content API: Provides direct access to FactSet-hosted QFL data. Suitable for interactive, ad hoc QFL requests. Constraints on large extracts. Costs are based on consumption, i.e. more calls can result in more costs.  * Bulk Data API: Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).  Please find all the content-related comprehensive documentation [here](https://my.apps.factset.com/oa/pages/15222).   # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.1"

# import ApiClient
from fds.sdk.StandardDatafeed.api_client import ApiClient

# import Configuration
from fds.sdk.StandardDatafeed.configuration import Configuration

# import exceptions
from fds.sdk.StandardDatafeed.exceptions import OpenApiException
from fds.sdk.StandardDatafeed.exceptions import ApiAttributeError
from fds.sdk.StandardDatafeed.exceptions import ApiTypeError
from fds.sdk.StandardDatafeed.exceptions import ApiValueError
from fds.sdk.StandardDatafeed.exceptions import ApiKeyError
from fds.sdk.StandardDatafeed.exceptions import ApiException
