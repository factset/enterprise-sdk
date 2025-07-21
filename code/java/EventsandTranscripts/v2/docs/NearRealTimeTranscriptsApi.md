# NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndexedNrt**](NearRealTimeTranscriptsApi.md#getIndexedNrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**getSpeakerIds**](NearRealTimeTranscriptsApi.md#getSpeakerIds) | **GET** /nrt/speaker-ids | Returns the latest speakerIds with the confidence scores generated for an active call.
[**searchNrtCalls**](NearRealTimeTranscriptsApi.md#searchNrtCalls) | **POST** /nrt/calls | Returns the active calls happening at the moment based on ticker/entity or specific IDs.



## getIndexedNrt

> IndexedNrtResponse getIndexedNrt(audioSourceId, paginationLimit, paginationOffset)

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
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
        try {
            IndexedNrtResponse result = apiInstance.getIndexedNrt(audioSourceId, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getIndexedNrt");
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
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**IndexedNrtResponse**](IndexedNrtResponse.md)

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


## getSpeakerIds

> NrtSpeakerIdsResponse getSpeakerIds(audioSourceId, sort, paginationLimit, paginationOffset)

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
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
        try {
            NrtSpeakerIdsResponse result = apiInstance.getSpeakerIds(audioSourceId, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getSpeakerIds");
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
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**NrtSpeakerIdsResponse**](NrtSpeakerIdsResponse.md)

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


## searchNrtCalls

> NrtCallsResponse searchNrtCalls(nrtCallsRequest)

Returns the active calls happening at the moment based on ticker/entity or specific IDs.

Retrieves active Near Real-Time (NRT) calls based on either ticker/entity/status criteria or specific audio source/report IDs. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object.


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
        NrtCallsRequest nrtCallsRequest = new NrtCallsRequest(); // NrtCallsRequest | Criteria to search for NRT calls. Select one mode of search.
        try {
            NrtCallsResponse result = apiInstance.searchNrtCalls(nrtCallsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#searchNrtCalls");
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
 **nrtCallsRequest** | [**NrtCallsRequest**](NrtCallsRequest.md)| Criteria to search for NRT calls. Select one mode of search. |

### Return type

[**NrtCallsResponse**](NrtCallsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The active calls happening at the moment, matching the specified criteria. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |

