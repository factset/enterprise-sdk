# fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.SecuritizedDerivativeApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_securitized_derivative_barrier_type_list**](SecuritizedDerivativeApi.md#get_securitized_derivative_barrier_type_list) | **GET** /securitized-derivative/barrier/type/list | List of barrier types.
[**get_securitized_derivative_get**](SecuritizedDerivativeApi.md#get_securitized_derivative_get) | **GET** /securitized-derivative/get | Fundamental data for a single securitized derivative.
[**get_securitized_derivative_key_figures_notation_get**](SecuritizedDerivativeApi.md#get_securitized_derivative_key_figures_notation_get) | **GET** /securitized-derivative/key-figures/notation/get | Notation-based key figures of a securitized derivative.
[**get_securitized_derivative_underlying_list**](SecuritizedDerivativeApi.md#get_securitized_derivative_underlying_list) | **GET** /securitized-derivative/underlying/list | List of underlyings with barrier and cash flow information.
[**post_securitized_derivative_issuer_search**](SecuritizedDerivativeApi.md#post_securitized_derivative_issuer_search) | **POST** /securitized-derivative/issuer/search | Search for issuers of securitized derivatives.
[**post_securitized_derivative_notation_ranking_intraday_list**](SecuritizedDerivativeApi.md#post_securitized_derivative_notation_ranking_intraday_list) | **POST** /securitized-derivative/notation/ranking/intraday/list | Ranking of securitized derivatives&#39; notations using intraday figures.
[**post_securitized_derivative_notation_screener_search**](SecuritizedDerivativeApi.md#post_securitized_derivative_notation_screener_search) | **POST** /securitized-derivative/notation/screener/search | Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
[**post_securitized_derivative_notation_screener_value_ranges_get**](SecuritizedDerivativeApi.md#post_securitized_derivative_notation_screener_value_ranges_get) | **POST** /securitized-derivative/notation/screener/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivative/notation/screener/search&#x60;.



# **get_securitized_derivative_barrier_type_list**
> InlineResponse2001 get_securitized_derivative_barrier_type_list()

List of barrier types.

List of barrier types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # List of barrier types.
        # example passing only required values which don't have defaults set
        # and optional values
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
> InlineResponse200 get_securitized_derivative_get(identifier, identifier_type)

Fundamental data for a single securitized derivative.

Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "FDS-US" # str | Identifier to resolve.
    identifier_type = "tickerRegion" # str | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # Fundamental data for a single securitized derivative.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_securitized_derivative_get(identifier, identifier_type, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_get: %s\n" % e)
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

# **get_securitized_derivative_key_figures_notation_get**
> InlineResponse2003 get_securitized_derivative_key_figures_notation_get(identifier, identifier_type)

Notation-based key figures of a securitized derivative.

Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute `underlyings.coverRatio` in endpoint `/securitized-derivative/underlying/list`.  Various barrier types (e.g. strike, knock in) - see endpoint `/securitized-derivative/barrier/type/list`.  Exercise right - see attribute `exercise.right` in endpoint `/securitized-derivative/get`.  Issue price - see attribute `issue.price` in endpoint `/securitized-derivative/get`.  Ask price - see attribute `prices.ask`.  Bid price - see attribute `prices.bid`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "FDS-US" # str | Identifier to resolve.
    identifier_type = "tickerRegion" # str | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "en" # str | ISO 639-1 code of the language. (optional)

    try:
        # Notation-based key figures of a securitized derivative.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_securitized_derivative_key_figures_notation_get(identifier, identifier_type, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_key_figures_notation_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Identifier to resolve. |
 **identifier_type** | **str**| Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

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
> InlineResponse2007 get_securitized_derivative_underlying_list(identifier, identifier_type)

List of underlyings with barrier and cash flow information.

Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "FDS-US" # str | Identifier to resolve.
    identifier_type = "tickerRegion" # str | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_language = "de" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of underlyings with barrier and cash flow information.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_securitized_derivative_underlying_list(identifier, identifier_type, attributes=attributes, meta_language=meta_language)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->get_securitized_derivative_underlying_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Identifier to resolve. |
 **identifier_type** | **str**| Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_language** | **str**| ISO 639-1 code of the language. | [optional]

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
> InlineResponse2002 post_securitized_derivative_issuer_search(post_securitized_derivative_issuer_search_request)

Search for issuers of securitized derivatives.

Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_securitized_derivative_issuer_search_request = PostSecuritizedDerivativeIssuerSearchRequest(
        data=PostSecuritizedDerivativeIssuerSearchRequestData(
            role="issuerGroup",
            name=PostSecuritizedDerivativeIssuerSearchRequestDataName(
                search_value="Lorem ipsum",
            ),
            with_price_entitlement=True,
            category=PostSecuritizedDerivativeIssuerSearchRequestDataCategory(
                ids=[
                    5,
                ],
            ),
            underlying=PostSecuritizedDerivativeIssuerSearchRequestDataUnderlying(
                instrument=PostSecuritizedDerivativeIssuerSearchRequestDataUnderlyingInstrument(
                    ids=[
                        "2002",
                    ],
                ),
            ),
            factor_certificates=PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificates(
                effective_underlying=PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificatesEffectiveUnderlying(
                    instrument=PostSecuritizedDerivativeIssuerSearchRequestDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "5005",
                        ],
                    ),
                ),
            ),
            registration_country=PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountry(
                restrict=PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountryRestrict(
                    ids=[
                        3,
                    ],
                ),
                exclude=PostSecuritizedDerivativeIssuerSearchRequestDataRegistrationCountryExclude(
                    ids=[
                        3,
                    ],
                ),
            ),
            market=PostSecuritizedDerivativeIssuerSearchRequestDataMarket(
                restrict=PostSecuritizedDerivativeIssuerSearchRequestDataMarketRestrict(
                    ids=[
                        1,
                    ],
                ),
                exclude=PostSecuritizedDerivativeIssuerSearchRequestDataMarketExclude(
                    ids=[
                        4,
                    ],
                ),
            ),
        ),
        meta=PostSecuritizedDerivativeIssuerSearchRequestMeta(
            attributes=AttributesMember([]),
        ),
    ) # PostSecuritizedDerivativeIssuerSearchRequest | Request Body

    try:
        # Search for issuers of securitized derivatives.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_securitized_derivative_issuer_search(post_securitized_derivative_issuer_search_request)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_issuer_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_securitized_derivative_issuer_search_request** | [**PostSecuritizedDerivativeIssuerSearchRequest**](PostSecuritizedDerivativeIssuerSearchRequest.md)| Request Body |

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_securitized_derivative_notation_ranking_intraday_list_request = PostSecuritizedDerivativeNotationRankingIntradayListRequest(
        data=PostSecuritizedDerivativeNotationRankingIntradayListRequestData(
            prices=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices(
                quality="DLY",
            ),
            value_unit=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit(
                id=5,
            ),
            currency=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency(
                id=4,
            ),
            market=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket(
                ids=[
                    2,
                ],
            ),
            instrument_restriction_list=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList(
                ids=[
                    4,
                ],
            ),
            notation_restriction_list=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList(
                ids=[
                    2,
                ],
            ),
            category=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory(
                ids=[
                    3,
                ],
            ),
            registration_country=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry(
                ids=[
                    5,
                ],
            ),
            life_cycle=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle(
                maturity=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycleMaturity(
                    perpetual="include",
                ),
            ),
            issuer=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer(
                ids=[
                    3,
                ],
            ),
            exercise=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise(
                right="put",
            ),
            underlying=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying(
                instrument=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingInstrument(
                    ids=[
                        "4004",
                    ],
                ),
                notation=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingNotation(
                    ids=[
                        "2002",
                    ],
                ),
            ),
            factor_certificates=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates(
                effective_underlying=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificatesEffectiveUnderlying(
                    instrument=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "2002",
                        ],
                    ),
                ),
                participation="long",
            ),
            knocked_out="exclude",
            knocked_in="exclude",
            performance=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance(
                relative=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelative(
                    minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                        value=0.4,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=PostSecuritizedDerivativeNotationRankingIntradayListRequestMeta(
            attributes=AttributesMember([]),
            language=LanguageMember("en"),
            sort=["-trade.performance.relative"],
            pagination=PostSecuritizedDerivativeNotationRankingIntradayListRequestMetaPagination(
                offset=0,
                limit=10,
            ),
        ),
    ) # PostSecuritizedDerivativeNotationRankingIntradayListRequest | Request Body (optional)

    try:
        # Ranking of securitized derivatives' notations using intraday figures.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_securitized_derivative_notation_ranking_intraday_list(post_securitized_derivative_notation_ranking_intraday_list_request=post_securitized_derivative_notation_ranking_intraday_list_request)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_notation_ranking_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_securitized_derivative_notation_ranking_intraday_list_request** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequest**](PostSecuritizedDerivativeNotationRankingIntradayListRequest.md)| Request Body | [optional]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_securitized_derivative_notation_screener_search_request = PostSecuritizedDerivativeNotationScreenerSearchRequest(
        data=PostSecuritizedDerivativeNotationScreenerSearchRequestData(
            validation=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation(
                only_active=True,
                prices=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPrices(
                    quality="DLY",
                    latest=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationPricesLatest(
                        available_only=False,
                        minimum_date=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                    ),
                    previous=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesPrevious(
                        available_only=False,
                        minimum_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    ),
                ),
                value_unit=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnit(
                    selection=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnitSelection(
                        restrict=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationValueUnitSelectionRestrict(
                            ids=[
                                1,
                            ],
                        ),
                        exclude=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationValueUnitSelectionExclude(
                            ids=[
                                2,
                            ],
                        ),
                    ),
                ),
                market=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarket(
                    selection=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarketSelection(
                        restrict=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarketSelectionRestrict(
                            ids=[
                                4,
                            ],
                        ),
                        exclude=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarketSelectionExclude(
                            ids=[
                                1,
                            ],
                        ),
                    ),
                    priority=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationMarketPriority(
                        ids=[
                            4,
                        ],
                    ),
                ),
                instrument_restriction_list=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationInstrumentRestrictionList(
                    ids=[
                        5,
                    ],
                ),
                notation_restriction_list=PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidationNotationRestrictionList(
                    ids=[
                        4,
                    ],
                ),
            ),
            category=PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory(
                ids=[
                    4,
                ],
            ),
            registration_country=PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry(
                ids=[
                    3,
                ],
            ),
            life_cycle=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle(
                issue=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleIssue(
                    start=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                    end=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                ),
                maturity=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturity(
                    restriction=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestriction(
                        date=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionDate(
                            start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                            end=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                        ),
                        remaining_term_days=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionRemainingTermDays(
                            minimum=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum(
                                value=2.02,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum(
                                value=2.02,
                                inclusive=True,
                            ),
                        ),
                    ),
                    perpetual="only",
                ),
                callable=False,
                valuation=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleValuation(
                    start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                ),
                repayment=PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleRepayment(
                    start=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                    end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                ),
            ),
            issuer=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer(
                ids=[
                    3,
                ],
            ),
            exercise=PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise(
                right="call",
                style="american",
            ),
            settlement="physical",
            collateralized=True,
            quanto=True,
            capital_protection=PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection(
                minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                    value=0.4,
                    inclusive=True,
                ),
                maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                    value=0,
                    inclusive=True,
                ),
            ),
            underlying=PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying(
                instrument=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingInstrument(
                    ids=[
                        "4004",
                    ],
                ),
                notation=PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlyingNotation(
                    ids=[
                        "5005",
                    ],
                ),
            ),
            cash_flow_currency=PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency(
                id=4,
            ),
            single_barriers=[
                PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems(
                    type="cap",
                    observation=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsObservation(
                        type="eod",
                    ),
                    level=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsLevel(
                        absolute=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsLevelAbsolute(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                                value=4.04,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                                value=5.05,
                                inclusive=True,
                            ),
                        ),
                    ),
                    distance=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsDistance(
                        absolute=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsDistanceAbsolute(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                                value=3.03,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                                value=3.1415,
                                inclusive=True,
                            ),
                        ),
                        relative=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsDistanceRelative(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                                value=0.5,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMaximum(
                                value=0.1,
                                inclusive=True,
                            ),
                        ),
                    ),
                    breach=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach(
                        breached="exclude",
                    ),
                    cash_flow=PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItemsCashFlow(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                            value=1.01,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                            value=4.04,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            range_barriers=[
                PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems(
                    type="rangeKnockOut",
                    observation=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsObservation(
                        type="eod",
                    ),
                    upper=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpper(
                        level=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpperLevel(
                            absolute=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsUpperLevelAbsolute(
                                minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                                    value=1.01,
                                    inclusive=True,
                                ),
                                maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                                    value=2.02,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    lower=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLower(
                        level=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLowerLevel(
                            absolute=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsLowerLevelAbsolute(
                                minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                                    value=4.04,
                                    inclusive=True,
                                ),
                                maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                                    value=1.01,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    breach=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach(
                        breached="exclude",
                    ),
                    cash_flow=PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItemsCashFlow(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                            value=4.04,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            factor_certificates=PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates(
                effective_underlying=PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificatesEffectiveUnderlying(
                    instrument=PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "1001",
                        ],
                    ),
                ),
                participation="short",
                constant_leverage=PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificatesConstantLeverage(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                        value=4.04,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
            ),
            nominal_currency=PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency(
                id=3,
            ),
            current_interest_rate=PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate(
                type="variable",
                value=PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRateValue(
                    minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                        value=0.4,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                        value=0.4,
                        inclusive=True,
                    ),
                ),
            ),
            key_figures=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures(
                bonus_yield=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYield(
                    absolute=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMaximum(
                            value=1,
                            inclusive=True,
                        ),
                    ),
                ),
                sideways_yield=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSidewaysYield(
                    absolute=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSidewaysYieldAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                            value=4.04,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                            value=4.04,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSidewaysYieldRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMaximum(
                            value=1,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSidewaysYieldAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                            value=0.5,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                ),
                maximum_yield=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresMaximumYield(
                    absolute=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresMaximumYieldAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                            value=4.04,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                            value=4.04,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresMaximumYieldRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMaximum(
                            value=1,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresMaximumYieldAnnualized(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                ),
                agio=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgio(
                    absolute=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                            value=4.04,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                            value=0.3,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresAgioAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                            value=0.1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                ),
                discount=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresDiscount(
                    absolute=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresDiscountAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonizedMinimum(
                            value=2.02,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresDiscountRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                            value=0.1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                            value=0.4,
                            inclusive=True,
                        ),
                    ),
                ),
                break_even=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBreakEven(
                    break_even_point=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBreakEvenBreakEvenPoint(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                            value=4.04,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                    distance=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBreakEvenDistance(
                        absolute=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBreakEvenDistanceAbsolute(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                                value=1.01,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                                value=4.04,
                                inclusive=True,
                            ),
                        ),
                        relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBreakEvenDistanceRelative(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                                value=0.2,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                                value=0,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
                spread=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSpread(
                    harmonized=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSpreadHarmonized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresSpreadRelative(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                            value=0.3,
                            inclusive=True,
                        ),
                    ),
                ),
                delta=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresDelta(
                    effective=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresDeltaEffective(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresDeltaUnadjusted(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                            value=5.05,
                            inclusive=True,
                        ),
                    ),
                ),
                theta_one_week=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresThetaOneWeek(
                    effective=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresThetaOneWeekEffective(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                            value=5.05,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                            value=1.01,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresThetaOneWeekUnadjusted(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                            value=5.05,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                ),
                vega=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresVega(
                    effective=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresVegaEffective(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresVegaEffectiveMaximum(
                            value=3.03,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresVegaUnadjusted(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                            value=1.01,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                            value=1.01,
                            inclusive=True,
                        ),
                    ),
                ),
                leverage=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresLeverage(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                        value=0.2,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                        value=0.4,
                        inclusive=True,
                    ),
                ),
                omega=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresOmega(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                        value=5.05,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
                implied_volatility=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresImpliedVolatility(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                intrinsic_value=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresIntrinsicValue(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                        value=5.05,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
                time_value=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresTimeValue(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonizedMinimum(
                        value=2.02,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                outperformance_point=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresOutperformancePoint(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                        value=3.1415,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                parity=PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresParity(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                        value=3.1415,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
            ),
            performance=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance(
                intraday=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceIntraday(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                        value=0.2,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                        value=0.3,
                        inclusive=True,
                    ),
                ),
                since_issue=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceSinceIssue(
                    ask=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceSinceIssueAsk(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualizedMinimum(
                            value=0,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    bid=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceSinceIssueBid(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                            value=0.5,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                            value=0.3,
                            inclusive=True,
                        ),
                    ),
                ),
                end_of_day=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDay(
                    day1=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayDay1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                            value=0.2,
                            inclusive=True,
                        ),
                    ),
                    week1=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayWeek1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                            value=0.5,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    month1=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayMonth1(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                    months3=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayMonths3(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                            value=0.2,
                            inclusive=True,
                        ),
                    ),
                    months6=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityMonths6(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                            value=0.1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                            value=0.4,
                            inclusive=True,
                        ),
                    ),
                    year1=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayYear1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                            value=0.3,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                            value=0.4,
                            inclusive=True,
                        ),
                    ),
                    years3=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayYears3(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                            value=0.3,
                            inclusive=True,
                        ),
                    ),
                    years5=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears5(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualizedMinimum(
                            value=0,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMaximum(
                            value=0.1,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformanceEndOfDayYearToDate(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                            value=0.5,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                            value=0.3,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility(
                week1=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityWeek1(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                        value=0.2,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                        value=0,
                        inclusive=True,
                    ),
                ),
                month1=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityMonth1(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                        value=1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                        value=0.4,
                        inclusive=True,
                    ),
                ),
                months3=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityMonths3(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                        value=0.3,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                        value=0.2,
                        inclusive=True,
                    ),
                ),
                months6=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityMonths6(
                    minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                        value=0.4,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                        value=0.2,
                        inclusive=True,
                    ),
                ),
                year1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityYear1(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                years3=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityYears3(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                years5=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityYears5(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                        value=0.3,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                year_to_date=PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatilityYearToDate(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualizedMinimum(
                        value=0,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                        value=0,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=PostSecuritizedDerivativeNotationScreenerSearchRequestMeta(
            attributes=AttributesMember([]),
            language=LanguageMember("en"),
            sort=["instrument.name"],
            pagination=PostSecuritizedDerivativeNotationScreenerSearchRequestMetaPagination(
                offset=0,
                limit=20,
            ),
        ),
    ) # PostSecuritizedDerivativeNotationScreenerSearchRequest | Request Body (optional)

    try:
        # Screener for securitized derivatives's notations based on securitized derivatives-specific parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_securitized_derivative_notation_screener_search(post_securitized_derivative_notation_screener_search_request=post_securitized_derivative_notation_screener_search_request)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_notation_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_securitized_derivative_notation_screener_search_request** | [**PostSecuritizedDerivativeNotationScreenerSearchRequest**](PostSecuritizedDerivativeNotationScreenerSearchRequest.md)| Request Body | [optional]

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

Possible values and value ranges for the parameters used in the endpoint `/securitized-derivative/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/securitized-derivatives/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/securitized-derivatives/notation/screener/search` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecuritizedDerivativesAPIforDigitalPortals
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.api import securitized_derivative_api
from fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.models import *
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
configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = securitized_derivative_api.SecuritizedDerivativeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_securitized_derivative_notation_screener_value_ranges_get_request = PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest(
        data=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestData(
            validation=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation(
                only_active=True,
                prices=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPrices(
                    quality="DLY",
                    latest=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesLatest(
                        available_only=False,
                        minimum_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    ),
                    previous=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationPricesPrevious(
                        available_only=False,
                        minimum_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    ),
                ),
                value_unit=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationValueUnit(
                    selection=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationValueUnitSelection(
                        restrict=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationValueUnitSelectionRestrict(
                            ids=[
                                1,
                            ],
                        ),
                        exclude=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationValueUnitSelectionExclude(
                            ids=[
                                3,
                            ],
                        ),
                    ),
                ),
                market=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationMarket(
                    selection=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationMarketSelection(
                        restrict=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationMarketSelectionRestrict(
                            ids=[
                                2,
                            ],
                        ),
                        exclude=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationMarketSelectionExclude(
                            ids=[
                                3,
                            ],
                        ),
                    ),
                    priority=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationMarketPriority(
                        ids=[
                            3,
                        ],
                    ),
                ),
                instrument_restriction_list=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationInstrumentRestrictionList(
                    ids=[
                        3,
                    ],
                ),
                notation_restriction_list=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidationNotationRestrictionList(
                    ids=[
                        3,
                    ],
                ),
            ),
            category=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory(
                ids=[
                    5,
                ],
            ),
            registration_country=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry(
                ids=[
                    1,
                ],
            ),
            life_cycle=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle(
                issue=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleIssue(
                    start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                ),
                maturity=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturity(
                    restriction=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturityRestriction(
                        date=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturityRestrictionDate(
                            start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                            end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                        ),
                        remaining_term_days=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturityRestrictionRemainingTermDays(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum(
                                value=3.1415,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum(
                                value=2.02,
                                inclusive=True,
                            ),
                        ),
                    ),
                    perpetual="exclude",
                ),
                callable=True,
                valuation=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleValuation(
                    start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                ),
                repayment=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycleRepayment(
                    start=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
                    end=dateutil_parser('Tue Dec 24 00:00:00 UTC 2024').date(),
                ),
            ),
            issuer=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer(
                ids=[
                    3,
                ],
            ),
            exercise=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise(
                right="call",
                style="european",
            ),
            settlement="either",
            collateralized=True,
            quanto=False,
            capital_protection=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection(
                minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                    value=1,
                    inclusive=True,
                ),
                maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                    value=0.3,
                    inclusive=True,
                ),
            ),
            underlying=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying(
                instrument=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlyingInstrument(
                    ids=[
                        "1001",
                    ],
                ),
                notation=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlyingNotation(
                    ids=[
                        "1001",
                    ],
                ),
            ),
            cash_flow_currency=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency(
                id=3,
            ),
            single_barriers=[
                PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems(
                    type="strike",
                    observation=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsObservation(
                        type="continuous",
                    ),
                    level=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsLevel(
                        absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsLevelAbsolute(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                                value=3.1415,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                                value=1.01,
                                inclusive=True,
                            ),
                        ),
                    ),
                    distance=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsDistance(
                        absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsDistanceAbsolute(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                                value=1.01,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                                value=1.01,
                                inclusive=True,
                            ),
                        ),
                        relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsDistanceRelative(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                                value=1,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                                value=0.2,
                                inclusive=True,
                            ),
                        ),
                    ),
                    breach=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach(
                        breached="exclude",
                    ),
                    cash_flow=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsCashFlow(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                            value=5.05,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            range_barriers=[
                PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems(
                    type="rangeKnockOut",
                    observation=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsObservation(
                        type="continuous",
                    ),
                    upper=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpper(
                        level=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpperLevel(
                            absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsUpperLevelAbsolute(
                                minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                                    value=3.1415,
                                    inclusive=True,
                                ),
                                maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                                    value=2.02,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    lower=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLower(
                        level=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLowerLevel(
                            absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsLowerLevelAbsolute(
                                minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                                    value=3.03,
                                    inclusive=True,
                                ),
                                maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                                    value=5.05,
                                    inclusive=True,
                                ),
                            ),
                        ),
                    ),
                    breach=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach(
                        breached="exclude",
                    ),
                    cash_flow=PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItemsCashFlow(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                ),
            ],
            factor_certificates=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates(
                effective_underlying=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesEffectiveUnderlying(
                    instrument=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesEffectiveUnderlyingInstrument(
                        ids=[
                            "4004",
                        ],
                    ),
                ),
                participation="short",
                constant_leverage=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverage(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                        value=3.1415,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                        value=1.01,
                        inclusive=True,
                    ),
                ),
            ),
            nominal_currency=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency(
                id=2,
            ),
            current_interest_rate=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate(
                type="fixed",
                value=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValue(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMaximum(
                        value=0.1,
                        inclusive=True,
                    ),
                ),
            ),
            key_figures=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures(
                bonus_yield=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYield(
                    absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                            value=1.01,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                            value=5.05,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                            value=0.5,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMaximum(
                            value=1,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                ),
                sideways_yield=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYield(
                    absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                            value=3.1415,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelative(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualizedMinimum(
                            value=0,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                ),
                maximum_yield=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYield(
                    absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAbsoluteMinimum(
                            value=3.03,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                            value=5.05,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldRelative(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                            value=0.2,
                            inclusive=True,
                        ),
                    ),
                ),
                agio=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio(
                    absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                            value=1.01,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                            value=1.01,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    annualized=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioAnnualized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMaximum(
                            value=0.1,
                            inclusive=True,
                        ),
                    ),
                ),
                discount=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscount(
                    absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscountAbsolute(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                            value=3.1415,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMaximum(
                            value=1.01,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDiscountRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                            value=0.5,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                            value=0.3,
                            inclusive=True,
                        ),
                    ),
                ),
                break_even=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEven(
                    break_even_point=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPoint(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                            value=3.1415,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                            value=4.04,
                            inclusive=True,
                        ),
                    ),
                    distance=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistance(
                        absolute=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsolute(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                                value=1.01,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                                value=2.02,
                                inclusive=True,
                            ),
                        ),
                        relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelative(
                            minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualizedMinimum(
                                value=0,
                                inclusive=True,
                            ),
                            maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                                value=0.4,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
                spread=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpread(
                    harmonized=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonized(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonizedMinimum(
                            value=2.02,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                            value=4.04,
                            inclusive=True,
                        ),
                    ),
                    relative=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadRelative(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                ),
                delta=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDelta(
                    effective=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffective(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                            value=5.05,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjusted(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaUnadjustedMinimum(
                            value=4.04,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                ),
                theta_one_week=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeek(
                    effective=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeekEffective(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                            value=3.1415,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceAbsoluteMaximum(
                            value=2.02,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresThetaOneWeekUnadjusted(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                            value=1.01,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                            value=3.1415,
                            inclusive=True,
                        ),
                    ),
                ),
                vega=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVega(
                    effective=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVegaEffective(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonizedMinimum(
                            value=2.02,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                            value=5.05,
                            inclusive=True,
                        ),
                    ),
                    unadjusted=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresVegaUnadjusted(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonizedMinimum(
                            value=2.02,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                            value=4.04,
                            inclusive=True,
                        ),
                    ),
                ),
                leverage=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresLeverage(
                    minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                        value=0.4,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                        value=0.3,
                        inclusive=True,
                    ),
                ),
                omega=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOmega(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSpreadHarmonizedMinimum(
                        value=2.02,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                implied_volatility=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresImpliedVolatility(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                        value=1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                        value=0.4,
                        inclusive=True,
                    ),
                ),
                intrinsic_value=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresIntrinsicValue(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                        value=1.01,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMaximum(
                        value=5.05,
                        inclusive=True,
                    ),
                ),
                time_value=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresTimeValue(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldAbsoluteMinimum(
                        value=1.01,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
                outperformance_point=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresOutperformancePoint(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresDeltaEffectiveMinimum(
                        value=5.05,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAbsoluteMaximum(
                        value=3.1415,
                        inclusive=True,
                    ),
                ),
                parity=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresParity(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificatesConstantLeverageMinimum(
                        value=3.1415,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenBreakEvenPointMaximum(
                        value=4.04,
                        inclusive=True,
                    ),
                ),
            ),
            performance=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance(
                intraday=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceIntraday(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                        value=0.5,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMaximum(
                        value=1,
                        inclusive=True,
                    ),
                ),
                since_issue=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceSinceIssue(
                    ask=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceSinceIssueAsk(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    bid=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceSinceIssueBid(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                ),
                end_of_day=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDay(
                    day1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                            value=0.3,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                            value=0.2,
                            inclusive=True,
                        ),
                    ),
                    week1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayWeek1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                            value=0.3,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    month1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonth1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                            value=0.1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                    months3=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths3(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                            value=0.2,
                            inclusive=True,
                        ),
                    ),
                    months6=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayMonths6(
                        minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                            value=0.4,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMaximum(
                            value=0.1,
                            inclusive=True,
                        ),
                    ),
                    year1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYear1(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMinimum(
                            value=0.2,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                            value=0.5,
                            inclusive=True,
                        ),
                    ),
                    years3=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears3(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                            value=0.1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldRelativeMaximum(
                            value=0,
                            inclusive=True,
                        ),
                    ),
                    years5=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYears5(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresSidewaysYieldAnnualizedMinimum(
                            value=0,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMaximum(
                            value=0.1,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayYearToDate(
                        minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMinimum(
                            value=1,
                            inclusive=True,
                        ),
                        maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                            value=0.3,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
            volatility=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility(
                week1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayWeek1(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformanceEndOfDayDay1Minimum(
                        value=0.3,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                month1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityMonth1(
                    minimum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMinimum(
                        value=0.4,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresMaximumYieldAnnualizedMaximum(
                        value=0.2,
                        inclusive=True,
                    ),
                ),
                months3=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityMonths3(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                months6=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityMonths6(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                        value=0.4,
                        inclusive=True,
                    ),
                ),
                year1=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityYear1(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformanceRelativeMaximum(
                        value=0.5,
                        inclusive=True,
                    ),
                ),
                years3=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityYears3(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBonusYieldRelativeMinimum(
                        value=0.5,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                        value=0.3,
                        inclusive=True,
                    ),
                ),
                years5=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityYears5(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresBreakEvenDistanceRelativeMaximum(
                        value=0.4,
                        inclusive=True,
                    ),
                ),
                year_to_date=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatilityYearToDate(
                    minimum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRateValueMinimum(
                        value=0.1,
                        inclusive=True,
                    ),
                    maximum=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtectionMaximum(
                        value=0.3,
                        inclusive=True,
                    ),
                ),
            ),
        ),
        meta=PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestMeta(
            attributes=AttributesMember([]),
            language=LanguageMember("en"),
        ),
    ) # PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest | Request Body (optional)

    try:
        # Possible values and value ranges for the parameters used in the endpoint `/securitized-derivative/notation/screener/search`.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_securitized_derivative_notation_screener_value_ranges_get(post_securitized_derivative_notation_screener_value_ranges_get_request=post_securitized_derivative_notation_screener_value_ranges_get_request)

        pprint(api_response)

    except fds.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling SecuritizedDerivativeApi->post_securitized_derivative_notation_screener_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_securitized_derivative_notation_screener_value_ranges_get_request** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest.md)| Request Body | [optional]

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

