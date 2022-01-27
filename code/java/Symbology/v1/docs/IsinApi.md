# IsinApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchIsinHistory**](IsinApi.md#batchIsinHistory) | **POST** /symbology/v1/isin-history | Retrieve the full history or as of a specific date of ISIN changes for a requested ID.
[**batchTranslateIsin**](IsinApi.md#batchTranslateIsin) | **POST** /symbology/v1/isin | Translate market security symbols into ISIN.
[**isinHistory**](IsinApi.md#isinHistory) | **GET** /symbology/v1/isin-history | Retrieve the full history or as of a specific date of ISIN changes for the requested ID(s).
[**translateIsin**](IsinApi.md#translateIsin) | **GET** /symbology/v1/isin | Translate market security symbols into ISIN.



## batchIsinHistory

> IsinHistoryTranslationResponse batchIsinHistory(isinHistoryTranslationRequest)

Retrieve the full history or as of a specific date of ISIN changes for a requested ID.

Return the full history of ISIN changes for a given market security or FactSet Permanent Id.


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.IsinApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        IsinApi apiInstance = new IsinApi(defaultClient);
        IsinHistoryTranslationRequest isinHistoryTranslationRequest = new IsinHistoryTranslationRequest(); // IsinHistoryTranslationRequest | Request Body for ISIN History
        try {
            IsinHistoryTranslationResponse result = apiInstance.batchIsinHistory(isinHistoryTranslationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IsinApi#batchIsinHistory");
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
 **isinHistoryTranslationRequest** | [**IsinHistoryTranslationRequest**](IsinHistoryTranslationRequest.md)| Request Body for ISIN History |

### Return type

[**IsinHistoryTranslationResponse**](IsinHistoryTranslationResponse.md)

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


## batchTranslateIsin

> IsinTranslationResponse batchTranslateIsin(isinTranslationRequest)

Translate market security symbols into ISIN.

Translate market security symbols into ISIN and FactSet Permanent Identifiers.


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.IsinApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        IsinApi apiInstance = new IsinApi(defaultClient);
        IsinTranslationRequest isinTranslationRequest = new IsinTranslationRequest(); // IsinTranslationRequest | Request Body for ISIN Symbology Translation
        try {
            IsinTranslationResponse result = apiInstance.batchTranslateIsin(isinTranslationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IsinApi#batchTranslateIsin");
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
 **isinTranslationRequest** | [**IsinTranslationRequest**](IsinTranslationRequest.md)| Request Body for ISIN Symbology Translation |

### Return type

[**IsinTranslationResponse**](IsinTranslationResponse.md)

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


## isinHistory

> IsinHistoryTranslationResponse isinHistory(ids)

Retrieve the full history or as of a specific date of ISIN changes for the requested ID(s).

Returns the full history of ISIN changes for a given security.


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.IsinApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        IsinApi apiInstance = new IsinApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
        try {
            IsinHistoryTranslationResponse result = apiInstance.isinHistory(ids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IsinApi#isinHistory");
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
 **ids** | **List&lt;String&gt;**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. |

### Return type

[**IsinHistoryTranslationResponse**](IsinHistoryTranslationResponse.md)

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


## translateIsin

> IsinTranslationResponse translateIsin(ids, asOfDate)

Translate market security symbols into ISIN.

Translate market security symbols into ISIN and FactSet Permanent Identifiers. 


### Example

```java
// Import classes:
import com.factset.sdk.Symbology.ApiClient;
import com.factset.sdk.Symbology.ApiException;
import com.factset.sdk.Symbology.Configuration;
import com.factset.sdk.Symbology.auth.*;
import com.factset.sdk.Symbology.model.*;
import com.factset.sdk.Symbology.api.IsinApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        IsinApi apiInstance = new IsinApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
        String asOfDate = "2010-01-01"; // String | As-Of date for historical symbol request in YYYY-MM-DD format.
        try {
            IsinTranslationResponse result = apiInstance.translateIsin(ids, asOfDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IsinApi#translateIsin");
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
 **ids** | **List&lt;String&gt;**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. |
 **asOfDate** | **String**| As-Of date for historical symbol request in YYYY-MM-DD format. | [optional]

### Return type

[**IsinTranslationResponse**](IsinTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response of Market IDs translated into ISIN. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

