"""
    BookBuilder

    The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br>   # noqa: E501

    The version of the OpenAPI document: 1.13.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.BookBuilder.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.BookBuilder.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.BookBuilder.exceptions import ApiException
from fds.sdk.BookBuilder.model.create_template_post_request import CreateTemplatePostRequest
from fds.sdk.BookBuilder.model.enable_template_info_post import EnableTemplateInfoPost
from fds.sdk.BookBuilder.model.invalid_template_request import InvalidTemplateRequest





class TemplatesCreationApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.create_template_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (EnableTemplateInfoPost,), 400: (InvalidTemplateRequest,), 401: (str,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/create-template',
                'operation_id': 'create_template',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'create_template_post_request',
                ],
                'required': [
                    'create_template_post_request',
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
                    'create_template_post_request':
                        (CreateTemplatePostRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'create_template_post_request': 'body',
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


    def create_template(
        self,
        create_template_post_request,
        **kwargs
    ) -> EnableTemplateInfoPost:
        """Kick off request to create template with reports of your choice  # noqa: E501

        This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            create_template_post_request (CreateTemplatePostRequest):

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
            EnableTemplateInfoPost
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['create_template_post_request'] = \
            create_template_post_request
        return self.create_template_endpoint.call_with_http_info(**kwargs)

    def create_template_with_http_info(
        self,
        create_template_post_request,
        **kwargs
    ) -> typing.Tuple[EnableTemplateInfoPost, int, typing.MutableMapping]:
        """Kick off request to create template with reports of your choice  # noqa: E501

        This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            create_template_post_request (CreateTemplatePostRequest):

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
            EnableTemplateInfoPost
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['create_template_post_request'] = \
            create_template_post_request
        return self.create_template_endpoint.call_with_http_info(**kwargs)

    def create_template_async(
        self,
        create_template_post_request,
        **kwargs
    ) -> "ApplyResult[EnableTemplateInfoPost]":
        """Kick off request to create template with reports of your choice  # noqa: E501

        This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            create_template_post_request (CreateTemplatePostRequest):

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
            ApplyResult[EnableTemplateInfoPost]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['create_template_post_request'] = \
            create_template_post_request
        return self.create_template_endpoint.call_with_http_info(**kwargs)

    def create_template_with_http_info_async(
        self,
        create_template_post_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[EnableTemplateInfoPost, int, typing.MutableMapping]]":
        """Kick off request to create template with reports of your choice  # noqa: E501

        This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            create_template_post_request (CreateTemplatePostRequest):

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
            ApplyResult[(EnableTemplateInfoPost, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['create_template_post_request'] = \
            create_template_post_request
        return self.create_template_endpoint.call_with_http_info(**kwargs)


