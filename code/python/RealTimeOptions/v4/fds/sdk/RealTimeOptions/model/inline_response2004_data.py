"""
    Real-Time Options API

    The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api).   # noqa: E501

    The version of the OpenAPI document: 4.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.RealTimeOptions.model_utils import (  # noqa: F401
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
from fds.sdk.RealTimeOptions.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.RealTimeOptions.model.inline_response2004_data_currency import InlineResponse2004DataCurrency
    from fds.sdk.RealTimeOptions.model.inline_response2004_data_prices import InlineResponse2004DataPrices
    globals()['InlineResponse2004DataCurrency'] = InlineResponse2004DataCurrency
    globals()['InlineResponse2004DataPrices'] = InlineResponse2004DataPrices


class InlineResponse2004Data(ModelNormal):
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
            'id_notation': (str, none_type,),  # noqa: E501
            'source_identifier': (str, none_type,),  # noqa: E501
            'prices': (InlineResponse2004DataPrices,),  # noqa: E501
            'currency': (InlineResponse2004DataCurrency,),  # noqa: E501
            'delta': (float, none_type,),  # noqa: E501
            'omega': (float, none_type,),  # noqa: E501
            'theta_one_week': (float, none_type,),  # noqa: E501
            'vega': (float, none_type,),  # noqa: E501
            'gamma': (float, none_type,),  # noqa: E501
            'rho': (float, none_type,),  # noqa: E501
            'break_even': (float, none_type,),  # noqa: E501
            'theoretical_value': (float, none_type,),  # noqa: E501
            'implied_volatility': (float, none_type,),  # noqa: E501
            'intrinsic_value': (float, none_type,),  # noqa: E501
            'leverage': (float, none_type,),  # noqa: E501
            'moneyness': (float, none_type,),  # noqa: E501
            'parity': (float, none_type,),  # noqa: E501
            'time_value': (float, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'id_notation': 'idNotation',  # noqa: E501
        'source_identifier': 'sourceIdentifier',  # noqa: E501
        'prices': 'prices',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'delta': 'delta',  # noqa: E501
        'omega': 'omega',  # noqa: E501
        'theta_one_week': 'thetaOneWeek',  # noqa: E501
        'vega': 'vega',  # noqa: E501
        'gamma': 'gamma',  # noqa: E501
        'rho': 'rho',  # noqa: E501
        'break_even': 'breakEven',  # noqa: E501
        'theoretical_value': 'theoreticalValue',  # noqa: E501
        'implied_volatility': 'impliedVolatility',  # noqa: E501
        'intrinsic_value': 'intrinsicValue',  # noqa: E501
        'leverage': 'leverage',  # noqa: E501
        'moneyness': 'moneyness',  # noqa: E501
        'parity': 'parity',  # noqa: E501
        'time_value': 'timeValue',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """InlineResponse2004Data - a model defined in OpenAPI

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
            id_notation (str, none_type): Identifier of the notation.. [optional]  # noqa: E501
            source_identifier (str, none_type): Identifier used in the request.. [optional]  # noqa: E501
            prices (InlineResponse2004DataPrices): [optional]  # noqa: E501
            currency (InlineResponse2004DataCurrency): [optional]  # noqa: E501
            delta (float, none_type): Ask-based delta. It represents the first partial derivative of the function             determining the option's theoretical price with respect to the underlying level, evaluated             at the underlying level. Delta indicates the ratio of the absolute change of the             price of an option for an indefinitely small absolute change in the underlying             level, thus it represents the price sensitivity of the option relative to changes in             the underlying level.             . [optional]  # noqa: E501
            omega (float, none_type): Ask-based omega. It represents delta (see attribute `delta`) multiplied with theleverage (see attribute `leverage`), both calculated based on the ask price of theoption. Omega indicates the elasticity of the option's price regarding the underlyinglevel.. [optional]  # noqa: E501
            theta_one_week (float, none_type): Ask-based weekly theta. It represents the first partial derivative of the             function determining the option's theoretical price with respect to the residual term,             evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates             the absolute change (decrease) of the price of an option for a reduction of the             residual term by one week (seven calendar days), thus it represents the price             sensitivity of the option relative to changes in the residual term.             . [optional]  # noqa: E501
            vega (float, none_type): Ask-based vega. It represents the first partial derivative of the function             determining the option's theoretical price with respect to the implied volatility,             evaluated at the current implied volatility. Vega indicates the ratio of the absolute             change of the price of an option for an absolute change of the implied volatility,             thus it represents the price sensitivity of the option relative to changes in the             implied volatility.             . [optional]  # noqa: E501
            gamma (float, none_type): Ask-based gamma. It represents the second partial derivative of the function determining the option's theoretical price with respect to the underlying level, evaluated at the current underlying level. Gamma indicates the rate of change of the option's delta (see attribute `delta`) with respect to the underlying level.. [optional]  # noqa: E501
            rho (float, none_type): Ask-based rho. It represents the first partial derivative of the function              determining the option's theoretical price with respect to the risk-free interest rate,              evaluated at the current risk-free interest rate. Rho indicates the ratio of the absolute              change of the price of an option for an absolute change of the risk-free interest rate,              thus it represents the price sensitivity of the option relative to changes in the risk-free              interest rate.The key figure is shown in one basis point change.. [optional]  # noqa: E501
            break_even (float, none_type): Break even point based on the ask price. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the option. For the value unit, see attribute `currency`.. [optional]  # noqa: E501
            theoretical_value (float, none_type): Estimate for the value of an option according to the option's pricing model (such as Black-Scholes). The parameters for the pricing model (e.g. interest rate, dividend yield, currency cross-rate etc.) use the current market values. For the historic volatility of the underlying, the time span refers to the remaining term to maturity of the option. The historic volatility that is closest to the remaining term is chosen. For example, for a remaining term of 14 months, the 1-year volatility is used, whereas for 19 months, the 2-year volatility. Note that the theoretical value does not depend on the option's price, but the value is in the option's value unit, see attribute `currency`.. [optional]  # noqa: E501
            implied_volatility (float, none_type): Ask-based implied volatility. It represents the volatility of the underlying             that justifies the ask price of the option, when used as a parameter in the             option's pricing model (such as Black-Scholes). Its value is a result of the pricing             process, thus it represents the annual volatility of the underlying expected by the             market participants until maturity of the option.             . [optional]  # noqa: E501
            intrinsic_value (float, none_type): Intrinsic value. It represents the difference between the underlying level and             the strike of the option, adjusted for the currency cross rate. If the difference             is negative, the intrinsic value is given as 0. The intrinsic value represents             the theoretical profit from an immediate exercise of the option.             . [optional]  # noqa: E501
            leverage (float, none_type): Ask-based leverage. It represents the ratio of the underlying level to the ask             price of the option, adjusted for the currency cross rate.             . [optional]  # noqa: E501
            moneyness (float, none_type): Ratio of the current underlying level to the strike of an option. For calls,             it is current underlying level divided by the strike. For puts, it is strike             divided by the current underlying level. It measures the degree to which an option is             in-the-money (moneyness > 1) or out-of-the-money (moneyness < 1). If moneyness = 1, the             option is at-the-money.             . [optional]  # noqa: E501
            parity (float, none_type): Parity. It represents the difference between the underlying level and the             strike of the option, adjusted for the currency cross rate. Negative values are             possible. It is the gain or loss that would result from the immediate exercise of an             already present option and a simultaneously executed compensation transaction on the             spot markets.             . [optional]  # noqa: E501
            time_value (float, none_type): Ask-based time value. It represents the difference between the ask price ofthe option and its intrinsic value (see attribute `intrinsicValue`).. [optional]  # noqa: E501
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
        """InlineResponse2004Data - a model defined in OpenAPI

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
            id_notation (str, none_type): Identifier of the notation.. [optional]  # noqa: E501
            source_identifier (str, none_type): Identifier used in the request.. [optional]  # noqa: E501
            prices (InlineResponse2004DataPrices): [optional]  # noqa: E501
            currency (InlineResponse2004DataCurrency): [optional]  # noqa: E501
            delta (float, none_type): Ask-based delta. It represents the first partial derivative of the function             determining the option's theoretical price with respect to the underlying level, evaluated             at the underlying level. Delta indicates the ratio of the absolute change of the             price of an option for an indefinitely small absolute change in the underlying             level, thus it represents the price sensitivity of the option relative to changes in             the underlying level.             . [optional]  # noqa: E501
            omega (float, none_type): Ask-based omega. It represents delta (see attribute `delta`) multiplied with theleverage (see attribute `leverage`), both calculated based on the ask price of theoption. Omega indicates the elasticity of the option's price regarding the underlyinglevel.. [optional]  # noqa: E501
            theta_one_week (float, none_type): Ask-based weekly theta. It represents the first partial derivative of the             function determining the option's theoretical price with respect to the residual term,             evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates             the absolute change (decrease) of the price of an option for a reduction of the             residual term by one week (seven calendar days), thus it represents the price             sensitivity of the option relative to changes in the residual term.             . [optional]  # noqa: E501
            vega (float, none_type): Ask-based vega. It represents the first partial derivative of the function             determining the option's theoretical price with respect to the implied volatility,             evaluated at the current implied volatility. Vega indicates the ratio of the absolute             change of the price of an option for an absolute change of the implied volatility,             thus it represents the price sensitivity of the option relative to changes in the             implied volatility.             . [optional]  # noqa: E501
            gamma (float, none_type): Ask-based gamma. It represents the second partial derivative of the function determining the option's theoretical price with respect to the underlying level, evaluated at the current underlying level. Gamma indicates the rate of change of the option's delta (see attribute `delta`) with respect to the underlying level.. [optional]  # noqa: E501
            rho (float, none_type): Ask-based rho. It represents the first partial derivative of the function              determining the option's theoretical price with respect to the risk-free interest rate,              evaluated at the current risk-free interest rate. Rho indicates the ratio of the absolute              change of the price of an option for an absolute change of the risk-free interest rate,              thus it represents the price sensitivity of the option relative to changes in the risk-free              interest rate.The key figure is shown in one basis point change.. [optional]  # noqa: E501
            break_even (float, none_type): Break even point based on the ask price. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the option. For the value unit, see attribute `currency`.. [optional]  # noqa: E501
            theoretical_value (float, none_type): Estimate for the value of an option according to the option's pricing model (such as Black-Scholes). The parameters for the pricing model (e.g. interest rate, dividend yield, currency cross-rate etc.) use the current market values. For the historic volatility of the underlying, the time span refers to the remaining term to maturity of the option. The historic volatility that is closest to the remaining term is chosen. For example, for a remaining term of 14 months, the 1-year volatility is used, whereas for 19 months, the 2-year volatility. Note that the theoretical value does not depend on the option's price, but the value is in the option's value unit, see attribute `currency`.. [optional]  # noqa: E501
            implied_volatility (float, none_type): Ask-based implied volatility. It represents the volatility of the underlying             that justifies the ask price of the option, when used as a parameter in the             option's pricing model (such as Black-Scholes). Its value is a result of the pricing             process, thus it represents the annual volatility of the underlying expected by the             market participants until maturity of the option.             . [optional]  # noqa: E501
            intrinsic_value (float, none_type): Intrinsic value. It represents the difference between the underlying level and             the strike of the option, adjusted for the currency cross rate. If the difference             is negative, the intrinsic value is given as 0. The intrinsic value represents             the theoretical profit from an immediate exercise of the option.             . [optional]  # noqa: E501
            leverage (float, none_type): Ask-based leverage. It represents the ratio of the underlying level to the ask             price of the option, adjusted for the currency cross rate.             . [optional]  # noqa: E501
            moneyness (float, none_type): Ratio of the current underlying level to the strike of an option. For calls,             it is current underlying level divided by the strike. For puts, it is strike             divided by the current underlying level. It measures the degree to which an option is             in-the-money (moneyness > 1) or out-of-the-money (moneyness < 1). If moneyness = 1, the             option is at-the-money.             . [optional]  # noqa: E501
            parity (float, none_type): Parity. It represents the difference between the underlying level and the             strike of the option, adjusted for the currency cross rate. Negative values are             possible. It is the gain or loss that would result from the immediate exercise of an             already present option and a simultaneously executed compensation transaction on the             spot markets.             . [optional]  # noqa: E501
            time_value (float, none_type): Ask-based time value. It represents the difference between the ask price ofthe option and its intrinsic value (see attribute `intrinsicValue`).. [optional]  # noqa: E501
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
