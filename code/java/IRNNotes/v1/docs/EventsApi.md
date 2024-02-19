# EventsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEvents**](EventsApi.md#getAllEvents) | **GET** /v1/events | Get all the record events in the specified date range filtered on the given types
[**getEvents**](EventsApi.md#getEvents) | **GET** /v1/notes/{noteId}/events | Get all the record events that belong to a note
[**getRecordEvent**](EventsApi.md#getRecordEvent) | **GET** /v1/notes/{noteId}/events/{recordEventId} | Get details of a record event of a note



## getAllEvents

> java.util.List<EventSnippetDto> getAllEvents(startDate, endDate, types)

Get all the record events in the specified date range filtered on the given types

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        String startDate = "startDate_example"; // String | StartDate
        String endDate = "endDate_example"; // String | EndDate
        java.util.List<String> types = Arrays.asList(); // java.util.List<String> | Set of event types to filter on
        try {
            java.util.List<EventSnippetDto> result = apiInstance.getAllEvents(startDate, endDate, types);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getAllEvents");
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
 **startDate** | **String**| StartDate |
 **endDate** | **String**| EndDate | [optional]
 **types** | **List&lt;String&gt;**| Set of event types to filter on | [optional]

### Return type

[**java.util.List&lt;EventSnippetDto&gt;**](EventSnippetDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success - Returns events list |  -  |
| **400** | Bad Request - Returns error message |  -  |


## getEvents

> java.util.List<RecordEventSummaryDto> getEvents(noteId)

Get all the record events that belong to a note

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.EventsApi;

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.EventsApi;

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

