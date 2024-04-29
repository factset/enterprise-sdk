"""
    EVENTS AND TRANSCRIPTS API

    <p>The Calendar Events API provides access to FactSet’s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>    # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.EventsandTranscripts.model_utils import (  # noqa: F401
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
from fds.sdk.EventsandTranscripts.exceptions import ApiAttributeError



class CompanyEventResponseObject(ModelNormal):
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
        ('event_type',): {
            'EARNINGS': "Earnings",
            'SALESREVENUECALL': "SalesRevenueCall",
            'GUIDANCECALL': "GuidanceCall",
            'ANALYSTSINVESTORSMEETING': "AnalystsInvestorsMeeting",
            'SHAREHOLDERSMEETING': "ShareholdersMeeting",
            'SPECIALSITUATION': "SpecialSituation",
            'CONFERENCEPRESENTATION': "ConferencePresentation",
            'CONFIRMEDEARNINGSRELEASE': "ConfirmedEarningsRelease",
            'SALESREVENUERELEASE': "SalesRevenueRelease",
            'PROJECTEDEARNINGSRELEASE': "ProjectedEarningsRelease",
            'SPLIT': "Split",
            'DIVIDEND': "Dividend",
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
            'ticker': (str,),  # noqa: E501
            'company_name': (str,),  # noqa: E501
            'description': (str,),  # noqa: E501
            'event_date_time': (datetime,),  # noqa: E501
            'market_time_code': (str,),  # noqa: E501
            'event_type': (str,),  # noqa: E501
            'event_id': (str,),  # noqa: E501
            'webcast_link': (str,),  # noqa: E501
            'ir_link': (str,),  # noqa: E501
            'fiscal_year': (str,),  # noqa: E501
            'fiscal_period': (str,),  # noqa: E501
            'contact_email': (str,),  # noqa: E501
            'contact_phone': (str,),  # noqa: E501
            'contact_name': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'ticker': 'ticker',  # noqa: E501
        'company_name': 'companyName',  # noqa: E501
        'description': 'description',  # noqa: E501
        'event_date_time': 'eventDateTime',  # noqa: E501
        'market_time_code': 'marketTimeCode',  # noqa: E501
        'event_type': 'eventType',  # noqa: E501
        'event_id': 'eventId',  # noqa: E501
        'webcast_link': 'webcastLink',  # noqa: E501
        'ir_link': 'irLink',  # noqa: E501
        'fiscal_year': 'fiscalYear',  # noqa: E501
        'fiscal_period': 'fiscalPeriod',  # noqa: E501
        'contact_email': 'contactEmail',  # noqa: E501
        'contact_phone': 'contactPhone',  # noqa: E501
        'contact_name': 'contactName',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """CompanyEventResponseObject - a model defined in OpenAPI

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
            ticker (str): Ticker-region identifier for the company hosting the event.. [optional]  # noqa: E501
            company_name (str): The official name of the company.. [optional]  # noqa: E501
            description (str): Brief description of the event.. [optional]  # noqa: E501
            event_date_time (datetime): Event start time as date/time string according to ISO 8601.. [optional]  # noqa: E501
            market_time_code (str): Timing code related to opening or closing of market.. [optional]  # noqa: E501
            event_type (str): Type/Category of the event based on a predefined list.. [optional]  # noqa: E501
            event_id (str): Unique identifier for the event.. [optional]  # noqa: E501
            webcast_link (str): Link to the webcast of the event.. [optional]  # noqa: E501
            ir_link (str): Link to the ir page of the company.. [optional]  # noqa: E501
            fiscal_year (str): The fiscal year of the company to which the event pertains.. [optional]  # noqa: E501
            fiscal_period (str): The fiscal period of the company to which the event pertains.. [optional]  # noqa: E501
            contact_email (str): Contact email for inquiries related to the event.. [optional]  # noqa: E501
            contact_phone (str): Contact phone number for inquiries related to the event.. [optional]  # noqa: E501
            contact_name (str): Name of the contact person for queries related to the event.. [optional]  # noqa: E501
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
        """CompanyEventResponseObject - a model defined in OpenAPI

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
            ticker (str): Ticker-region identifier for the company hosting the event.. [optional]  # noqa: E501
            company_name (str): The official name of the company.. [optional]  # noqa: E501
            description (str): Brief description of the event.. [optional]  # noqa: E501
            event_date_time (datetime): Event start time as date/time string according to ISO 8601.. [optional]  # noqa: E501
            market_time_code (str): Timing code related to opening or closing of market.. [optional]  # noqa: E501
            event_type (str): Type/Category of the event based on a predefined list.. [optional]  # noqa: E501
            event_id (str): Unique identifier for the event.. [optional]  # noqa: E501
            webcast_link (str): Link to the webcast of the event.. [optional]  # noqa: E501
            ir_link (str): Link to the ir page of the company.. [optional]  # noqa: E501
            fiscal_year (str): The fiscal year of the company to which the event pertains.. [optional]  # noqa: E501
            fiscal_period (str): The fiscal period of the company to which the event pertains.. [optional]  # noqa: E501
            contact_email (str): Contact email for inquiries related to the event.. [optional]  # noqa: E501
            contact_phone (str): Contact phone number for inquiries related to the event.. [optional]  # noqa: E501
            contact_name (str): Name of the contact person for queries related to the event.. [optional]  # noqa: E501
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
