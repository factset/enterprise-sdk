"""
    Securitized Derivatives API For Digital Portals

    Search for securitized derivative instruments, using a criteria-based screener. The API provides also fundamental data, notation-based key figures, list of barrier types, and details regarding the underlyings, their respective barriers and related cash flows, coupon lists and derived basic interest rate information.  The screener is based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifier types used as parameters must be valid and application must have permissions for them.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * life cycle: important dates in and features of the life cycle of the securitized derivatives instruments * filter by issuer, country of registration of the securitized derivatives * underlying and related barriers, including level and distance, and resulting cash flows * coupon data: where applicable, occurrence and frequency of coupon payments, current interest rate range * performance and volatility * product-specific ask-based key figures (not all key figures are available for all product types):     * bonus yield, sideways yield, maximum yield based on the ask price     * agio, discount     * spread     * break even, outperformance point, parity     * delta, weekly theta, vega, implied volatility     * leverage, omega     * intrinsic value, time value         Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term *level* is used instead of *price*, e.g. underlying level instead of underlying price. The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  This API is fully integrated with the corresponding [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals).  Similar criteria based screener APIs exist for equity and fixed income instruments: See the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) and the [Bonds API](https://developer.factset.com/api-catalog/bonds-api-digital-portals) for details.    # noqa: E501

    The version of the OpenAPI document: 4.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model_utils import (  # noqa: F401
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
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_agio import InlineResponse2005DataKeyFiguresAgio
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_bonus_yield import InlineResponse2005DataKeyFiguresBonusYield
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_break_even import InlineResponse2005DataKeyFiguresBreakEven
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_delta import InlineResponse2005DataKeyFiguresDelta
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_discount import InlineResponse2005DataKeyFiguresDiscount
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_implied_volatility import InlineResponse2005DataKeyFiguresImpliedVolatility
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_intrinsic_value import InlineResponse2005DataKeyFiguresIntrinsicValue
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_leverage import InlineResponse2005DataKeyFiguresLeverage
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_maximum_yield import InlineResponse2005DataKeyFiguresMaximumYield
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_omega import InlineResponse2005DataKeyFiguresOmega
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_outperformance_point import InlineResponse2005DataKeyFiguresOutperformancePoint
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_parity import InlineResponse2005DataKeyFiguresParity
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_sideways_yield import InlineResponse2005DataKeyFiguresSidewaysYield
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_spread import InlineResponse2005DataKeyFiguresSpread
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_theta_one_week import InlineResponse2005DataKeyFiguresThetaOneWeek
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_time_value import InlineResponse2005DataKeyFiguresTimeValue
    from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005_data_key_figures_vega import InlineResponse2005DataKeyFiguresVega
    globals()['InlineResponse2005DataKeyFiguresAgio'] = InlineResponse2005DataKeyFiguresAgio
    globals()['InlineResponse2005DataKeyFiguresBonusYield'] = InlineResponse2005DataKeyFiguresBonusYield
    globals()['InlineResponse2005DataKeyFiguresBreakEven'] = InlineResponse2005DataKeyFiguresBreakEven
    globals()['InlineResponse2005DataKeyFiguresDelta'] = InlineResponse2005DataKeyFiguresDelta
    globals()['InlineResponse2005DataKeyFiguresDiscount'] = InlineResponse2005DataKeyFiguresDiscount
    globals()['InlineResponse2005DataKeyFiguresImpliedVolatility'] = InlineResponse2005DataKeyFiguresImpliedVolatility
    globals()['InlineResponse2005DataKeyFiguresIntrinsicValue'] = InlineResponse2005DataKeyFiguresIntrinsicValue
    globals()['InlineResponse2005DataKeyFiguresLeverage'] = InlineResponse2005DataKeyFiguresLeverage
    globals()['InlineResponse2005DataKeyFiguresMaximumYield'] = InlineResponse2005DataKeyFiguresMaximumYield
    globals()['InlineResponse2005DataKeyFiguresOmega'] = InlineResponse2005DataKeyFiguresOmega
    globals()['InlineResponse2005DataKeyFiguresOutperformancePoint'] = InlineResponse2005DataKeyFiguresOutperformancePoint
    globals()['InlineResponse2005DataKeyFiguresParity'] = InlineResponse2005DataKeyFiguresParity
    globals()['InlineResponse2005DataKeyFiguresSidewaysYield'] = InlineResponse2005DataKeyFiguresSidewaysYield
    globals()['InlineResponse2005DataKeyFiguresSpread'] = InlineResponse2005DataKeyFiguresSpread
    globals()['InlineResponse2005DataKeyFiguresThetaOneWeek'] = InlineResponse2005DataKeyFiguresThetaOneWeek
    globals()['InlineResponse2005DataKeyFiguresTimeValue'] = InlineResponse2005DataKeyFiguresTimeValue
    globals()['InlineResponse2005DataKeyFiguresVega'] = InlineResponse2005DataKeyFiguresVega


class InlineResponse2005DataKeyFigures(ModelNormal):
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
        lazy_import()
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
        lazy_import()
        return {
            'bonus_yield': (InlineResponse2005DataKeyFiguresBonusYield,),  # noqa: E501
            'sideways_yield': (InlineResponse2005DataKeyFiguresSidewaysYield,),  # noqa: E501
            'maximum_yield': (InlineResponse2005DataKeyFiguresMaximumYield,),  # noqa: E501
            'agio': (InlineResponse2005DataKeyFiguresAgio,),  # noqa: E501
            'discount': (InlineResponse2005DataKeyFiguresDiscount,),  # noqa: E501
            'break_even': (InlineResponse2005DataKeyFiguresBreakEven,),  # noqa: E501
            'spread': (InlineResponse2005DataKeyFiguresSpread,),  # noqa: E501
            'delta': (InlineResponse2005DataKeyFiguresDelta,),  # noqa: E501
            'theta_one_week': (InlineResponse2005DataKeyFiguresThetaOneWeek,),  # noqa: E501
            'vega': (InlineResponse2005DataKeyFiguresVega,),  # noqa: E501
            'leverage': (InlineResponse2005DataKeyFiguresLeverage,),  # noqa: E501
            'omega': (InlineResponse2005DataKeyFiguresOmega,),  # noqa: E501
            'implied_volatility': (InlineResponse2005DataKeyFiguresImpliedVolatility,),  # noqa: E501
            'intrinsic_value': (InlineResponse2005DataKeyFiguresIntrinsicValue,),  # noqa: E501
            'time_value': (InlineResponse2005DataKeyFiguresTimeValue,),  # noqa: E501
            'outperformance_point': (InlineResponse2005DataKeyFiguresOutperformancePoint,),  # noqa: E501
            'parity': (InlineResponse2005DataKeyFiguresParity,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'bonus_yield': 'bonusYield',  # noqa: E501
        'sideways_yield': 'sidewaysYield',  # noqa: E501
        'maximum_yield': 'maximumYield',  # noqa: E501
        'agio': 'agio',  # noqa: E501
        'discount': 'discount',  # noqa: E501
        'break_even': 'breakEven',  # noqa: E501
        'spread': 'spread',  # noqa: E501
        'delta': 'delta',  # noqa: E501
        'theta_one_week': 'thetaOneWeek',  # noqa: E501
        'vega': 'vega',  # noqa: E501
        'leverage': 'leverage',  # noqa: E501
        'omega': 'omega',  # noqa: E501
        'implied_volatility': 'impliedVolatility',  # noqa: E501
        'intrinsic_value': 'intrinsicValue',  # noqa: E501
        'time_value': 'timeValue',  # noqa: E501
        'outperformance_point': 'outperformancePoint',  # noqa: E501
        'parity': 'parity',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """InlineResponse2005DataKeyFigures - a model defined in OpenAPI

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
            bonus_yield (InlineResponse2005DataKeyFiguresBonusYield): [optional]  # noqa: E501
            sideways_yield (InlineResponse2005DataKeyFiguresSidewaysYield): [optional]  # noqa: E501
            maximum_yield (InlineResponse2005DataKeyFiguresMaximumYield): [optional]  # noqa: E501
            agio (InlineResponse2005DataKeyFiguresAgio): [optional]  # noqa: E501
            discount (InlineResponse2005DataKeyFiguresDiscount): [optional]  # noqa: E501
            break_even (InlineResponse2005DataKeyFiguresBreakEven): [optional]  # noqa: E501
            spread (InlineResponse2005DataKeyFiguresSpread): [optional]  # noqa: E501
            delta (InlineResponse2005DataKeyFiguresDelta): [optional]  # noqa: E501
            theta_one_week (InlineResponse2005DataKeyFiguresThetaOneWeek): [optional]  # noqa: E501
            vega (InlineResponse2005DataKeyFiguresVega): [optional]  # noqa: E501
            leverage (InlineResponse2005DataKeyFiguresLeverage): [optional]  # noqa: E501
            omega (InlineResponse2005DataKeyFiguresOmega): [optional]  # noqa: E501
            implied_volatility (InlineResponse2005DataKeyFiguresImpliedVolatility): [optional]  # noqa: E501
            intrinsic_value (InlineResponse2005DataKeyFiguresIntrinsicValue): [optional]  # noqa: E501
            time_value (InlineResponse2005DataKeyFiguresTimeValue): [optional]  # noqa: E501
            outperformance_point (InlineResponse2005DataKeyFiguresOutperformancePoint): [optional]  # noqa: E501
            parity (InlineResponse2005DataKeyFiguresParity): [optional]  # noqa: E501
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
        """InlineResponse2005DataKeyFigures - a model defined in OpenAPI

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
            bonus_yield (InlineResponse2005DataKeyFiguresBonusYield): [optional]  # noqa: E501
            sideways_yield (InlineResponse2005DataKeyFiguresSidewaysYield): [optional]  # noqa: E501
            maximum_yield (InlineResponse2005DataKeyFiguresMaximumYield): [optional]  # noqa: E501
            agio (InlineResponse2005DataKeyFiguresAgio): [optional]  # noqa: E501
            discount (InlineResponse2005DataKeyFiguresDiscount): [optional]  # noqa: E501
            break_even (InlineResponse2005DataKeyFiguresBreakEven): [optional]  # noqa: E501
            spread (InlineResponse2005DataKeyFiguresSpread): [optional]  # noqa: E501
            delta (InlineResponse2005DataKeyFiguresDelta): [optional]  # noqa: E501
            theta_one_week (InlineResponse2005DataKeyFiguresThetaOneWeek): [optional]  # noqa: E501
            vega (InlineResponse2005DataKeyFiguresVega): [optional]  # noqa: E501
            leverage (InlineResponse2005DataKeyFiguresLeverage): [optional]  # noqa: E501
            omega (InlineResponse2005DataKeyFiguresOmega): [optional]  # noqa: E501
            implied_volatility (InlineResponse2005DataKeyFiguresImpliedVolatility): [optional]  # noqa: E501
            intrinsic_value (InlineResponse2005DataKeyFiguresIntrinsicValue): [optional]  # noqa: E501
            time_value (InlineResponse2005DataKeyFiguresTimeValue): [optional]  # noqa: E501
            outperformance_point (InlineResponse2005DataKeyFiguresOutperformancePoint): [optional]  # noqa: E501
            parity (InlineResponse2005DataKeyFiguresParity): [optional]  # noqa: E501
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
