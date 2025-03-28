"""
    FactSet People API

    The FactSet People API exposes FactSet data for individuals and their jobs.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>   # noqa: E501

    The version of the OpenAPI document: 1.3.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetPeople.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetPeople.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetPeople.exceptions import ApiException
from fds.sdk.FactSetPeople.model.error_response import ErrorResponse
from fds.sdk.FactSetPeople.model.people_jobs_request import PeopleJobsRequest
from fds.sdk.FactSetPeople.model.people_jobs_response import PeopleJobsResponse





class JobHistoryApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_people_jobs_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (PeopleJobsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-people/v1/jobs',
                'operation_id': 'get_people_jobs',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'status',
                    'level',
                    'type',
                ],
                'required': [
                    'ids',
                ],
                'nullable': [
                ],
                'enum': [
                    'status',
                    'level',
                    'type',
                ],
                'validation': [
                    'ids',
                ]
            },
            root_map={
                'validations': {
                    ('ids',): {

                        'max_items': 1000,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                    ('status',): {

                        "ALL": "ALL",
                        "PRIMARY": "PRIMARY",
                        "ACTIVE": "ACTIVE",
                        "INACTIVE": "INACTIVE"
                    },
                    ('level',): {

                        "SUMMARY": "SUMMARY",
                        "DETAIL": "DETAIL"
                    },
                    ('type',): {

                        "ALL": "ALL",
                        "BRD": "BRD",
                        "EMP": "EMP"
                    },
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                    'status':
                        (str,),
                    'level':
                        (str,),
                    'type':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'status': 'status',
                    'level': 'level',
                    'type': 'type',
                },
                'location_map': {
                    'ids': 'query',
                    'status': 'query',
                    'level': 'query',
                    'type': 'query',
                },
                'collection_format_map': {
                    'ids': 'csv',
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

        self.get_people_jobs_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (PeopleJobsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-people/v1/jobs',
                'operation_id': 'get_people_jobs_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'people_jobs_request',
                ],
                'required': [
                    'people_jobs_request',
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
                    'people_jobs_request':
                        (PeopleJobsRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'people_jobs_request': 'body',
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


    def get_people_jobs(
        self,
        ids,
        **kwargs
    ) -> PeopleJobsResponse:
        """Returns the Job history of the person.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            ids ([str]): List of FactSet Person Entity identifier.

        Keyword Args:
            status (str): Select only Jobs with a certain status primary, active, or inactive.. [optional] if omitted the server will use the default value of "ALL"
            level (str): Select the level of detail only main Jobs or include other Jobs at a company.. [optional] if omitted the server will use the default value of "DETAIL"
            type (str): Select only Jobs of a certain type board member or employee.. [optional] if omitted the server will use the default value of "ALL"
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
            PeopleJobsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_people_jobs_endpoint.call_with_http_info(**kwargs)

    def get_people_jobs_with_http_info(
        self,
        ids,
        **kwargs
    ) -> typing.Tuple[PeopleJobsResponse, int, typing.MutableMapping]:
        """Returns the Job history of the person.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            ids ([str]): List of FactSet Person Entity identifier.

        Keyword Args:
            status (str): Select only Jobs with a certain status primary, active, or inactive.. [optional] if omitted the server will use the default value of "ALL"
            level (str): Select the level of detail only main Jobs or include other Jobs at a company.. [optional] if omitted the server will use the default value of "DETAIL"
            type (str): Select only Jobs of a certain type board member or employee.. [optional] if omitted the server will use the default value of "ALL"
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
            PeopleJobsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_people_jobs_endpoint.call_with_http_info(**kwargs)

    def get_people_jobs_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[PeopleJobsResponse]":
        """Returns the Job history of the person.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            ids ([str]): List of FactSet Person Entity identifier.

        Keyword Args:
            status (str): Select only Jobs with a certain status primary, active, or inactive.. [optional] if omitted the server will use the default value of "ALL"
            level (str): Select the level of detail only main Jobs or include other Jobs at a company.. [optional] if omitted the server will use the default value of "DETAIL"
            type (str): Select only Jobs of a certain type board member or employee.. [optional] if omitted the server will use the default value of "ALL"
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
            ApplyResult[PeopleJobsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_people_jobs_endpoint.call_with_http_info(**kwargs)

    def get_people_jobs_with_http_info_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[PeopleJobsResponse, int, typing.MutableMapping]]":
        """Returns the Job history of the person.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            ids ([str]): List of FactSet Person Entity identifier.

        Keyword Args:
            status (str): Select only Jobs with a certain status primary, active, or inactive.. [optional] if omitted the server will use the default value of "ALL"
            level (str): Select the level of detail only main Jobs or include other Jobs at a company.. [optional] if omitted the server will use the default value of "DETAIL"
            type (str): Select only Jobs of a certain type board member or employee.. [optional] if omitted the server will use the default value of "ALL"
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
            ApplyResult[(PeopleJobsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_people_jobs_endpoint.call_with_http_info(**kwargs)


    def get_people_jobs_for_list(
        self,
        people_jobs_request,
        **kwargs
    ) -> PeopleJobsResponse:
        """Returns the Job history for the large list of people.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            people_jobs_request (PeopleJobsRequest):

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
            PeopleJobsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['people_jobs_request'] = \
            people_jobs_request
        return self.get_people_jobs_for_list_endpoint.call_with_http_info(**kwargs)

    def get_people_jobs_for_list_with_http_info(
        self,
        people_jobs_request,
        **kwargs
    ) -> typing.Tuple[PeopleJobsResponse, int, typing.MutableMapping]:
        """Returns the Job history for the large list of people.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            people_jobs_request (PeopleJobsRequest):

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
            PeopleJobsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['people_jobs_request'] = \
            people_jobs_request
        return self.get_people_jobs_for_list_endpoint.call_with_http_info(**kwargs)

    def get_people_jobs_for_list_async(
        self,
        people_jobs_request,
        **kwargs
    ) -> "ApplyResult[PeopleJobsResponse]":
        """Returns the Job history for the large list of people.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            people_jobs_request (PeopleJobsRequest):

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
            ApplyResult[PeopleJobsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['people_jobs_request'] = \
            people_jobs_request
        return self.get_people_jobs_for_list_endpoint.call_with_http_info(**kwargs)

    def get_people_jobs_for_list_with_http_info_async(
        self,
        people_jobs_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[PeopleJobsResponse, int, typing.MutableMapping]]":
        """Returns the Job history for the large list of people.  # noqa: E501

        Returns the `Job` history of the person referenced by the entityId specified in the request.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            people_jobs_request (PeopleJobsRequest):

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
            ApplyResult[(PeopleJobsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['people_jobs_request'] = \
            people_jobs_request
        return self.get_people_jobs_for_list_endpoint.call_with_http_info(**kwargs)


