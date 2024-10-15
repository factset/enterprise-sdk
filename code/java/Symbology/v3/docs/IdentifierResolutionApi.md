# IdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchIdentifierResolution**](IdentifierResolutionApi.md#batchIdentifierResolution) | **POST** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the given input identifier.
[**identifierResolution**](IdentifierResolutionApi.md#identifierResolution) | **GET** /symbology/v3/identifier-resolution | Returns the specified output identifiers for the specified input identifier.



## batchIdentifierResolution

> IdentifierResolutionResponse batchIdentifierResolution(identifierResolutionRequest)

Returns the specified output identifiers for the given input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request. 
* **BIC*** - Bank Identification Code (e.g. ABXXHKH1)
* **CIK** - Edgar Central Index Keys (e.g. 0000100331)
* **CRD** - Central Registration Depository (e.g. 149722)
* **EIN** - Employer Identification Number (e.g. 953540776)
* **FITCH*** - Fitch Ratings Identifier (e.g. 47504)
* **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33)
* **MD*** - Moody's Ratings Identifier (e.g. 0823736553)
* **SPR*** - S&P Ratings Identifier (e.g. 301939)
* **VALOREN** - Valoren ("Valor") Identification (e.g. 685558) (Input only)
* **WKN*** - German Securities Identification ("Wertpapierkennnummer") (e.g. A0MU9T)
* **UKCH** - UK Company House Identifier (e.g.CE012494)
* **RSSD** - Federal Reserve RSSD Identifier (1139297)
* **SEDOL***
* **CUSIP***
* **fsymEntityId** - FactSet entity Id
* **fsymSecurityId** - FactSet security level permanent identifier
* **fsymRegionalId** - FactSet regional level permanent identifier
* **fsymListingId** - FactSet listing level permanent identifier
* **ISIN***
* **tickerExchange** - Ticker Exchange, a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS)
* **tickerRegion** - Ticker Region, geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US)
* **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5)
* **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW)
* **GVKEY** - CompuStat Entity Identifier (e.g. 063172)(Input only)
* **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only)
* **JCN** - Japan Corporate Number (e.g. 9011101021173)
* **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only)
* **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)

**These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.IdentifierResolutionApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        IdentifierResolutionApi apiInstance = new IdentifierResolutionApi(defaultClient);
        IdentifierResolutionRequest identifierResolutionRequest = new IdentifierResolutionRequest(); // IdentifierResolutionRequest | Request Body for Identifier Resolution.
        try {
            IdentifierResolutionResponse result = apiInstance.batchIdentifierResolution(identifierResolutionRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierResolutionApi#batchIdentifierResolution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierResolutionRequest** | [**IdentifierResolutionRequest**](IdentifierResolutionRequest.md)| Request Body for Identifier Resolution. |

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
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** |  |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## identifierResolution

> IdentifierResolutionResponse identifierResolution(ids, inputSymbolType, outputSymbolTypes)

Returns the specified output identifiers for the specified input identifier.

The Identifier Resolution endpoint provides flexibility for requesting and receiving both third-party and FactSet Permanent identifiers. Users can both input and output most of the listed identifiers, with exceptions noted below.  All input and output symbols must be declared, and users have the ability to resolve one input symbol to many different output symbols in one request. 
* **BIC*** - Bank Identification Code (e.g. ABXXHKH1)
* **CIK** - Edgar Central Index Keys (e.g. 0000100331)
* **CRD** - Central Registration Depository (e.g. 149722)
* **EIN** - Employer Identification Number (e.g. 953540776)
* **FITCH*** - Fitch Ratings Identifier (e.g. 47504)
* **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33)
* **MD*** - Moody's Ratings Identifier (e.g. 0823736553)
* **SPR*** - S&P Ratings Identifier (e.g. 301939)
* **VALOREN** - Valoren ("Valor") Identification (e.g. 685558) (Input only)
* **WKN*** - German Securities Identification ("Wertpapierkennnummer") (e.g. A0MU9T)
* **UKCH** - UK Company House Identifier (e.g.CE012494)
* **RSSD** - Federal Reserve RSSD Identifier (1139297)
* **SEDOL***
* **CUSIP***
* **fsymEntityId** - FactSet entity Id
* **fsymSecurityId** - FactSet security level permanent identifier
* **fsymRegionalId** - FactSet regional level permanent identifier
* **fsymListingId** - FactSet listing level permanent identifier
* **ISIN***
* **tickerExchange** - Ticker Exchange is a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS)
* **tickerRegion** - Ticker Region is the geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US)
* **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity) (e.g. BBG009S39JY5)
* **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW)
* **GVKEY** - CompuStat Entity Identifier (e.g. 063172)(Input only)
* **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only)
* **JCN** - Japan Corporate Number (e.g. 9011101021173)
* **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only)
* **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)

**These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.IdentifierResolutionApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        IdentifierResolutionApi apiInstance = new IdentifierResolutionApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  100 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
        String inputSymbolType = "BIC"; // String | The type of symbol being inputted. Only one type of symbol is accepted with each request. 
        java.util.List<String> outputSymbolTypes = Arrays.asList(); // java.util.List<String> | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.
        try {
            IdentifierResolutionResponse result = apiInstance.identifierResolution(ids, inputSymbolType, outputSymbolTypes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierResolutionApi#identifierResolution");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **List&lt;String&gt;**| Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  100 per request*&lt;/p&gt;   *&lt;p&gt;NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **inputSymbolType** | **String**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  | [default to tickerRegion] [enum: BIC, CIK, CRD, EIN, FITCH, LEI, MD, SPR, VALOREN, WKN, UKCH, RSSD, SEDOL, CUSIP, fsymEntityId, fsymSecurityId, fsymRegionalId, fsymListingId, ISIN, tickerExchange, tickerRegion, bloombergFigi, bloombergTicker, GVKEY, GVKEY & IID, JCN, LoanX, MarkitRed]
 **outputSymbolTypes** | **List&lt;String&gt;**| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. | [enum: BIC, CIK, CRD, EIN, FITCH, LEI, MD, SPR, WKN, UKCH, RSSD, SEDOL, CUSIP, fsymEntityId, fsymSecurityId, fsymRegionalId, fsymListingId, ISIN, tickerExchange, tickerRegion, JCN, bloombergListingTicker, bloombergRegionalTicker, bloombergFigiListing, bloombergFigiRegional, bloombergFigiSecurity]

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
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** |  |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

