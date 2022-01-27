# fds.sdk.BondsAPIforDigitalPortals.DebtInstrumentApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_debt_instrument_get**](DebtInstrumentApi.md#get_debt_instrument_get) | **GET** /debtInstrument/get | Fundamental data for a debt instrument.
[**get_debt_instrument_key_figures_notation_get**](DebtInstrumentApi.md#get_debt_instrument_key_figures_notation_get) | **GET** /debtInstrument/keyFigures/notation/get | Key figures of a debt instrument.
[**post_debt_instrument_issuer_search**](DebtInstrumentApi.md#post_debt_instrument_issuer_search) | **POST** /debtInstrument/issuer/search | Search for issuers of debt instruments.
[**post_debt_instrument_notation_screener_search**](DebtInstrumentApi.md#post_debt_instrument_notation_screener_search) | **POST** /debtInstrument/notation/screener/search | Screener for debt instruments&#39; notations based on debt instrument-specific parameters.
[**post_debt_instrument_notation_screener_value_ranges_get**](DebtInstrumentApi.md#post_debt_instrument_notation_screener_value_ranges_get) | **POST** /debtInstrument/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search.&#x60;


# **get_debt_instrument_get**
> InlineResponse200 get_debt_instrument_get(id)

Fundamental data for a debt instrument.

Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BondsAPIforDigitalPortals
from fds.sdk.BondsAPIforDigitalPortals.api import debt_instrument_api
from fds.sdk.BondsAPIforDigitalPortals.model.inline_response200 import InlineResponse200
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BondsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = debt_instrument_api.DebtInstrumentApi(api_client)
    id = "id_example" # str | Identifier of the instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Fundamental data for a debt instrument.
        api_response = api_instance.get_debt_instrument_get(id)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->get_debt_instrument_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Fundamental data for a debt instrument.
        api_response = api_instance.get_debt_instrument_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->get_debt_instrument_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

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

# **get_debt_instrument_key_figures_notation_get**
> InlineResponse2002 get_debt_instrument_key_figures_notation_get(id)

Key figures of a debt instrument.

Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BondsAPIforDigitalPortals
from fds.sdk.BondsAPIforDigitalPortals.api import debt_instrument_api
from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2002 import InlineResponse2002
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BondsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = debt_instrument_api.DebtInstrumentApi(api_client)
    id = "id_example" # str | Identifier of a notation.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Key figures of a debt instrument.
        api_response = api_instance.get_debt_instrument_key_figures_notation_get(id)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->get_debt_instrument_key_figures_notation_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Key figures of a debt instrument.
        api_response = api_instance.get_debt_instrument_key_figures_notation_get(id, attributes=attributes)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->get_debt_instrument_key_figures_notation_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of a notation. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

# **post_debt_instrument_issuer_search**
> InlineResponse2001 post_debt_instrument_issuer_search()

Search for issuers of debt instruments.

Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BondsAPIforDigitalPortals
from fds.sdk.BondsAPIforDigitalPortals.api import debt_instrument_api
from fds.sdk.BondsAPIforDigitalPortals.model.inline_object import InlineObject
from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BondsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = debt_instrument_api.DebtInstrumentApi(api_client)
    body = InlineObject(
        data=DebtInstrumentIssuerSearchData(
            name=DebtInstrumentIssuerSearchDataName(
                search_value="BA#$!T?W$sYJ4ha$7S$3Bm",
            ),
            minimum_rating_grade=DebtInstrumentIssuerSearchDataMinimumRatingGrade(
                debt_instrument=DebtInstrumentIssuerSearchDataMinimumRatingGradeDebtInstrument(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            country=DebtInstrumentIssuerSearchDataCountry(
                ids=[
                    3.14,
                ],
            ),
            market=DebtInstrumentIssuerSearchDataMarket(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=DebtInstrumentIssuerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Search for issuers of debt instruments.
        api_response = api_instance.post_debt_instrument_issuer_search(body=body)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->post_debt_instrument_issuer_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

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

# **post_debt_instrument_notation_screener_search**
> InlineResponse2003 post_debt_instrument_notation_screener_search()

Screener for debt instruments' notations based on debt instrument-specific parameters.

Screener for debt instruments' notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BondsAPIforDigitalPortals
from fds.sdk.BondsAPIforDigitalPortals.api import debt_instrument_api
from fds.sdk.BondsAPIforDigitalPortals.model.inline_object1 import InlineObject1
from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BondsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = debt_instrument_api.DebtInstrumentApi(api_client)
    body = InlineObject1(
        data=DebtInstrumentNotationScreenerSearchData(
            validation=DebtInstrumentNotationScreenerSearchDataValidation(
                only_active=True,
                only_not_suspended=False,
                prices=DebtInstrumentNotationScreenerSearchDataValidationPrices(
                    quality="DLY",
                    latest=DebtInstrumentNotationScreenerSearchDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=DebtInstrumentNotationScreenerSearchDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=DebtInstrumentNotationScreenerSearchDataValidationValueUnit(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationValueUnitRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationValueUnitExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=DebtInstrumentNotationScreenerSearchDataValidationMarket(
                    selection=DebtInstrumentNotationScreenerSearchDataValidationMarketSelection(
                        restrict=DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=DebtInstrumentNotationScreenerSearchDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                categorization=DebtInstrumentNotationScreenerSearchDataValidationCategorization(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationCategorizationRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationCategorizationExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            life_cycle=DebtInstrumentNotationScreenerSearchDataLifeCycle(
                issue=DebtInstrumentNotationScreenerSearchDataLifeCycleIssue(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                maturity=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturity(
                    restriction=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction(
                        date=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionDate(
                            start=dateutil_parser('1970-01-01').date(),
                            end=dateutil_parser('1970-01-01').date(),
                        ),
                        remaining_term_years=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYears(
                            minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    perpetual="only",
                ),
                callable=True,
            ),
            subordinated=True,
            rating=DebtInstrumentNotationScreenerSearchDataRating(
                grade=DebtInstrumentNotationScreenerSearchDataRatingGrade(
                    minimum=DebtInstrumentNotationScreenerSearchDataRatingGradeMinimum(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            issuer=DebtInstrumentNotationScreenerSearchDataIssuer(
                selection=DebtInstrumentNotationScreenerSearchDataIssuerSelection(
                    restrict=DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataIssuerSelectionExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                country=DebtInstrumentNotationScreenerSearchDataIssuerCountry(
                    restrict=DebtInstrumentNotationScreenerSearchDataIssuerCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataIssuerCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            issue=DebtInstrumentNotationScreenerSearchDataIssue(
                volume=DebtInstrumentNotationScreenerSearchDataIssueVolume(
                    currency=DebtInstrumentNotationScreenerSearchDataIssueVolumeCurrency(
                        restrict=DebtInstrumentNotationScreenerSearchDataIssueVolumeCurrencyRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=DebtInstrumentNotationScreenerSearchDataIssueVolumeCurrencyExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
            ),
            trading_volume=DebtInstrumentNotationScreenerSearchDataTradingVolume(
                otc=DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc(
                    minimum=DebtInstrumentNotationScreenerSearchDataTradingVolumeOtcMinimum(
                        minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            compliance=DebtInstrumentNotationScreenerSearchDataCompliance(
                germany=DebtInstrumentNotationScreenerSearchDataComplianceGermany(
                    trustee_eligible=True,
                ),
            ),
            coupon=DebtInstrumentNotationScreenerSearchDataCoupon(
                occurrence=DebtInstrumentNotationScreenerSearchDataCouponOccurrence(
                    type=[
                        "never",
                    ],
                    frequency=DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                current_interest_rate=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRate(
                    type=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateType(
                        ids=[
                            3.14,
                        ],
                    ),
                    value=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue(
                        minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            _yield=DebtInstrumentNotationScreenerSearchDataYield(
                current=DebtInstrumentNotationScreenerSearchDataYieldCurrent(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                to_maturity=DebtInstrumentNotationScreenerSearchDataYieldToMaturity(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                spread=DebtInstrumentNotationScreenerSearchDataYieldSpread(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            macaulay_duration=DebtInstrumentNotationScreenerSearchDataMacaulayDuration(
                minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                    value=3.14,
                    inclusive=True,
                ),
                maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                    value=3.14,
                    inclusive=True,
                ),
            ),
            sensitivities=DebtInstrumentNotationScreenerSearchDataSensitivities(
                base_point_value=DebtInstrumentNotationScreenerSearchDataSensitivitiesBasePointValue(
                    minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                modified_duration=DebtInstrumentNotationScreenerSearchDataSensitivitiesModifiedDuration(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                elasticity=DebtInstrumentNotationScreenerSearchDataSensitivitiesElasticity(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                convexity=DebtInstrumentNotationScreenerSearchDataSensitivitiesConvexity(
                    minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            traded_value=DebtInstrumentNotationScreenerSearchDataTradedValue(
                days30=DebtInstrumentNotationScreenerSearchDataTradedValueDays30(
                    sum=DebtInstrumentNotationScreenerSearchDataTradedValueDays30Sum(
                        minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    average=DebtInstrumentNotationScreenerSearchDataTradedValueDays30Average(
                        minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
        ),
        meta=DebtInstrumentNotationScreenerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=[
                "valueUnit.code",
            ],
            pagination=DebtInstrumentNotationScreenerSearchMetaPagination(
                offset=0,
                limit=0,
            ),
        ),
    ) # InlineObject1 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Screener for debt instruments' notations based on debt instrument-specific parameters.
        api_response = api_instance.post_debt_instrument_notation_screener_search(body=body)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->post_debt_instrument_notation_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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

# **post_debt_instrument_notation_screener_value_ranges_get**
> InlineResponse2004 post_debt_instrument_notation_screener_value_ranges_get()

Possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search.`

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/debtInstrument/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BondsAPIforDigitalPortals
from fds.sdk.BondsAPIforDigitalPortals.api import debt_instrument_api
from fds.sdk.BondsAPIforDigitalPortals.model.inline_object2 import InlineObject2
from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004 import InlineResponse2004
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.BondsAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BondsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = debt_instrument_api.DebtInstrumentApi(api_client)
    body = InlineObject2(
        data=DebtInstrumentNotationScreenerValueRangesGetData(
            validation=DebtInstrumentNotationScreenerSearchDataValidation(
                only_active=True,
                only_not_suspended=False,
                prices=DebtInstrumentNotationScreenerSearchDataValidationPrices(
                    quality="DLY",
                    latest=DebtInstrumentNotationScreenerSearchDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=DebtInstrumentNotationScreenerSearchDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=DebtInstrumentNotationScreenerSearchDataValidationValueUnit(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationValueUnitRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationValueUnitExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=DebtInstrumentNotationScreenerSearchDataValidationMarket(
                    selection=DebtInstrumentNotationScreenerSearchDataValidationMarketSelection(
                        restrict=DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=DebtInstrumentNotationScreenerSearchDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                categorization=DebtInstrumentNotationScreenerSearchDataValidationCategorization(
                    restrict=DebtInstrumentNotationScreenerSearchDataValidationCategorizationRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataValidationCategorizationExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            life_cycle=DebtInstrumentNotationScreenerSearchDataLifeCycle(
                issue=DebtInstrumentNotationScreenerSearchDataLifeCycleIssue(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                maturity=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturity(
                    restriction=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction(
                        date=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionDate(
                            start=dateutil_parser('1970-01-01').date(),
                            end=dateutil_parser('1970-01-01').date(),
                        ),
                        remaining_term_years=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYears(
                            minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    perpetual="only",
                ),
                callable=True,
            ),
            subordinated=True,
            rating=DebtInstrumentNotationScreenerValueRangesGetDataRating(
                system=DebtInstrumentNotationScreenerValueRangesGetDataRatingSystem(
                    ids=[
                        3.14,
                    ],
                ),
                grade=DebtInstrumentNotationScreenerSearchDataRatingGrade(
                    minimum=DebtInstrumentNotationScreenerSearchDataRatingGradeMinimum(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            issuer=DebtInstrumentNotationScreenerSearchDataIssuer(
                selection=DebtInstrumentNotationScreenerSearchDataIssuerSelection(
                    restrict=DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataIssuerSelectionExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                country=DebtInstrumentNotationScreenerSearchDataIssuerCountry(
                    restrict=DebtInstrumentNotationScreenerSearchDataIssuerCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=DebtInstrumentNotationScreenerSearchDataIssuerCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            issue=DebtInstrumentNotationScreenerSearchDataIssue(
                volume=DebtInstrumentNotationScreenerSearchDataIssueVolume(
                    currency=DebtInstrumentNotationScreenerSearchDataIssueVolumeCurrency(
                        restrict=DebtInstrumentNotationScreenerSearchDataIssueVolumeCurrencyRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=DebtInstrumentNotationScreenerSearchDataIssueVolumeCurrencyExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
            ),
            trading_volume=DebtInstrumentNotationScreenerSearchDataTradingVolume(
                otc=DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc(
                    minimum=DebtInstrumentNotationScreenerSearchDataTradingVolumeOtcMinimum(
                        minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            compliance=DebtInstrumentNotationScreenerSearchDataCompliance(
                germany=DebtInstrumentNotationScreenerSearchDataComplianceGermany(
                    trustee_eligible=True,
                ),
            ),
            coupon=DebtInstrumentNotationScreenerSearchDataCoupon(
                occurrence=DebtInstrumentNotationScreenerSearchDataCouponOccurrence(
                    type=[
                        "never",
                    ],
                    frequency=DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                current_interest_rate=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRate(
                    type=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateType(
                        ids=[
                            3.14,
                        ],
                    ),
                    value=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue(
                        minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            _yield=DebtInstrumentNotationScreenerSearchDataYield(
                current=DebtInstrumentNotationScreenerSearchDataYieldCurrent(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                to_maturity=DebtInstrumentNotationScreenerSearchDataYieldToMaturity(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                spread=DebtInstrumentNotationScreenerSearchDataYieldSpread(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            macaulay_duration=DebtInstrumentNotationScreenerSearchDataMacaulayDuration(
                minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                    value=3.14,
                    inclusive=True,
                ),
                maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                    value=3.14,
                    inclusive=True,
                ),
            ),
            sensitivities=DebtInstrumentNotationScreenerSearchDataSensitivities(
                base_point_value=DebtInstrumentNotationScreenerSearchDataSensitivitiesBasePointValue(
                    minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                modified_duration=DebtInstrumentNotationScreenerSearchDataSensitivitiesModifiedDuration(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                elasticity=DebtInstrumentNotationScreenerSearchDataSensitivitiesElasticity(
                    minimum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                convexity=DebtInstrumentNotationScreenerSearchDataSensitivitiesConvexity(
                    minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            traded_value=DebtInstrumentNotationScreenerSearchDataTradedValue(
                days30=DebtInstrumentNotationScreenerSearchDataTradedValueDays30(
                    sum=DebtInstrumentNotationScreenerSearchDataTradedValueDays30Sum(
                        minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    average=DebtInstrumentNotationScreenerSearchDataTradedValueDays30Average(
                        minimum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
        ),
        meta=DebtInstrumentNotationScreenerValueRangesGetMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject2 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search.`
        api_response = api_instance.post_debt_instrument_notation_screener_value_ranges_get(body=body)
        pprint(api_response)
    except fds.sdk.BondsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling DebtInstrumentApi->post_debt_instrument_notation_screener_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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

