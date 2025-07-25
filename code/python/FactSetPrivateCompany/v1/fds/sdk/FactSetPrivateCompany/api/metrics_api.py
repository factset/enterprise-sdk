"""
    FactSet Private Company API

    FactSet Private Company API encompasses Private Company Financials and includes some Private Company non-periodic data. Additional Private Company firmographics can be found in the FactSet Entity API. <p><b>Rate limit is set to 10 requests per second and 10 concurrent requests per user</b>.</p>   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetPrivateCompany.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetPrivateCompany.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetPrivateCompany.exceptions import ApiException
from fds.sdk.FactSetPrivateCompany.model.error_response import ErrorResponse
from fds.sdk.FactSetPrivateCompany.model.metrics_response import MetricsResponse





class MetricsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_metrics_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (MetricsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/metrics',
                'operation_id': 'get_metrics',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'category',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                    'category',
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                    ('category',): {

                        "FINANCIALS": "FINANCIALS",
                        "NON_PERIODIC": "NON_PERIODIC"
                    },
                },
                'openapi_types': {
                    'category':
                        (str,),
                },
                'attribute_map': {
                    'category': 'category',
                },
                'location_map': {
                    'category': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )


    @staticmethod
    def apply_kwargs_defaults(kwargs, return_http_data_only, async_req):
        kwargs["async_req"] = async_req
        kwargs["_return_http_data_only"] = return_http_data_only
        kwargs["_preload_content"] = kwargs.get("_preload_content", True)
        kwargs["_request_timeout"] = kwargs.get("_request_timeout", None)
        kwargs["_check_input_type"] = kwargs.get("_check_input_type", True)
        kwargs["_check_return_type"] = kwargs.get("_check_return_type", True)
        kwargs["_spec_property_naming"] = kwargs.get("_spec_property_naming", False)
        kwargs["_content_type"] = kwargs.get("_content_type")
        kwargs["_host_index"] = kwargs.get("_host_index")


    def get_metrics(
        self,
        **kwargs
    ) -> MetricsResponse:
        """Returns available private company metrics, and ratios.  # noqa: E501

        Returns list of available Private Company metrics, and ratios that can be used in the `metrics` parameter of related endpoints. These are related to FactSet Private Company standardized data.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only


        Keyword Args:
            category (str): Filters the list of available metrics per endpoint  - </br>   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA. </br>   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. . [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            MetricsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        return self.get_metrics_endpoint.call_with_http_info(**kwargs)

    def get_metrics_with_http_info(
        self,
        **kwargs
    ) -> typing.Tuple[MetricsResponse, int, typing.MutableMapping]:
        """Returns available private company metrics, and ratios.  # noqa: E501

        Returns list of available Private Company metrics, and ratios that can be used in the `metrics` parameter of related endpoints. These are related to FactSet Private Company standardized data.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers


        Keyword Args:
            category (str): Filters the list of available metrics per endpoint  - </br>   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA. </br>   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. . [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            MetricsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        return self.get_metrics_endpoint.call_with_http_info(**kwargs)

    def get_metrics_async(
        self,
        **kwargs
    ) -> "ApplyResult[MetricsResponse]":
        """Returns available private company metrics, and ratios.  # noqa: E501

        Returns list of available Private Company metrics, and ratios that can be used in the `metrics` parameter of related endpoints. These are related to FactSet Private Company standardized data.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult


        Keyword Args:
            category (str): Filters the list of available metrics per endpoint  - </br>   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA. </br>   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. . [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            ApplyResult[MetricsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        return self.get_metrics_endpoint.call_with_http_info(**kwargs)

    def get_metrics_with_http_info_async(
        self,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[MetricsResponse, int, typing.MutableMapping]]":
        """Returns available private company metrics, and ratios.  # noqa: E501

        Returns list of available Private Company metrics, and ratios that can be used in the `metrics` parameter of related endpoints. These are related to FactSet Private Company standardized data.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult


        Keyword Args:
            category (str): Filters the list of available metrics per endpoint  - </br>   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA. </br>   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. . [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            ApplyResult[(MetricsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        return self.get_metrics_endpoint.call_with_http_info(**kwargs)


