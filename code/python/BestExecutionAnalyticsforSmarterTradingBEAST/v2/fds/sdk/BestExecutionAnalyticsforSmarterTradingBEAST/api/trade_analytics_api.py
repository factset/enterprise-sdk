"""
    Best Execution Analytics for Smarter Trading (BEAST) API

    Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.exceptions import ApiException
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.model.error_response import ErrorResponse
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.model.trade_analytics_response_root import TradeAnalyticsResponseRoot
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.model.volume_analytics_response_root import VolumeAnalyticsResponseRoot





class TradeAnalyticsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_trade_analytics_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (TradeAnalyticsResponseRoot,), 400: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/la/trade/trade-analytics',
                'operation_id': 'get_trade_analytics',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'start_date',
                    'end_date',
                    'security_id',
                    'region',
                ],
                'required': [
                    'start_date',
                    'end_date',
                    'security_id',
                    'region',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                    'security_id':
                        (str,),
                    'region':
                        (str,),
                },
                'attribute_map': {
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'security_id': 'securityId',
                    'region': 'region',
                },
                'location_map': {
                    'start_date': 'query',
                    'end_date': 'query',
                    'security_id': 'query',
                    'region': 'query',
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

        self.get_volume_analytics_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (VolumeAnalyticsResponseRoot,), 400: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/la/trade/volume-analytics',
                'operation_id': 'get_volume_analytics',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'start_date',
                    'end_date',
                    'security_id',
                    'region',
                ],
                'required': [
                    'start_date',
                    'end_date',
                    'security_id',
                    'region',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                    'security_id':
                        (str,),
                    'region':
                        (str,),
                },
                'attribute_map': {
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'security_id': 'securityId',
                    'region': 'region',
                },
                'location_map': {
                    'start_date': 'query',
                    'end_date': 'query',
                    'security_id': 'query',
                    'region': 'query',
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


    def get_trade_analytics(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> TradeAnalyticsResponseRoot:
        """Get Trade Analytics  # noqa: E501

        Get trade analytics for a specific date range, security and region. Analytics contain the timezone, bin time (5 minute interval), volume  and volatility for the specified date range.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            TradeAnalyticsResponseRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_trade_analytics_endpoint.call_with_http_info(**kwargs)

    def get_trade_analytics_with_http_info(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> typing.Tuple[TradeAnalyticsResponseRoot, int, typing.MutableMapping]:
        """Get Trade Analytics  # noqa: E501

        Get trade analytics for a specific date range, security and region. Analytics contain the timezone, bin time (5 minute interval), volume  and volatility for the specified date range.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            TradeAnalyticsResponseRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_trade_analytics_endpoint.call_with_http_info(**kwargs)

    def get_trade_analytics_async(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> "ApplyResult[TradeAnalyticsResponseRoot]":
        """Get Trade Analytics  # noqa: E501

        Get trade analytics for a specific date range, security and region. Analytics contain the timezone, bin time (5 minute interval), volume  and volatility for the specified date range.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            ApplyResult[TradeAnalyticsResponseRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_trade_analytics_endpoint.call_with_http_info(**kwargs)

    def get_trade_analytics_with_http_info_async(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[TradeAnalyticsResponseRoot, int, typing.MutableMapping]]":
        """Get Trade Analytics  # noqa: E501

        Get trade analytics for a specific date range, security and region. Analytics contain the timezone, bin time (5 minute interval), volume  and volatility for the specified date range.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            ApplyResult[(TradeAnalyticsResponseRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_trade_analytics_endpoint.call_with_http_info(**kwargs)


    def get_volume_analytics(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> VolumeAnalyticsResponseRoot:
        """Get Volume Analytics  # noqa: E501

        Get volume analytics for a specific date range, security and region  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            VolumeAnalyticsResponseRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_volume_analytics_endpoint.call_with_http_info(**kwargs)

    def get_volume_analytics_with_http_info(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> typing.Tuple[VolumeAnalyticsResponseRoot, int, typing.MutableMapping]:
        """Get Volume Analytics  # noqa: E501

        Get volume analytics for a specific date range, security and region  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            VolumeAnalyticsResponseRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_volume_analytics_endpoint.call_with_http_info(**kwargs)

    def get_volume_analytics_async(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> "ApplyResult[VolumeAnalyticsResponseRoot]":
        """Get Volume Analytics  # noqa: E501

        Get volume analytics for a specific date range, security and region  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            ApplyResult[VolumeAnalyticsResponseRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_volume_analytics_endpoint.call_with_http_info(**kwargs)

    def get_volume_analytics_with_http_info_async(
        self,
        start_date,
        end_date,
        security_id,
        region,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[VolumeAnalyticsResponseRoot, int, typing.MutableMapping]]":
        """Get Volume Analytics  # noqa: E501

        Get volume analytics for a specific date range, security and region  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            start_date (str): Search start date in the format YYYY-MM-DD
            end_date (str): Search end date in the format YYYY-MM-DD
            security_id (str): ISIN for European securities, otherwise TICKER
            region (str): The two character ISO country code of the trading region. EMEA is used for the European trading region

        Keyword Args:
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
            ApplyResult[(VolumeAnalyticsResponseRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['start_date'] = \
            start_date
        kwargs['end_date'] = \
            end_date
        kwargs['security_id'] = \
            security_id
        kwargs['region'] = \
            region
        return self.get_volume_analytics_endpoint.call_with_http_info(**kwargs)


