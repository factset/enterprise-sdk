"""
    FactSet Estimates

    With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml)   # noqa: E501

    The version of the OpenAPI document: 2.7.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetEstimates.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetEstimates.exceptions import ApiAttributeError



class SegmentActuals(ModelNormal):
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
        ('segment_actual_type',): {
            'None': None,
            'COMPANY': "company",
            'EUROPEAN': "european",
            'BROKER': "broker",


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
            'request_id': (str,),  # noqa: E501
            'fsym_id': (str, none_type,),  # noqa: E501
            'metric': (str, none_type,),  # noqa: E501
            'periodicity': (str, none_type,),  # noqa: E501
            'fiscal_year': (int, none_type,),  # noqa: E501
            'fiscal_period': (int, none_type,),  # noqa: E501
            'fiscal_end_date': (date, none_type,),  # noqa: E501
            'segment_type': (str, none_type,),  # noqa: E501
            'segment_label': (str, none_type,),  # noqa: E501
            'segment_level': (str, none_type,),  # noqa: E501
            'segment_actual_value': (float, none_type,),  # noqa: E501
            'segment_actual_type': (str, none_type,),  # noqa: E501
            'report_date': (date, none_type,),  # noqa: E501
            'currency': (str, none_type,),  # noqa: E501
            'estimate_currency': (str, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'request_id': 'requestId',  # noqa: E501
        'fsym_id': 'fsymId',  # noqa: E501
        'metric': 'metric',  # noqa: E501
        'periodicity': 'periodicity',  # noqa: E501
        'fiscal_year': 'fiscalYear',  # noqa: E501
        'fiscal_period': 'fiscalPeriod',  # noqa: E501
        'fiscal_end_date': 'fiscalEndDate',  # noqa: E501
        'segment_type': 'segmentType',  # noqa: E501
        'segment_label': 'segmentLabel',  # noqa: E501
        'segment_level': 'segmentLevel',  # noqa: E501
        'segment_actual_value': 'segmentActualValue',  # noqa: E501
        'segment_actual_type': 'segmentActualType',  # noqa: E501
        'report_date': 'reportDate',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'estimate_currency': 'estimateCurrency',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """SegmentActuals - a model defined in OpenAPI

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
            request_id (str): Identifier that was used for the request.. [optional]  # noqa: E501
            fsym_id (str, none_type): FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.. [optional]  # noqa: E501
            metric (str, none_type): Company's Financial statement 'metric' that is estimated. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).. [optional]  # noqa: E501
            periodicity (str, none_type): The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List = ANN, QTR, SEMI, LTMA, or NMTA.. [optional]  # noqa: E501
            fiscal_year (int, none_type): Company's 'fiscal year' for the estimate record. [optional]  # noqa: E501
            fiscal_period (int, none_type): Company's 'fiscal period' for the estimate record.  'Periodicity' defines context for period.. [optional]  # noqa: E501
            fiscal_end_date (date, none_type): Company's 'fiscal year' for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598). [optional]  # noqa: E501
            segment_type (str, none_type): Type of segment requested.   * **BUS** = Business / Product Segment   * **GEO** = Geographic Segment . [optional]  # noqa: E501
            segment_label (str, none_type): Displays the specific label of the segment.. [optional]  # noqa: E501
            segment_level (str, none_type): Returns the level of the segment item as either P = Parent or S = Subordinate. [optional]  # noqa: E501
            segment_actual_value (float, none_type): Actual value of the specified segment for the requested metric.. [optional]  # noqa: E501
            segment_actual_type (str, none_type): The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company's press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).    . [optional]  # noqa: E501
            report_date (date, none_type): Date at which Actual has been reported and/or fiscal period has rolled.. [optional]  # noqa: E501
            currency (str, none_type): Currency code for adjusting the data. Use 'ESTIMATE' as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).. [optional]  # noqa: E501
            estimate_currency (str, none_type): Estimate currency of the requested Security. [optional]  # noqa: E501
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
        """SegmentActuals - a model defined in OpenAPI

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
            request_id (str): Identifier that was used for the request.. [optional]  # noqa: E501
            fsym_id (str, none_type): FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.. [optional]  # noqa: E501
            metric (str, none_type): Company's Financial statement 'metric' that is estimated. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).. [optional]  # noqa: E501
            periodicity (str, none_type): The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List = ANN, QTR, SEMI, LTMA, or NMTA.. [optional]  # noqa: E501
            fiscal_year (int, none_type): Company's 'fiscal year' for the estimate record. [optional]  # noqa: E501
            fiscal_period (int, none_type): Company's 'fiscal period' for the estimate record.  'Periodicity' defines context for period.. [optional]  # noqa: E501
            fiscal_end_date (date, none_type): Company's 'fiscal year' for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598). [optional]  # noqa: E501
            segment_type (str, none_type): Type of segment requested.   * **BUS** = Business / Product Segment   * **GEO** = Geographic Segment . [optional]  # noqa: E501
            segment_label (str, none_type): Displays the specific label of the segment.. [optional]  # noqa: E501
            segment_level (str, none_type): Returns the level of the segment item as either P = Parent or S = Subordinate. [optional]  # noqa: E501
            segment_actual_value (float, none_type): Actual value of the specified segment for the requested metric.. [optional]  # noqa: E501
            segment_actual_type (str, none_type): The type of actual returned. The following is returned:   * **Company Actual**. This is collected directly from a company’s press release for the corresponding past period.    * **European Actual**. This is also collected directly from a company's press release before January 2017 for European countries. However, **Company Actual ** is used from 2017 onwards to fetch actual irrespective of country or listing.   * **Broker Actual**. A broker actual is a median consensus that can be updated up to 100 days post the fiscal period’s report date. Broker actuals are a post-event only consensus if a report date is collected from an earnings release, unless no brokers have contributed to the post-event consensus yet, in which case the broker actual will be a pre-event consensus.  The broker actual is a pre and post event consensus if the report date is a calculation  For more details on the actual types, visit [Online Assistant Page #13379](https://my.apps.factset.com/oa/pages/13379).    . [optional]  # noqa: E501
            report_date (date, none_type): Date at which Actual has been reported and/or fiscal period has rolled.. [optional]  # noqa: E501
            currency (str, none_type): Currency code for adjusting the data. Use 'ESTIMATE' as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).. [optional]  # noqa: E501
            estimate_currency (str, none_type): Estimate currency of the requested Security. [optional]  # noqa: E501
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
