"""
    Best Execution Analytics for Smarter Trading (BEAST) API

    Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.model_utils import (  # noqa: F401
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
from fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST.exceptions import ApiAttributeError



class ReportRecord(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

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
            'date_id': (str,),  # noqa: E501
            'first_fill_mid_perf_bps': (float,),  # noqa: E501
            't_plus5_close_perf_bps': (float,),  # noqa: E501
            'reversion60_min_mid_bps': (float,),  # noqa: E501
            'pwp10_perf_bps': (float,),  # noqa: E501
            'pwp01_perf_bps': (float,),  # noqa: E501
            't_minus1_close_perf_bps': (float,),  # noqa: E501
            'pwp05_perf_bps': (float,),  # noqa: E501
            'pwp03_perf_bps': (float,),  # noqa: E501
            'pwp02_perf_bps': (float,),  # noqa: E501
            'volume': (float,),  # noqa: E501
            't_plus1_close_perf_bps': (float,),  # noqa: E501
            'pwp50_perf_bps': (float,),  # noqa: E501
            'pwp20_perf_bps': (float,),  # noqa: E501
            'ref_value': (float,),  # noqa: E501
            'reversion10_min_mid_bps': (float,),  # noqa: E501
            'reversion15_min_mid_bps': (float,),  # noqa: E501
            'country': (str,),  # noqa: E501
            'region': (str,),  # noqa: E501
            'open_perf_bps': (float,),  # noqa: E501
            'pm_code': (str,),  # noqa: E501
            'vwap_ff_lf_perf_bps': (float,),  # noqa: E501
            't_minus3_close_perf_bps': (float,),  # noqa: E501
            'reversion5_min_mid_bps': (float,),  # noqa: E501
            't_minus5_close_perf_bps': (float,),  # noqa: E501
            't_plus3_close_perf_bps': (float,),  # noqa: E501
            'last_fill_mid_perf_bps': (float,),  # noqa: E501
            'pwp100_perf_bps': (float,),  # noqa: E501
            'close_perf_bps': (float,),  # noqa: E501
            'orders': (int,),  # noqa: E501
            'side': (str,),  # noqa: E501
            'idm': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'date_id': 'dateId',  # noqa: E501
        'first_fill_mid_perf_bps': 'firstFillMidPerfBps',  # noqa: E501
        't_plus5_close_perf_bps': 'tPlus5ClosePerfBps',  # noqa: E501
        'reversion60_min_mid_bps': 'reversion60MinMidBps',  # noqa: E501
        'pwp10_perf_bps': 'pwp10PerfBps',  # noqa: E501
        'pwp01_perf_bps': 'pwp01PerfBps',  # noqa: E501
        't_minus1_close_perf_bps': 'tMinus1ClosePerfBps',  # noqa: E501
        'pwp05_perf_bps': 'pwp05PerfBps',  # noqa: E501
        'pwp03_perf_bps': 'pwp03PerfBps',  # noqa: E501
        'pwp02_perf_bps': 'pwp02PerfBps',  # noqa: E501
        'volume': 'volume',  # noqa: E501
        't_plus1_close_perf_bps': 'tPlus1ClosePerfBps',  # noqa: E501
        'pwp50_perf_bps': 'pwp50PerfBps',  # noqa: E501
        'pwp20_perf_bps': 'pwp20PerfBps',  # noqa: E501
        'ref_value': 'refValue',  # noqa: E501
        'reversion10_min_mid_bps': 'reversion10MinMidBps',  # noqa: E501
        'reversion15_min_mid_bps': 'reversion15MinMidBps',  # noqa: E501
        'country': 'country',  # noqa: E501
        'region': 'region',  # noqa: E501
        'open_perf_bps': 'openPerfBps',  # noqa: E501
        'pm_code': 'pmCode',  # noqa: E501
        'vwap_ff_lf_perf_bps': 'vwapFfLfPerfBps',  # noqa: E501
        't_minus3_close_perf_bps': 'tMinus3ClosePerfBps',  # noqa: E501
        'reversion5_min_mid_bps': 'reversion5MinMidBps',  # noqa: E501
        't_minus5_close_perf_bps': 'tMinus5ClosePerfBps',  # noqa: E501
        't_plus3_close_perf_bps': 'tPlus3ClosePerfBps',  # noqa: E501
        'last_fill_mid_perf_bps': 'lastFillMidPerfBps',  # noqa: E501
        'pwp100_perf_bps': 'pwp100PerfBps',  # noqa: E501
        'close_perf_bps': 'closePerfBps',  # noqa: E501
        'orders': 'orders',  # noqa: E501
        'side': 'side',  # noqa: E501
        'idm': 'idm',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """ReportRecord - a model defined in OpenAPI

        Keyword Args:
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
            date_id (str): Date Id. [optional]  # noqa: E501
            first_fill_mid_perf_bps (float): firstFillMidPerfBps. [optional]  # noqa: E501
            t_plus5_close_perf_bps (float): tPlus5ClosePerfBps. [optional]  # noqa: E501
            reversion60_min_mid_bps (float): reversion60MinMidBps. [optional]  # noqa: E501
            pwp10_perf_bps (float): pwp10PerfBps. [optional]  # noqa: E501
            pwp01_perf_bps (float): pwp01PerfBps. [optional]  # noqa: E501
            t_minus1_close_perf_bps (float): tMinus1ClosePerfBps. [optional]  # noqa: E501
            pwp05_perf_bps (float): pwp05PerfBps. [optional]  # noqa: E501
            pwp03_perf_bps (float): pwp03PerfBps. [optional]  # noqa: E501
            pwp02_perf_bps (float): pwp02PerfBps. [optional]  # noqa: E501
            volume (float): volume. [optional]  # noqa: E501
            t_plus1_close_perf_bps (float): tPlus1ClosePerfBps. [optional]  # noqa: E501
            pwp50_perf_bps (float): pwp50PerfBps. [optional]  # noqa: E501
            pwp20_perf_bps (float): pwp20PerfBps. [optional]  # noqa: E501
            ref_value (float): refValue. [optional]  # noqa: E501
            reversion10_min_mid_bps (float): reversion10MinMidBps. [optional]  # noqa: E501
            reversion15_min_mid_bps (float): reversion15MinMidBps. [optional]  # noqa: E501
            country (str): The two character ISO country code. [optional]  # noqa: E501
            region (str): The two character ISO country code. EMEA is used for the European trading region. [optional]  # noqa: E501
            open_perf_bps (float): openPerfBps. [optional]  # noqa: E501
            pm_code (str): Pm Code. [optional]  # noqa: E501
            vwap_ff_lf_perf_bps (float): vwapFfLfPerfBps. [optional]  # noqa: E501
            t_minus3_close_perf_bps (float): tMinus3ClosePerfBps. [optional]  # noqa: E501
            reversion5_min_mid_bps (float): reversion5MinMidBps. [optional]  # noqa: E501
            t_minus5_close_perf_bps (float): tMinus5ClosePerfBps. [optional]  # noqa: E501
            t_plus3_close_perf_bps (float): tPlus3ClosePerfBps. [optional]  # noqa: E501
            last_fill_mid_perf_bps (float): lastFillMidPerfBps. [optional]  # noqa: E501
            pwp100_perf_bps (float): pwp100PerfBps. [optional]  # noqa: E501
            close_perf_bps (float): closePerfBps. [optional]  # noqa: E501
            orders (int): Order count. [optional]  # noqa: E501
            side (str): Side. [optional]  # noqa: E501
            idm (str): idm. [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

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

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """ReportRecord - a model defined in OpenAPI

        Keyword Args:
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
            date_id (str): Date Id. [optional]  # noqa: E501
            first_fill_mid_perf_bps (float): firstFillMidPerfBps. [optional]  # noqa: E501
            t_plus5_close_perf_bps (float): tPlus5ClosePerfBps. [optional]  # noqa: E501
            reversion60_min_mid_bps (float): reversion60MinMidBps. [optional]  # noqa: E501
            pwp10_perf_bps (float): pwp10PerfBps. [optional]  # noqa: E501
            pwp01_perf_bps (float): pwp01PerfBps. [optional]  # noqa: E501
            t_minus1_close_perf_bps (float): tMinus1ClosePerfBps. [optional]  # noqa: E501
            pwp05_perf_bps (float): pwp05PerfBps. [optional]  # noqa: E501
            pwp03_perf_bps (float): pwp03PerfBps. [optional]  # noqa: E501
            pwp02_perf_bps (float): pwp02PerfBps. [optional]  # noqa: E501
            volume (float): volume. [optional]  # noqa: E501
            t_plus1_close_perf_bps (float): tPlus1ClosePerfBps. [optional]  # noqa: E501
            pwp50_perf_bps (float): pwp50PerfBps. [optional]  # noqa: E501
            pwp20_perf_bps (float): pwp20PerfBps. [optional]  # noqa: E501
            ref_value (float): refValue. [optional]  # noqa: E501
            reversion10_min_mid_bps (float): reversion10MinMidBps. [optional]  # noqa: E501
            reversion15_min_mid_bps (float): reversion15MinMidBps. [optional]  # noqa: E501
            country (str): The two character ISO country code. [optional]  # noqa: E501
            region (str): The two character ISO country code. EMEA is used for the European trading region. [optional]  # noqa: E501
            open_perf_bps (float): openPerfBps. [optional]  # noqa: E501
            pm_code (str): Pm Code. [optional]  # noqa: E501
            vwap_ff_lf_perf_bps (float): vwapFfLfPerfBps. [optional]  # noqa: E501
            t_minus3_close_perf_bps (float): tMinus3ClosePerfBps. [optional]  # noqa: E501
            reversion5_min_mid_bps (float): reversion5MinMidBps. [optional]  # noqa: E501
            t_minus5_close_perf_bps (float): tMinus5ClosePerfBps. [optional]  # noqa: E501
            t_plus3_close_perf_bps (float): tPlus3ClosePerfBps. [optional]  # noqa: E501
            last_fill_mid_perf_bps (float): lastFillMidPerfBps. [optional]  # noqa: E501
            pwp100_perf_bps (float): pwp100PerfBps. [optional]  # noqa: E501
            close_perf_bps (float): closePerfBps. [optional]  # noqa: E501
            orders (int): Order count. [optional]  # noqa: E501
            side (str): Side. [optional]  # noqa: E501
            idm (str): idm. [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
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

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
