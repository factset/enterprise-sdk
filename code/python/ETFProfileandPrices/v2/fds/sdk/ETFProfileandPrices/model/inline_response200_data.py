"""
    Prime Developer Trial

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: v1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.ETFProfileandPrices.model_utils import (  # noqa: F401
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
from fds.sdk.ETFProfileandPrices.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_brand import InlineResponse200DataBrand
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_create_redeem import InlineResponse200DataCreateRedeem
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_currency import InlineResponse200DataCurrency
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_documentation import InlineResponse200DataDocumentation
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_exchange import InlineResponse200DataExchange
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_financial_report import InlineResponse200DataFinancialReport
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_index import InlineResponse200DataIndex
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_insight import InlineResponse200DataInsight
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_issuer import InlineResponse200DataIssuer
    from fds.sdk.ETFProfileandPrices.model.inline_response200_data_trading import InlineResponse200DataTrading
    globals()['InlineResponse200DataBrand'] = InlineResponse200DataBrand
    globals()['InlineResponse200DataCreateRedeem'] = InlineResponse200DataCreateRedeem
    globals()['InlineResponse200DataCurrency'] = InlineResponse200DataCurrency
    globals()['InlineResponse200DataDocumentation'] = InlineResponse200DataDocumentation
    globals()['InlineResponse200DataExchange'] = InlineResponse200DataExchange
    globals()['InlineResponse200DataFinancialReport'] = InlineResponse200DataFinancialReport
    globals()['InlineResponse200DataIndex'] = InlineResponse200DataIndex
    globals()['InlineResponse200DataInsight'] = InlineResponse200DataInsight
    globals()['InlineResponse200DataIssuer'] = InlineResponse200DataIssuer
    globals()['InlineResponse200DataTrading'] = InlineResponse200DataTrading


class InlineResponse200Data(ModelNormal):
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
        ('status',): {
            'ACTIVE': "Active",
            'DELISTED': "Delisted",
            'NOT_TRADING_YET': "Not trading yet",


        },
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
            'as_of_date': (date,),  # noqa: E501
            'holdings_date': (date,),  # noqa: E501
            'symbol': (str,),  # noqa: E501
            'exchange': (InlineResponse200DataExchange,),  # noqa: E501
            'name': (str,),  # noqa: E501
            'issuer': (InlineResponse200DataIssuer,),  # noqa: E501
            'brand': (InlineResponse200DataBrand,),  # noqa: E501
            'launch_date': (date,),  # noqa: E501
            'description': (str,),  # noqa: E501
            'website': (str,),  # noqa: E501
            'domicile': (str,),  # noqa: E501
            'status': (str,),  # noqa: E501
            'currency': (InlineResponse200DataCurrency,),  # noqa: E501
            'index': (InlineResponse200DataIndex,),  # noqa: E501
            'financial_report': (InlineResponse200DataFinancialReport,),  # noqa: E501
            'create_redeem': (InlineResponse200DataCreateRedeem,),  # noqa: E501
            'aum': (float,),  # noqa: E501
            'trading': (InlineResponse200DataTrading,),  # noqa: E501
            'documentation': (InlineResponse200DataDocumentation,),  # noqa: E501
            'insight': (InlineResponse200DataInsight,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'as_of_date': 'asOfDate',  # noqa: E501
        'holdings_date': 'holdingsDate',  # noqa: E501
        'symbol': 'symbol',  # noqa: E501
        'exchange': 'exchange',  # noqa: E501
        'name': 'name',  # noqa: E501
        'issuer': 'issuer',  # noqa: E501
        'brand': 'brand',  # noqa: E501
        'launch_date': 'launchDate',  # noqa: E501
        'description': 'description',  # noqa: E501
        'website': 'website',  # noqa: E501
        'domicile': 'domicile',  # noqa: E501
        'status': 'status',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'index': 'index',  # noqa: E501
        'financial_report': 'financialReport',  # noqa: E501
        'create_redeem': 'createRedeem',  # noqa: E501
        'aum': 'aum',  # noqa: E501
        'trading': 'trading',  # noqa: E501
        'documentation': 'documentation',  # noqa: E501
        'insight': 'insight',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """InlineResponse200Data - a model defined in OpenAPI

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
            as_of_date (date): Date data was published. This data is available only for US region.. [optional]  # noqa: E501
            holdings_date (date): The as of data for holdings statistics. This data available only for US region. [optional]  # noqa: E501
            symbol (str): Ticker of the ETP. This data is available for all region.. [optional]  # noqa: E501
            exchange (InlineResponse200DataExchange): [optional]  # noqa: E501
            name (str): Name of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            issuer (InlineResponse200DataIssuer): [optional]  # noqa: E501
            brand (InlineResponse200DataBrand): [optional]  # noqa: E501
            launch_date (date): Launch date of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            description (str): A brief description of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            website (str): Link to the ETP's homepage. This data is available for the US and Canada region.. [optional]  # noqa: E501
            domicile (str): ETP country of domicile. This data is available for all the regions and country code is in format ISO 3166-1 alpha-2.. [optional]  # noqa: E501
            status (str): Staus of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            currency (InlineResponse200DataCurrency): [optional]  # noqa: E501
            index (InlineResponse200DataIndex): [optional]  # noqa: E501
            financial_report (InlineResponse200DataFinancialReport): [optional]  # noqa: E501
            create_redeem (InlineResponse200DataCreateRedeem): [optional]  # noqa: E501
            aum (float): The market value of the total assets that a individual ETP manages on behalf of it's investors. This data is available for all the regions.. [optional]  # noqa: E501
            trading (InlineResponse200DataTrading): [optional]  # noqa: E501
            documentation (InlineResponse200DataDocumentation): [optional]  # noqa: E501
            insight (InlineResponse200DataInsight): [optional]  # noqa: E501
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
        """InlineResponse200Data - a model defined in OpenAPI

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
            as_of_date (date): Date data was published. This data is available only for US region.. [optional]  # noqa: E501
            holdings_date (date): The as of data for holdings statistics. This data available only for US region. [optional]  # noqa: E501
            symbol (str): Ticker of the ETP. This data is available for all region.. [optional]  # noqa: E501
            exchange (InlineResponse200DataExchange): [optional]  # noqa: E501
            name (str): Name of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            issuer (InlineResponse200DataIssuer): [optional]  # noqa: E501
            brand (InlineResponse200DataBrand): [optional]  # noqa: E501
            launch_date (date): Launch date of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            description (str): A brief description of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            website (str): Link to the ETP's homepage. This data is available for the US and Canada region.. [optional]  # noqa: E501
            domicile (str): ETP country of domicile. This data is available for all the regions and country code is in format ISO 3166-1 alpha-2.. [optional]  # noqa: E501
            status (str): Staus of the ETP. This data is available for all the regions.. [optional]  # noqa: E501
            currency (InlineResponse200DataCurrency): [optional]  # noqa: E501
            index (InlineResponse200DataIndex): [optional]  # noqa: E501
            financial_report (InlineResponse200DataFinancialReport): [optional]  # noqa: E501
            create_redeem (InlineResponse200DataCreateRedeem): [optional]  # noqa: E501
            aum (float): The market value of the total assets that a individual ETP manages on behalf of it's investors. This data is available for all the regions.. [optional]  # noqa: E501
            trading (InlineResponse200DataTrading): [optional]  # noqa: E501
            documentation (InlineResponse200DataDocumentation): [optional]  # noqa: E501
            insight (InlineResponse200DataInsight): [optional]  # noqa: E501
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
