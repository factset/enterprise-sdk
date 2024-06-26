# flake8: noqa

"""
    Time Series API For Digital Portals

    Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information.   # noqa: E501

    The version of the OpenAPI document: 3.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.11.5"

# import ApiClient
from fds.sdk.RealTimeTimeSeries.api_client import ApiClient

# import Configuration
from fds.sdk.RealTimeTimeSeries.configuration import Configuration

# import exceptions
from fds.sdk.RealTimeTimeSeries.exceptions import OpenApiException
from fds.sdk.RealTimeTimeSeries.exceptions import ApiAttributeError
from fds.sdk.RealTimeTimeSeries.exceptions import ApiTypeError
from fds.sdk.RealTimeTimeSeries.exceptions import ApiValueError
from fds.sdk.RealTimeTimeSeries.exceptions import ApiKeyError
from fds.sdk.RealTimeTimeSeries.exceptions import ApiException
