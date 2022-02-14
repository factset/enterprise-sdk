# FactSetApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchTranslateFactSet**](FactSetApi.md#batchTranslateFactSet) | **POST** /symbology/v2/factset | Translate market security symbols into FactSet Permanent Identifiers
[**batchTranslateFactSetAdvanced**](FactSetApi.md#batchTranslateFactSetAdvanced) | **POST** /symbology/v2/factset-advanced | Translate advanced symbol types into FactSet Permanent Identifiers
[**translateFactset**](FactSetApi.md#translateFactset) | **GET** /symbology/v2/factset | Translate market security symbols into FactSet Permanent Identifiers.
[**translateFactsetAdvanced**](FactSetApi.md#translateFactsetAdvanced) | **GET** /symbology/v2/factset-advanced | Translate advanced symbol types into FactSet Permanent Identifiers



## batchTranslateFactSet

> FactsetTranslationResponse batchTranslateFactSet(factsetTranslationRequest)

Translate market security symbols into FactSet Permanent Identifiers

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.

### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.FactSetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactSetApi apiInstance = new FactSetApi(defaultClient);
        FactsetTranslationRequest factsetTranslationRequest = new FactsetTranslationRequest(); // FactsetTranslationRequest | Request Body for FactSet Symbology Translation
        try {
            FactsetTranslationResponse result = apiInstance.batchTranslateFactSet(factsetTranslationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactSetApi#batchTranslateFactSet");
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
 **factsetTranslationRequest** | [**FactsetTranslationRequest**](FactsetTranslationRequest.md)| Request Body for FactSet Symbology Translation |

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
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## batchTranslateFactSetAdvanced

> FactsetTranslationAdvancedResponse batchTranslateFactSetAdvanced(factsetTranslationAdvancedRequest)

Translate advanced symbol types into FactSet Permanent Identifiers

FactSet Advanced Symbology gives your enhanced resolution capabilities to translate a wider variety of input ids.
Using the `symbolType` parameter, you are able to resolve from the below list of advanced identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themseleves to appropriately resolve. 
* BIC - Bank Identification Code (e.g. ABXXHKH1)
* CIK - Edgar Central Index Keys (e.g. 0000100331)
* CRD - Central Registration Depository (e.g. 149722)
* DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451)
* EIN - Employer Identification Number (e.g. 953540776)
* FITCH - Fitch Ratings Identifier (e.g. 47504)
* LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33)
* MD - Moody's Ratings Identifier (e.g. 0823736553)
* SPR - S&P Ratings Identifier (e.g. 301939)
* VALOREN - Valoren ("Valor") Identification (e.g. 685558)
* WKN - German Securities Identification ("Wert") (e.g. A0MU9T)
Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include - 
* FactSet Ticker, Ticker-Region, Ticker-Exchange
* FactSet Permanent Identifiers (-R, -S, -L, -E)
* CUSIP
* SEDOL
* ISIN
* Bloomberg FIGI - Regional/Security/Listing Level
* Bloomberg Ticker - Regional/Listing Level


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.FactSetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactSetApi apiInstance = new FactSetApi(defaultClient);
        FactsetTranslationAdvancedRequest factsetTranslationAdvancedRequest = new FactsetTranslationAdvancedRequest(); // FactsetTranslationAdvancedRequest | Request Body for FactSet Symbology Translation
        try {
            FactsetTranslationAdvancedResponse result = apiInstance.batchTranslateFactSetAdvanced(factsetTranslationAdvancedRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactSetApi#batchTranslateFactSetAdvanced");
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
 **factsetTranslationAdvancedRequest** | [**FactsetTranslationAdvancedRequest**](FactsetTranslationAdvancedRequest.md)| Request Body for FactSet Symbology Translation |

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
| **200** | Symbol translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## translateFactset

> FactsetTranslationResponse translateFactset(ids)

Translate market security symbols into FactSet Permanent Identifiers.

Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.FactSetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactSetApi apiInstance = new FactSetApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        try {
            FactsetTranslationResponse result = apiInstance.translateFactset(ids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactSetApi#translateFactset");
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
 **ids** | **List&lt;String&gt;**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |

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
| **200** | Successful response of Market IDs translated into FactSet Permanent Identifiers. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## translateFactsetAdvanced

> FactsetTranslationAdvancedResponse translateFactsetAdvanced(ids, symbolType)

Translate advanced symbol types into FactSet Permanent Identifiers

FactSet Advanced Symbology gives your enhanced resolution capabilities to translate a wider variety of input ids 
Using the `symbolType` parameter, you are able to resolve from the below list of advanced identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themseleves to appropriately resolve. 
* BIC - Bank Identification Code (e.g. ABXXHKH1)
* CIK - Edgar Central Index Keys (e.g. 0000100331)
* CRD - Central Registration Depository (e.g. 149722)
* DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451)
* EIN - Employer Identification Number (e.g. 953540776)
* FITCH - Fitch Ratings Identifier (e.g. 47504)
* LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33)
* MD - Moody's Ratings Identifier (e.g. 0823736553)
* SPR - S&P Ratings Identifier (e.g. 301939)
* VALOREN - Valoren ("Valor") Identification (e.g. 685558)
* WKN - German Securities Identification ("Wert") (e.g. A0MU9T)
Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include - 
* FactSet Ticker, Ticker-Region, Ticker-Exchange
* FactSet Permanent Identifiers (-R, -S, -L, -E)
* CUSIP
* SEDOL
* ISIN
* Bloomberg FIGI - Regional/Security/Listing Level
* Bloomberg Ticker - Regional/Listing Level
  


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.FactSetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactSetApi apiInstance = new FactSetApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String symbolType = "BIC"; // String | Specifies the type of symbol being requested in the `ids` parameter. **This is only required when requesting to translate from the given symbolType to a FactSet Permanent Identifier. Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun & Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody's Ratings Identifier|Entity (-E)|   |SPR|S&P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\"Valor\") Identification|Security (-S)|   |WKN|German Securities Identification (\"Wert\")|Security (-S)|   |CRN|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)| 
        try {
            FactsetTranslationAdvancedResponse result = apiInstance.translateFactsetAdvanced(ids, symbolType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactSetApi#translateFactsetAdvanced");
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
 **ids** | **List&lt;String&gt;**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **symbolType** | **String**| Specifies the type of symbol being requested in the &#x60;ids&#x60; parameter. **This is only required when requesting to translate from the given symbolType to a FactSet Permanent Identifier. Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun &amp; Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody&#39;s Ratings Identifier|Entity (-E)|   |SPR|S&amp;P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|Security (-S)|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|Security (-S)|   |CRN|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  | [optional] [default to ] [enum: BIC, CIK, CRD, DUNS, EIN, FITCH, LEI, MD, SPR, VALOREN, WKN, CRN, RSSD, ]

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
| **200** | Successful response of ids translated into FactSet Permanent Identifiers. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

