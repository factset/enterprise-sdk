"""
    FactSet Symbology API

    The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p>   # noqa: E501

    The version of the OpenAPI document: 2.1.2
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.Symbology.model_utils import (  # noqa: F401
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
from fds.sdk.Symbology.exceptions import ApiAttributeError



class FactsetTranslation(ModelNormal):
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
            'fsym_id': (str,),  # noqa: E501
            'fsym_security_id': (str,),  # noqa: E501
            'fsym_regional_id': (str,),  # noqa: E501
            'fsym_listing_id': (str,),  # noqa: E501
            'fsym_entity_id': (str,),  # noqa: E501
            'fsym_ticker_exchange': (str,),  # noqa: E501
            'fsym_ticker_region': (str,),  # noqa: E501
            'fref_listing_exchange': (str,),  # noqa: E501
            'currency': (str,),  # noqa: E501
            'security_type': (str,),  # noqa: E501
            'name': (str,),  # noqa: E501
            'request_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'fsym_id': 'fsymId',  # noqa: E501
        'fsym_security_id': 'fsymSecurityId',  # noqa: E501
        'fsym_regional_id': 'fsymRegionalId',  # noqa: E501
        'fsym_listing_id': 'fsymListingId',  # noqa: E501
        'fsym_entity_id': 'fsymEntityId',  # noqa: E501
        'fsym_ticker_exchange': 'fsymTickerExchange',  # noqa: E501
        'fsym_ticker_region': 'fsymTickerRegion',  # noqa: E501
        'fref_listing_exchange': 'frefListingExchange',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'security_type': 'securityType',  # noqa: E501
        'name': 'name',  # noqa: E501
        'request_id': 'requestId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """FactsetTranslation - a model defined in OpenAPI

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
            fsym_id (str): FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_security_id (str): FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_regional_id (str): FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_listing_id (str): FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. '-USA') since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_entity_id (str): FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_ticker_exchange (str): FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544).. [optional]  # noqa: E501
            fsym_ticker_region (str): FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258). [optional]  # noqa: E501
            fref_listing_exchange (str): Primary Listing Exchange Code. For details on Exchange Code Definitions, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544) . [optional]  # noqa: E501
            currency (str): Three character ISO Currency code. For details on ISO Currency Code definitions, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). [optional]  # noqa: E501
            security_type (str): The generic securityType for Equities and Fixed Income. Reach out to FactSet if more detailed security types or terms & conditions are needed. The available codes returned are as follows -  |securityType|Description| |---|---| |ABS|Asset Backed Security | |ADR|American Depositary Receipt- An ADR is issued by a U.S. depositary bank and represents shares of a foreign corporation held by the bank. ADRs provide foreign companies with an access to U.S. capital markets. The instruments typically trade in U.S. dollars.| |ALIEN|Alien/Foreign- Shares that foreign investors can purchase from countries where they issue shares, such as Thailand. Foreigners can register these shares under their own name using the Foreign Board and receive all benefits offered by the company, such as rights offerings and dividends. Such securities have no floor or ceiling limits, so share prices respond to the demand and supply.| |BDNT|Bond/Note| |BLDN|Bill/Discount Note | |CONV|Convertible/Exchangeable| |COVR|Covered Bond | |DR|Depositary Receipts/Certificates- This security type represents all other depository receipts not mentioned above. Depositary Receipts (DR) are negotiable certificates that enable domestic investors to own shares in foreign companies. Each DR represents a given number of a company's shares.| |ETF_ETF|Exchange Traded Fund (ETF_ETF)- A security that is created to track the performance of an index or a basket of assets. ETFs are traded on organized exchanges.| |ETF_NAV|Exchange Traded Fund (ETF_NAV)- The Net Asset Value (NAV) is calculated by taking the total assets of the ETF, less liabilities, divided by the number of ETF shares outstanding.| |ETF_UVI|Exchange Traded Fund (ETF_UVI)- The Intraday Indicative Value is designed to give investors a sense of the relationship between a basket of securities that are representative of those owned in the ETF and the share price of the ETF on an intraday basis. An Intraday Indicative Value is published as a reference value to be used in conjunction with other ETF market information.| |GDR|Global Depositary Receipt- Certificate that represents ownership of a given number of a company's shares and can be listed and traded independently from the underlying shares. Provide issuers with an access to foreign capital markets.| |LKS|Linked Securities| |MF_C|Closed-ended Fund- These funds have a fixed number of shares, which are listed on the stock exchange. The market price of the shares is determined by demand and supply factors. These are readily transferable in the open market and are bought and sold like other stock. These funds do not accept new contributions from investors, but only reinvest the return on the existing portfolio.| |MF_O|Open-ended Fund- These funds have no limit to the number of units (or shares) they can issue. The price of the units (or shares) remains closely aligned to the NAV of the fund. Open-end funds sell their own new shares to investors, stand ready to buy back their old shares, and are not listed on exchanges. Open-end funds are so called because their capitalization is not fixed.| |NVDR|Non-Voting Depositary Receipt- A Non-Voting Depository Receipt (NVDR) is a trading instrument issued by the Thai NVDR Company Limited, a subsidiary wholly owned by the Stock Exchange of Thailand (SET). Investment in NVDR eliminates foreign investment barriers. The only difference between investing in NVDRs and the company's shares is the voting right. NVDRs are automatically regarded as listed securities in the SET.| |PASS|Pass-Through | |PFD|Preferred | |PREF|Preferred- A type of stock that pays a fixed dividend regardless of corporate earnings, and which has priority over common stock in the payment of dividends. The main characteristics of preferred stocks is the fixed income stream and priority of payment at liquidation.| |PREFEQ|Preferred Equity- A security that has equity characteristics (i.e., ownership at liquidation, share in the profits in the company) rather than fixed redemption and trades as a common equity (i.e., is very liquid and its prices are quoted in a currency rather than percentage of par, which is a common characteristic of preferred stock). These securities are most commonly issued in Brazil, Canada, and many European markets (i.e., Russia, Germany, and Italy). Preferred equity has some priority rights over common stock. This category also includes Italian savings shares.| |RIGHT|Right- A right gives the holder an option to purchase additional shares of an underlying instrument at a pre-determined price on a specified date (typically at a discount from the market price). In most cases, right instruments must be exercised within a relatively short period.| |SHARE|Share/Common/Ordinary- Securities that represent an ownership interest in a corporation. If the company has also issued preferred stock, both common and preferred stockholders have ownership rights. Common stockholders assume the greater risk, but generally exercise greater control and may gain a larger award in the form of dividends and capital appreciation.| |STRUCT|Structured Products- Investment products that are based on an underlying security such as a single equity, a basket of stocks, an index, a commodity, a debt issuance, or a foreign currency.| |TEMP|Temporary- Securities that trade for a limited period of time (typically less than a year) and trade alongside the mainline security. Also included are securities that trade alongside the mainline and then assimilate to the mainline security after trading for few days/months. Examples of temporary instruments are parallel lines and assented lines.| |UNIT|Unit- An equity that consists of more than one equity instrument (i.e., security consisting of class A and B; 1 share and 1 warrant).| |WARRANT|Warrant- An instrument giving the holder a right to subscribe to an underlying instrument at a given price and date.| . [optional]  # noqa: E501
            name (str): Proper Name of company or issuer.. [optional]  # noqa: E501
            request_id (str): Identifier specified in the `ids` parameter of the request.. [optional]  # noqa: E501
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
        """FactsetTranslation - a model defined in OpenAPI

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
            fsym_id (str): FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_security_id (str): FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_regional_id (str): FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_listing_id (str): FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. '-USA') since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_entity_id (str): FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). [optional]  # noqa: E501
            fsym_ticker_exchange (str): FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544).. [optional]  # noqa: E501
            fsym_ticker_region (str): FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258). [optional]  # noqa: E501
            fref_listing_exchange (str): Primary Listing Exchange Code. For details on Exchange Code Definitions, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544) . [optional]  # noqa: E501
            currency (str): Three character ISO Currency code. For details on ISO Currency Code definitions, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). [optional]  # noqa: E501
            security_type (str): The generic securityType for Equities and Fixed Income. Reach out to FactSet if more detailed security types or terms & conditions are needed. The available codes returned are as follows -  |securityType|Description| |---|---| |ABS|Asset Backed Security | |ADR|American Depositary Receipt- An ADR is issued by a U.S. depositary bank and represents shares of a foreign corporation held by the bank. ADRs provide foreign companies with an access to U.S. capital markets. The instruments typically trade in U.S. dollars.| |ALIEN|Alien/Foreign- Shares that foreign investors can purchase from countries where they issue shares, such as Thailand. Foreigners can register these shares under their own name using the Foreign Board and receive all benefits offered by the company, such as rights offerings and dividends. Such securities have no floor or ceiling limits, so share prices respond to the demand and supply.| |BDNT|Bond/Note| |BLDN|Bill/Discount Note | |CONV|Convertible/Exchangeable| |COVR|Covered Bond | |DR|Depositary Receipts/Certificates- This security type represents all other depository receipts not mentioned above. Depositary Receipts (DR) are negotiable certificates that enable domestic investors to own shares in foreign companies. Each DR represents a given number of a company's shares.| |ETF_ETF|Exchange Traded Fund (ETF_ETF)- A security that is created to track the performance of an index or a basket of assets. ETFs are traded on organized exchanges.| |ETF_NAV|Exchange Traded Fund (ETF_NAV)- The Net Asset Value (NAV) is calculated by taking the total assets of the ETF, less liabilities, divided by the number of ETF shares outstanding.| |ETF_UVI|Exchange Traded Fund (ETF_UVI)- The Intraday Indicative Value is designed to give investors a sense of the relationship between a basket of securities that are representative of those owned in the ETF and the share price of the ETF on an intraday basis. An Intraday Indicative Value is published as a reference value to be used in conjunction with other ETF market information.| |GDR|Global Depositary Receipt- Certificate that represents ownership of a given number of a company's shares and can be listed and traded independently from the underlying shares. Provide issuers with an access to foreign capital markets.| |LKS|Linked Securities| |MF_C|Closed-ended Fund- These funds have a fixed number of shares, which are listed on the stock exchange. The market price of the shares is determined by demand and supply factors. These are readily transferable in the open market and are bought and sold like other stock. These funds do not accept new contributions from investors, but only reinvest the return on the existing portfolio.| |MF_O|Open-ended Fund- These funds have no limit to the number of units (or shares) they can issue. The price of the units (or shares) remains closely aligned to the NAV of the fund. Open-end funds sell their own new shares to investors, stand ready to buy back their old shares, and are not listed on exchanges. Open-end funds are so called because their capitalization is not fixed.| |NVDR|Non-Voting Depositary Receipt- A Non-Voting Depository Receipt (NVDR) is a trading instrument issued by the Thai NVDR Company Limited, a subsidiary wholly owned by the Stock Exchange of Thailand (SET). Investment in NVDR eliminates foreign investment barriers. The only difference between investing in NVDRs and the company's shares is the voting right. NVDRs are automatically regarded as listed securities in the SET.| |PASS|Pass-Through | |PFD|Preferred | |PREF|Preferred- A type of stock that pays a fixed dividend regardless of corporate earnings, and which has priority over common stock in the payment of dividends. The main characteristics of preferred stocks is the fixed income stream and priority of payment at liquidation.| |PREFEQ|Preferred Equity- A security that has equity characteristics (i.e., ownership at liquidation, share in the profits in the company) rather than fixed redemption and trades as a common equity (i.e., is very liquid and its prices are quoted in a currency rather than percentage of par, which is a common characteristic of preferred stock). These securities are most commonly issued in Brazil, Canada, and many European markets (i.e., Russia, Germany, and Italy). Preferred equity has some priority rights over common stock. This category also includes Italian savings shares.| |RIGHT|Right- A right gives the holder an option to purchase additional shares of an underlying instrument at a pre-determined price on a specified date (typically at a discount from the market price). In most cases, right instruments must be exercised within a relatively short period.| |SHARE|Share/Common/Ordinary- Securities that represent an ownership interest in a corporation. If the company has also issued preferred stock, both common and preferred stockholders have ownership rights. Common stockholders assume the greater risk, but generally exercise greater control and may gain a larger award in the form of dividends and capital appreciation.| |STRUCT|Structured Products- Investment products that are based on an underlying security such as a single equity, a basket of stocks, an index, a commodity, a debt issuance, or a foreign currency.| |TEMP|Temporary- Securities that trade for a limited period of time (typically less than a year) and trade alongside the mainline security. Also included are securities that trade alongside the mainline and then assimilate to the mainline security after trading for few days/months. Examples of temporary instruments are parallel lines and assented lines.| |UNIT|Unit- An equity that consists of more than one equity instrument (i.e., security consisting of class A and B; 1 share and 1 warrant).| |WARRANT|Warrant- An instrument giving the holder a right to subscribe to an underlying instrument at a given price and date.| . [optional]  # noqa: E501
            name (str): Proper Name of company or issuer.. [optional]  # noqa: E501
            request_id (str): Identifier specified in the `ids` parameter of the request.. [optional]  # noqa: E501
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
