"""
    Cabot Models API

    Cabot Models API  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.Cabot.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from fds.sdk.Cabot.exceptions import ApiAttributeError



class Attributes(ModelSimple):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
        ('value',): {
            'EY': "QFL_EY",
            'PEG': "QFL_PEG",
            'OCFY': "QFL_OCFY",
            'BP': "QFL_BP",
            'SP': "QFL_SP",
            'OCF_EARNINGS_VAR': "QFL_OCF_EARNINGS_VAR",
            'DY': "QFL_DY",
            'NET_MGN': "QFL_NET_MGN",
            'OPER_MGN': "QFL_OPER_MGN",
            'ROE': "QFL_ROE",
            'CFROE': "QFL_CFROE",
            'EPS_GR_5Y': "QFL_EPS_GR_5Y",
            'OCF_GR_5Y': "QFL_OCF_GR_5Y",
            'SALES_GR_5Y': "QFL_SALES_GR_5Y",
            'DPS_GR_5Y': "QFL_DPS_GR_5Y",
            'EPS_GR_1Y': "QFL_EPS_GR_1Y",
            'OCF_GR_1Y': "QFL_OCF_GR_1Y",
            'SALES_GR_1Y': "QFL_SALES_GR_1Y",
            'LT_DEBT_EQUITY': "QFL_LT_DEBT_EQUITY",
            'DEBT_ASSETS': "QFL_DEBT_ASSETS",
            'EBITDAEV': "QFL_EBITDAEV",
            'REVEV': "QFL_REVEV",
            'ROIC': "QFL_ROIC",
            'CFROIC': "QFL_CFROIC",
        },
    }

    validations = {
    }

    additional_properties_type = None

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'value': (str,),
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {}

    read_only_vars = set()

    _composed_schemas = None

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):
        """Attributes - a model defined in OpenAPI

        Note that value can be passed either in args or in kwargs, but not in both.

        Args:
            args[0] (str): All currently available attributes.<br/><br/>QFL_EY : EPS for the most recent 12-month period/Share price<br/>QFL_PEG : Price to Earnings/Growth rate<br/>QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value<br/>QFL_BP : Price/book value per share ratio<br/>QFL_SP : Sales to Price (SP) Net sales/Market value<br/>QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions<br/>QFL_DY : Indicated annual dividend/Latest close price<br/>QFL_NET_MGN : Net profit/Net sales * 100<br/>QFL_OPER_MGN : Operating Income/Net Sales * 100<br/>QFL_ROE : Net income/Total shareholders' equity<br/>QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders' equity<br/>QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years<br/>QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years<br/>QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years<br/>QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years<br/>QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years<br/>QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years<br/>QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years<br/>QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders' Equity<br/>QFL_DEBT_ASSETS : Long-term debt/total assets<br/>QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA<br/>QFL_REVEV : Represents Enterprise Value to Revenue<br/>QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100<br/>QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company's total shareholders' equity and its long-term liabilities<br/>., must be one of ["QFL_EY", "QFL_PEG", "QFL_OCFY", "QFL_BP", "QFL_SP", "QFL_OCF_EARNINGS_VAR", "QFL_DY", "QFL_NET_MGN", "QFL_OPER_MGN", "QFL_ROE", "QFL_CFROE", "QFL_EPS_GR_5Y", "QFL_OCF_GR_5Y", "QFL_SALES_GR_5Y", "QFL_DPS_GR_5Y", "QFL_EPS_GR_1Y", "QFL_OCF_GR_1Y", "QFL_SALES_GR_1Y", "QFL_LT_DEBT_EQUITY", "QFL_DEBT_ASSETS", "QFL_EBITDAEV", "QFL_REVEV", "QFL_ROIC", "QFL_CFROIC", ]  # noqa: E501

        Keyword Args:
            value (str): All currently available attributes.<br/><br/>QFL_EY : EPS for the most recent 12-month period/Share price<br/>QFL_PEG : Price to Earnings/Growth rate<br/>QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value<br/>QFL_BP : Price/book value per share ratio<br/>QFL_SP : Sales to Price (SP) Net sales/Market value<br/>QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions<br/>QFL_DY : Indicated annual dividend/Latest close price<br/>QFL_NET_MGN : Net profit/Net sales * 100<br/>QFL_OPER_MGN : Operating Income/Net Sales * 100<br/>QFL_ROE : Net income/Total shareholders' equity<br/>QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders' equity<br/>QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years<br/>QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years<br/>QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years<br/>QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years<br/>QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years<br/>QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years<br/>QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years<br/>QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders' Equity<br/>QFL_DEBT_ASSETS : Long-term debt/total assets<br/>QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA<br/>QFL_REVEV : Represents Enterprise Value to Revenue<br/>QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100<br/>QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company's total shareholders' equity and its long-term liabilities<br/>., must be one of ["QFL_EY", "QFL_PEG", "QFL_OCFY", "QFL_BP", "QFL_SP", "QFL_OCF_EARNINGS_VAR", "QFL_DY", "QFL_NET_MGN", "QFL_OPER_MGN", "QFL_ROE", "QFL_CFROE", "QFL_EPS_GR_5Y", "QFL_OCF_GR_5Y", "QFL_SALES_GR_5Y", "QFL_DPS_GR_5Y", "QFL_EPS_GR_1Y", "QFL_OCF_GR_1Y", "QFL_SALES_GR_1Y", "QFL_LT_DEBT_EQUITY", "QFL_DEBT_ASSETS", "QFL_EBITDAEV", "QFL_REVEV", "QFL_ROIC", "QFL_CFROIC", ]  # noqa: E501
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
        """
        # required up here when default value is not given
        _path_to_item = kwargs.pop('_path_to_item', ())

        if 'value' in kwargs:
            value = kwargs.pop('value')
        elif args:
            args = list(args)
            value = args.pop(0)
        else:
            raise ApiTypeError(
                "value is required, but not passed in args or kwargs and doesn't have default",
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)
        self.value = value
        if kwargs:
            raise ApiTypeError(
                "Invalid named arguments=%s passed to %s. Remove those invalid named arguments." % (
                    kwargs,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):
        """Attributes - a model defined in OpenAPI

        Note that value can be passed either in args or in kwargs, but not in both.

        Args:
            args[0] (str): All currently available attributes.<br/><br/>QFL_EY : EPS for the most recent 12-month period/Share price<br/>QFL_PEG : Price to Earnings/Growth rate<br/>QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value<br/>QFL_BP : Price/book value per share ratio<br/>QFL_SP : Sales to Price (SP) Net sales/Market value<br/>QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions<br/>QFL_DY : Indicated annual dividend/Latest close price<br/>QFL_NET_MGN : Net profit/Net sales * 100<br/>QFL_OPER_MGN : Operating Income/Net Sales * 100<br/>QFL_ROE : Net income/Total shareholders' equity<br/>QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders' equity<br/>QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years<br/>QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years<br/>QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years<br/>QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years<br/>QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years<br/>QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years<br/>QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years<br/>QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders' Equity<br/>QFL_DEBT_ASSETS : Long-term debt/total assets<br/>QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA<br/>QFL_REVEV : Represents Enterprise Value to Revenue<br/>QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100<br/>QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company's total shareholders' equity and its long-term liabilities<br/>., must be one of ["QFL_EY", "QFL_PEG", "QFL_OCFY", "QFL_BP", "QFL_SP", "QFL_OCF_EARNINGS_VAR", "QFL_DY", "QFL_NET_MGN", "QFL_OPER_MGN", "QFL_ROE", "QFL_CFROE", "QFL_EPS_GR_5Y", "QFL_OCF_GR_5Y", "QFL_SALES_GR_5Y", "QFL_DPS_GR_5Y", "QFL_EPS_GR_1Y", "QFL_OCF_GR_1Y", "QFL_SALES_GR_1Y", "QFL_LT_DEBT_EQUITY", "QFL_DEBT_ASSETS", "QFL_EBITDAEV", "QFL_REVEV", "QFL_ROIC", "QFL_CFROIC", ]  # noqa: E501

        Keyword Args:
            value (str): All currently available attributes.<br/><br/>QFL_EY : EPS for the most recent 12-month period/Share price<br/>QFL_PEG : Price to Earnings/Growth rate<br/>QFL_OCFY : Operating cash flow (FF_OPER_CF)/Market value<br/>QFL_BP : Price/book value per share ratio<br/>QFL_SP : Sales to Price (SP) Net sales/Market value<br/>QFL_OCF_EARNINGS_VAR : Differences of earnings per share in both positive and negative directions<br/>QFL_DY : Indicated annual dividend/Latest close price<br/>QFL_NET_MGN : Net profit/Net sales * 100<br/>QFL_OPER_MGN : Operating Income/Net Sales * 100<br/>QFL_ROE : Net income/Total shareholders' equity<br/>QFL_CFROE : Net cash provided by/used in operating activities /Total shareholders' equity<br/>QFL_EPS_GR_5Y : Compounded annual growth rate (CAGR) of EPS over the previous 5 financial years<br/>QFL_OCF_GR_5Y : Compounded annual growth rate (CAGR) of CFO over the previous 5 financial years<br/>QFL_SALES_GR_5Y : Compounded annual growth rate (CAGR) of Revenue over the previous 5 financial years<br/>QFL_DPS_GR_5Y : Compounded annual growth rate (CAGR) of Dividend over the previous 5 financial years<br/>QFL_EPS_GR_1Y : 1Y EPS Growth,Growth rate of EPS over the previous financial years<br/>QFL_OCF_GR_1Y : Growth rate of CFO over the previous financial years<br/>QFL_SALES_GR_1Y : Growth rate of Revenue over the previous financial years<br/>QFL_LT_DEBT_EQUITY : Long-term debt/Shareholders' Equity<br/>QFL_DEBT_ASSETS : Long-term debt/total assets<br/>QFL_EBITDAEV : Represents unreported fiscal year (F1) Enterprise Value to EBITDA<br/>QFL_REVEV : Represents Enterprise Value to Revenue<br/>QFL_ROIC : Net Income/Two fiscal period average of Total Invested Capital * 100<br/>QFL_CFROIC : Net cash provided by/used in operating activities divided by the sum of the company's total shareholders' equity and its long-term liabilities<br/>., must be one of ["QFL_EY", "QFL_PEG", "QFL_OCFY", "QFL_BP", "QFL_SP", "QFL_OCF_EARNINGS_VAR", "QFL_DY", "QFL_NET_MGN", "QFL_OPER_MGN", "QFL_ROE", "QFL_CFROE", "QFL_EPS_GR_5Y", "QFL_OCF_GR_5Y", "QFL_SALES_GR_5Y", "QFL_DPS_GR_5Y", "QFL_EPS_GR_1Y", "QFL_OCF_GR_1Y", "QFL_SALES_GR_1Y", "QFL_LT_DEBT_EQUITY", "QFL_DEBT_ASSETS", "QFL_EBITDAEV", "QFL_REVEV", "QFL_ROIC", "QFL_CFROIC", ]  # noqa: E501
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
        """
        # required up here when default value is not given
        _path_to_item = kwargs.pop('_path_to_item', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if 'value' in kwargs:
            value = kwargs.pop('value')
        elif args:
            args = list(args)
            value = args.pop(0)
        else:
            raise ApiTypeError(
                "value is required, but not passed in args or kwargs and doesn't have default",
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)
        self.value = value
        if kwargs:
            raise ApiTypeError(
                "Invalid named arguments=%s passed to %s. Remove those invalid named arguments." % (
                    kwargs,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        return self
