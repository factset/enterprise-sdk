# EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocsDistributorAudioV1HistoryFiles**](EventsAudioApi.md#getDocsDistributorAudioV1HistoryFiles) | **GET** /docs-distributor/audio/v1/history-files | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**getDocsDistributorAudioV1ListFiles**](EventsAudioApi.md#getDocsDistributorAudioV1ListFiles) | **GET** /docs-distributor/audio/v1/list-files | Retrieve latest audio recordings and related metadata within FactSet coverage.



## getDocsDistributorAudioV1HistoryFiles

> EventsAudioHistory getDocsDistributorAudioV1HistoryFiles(paginationLimit, paginationOffset, year)

Retrieve historical audio recordings and related metadata within FactSet coverage.

Returns the historical audio recordings and related metadata dating back from May 10, 2011 to Sep 30, 2022.  Query parameters can be used to filter and narrow down the results.

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        Integer paginationLimit = 25; // Integer | Specifies the number of results to return per page. [ Min=0 ; Max=500 ]
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        Integer year = 2021; // Integer | Specifies the year for which the historical audio recordings and related metadata are to be retrieved.
        try {
            EventsAudioHistory result = apiInstance.getDocsDistributorAudioV1HistoryFiles(paginationLimit, paginationOffset, year);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getDocsDistributorAudioV1HistoryFiles");
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
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] [default to 25]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **year** | **Integer**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved. | [optional]

### Return type

[**EventsAudioHistory**](EventsAudioHistory.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of presigned downloadable URLs consisting of historical audio recordings with related metadata. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getDocsDistributorAudioV1ListFiles

> EventsAudio getDocsDistributorAudioV1ListFiles(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, audioSourceId, ids, sourceCode, fileName, trimmed, uploadTime)

Retrieve latest audio recordings and related metadata within FactSet coverage.

Returns the latest audio recordings. Query parameters can be used to filter and narrow down the results.

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        String sort = "-startDate"; // String | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default.
        Integer paginationLimit = 25; // Integer | Specifies the number of results to return per page. [ Min=0 ; Max=500 ]
        String startDate = "2022-01-01T00:00:00.000Z"; // String | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday).
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        String endDate = "2022-06-01T00:00:00.000Z"; // String | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today).
        Integer reportId = 2666621; // Integer | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.
        Integer audioSourceId = 56; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.
        String sourceCode = "P"; // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay)
        String fileName = "835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3"; // String | This parameter is used to filter the data on based on the file name.
        Boolean trimmed = true; // Boolean | This parameters helps to search trimmed audio files.
        Integer uploadTime = 56; // Integer | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored.
        try {
            EventsAudio result = apiInstance.getDocsDistributorAudioV1ListFiles(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, audioSourceId, ids, sourceCode, fileName, trimmed, uploadTime);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getDocsDistributorAudioV1ListFiles");
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
 **sort** | **String**| Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. | [optional] [default to -startDate] [enum: -startDate, uploadTime, startDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] [default to 25]
 **startDate** | **String**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **endDate** | **String**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). | [optional]
 **reportId** | **Integer**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. | [optional]
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. | [optional]
 **ids** | **List&lt;String&gt;**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. | [optional]
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] [enum: P, W, V, F, I, R]
 **fileName** | **String**| This parameter is used to filter the data on based on the file name. | [optional]
 **trimmed** | **Boolean**| This parameters helps to search trimmed audio files. | [optional]
 **uploadTime** | **Integer**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored. | [optional]

### Return type

[**EventsAudio**](EventsAudio.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of URLs consisting of latest audio recordings and related metadata. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

