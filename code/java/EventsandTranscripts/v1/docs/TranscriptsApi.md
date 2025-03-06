# TranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimezone**](TranscriptsApi.md#getTimezone) | **GET** /reference/time-zones | Returns the time zones.
[**getTranscripts**](TranscriptsApi.md#getTranscripts) | **GET** /transcripts/search | Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
[**getTranscriptsDates**](TranscriptsApi.md#getTranscriptsDates) | **GET** /transcripts/dates | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
[**getTranscriptsEvents**](TranscriptsApi.md#getTranscriptsEvents) | **GET** /transcripts/events | Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
[**getTranscriptsIds**](TranscriptsApi.md#getTranscriptsIds) | **GET** /transcripts/ids | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
[**getTranscriptsInvestorSlides**](TranscriptsApi.md#getTranscriptsInvestorSlides) | **GET** /transcripts/investor-slides | Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
[**getTranscriptsTime**](TranscriptsApi.md#getTranscriptsTime) | **GET** /transcripts/times | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.
[**getcategories**](TranscriptsApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



## getTimezone

> ResponseTime getTimezone()

Returns the time zones.

Retrieves and delivers a comprehensive list of all available `timeZones`.

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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        try {
            ResponseTime result = apiInstance.getTimezone();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTimezone");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResponseTime**](ResponseTime.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all available time zones. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getTranscripts

> Transcripts getTranscripts(searchText, sort, paginationLimit, paginationOffset)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.

Returns the transcripts documents within FactSet coverage along with other
response fields. 

All transcripts originate from Factset Callstreet Transcripts.


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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        String searchText = "Updates"; // String | Restricts the search to include only document stories which include the text searched.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page. Maximum value: 1000. 
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            Transcripts result = apiInstance.getTranscripts(searchText, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscripts");
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
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided search text. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getTranscriptsDates

> Transcripts getTranscriptsDates(startDate, endDate, startDateRelative, endDateRelative, timeZone, sort, paginationLimit, paginationOffset)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.

Returns the transcripts documents within FactSet coverage along with other
response fields. 

All transcripts originate from Factset Callstreet Transcripts.


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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        LocalDate startDate = LocalDate.parse("2020-10-01"); // LocalDate | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.** 
        LocalDate endDate = LocalDate.parse("2020-12-26"); // LocalDate | End Date. Format is YYYY-MM-DD.
        Integer startDateRelative = 56; // Integer | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.* 
        Integer endDateRelative = 56; // Integer | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.* 
        String timeZone = "America/New_York"; // String | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page. Maximum value: 1000. 
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            Transcripts result = apiInstance.getTranscriptsDates(startDate, endDate, startDateRelative, endDateRelative, timeZone, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsDates");
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
 **startDate** | **LocalDate**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional]
 **endDate** | **LocalDate**| End Date. Format is YYYY-MM-DD. | [optional]
 **startDateRelative** | **Integer**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **endDateRelative** | **Integer**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional]
 **timeZone** | **String**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. | [optional] [default to America/New_York]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided date ranges. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getTranscriptsEvents

> Transcripts getTranscriptsEvents(eventIds, eventType, sort, paginationLimit, paginationOffset)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.

Returns the transcripts documents within FactSet coverage along with other
response fields. 

All transcripts originate from Factset Callstreet Transcripts.


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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | Requests Event IDs. This is a comma-separated list with a maximum limit of 1000.
        String eventType = "Earnings"; // String | Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition).
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page. Maximum value: 1000. 
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            Transcripts result = apiInstance.getTranscriptsEvents(eventIds, eventType, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsEvents");
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
 **eventIds** | **List&lt;String&gt;**| Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. | [optional]
 **eventType** | **String**| Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). | [optional] [enum: Earnings, Guidance, AnalystsShareholdersMeeting, ConferencePresentation, SalesRevenue, SpecialSituation, SalesRevenueRelease]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided event IDs and event type. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getTranscriptsIds

> TranscriptsOne getTranscriptsIds(primaryId, ids, startDate, endDate, searchText, reportIds, categories, sort, paginationLimit, paginationOffset)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.

Returns the transcripts documents within FactSet coverage along with other
response fields. 

All transcripts originate from Factset Callstreet Transcripts.


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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        Boolean primaryId = true; // Boolean | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
        LocalDate startDate = LocalDate.parse("2020-10-01"); // LocalDate | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.** 
        LocalDate endDate = LocalDate.parse("2020-12-26"); // LocalDate | End Date. Format is YYYY-MM-DD.
        String searchText = "Updates"; // String | Restricts the search to include only document stories which include the text searched.
        java.util.List<String> reportIds = Arrays.asList(); // java.util.List<String> | Requests Report IDs. This is a comma-separated list with a maximum limit of 1000
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page. Maximum value: 1000. 
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            TranscriptsOne result = apiInstance.getTranscriptsIds(primaryId, ids, startDate, endDate, searchText, reportIds, categories, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsIds");
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
 **primaryId** | **Boolean**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false] [enum: true, false]
 **ids** | **List&lt;String&gt;**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]
 **startDate** | **LocalDate**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional]
 **endDate** | **LocalDate**| End Date. Format is YYYY-MM-DD. | [optional]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional]
 **reportIds** | **List&lt;String&gt;**| Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 | [optional]
 **categories** | **List&lt;String&gt;**| Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**TranscriptsOne**](TranscriptsOne.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided report ID, IDs and primary ID. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getTranscriptsInvestorSlides

> InvestorSlides getTranscriptsInvestorSlides(startDate, endDate, ids, eventIds, categories, searchText, sort, paginationLimit, paginationOffset)

Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the Factset Callstreet Investor Slides documents within FactSet coverage along with other response fields

 All transcripts originate from Factset Callstreet Investor Slides.


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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        LocalDate startDate = LocalDate.parse("2020-10-01"); // LocalDate | Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
        LocalDate endDate = LocalDate.parse("2020-12-26"); // LocalDate | End Date. Format is YYYY-MM-DD.
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL.
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | Requests Event IDs. This is a comma-separated list with a maximum limit of 1000.
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories.
        String searchText = "Updates"; // String | Restricts the search to include only document stories which include the text searched.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page. Maximum value: 1000. 
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            InvestorSlides result = apiInstance.getTranscriptsInvestorSlides(startDate, endDate, ids, eventIds, categories, searchText, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsInvestorSlides");
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
 **startDate** | **LocalDate**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  |
 **endDate** | **LocalDate**| End Date. Format is YYYY-MM-DD. |
 **ids** | **List&lt;String&gt;**| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional]
 **eventIds** | **List&lt;String&gt;**| Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. | [optional]
 **categories** | **List&lt;String&gt;**| Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched. | [optional]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**InvestorSlides**](InvestorSlides.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest investor slides based on the provided date ranges. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getTranscriptsTime

> TranscriptsTimes getTranscriptsTime(startDateTime, endDateTime, sort, paginationLimit, paginationOffset)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.

Returns the transcripts documents within FactSet coverage along with other
response fields. 

All transcripts originate from Factset Callstreet Transcripts.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.OffsetDateTime;
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        OffsetDateTime startDateTime = OffsetDateTime.parse("2020-10-01T00:00:00Z"); // OffsetDateTime |  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**   
        OffsetDateTime endDateTime = OffsetDateTime.parse("2020-10-26T10:00:00Z"); // OffsetDateTime | The date to which data is required
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page. Maximum value: 1000. 
        Integer paginationOffset = 0; // Integer | Page number of the results to return.
        try {
            TranscriptsTimes result = apiInstance.getTranscriptsTime(startDateTime, endDateTime, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsTime");
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
 **startDateTime** | **OffsetDateTime**|  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**    | [optional]
 **endDateTime** | **OffsetDateTime**| The date to which data is required | [optional]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime, uploadDateTime, -uploadDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **Integer**| Page number of the results to return. | [optional] [default to 0]

### Return type

[**TranscriptsTimes**](TranscriptsTimes.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided date ranges. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getcategories

> ResponseCategories getcategories()

Returns the categories.

Retrieves and delivers a comprehensive list of all available `categories`which are defined as country, industry, and subject codes. The data is returned as a comma-separated list.

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
import com.factset.sdk.EventsandTranscripts.api.TranscriptsApi;

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

        TranscriptsApi apiInstance = new TranscriptsApi(defaultClient);
        try {
            ResponseCategories result = apiInstance.getcategories();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getcategories");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResponseCategories**](ResponseCategories.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of all available categories. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

