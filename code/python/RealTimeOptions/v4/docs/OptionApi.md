# fds.sdk.RealTimeOptions.OptionApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_option_get**](OptionApi.md#get_option_get) | **GET** /option/get | Fundamental data for an option contract.
[**get_option_key_figures_get**](OptionApi.md#get_option_key_figures_get) | **GET** /option/key-figures/get | Key figures of an option contract.
[**post_option_by_class_list**](OptionApi.md#post_option_by_class_list) | **POST** /option/by-class/list | List of option contracts for an option class.
[**post_option_by_class_value_ranges_get**](OptionApi.md#post_option_by_class_value_ranges_get) | **POST** /option/by-class/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.
[**post_option_class_screener_search**](OptionApi.md#post_option_class_screener_search) | **POST** /option/class/screener/search | Screener for option classes based on option class-specific parameters.



# **get_option_get**
> InlineResponse200 get_option_get(identifier, identifier_type)

Fundamental data for an option contract.

Fundamental data for an option contract; any other instrument yields empty             values for option contract-specific attributes. Dates are interpreted in the time             zone of the exchange. Option contracts are exchange-specific; each option contract             instrument has exactly one notation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeOptions
from fds.sdk.RealTimeOptions.api import option_api
from fds.sdk.RealTimeOptions.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RealTimeOptions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeOptions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeOptions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = option_api.OptionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "FDS-US" # str | Identifier to resolve.
    identifier_type = "tickerRegion" # str | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # Fundamental data for an option contract.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_option_get(identifier, identifier_type, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.RealTimeOptions.ApiException as e:
        print("Exception when calling OptionApi->get_option_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Identifier to resolve. |
 **identifier_type** | **str**| Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_option_key_figures_get**
> InlineResponse2004 get_option_key_figures_get(identifier, identifier_type)

Key figures of an option contract.

Key figures of an option contract.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeOptions
from fds.sdk.RealTimeOptions.api import option_api
from fds.sdk.RealTimeOptions.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RealTimeOptions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeOptions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeOptions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = option_api.OptionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "FDS-US" # str | Identifier to resolve.
    identifier_type = "tickerRegion" # str | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Key figures of an option contract.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_option_key_figures_get(identifier, identifier_type, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeOptions.ApiException as e:
        print("Exception when calling OptionApi->get_option_key_figures_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Identifier to resolve. |
 **identifier_type** | **str**| Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_option_by_class_list**
> InlineResponse2001 post_option_by_class_list()

List of option contracts for an option class.

List of option contracts for an option class. The list can be filtered based on option contract-specific parameters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeOptions
from fds.sdk.RealTimeOptions.api import option_api
from fds.sdk.RealTimeOptions.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RealTimeOptions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeOptions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeOptions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = option_api.OptionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_option_by_class_list_request = PostOptionByClassListRequest(
        data=PostOptionByClassListRequestData(
            _class=PostOptionByClassListRequestDataClass(
                id="2002",
            ),
            filter=PostOptionByClassListRequestDataFilter(
                validation=PostOptionByClassListRequestDataFilterValidation(
                    only_active=False,
                    price=PostOptionByClassListRequestDataFilterValidationPrice(
                        quality="DLY",
                        latest=PostOptionByClassListRequestDataFilterValidationPriceLatest(
                            available_only=False,
                            minimum_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                        ),
                        previous=PostOptionByClassListRequestDataFilterValidationPricePrevious(
                            available_only=False,
                            minimum_date=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                        ),
                    ),
                ),
            ),
            contract=PostOptionByClassListRequestDataContract(
                excercise=PostOptionByClassListRequestDataContractExcercise(
                    right="call",
                    style="american",
                ),
                strike_price=PostOptionByClassListRequestDataContractStrikePrice(
                    minimum=PostOptionByClassListRequestDataContractStrikePriceMinimum(
                        value=3.03,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataContractStrikePriceMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
            ),
            life_cycle=PostOptionByClassListRequestDataLifeCycle(
                maturity=PostOptionByClassListRequestDataLifeCycleMaturity(
                    date=PostOptionByClassListRequestDataLifeCycleMaturityDate(
                        start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                        end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                    ),
                    interval=[
                        "monthly",
                    ],
                ),
                expiration=PostOptionByClassListRequestDataLifeCycleExpiration(
                    month=2,
                    year=-2,
                ),
            ),
            contract_size=PostOptionByClassListRequestDataContractSize(
                restrict=PostOptionByClassListRequestDataContractSizeRestrict(
                    values=[
                        4.04,
                    ],
                ),
                exclude=PostOptionByClassListRequestDataContractSizeExclude(
                    values=[
                        4.04,
                    ],
                ),
            ),
            open_interest=PostOptionByClassListRequestDataOpenInterest(
                minimum=PostOptionByClassListRequestDataOpenInterestMinimum(
                    value=5.05,
                    inclusive=True,
                ),
                maximum=PostOptionByClassListRequestDataOpenInterestMaximum(
                    value=3.03,
                    inclusive=True,
                ),
            ),
            key_figures=PostOptionByClassListRequestDataKeyFigures(
                moneyness=PostOptionByClassListRequestDataKeyFiguresMoneyness(
                    minimum=PostOptionByClassListRequestDataOpenInterestMinimum(
                        value=5.05,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresMoneynessMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
                implied_volatility=PostOptionByClassListRequestDataKeyFiguresImpliedVolatility(
                    minimum=PostOptionByClassListRequestDataKeyFiguresImpliedVolatilityMinimum(
                        value=0.4,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresImpliedVolatilityMaximum(
                        value=0.1,
                        inclusive=True,
                    ),
                ),
                omega=PostOptionByClassListRequestDataKeyFiguresOmega(
                    minimum=PostOptionByClassListRequestDataKeyFiguresOmegaMinimum(
                        value=4.04,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresOmegaMaximum(
                        value=4.04,
                        inclusive=True,
                    ),
                ),
                leverage=PostOptionByClassListRequestDataKeyFiguresLeverage(
                    minimum=PostOptionByClassListRequestDataContractStrikePriceMinimum(
                        value=3.03,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresMoneynessMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
                delta=PostOptionByClassListRequestDataKeyFiguresDelta(
                    minimum=PostOptionByClassListRequestDataKeyFiguresOmegaMinimum(
                        value=4.04,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataContractStrikePriceMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                theta_one_week=PostOptionByClassListRequestDataKeyFiguresThetaOneWeek(
                    minimum=PostOptionByClassListRequestDataContractStrikePriceMinimum(
                        value=3.03,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataContractStrikePriceMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                vega=PostOptionByClassListRequestDataKeyFiguresVega(
                    minimum=PostOptionByClassListRequestDataKeyFiguresOmegaMinimum(
                        value=4.04,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresOmegaMaximum(
                        value=4.04,
                        inclusive=True,
                    ),
                ),
                gamma=PostOptionByClassListRequestDataKeyFiguresGamma(
                    minimum=PostOptionByClassListRequestDataKeyFiguresGammaMinimum(
                        value=3.1415,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataContractStrikePriceMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                rho=PostOptionByClassListRequestDataKeyFiguresRho(
                    minimum=PostOptionByClassListRequestDataKeyFiguresRhoMinimum(
                        value=1.01,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresOmegaMaximum(
                        value=4.04,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=PostOptionByClassListRequestMeta(
            attributes=AttributesMember([]),
            language=LanguageMember("en"),
            sort=["instrument.normalizedSymbol"],
            pagination=PostOptionByClassListRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostOptionByClassListRequest | Request Body (optional)

    try:
        # List of option contracts for an option class.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_option_by_class_list(post_option_by_class_list_request=post_option_by_class_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeOptions.ApiException as e:
        print("Exception when calling OptionApi->post_option_by_class_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_option_by_class_list_request** | [**PostOptionByClassListRequest**](PostOptionByClassListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_option_by_class_value_ranges_get**
> InlineResponse2002 post_option_by_class_value_ranges_get()

Possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/option/by-class/list` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeOptions
from fds.sdk.RealTimeOptions.api import option_api
from fds.sdk.RealTimeOptions.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RealTimeOptions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeOptions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeOptions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = option_api.OptionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_option_by_class_value_ranges_get_request = PostOptionByClassValueRangesGetRequest(
        data=PostOptionByClassValueRangesGetRequestData(
            _class=PostOptionByClassValueRangesGetRequestDataClass(
                id="3003",
            ),
            filter=PostOptionByClassValueRangesGetRequestDataFilter(
                validation=PostOptionByClassValueRangesGetRequestDataFilterValidation(
                    only_active=False,
                    price=PostOptionByClassValueRangesGetRequestDataFilterValidationPrice(
                        quality="DLY",
                        latest=PostOptionByClassValueRangesGetRequestDataFilterValidationPriceLatest(
                            available_only=False,
                            minimum_date=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                        ),
                        previous=PostOptionByClassValueRangesGetRequestDataFilterValidationPricePrevious(
                            available_only=False,
                            minimum_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                        ),
                    ),
                ),
            ),
            contract=PostOptionByClassValueRangesGetRequestDataContract(
                excercise=PostOptionByClassListRequestDataContractExcercise(
                    right="call",
                    style="american",
                ),
                strike_price=PostOptionByClassValueRangesGetRequestDataContractStrikePrice(
                    minimum=PostOptionByClassListRequestDataKeyFiguresRhoMinimum(
                        value=1.01,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassValueRangesGetRequestDataContractStrikePriceMaximum(
                        value=1.01,
                        inclusive=True,
                    ),
                ),
            ),
            life_cycle=PostOptionByClassValueRangesGetRequestDataLifeCycle(
                maturity=PostOptionByClassValueRangesGetRequestDataLifeCycleMaturity(
                    date=PostOptionByClassValueRangesGetRequestDataLifeCycleMaturityDate(
                        start=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                        end=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    ),
                    interval=[
                        "daily",
                    ],
                ),
                expiration=PostOptionByClassValueRangesGetRequestDataLifeCycleExpiration(
                    month=132,
                    year=-132,
                ),
            ),
            contract_size=PostOptionByClassValueRangesGetRequestDataContractSize(
                restrict=PostOptionByClassValueRangesGetRequestDataContractSizeRestrict(
                    values=[
                        3.1415,
                    ],
                ),
                exclude=PostOptionByClassValueRangesGetRequestDataContractSizeExclude(
                    values=[
                        2.02,
                    ],
                ),
            ),
            open_interest=PostOptionByClassValueRangesGetRequestDataOpenInterest(
                minimum=PostOptionByClassValueRangesGetRequestDataOpenInterestMinimum(
                    value=2.02,
                    inclusive=True,
                ),
                maximum=PostOptionByClassListRequestDataOpenInterestMaximum(
                    value=3.03,
                    inclusive=True,
                ),
            ),
            key_figures=PostOptionByClassValueRangesGetRequestDataKeyFigures(
                moneyness=PostOptionByClassValueRangesGetRequestDataKeyFiguresMoneyness(
                    minimum=PostOptionByClassListRequestDataKeyFiguresOmegaMinimum(
                        value=4.04,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataOpenInterestMaximum(
                        value=3.03,
                        inclusive=True,
                    ),
                ),
                implied_volatility=PostOptionByClassValueRangesGetRequestDataKeyFiguresImpliedVolatility(
                    minimum=PostOptionByClassValueRangesGetRequestDataKeyFiguresImpliedVolatilityMinimum(
                        value=0.2,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassValueRangesGetRequestDataKeyFiguresImpliedVolatilityMaximum(
                        value=0.2,
                        inclusive=True,
                    ),
                ),
                omega=PostOptionByClassValueRangesGetRequestDataKeyFiguresOmega(
                    minimum=PostOptionByClassListRequestDataOpenInterestMinimum(
                        value=5.05,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataOpenInterestMaximum(
                        value=3.03,
                        inclusive=True,
                    ),
                ),
                leverage=PostOptionByClassValueRangesGetRequestDataKeyFiguresLeverage(
                    minimum=PostOptionByClassListRequestDataKeyFiguresOmegaMinimum(
                        value=4.04,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassValueRangesGetRequestDataKeyFiguresLeverageMaximum(
                        value=2.02,
                        inclusive=True,
                    ),
                ),
                delta=PostOptionByClassValueRangesGetRequestDataKeyFiguresDelta(
                    minimum=PostOptionByClassListRequestDataKeyFiguresGammaMinimum(
                        value=3.1415,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresOmegaMaximum(
                        value=4.04,
                        inclusive=True,
                    ),
                ),
                theta_one_week=PostOptionByClassValueRangesGetRequestDataKeyFiguresThetaOneWeek(
                    minimum=PostOptionByClassValueRangesGetRequestDataOpenInterestMinimum(
                        value=2.02,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassValueRangesGetRequestDataKeyFiguresLeverageMaximum(
                        value=2.02,
                        inclusive=True,
                    ),
                ),
                vega=PostOptionByClassValueRangesGetRequestDataKeyFiguresVega(
                    minimum=PostOptionByClassListRequestDataContractStrikePriceMinimum(
                        value=3.03,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassValueRangesGetRequestDataContractStrikePriceMaximum(
                        value=1.01,
                        inclusive=True,
                    ),
                ),
                gamma=PostOptionByClassValueRangesGetRequestDataKeyFiguresGamma(
                    minimum=PostOptionByClassListRequestDataContractStrikePriceMinimum(
                        value=3.03,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassValueRangesGetRequestDataKeyFiguresLeverageMaximum(
                        value=2.02,
                        inclusive=True,
                    ),
                ),
                rho=PostOptionByClassValueRangesGetRequestDataKeyFiguresRho(
                    minimum=PostOptionByClassListRequestDataOpenInterestMinimum(
                        value=5.05,
                        inclusive=True,
                    ),
                    maximum=PostOptionByClassListRequestDataKeyFiguresMoneynessMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=PostOptionByClassValueRangesGetRequestMeta(
            attributes=AttributesMember([]),
        ),
    ) # PostOptionByClassValueRangesGetRequest | Request Body (optional)

    try:
        # Possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_option_by_class_value_ranges_get(post_option_by_class_value_ranges_get_request=post_option_by_class_value_ranges_get_request)

        pprint(api_response)

    except fds.sdk.RealTimeOptions.ApiException as e:
        print("Exception when calling OptionApi->post_option_by_class_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_option_by_class_value_ranges_get_request** | [**PostOptionByClassValueRangesGetRequest**](PostOptionByClassValueRangesGetRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_option_class_screener_search**
> InlineResponse2003 post_option_class_screener_search()

Screener for option classes based on option class-specific parameters.

Screener for option classes based on option class-specific parameters. An option class is defined by an exchange and includes all option contracts with the same reference data (e.g. underlying instrument). The result is limited to the 500 option classes with the most option contracts per class, that satisfy all the selected filters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeOptions
from fds.sdk.RealTimeOptions.api import option_api
from fds.sdk.RealTimeOptions.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.RealTimeOptions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeOptions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeOptions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = option_api.OptionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_option_class_screener_search_request = PostOptionClassScreenerSearchRequest(
        data=PostOptionClassScreenerSearchRequestData(
            text=PostOptionClassScreenerSearchRequestDataText(
                attributes=["allEntitled"],
                value="FactSet",
            ),
            market=PostOptionClassScreenerSearchRequestDataMarket(
                restrict=PostOptionClassScreenerSearchRequestDataMarketRestrict(
                    ids=[
                        5,
                    ],
                ),
                exclude=PostOptionClassScreenerSearchRequestDataMarketExclude(
                    ids=[
                        1,
                    ],
                ),
            ),
            underlying=PostOptionClassScreenerSearchRequestDataUnderlying(
                instrument=PostOptionClassScreenerSearchRequestDataUnderlyingInstrument(
                    id="209485",
                ),
                notation=PostOptionClassScreenerSearchRequestDataUnderlyingNotation(
                    id="1532562",
                ),
            ),
            currency=PostOptionClassScreenerSearchRequestDataCurrency(
                restrict=PostOptionClassScreenerSearchRequestDataCurrencyRestrict(
                    ids=[
                        3,
                    ],
                ),
                exclude=PostOptionClassScreenerSearchRequestDataCurrencyExclude(
                    ids=[
                        2,
                    ],
                ),
            ),
            category=PostOptionClassScreenerSearchRequestDataCategory(
                restrict=PostOptionClassScreenerSearchRequestDataCategoryRestrict(
                    ids=[
                        1,
                    ],
                ),
                exclude=PostOptionClassScreenerSearchRequestDataCategoryExclude(
                    ids=[
                        4,
                    ],
                ),
            ),
        ),
        meta=PostOptionClassScreenerSearchRequestMeta(
            attributes=AttributesMember([]),
            language=LanguageMember("en"),
            sort=["symbol"],
        ),
    ) # PostOptionClassScreenerSearchRequest | Request Body (optional)

    try:
        # Screener for option classes based on option class-specific parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_option_class_screener_search(post_option_class_screener_search_request=post_option_class_screener_search_request)

        pprint(api_response)

    except fds.sdk.RealTimeOptions.ApiException as e:
        print("Exception when calling OptionApi->post_option_class_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_option_class_screener_search_request** | [**PostOptionClassScreenerSearchRequest**](PostOptionClassScreenerSearchRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

