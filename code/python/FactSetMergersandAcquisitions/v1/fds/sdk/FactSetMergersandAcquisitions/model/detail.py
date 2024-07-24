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


def lazy_import():
    from fds.sdk.FactSetMergersandAcquisitions.model.deal_value import DealValue
    from fds.sdk.FactSetMergersandAcquisitions.model.participant import Participant
    from fds.sdk.FactSetMergersandAcquisitions.model.target import Target
    globals()['DealValue'] = DealValue
    globals()['Participant'] = Participant
    globals()['Target'] = Target


class Detail(ModelNormal):
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
            'PENDING': "Pending",
            'COMPLETE': "Complete",
            'CANCELLED': "Cancelled",
            'RUMOR': "Rumor",
            'RUMOR_CANCELLED': "Rumor Cancelled",


        },
        ('deal_type',): {
            'ACQUISITION_/_MERGER': "Acquisition / Merger",
            'MAJORITY_STAKE': "Majority Stake",
            'MINORITY_STAKE': "Minority Stake",
            'SPINOFF': "Spinoff",


        },
        ('source_funds',): {
            'None': None,
            'BANK_LOAN': "Bank Loan",
            'BOND/NOTE_ISSUANCE': "Bond/Note Issuance",
            'INTERNALLY_GENERATED_FUNDS': "Internally Generated Funds",
            'MEZZANINE': "Mezzanine",
            'PRIVATE_COMPANY_DEBT': "Private Company Debt",
            'PRIVATE_EQUITY/VENTURE_FUNDING': "Private Equity/Venture Funding",
            'PRIVATE_WARRANT_OPTION': "Private Warrant Option",
            'SOURCE_OF_FUNDING_NOT_DISCLOSED': "Source of Funding Not Disclosed",
            'STOCK_ISSUANCE:_PREF_&amp;_COM_(PUBLIC)': "Stock Issuance: Pref & Com (Public)",


        },
        ('purpose',): {
            'None': None,
            'FINANCIAL': "Financial",
            'STRATEGIC': "Strategic",


        },
        ('attitude',): {
            'None': None,
            'FRIENDLY': "Friendly",
            'HOSTILE': "Hostile",
            'NEUTRAL': "Neutral",


        },
        ('deal_characteristics',): {
            'None': None,
            'DIVESTMENT': "Divestment",
            'EMPLOYEE_BUY-OUT': "Employee Buy-Out",
            'EXIT': "Exit",
            'INVESTOR_BUY-IN': "Investor Buy-In",
            'INVESTOR_BUY-OUT': "Investor Buy-Out",
            'INSOLVENCY': "Insolvency",
            'MANAGEMENT_BUY-OUT': "Management Buy-Out",
            'REVERSE_TAKEOVER': "Reverse Takeover",
            'SECONDARY_BUY-OUT': "Secondary Buy-Out",
            'LEVERAGED_BUY-OUT': "Leveraged Buy-Out",
            'GOING_PRIVATE': "Going Private",
            'EXIT_(PARTIAL)': "Exit (Partial)",
            'CONTROL_PREMIUM_STUDY': "Control Premium Study",
            'PRIVATE_EQUITY_GROUP': "Private Equity Group",
            'ASSET_PURCHASE': "Asset Purchase",
            'RELATED_PARTY': "Related Party",
            'TENDER_OFFER': "Tender Offer",
            'UNEQUAL_VOTING': "Unequal Voting",
            'TARGET_CONTROLLING_SHAREHOLDER': "Target Controlling Shareholder",
            'AUCTION': "Auction",
            'CLUB_DEAL_-_PE_GROUP': "Club Deal - PE Group",
            'CLUB_DEAL_-_CORP/PE': "Club Deal - Corp/PE",
            'VENTURE_BACKED_ACQUIRER': "Venture Backed Acquirer",
            'UNSOLICITED_BID': "Unsolicited Bid",
            'RUMOR': "Rumor",
            'SCHEME_OF_ARRANGEMENT': "Scheme of Arrangement",
            'GOLDEN_SHARE': "Golden Share",
            'MERGER_OF_EQUALS': "Merger of Equals",
            'PRIVATIZATION': "Privatization",
            'INDICATIVE_/_TENTATIVE_PROPOSAL': "Indicative / Tentative Proposal",
            'CLUB_DEAL_-_CORPORATE_GROUP': "Club Deal - Corporate Group",
            'MULTIPLE_TARGET_DEAL': "Multiple Target Deal",
            'SPAC': "SPAC",
            'SQUEEZE_OUT': "Squeeze Out",
            'SPECIAL_COMMITTEE': "Special Committee",
            'COLLAR': "Collar",
            'FORCED_REGULATORY_DIVESTITURE': "Forced Regulatory Divestiture",
            'VENTURE-BACKED_TARGET': "Venture-Backed Target",
            'BANK_BRANCH_PURCHASE': "Bank Branch Purchase",
            'BIDDER_SPECIAL_COMMITTEE': "Bidder Special Committee",
            'TARGET_SPECIAL_COMMITTEE': "Target Special Committee",
            'BIDDER_CONTROLLING_SHAREHOLDER': "Bidder Controlling Shareholder",
            'PROPERTY_TRANSACTION': "Property Transaction",
            'POWER_PLANT_PURCHASE': "Power Plant Purchase",


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
            'deal_id': (str,),  # noqa: E501
            'target': (Target,),  # noqa: E501
            'buyers': ([Participant],),  # noqa: E501
            'sellers': ([Participant], none_type,),  # noqa: E501
            'status': (str,),  # noqa: E501
            'rumor_date': (date, none_type,),  # noqa: E501
            'announce_date': (date, none_type,),  # noqa: E501
            'reference_date': (date, none_type,),  # noqa: E501
            'expected_close_date': (date, none_type,),  # noqa: E501
            'close_date': (date, none_type,),  # noqa: E501
            'cancel_date': (date, none_type,),  # noqa: E501
            'deal_type': (str,),  # noqa: E501
            'source_funds': ([str, none_type], none_type,),  # noqa: E501
            'deal_value': (DealValue,),  # noqa: E501
            'purpose': (str, none_type,),  # noqa: E501
            'ev_sales': (float, none_type,),  # noqa: E501
            'ev_ebit': (float, none_type,),  # noqa: E501
            'ev_ebitda': (float, none_type,),  # noqa: E501
            'bep_bv': (float, none_type,),  # noqa: E501
            'sales': (float, none_type,),  # noqa: E501
            'ebit': (float, none_type,),  # noqa: E501
            'ebitda': (float, none_type,),  # noqa: E501
            'net_income': (float, none_type,),  # noqa: E501
            'cash': (float, none_type,),  # noqa: E501
            'int_bearing_debt': (float, none_type,),  # noqa: E501
            'pref_stock_value': (float, none_type,),  # noqa: E501
            'total_assets': (float, none_type,),  # noqa: E501
            'shares_outstanding': (float, none_type,),  # noqa: E501
            'eps': (float, none_type,),  # noqa: E501
            'book_value_share': (float, none_type,),  # noqa: E501
            'target_post_merger_own': (float, none_type,),  # noqa: E501
            'buyer_post_merger_own': (float, none_type,),  # noqa: E501
            'attitude': (str, none_type,),  # noqa: E501
            'deal_summary': (str, none_type,),  # noqa: E501
            'deal_characteristics': ([str, none_type], none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'deal_id': 'dealId',  # noqa: E501
        'target': 'target',  # noqa: E501
        'buyers': 'buyers',  # noqa: E501
        'sellers': 'sellers',  # noqa: E501
        'status': 'status',  # noqa: E501
        'rumor_date': 'rumorDate',  # noqa: E501
        'announce_date': 'announceDate',  # noqa: E501
        'reference_date': 'referenceDate',  # noqa: E501
        'expected_close_date': 'expectedCloseDate',  # noqa: E501
        'close_date': 'closeDate',  # noqa: E501
        'cancel_date': 'cancelDate',  # noqa: E501
        'deal_type': 'dealType',  # noqa: E501
        'source_funds': 'sourceFunds',  # noqa: E501
        'deal_value': 'dealValue',  # noqa: E501
        'purpose': 'purpose',  # noqa: E501
        'ev_sales': 'evSales',  # noqa: E501
        'ev_ebit': 'evEBIT',  # noqa: E501
        'ev_ebitda': 'evEBITDA',  # noqa: E501
        'bep_bv': 'bepBV',  # noqa: E501
        'sales': 'sales',  # noqa: E501
        'ebit': 'ebit',  # noqa: E501
        'ebitda': 'ebitda',  # noqa: E501
        'net_income': 'netIncome',  # noqa: E501
        'cash': 'cash',  # noqa: E501
        'int_bearing_debt': 'intBearingDebt',  # noqa: E501
        'pref_stock_value': 'prefStockValue',  # noqa: E501
        'total_assets': 'totalAssets',  # noqa: E501
        'shares_outstanding': 'sharesOutstanding',  # noqa: E501
        'eps': 'eps',  # noqa: E501
        'book_value_share': 'bookValueShare',  # noqa: E501
        'target_post_merger_own': 'targetPostMergerOwn',  # noqa: E501
        'buyer_post_merger_own': 'buyerPostMergerOwn',  # noqa: E501
        'attitude': 'attitude',  # noqa: E501
        'deal_summary': 'dealSummary',  # noqa: E501
        'deal_characteristics': 'dealCharacteristics',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """Detail - a model defined in OpenAPI

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
            deal_id (str): FactSet unique deal Identifier.. [optional]  # noqa: E501
            target (Target): [optional]  # noqa: E501
            buyers ([Participant]): Array of participants in the deal who are buyers.. [optional]  # noqa: E501
            sellers ([Participant], none_type): Array of participants in the deal who are sellers.. [optional]  # noqa: E501
            status (str): Status of the deal.. [optional]  # noqa: E501
            rumor_date (date, none_type): For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement.. [optional]  # noqa: E501
            announce_date (date, none_type): Date the deal was announced.. [optional]  # noqa: E501
            reference_date (date, none_type): In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target's share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet's Coffee & Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02.. [optional]  # noqa: E501
            expected_close_date (date, none_type): Expected close date of the deal.. [optional]  # noqa: E501
            close_date (date, none_type): Date the deal was closed.. [optional]  # noqa: E501
            cancel_date (date, none_type): Date the deal was cancelled.. [optional]  # noqa: E501
            deal_type (str): Type of deal.. [optional]  # noqa: E501
            source_funds ([str, none_type], none_type): Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper.. [optional]  # noqa: E501
            deal_value (DealValue): [optional]  # noqa: E501
            purpose (str, none_type): Transaction purpose code or description.. [optional]  # noqa: E501
            ev_sales (float, none_type): Ratio: Enterprise value/sales.. [optional]  # noqa: E501
            ev_ebit (float, none_type): Ratio: Enterprise value/EBIT.. [optional]  # noqa: E501
            ev_ebitda (float, none_type): Ratio: Enterprise value/EBITDA.. [optional]  # noqa: E501
            bep_bv (float, none_type): Ratio: BEP/BV.. [optional]  # noqa: E501
            sales (float, none_type): Sales at the time of the deal in USD.. [optional]  # noqa: E501
            ebit (float, none_type): EBIT at the time of the deal in USD.. [optional]  # noqa: E501
            ebitda (float, none_type): EBITDA at the time of the deal in USD.. [optional]  # noqa: E501
            net_income (float, none_type): Net income at the time of the deal in USD.. [optional]  # noqa: E501
            cash (float, none_type): Cash at the time of the deal in USD.. [optional]  # noqa: E501
            int_bearing_debt (float, none_type): Interest bearing debt at the time of the deal in USD.. [optional]  # noqa: E501
            pref_stock_value (float, none_type): Preferred stock value at the time of the deal in USD.. [optional]  # noqa: E501
            total_assets (float, none_type): Total assets at the time of the deal in USD.. [optional]  # noqa: E501
            shares_outstanding (float, none_type): Shares outstanding at the time of the deal.. [optional]  # noqa: E501
            eps (float, none_type): Earnings per share at the time of the deal in USD.. [optional]  # noqa: E501
            book_value_share (float, none_type): Book value per share at the time of the deal in USD.. [optional]  # noqa: E501
            target_post_merger_own (float, none_type): Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded.. [optional]  # noqa: E501
            buyer_post_merger_own (float, none_type): Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded.. [optional]  # noqa: E501
            attitude (str, none_type): The way the target's board of directors viewed the acquirer's proposal to enter into the transaction - Friendly, Hostile, Neutral.. [optional]  # noqa: E501
            deal_summary (str, none_type): Summary of the deal.. [optional]  # noqa: E501
            deal_characteristics ([str, none_type], none_type): The secondary deal type(s).. [optional]  # noqa: E501
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
        """Detail - a model defined in OpenAPI

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
            deal_id (str): FactSet unique deal Identifier.. [optional]  # noqa: E501
            target (Target): [optional]  # noqa: E501
            buyers ([Participant]): Array of participants in the deal who are buyers.. [optional]  # noqa: E501
            sellers ([Participant], none_type): Array of participants in the deal who are sellers.. [optional]  # noqa: E501
            status (str): Status of the deal.. [optional]  # noqa: E501
            rumor_date (date, none_type): For a transaction that initially start out as a rumor, the date on which talks of the transaction first appeared in a major financial or trade publication. For so long as the transaction remains a rumor, the Rumor Date and the Announcement Date will be the same. Once confirmed and the transaction is no longer a rumor, the Rumor Date will remain unchanged and the Announcement Date will be updated to reflect the date upon which one of the parties involved in the deal disclosed the formal offer or a definitive agreement.. [optional]  # noqa: E501
            announce_date (date, none_type): Date the deal was announced.. [optional]  # noqa: E501
            reference_date (date, none_type): In a competing bid situation, the common date (earliest announcement date) used across all related transactions in order to determine the target's share prices, financials, premiums/multiples and all currency conversions (allowing for a common basis of comparison). For all other transactions, the Competing Bid Reference Date will be the same as the Announcement Date. For example, Peet's Coffee & Tea, Inc. announced its intent to acquire Diedrich Coffee, Inc. on 2009-11-02. Green Mountain Coffee Roasters jumped this transaction, announcing its own competing bid on 2009-11-23. Green Mountain eventually won its bid, completing the acquisition on 2010-05-11. For both transactions, the Competing Bid Reference Date is 2009-11-02.. [optional]  # noqa: E501
            expected_close_date (date, none_type): Expected close date of the deal.. [optional]  # noqa: E501
            close_date (date, none_type): Date the deal was closed.. [optional]  # noqa: E501
            cancel_date (date, none_type): Date the deal was cancelled.. [optional]  # noqa: E501
            deal_type (str): Type of deal.. [optional]  # noqa: E501
            source_funds ([str, none_type], none_type): Method by which the acquirer was to finance the cash portion of the consideration offered in transaction (e.g., cash, bank debt, issuance of notes/bonds, etc.). For example, VF Corp financed its $2.2 bil all cash offer for The Timberland Company by issuing $900 mil in term notes and funding the balance through a combination of cash on hand and commercial paper.. [optional]  # noqa: E501
            deal_value (DealValue): [optional]  # noqa: E501
            purpose (str, none_type): Transaction purpose code or description.. [optional]  # noqa: E501
            ev_sales (float, none_type): Ratio: Enterprise value/sales.. [optional]  # noqa: E501
            ev_ebit (float, none_type): Ratio: Enterprise value/EBIT.. [optional]  # noqa: E501
            ev_ebitda (float, none_type): Ratio: Enterprise value/EBITDA.. [optional]  # noqa: E501
            bep_bv (float, none_type): Ratio: BEP/BV.. [optional]  # noqa: E501
            sales (float, none_type): Sales at the time of the deal in USD.. [optional]  # noqa: E501
            ebit (float, none_type): EBIT at the time of the deal in USD.. [optional]  # noqa: E501
            ebitda (float, none_type): EBITDA at the time of the deal in USD.. [optional]  # noqa: E501
            net_income (float, none_type): Net income at the time of the deal in USD.. [optional]  # noqa: E501
            cash (float, none_type): Cash at the time of the deal in USD.. [optional]  # noqa: E501
            int_bearing_debt (float, none_type): Interest bearing debt at the time of the deal in USD.. [optional]  # noqa: E501
            pref_stock_value (float, none_type): Preferred stock value at the time of the deal in USD.. [optional]  # noqa: E501
            total_assets (float, none_type): Total assets at the time of the deal in USD.. [optional]  # noqa: E501
            shares_outstanding (float, none_type): Shares outstanding at the time of the deal.. [optional]  # noqa: E501
            eps (float, none_type): Earnings per share at the time of the deal in USD.. [optional]  # noqa: E501
            book_value_share (float, none_type): Book value per share at the time of the deal in USD.. [optional]  # noqa: E501
            target_post_merger_own (float, none_type): Post Merger Ownership % - Target: The pro forma percentage of ownership to be held by target shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded.. [optional]  # noqa: E501
            buyer_post_merger_own (float, none_type): Post Merger Ownership % - Acquirer: The pro forma percentage of ownership to be held by acquirer shareholders in the newly merged company. This data item is designed to reflect the expected ownership of the newly merged company at the time the transaction was announced. This data item will not be populated for Going Private transactions as they are not applicable since the acquirer in a going private transaction is not publicly traded.. [optional]  # noqa: E501
            attitude (str, none_type): The way the target's board of directors viewed the acquirer's proposal to enter into the transaction - Friendly, Hostile, Neutral.. [optional]  # noqa: E501
            deal_summary (str, none_type): Summary of the deal.. [optional]  # noqa: E501
            deal_characteristics ([str, none_type], none_type): The secondary deal type(s).. [optional]  # noqa: E501
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
