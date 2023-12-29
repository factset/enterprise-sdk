# HistoricalIdentifierResolutionApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchHistoricalIdentifierResolution**](HistoricalIdentifierResolutionApi.md#batchHistoricalIdentifierResolution) | **POST** /symbology/v3/historical-identifier-resolution | Returns the specified historical output identifiers for the given input identifier.
[**historicalIdentifierResolution**](HistoricalIdentifierResolutionApi.md#historicalIdentifierResolution) | **GET** /symbology/v3/historical-identifier-resolution | Returns the specified historical output identifiers for the given input identifier.



## batchHistoricalIdentifierResolution

> IdentifierResolutionHistoricalResponse batchHistoricalIdentifierResolution(identifierResolutionHistoricalRequest)

Returns the specified historical output identifiers for the given input identifier.

This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The `asOfDate` field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date. 
* **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only)
* **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only)
* **CRD** - Central Registration Depository (e.g. 149722) (Input only)
* **DUNS** - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only)
* **EIN** - Employer Identification Number (e.g. 953540776) (Input only)
* **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only)
* **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only)
* **MD*** - Moody's Ratings Identifier (e.g. 0823736553) (Input only)
* **SPR*** - S&P Ratings Identifier (e.g. 301939) (Input only)
* **VALOREN** - Valoren ("Valor") Identification (e.g. 685558) (Input only)
* **WKN*** - German Securities Identification ("Wertpapierkennnummer") (e.g. A0MU9T) (Input only)
* **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only)
* **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only)
* **SEDOL***
* **CUSIP***
* **fsymEntityId** - FactSet entity Id (Input only)
* **fsymSecurityId** - FactSet security level permanent identifier (Input only)
* **fsymRegionalId** - FactSet regional level permanent identifier (Input only)
* **fsymListingId** - FactSet listing level permanent identifier (Input only)
* **ISIN***
* **tickerExchange** - Ticker Exchange, a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only)
* **tickerRegion** - Ticker Region, geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US)
* **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only)
* **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW) (Input only)
* **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only)
* **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only)
* **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only)
* **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only)
* **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only)

