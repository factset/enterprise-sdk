# NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Calls) | **GET** /nrt/by-ticker | Returns the active calls happening at the moment based on ticker,call status and entity ID.
[**getBulkDocumentsNrtV1CallsByAudioSourceId**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1CallsByAudioSourceId) | **GET** /nrt/by-ids | Returns the active calls happening at the moment based on audio source ID and report ID.
[**getBulkDocumentsNrtV1Indexedrt**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Indexedrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**getBulkDocumentsNrtV1SpeakerIds**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1SpeakerIds) | **GET** /nrt/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



## getBulkDocumentsNrtV1Calls

> NrtCalls getBulkDocumentsNrtV1Calls(ticker, entityId, callStatus, sort, paginationLimit, paginationOffset)

Returns the active calls happening at the moment based on ticker,call status and entity ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        String ticker = "AZZ-US"; // String | Ticker-region identifier for the company hosting the event.
        String entityId = "000CGP-E"; // String | Factset entity level identifier for the company hosting the event.
        String callStatus = "InProgress"; // String | Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            NrtCalls result = apiInstance.getBulkDocumentsNrtV1Calls(ticker, entityId, callStatus, sort, paginationLimit, paginationOffset);
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
 **ticker** | **String**| Ticker-region identifier for the company hosting the event. | [optional]
 **entityId** | **String**| Factset entity level identifier for the company hosting the event. | [optional]
 **callStatus** | **String**| Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. | [optional] [enum: InProgress, Ended, EWN, IssueAtSource]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] [enum: eventDatetimeUtc, -eventDatetimeUtc]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The active calls happening at the moment, based on the provided ticker, call status, and entity ID. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1CallsByAudioSourceId

> NrtCalls getBulkDocumentsNrtV1CallsByAudioSourceId(audioSourceId, reportId, sort, paginationLimit, paginationOffset)

Returns the active calls happening at the moment based on audio source ID and report ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        Integer audioSourceId = 471849; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
        Integer reportId = 2683372; // Integer | Unique identifier for an event.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            NrtCalls result = apiInstance.getBulkDocumentsNrtV1CallsByAudioSourceId(audioSourceId, reportId, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1CallsByAudioSourceId");
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
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional]
 **reportId** | **Integer**| Unique identifier for an event. | [optional]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] [enum: eventDatetimeUtc, -eventDatetimeUtc]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The active calls happening at the moment, based on IDs. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1Indexedrt

> IndexedNrt getBulkDocumentsNrtV1Indexedrt(audioSourceId, paginationLimit, paginationOffset)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        Integer audioSourceId = 471849; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            IndexedNrt result = apiInstance.getBulkDocumentsNrtV1Indexedrt(audioSourceId, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1Indexedrt");
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
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**IndexedNrt**](IndexedNrt.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transcript data that has been indexed according to the specific audio source ID. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1SpeakerIds

> NrtSpeakerIds getBulkDocumentsNrtV1SpeakerIds(audioSourceId, sort, paginationLimit, paginationOffset)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the confidence scores generated for an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.NearRealTimeTranscriptsApi;

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

        NearRealTimeTranscriptsApi apiInstance = new NearRealTimeTranscriptsApi(defaultClient);
        Integer audioSourceId = 471849; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on the start offset of the speaker. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            NrtSpeakerIds result = apiInstance.getBulkDocumentsNrtV1SpeakerIds(audioSourceId, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1SpeakerIds");
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
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  | [optional] [enum: speakerStartOffset, -speakerStartOffset]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**NrtSpeakerIds**](NrtSpeakerIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The up-to-date speaker IDs and their associated confidence scores, based on the audio source ID. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

