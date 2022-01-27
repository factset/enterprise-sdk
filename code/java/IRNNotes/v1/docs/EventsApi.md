# EventsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvents**](EventsApi.md#getEvents) | **GET** /v1/notes/{noteId}/events | Get all the record events that belong to a note
[**getRecordEvent**](EventsApi.md#getRecordEvent) | **GET** /v1/notes/{noteId}/events/{recordEventId} | Get details of a record event of a note



## getEvents

> java.util.List&lt;RecordEventSummaryDto&gt; getEvents(noteId)

Get all the record events that belong to a note

### Example

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.model.*;
import com.factset.sdk.IRNNotes.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | Note Id
        try {
            java.util.List<RecordEventSummaryDto> result = apiInstance.getEvents(noteId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEvents");
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
 **noteId** | **java.util.UUID**| Note Id |

### Return type

[**java.util.List&lt;RecordEventSummaryDto&gt;**](RecordEventSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |


## getRecordEvent

> NoteEventDto getRecordEvent(noteId, recordEventId)

Get details of a record event of a note

### Example

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.model.*;
import com.factset.sdk.IRNNotes.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | Note Id
        java.util.UUID recordEventId = new java.util.UUID(); // java.util.UUID | Record Event Id
        try {
            NoteEventDto result = apiInstance.getRecordEvent(noteId, recordEventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getRecordEvent");
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
 **noteId** | **java.util.UUID**| Note Id |
 **recordEventId** | **java.util.UUID**| Record Event Id |

### Return type

[**NoteEventDto**](NoteEventDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

