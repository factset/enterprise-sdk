"""
    DSOTM API

    Allow clients to send transactions data to FactSet.  # noqa: E501

    The version of the OpenAPI document: 1.5.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.DirectStreamingofTransactionMessages.model_utils import (  # noqa: F401
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
from fds.sdk.DirectStreamingofTransactionMessages.exceptions import ApiAttributeError



class ExecutionParameters(ModelNormal):
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
        ('settlement_currency_iso',): {
            'max_length': 3,
            'min_length': 0,
        },
        ('transaction_id',): {
            'max_length': 252,
            'min_length': 0,
        },
        ('symbol',): {
            'max_length': 32,
            'min_length': 0,
        },
        ('description',): {
            'max_length': 32,
            'min_length': 0,
        },
        ('currency_iso',): {
            'max_length': 3,
            'min_length': 0,
        },
        ('parent_id',): {
            'max_length': 32,
            'min_length': 0,
        },
        ('broker',): {
            'max_length': 32,
            'min_length': 0,
        },
        ('custodian',): {
            'max_length': 32,
            'min_length': 0,
        },
        ('order_id',): {
            'max_length': 32,
            'min_length': 0,
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
            'transaction_status': (str,),  # noqa: E501
            'net': (float,),  # noqa: E501
            'settlement_date': (str,),  # noqa: E501
            'settlement_currency_iso': (str,),  # noqa: E501
            'settlement_value': (float,),  # noqa: E501
            'transaction_id': (str,),  # noqa: E501
            'portfolio': (str,),  # noqa: E501
            'symbol': (str,),  # noqa: E501
            'description': (str,),  # noqa: E501
            'trade_type': (str,),  # noqa: E501
            'unit_type': (str,),  # noqa: E501
            'quantity': (float,),  # noqa: E501
            'gross': (float,),  # noqa: E501
            'currency_iso': (str,),  # noqa: E501
            'trade_date': (str,),  # noqa: E501
            'parent_id': (str, none_type,),  # noqa: E501
            'foreign_exchange_rate': (float,),  # noqa: E501
            'broker': (str,),  # noqa: E501
            'custodian': (str,),  # noqa: E501
            'accrued_interest': (float,),  # noqa: E501
            'commission': (float,),  # noqa: E501
            'clearing_commission': (float,),  # noqa: E501
            'local_tax': (float,),  # noqa: E501
            'local_fee': (float,),  # noqa: E501
            'broker_fee': (float,),  # noqa: E501
            'exchange_fee': (float,),  # noqa: E501
            'miscellaneous_fee': (float,),  # noqa: E501
            'order_id': (str, none_type,),  # noqa: E501
            'transaction_leaves': (float,),  # noqa: E501
            'price': (float,),  # noqa: E501
            'added_date_time': (str,),  # noqa: E501
            'updated_date_time': (str,),  # noqa: E501
            'entity': (str,),  # noqa: E501
            'status': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'transaction_status': 'transactionStatus',  # noqa: E501
        'net': 'net',  # noqa: E501
        'settlement_date': 'settlementDate',  # noqa: E501
        'settlement_currency_iso': 'settlementCurrencyISO',  # noqa: E501
        'settlement_value': 'settlementValue',  # noqa: E501
        'transaction_id': 'transactionId',  # noqa: E501
        'portfolio': 'portfolio',  # noqa: E501
        'symbol': 'symbol',  # noqa: E501
        'description': 'description',  # noqa: E501
        'trade_type': 'tradeType',  # noqa: E501
        'unit_type': 'unitType',  # noqa: E501
        'quantity': 'quantity',  # noqa: E501
        'gross': 'gross',  # noqa: E501
        'currency_iso': 'currencyISO',  # noqa: E501
        'trade_date': 'tradeDate',  # noqa: E501
        'parent_id': 'parentId',  # noqa: E501
        'foreign_exchange_rate': 'foreignExchangeRate',  # noqa: E501
        'broker': 'broker',  # noqa: E501
        'custodian': 'custodian',  # noqa: E501
        'accrued_interest': 'accruedInterest',  # noqa: E501
        'commission': 'commission',  # noqa: E501
        'clearing_commission': 'clearingCommission',  # noqa: E501
        'local_tax': 'localTax',  # noqa: E501
        'local_fee': 'localFee',  # noqa: E501
        'broker_fee': 'brokerFee',  # noqa: E501
        'exchange_fee': 'exchangeFee',  # noqa: E501
        'miscellaneous_fee': 'miscellaneousFee',  # noqa: E501
        'order_id': 'orderId',  # noqa: E501
        'transaction_leaves': 'transactionLeaves',  # noqa: E501
        'price': 'price',  # noqa: E501
        'added_date_time': 'addedDateTime',  # noqa: E501
        'updated_date_time': 'updatedDateTime',  # noqa: E501
        'entity': 'entity',  # noqa: E501
        'status': 'status',  # noqa: E501
    }

    read_only_vars = {
        'entity',  # noqa: E501
        'status',  # noqa: E501
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, transaction_status, net, settlement_date, settlement_currency_iso, settlement_value, transaction_id, portfolio, symbol, description, trade_type, unit_type, quantity, gross, currency_iso, trade_date, *args, **kwargs):  # noqa: E501
        """ExecutionParameters - a model defined in OpenAPI

        Args:
            transaction_status (str): Transaction Status of an Execution could be any of the following values: Executed, Booked, Cancelled.
            net (float): Cash value of the transaction, net of brokerage costs.
            settlement_date (str): Settlement date in YYYY-MM-DD format
            settlement_currency_iso (str): Currency code for Settlement Value
            settlement_value (float): Cash value of the transaction in settlement currency
            transaction_id (str): Unique Id for the transaction
            portfolio (str): Path of the portfolio (Ex: Client:/folder1/testing.ofdb)
            symbol (str): Symbol corresponding to the traded instrument.
            description (str): Description
            trade_type (str): Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively.
            unit_type (str): Unit type could be one of Quantity or Value.
            quantity (float): Quantity of the instrument traded.
            gross (float): Cash value of the transaction
            currency_iso (str): The currency code of cash valued fields, Net Amount and Gross Amount.
            trade_date (str): Trade date which is in the format YYYY-MM-DD

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
            parent_id (str, none_type): Unique Id of the placement which spawned this execution. [optional]  # noqa: E501
            foreign_exchange_rate (float): FX rate to convert the net, gross fields to reporting currency.. [optional]  # noqa: E501
            broker (str): Execution broker id.. [optional]  # noqa: E501
            custodian (str): Execution custodian Id.. [optional]  # noqa: E501
            accrued_interest (float): Execution accrued interest.. [optional]  # noqa: E501
            commission (float): Execution commission value.. [optional]  # noqa: E501
            clearing_commission (float): Execution clearing commission value.. [optional]  # noqa: E501
            local_tax (float): Execution local tax value.. [optional]  # noqa: E501
            local_fee (float): Execution local fee value.. [optional]  # noqa: E501
            broker_fee (float): Execution broker fee value.. [optional]  # noqa: E501
            exchange_fee (float): Execution exchange fee value.. [optional]  # noqa: E501
            miscellaneous_fee (float): Execution miscellaneous fee value.. [optional]  # noqa: E501
            order_id (str, none_type): Unique Id of the order which originated the record. [optional]  # noqa: E501
            transaction_leaves (float): Shares that have been ordered and not executed. [optional]  # noqa: E501
            price (float): The transaction price. [optional]  # noqa: E501
            added_date_time (str): Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF. [optional]  # noqa: E501
            updated_date_time (str): Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF. [optional]  # noqa: E501
            entity (str): [optional]  # noqa: E501
            status (str): [optional]  # noqa: E501
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

        self.transaction_status = transaction_status
        self.net = net
        self.settlement_date = settlement_date
        self.settlement_currency_iso = settlement_currency_iso
        self.settlement_value = settlement_value
        self.transaction_id = transaction_id
        self.portfolio = portfolio
        self.symbol = symbol
        self.description = description
        self.trade_type = trade_type
        self.unit_type = unit_type
        self.quantity = quantity
        self.gross = gross
        self.currency_iso = currency_iso
        self.trade_date = trade_date
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
    def __init__(self, transaction_status, net, settlement_date, settlement_currency_iso, settlement_value, transaction_id, portfolio, symbol, description, trade_type, unit_type, quantity, gross, currency_iso, trade_date, *args, **kwargs):  # noqa: E501
        """ExecutionParameters - a model defined in OpenAPI

        Args:
            transaction_status (str): Transaction Status of an Execution could be any of the following values: Executed, Booked, Cancelled.
            net (float): Cash value of the transaction, net of brokerage costs.
            settlement_date (str): Settlement date in YYYY-MM-DD format
            settlement_currency_iso (str): Currency code for Settlement Value
            settlement_value (float): Cash value of the transaction in settlement currency
            transaction_id (str): Unique Id for the transaction
            portfolio (str): Path of the portfolio (Ex: Client:/folder1/testing.ofdb)
            symbol (str): Symbol corresponding to the traded instrument.
            description (str): Description
            trade_type (str): Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively.
            unit_type (str): Unit type could be one of Quantity or Value.
            quantity (float): Quantity of the instrument traded.
            gross (float): Cash value of the transaction
            currency_iso (str): The currency code of cash valued fields, Net Amount and Gross Amount.
            trade_date (str): Trade date which is in the format YYYY-MM-DD

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
            parent_id (str, none_type): Unique Id of the placement which spawned this execution. [optional]  # noqa: E501
            foreign_exchange_rate (float): FX rate to convert the net, gross fields to reporting currency.. [optional]  # noqa: E501
            broker (str): Execution broker id.. [optional]  # noqa: E501
            custodian (str): Execution custodian Id.. [optional]  # noqa: E501
            accrued_interest (float): Execution accrued interest.. [optional]  # noqa: E501
            commission (float): Execution commission value.. [optional]  # noqa: E501
            clearing_commission (float): Execution clearing commission value.. [optional]  # noqa: E501
            local_tax (float): Execution local tax value.. [optional]  # noqa: E501
            local_fee (float): Execution local fee value.. [optional]  # noqa: E501
            broker_fee (float): Execution broker fee value.. [optional]  # noqa: E501
            exchange_fee (float): Execution exchange fee value.. [optional]  # noqa: E501
            miscellaneous_fee (float): Execution miscellaneous fee value.. [optional]  # noqa: E501
            order_id (str, none_type): Unique Id of the order which originated the record. [optional]  # noqa: E501
            transaction_leaves (float): Shares that have been ordered and not executed. [optional]  # noqa: E501
            price (float): The transaction price. [optional]  # noqa: E501
            added_date_time (str): Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF. [optional]  # noqa: E501
            updated_date_time (str): Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF. [optional]  # noqa: E501
            entity (str): [optional]  # noqa: E501
            status (str): [optional]  # noqa: E501
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

        self.transaction_status = transaction_status
        self.net = net
        self.settlement_date = settlement_date
        self.settlement_currency_iso = settlement_currency_iso
        self.settlement_value = settlement_value
        self.transaction_id = transaction_id
        self.portfolio = portfolio
        self.symbol = symbol
        self.description = description
        self.trade_type = trade_type
        self.unit_type = unit_type
        self.quantity = quantity
        self.gross = gross
        self.currency_iso = currency_iso
        self.trade_date = trade_date
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
