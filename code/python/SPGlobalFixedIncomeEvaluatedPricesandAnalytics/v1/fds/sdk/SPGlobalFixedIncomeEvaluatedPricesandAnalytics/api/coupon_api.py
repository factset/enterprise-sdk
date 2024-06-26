"""
    S&P Global Fixed Income Evaluated Prices & Analytics API

    Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.exceptions import ApiException
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.model.bond_coupon_request import BondCouponRequest
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.model.bond_coupon_response import BondCouponResponse
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.model.error_response import ErrorResponse





class CouponApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_bond_coupon_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (BondCouponResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/markit-bond-prices-and-analytics/v1/coupon',
                'operation_id': 'get_bond_coupon',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'start_date',
                    'end_date',
                    'frequency',
                    'calendar',
                ],
                'required': [
                    'ids',
                ],
                'nullable': [
                ],
                'enum': [
                    'frequency',
                    'calendar',
                ],
                'validation': [
                    'ids',
                ]
            },
            root_map={
                'validations': {
                    ('ids',): {

                        'max_items': 2000,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                    ('frequency',): {

                        "D": "D",
                        "W": "W",
                        "M": "M",
                        "AM": "AM",
                        "CQ": "CQ",
                        "FQ": "FQ",
                        "AY": "AY",
                        "CY": "CY",
                        "FY": "FY"
                    },
                    ('calendar',): {

                        "FIVEDAY": "FIVEDAY",
                        "SEVENDAY": "SEVENDAY",
                        "LOCAL": "LOCAL"
                    },
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                    'frequency':
                        (str,),
                    'calendar':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'frequency': 'frequency',
                    'calendar': 'calendar',
                },
                'location_map': {
                    'ids': 'query',
                    'start_date': 'query',
                    'end_date': 'query',
                    'frequency': 'query',
                    'calendar': 'query',
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

        self.get_bond_coupon_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (BondCouponResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/markit-bond-prices-and-analytics/v1/coupon',
                'operation_id': 'get_bond_coupon_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'bond_coupon_request',
                ],
                'required': [
                    'bond_coupon_request',
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
                    'bond_coupon_request':
                        (BondCouponRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'bond_coupon_request': 'body',
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


    def get_bond_coupon(
        self,
        ids,
        **kwargs
    ) -> BondCouponResponse:
        """Get coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            ids ([str]): Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            end_date (str): The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. . [optional] if omitted the server will use the default value of "D"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            BondCouponResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_bond_coupon_endpoint.call_with_http_info(**kwargs)

    def get_bond_coupon_with_http_info(
        self,
        ids,
        **kwargs
    ) -> typing.Tuple[BondCouponResponse, int, typing.MutableMapping]:
        """Get coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            ids ([str]): Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            end_date (str): The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. . [optional] if omitted the server will use the default value of "D"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            BondCouponResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_bond_coupon_endpoint.call_with_http_info(**kwargs)

    def get_bond_coupon_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[BondCouponResponse]":
        """Get coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            ids ([str]): Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            end_date (str): The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. . [optional] if omitted the server will use the default value of "D"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            ApplyResult[BondCouponResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_bond_coupon_endpoint.call_with_http_info(**kwargs)

    def get_bond_coupon_with_http_info_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[BondCouponResponse, int, typing.MutableMapping]]":
        """Get coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            ids ([str]): Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            end_date (str): The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. . [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year. . [optional] if omitted the server will use the default value of "D"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            ApplyResult[(BondCouponResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_bond_coupon_endpoint.call_with_http_info(**kwargs)


    def get_bond_coupon_for_list(
        self,
        bond_coupon_request,
        **kwargs
    ) -> BondCouponResponse:
        """Request coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            bond_coupon_request (BondCouponRequest): Request object for requesting Coupon data

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
            BondCouponResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['bond_coupon_request'] = \
            bond_coupon_request
        return self.get_bond_coupon_for_list_endpoint.call_with_http_info(**kwargs)

    def get_bond_coupon_for_list_with_http_info(
        self,
        bond_coupon_request,
        **kwargs
    ) -> typing.Tuple[BondCouponResponse, int, typing.MutableMapping]:
        """Request coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            bond_coupon_request (BondCouponRequest): Request object for requesting Coupon data

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
            BondCouponResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['bond_coupon_request'] = \
            bond_coupon_request
        return self.get_bond_coupon_for_list_endpoint.call_with_http_info(**kwargs)

    def get_bond_coupon_for_list_async(
        self,
        bond_coupon_request,
        **kwargs
    ) -> "ApplyResult[BondCouponResponse]":
        """Request coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            bond_coupon_request (BondCouponRequest): Request object for requesting Coupon data

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
            ApplyResult[BondCouponResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['bond_coupon_request'] = \
            bond_coupon_request
        return self.get_bond_coupon_for_list_endpoint.call_with_http_info(**kwargs)

    def get_bond_coupon_for_list_with_http_info_async(
        self,
        bond_coupon_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[BondCouponResponse, int, typing.MutableMapping]]":
        """Request coupon data for given date range and list of securities  # noqa: E501

        Get coupon information like accrued interest, coupon, coupon type and coupon frequency provided by Markit for specified date range and frequency.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            bond_coupon_request (BondCouponRequest): Request object for requesting Coupon data

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
            ApplyResult[(BondCouponResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['bond_coupon_request'] = \
            bond_coupon_request
        return self.get_bond_coupon_for_list_endpoint.call_with_http_info(**kwargs)


