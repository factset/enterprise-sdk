"""
    Open:Risk API

    Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.  # noqa: E501

    The version of the OpenAPI document: 1.24.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.OpenRisk.model_utils import (  # noqa: F401
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
from fds.sdk.OpenRisk.exceptions import ApiAttributeError



class StatCalculationSettings(ModelNormal):
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
        ('confidence_level',): {
            'exclusive_maximum''inclusive_maximum': 1,
            'exclusive_minimum''inclusive_minimum': 0,
        },
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
            'use_absolute_weights_for_lot_expansion': (bool,),  # noqa: E501
            'covariance_times_two': (bool,),  # noqa: E501
            'covariance_times_two_term': (bool,),  # noqa: E501
            'correlated_specific_risk': (bool,),  # noqa: E501
            'sparse': (bool,),  # noqa: E501
            'horizon': (float,),  # noqa: E501
            'days_per_year': (float,),  # noqa: E501
            'confidence_level': (float,),  # noqa: E501
            'lamda': (float,),  # noqa: E501
            'specific_to_factor_ratio': (float,),  # noqa: E501
            'rap_sys': (float,),  # noqa: E501
            'rap_unsys': (float,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'use_absolute_weights_for_lot_expansion': 'useAbsoluteWeightsForLotExpansion',  # noqa: E501
        'covariance_times_two': 'covarianceTimesTwo',  # noqa: E501
        'covariance_times_two_term': 'covarianceTimesTwoTerm',  # noqa: E501
        'correlated_specific_risk': 'correlatedSpecificRisk',  # noqa: E501
        'sparse': 'sparse',  # noqa: E501
        'horizon': 'horizon',  # noqa: E501
        'days_per_year': 'daysPerYear',  # noqa: E501
        'confidence_level': 'confidenceLevel',  # noqa: E501
        'lamda': 'lamda',  # noqa: E501
        'specific_to_factor_ratio': 'specificToFactorRatio',  # noqa: E501
        'rap_sys': 'rapSys',  # noqa: E501
        'rap_unsys': 'rapUnsys',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """StatCalculationSettings - a model defined in OpenAPI

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
            use_absolute_weights_for_lot_expansion (bool): When this is set to true, use absolute value weights for multi-lot expansion, otherwise use the actual value weights.. [optional] if omitted the server will use the default value of True  # noqa: E501
            covariance_times_two (bool): When this is set to true, calculate covariance multiplied by two.. [optional] if omitted the server will use the default value of False  # noqa: E501
            covariance_times_two_term (bool): When this is set to true, calculate covariance multiplied by two term (Cov*2 term).. [optional] if omitted the server will use the default value of False  # noqa: E501
            correlated_specific_risk (bool): When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR.. [optional] if omitted the server will use the default value of False  # noqa: E501
            sparse (bool): When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level.. [optional] if omitted the server will use the default value of False  # noqa: E501
            horizon (float): Horizon (in days) to use in Value at Risk (VaR) stat calculations.. [optional]  # noqa: E501
            days_per_year (float): Number of days per year (e.g. 250 or 365) to use in Value at Risk (VaR) stat calculations.. [optional]  # noqa: E501
            confidence_level (float): Confidence level to use in Value at Risk (VaR) stat calculations.. [optional]  # noqa: E501
            lamda (float): Lamda value to use in Implied Alpha Lamda stat calculations.. [optional]  # noqa: E501
            specific_to_factor_ratio (float): Specific risk to factor risk ratio value to use in Implied Alpha stat calculations.. [optional]  # noqa: E501
            rap_sys (float): Systematic RAP value to use in Implied Alpha RAP stat calculations.. [optional]  # noqa: E501
            rap_unsys (float): Unsystematic RAP value to use in Implied Alpha RAP stat calculations.. [optional]  # noqa: E501
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
        """StatCalculationSettings - a model defined in OpenAPI

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
            use_absolute_weights_for_lot_expansion (bool): When this is set to true, use absolute value weights for multi-lot expansion, otherwise use the actual value weights.. [optional] if omitted the server will use the default value of True  # noqa: E501
            covariance_times_two (bool): When this is set to true, calculate covariance multiplied by two.. [optional] if omitted the server will use the default value of False  # noqa: E501
            covariance_times_two_term (bool): When this is set to true, calculate covariance multiplied by two term (Cov*2 term).. [optional] if omitted the server will use the default value of False  # noqa: E501
            correlated_specific_risk (bool): When this is set to true, specific risk correlation adjustment will be applied to security level as well as portfolio level. An example case where stock specific correlation is supplied by risk models is the case between parent equity and ADR.. [optional] if omitted the server will use the default value of False  # noqa: E501
            sparse (bool): When this is set to true, the matrix and vector output is in compressed sparse row matrix format. Vector is considered as a matrix with one row for compressed sparse row matrix output. This only applies for matrix and vector output, not for single data points e.g. stats at Portfolio level.. [optional] if omitted the server will use the default value of False  # noqa: E501
            horizon (float): Horizon (in days) to use in Value at Risk (VaR) stat calculations.. [optional]  # noqa: E501
            days_per_year (float): Number of days per year (e.g. 250 or 365) to use in Value at Risk (VaR) stat calculations.. [optional]  # noqa: E501
            confidence_level (float): Confidence level to use in Value at Risk (VaR) stat calculations.. [optional]  # noqa: E501
            lamda (float): Lamda value to use in Implied Alpha Lamda stat calculations.. [optional]  # noqa: E501
            specific_to_factor_ratio (float): Specific risk to factor risk ratio value to use in Implied Alpha stat calculations.. [optional]  # noqa: E501
            rap_sys (float): Systematic RAP value to use in Implied Alpha RAP stat calculations.. [optional]  # noqa: E501
            rap_unsys (float): Unsystematic RAP value to use in Implied Alpha RAP stat calculations.. [optional]  # noqa: E501
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
