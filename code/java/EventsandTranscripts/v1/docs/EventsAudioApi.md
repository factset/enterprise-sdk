# EventsAudioApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocsDistributorAudioV1HistoryFiles**](EventsAudioApi.md#getDocsDistributorAudioV1HistoryFiles) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**getDocsDistributorAudioV1ListFilesDate**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesDate) | **GET** /audio/by-date | Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
[**getDocsDistributorAudioV1ListFilesFileName**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesFileName) | **GET** /audio/by-file-name | Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
[**getDocsDistributorAudioV1ListFilesIds**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesIds) | **GET** /audio/by-ids | Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
[**getDocsDistributorAudioV1ListFilesUploadTime**](EventsAudioApi.md#getDocsDistributorAudioV1ListFilesUploadTime) | **GET** /audio/by-upload-time | Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.



## getDocsDistributorAudioV1HistoryFiles

> EventsAudioHistory getDocsDistributorAudioV1HistoryFiles(year, trimmed)

Retrieve historical audio recordings and related metadata within FactSet coverage.


This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.

* Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music & non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2022.

* Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2022.


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
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        Integer year = 2021; // Integer | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. 
        Boolean trimmed = false; // Boolean | Specifies if trimmed/untrimmed historical audio recordings should be returned.
        try {
            EventsAudioHistory result = apiInstance.getDocsDistributorAudioV1HistoryFiles(year, trimmed);
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
 **year** | **Integer**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  |
 **trimmed** | **Boolean**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] [default to false]

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
| **200** | The historical audio recordings based on the provided year. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getDocsDistributorAudioV1ListFilesDate

> EventsAudioDaily getDocsDistributorAudioV1ListFilesDate(startDate, endDate, startDateRelative, endDateRelative, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset)

Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.

Retrieves the most recent audio recordings based on specified dates and allows filtering through both source code and Ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        LocalDate startDate = LocalDate.parse("2020-10-01"); // LocalDate | The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD). 
        LocalDate endDate = LocalDate.parse("2020-12-26"); // LocalDate | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). 
        Integer startDateRelative = 56; // Integer | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.* 
        Integer endDateRelative = 56; // Integer | The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  - Either `endDate` or `endDateRelative` should be used, but not both. - If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error. - If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data. 
        String sourceCode = "Phone"; // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. 
        Boolean trimmed = false; // Boolean | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022. 
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on startDate. 
        Integer paginationLimit = 25; // Integer | Specifies the number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            EventsAudioDaily result = apiInstance.getDocsDistributorAudioV1ListFilesDate(startDate, endDate, startDateRelative, endDateRelative, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getDocsDistributorAudioV1ListFilesDate");
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
 **startDate** | **LocalDate**| The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **endDate** | **LocalDate**| The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **startDateRelative** | **Integer**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **endDateRelative** | **Integer**| The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  | [optional]
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] [enum: Phone, Webcast, Vendor, WebcastReplay, Flash, Replay]
 **ids** | **List&lt;String&gt;**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional]
 **trimmed** | **Boolean**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] [default to false]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] [enum: startDate, -startDate]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided date ranges. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getDocsDistributorAudioV1ListFilesFileName

> EventsAudioDailyFileName getDocsDistributorAudioV1ListFilesFileName(fileName)

Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.

Retrieves the latest audio recordings corresponding to the provided file name.

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
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        String fileName = "835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3"; // String | This parameter is used to filter the data on based on the file name.
        try {
            EventsAudioDailyFileName result = apiInstance.getDocsDistributorAudioV1ListFilesFileName(fileName);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getDocsDistributorAudioV1ListFilesFileName");
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
 **fileName** | **String**| This parameter is used to filter the data on based on the file name. | [optional]

### Return type

[**EventsAudioDailyFileName**](EventsAudioDailyFileName.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided file name. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getDocsDistributorAudioV1ListFilesIds

> EventsAudioDailyIds getDocsDistributorAudioV1ListFilesIds(reportId, audioSourceId, trimmed)

Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.

Retrieves the latest audio recordings based on the provided report ID and audio source ID.

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
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        Integer reportId = 3015749; // Integer | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. 
        Integer audioSourceId = 594948; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. 
        Boolean trimmed = false; // Boolean | This parameters helps to search trimmed audio files.
        try {
            EventsAudioDailyIds result = apiInstance.getDocsDistributorAudioV1ListFilesIds(reportId, audioSourceId, trimmed);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getDocsDistributorAudioV1ListFilesIds");
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
 **reportId** | **Integer**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  | [optional]
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  | [optional]
 **trimmed** | **Boolean**| This parameters helps to search trimmed audio files. | [optional] [default to false]

### Return type

[**EventsAudioDailyIds**](EventsAudioDailyIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided report ID and audio source ID. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getDocsDistributorAudioV1ListFilesUploadTime

> EventsAudioDaily getDocsDistributorAudioV1ListFilesUploadTime(uploadTime, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset)

Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.

Returns the latest audio recordings based on upload time and allows filtering through both source code and Ids.

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
import com.factset.sdk.EventsandTranscripts.api.EventsAudioApi;

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

        EventsAudioApi apiInstance = new EventsAudioApi(defaultClient);
        Integer uploadTime = -20; // Integer | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168
        String sourceCode = "Phone"; // String | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. 
        Boolean trimmed = false; // Boolean | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022. 
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on uploadTime. 
        Integer paginationLimit = 25; // Integer | Specifies the number of results to return per page.
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            EventsAudioDaily result = apiInstance.getDocsDistributorAudioV1ListFilesUploadTime(uploadTime, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsAudioApi#getDocsDistributorAudioV1ListFilesUploadTime");
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
 **uploadTime** | **Integer**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168 | [optional]
 **sourceCode** | **String**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] [enum: Phone, Webcast, Vendor, WebcastReplay, Flash, Replay]
 **ids** | **List&lt;String&gt;**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional]
 **trimmed** | **Boolean**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] [default to false]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on uploadTime.  | [optional] [enum: uploadTime, -uploadTime]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided upload time, source code and IDs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

