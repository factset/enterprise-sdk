"""
    Signals API

    Collection of endpoints for providing Signal Events, Definitions and Metadata  # noqa: E501

    The version of the OpenAPI document: 2.5.0
    Contact: signals.api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.Signals.model_utils import (  # noqa: F401
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
from fds.sdk.Signals.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.Signals.model.date_time_interval import DateTimeInterval
    from fds.sdk.Signals.model.relevance_score_range import RelevanceScoreRange
    globals()['DateTimeInterval'] = DateTimeInterval
    globals()['RelevanceScoreRange'] = RelevanceScoreRange


class EventRequestBody(ModelNormal):
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
            'created': (bool, date, datetime, dict, float, int, list, str, none_type,),  # noqa: E501
            'updated': (bool, date, datetime, dict, float, int, list, str, none_type,),  # noqa: E501
            'signal_ids': (str,),  # noqa: E501
            'ids': (str,),  # noqa: E501
            'portfolios': (str,),  # noqa: E501
            'themes': (str,),  # noqa: E501
            'categories': (str,),  # noqa: E501
            'user_relevance_score': (bool, date, datetime, dict, float, int, list, str, none_type,),  # noqa: E501
            'sort': (str,),  # noqa: E501
            'resolve_identifiers': (bool,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'created': 'created',  # noqa: E501
        'updated': 'updated',  # noqa: E501
        'signal_ids': 'signalIds',  # noqa: E501
        'ids': 'ids',  # noqa: E501
        'portfolios': 'portfolios',  # noqa: E501
        'themes': 'themes',  # noqa: E501
        'categories': 'categories',  # noqa: E501
        'user_relevance_score': 'userRelevanceScore',  # noqa: E501
        'sort': 'sort',  # noqa: E501
        'resolve_identifiers': 'resolveIdentifiers',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """EventRequestBody - a model defined in OpenAPI

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
            created (bool, date, datetime, dict, float, int, list, str, none_type): A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.. [optional]  # noqa: E501
            updated (bool, date, datetime, dict, float, int, list, str, none_type): A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 24 hours if omitted.. [optional]  # noqa: E501
            signal_ids (str): Comma delimited string of signalIds. [optional]  # noqa: E501
            ids (str): Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. Only the first 1,000 ids are processed. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.. [optional]  # noqa: E501
            portfolios (str): Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb. [optional]  # noqa: E501
            themes (str): Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.. [optional]  # noqa: E501
            categories (str): Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.. [optional]  # noqa: E501
            user_relevance_score (bool, date, datetime, dict, float, int, list, str, none_type): A range for filtering signal events based on their relevancy score.. [optional]  # noqa: E501
            sort (str): Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending.. [optional]  # noqa: E501
            resolve_identifiers (bool): The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers.. [optional]  # noqa: E501
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
        """EventRequestBody - a model defined in OpenAPI

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
            created (bool, date, datetime, dict, float, int, list, str, none_type): A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.. [optional]  # noqa: E501
            updated (bool, date, datetime, dict, float, int, list, str, none_type): A date/time (UTC) interval for filtering signal events based on their last updated date. Defaults to NOW - 24 hours if omitted.. [optional]  # noqa: E501
            signal_ids (str): Comma delimited string of signalIds. [optional]  # noqa: E501
            ids (str): Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. Only the first 1,000 ids are processed. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.. [optional]  # noqa: E501
            portfolios (str): Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb. [optional]  # noqa: E501
            themes (str): Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.. [optional]  # noqa: E501
            categories (str): Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.. [optional]  # noqa: E501
            user_relevance_score (bool, date, datetime, dict, float, int, list, str, none_type): A range for filtering signal events based on their relevancy score.. [optional]  # noqa: E501
            sort (str): Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending.. [optional]  # noqa: E501
            resolve_identifiers (bool): The api will return resolved identifiers in the meta section of the response by default (true). If the parameter is false, the api will not attempt to resolve the identifiers.. [optional]  # noqa: E501
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
