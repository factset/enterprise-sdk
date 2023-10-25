# fds.sdk.Symbology.FactSetApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_translate_fact_set**](FactSetApi.md#batch_translate_fact_set) | **POST** /symbology/v2/factset | Translate market security symbols into FactSet Permanent Identifiers
[**batch_translate_fact_set_advanced**](FactSetApi.md#batch_translate_fact_set_advanced) | **POST** /symbology/v2/factset-advanced | Translate advanced symbol types into FactSet Permanent Identifiers
[**translate_factset**](FactSetApi.md#translate_factset) | **GET** /symbology/v2/factset | Translate market security symbols into FactSet Permanent Identifiers.
[**translate_factset_advanced**](FactSetApi.md#translate_factset_advanced) | **GET** /symbology/v2/factset-advanced | Translate advanced symbol types into FactSet Permanent Identifiers



# **batch_translate_fact_set**
> FactsetTranslationResponse batch_translate_fact_set(factset_translation_request)

Translate market security symbols into FactSet Permanent Identifiers

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import fact_set_api
from fds.sdk.Symbology.models import *
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
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_api.FactSetApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    factset_translation_request = FactsetTranslationRequest(
        ids=GetIds(["GOOGL-US"]),
    ) # FactsetTranslationRequest | Request Body for FactSet Symbology Translation

    try:
        # Translate market security symbols into FactSet Permanent Identifiers
        # example passing only required values which don't have defaults set
        api_response = api_instance.batch_translate_fact_set(factset_translation_request)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling FactSetApi->batch_translate_fact_set: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **factset_translation_request** | [**FactsetTranslationRequest**](FactsetTranslationRequest.md)| Request Body for FactSet Symbology Translation |

### Return type

[**FactsetTranslationResponse**](FactsetTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Symbol translation objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_translate_fact_set_advanced**
> FactsetTranslationAdvancedResponse batch_translate_fact_set_advanced(factset_translation_advanced_request)

Translate advanced symbol types into FactSet Permanent Identifiers

FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody's Ratings Identifier (e.g. 0823736553) * SPR - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) * WKN - German Securities Identification (\"Wert\") (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)    Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import fact_set_api
from fds.sdk.Symbology.models import *
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
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_api.FactSetApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    factset_translation_advanced_request = FactsetTranslationAdvancedRequest(
        ids=GetAdvancedIds(["GOOGL-US"]),
        symbol_type=GetSymbolType("BIC"),
    ) # FactsetTranslationAdvancedRequest | Request Body for FactSet Symbology Translation

    try:
        # Translate advanced symbol types into FactSet Permanent Identifiers
        # example passing only required values which don't have defaults set
        api_response = api_instance.batch_translate_fact_set_advanced(factset_translation_advanced_request)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling FactSetApi->batch_translate_fact_set_advanced: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **factset_translation_advanced_request** | [**FactsetTranslationAdvancedRequest**](FactsetTranslationAdvancedRequest.md)| Request Body for FactSet Symbology Translation |

### Return type

[**FactsetTranslationAdvancedResponse**](FactsetTranslationAdvancedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Symbol translation objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **translate_factset**
> FactsetTranslationResponse translate_factset(ids)

Translate market security symbols into FactSet Permanent Identifiers.

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import fact_set_api
from fds.sdk.Symbology.models import *
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
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_api.FactSetApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["GOOGL-US"] # [str] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*

    try:
        # Translate market security symbols into FactSet Permanent Identifiers.
        # example passing only required values which don't have defaults set
        api_response = api_instance.translate_factset(ids)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling FactSetApi->translate_factset: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |

### Return type

[**FactsetTranslationResponse**](FactsetTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response of Market IDs translated into FactSet Permanent Identifiers. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **translate_factset_advanced**
> FactsetTranslationAdvancedResponse translate_factset_advanced(ids)

Translate advanced symbol types into FactSet Permanent Identifiers

FactSet Advanced Symbology gives you enhanced resolution capabilities to translate a wider variety of input ids. Using the symbolType parameter, you are able to resolve from the below list of third-party identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themselves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody's Ratings Identifier (e.g. 0823736553) * SPR - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) * WKN - German Securities Identification (\"Wert\") (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD -   Federal Reserve RSSD Identifier(1139297)  Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import fact_set_api
from fds.sdk.Symbology.models import *
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
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_api.FactSetApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["GOOGL-US"] # [str] | Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbol_type = "" # str | Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun & Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody's Ratings Identifier|Entity (-E)|   |SPR|S&P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\"Valor\") Identification|Security (-S)|   |WKN|German Securities Identification (\"Wert\")|Security (-S)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  (optional) if omitted the server will use the default value of ""

    try:
        # Translate advanced symbol types into FactSet Permanent Identifiers
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.translate_factset_advanced(ids, symbol_type=symbol_type)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling FactSetApi->translate_factset_advanced: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested market securities or entities. Accepted identifiers include all identifiers in the list above. This request value is sent back in the response as ‘requestId’. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **symbol_type** | **str**| Specifies the type of symbol being requested in the ids parameter. **This is only required when requesting to translate from the symbolTypes in the list below to a FactSet Permanent Identifier.  Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun &amp; Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody&#39;s Ratings Identifier|Entity (-E)|   |SPR|S&amp;P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|Security (-S)|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|Security (-S)|   |UKCH|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  | [optional] if omitted the server will use the default value of ""

### Return type

[**FactsetTranslationAdvancedResponse**](FactsetTranslationAdvancedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response of ids translated into FactSet Permanent Identifiers. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

