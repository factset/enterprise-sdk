"""
    EVENTS AND TRANSCRIPTS API

    <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>    # noqa: E501

    The version of the OpenAPI document: 1.1.0
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



class EventsAudioDailyObjectOne(ModelNormal):
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
        ('source_code',): {
            'WEBCAST': "Webcast",
            'VENDOR': "Vendor",
            'WEBCASTREPLAY': "WebcastReplay",
            'FLASH': "Flash",
            'REPLAY': "Replay",
            'PHONE': "Phone",


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
            'report_id': (int,),  # noqa: E501
            'file_name': (str,),  # noqa: E501
            'url': (str,),  # noqa: E501
            'file_size': (float,),  # noqa: E501
            'audio_source_id': (int, none_type,),  # noqa: E501
            'ticker': (str, none_type,),  # noqa: E501
            'entity_id': (str,),  # noqa: E501
            'source_code': (str,),  # noqa: E501
            'trimmed': (bool,),  # noqa: E501
            'duration_secs': (float, none_type,),  # noqa: E501
            'start_offset_seconds': (float, none_type,),  # noqa: E501
            'end_offset_seconds': (float, none_type,),  # noqa: E501
            'start_time': (str, none_type,),  # noqa: E501
            'end_time': (str, none_type,),  # noqa: E501
            'upload_time': (str, none_type,),  # noqa: E501
            'sample_rate': (float, none_type,),  # noqa: E501
            'bitrate': (float, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'report_id': 'reportId',  # noqa: E501
        'file_name': 'fileName',  # noqa: E501
        'url': 'url',  # noqa: E501
        'file_size': 'fileSize',  # noqa: E501
        'audio_source_id': 'audioSourceId',  # noqa: E501
        'ticker': 'ticker',  # noqa: E501
        'entity_id': 'entityId',  # noqa: E501
        'source_code': 'sourceCode',  # noqa: E501
        'trimmed': 'trimmed',  # noqa: E501
        'duration_secs': 'durationSecs',  # noqa: E501
        'start_offset_seconds': 'startOffsetSeconds',  # noqa: E501
        'end_offset_seconds': 'endOffsetSeconds',  # noqa: E501
        'start_time': 'startTime',  # noqa: E501
        'end_time': 'endTime',  # noqa: E501
        'upload_time': 'uploadTime',  # noqa: E501
        'sample_rate': 'sampleRate',  # noqa: E501
        'bitrate': 'bitrate',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """EventsAudioDailyObjectOne - a model defined in OpenAPI

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
            report_id (int): The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.. [optional]  # noqa: E501
            file_name (str): The filename of the audio file.. [optional]  # noqa: E501
            url (str): A pre-signed URL that allows downloading the audio file, expiring after 24 hours.. [optional]  # noqa: E501
            file_size (float): Size of the Audio file, in bytes.. [optional]  # noqa: E501
            audio_source_id (int, none_type): Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.. [optional]  # noqa: E501
            ticker (str, none_type): Ticker-region identifier for the company hosting the event.. [optional]  # noqa: E501
            entity_id (str): FactSet entity level identifier for the company hosting the event.. [optional]  # noqa: E501
            source_code (str): This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay. [optional]  # noqa: E501
            trimmed (bool):  The trimmed attribute indicates whether the audio is the trimmed version. If `sourceCode` is set to vendor, this attribute will always be true.    . [optional]  # noqa: E501
            duration_secs (float, none_type): Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.. [optional]  # noqa: E501
            start_offset_seconds (float, none_type): The delta in seconds between start of audio file to when FactSet marks the beginning of the call.. [optional]  # noqa: E501
            end_offset_seconds (float, none_type): The delta in seconds between startTime to when FactSet marks the end of the call.. [optional]  # noqa: E501
            start_time (str, none_type): The official timestamp when FactSet begins the recording.. [optional]  # noqa: E501
            end_time (str, none_type): The official timestamp when FactSet ends the recording.. [optional]  # noqa: E501
            upload_time (str, none_type): The official timestamp when FactSet publishes the audio file externally.. [optional]  # noqa: E501
            sample_rate (float, none_type): The number of samples of audio carried per second in Kbps.. [optional]  # noqa: E501
            bitrate (float, none_type): The total number of bits of information stored per second of sound in Kbps.. [optional]  # noqa: E501
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
        """EventsAudioDailyObjectOne - a model defined in OpenAPI

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
            report_id (int): The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.. [optional]  # noqa: E501
            file_name (str): The filename of the audio file.. [optional]  # noqa: E501
            url (str): A pre-signed URL that allows downloading the audio file, expiring after 24 hours.. [optional]  # noqa: E501
            file_size (float): Size of the Audio file, in bytes.. [optional]  # noqa: E501
            audio_source_id (int, none_type): Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.. [optional]  # noqa: E501
            ticker (str, none_type): Ticker-region identifier for the company hosting the event.. [optional]  # noqa: E501
            entity_id (str): FactSet entity level identifier for the company hosting the event.. [optional]  # noqa: E501
            source_code (str): This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay. [optional]  # noqa: E501
            trimmed (bool):  The trimmed attribute indicates whether the audio is the trimmed version. If `sourceCode` is set to vendor, this attribute will always be true.    . [optional]  # noqa: E501
            duration_secs (float, none_type): Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.. [optional]  # noqa: E501
            start_offset_seconds (float, none_type): The delta in seconds between start of audio file to when FactSet marks the beginning of the call.. [optional]  # noqa: E501
            end_offset_seconds (float, none_type): The delta in seconds between startTime to when FactSet marks the end of the call.. [optional]  # noqa: E501
            start_time (str, none_type): The official timestamp when FactSet begins the recording.. [optional]  # noqa: E501
            end_time (str, none_type): The official timestamp when FactSet ends the recording.. [optional]  # noqa: E501
            upload_time (str, none_type): The official timestamp when FactSet publishes the audio file externally.. [optional]  # noqa: E501
            sample_rate (float, none_type): The number of samples of audio carried per second in Kbps.. [optional]  # noqa: E501
            bitrate (float, none_type): The total number of bits of information stored per second of sound in Kbps.. [optional]  # noqa: E501
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
