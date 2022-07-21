# EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocsDistributorAudioV1ListFiles**](EventsAudioApi.md#getDocsDistributorAudioV1ListFiles) | **GET** /docs-distributor/audio/v1/list-files | Retrieve audio recordings and metadata within FactSet coverage



## getDocsDistributorAudioV1ListFiles

> EventsAudio getDocsDistributorAudioV1ListFiles(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, audioSourceId, ids, sourceCode, fileName, trimmed, uploadTime)

Retrieve audio recordings and metadata within FactSet coverage

Gets the latest 25 audio files. Parameters can be used to filter and narrow down the results

### Example

```java
import java.time.LocalDate;
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
        Integer paginationLimit = 56; // Integer | Specifies the number of results to return per page. [ Min=0 ; Max=500 ]
        LocalDate startDate = LocalDate.now(); // LocalDate | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)'
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        LocalDate endDate = LocalDate.now(); // LocalDate | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today)
        Integer reportId = 56; // Integer | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event
        Integer audioSourceId = 56; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSource ids.
        String ids = "ids_example"; // String | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier
        String sourceCode = "P"; // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay)
        String fileName = "fileName_example"; // String | This parameter is used to filter the data on based on the file name.
        Boolean trimmed = true; // Boolean | This parameters helps to search trimmed audio files
        Integer uploadTime = 56; // Integer | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored
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
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional]
 **startDate** | **LocalDate**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)&#39; | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]
 **endDate** | **LocalDate**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) | [optional]
 **reportId** | **Integer**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event | [optional]
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSource ids. | [optional]
 **ids** | **String**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier | [optional]
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] [enum: P, W, V, F, I, R]
 **fileName** | **String**| This parameter is used to filter the data on based on the file name. | [optional]
 **trimmed** | **Boolean**| This parameters helps to search trimmed audio files | [optional]
 **uploadTime** | **Integer**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored | [optional]

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

