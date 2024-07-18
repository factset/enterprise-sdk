"""
    FactSet Mergers and Acquisitions API

    The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetMergersandAcquisitions.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetMergersandAcquisitions.exceptions import ApiAttributeError



class DealValue(ModelNormal):
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
        ('payment_method',): {
            'None': None,
            'CASH': "Cash",
            'CASH_&amp;_STOCK': "Cash & Stock",
            'CONVERTIBLE_PREFERRED_STOCK': "Convertible Preferred Stock",
            'DEBT': "Debt",
            'NOTES': "Notes",
            'OTHER': "Other",
            'PREFERRED_STOCK': "Preferred Stock",
            'STOCK': "Stock",
            'WARRANT_/_OPTIONS': "Warrant / Options",
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
            'base_equity': (float, none_type,),  # noqa: E501
            'transaction_value': (float, none_type,),  # noqa: E501
            'enterprise_value': (float, none_type,),  # noqa: E501
            'ann_offer_price_share': (float, none_type,),  # noqa: E501
            'buyer_exchange_ratio': (float, none_type,),  # noqa: E501
            'target_exchange_ratio': (float, none_type,),  # noqa: E501
            'cash_share': (float, none_type,),  # noqa: E501
            'stock_share': (float, none_type,),  # noqa: E501
            'choice': (bool, none_type,),  # noqa: E501
            'buyer_shares_issued': (float, none_type,),  # noqa: E501
            'percent_sought': (float, none_type,),  # noqa: E501
            'shares_sought': (float, none_type,),  # noqa: E501
            'shares_owned_prior': (float, none_type,),  # noqa: E501
            'premium1_day': (float, none_type,),  # noqa: E501
            'premium5_day': (float, none_type,),  # noqa: E501
            'premium30_day': (float, none_type,),  # noqa: E501
            'payment_method': ([str, none_type], none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'base_equity': 'baseEquity',  # noqa: E501
        'transaction_value': 'transactionValue',  # noqa: E501
        'enterprise_value': 'enterpriseValue',  # noqa: E501
        'ann_offer_price_share': 'annOfferPriceShare',  # noqa: E501
        'buyer_exchange_ratio': 'buyerExchangeRatio',  # noqa: E501
        'target_exchange_ratio': 'targetExchangeRatio',  # noqa: E501
        'cash_share': 'cashShare',  # noqa: E501
        'stock_share': 'stockShare',  # noqa: E501
        'choice': 'choice',  # noqa: E501
        'buyer_shares_issued': 'buyerSharesIssued',  # noqa: E501
        'percent_sought': 'percentSought',  # noqa: E501
        'shares_sought': 'sharesSought',  # noqa: E501
        'shares_owned_prior': 'sharesOwnedPrior',  # noqa: E501
        'premium1_day': 'premium1Day',  # noqa: E501
        'premium5_day': 'premium5Day',  # noqa: E501
        'premium30_day': 'premium30Day',  # noqa: E501
        'payment_method': 'paymentMethod',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """DealValue - a model defined in OpenAPI

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
            base_equity (float, none_type): The total value of cash and all other forms of payment made to the Target – commonly cash and/or stock, though the calculation can include other methods of payment (e.g., notes, convertible debt, preferred stock, etc.) if disclosed and calculable. In transactions where multiple forms of payment are being made (e.g., cash and stock), the individual consideration components are calculated separately and then summed to arrive at the total Base Equity Value (e.g., cash component + stock component). Amounts returned are in USD.. [optional]  # noqa: E501
            transaction_value (float, none_type): Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target's outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target's outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target's outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target's outstanding net debt. Amounts returned are in USD.. [optional]  # noqa: E501
            enterprise_value (float, none_type): The full value of the business acquired, using % sought to determine the value of 100% of the business if less than 100% was sought in the transaction. Amounts returned are in USD.. [optional]  # noqa: E501
            ann_offer_price_share (float, none_type): The current price offered for each share of target stock (including all forms of consideration). In a transaction in which the acquirer has increased or decrease the price they are offering on a per share basis from their original offer price, this item will always reflect the most current price per share being offered. Amounts returned are in USD.. [optional]  # noqa: E501
            buyer_exchange_ratio (float, none_type): Number of shares being issued by the acquirer to the target. Applicable only if the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Buyers Shares is 0.81.. [optional]  # noqa: E501
            target_exchange_ratio (float, none_type): Number of target shares the stock swap exchange ratio is based upon when the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Target Shares is 1.. [optional]  # noqa: E501
            cash_share (float, none_type): Portion of the current offer price per share to be paid in cash. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer's last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Cash ($) is 33. Amounts returned are in USD.. [optional]  # noqa: E501
            stock_share (float, none_type): Portion of the current offer price per share to be paid in the acquirer's stock. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer's last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Stock ($) is 17.19. Amounts returned are in USD.. [optional]  # noqa: E501
            choice (bool, none_type): Indicates if the acquirer is offering the target shareholders a choice of considerations (which is almost always a choice between selecting cash only, stock only or a mixture of cash and stock) for the specified deal identifier.. [optional]  # noqa: E501
            buyer_shares_issued (float, none_type): The number of shares issued by the buyer to the target as part of the payment.. [optional]  # noqa: E501
            percent_sought (float, none_type): The percentage of the target company's stock sought by the acquirer at the time the transaction was publicly announced.. [optional]  # noqa: E501
            shares_sought (float, none_type): The number of shares of the target company's stock sought by the acquirer at the time the transaction was publicly announced.. [optional]  # noqa: E501
            shares_owned_prior (float, none_type): The percent of the target company's shares owned by the buyer prior to the transaction.. [optional]  # noqa: E501
            premium1_day (float, none_type): The percentage difference between the price per share offered by the acquirer and the target's closing stock price 1 trading day prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.. [optional]  # noqa: E501
            premium5_day (float, none_type): The percentage difference between the price per share offered by the acquirer and the target's closing stock price 5 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.. [optional]  # noqa: E501
            premium30_day (float, none_type): The percentage difference between the price per share offered by the acquirer and the target's closing stock price 30 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.. [optional]  # noqa: E501
            payment_method ([str, none_type], none_type): Payment method/structure used in the transaction, including cash, stock, combination, or debt.. [optional]  # noqa: E501
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
        """DealValue - a model defined in OpenAPI

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
            base_equity (float, none_type): The total value of cash and all other forms of payment made to the Target – commonly cash and/or stock, though the calculation can include other methods of payment (e.g., notes, convertible debt, preferred stock, etc.) if disclosed and calculable. In transactions where multiple forms of payment are being made (e.g., cash and stock), the individual consideration components are calculated separately and then summed to arrive at the total Base Equity Value (e.g., cash component + stock component). Amounts returned are in USD.. [optional]  # noqa: E501
            transaction_value (float, none_type): Base Equity Value plus the value of the target’s outstanding net debt (where applicable). The target's outstanding net debt is defined as the total amount of short and long term interest-bearing debt less any cash and cash equivalents. The target's outstanding net debt will only be included in the Transaction Value calculation if a.) the acquirer is seeking to own 100% of the target, b.) the target is a non-financial company; and c.) the target's outstanding net debt is publicly disclosed (or the acquirer publicly states it is assuming a specific amount of liabilities). Otherwise, Transaction Value will be equal to the amount paid for the portion of the target acquired (Base Equity Value) and will exclude the target's outstanding net debt. Amounts returned are in USD.. [optional]  # noqa: E501
            enterprise_value (float, none_type): The full value of the business acquired, using % sought to determine the value of 100% of the business if less than 100% was sought in the transaction. Amounts returned are in USD.. [optional]  # noqa: E501
            ann_offer_price_share (float, none_type): The current price offered for each share of target stock (including all forms of consideration). In a transaction in which the acquirer has increased or decrease the price they are offering on a per share basis from their original offer price, this item will always reflect the most current price per share being offered. Amounts returned are in USD.. [optional]  # noqa: E501
            buyer_exchange_ratio (float, none_type): Number of shares being issued by the acquirer to the target. Applicable only if the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Buyers Shares is 0.81.. [optional]  # noqa: E501
            target_exchange_ratio (float, none_type): Number of target shares the stock swap exchange ratio is based upon when the acquirer is issuing stock in the transaction. For example, Express Scripts, Inc. acquired Medco Health Solutions, Inc. in April 2012 for $28.5 bil in cash and stock. Medco shareholders received $28.8 in cash and 0.81 Express Scripts shares for every share held. Here, Stock Exchange Ratio - Target Shares is 1.. [optional]  # noqa: E501
            cash_share (float, none_type): Portion of the current offer price per share to be paid in cash. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer's last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Cash ($) is 33. Amounts returned are in USD.. [optional]  # noqa: E501
            stock_share (float, none_type): Portion of the current offer price per share to be paid in the acquirer's stock. For example, Pfizer acquired Wyeth in 2009 for $66.8 in cash and stock. Pfizer paid $50.19 per share, comprised of $33 in cash and 0.985 shares of Pfizer stock (representing $17.19 based upon Pfizer's last closing stock price of $17.45 prior to announcement). Here, the Price/Share - Stock ($) is 17.19. Amounts returned are in USD.. [optional]  # noqa: E501
            choice (bool, none_type): Indicates if the acquirer is offering the target shareholders a choice of considerations (which is almost always a choice between selecting cash only, stock only or a mixture of cash and stock) for the specified deal identifier.. [optional]  # noqa: E501
            buyer_shares_issued (float, none_type): The number of shares issued by the buyer to the target as part of the payment.. [optional]  # noqa: E501
            percent_sought (float, none_type): The percentage of the target company's stock sought by the acquirer at the time the transaction was publicly announced.. [optional]  # noqa: E501
            shares_sought (float, none_type): The number of shares of the target company's stock sought by the acquirer at the time the transaction was publicly announced.. [optional]  # noqa: E501
            shares_owned_prior (float, none_type): The percent of the target company's shares owned by the buyer prior to the transaction.. [optional]  # noqa: E501
            premium1_day (float, none_type): The percentage difference between the price per share offered by the acquirer and the target's closing stock price 1 trading day prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.. [optional]  # noqa: E501
            premium5_day (float, none_type): The percentage difference between the price per share offered by the acquirer and the target's closing stock price 5 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.. [optional]  # noqa: E501
            premium30_day (float, none_type): The percentage difference between the price per share offered by the acquirer and the target's closing stock price 30 trading days prior to the announcement date. This data is only available if the target is a public company and the price/share is disclosed.. [optional]  # noqa: E501
            payment_method ([str, none_type], none_type): Payment method/structure used in the transaction, including cash, stock, combination, or debt.. [optional]  # noqa: E501
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
