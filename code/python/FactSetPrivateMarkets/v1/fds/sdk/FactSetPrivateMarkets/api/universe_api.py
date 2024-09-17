"""
    FactSet Private Markets API

    FactSet Private Markets API encompasses Private Company Financials data to start. Private Company firmographics can be found in the FactSet Entity API. The future plans of this service will include additional Private Markets data, such as Private Equity/Venture Capital.<p><b>Rate limit is set to 10 requests per second</b>.</p>   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetPrivateMarkets.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetPrivateMarkets.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetPrivateMarkets.exceptions import ApiException
from fds.sdk.FactSetPrivateMarkets.model.entity_match_request import EntityMatchRequest
from fds.sdk.FactSetPrivateMarkets.model.entity_matches_response import EntityMatchesResponse
from fds.sdk.FactSetPrivateMarkets.model.error_response import ErrorResponse





class UniverseApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_universe_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (EntityMatchesResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-private-markets/v1/universe',
                'operation_id': 'get_universe',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'name',
                    'country',
                ],
                'required': [
                    'name',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'name',
                    'country',
                ]
            },
            root_map={
                'validations': {
                    ('name',): {
                        'max_length': 200,
                        'min_length': 1,
                    },
                    ('country',): {
                        'max_length': 2,
                        'min_length': 2,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'name':
                        (str,),
                    'country':
                        (str,),
                },
                'attribute_map': {
                    'name': 'name',
                    'country': 'country',
                },
                'location_map': {
                    'name': 'query',
                    'country': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=utf-8',
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

        self.get_universe_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (EntityMatchesResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-private-markets/v1/universe',
                'operation_id': 'get_universe_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'entity_match_request',
                ],
                'required': [
                    'entity_match_request',
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
                    'entity_match_request':
                        (EntityMatchRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'entity_match_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=utf-8',
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


    def get_universe(
        self,
        name,
        **kwargs
    ) -> EntityMatchesResponse:
        """Get Entity Candidates and Matches for a single name and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p>   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            name (str): Name of Entity to match.

        Keyword Args:
            country (str): ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).. [optional]
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
            EntityMatchesResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['name'] = \
            name
        return self.get_universe_endpoint.call_with_http_info(**kwargs)

    def get_universe_with_http_info(
        self,
        name,
        **kwargs
    ) -> typing.Tuple[EntityMatchesResponse, int, typing.MutableMapping]:
        """Get Entity Candidates and Matches for a single name and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p>   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            name (str): Name of Entity to match.

        Keyword Args:
            country (str): ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).. [optional]
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
            EntityMatchesResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['name'] = \
            name
        return self.get_universe_endpoint.call_with_http_info(**kwargs)

    def get_universe_async(
        self,
        name,
        **kwargs
    ) -> "ApplyResult[EntityMatchesResponse]":
        """Get Entity Candidates and Matches for a single name and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p>   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            name (str): Name of Entity to match.

        Keyword Args:
            country (str): ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).. [optional]
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
            ApplyResult[EntityMatchesResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['name'] = \
            name
        return self.get_universe_endpoint.call_with_http_info(**kwargs)

    def get_universe_with_http_info_async(
        self,
        name,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[EntityMatchesResponse, int, typing.MutableMapping]]":
        """Get Entity Candidates and Matches for a single name and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p>   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            name (str): Name of Entity to match.

        Keyword Args:
            country (str): ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).. [optional]
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
            ApplyResult[(EntityMatchesResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['name'] = \
            name
        return self.get_universe_endpoint.call_with_http_info(**kwargs)


    def get_universe_for_list(
        self,
        entity_match_request,
        **kwargs
    ) -> EntityMatchesResponse:
        """Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p>   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            entity_match_request (EntityMatchRequest): A request to match an Entity.

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
            EntityMatchesResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['entity_match_request'] = \
            entity_match_request
        return self.get_universe_for_list_endpoint.call_with_http_info(**kwargs)

    def get_universe_for_list_with_http_info(
        self,
        entity_match_request,
        **kwargs
    ) -> typing.Tuple[EntityMatchesResponse, int, typing.MutableMapping]:
        """Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p>   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            entity_match_request (EntityMatchRequest): A request to match an Entity.

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
            EntityMatchesResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['entity_match_request'] = \
            entity_match_request
        return self.get_universe_for_list_endpoint.call_with_http_info(**kwargs)

    def get_universe_for_list_async(
        self,
        entity_match_request,
        **kwargs
    ) -> "ApplyResult[EntityMatchesResponse]":
        """Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p>   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            entity_match_request (EntityMatchRequest): A request to match an Entity.

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
            ApplyResult[EntityMatchesResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['entity_match_request'] = \
            entity_match_request
        return self.get_universe_for_list_endpoint.call_with_http_info(**kwargs)

    def get_universe_for_list_with_http_info_async(
        self,
        entity_match_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[EntityMatchesResponse, int, typing.MutableMapping]]":
        """Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.  # noqa: E501

        Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p>   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            entity_match_request (EntityMatchRequest): A request to match an Entity.

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
            ApplyResult[(EntityMatchesResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['entity_match_request'] = \
            entity_match_request
        return self.get_universe_for_list_endpoint.call_with_http_info(**kwargs)


