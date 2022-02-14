# NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment
[**getBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1ListSnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest snippets from an active call
[**getBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



## getBulkDocumentsNrtV1Calls

> NRTCalls getBulkDocumentsNrtV1Calls(sort, reportId, audioSourceId, entityId, ticker, callStatus, paginationLimit, paginationOffset)

Returns the active calls happening at the moment

Returns the active calls happening at the moment

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.model.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        String sort = "startDate"; // String | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used
        Integer reportId = 56; // Integer | Unique identifier for an event
        Integer audioSourceId = 56; // Integer | Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids.
        String entityId = "entityId_example"; // String | Factset entity level identifier for the company hosting the event
        String ticker = "ticker_example"; // String | Ticker-region identifier for the company hosting the event
        String callStatus = "inProgress"; // String | Status of the call i.e. ended or inProgress or ewn or issueAtSource
        Integer paginationLimit = 56; // Integer | Specifies the number of results to return per page.[ Min=0 ; Max=500 ]
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            NRTCalls result = apiInstance.getBulkDocumentsNrtV1Calls(sort, reportId, audioSourceId, entityId, ticker, callStatus, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1Calls");
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
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used | [optional] [default to -startDate] [enum: startDate, -startDate]
 **reportId** | **Integer**| Unique identifier for an event | [optional]
 **audioSourceId** | **Integer**| Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. | [optional]
 **entityId** | **String**| Factset entity level identifier for the company hosting the event | [optional]
 **ticker** | **String**| Ticker-region identifier for the company hosting the event | [optional]
 **callStatus** | **String**| Status of the call i.e. ended or inProgress or ewn or issueAtSource | [optional] [enum: inProgress, ended, ewn, issueAtSource]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

### Return type

[**NRTCalls**](NRTCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1ListSnippets

> NRTSnippets getBulkDocumentsNrtV1ListSnippets(audioSourceId, reportId, paginationLimit, paginationOffset)

Returns the latest snippets from an active call

Returns the latest snippets from an active call

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.model.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        Integer audioSourceId = 56; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids.
        Integer reportId = 56; // Integer | Unique identifier for an event
        Integer paginationLimit = 56; // Integer | Specifies the  number of results to return per page. [ Min=0; Max=500 ]
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            NRTSnippets result = apiInstance.getBulkDocumentsNrtV1ListSnippets(audioSourceId, reportId, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1ListSnippets");
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
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. |
 **reportId** | **Integer**| Unique identifier for an event | [optional]
 **paginationLimit** | **Integer**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500 ] | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

### Return type

[**NRTSnippets**](NRTSnippets.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1Speakerids

> NRTSpeakerids getBulkDocumentsNrtV1Speakerids(audioSourceId, sort, paginationLimit, paginationOffset)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.model.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        Integer audioSourceId = 56; // Integer | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids. 
        String sort = "startDate"; // String | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used
        Integer paginationLimit = 56; // Integer | Specifies the number of results to return per page.[ Min=0 ; Max=500 ]
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            NRTSpeakerids result = apiInstance.getBulkDocumentsNrtV1Speakerids(audioSourceId, sort, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1Speakerids");
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
 **audioSourceId** | **Integer**| The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.  |
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used | [optional] [default to startDate] [enum: startDate, -startDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

### Return type

[**NRTSpeakerids**](NRTSpeakerids.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

