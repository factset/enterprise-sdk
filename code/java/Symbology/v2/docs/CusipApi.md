# CusipApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCusipHistory**](CusipApi.md#batchCusipHistory) | **POST** /symbology/v2/cusip-history | Retrieve the full history or as of a specific date of CUSIP changes for the requested ID(s).
[**batchTranslateCusips**](CusipApi.md#batchTranslateCusips) | **POST** /symbology/v2/cusip | Translate market security symbols into CUSIP - Current Only
[**cusipHistory**](CusipApi.md#cusipHistory) | **GET** /symbology/v2/cusip-history | Retrieve the full history or as of a requested date of CUSIP changes for the requested ID(s).
[**translateCusip**](CusipApi.md#translateCusip) | **GET** /symbology/v2/cusip | Translate market security symbols into CUSIPs - Current Only



## batchCusipHistory

> CusipHistoryResponse batchCusipHistory(cusipHistoryTranslationRequest)

Retrieve the full history or as of a specific date of CUSIP changes for the requested ID(s).

Return the full history of CUSIP changes for a given market security or FactSet Permanent Id.

### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.CusipApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        CusipApi apiInstance = new CusipApi(defaultClient);
        CusipHistoryTranslationRequest cusipHistoryTranslationRequest = new CusipHistoryTranslationRequest(); // CusipHistoryTranslationRequest | Request Body for CUSIP History
        try {
            CusipHistoryResponse result = apiInstance.batchCusipHistory(cusipHistoryTranslationRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CusipApi#batchCusipHistory");
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
 **cusipHistoryTranslationRequest** | [**CusipHistoryTranslationRequest**](CusipHistoryTranslationRequest.md)| Request Body for CUSIP History |

### Return type

[**CusipHistoryResponse**](CusipHistoryResponse.md)

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


## batchTranslateCusips

> CusipTranslationResponse batchTranslateCusips(cusipTranslationRequest)

Translate market security symbols into CUSIP - Current Only

Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. <p>This method is best for requesting **large universes** of `ids`.</p>

### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.CusipApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        CusipApi apiInstance = new CusipApi(defaultClient);
        CusipTranslationRequest cusipTranslationRequest = new CusipTranslationRequest(); // CusipTranslationRequest | Request Body for current only CUSIP Symbology Translation
        try {
            CusipTranslationResponse result = apiInstance.batchTranslateCusips(cusipTranslationRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CusipApi#batchTranslateCusips");
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
 **cusipTranslationRequest** | [**CusipTranslationRequest**](CusipTranslationRequest.md)| Request Body for current only CUSIP Symbology Translation |

### Return type

[**CusipTranslationResponse**](CusipTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Symbol Translation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## cusipHistory

> CusipHistoryResponse cusipHistory(ids, asOfDate)

Retrieve the full history or as of a requested date of CUSIP changes for the requested ID(s).

Return the full history of CUSIP changes or as of a requested date for a given market security or FactSet Permanent Id. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system. If no asOfDate is requested, the service will default to returning the entire history.


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.CusipApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        CusipApi apiInstance = new CusipApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        String asOfDate = "2010-01-01"; // String | As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null.
        try {
            CusipHistoryResponse result = apiInstance.cusipHistory(ids, asOfDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CusipApi#cusipHistory");
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
 **asOfDate** | **String**| As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. | [optional]

### Return type

[**CusipHistoryResponse**](CusipHistoryResponse.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## translateCusip

> CusipTranslationResponse translateCusip(ids)

Translate market security symbols into CUSIPs - Current Only

Translate market security symbols into CUSIP and FactSet Permanent Identifiers. Visit [OA 9094](https://my.apps.factset.com/oa/pages/9094) for more details regarding the CUSIP numbering system.

### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.models.*;
import com.factset.sdk.Symbology.api.CusipApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        CusipApi apiInstance = new CusipApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
        try {
            CusipTranslationResponse result = apiInstance.translateCusip(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CusipApi#translateCusip");
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

[**CusipTranslationResponse**](CusipTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response of Market IDs translated into CUSIPs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

