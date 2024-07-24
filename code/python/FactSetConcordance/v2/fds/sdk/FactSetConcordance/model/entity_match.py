"""
    FactSet Concordance API

      The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)      # noqa: E501

    The version of the OpenAPI document: 2.8.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetConcordance.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetConcordance.exceptions import ApiAttributeError



class EntityMatch(ModelNormal):
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
        ('map_status',): {
            'None': None,
            'MAPPED': "MAPPED",
            'UNMAPPED': "UNMAPPED",
            'INDETERMINATE': "INDETERMINATE",


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
            'task_id': (int, none_type,),  # noqa: E501
            'universe_id': (int, none_type,),  # noqa: E501
            'client_id': (str, none_type,),  # noqa: E501
            'client_bbg_figi': (str, none_type,),  # noqa: E501
            'client_bbg_ticker': (str, none_type,),  # noqa: E501
            'client_bic': (str, none_type,),  # noqa: E501
            'client_cik': (str, none_type,),  # noqa: E501
            'client_country': (str, none_type,),  # noqa: E501
            'client_crd': (str, none_type,),  # noqa: E501
            'client_cusip': (str, none_type,),  # noqa: E501
            'client_duns': (str, none_type,),  # noqa: E501
            'client_ein': (str, none_type,),  # noqa: E501
            'client_factset_id': (str, none_type,),  # noqa: E501
            'client_fitch': (str, none_type,),  # noqa: E501
            'client_gvkey': (str, none_type,),  # noqa: E501
            'client_gvkey_iid': (str, none_type,),  # noqa: E501
            'client_isin': (str, none_type,),  # noqa: E501
            'client_jcn': (str, none_type,),  # noqa: E501
            'client_lei': (str, none_type,),  # noqa: E501
            'client_lxid': (str, none_type,),  # noqa: E501
            'client_md': (str, none_type,),  # noqa: E501
            'client_name': (str, none_type,),  # noqa: E501
            'client_priority': (str, none_type,),  # noqa: E501
            'client_red_code': (str, none_type,),  # noqa: E501
            'client_rssd': (str, none_type,),  # noqa: E501
            'client_sedol': (str, none_type,),  # noqa: E501
            'client_spr': (str, none_type,),  # noqa: E501
            'client_state': (str, none_type,),  # noqa: E501
            'client_ticker': (str, none_type,),  # noqa: E501
            'client_ticker_exchange': (str, none_type,),  # noqa: E501
            'client_ticker_region': (str, none_type,),  # noqa: E501
            'client_ukch': (str, none_type,),  # noqa: E501
            'client_url': (str, none_type,),  # noqa: E501
            'client_valoren': (str, none_type,),  # noqa: E501
            'client_wkn': (str, none_type,),  # noqa: E501
            'client_additional_context': ({str: (str,)},),  # noqa: E501
            'symbol_match_type': (str, none_type,),  # noqa: E501
            'row_index': (int, none_type,),  # noqa: E501
            'match_flag': (bool, none_type,),  # noqa: E501
            'entity_id': (str, none_type,),  # noqa: E501
            'entity_name': (str, none_type,),  # noqa: E501
            'url': (str, none_type,),  # noqa: E501
            'map_status': (str, none_type,),  # noqa: E501
            'similarity_score': (float, none_type,),  # noqa: E501
            'confidence_score': (float, none_type,),  # noqa: E501
            'country_code': (str, none_type,),  # noqa: E501
            'country_name': (str, none_type,),  # noqa: E501
            'state_code': (str, none_type,),  # noqa: E501
            'state_name': (str, none_type,),  # noqa: E501
            'sic_code': (str, none_type,),  # noqa: E501
            'entity_type_code': (str, none_type,),  # noqa: E501
            'entity_type_description': (str, none_type,),  # noqa: E501
            'entity_sub_type_code': (str, none_type,),  # noqa: E501
            'location_city': (str, none_type,),  # noqa: E501
            'region_name': (str, none_type,),  # noqa: E501
            'factset_industry_code': (str, none_type,),  # noqa: E501
            'factset_industry_name': (str, none_type,),  # noqa: E501
            'factset_sector_code': (str, none_type,),  # noqa: E501
            'factset_sector_name': (str, none_type,),  # noqa: E501
            'parent_name': (str, none_type,),  # noqa: E501
            'parent_match_flag': (bool, none_type,),  # noqa: E501
            'name_match_string': (str, none_type,),  # noqa: E501
            'name_match_source': (str, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'task_id': 'taskId',  # noqa: E501
        'universe_id': 'universeId',  # noqa: E501
        'client_id': 'clientId',  # noqa: E501
        'client_bbg_figi': 'clientBbgFigi',  # noqa: E501
        'client_bbg_ticker': 'clientBbgTicker',  # noqa: E501
        'client_bic': 'clientBic',  # noqa: E501
        'client_cik': 'clientCik',  # noqa: E501
        'client_country': 'clientCountry',  # noqa: E501
        'client_crd': 'clientCrd',  # noqa: E501
        'client_cusip': 'clientCusip',  # noqa: E501
        'client_duns': 'clientDuns',  # noqa: E501
        'client_ein': 'clientEin',  # noqa: E501
        'client_factset_id': 'clientFactsetId',  # noqa: E501
        'client_fitch': 'clientFitch',  # noqa: E501
        'client_gvkey': 'clientGvkey',  # noqa: E501
        'client_gvkey_iid': 'clientGvkeyIid',  # noqa: E501
        'client_isin': 'clientIsin',  # noqa: E501
        'client_jcn': 'clientJcn',  # noqa: E501
        'client_lei': 'clientLei',  # noqa: E501
        'client_lxid': 'clientLxid',  # noqa: E501
        'client_md': 'clientMd',  # noqa: E501
        'client_name': 'clientName',  # noqa: E501
        'client_priority': 'clientPriority',  # noqa: E501
        'client_red_code': 'clientRedCode',  # noqa: E501
        'client_rssd': 'clientRssd',  # noqa: E501
        'client_sedol': 'clientSedol',  # noqa: E501
        'client_spr': 'clientSpr',  # noqa: E501
        'client_state': 'clientState',  # noqa: E501
        'client_ticker': 'clientTicker',  # noqa: E501
        'client_ticker_exchange': 'clientTickerExchange',  # noqa: E501
        'client_ticker_region': 'clientTickerRegion',  # noqa: E501
        'client_ukch': 'clientUkch',  # noqa: E501
        'client_url': 'clientUrl',  # noqa: E501
        'client_valoren': 'clientValoren',  # noqa: E501
        'client_wkn': 'clientWkn',  # noqa: E501
        'client_additional_context': 'clientAdditionalContext',  # noqa: E501
        'symbol_match_type': 'symbolMatchType',  # noqa: E501
        'row_index': 'rowIndex',  # noqa: E501
        'match_flag': 'matchFlag',  # noqa: E501
        'entity_id': 'entityId',  # noqa: E501
        'entity_name': 'entityName',  # noqa: E501
        'url': 'url',  # noqa: E501
        'map_status': 'mapStatus',  # noqa: E501
        'similarity_score': 'similarityScore',  # noqa: E501
        'confidence_score': 'confidenceScore',  # noqa: E501
        'country_code': 'countryCode',  # noqa: E501
        'country_name': 'countryName',  # noqa: E501
        'state_code': 'stateCode',  # noqa: E501
        'state_name': 'stateName',  # noqa: E501
        'sic_code': 'sicCode',  # noqa: E501
        'entity_type_code': 'entityTypeCode',  # noqa: E501
        'entity_type_description': 'entityTypeDescription',  # noqa: E501
        'entity_sub_type_code': 'entitySubTypeCode',  # noqa: E501
        'location_city': 'locationCity',  # noqa: E501
        'region_name': 'regionName',  # noqa: E501
        'factset_industry_code': 'factsetIndustryCode',  # noqa: E501
        'factset_industry_name': 'factsetIndustryName',  # noqa: E501
        'factset_sector_code': 'factsetSectorCode',  # noqa: E501
        'factset_sector_name': 'factsetSectorName',  # noqa: E501
        'parent_name': 'parentName',  # noqa: E501
        'parent_match_flag': 'parentMatchFlag',  # noqa: E501
        'name_match_string': 'nameMatchString',  # noqa: E501
        'name_match_source': 'nameMatchSource',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """EntityMatch - a model defined in OpenAPI

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
            task_id (int, none_type): Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \"Bulk\" workflow. . [optional]  # noqa: E501
            universe_id (int, none_type): The id of the universe that entities should be mapped to. [optional]  # noqa: E501
            client_id (str, none_type): Unique Identifer provided by the user in the request to represent the entity Name being requested.. [optional]  # noqa: E501
            client_bbg_figi (str, none_type): Name of the column as provided by the user -  Bloomberg Listing/Regional/Security ID.. [optional]  # noqa: E501
            client_bbg_ticker (str, none_type): Name of the column as provided by the user -  Bloomberg Listing and Regional Ticker.. [optional]  # noqa: E501
            client_bic (str, none_type): Name of the column as provided by the user - BICCode, bank indentification code. [optional]  # noqa: E501
            client_cik (str, none_type): Name of the column as provided by the user -  CIK, Edgar Central Index Keys. [optional]  # noqa: E501
            client_country (str, none_type): ISO2 country code specified in the request.. [optional]  # noqa: E501
            client_crd (str, none_type): Name of the column as provided by the user -  CRD, Central Registration Depository. [optional]  # noqa: E501
            client_cusip (str, none_type): Name of the column as provided by the user -  CUSIP.. [optional]  # noqa: E501
            client_duns (str, none_type): Name of the column as provided by the user -  DUNS, Dun&Bradstreet.. [optional]  # noqa: E501
            client_ein (str, none_type): Name of the column as provided by the user -  EmployerIdentificationNumber, EIN.. [optional]  # noqa: E501
            client_factset_id (str, none_type): Name of the column as provided by the user -  FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.. [optional]  # noqa: E501
            client_fitch (str, none_type): Name of the column as provided by the user -  FitchCreditRating, Fitch Ratings Identifier.. [optional]  # noqa: E501
            client_gvkey (str, none_type): Name of the column as provided by the user -  GVKEY, Compustat Global Company Key.. [optional]  # noqa: E501
            client_gvkey_iid (str, none_type): Name of the column as provided by the user -  GVKEY+IID, Compustat Global Company Key and Issue Identifier.. [optional]  # noqa: E501
            client_isin (str, none_type): Name of the column as provided by the user -  ISIN.. [optional]  # noqa: E501
            client_jcn (str, none_type): Name of the column as provided by the user -  JCN , Japanese Corporate Number.. [optional]  # noqa: E501
            client_lei (str, none_type): Name of the column as provided by the user -  LegalEntityIdentifier, LEI.. [optional]  # noqa: E501
            client_lxid (str, none_type): Name of the column as provided by the user -  LXID, Markit Syndicated Loan Identifier.. [optional]  # noqa: E501
            client_md (str, none_type): Name of the column as provided by the user -  MoodysIssuer, Moody's Ratings Identifier.. [optional]  # noqa: E501
            client_name (str, none_type): Name of the entity to match as specified in the request. [optional]  # noqa: E501
            client_priority (str, none_type): Name of the priority column as provided by the user.. [optional]  # noqa: E501
            client_red_code (str, none_type): Name of the column as provided by the user -  RedCode, Markit Reference Entity Identifier.. [optional]  # noqa: E501
            client_rssd (str, none_type): Name of the column as provided by the user -  FederalReserveRSSDIdentifier, RSSD.. [optional]  # noqa: E501
            client_sedol (str, none_type): Name of the column as provided by the user -  SEDOL.. [optional]  # noqa: E501
            client_spr (str, none_type): Name of the column as provided by the user -  S&PRating, S&P Ratings Identifier.. [optional]  # noqa: E501
            client_state (str, none_type): State code specified in the request.. [optional]  # noqa: E501
            client_ticker (str, none_type): Name of the column as provided by the user -  PriceTicker.. [optional]  # noqa: E501
            client_ticker_exchange (str, none_type): Name of the column as provided by the user -  TickerExch.. [optional]  # noqa: E501
            client_ticker_region (str, none_type): Name of the column as provided by the user -  TickerRegion. [optional]  # noqa: E501
            client_ukch (str, none_type): Name of the column as provided by the user -  UKCompanyHouse. [optional]  # noqa: E501
            client_url (str, none_type): URL specified in the request.. [optional]  # noqa: E501
            client_valoren (str, none_type): Name of the column as provided by the user -  VALOR, Valoren (\"Valor\") Identification.. [optional]  # noqa: E501
            client_wkn (str, none_type): Name of the column as provided by the user -  WKN, German Securities Identification.. [optional]  # noqa: E501
            client_additional_context ({str: (str,)}): Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records. . [optional]  # noqa: E501
            symbol_match_type (str, none_type): Source type of the Symbol that matched. [optional]  # noqa: E501
            row_index (int, none_type): Row number for match in the request or input file.. [optional]  # noqa: E501
            match_flag (bool, none_type): Flag denoting if the row is a match.. [optional]  # noqa: E501
            entity_id (str, none_type): FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) . [optional]  # noqa: E501
            entity_name (str, none_type): Full name corresponding to the matched entity.. [optional]  # noqa: E501
            url (str, none_type): URL of the matched entity.. [optional]  # noqa: E501
            map_status (str, none_type): Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. . [optional]  # noqa: E501
            similarity_score (float, none_type): Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. . [optional]  # noqa: E501
            confidence_score (float, none_type): Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. . [optional]  # noqa: E501
            country_code (str, none_type): ISO2 country code corresponding to the location of the matched entity.. [optional]  # noqa: E501
            country_name (str, none_type): Country name corresponding to the location of the matched entity. [optional]  # noqa: E501
            state_code (str, none_type): Two character state code corresponding to the location of the matched entity.. [optional]  # noqa: E501
            state_name (str, none_type): State name corresponding to the location of the matched entity.. [optional]  # noqa: E501
            sic_code (str, none_type): Standard Industrial Classification (SIC) Code of the matched entity.. [optional]  # noqa: E501
            entity_type_code (str, none_type): Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.. [optional]  # noqa: E501
            entity_type_description (str, none_type): Description of of the matched entity's type.. [optional]  # noqa: E501
            entity_sub_type_code (str, none_type): Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.. [optional]  # noqa: E501
            location_city (str, none_type): City where the matched entity is located.. [optional]  # noqa: E501
            region_name (str, none_type): Region where the matched entity is located.. [optional]  # noqa: E501
            factset_industry_code (str, none_type): FactSet Industry Classification Code of the matched entity.. [optional]  # noqa: E501
            factset_industry_name (str, none_type): Name of the matched entity's FactSet Industry Classification.. [optional]  # noqa: E501
            factset_sector_code (str, none_type): Name of the matched entity's FactSet Sector Classification Code.. [optional]  # noqa: E501
            factset_sector_name (str, none_type): Name of the matched entity's FactSet Sector Classification.. [optional]  # noqa: E501
            parent_name (str, none_type): Name of the matched entity's parent entity.. [optional]  # noqa: E501
            parent_match_flag (bool, none_type): Flag denoting that the matched entity is the parent of another match.. [optional]  # noqa: E501
            name_match_string (str, none_type): String on which the Concordance algorithm mapped the submitted entity.. [optional]  # noqa: E501
            name_match_source (str, none_type): Type of name that the nameMatchString matched.. [optional]  # noqa: E501
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
        """EntityMatch - a model defined in OpenAPI

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
            task_id (int, none_type): Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \"Bulk\" workflow. . [optional]  # noqa: E501
            universe_id (int, none_type): The id of the universe that entities should be mapped to. [optional]  # noqa: E501
            client_id (str, none_type): Unique Identifer provided by the user in the request to represent the entity Name being requested.. [optional]  # noqa: E501
            client_bbg_figi (str, none_type): Name of the column as provided by the user -  Bloomberg Listing/Regional/Security ID.. [optional]  # noqa: E501
            client_bbg_ticker (str, none_type): Name of the column as provided by the user -  Bloomberg Listing and Regional Ticker.. [optional]  # noqa: E501
            client_bic (str, none_type): Name of the column as provided by the user - BICCode, bank indentification code. [optional]  # noqa: E501
            client_cik (str, none_type): Name of the column as provided by the user -  CIK, Edgar Central Index Keys. [optional]  # noqa: E501
            client_country (str, none_type): ISO2 country code specified in the request.. [optional]  # noqa: E501
            client_crd (str, none_type): Name of the column as provided by the user -  CRD, Central Registration Depository. [optional]  # noqa: E501
            client_cusip (str, none_type): Name of the column as provided by the user -  CUSIP.. [optional]  # noqa: E501
            client_duns (str, none_type): Name of the column as provided by the user -  DUNS, Dun&Bradstreet.. [optional]  # noqa: E501
            client_ein (str, none_type): Name of the column as provided by the user -  EmployerIdentificationNumber, EIN.. [optional]  # noqa: E501
            client_factset_id (str, none_type): Name of the column as provided by the user -  FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.. [optional]  # noqa: E501
            client_fitch (str, none_type): Name of the column as provided by the user -  FitchCreditRating, Fitch Ratings Identifier.. [optional]  # noqa: E501
            client_gvkey (str, none_type): Name of the column as provided by the user -  GVKEY, Compustat Global Company Key.. [optional]  # noqa: E501
            client_gvkey_iid (str, none_type): Name of the column as provided by the user -  GVKEY+IID, Compustat Global Company Key and Issue Identifier.. [optional]  # noqa: E501
            client_isin (str, none_type): Name of the column as provided by the user -  ISIN.. [optional]  # noqa: E501
            client_jcn (str, none_type): Name of the column as provided by the user -  JCN , Japanese Corporate Number.. [optional]  # noqa: E501
            client_lei (str, none_type): Name of the column as provided by the user -  LegalEntityIdentifier, LEI.. [optional]  # noqa: E501
            client_lxid (str, none_type): Name of the column as provided by the user -  LXID, Markit Syndicated Loan Identifier.. [optional]  # noqa: E501
            client_md (str, none_type): Name of the column as provided by the user -  MoodysIssuer, Moody's Ratings Identifier.. [optional]  # noqa: E501
            client_name (str, none_type): Name of the entity to match as specified in the request. [optional]  # noqa: E501
            client_priority (str, none_type): Name of the priority column as provided by the user.. [optional]  # noqa: E501
            client_red_code (str, none_type): Name of the column as provided by the user -  RedCode, Markit Reference Entity Identifier.. [optional]  # noqa: E501
            client_rssd (str, none_type): Name of the column as provided by the user -  FederalReserveRSSDIdentifier, RSSD.. [optional]  # noqa: E501
            client_sedol (str, none_type): Name of the column as provided by the user -  SEDOL.. [optional]  # noqa: E501
            client_spr (str, none_type): Name of the column as provided by the user -  S&PRating, S&P Ratings Identifier.. [optional]  # noqa: E501
            client_state (str, none_type): State code specified in the request.. [optional]  # noqa: E501
            client_ticker (str, none_type): Name of the column as provided by the user -  PriceTicker.. [optional]  # noqa: E501
            client_ticker_exchange (str, none_type): Name of the column as provided by the user -  TickerExch.. [optional]  # noqa: E501
            client_ticker_region (str, none_type): Name of the column as provided by the user -  TickerRegion. [optional]  # noqa: E501
            client_ukch (str, none_type): Name of the column as provided by the user -  UKCompanyHouse. [optional]  # noqa: E501
            client_url (str, none_type): URL specified in the request.. [optional]  # noqa: E501
            client_valoren (str, none_type): Name of the column as provided by the user -  VALOR, Valoren (\"Valor\") Identification.. [optional]  # noqa: E501
            client_wkn (str, none_type): Name of the column as provided by the user -  WKN, German Securities Identification.. [optional]  # noqa: E501
            client_additional_context ({str: (str,)}): Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records. . [optional]  # noqa: E501
            symbol_match_type (str, none_type): Source type of the Symbol that matched. [optional]  # noqa: E501
            row_index (int, none_type): Row number for match in the request or input file.. [optional]  # noqa: E501
            match_flag (bool, none_type): Flag denoting if the row is a match.. [optional]  # noqa: E501
            entity_id (str, none_type): FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) . [optional]  # noqa: E501
            entity_name (str, none_type): Full name corresponding to the matched entity.. [optional]  # noqa: E501
            url (str, none_type): URL of the matched entity.. [optional]  # noqa: E501
            map_status (str, none_type): Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. . [optional]  # noqa: E501
            similarity_score (float, none_type): Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. . [optional]  # noqa: E501
            confidence_score (float, none_type): Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. . [optional]  # noqa: E501
            country_code (str, none_type): ISO2 country code corresponding to the location of the matched entity.. [optional]  # noqa: E501
            country_name (str, none_type): Country name corresponding to the location of the matched entity. [optional]  # noqa: E501
            state_code (str, none_type): Two character state code corresponding to the location of the matched entity.. [optional]  # noqa: E501
            state_name (str, none_type): State name corresponding to the location of the matched entity.. [optional]  # noqa: E501
            sic_code (str, none_type): Standard Industrial Classification (SIC) Code of the matched entity.. [optional]  # noqa: E501
            entity_type_code (str, none_type): Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.. [optional]  # noqa: E501
            entity_type_description (str, none_type): Description of of the matched entity's type.. [optional]  # noqa: E501
            entity_sub_type_code (str, none_type): Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.. [optional]  # noqa: E501
            location_city (str, none_type): City where the matched entity is located.. [optional]  # noqa: E501
            region_name (str, none_type): Region where the matched entity is located.. [optional]  # noqa: E501
            factset_industry_code (str, none_type): FactSet Industry Classification Code of the matched entity.. [optional]  # noqa: E501
            factset_industry_name (str, none_type): Name of the matched entity's FactSet Industry Classification.. [optional]  # noqa: E501
            factset_sector_code (str, none_type): Name of the matched entity's FactSet Sector Classification Code.. [optional]  # noqa: E501
            factset_sector_name (str, none_type): Name of the matched entity's FactSet Sector Classification.. [optional]  # noqa: E501
            parent_name (str, none_type): Name of the matched entity's parent entity.. [optional]  # noqa: E501
            parent_match_flag (bool, none_type): Flag denoting that the matched entity is the parent of another match.. [optional]  # noqa: E501
            name_match_string (str, none_type): String on which the Concordance algorithm mapped the submitted entity.. [optional]  # noqa: E501
            name_match_source (str, none_type): Type of name that the nameMatchString matched.. [optional]  # noqa: E501
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
