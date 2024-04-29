# fds.sdk.Symbology.HistoricalIdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_historical_identifier_resolution**](HistoricalIdentifierResolutionApi.md#batch_historical_identifier_resolution) | **POST** /symbology/v3/historical-identifier-resolution | Returns the specified historical output identifiers for the given input identifier.
[**historical_identifier_resolution**](HistoricalIdentifierResolutionApi.md#historical_identifier_resolution) | **GET** /symbology/v3/historical-identifier-resolution | Returns the specified historical output identifiers for the given input identifier.



# **batch_historical_identifier_resolution**
> IdentifierResolutionHistoricalResponse batch_historical_identifier_resolution(identifier_resolution_historical_request)

Returns the specified historical output identifiers for the given input identifier.

This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The `asOfDate` field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **DUNS** - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody's Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\"Wertpapierkennnummer\") (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange, a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region, geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)  **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import historical_identifier_resolution_api
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
    api_instance = historical_identifier_resolution_api.HistoricalIdentifierResolutionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier_resolution_historical_request = IdentifierResolutionHistoricalRequest(
        data=IdentifierResolutionHistoricalRequestBody(
            ids=GetIdsResolution(["GOOGL-US"]),
            input_symbol_type=GetHistoricalInputSymbolType("BIC"),
            output_symbol_types=GetHistoricalOutputSymbolTypes(["CUSIP","SEDOL"]),
            as_of_date=dateutil_parser('Fri Jan 01 00:00:00 UTC 2010').date(),
        ),
    ) # IdentifierResolutionHistoricalRequest | Request Body for Historical Identifier Resolution.

    try:
        # Returns the specified historical output identifiers for the given input identifier.
        # example passing only required values which don't have defaults set
        api_response = api_instance.batch_historical_identifier_resolution(identifier_resolution_historical_request)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling HistoricalIdentifierResolutionApi->batch_historical_identifier_resolution: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier_resolution_historical_request** | [**IdentifierResolutionHistoricalRequest**](IdentifierResolutionHistoricalRequest.md)| Request Body for Historical Identifier Resolution. |

### Return type

[**IdentifierResolutionHistoricalResponse**](IdentifierResolutionHistoricalResponse.md)

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

# **historical_identifier_resolution**
> IdentifierResolutionHistoricalResponse historical_identifier_resolution(ids, input_symbol_type, output_symbol_types)

Returns the specified historical output identifiers for the given input identifier.

This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The `asOfDate` field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date.  * **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only) * **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only) * **CRD** - Central Registration Depository (e.g. 149722) (Input only) * **DUNS** - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only) * **EIN** - Employer Identification Number (e.g. 953540776) (Input only) * **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only) * **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only) * **MD*** - Moody's Ratings Identifier (e.g. 0823736553) (Input only) * **SPR*** - S&P Ratings Identifier (e.g. 301939) (Input only) * **VALOREN** - Valoren (\"Valor\") Identification (e.g. 685558) (Input only) * **WKN*** - German Securities Identification (\"Wertpapierkennnummer\") (e.g. A0MU9T) (Input only) * **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only) * **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only) * **SEDOL*** * **CUSIP*** * **fsymEntityId** - FactSet entity Id (Input only) * **fsymSecurityId** - FactSet security level permanent identifier (Input only) * **fsymRegionalId** - FactSet regional level permanent identifier (Input only) * **fsymListingId** - FactSet listing level permanent identifier (Input only) * **ISIN*** * **tickerExchange** - Ticker Exchange is a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only) * **tickerRegion** - Ticker Region is the geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US) * **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only) * **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW) (Input only) * **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only) * **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only) * **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only) * **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only) * **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)   **These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import historical_identifier_resolution_api
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
    api_instance = historical_identifier_resolution_api.HistoricalIdentifierResolutionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["GOOGL-US"] # [str] | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  100 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
    input_symbol_type = "tickerRegion" # str | The type of symbol being inputted. Only one type of symbol is accepted with each request. 
    output_symbol_types = ["CUSIP","SEDOL"] # [str] | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.
    as_of_date = dateutil_parser('2010-01-01').date() # date | As of date for historical symbol request in YYYY-MM-DD format. If no `asOfDate` is requested, the response will include the full history of the identifier.  (optional)

    try:
        # Returns the specified historical output identifiers for the given input identifier.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.historical_identifier_resolution(ids, input_symbol_type, output_symbol_types, as_of_date=as_of_date)

        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling HistoricalIdentifierResolutionApi->historical_identifier_resolution: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **input_symbol_type** | **str**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  |
 **output_symbol_types** | **[str]**| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. |
 **as_of_date** | **date**| As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  | [optional]

### Return type

[**IdentifierResolutionHistoricalResponse**](IdentifierResolutionHistoricalResponse.md)

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

