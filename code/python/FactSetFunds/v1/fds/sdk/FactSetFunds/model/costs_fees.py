"""
    FactSet Funds API

    FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetFunds.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetFunds.exceptions import ApiAttributeError



class CostsFees(ModelNormal):
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
            'fsym_id': (str, none_type,),  # noqa: E501
            'management_expenses': (float, none_type,),  # noqa: E501
            'date': (date, none_type,),  # noqa: E501
            'currency': (str, none_type,),  # noqa: E501
            'entry_expenses': (float, none_type,),  # noqa: E501
            'exit_expenses': (float, none_type,),  # noqa: E501
            'front_expenses_max': (float, none_type,),  # noqa: E501
            'back_expenses_max': (float, none_type,),  # noqa: E501
            'expense_ratio': (float, none_type,),  # noqa: E501
            'expense_ratio_prospectus': (float, none_type,),  # noqa: E501
            'init_investment_min': (float, none_type,),  # noqa: E501
            'init_investment_ira': (float, none_type,),  # noqa: E501
            'swing_price': (float, none_type,),  # noqa: E501
            'swing_price_date': (date, none_type,),  # noqa: E501
            'sri_priips': (int, none_type,),  # noqa: E501
            'srri_ucits': (int, none_type,),  # noqa: E501
            'performance_fee': (float, none_type,),  # noqa: E501
            'trading_expense_ratio': (float, none_type,),  # noqa: E501
            'request_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'fsym_id': 'fsymId',  # noqa: E501
        'management_expenses': 'managementExpenses',  # noqa: E501
        'date': 'date',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'entry_expenses': 'entryExpenses',  # noqa: E501
        'exit_expenses': 'exitExpenses',  # noqa: E501
        'front_expenses_max': 'frontExpensesMax',  # noqa: E501
        'back_expenses_max': 'backExpensesMax',  # noqa: E501
        'expense_ratio': 'expenseRatio',  # noqa: E501
        'expense_ratio_prospectus': 'expenseRatioProspectus',  # noqa: E501
        'init_investment_min': 'initInvestmentMin',  # noqa: E501
        'init_investment_ira': 'initInvestmentIra',  # noqa: E501
        'swing_price': 'swingPrice',  # noqa: E501
        'swing_price_date': 'swingPriceDate',  # noqa: E501
        'sri_priips': 'sriPriips',  # noqa: E501
        'srri_ucits': 'srriUcits',  # noqa: E501
        'performance_fee': 'performanceFee',  # noqa: E501
        'trading_expense_ratio': 'tradingExpenseRatio',  # noqa: E501
        'request_id': 'requestId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """CostsFees - a model defined in OpenAPI

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
            fsym_id (str, none_type): FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.. [optional]  # noqa: E501
            management_expenses (float, none_type): The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee.. [optional]  # noqa: E501
            date (date, none_type): The Expense Date expressed in YYYY-MM-DD.. [optional]  # noqa: E501
            currency (str, none_type): ISO3 Currency. [optional]  # noqa: E501
            entry_expenses (float, none_type): The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund. [optional]  # noqa: E501
            exit_expenses (float, none_type): The transaction exit fee is charged to investors when they redeem shares from a fund.. [optional]  # noqa: E501
            front_expenses_max (float, none_type): The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class 'A' shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \"front-end load\", this fee typically goes to the brokers that sell the fund's shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\" . [optional]  # noqa: E501
            back_expenses_max (float, none_type): The Back Expense Maximum. [optional]  # noqa: E501
            expense_ratio (float, none_type): The Expense Ratio. [optional]  # noqa: E501
            expense_ratio_prospectus (float, none_type): The Expense Ratio Prospectus. [optional]  # noqa: E501
            init_investment_min (float, none_type): The Initial Investment Minimum. [optional]  # noqa: E501
            init_investment_ira (float, none_type): The Initial Investment Individual Retirement Accounts. [optional]  # noqa: E501
            swing_price (float, none_type): Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder's interests.. [optional]  # noqa: E501
            swing_price_date (date, none_type): Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder's interests.. [optional]  # noqa: E501
            sri_priips (int, none_type): The SRI (Summary Risk Indicator) illustrates PRIIPs' risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk.. [optional]  # noqa: E501
            srri_ucits (int, none_type): Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund's risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk.. [optional]  # noqa: E501
            performance_fee (float, none_type): Represents fees made to an investment manager as a percentage of investment profits for generating positive returns.. [optional]  # noqa: E501
            trading_expense_ratio (float, none_type): Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund.. [optional]  # noqa: E501
            request_id (str): The requested Id sent as input.. [optional]  # noqa: E501
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
        """CostsFees - a model defined in OpenAPI

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
            fsym_id (str, none_type): FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.. [optional]  # noqa: E501
            management_expenses (float, none_type): The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee.. [optional]  # noqa: E501
            date (date, none_type): The Expense Date expressed in YYYY-MM-DD.. [optional]  # noqa: E501
            currency (str, none_type): ISO3 Currency. [optional]  # noqa: E501
            entry_expenses (float, none_type): The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund. [optional]  # noqa: E501
            exit_expenses (float, none_type): The transaction exit fee is charged to investors when they redeem shares from a fund.. [optional]  # noqa: E501
            front_expenses_max (float, none_type): The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class 'A' shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \"front-end load\", this fee typically goes to the brokers that sell the fund's shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 81⁄2%).\" . [optional]  # noqa: E501
            back_expenses_max (float, none_type): The Back Expense Maximum. [optional]  # noqa: E501
            expense_ratio (float, none_type): The Expense Ratio. [optional]  # noqa: E501
            expense_ratio_prospectus (float, none_type): The Expense Ratio Prospectus. [optional]  # noqa: E501
            init_investment_min (float, none_type): The Initial Investment Minimum. [optional]  # noqa: E501
            init_investment_ira (float, none_type): The Initial Investment Individual Retirement Accounts. [optional]  # noqa: E501
            swing_price (float, none_type): Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder's interests.. [optional]  # noqa: E501
            swing_price_date (date, none_type): Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder's interests.. [optional]  # noqa: E501
            sri_priips (int, none_type): The SRI (Summary Risk Indicator) illustrates PRIIPs' risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk.. [optional]  # noqa: E501
            srri_ucits (int, none_type): Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund's risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk.. [optional]  # noqa: E501
            performance_fee (float, none_type): Represents fees made to an investment manager as a percentage of investment profits for generating positive returns.. [optional]  # noqa: E501
            trading_expense_ratio (float, none_type): Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund.. [optional]  # noqa: E501
            request_id (str): The requested Id sent as input.. [optional]  # noqa: E501
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
