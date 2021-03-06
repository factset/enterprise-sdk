"""
    FactSet Procure to Pay API

    Allows for Provisioning and Entitlement of FactSet accounts.     Authentication is provided via FactSet's [API Key System](https://developer.factset.com/authentication)    Please note that the on-page \"Try it out\" features do not function. You must authorize against our API and make requests directly againt the endpoints.      # noqa: E501

    The version of the OpenAPI document: 1S
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.ProcuretoPayProvisioning.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.ProcuretoPayProvisioning.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.ProcuretoPayProvisioning.model.transaction_status import TransactionStatus


class OrderStatusApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.transaction_status_get_endpoint = _Endpoint(
            settings={
                'response_type': (TransactionStatus,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/transactionStatus',
                'operation_id': 'transaction_status_get',
                'http_method': 'GET',
                'servers': [
                    {
                        'url': "https://api.factset.com/procuretopay/provisioning/",
                        'description': "No description provided",
                    },
                ]
            },
            params_map={
                'all': [
                    'transactioncode',
                ],
                'required': [
                    'transactioncode',
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
                    'transactioncode':
                        (str,),
                },
                'attribute_map': {
                    'transactioncode': 'transactioncode',
                },
                'location_map': {
                    'transactioncode': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json; charset=utf-8',
                    'text/plain'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

    def transaction_status_get(
        self,
        transactioncode,
        **kwargs
    ):
        """Check status of order by transactionCode  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.transaction_status_get(transactioncode, async_req=True)
        >>> result = thread.get()

        Args:
            transactioncode (str): Transaction Code to query

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
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
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            TransactionStatus
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['transactioncode'] = \
            transactioncode
        return self.transaction_status_get_endpoint.call_with_http_info(**kwargs)