**These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.HistoricalIdentifierResolutionApi;

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

        HistoricalIdentifierResolutionApi apiInstance = new HistoricalIdentifierResolutionApi(defaultClient);
        IdentifierResolutionHistoricalRequest identifierResolutionHistoricalRequest = new IdentifierResolutionHistoricalRequest(); // IdentifierResolutionHistoricalRequest | Request Body for Historical Identifier Resolution.
        try {
            IdentifierResolutionHistoricalResponse result = apiInstance.batchHistoricalIdentifierResolution(identifierResolutionHistoricalRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricalIdentifierResolutionApi#batchHistoricalIdentifierResolution");
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
 **identifierResolutionHistoricalRequest** | [**IdentifierResolutionHistoricalRequest**](IdentifierResolutionHistoricalRequest.md)| Request Body for Historical Identifier Resolution. |

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
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** |  |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## historicalIdentifierResolution

> IdentifierResolutionHistoricalResponse historicalIdentifierResolution(ids, inputSymbolType, outputSymbolTypes, asOfDate)

Returns the specified historical output identifiers for the given input identifier.

This endpoint enables the retrieval of historical CUSIP, SEDOL, ISIN, and tickerRegion identifiers. Users can input any of the listed identifiers and resolve one input symbol to multiple different output symbols in a single request. Both input and output symbols must be declared. The `asOfDate` field allows users to retrieve the full history of an identifier or the specific identifiers as of the requested date. 
* **BIC*** - Bank Identification Code (e.g. ABXXHKH1) (Input only)
* **CIK** - Edgar Central Index Keys (e.g. 0000100331) (Input only)
* **CRD** - Central Registration Depository (e.g. 149722) (Input only)
* **DUNS** - Dun & Bradstreet Data Universal Numbering System (e.g. 687741991) (Input only)
* **EIN** - Employer Identification Number (e.g. 953540776) (Input only)
* **FITCH*** - Fitch Ratings Identifier (e.g. 47504) (Input only)
* **LEI** - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) (Input only)
* **MD*** - Moody's Ratings Identifier (e.g. 0823736553) (Input only)
* **SPR*** - S&P Ratings Identifier (e.g. 301939) (Input only)
* **VALOREN** - Valoren ("Valor") Identification (e.g. 685558) (Input only)
* **WKN*** - German Securities Identification ("Wertpapierkennnummer") (e.g. A0MU9T) (Input only)
* **UKCH** - UK Company House Identifier (e.g.CE012494) (Input only)
* **RSSD** - Federal Reserve RSSD Identifier (1139297) (Input only)
* **SEDOL***
* **CUSIP***
* **fsymEntityId** - FactSet entity Id (Input only)
* **fsymSecurityId** - FactSet security level permanent identifier (Input only)
* **fsymRegionalId** - FactSet regional level permanent identifier (Input only)
* **fsymListingId** - FactSet listing level permanent identifier (Input only)
* **ISIN***
* **tickerExchange** - Ticker Exchange is a marketplace where stocks, bonds, commodities, and derivatives are bought and sold. (e.g. GOOGL-NAS) (Input only)
* **tickerRegion** - Ticker Region is the geographical region or market segment where a particular stock or security is listed and traded. (e.g. GOOGL-US)
* **bloombergFigi** - Bloomberg Listing/Regional/Security Identifier (output symbols: bloombergFigiListing, bloombergFigiRegional & bloombergFigiSecurity ) (e.g. BBG009S39JY5) (Input only)
* **bloombergTicker** - Bloomberg Listing and Regional Ticker Identifier (output symbols: bloombergRegionalTicker & bloombergListingTicker) (e.g. GOOGL UW) (Input only)
* **GVKEY** - CompuStat Entity Identifier (e.g. 063172) (Input only)
* **GVKEY & IID** - CompuStat Security Identifier (e.g.063172001) (Input only)
* **JCN** - Japan Corporate Number (e.g. 9011101021173) (Input only)
* **LoanX** - Markit Bank Loan Security Identifier (e.g. LX130668) (Input only)
* **MarkitRed** - Markit Entity Identifier (e.g. 3D337C) (Input only) 

**These symbol types require additional subscriptions. If you would like to gain access to these symbol types, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.HistoricalIdentifierResolutionApi;

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

        HistoricalIdentifierResolutionApi apiInstance = new HistoricalIdentifierResolutionApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested security or entity identifiers. All requested identifiers must be of the same type. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  100 per request*</p>   *<p>NOTE:  GET Method URL request lines are also limited to a total   length of 8192 bytes (8KB). In cases where the service allows for thousands   of ids, which may lead to exceeding this request line limit of 8KB, its   advised for any requests with large request lines to be requested through   the respective \"POST\" method.</p>* 
        String inputSymbolType = "BIC"; // String | The type of symbol being inputted. Only one type of symbol is accepted with each request. 
        java.util.List<String> outputSymbolTypes = Arrays.asList(); // java.util.List<String> | The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type.
        LocalDate asOfDate = LocalDate.parse("2010-01-01"); // LocalDate | As of date for historical symbol request in YYYY-MM-DD format. If no `asOfDate` is requested, the response will include the full history of the identifier. 
        try {
            IdentifierResolutionHistoricalResponse result = apiInstance.historicalIdentifierResolution(ids, inputSymbolType, outputSymbolTypes, asOfDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricalIdentifierResolutionApi#historicalIdentifierResolution");
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
 **inputSymbolType** | **String**| The type of symbol being inputted. Only one type of symbol is accepted with each request.  | [enum: BIC, CIK, CRD, DUNS, EIN, FITCH, LEI, MD, SPR, VALOREN, WKN, UKCH, RSSD, SEDOL, CUSIP, fsymEntityId, fsymSecurityId, fsymRegionalId, fsymListingId, ISIN, tickerExchange, tickerRegion, bloombergFigi, bloombergTicker, GVKEY, GVKEY & IID, JCN, LoanX, MarkitRed]
 **outputSymbolTypes** | **List&lt;String&gt;**| The type of symbols being outputted. Multiple types of symbols can be outputted with each request. The user must be authorized for the requested identifier type. | [enum: SEDOL, CUSIP, ISIN, tickerRegion]
 **asOfDate** | **LocalDate**| As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier.  | [optional]

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
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** |  |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

