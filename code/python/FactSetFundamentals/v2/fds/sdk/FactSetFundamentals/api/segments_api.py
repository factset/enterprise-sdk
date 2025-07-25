"""
    FactSet Fundamentals API

    Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>   # noqa: E501

    The version of the OpenAPI document: 2.4.1
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetFundamentals.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetFundamentals.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetFundamentals.exceptions import ApiException
from fds.sdk.FactSetFundamentals.model.batch_status_response import BatchStatusResponse
from fds.sdk.FactSetFundamentals.model.error_response import ErrorResponse
from fds.sdk.FactSetFundamentals.model.segments_request import SegmentsRequest
from fds.sdk.FactSetFundamentals.model.segments_response import SegmentsResponse



class GetFdsSegmentsForListResponseWrapper:
    def __init__(self, status_code: int, response: object):
        """
        This constructor initializes the new GetFdsSegmentsForListResponseWrapper
        to status_code, response

        Args:
            response (object): Raw response
            status_code (int): Http status code of the response
        """

        self.status_code = status_code
        self.response = response

    def get_status_code(self) -> int:
        """
        Returns: Http status code of the response
        """
        return self.status_code

    def get_response(self) -> object:
        """
        Returns: Raw Object response
        """
        return self.response

    def get_response_200(self) -> SegmentsResponse:
        """
        Raises: ApiException: Invalid response getter called.

        Returns: Segment data items
        """
        if self.status_code != 200:
            raise ApiException(
                status=500,
                reason="Invalid response getter called. get_response_200 can't return a " + str(self.status_code) + " response"
            )
        return self.response

    def get_response_202(self) -> BatchStatusResponse:
        """
        Raises: ApiException: Invalid response getter called.

        Returns: Batch request has been accepted.
        """
        if self.status_code != 202:
            raise ApiException(
                status=500,
                reason="Invalid response getter called. get_response_202 can't return a " + str(self.status_code) + " response"
            )
        return self.response




class SegmentsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_fds_segments_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (SegmentsResponse,), 202: (BatchStatusResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  GetFdsSegmentsForListResponseWrapper
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/segments',
                'operation_id': 'get_fds_segments_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'segments_request',
                ],
                'required': [
                    'segments_request',
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
                    'segments_request':
                        (SegmentsRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'segments_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
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


    def get_fds_segments_for_list(
        self,
        segments_request,
        **kwargs
    ) -> GetFdsSegmentsForListResponseWrapper:
        """Returns Company Segment Data.  # noqa: E501

        Retrieves Sales Metrics data for specified companies.  The ```/segments``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            segments_request (SegmentsRequest): Request object for requesting segments data

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
            GetFdsSegmentsForListResponseWrapper
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['segments_request'] = \
            segments_request
        return self.get_fds_segments_for_list_endpoint.call_with_http_info(**kwargs)

    def get_fds_segments_for_list_with_http_info(
        self,
        segments_request,
        **kwargs
    ) -> typing.Tuple[GetFdsSegmentsForListResponseWrapper, int, typing.MutableMapping]:
        """Returns Company Segment Data.  # noqa: E501

        Retrieves Sales Metrics data for specified companies.  The ```/segments``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            segments_request (SegmentsRequest): Request object for requesting segments data

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
            GetFdsSegmentsForListResponseWrapper
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['segments_request'] = \
            segments_request
        return self.get_fds_segments_for_list_endpoint.call_with_http_info(**kwargs)

    def get_fds_segments_for_list_async(
        self,
        segments_request,
        **kwargs
    ) -> "ApplyResult[GetFdsSegmentsForListResponseWrapper]":
        """Returns Company Segment Data.  # noqa: E501

        Retrieves Sales Metrics data for specified companies.  The ```/segments``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            segments_request (SegmentsRequest): Request object for requesting segments data

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
            ApplyResult[GetFdsSegmentsForListResponseWrapper]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['segments_request'] = \
            segments_request
        return self.get_fds_segments_for_list_endpoint.call_with_http_info(**kwargs)

    def get_fds_segments_for_list_with_http_info_async(
        self,
        segments_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[GetFdsSegmentsForListResponseWrapper, int, typing.MutableMapping]]":
        """Returns Company Segment Data.  # noqa: E501

        Retrieves Sales Metrics data for specified companies.  The ```/segments``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limit is set to 5000 ids per request when using batch capability and 250 ids per request without batching (1 metric per ID, for 1 day in both the cases). This feature is available for all users.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            segments_request (SegmentsRequest): Request object for requesting segments data

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
            ApplyResult[(GetFdsSegmentsForListResponseWrapper, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['segments_request'] = \
            segments_request
        return self.get_fds_segments_for_list_endpoint.call_with_http_info(**kwargs)


