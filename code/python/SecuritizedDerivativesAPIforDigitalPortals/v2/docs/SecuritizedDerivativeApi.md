# fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.SecuritizedDerivativeApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_securitized_derivative_barrier_type_list**](SecuritizedDerivativeApi.md#get_securitized_derivative_barrier_type_list) | **GET** /securitizedDerivative/barrier/type/list | List of barrier types.
[**get_securitized_derivative_get**](SecuritizedDerivativeApi.md#get_securitized_derivative_get) | **GET** /securitizedDerivative/get | Fundamental data for a single securitized derivative.
[**get_securitized_derivative_key_figures_notation_get**](SecuritizedDerivativeApi.md#get_securitized_derivative_key_figures_notation_get) | **GET** /securitizedDerivative/keyFigures/notation/get | Notation-based key figures of a securitized derivative.
[**get_securitized_derivative_underlying_list**](SecuritizedDerivativeApi.md#get_securitized_derivative_underlying_list) | **GET** /securitizedDerivative/underlying/list | List of underlyings with barrier and cash flow information.
[**post_securitized_derivative_issuer_search**](SecuritizedDerivativeApi.md#post_securitized_derivative_issuer_search) | **POST** /securitizedDerivative/issuer/search | Search for issuers of securitized derivatives.
[**post_securitized_derivative_notation_ranking_intraday_list**](SecuritizedDerivativeApi.md#post_securitized_derivative_notation_ranking_intraday_list) | **POST** /securitizedDerivative/notation/ranking/intraday/list | Ranking of securitized derivatives&#39; notations using intraday figures.
[**post_securitized_derivative_notation_screener_search**](SecuritizedDerivativeApi.md#post_securitized_derivative_notation_screener_search) | **POST** /securitizedDerivative/notation/screener/search | Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
[**post_securitized_derivative_notation_screener_value_ranges_get**](SecuritizedDerivativeApi.md#post_securitized_derivative_notation_screener_value_ranges_get) | **POST** /securitizedDerivative/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/securitizedDerivative/notation/screener/search&#x60;.


# **get_securitized_derivative_barrier_type_list**
> InlineResponse2001 get_securitized_derivative_barrier_type_list()

List of barrier types.

List of barrier types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of barrier types.
        api_response = api_instance.get_securitized_derivative_barrier_type_list(attributes=attributes)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_barrier_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

# **get_securitized_derivative_get**
> InlineResponse200 get_securitized_derivative_get(id)

Fundamental data for a single securitized derivative.

Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response200 import InlineResponse200
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    id = "id_example" # str | Identifier of the instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Fundamental data for a single securitized derivative.
        api_response = api_instance.get_securitized_derivative_get(id)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Fundamental data for a single securitized derivative.
        api_response = api_instance.get_securitized_derivative_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_get: %s\n" % e)
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

# **get_securitized_derivative_key_figures_notation_get**
> InlineResponse2003 get_securitized_derivative_key_figures_notation_get(id)

Notation-based key figures of a securitized derivative.

Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute `underlyings.coverRatio` in endpoint `/securitizedDerivative/underlying/list`.  Various barrier types (e.g. strike, knock in) - see endpoint `/securitizedDerivative/barrier/type/list`.  Exercise right - see attribute `exercise.right` in endpoint `/securitizedDerivative/get`.  Issue price - see attribute `issue.price` in endpoint `/securitizedDerivative/get`.  Ask price - see attribute `prices.ask`.  Bid price - see attribute `prices.bid`.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    id = "id_example" # str | Identifier of a notation.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Notation-based key figures of a securitized derivative.
        api_response = api_instance.get_securitized_derivative_key_figures_notation_get(id)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_key_figures_notation_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Notation-based key figures of a securitized derivative.
        api_response = api_instance.get_securitized_derivative_key_figures_notation_get(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_key_figures_notation_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of a notation. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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

# **get_securitized_derivative_underlying_list**
> InlineResponse2007 get_securitized_derivative_underlying_list(id)

List of underlyings with barrier and cash flow information.

Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2007 import InlineResponse2007
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    # example passing only required values which don't have defaults set
    try:
        # List of underlyings with barrier and cash flow information.
        api_response = api_instance.get_securitized_derivative_underlying_list(id)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_underlying_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List of underlyings with barrier and cash flow information.
        api_response = api_instance.get_securitized_derivative_underlying_list(id, attributes=attributes, language=language)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_underlying_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

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

# **post_securitized_derivative_issuer_search**
> InlineResponse2002 post_securitized_derivative_issuer_search()

Search for issuers of securitized derivatives.

Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2002 import InlineResponse2002
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_object import InlineObject
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    body = InlineObject(
        data=SecuritizedDerivativeIssuerSearchData(
            role="issuerGroup",
            name=SecuritizedDerivativeIssuerSearchDataName(
                search_value="BA#$!T?W$sYJ4ha$7S$3Bm",
            ),
            category=SecuritizedDerivativeIssuerSearchDataCategory(
                ids=[
                    3.14,
                ],
            ),
            underlying=SecuritizedDerivativeIssuerSearchDataUnderlying(
                instrument=SecuritizedDerivativeIssuerSearchDataUnderlyingInstrument(
                    ids=[
                        "ids_example",
                    ],
                ),
            ),
            factor_certificates=SecuritizedDerivativeIssuerSearchDataFactorCertificates(
                effective_underlying=SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying(
                    instrument=SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "ids_example",
                        ],
                    ),
                ),
            ),
            registration_country=SecuritizedDerivativeIssuerSearchDataRegistrationCountry(
                ids=[
                    3.14,
                ],
            ),
            market=SecuritizedDerivativeIssuerSearchDataMarket(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=SecuritizedDerivativeIssuerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Search for issuers of securitized derivatives.
        api_response = api_instance.post_securitized_derivative_issuer_search(body=body)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_issuer_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

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

# **post_securitized_derivative_notation_ranking_intraday_list**
> InlineResponse2004 post_securitized_derivative_notation_ranking_intraday_list()

Ranking of securitized derivatives' notations using intraday figures.

Ranking of securitized derivatives' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, the selection of the notation depends on the sort attribute: - absolute and relative performance (see the response attributes `trade.performance.absolute` and `trade.performance.relative`) - the notation with the most recent trade price is used - number trades, trading value and trading volume (see the response attributes `accumulated.numberTrades`, `accumulated.tradingVolume` and `accumulated.tradingValue`) - the notation with highest (lowest) value is used  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameters `valueUnit` and/or `currency` have not been specified.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_object1 import InlineObject1
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2004 import InlineResponse2004
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    body = InlineObject1(
        data=SecuritizedDerivativeNotationRankingIntradayListData(
            prices=SecuritizedDerivativeNotationRankingIntradayListDataPrices(
                quality="DLY",
            ),
            value_unit=SecuritizedDerivativeNotationRankingIntradayListDataValueUnit(
                id=3.14,
            ),
            currency=SecuritizedDerivativeNotationRankingIntradayListDataCurrency(
                id=3.14,
            ),
            market=SecuritizedDerivativeNotationRankingIntradayListDataMarket(
                ids=[
                    3.14,
                ],
            ),
            instrument_restriction_list=SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList(
                ids=[
                    3.14,
                ],
            ),
            notation_restriction_list=SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList(
                ids=[
                    3.14,
                ],
            ),
            category=SecuritizedDerivativeNotationRankingIntradayListDataCategory(
                ids=[
                    3.14,
                ],
            ),
            registration_country=SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry(
                ids=[
                    3.14,
                ],
            ),
            life_cycle=SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle(
                maturity=SecuritizedDerivativeNotationRankingIntradayListDataLifeCycleMaturity(
                    perpetual="include",
                ),
            ),
            issuer=SecuritizedDerivativeNotationRankingIntradayListDataIssuer(
                ids=[
                    3.14,
                ],
            ),
            exercise=SecuritizedDerivativeNotationRankingIntradayListDataExercise(
                right="put",
            ),
            underlying=SecuritizedDerivativeNotationRankingIntradayListDataUnderlying(
                instrument=SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument(
                    ids=[
                        "ids_example",
                    ],
                ),
                notation=SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation(
                    ids=[
                        "ids_example",
                    ],
                ),
            ),
            factor_certificates=SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates(
                effective_underlying=SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificatesEffectiveUnderlying(
                    instrument=SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "ids_example",
                        ],
                    ),
                ),
                participation="long",
            ),
            knocked_out="exclude",
            knocked_in="exclude",
        ),
        meta=SecuritizedDerivativeNotationRankingIntradayListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=[
                "trade.performance.absolute",
            ],
            pagination=SecuritizedDerivativeNotationRankingIntradayListMetaPagination(
                offset=0,
                limit=0,
            ),
        ),
    ) # InlineObject1 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Ranking of securitized derivatives' notations using intraday figures.
        api_response = api_instance.post_securitized_derivative_notation_ranking_intraday_list(body=body)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_notation_ranking_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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

# **post_securitized_derivative_notation_screener_search**
> InlineResponse2006 post_securitized_derivative_notation_screener_search()

Screener for securitized derivatives's notations based on securitized derivatives-specific parameters.

Screener for securitized derivatives's notations based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifiers used as parameters must be valid and entitled.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.   The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.   The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2006 import InlineResponse2006
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_object3 import InlineObject3
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    body = InlineObject3(
        data=SecuritizedDerivativeNotationScreenerSearchData(
            validation=SecuritizedDerivativeNotationScreenerSearchDataValidation(
                only_active=True,
                prices=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationPrices(
                    quality="DLY",
                    latest=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnit(
                    selection=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection(
                        restrict=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
                market=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket(
                    selection=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection(
                        restrict=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_restriction_list=SecuritizedDerivativeNotationScreenerSearchDataValidationInstrumentRestrictionList(
                    ids=[
                        3.14,
                    ],
                ),
                notation_restriction_list=SecuritizedDerivativeNotationScreenerSearchDataValidationNotationRestrictionList(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            category=SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory(
                ids=[
                    3.14,
                ],
            ),
            registration_country=SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry(
                ids=[
                    3.14,
                ],
            ),
            life_cycle=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle(
                issue=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                maturity=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity(
                    restriction=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction(
                        date=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate(
                            start=dateutil_parser('1970-01-01').date(),
                            end=dateutil_parser('1970-01-01').date(),
                        ),
                        remaining_term_days=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    perpetual="only",
                ),
                callable=True,
                valuation=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                repayment=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
            ),
            issuer=SecuritizedDerivativeNotationRankingIntradayListDataIssuer(
                ids=[
                    3.14,
                ],
            ),
            exercise=SecuritizedDerivativeNotationScreenerValueRangesGetDataExercise(
                right="put",
                style="american",
            ),
            settlement="cash",
            collateralized=True,
            quanto=True,
            capital_protection=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtection(
                minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                    value=3.14,
                    inclusive=True,
                ),
                maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                    value=3.14,
                    inclusive=True,
                ),
            ),
            underlying=SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying(
                instrument=SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument(
                    ids=[
                        "ids_example",
                    ],
                ),
                notation=SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation(
                    ids=[
                        "ids_example",
                    ],
                ),
            ),
            cash_flow_currency=SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency(
                id=3.14,
            ),
            single_barriers=[
                SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers(
                    type="strike",
                    observation=SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation(
                        type="continuous",
                    ),
                    level=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel(
                        absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsolute(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    distance=SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance(
                        absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    breach=SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach(
                        breached="exclude",
                    ),
                    cash_flow=SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            range_barriers=[
                SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers(
                    type="rangeKnockOut",
                    observation=SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1(
                        type="continuous",
                    ),
                    upper=SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper(
                        level=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel(
                            absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsolute(
                                minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    lower=SecuritizedDerivativeNotationScreenerValueRangesGetDataLower(
                        level=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel(
                            absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsolute(
                                minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    breach=SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach(
                        breached="exclude",
                    ),
                    cash_flow=SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            factor_certificates=SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificates(
                effective_underlying=SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificatesEffectiveUnderlying(
                    instrument=SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "ids_example",
                        ],
                    ),
                ),
                participation="long",
                constant_leverage=SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificatesConstantLeverage(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            nominal_currency=SecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrency(
                id=3.14,
            ),
            current_interest_rate=SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRate(
                type="fixed",
                value=SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRateValue(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            key_figures=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures(
                bonus_yield=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYield(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                sideways_yield=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                maximum_yield=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYield(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                agio=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgio(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgioAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgioRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgioAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                discount=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscount(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscountAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscountRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                break_even=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEven(
                    break_even_point=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenBreakEvenPoint(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    distance=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance(
                        absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceAbsolute(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceRelative(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
                spread=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpread(
                    harmonized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpreadHarmonized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpreadRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                delta=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta(
                    effective=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaUnadjusted(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                theta_one_week=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek(
                    effective=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                vega=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVega(
                    effective=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVegaEffective(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVegaUnadjusted(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                leverage=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresLeverage(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                omega=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                implied_volatility=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresImpliedVolatility(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                intrinsic_value=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresIntrinsicValue(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                time_value=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresTimeValue(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                outperformance_point=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOutperformancePoint(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                parity=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresParity(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            performance=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformance(
                intraday=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceIntraday(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                since_issue=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceSinceIssue(
                    ask=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceSinceIssueAsk(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    bid=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceSinceIssueBid(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                end_of_day=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay(
                    day1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility(
                week1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                month1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months6=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years5=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year_to_date=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=SecuritizedDerivativeNotationScreenerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=[
                "symbol",
            ],
            pagination=SecuritizedDerivativeNotationScreenerSearchMetaPagination(
                offset=0,
                limit=0,
            ),
        ),
    ) # InlineObject3 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Screener for securitized derivatives's notations based on securitized derivatives-specific parameters.
        api_response = api_instance.post_securitized_derivative_notation_screener_search(body=body)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_notation_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

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

# **post_securitized_derivative_notation_screener_value_ranges_get**
> InlineResponse2005 post_securitized_derivative_notation_screener_value_ranges_get()

Possible values and value ranges for the parameters used in the endpoint `/securitizedDerivative/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/securitizedDerivatives/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches, only the notation with the best market priority (according to the parameter `market.priority`) or, in the absence of market priorities, with the highest monetary trading volume, averaged over 30 trading days, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/securitizedDerivatives/notation/screener/search` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_object2 import InlineObject2
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.inline_response2005 import InlineResponse2005
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)
    body = InlineObject2(
        data=SecuritizedDerivativeNotationScreenerValueRangesGetData(
            validation=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidation(
                only_active=True,
                prices=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationPrices(
                    quality="DLY",
                    latest=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                value_unit=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnit(
                    selection=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection(
                        restrict=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
                market=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket(
                    selection=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection(
                        restrict=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_restriction_list=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList(
                    ids=[
                        3.14,
                    ],
                ),
                notation_restriction_list=SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationNotationRestrictionList(
                    ids=[
                        3.14,
                    ],
                ),
            ),
            category=SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory(
                ids=[
                    3.14,
                ],
            ),
            registration_country=SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry(
                ids=[
                    3.14,
                ],
            ),
            life_cycle=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle(
                issue=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleIssue(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                maturity=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity(
                    restriction=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction(
                        date=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate(
                            start=dateutil_parser('1970-01-01').date(),
                            end=dateutil_parser('1970-01-01').date(),
                        ),
                        remaining_term_days=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    perpetual="only",
                ),
                callable=True,
                valuation=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
                repayment=SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleRepayment(
                    start=dateutil_parser('1970-01-01').date(),
                    end=dateutil_parser('1970-01-01').date(),
                ),
            ),
            issuer=SecuritizedDerivativeNotationRankingIntradayListDataIssuer(
                ids=[
                    3.14,
                ],
            ),
            exercise=SecuritizedDerivativeNotationScreenerValueRangesGetDataExercise(
                right="put",
                style="american",
            ),
            settlement="cash",
            collateralized=True,
            quanto=True,
            capital_protection=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtection(
                minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                    value=3.14,
                    inclusive=True,
                ),
                maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                    value=3.14,
                    inclusive=True,
                ),
            ),
            underlying=SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying(
                instrument=SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument(
                    ids=[
                        "ids_example",
                    ],
                ),
                notation=SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation(
                    ids=[
                        "ids_example",
                    ],
                ),
            ),
            cash_flow_currency=SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency(
                id=3.14,
            ),
            single_barriers=[
                SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers(
                    type="strike",
                    observation=SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation(
                        type="continuous",
                    ),
                    level=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel(
                        absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsolute(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    distance=SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance(
                        absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    breach=SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach(
                        breached="exclude",
                    ),
                    cash_flow=SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            range_barriers=[
                SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers(
                    type="rangeKnockOut",
                    observation=SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1(
                        type="continuous",
                    ),
                    upper=SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper(
                        level=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel(
                            absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsolute(
                                minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    lower=SecuritizedDerivativeNotationScreenerValueRangesGetDataLower(
                        level=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel(
                            absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsolute(
                                minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                                maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                    value=3.14,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    breach=SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach(
                        breached="exclude",
                    ),
                    cash_flow=SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            factor_certificates=SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificates(
                effective_underlying=SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificatesEffectiveUnderlying(
                    instrument=SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "ids_example",
                        ],
                    ),
                ),
                participation="long",
                constant_leverage=SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificatesConstantLeverage(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            nominal_currency=SecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrency(
                id=3.14,
            ),
            current_interest_rate=SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRate(
                type="fixed",
                value=SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRateValue(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            key_figures=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures(
                bonus_yield=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYield(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                sideways_yield=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                maximum_yield=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYield(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                agio=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgio(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgioAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgioRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    annualized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgioAnnualized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                discount=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscount(
                    absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscountAbsolute(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscountRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                break_even=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEven(
                    break_even_point=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenBreakEvenPoint(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    distance=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance(
                        absolute=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceAbsolute(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceRelative(
                            minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
                spread=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpread(
                    harmonized=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpreadHarmonized(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    relative=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpreadRelative(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                delta=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta(
                    effective=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaUnadjusted(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                theta_one_week=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek(
                    effective=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                vega=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVega(
                    effective=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVegaEffective(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVegaUnadjusted(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                leverage=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresLeverage(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                omega=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                implied_volatility=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresImpliedVolatility(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                intrinsic_value=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresIntrinsicValue(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                time_value=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresTimeValue(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                outperformance_point=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOutperformancePoint(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                parity=SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresParity(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
            performance=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformance(
                intraday=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceIntraday(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                since_issue=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceSinceIssue(
                    ask=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceSinceIssueAsk(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    bid=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceSinceIssueBid(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                end_of_day=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay(
                    day1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate(
                        minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility(
                week1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                month1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                months6=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year1=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years3=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                years5=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                year_to_date=SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate(
                    minimum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=SecuritizedDerivativeNotationScreenerValueRangesGetMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject2 |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Possible values and value ranges for the parameters used in the endpoint `/securitizedDerivative/notation/screener/search`.
        api_response = api_instance.post_securitized_derivative_notation_screener_value_ranges_get(body=body)
        pprint(api_response)
    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_notation_screener_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

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

