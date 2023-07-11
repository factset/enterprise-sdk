# fds.sdk.Symbology.IdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_identifier_resolution**](IdentifierResolutionApi.md#batch_identifier_resolution) | **POST** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.
[**identifier_resolution**](IdentifierResolutionApi.md#identifier_resolution) | **GET** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.



# **batch_identifier_resolution**
> IdentifierResolutionResponse batch_identifier_resolution(identifier_resolution_request)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody's Ratings Identifier (e.g. 0823736553) * SPR* - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\"Wert\") (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) * bloombergTicker (output symbols: bloombergRegionalTicker & bloombergListingTicker) * GVKEY (Input only) * GVKEY & IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import identifier_resolution_api
from fds.sdk.Symbology.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = identifier_resolution_api.IdentifierResolutionApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    identifier_resolution_request = IdentifierResolutionRequest(
        ids=GetIdsResolution(["GOOGL-US"]),
        input_symbol_type=GetInputSymbolType("tickerRegion"),
        output_symbol_types=GetOutputSymbolTypes(["CUSIP","SEDOL"]),
    ) # IdentifierResolutionRequest | Request Body for Identifier Resolution.

    try:
        # Returns the specified output identifiers for the specified input identifier.
        # example passing only required values which don't have defaults set
        api_response = api_instance.batch_identifier_resolution(identifier_resolution_request)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling IdentifierResolutionApi->batch_identifier_resolution: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier_resolution_request** | [**IdentifierResolutionRequest**](IdentifierResolutionRequest.md)| Request Body for Identifier Resolution. |

### Return type

[**IdentifierResolutionResponse**](IdentifierResolutionResponse.md)

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
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** |  |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **identifier_resolution**
> IdentifierResolutionResponse identifier_resolution(ids, output_symbol_types)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request.  * BIC* - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * EIN - Employer Identification Number (e.g. 953540776) * FITCH* - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD* - Moody's Ratings Identifier (e.g. 0823736553) * SPR* - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * WKN* - German Securities Identification (\"Wert\") (e.g. A0MU9T) * UKCH - UK Company House Identifier(e.g.CE012494) * RSSD - Federal Reserve RSSD Identifier(1139297) * SEDOL* * CUSIP* * fsymEntityId - FactSet entity Id * fsymSecurityId - FactSet security level permanent identifier * fsymRegionalId - FactSet regional level permanent identifier * fsymListingId - FactSet listing level permanent identifier * ISIN* * tickerExchange * tickerRegion * bloombergFigi (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) * bloombergTicker (output symbols: bloombergRegionalTicker & bloombergListingTicker) * GVKEY (Input only) * GVKEY & IID (Input only) * JCN * LoanX (Input only) * Markit Red (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import identifier_resolution_api
from fds.sdk.Symbology.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = identifier_resolution_api.IdentifierResolutionApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["GOOGL-US"] # [str] | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    output_symbol_types = ["CUSIP","SEDOL"] # [str] | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.

    try:
        # Returns the specified output identifiers for the specified input identifier.
        # example passing only required values which don't have defaults set
        api_response = api_instance.identifier_resolution(ids, output_symbol_types)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling IdentifierResolutionApi->identifier_resolution: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **output_symbol_types** | **[str]**| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. |
 **input_symbol_type** | **str**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  | defaults to "tickerRegion"

### Return type

[**IdentifierResolutionResponse**](IdentifierResolutionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Symbol translation objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** |  |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

