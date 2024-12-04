"""
    Style Performance and Risk Analysis (SPAR) Engine API

    Allow clients to fetch Analytics through APIs.  # noqa: E501

    The version of the OpenAPI document: 3.14.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.SPAREngine.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.SPAREngine.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.SPAREngine.exceptions import ApiException
from fds.sdk.SPAREngine.model.account_directories_root import AccountDirectoriesRoot
from fds.sdk.SPAREngine.model.client_error_response import ClientErrorResponse
from fds.sdk.SPAREngine.model.spar_accounts_root import SPARAccountsRoot





class AccountsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_accounts_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (AccountDirectoriesRoot,), 400: (ClientErrorResponse,), 404: (ClientErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/lookups/v3/accounts/{path}',
                'operation_id': 'get_accounts',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                ],
                'required': [
                    'path',
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
                    'path':
                        (str,),
                },
                'attribute_map': {
                    'path': 'path',
                },
                'location_map': {
                    'path': 'path',
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

        self.get_spar_returns_type_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (SPARAccountsRoot,), 400: (ClientErrorResponse,), 404: (ClientErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/spar/v3/accounts/{accountPath}/returns-type',
                'operation_id': 'get_spar_returns_type',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'account_path',
                ],
                'required': [
                    'account_path',
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
                    'account_path':
                        (str,),
                },
                'attribute_map': {
                    'account_path': 'accountPath',
                },
                'location_map': {
                    'account_path': 'path',
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


    def get_accounts(
        self,
        path,
        **kwargs
    ) -> AccountDirectoriesRoot:
        """Get accounts and sub-directories in a directory  # noqa: E501

        This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): The directory to get the accounts and sub-directories.

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
            AccountDirectoriesRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        return self.get_accounts_endpoint.call_with_http_info(**kwargs)

    def get_accounts_with_http_info(
        self,
        path,
        **kwargs
    ) -> typing.Tuple[AccountDirectoriesRoot, int, typing.MutableMapping]:
        """Get accounts and sub-directories in a directory  # noqa: E501

        This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): The directory to get the accounts and sub-directories.

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
            AccountDirectoriesRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        return self.get_accounts_endpoint.call_with_http_info(**kwargs)

    def get_accounts_async(
        self,
        path,
        **kwargs
    ) -> "ApplyResult[AccountDirectoriesRoot]":
        """Get accounts and sub-directories in a directory  # noqa: E501

        This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): The directory to get the accounts and sub-directories.

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
            ApplyResult[AccountDirectoriesRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        return self.get_accounts_endpoint.call_with_http_info(**kwargs)

    def get_accounts_with_http_info_async(
        self,
        path,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[AccountDirectoriesRoot, int, typing.MutableMapping]]":
        """Get accounts and sub-directories in a directory  # noqa: E501

        This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): The directory to get the accounts and sub-directories.

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
            ApplyResult[(AccountDirectoriesRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        return self.get_accounts_endpoint.call_with_http_info(**kwargs)


    def get_spar_returns_type(
        self,
        account_path,
        **kwargs
    ) -> SPARAccountsRoot:
        """Get SPAR account returns type details  # noqa: E501

        This endpoint returns the returns type of account associated with SPAR  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            account_path (str): URL encoded account path

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
            SPARAccountsRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['account_path'] = \
            account_path
        return self.get_spar_returns_type_endpoint.call_with_http_info(**kwargs)

    def get_spar_returns_type_with_http_info(
        self,
        account_path,
        **kwargs
    ) -> typing.Tuple[SPARAccountsRoot, int, typing.MutableMapping]:
        """Get SPAR account returns type details  # noqa: E501

        This endpoint returns the returns type of account associated with SPAR  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            account_path (str): URL encoded account path

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
            SPARAccountsRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['account_path'] = \
            account_path
        return self.get_spar_returns_type_endpoint.call_with_http_info(**kwargs)

    def get_spar_returns_type_async(
        self,
        account_path,
        **kwargs
    ) -> "ApplyResult[SPARAccountsRoot]":
        """Get SPAR account returns type details  # noqa: E501

        This endpoint returns the returns type of account associated with SPAR  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            account_path (str): URL encoded account path

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
            ApplyResult[SPARAccountsRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['account_path'] = \
            account_path
        return self.get_spar_returns_type_endpoint.call_with_http_info(**kwargs)

    def get_spar_returns_type_with_http_info_async(
        self,
        account_path,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[SPARAccountsRoot, int, typing.MutableMapping]]":
        """Get SPAR account returns type details  # noqa: E501

        This endpoint returns the returns type of account associated with SPAR  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            account_path (str): URL encoded account path

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
            ApplyResult[(SPARAccountsRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['account_path'] = \
            account_path
        return self.get_spar_returns_type_endpoint.call_with_http_info(**kwargs)


