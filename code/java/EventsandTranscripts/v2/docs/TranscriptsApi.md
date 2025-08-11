# TranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTranscriptsIntelligence**](TranscriptsApi.md#getTranscriptsIntelligence) | **GET** /transcripts/intelligence | Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
[**getTranscriptsInvestorSlides**](TranscriptsApi.md#getTranscriptsInvestorSlides) | **GET** /transcripts/investor-slides | Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
[**getTranscriptsinXML**](TranscriptsApi.md#getTranscriptsinXML) | **GET** /transcripts/response-type | Returns the requested response type of transcript
[**searchTranscripts**](TranscriptsApi.md#searchTranscripts) | **POST** /transcripts | Returns transcript documents and related metadata based on different search criteria.



## getTranscriptsIntelligence

> TranscriptsIntelligenceResponse getTranscriptsIntelligence(ids, startDate, endDate, startDateRelative, endDateRelative, categories, timeZone, sort, paginationLimit, paginationOffset)

Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the StreetAccount Transcript Intelligence documents within FactSet coverage along with other response fields.

All StreetAccount Transcript Intelligence stories originate from StreetAccount


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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
        LocalDate startDate = LocalDate.parse("2025-05-01"); // LocalDate | Start Date (YYYY-MM-DD). 
        LocalDate endDate = LocalDate.parse("2025-07-24"); // LocalDate | End Date (YYYY-MM-DD). 
        Integer startDateRelative = 56; // Integer | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `startDate` or `startDateRelative` should be used, but not both.* 
        Integer endDateRelative = 56; // Integer | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `endDate` or `endDateRelative` should be used, but not both.* 
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.  
        String timeZone = "America/New_York"; // String | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the `/meta/time-zones` endpoint to get the list of available time zones.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
        try {
            TranscriptsIntelligenceResponse result = apiInstance.getTranscriptsIntelligence(ids, startDate, endDate, startDateRelative, endDateRelative, categories, timeZone, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsIntelligence");
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
 **ids** | **List&lt;String&gt;**| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **startDate** | **LocalDate**| Start Date (YYYY-MM-DD).  | [optional]
 **endDate** | **LocalDate**| End Date (YYYY-MM-DD).  | [optional]
 **startDateRelative** | **Integer**| The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.*  | [optional]
 **endDateRelative** | **Integer**| The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  | [optional]
 **categories** | **List&lt;String&gt;**| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional]
 **timeZone** | **String**| Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to America/New_York]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**TranscriptsIntelligenceResponse**](TranscriptsIntelligenceResponse.md)

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


## getTranscriptsInvestorSlides

> InvestorSlidesResponse getTranscriptsInvestorSlides(ids, startDate, endDate, eventIds, categories, searchText, sort, paginationLimit, paginationOffset)

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
        LocalDate startDate = LocalDate.parse("2025-07-23"); // LocalDate | Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
        LocalDate endDate = LocalDate.parse("2025-07-24"); // LocalDate | End Date. Format is YYYY-MM-DD.
        java.util.List<String> eventIds = Arrays.asList(); // java.util.List<String> | Requests Event IDs. This is a list with a maximum limit of 1000.
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.  
        String searchText = "presentation"; // String | Restricts the search to include only document stories which include the text searched.    
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on eventDate. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
        try {
            InvestorSlidesResponse result = apiInstance.getTranscriptsInvestorSlides(ids, startDate, endDate, eventIds, categories, searchText, sort, paginationLimit, paginationOffset);
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
 **ids** | **List&lt;String&gt;**| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID |
 **startDate** | **LocalDate**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  |
 **endDate** | **LocalDate**| End Date. Format is YYYY-MM-DD. |
 **eventIds** | **List&lt;String&gt;**| Requests Event IDs. This is a list with a maximum limit of 1000. | [optional]
 **categories** | **List&lt;String&gt;**| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional]
 **searchText** | **String**| Restricts the search to include only document stories which include the text searched.     | [optional]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] [enum: storyDateTime, -storyDateTime]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**InvestorSlidesResponse**](InvestorSlidesResponse.md)

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


## getTranscriptsinXML

> ResponseType getTranscriptsinXML(reportIds, format, paginationLimit, paginationOffset)

Returns the requested response type of transcript

Returns the Factset Callstreet documents within FactSet coverage along with other response fields

 All transcripts originate from Factset Callstreet Transcripts


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
        java.util.List<String> reportIds = Arrays.asList(); // java.util.List<String> | Requests Report IDs. This is a list with a maximum limit of 1000
        String format = "XML"; // String | The format of the output file. Allowed values:   - `XML`: Structured data format ideal for integrations and parsing.   - `PDF`: Printable document format preserving layout and design.   - `DocViewer`: Web-friendly format rendered in an in-browser document viewer.   - `ContentXML`: XML containing only the core content without layout or styling metadata. 
        Integer paginationLimit = 25; // Integer | Number of results to return per page.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results.
        try {
            ResponseType result = apiInstance.getTranscriptsinXML(reportIds, format, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#getTranscriptsinXML");
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
 **reportIds** | **List&lt;String&gt;**| Requests Report IDs. This is a list with a maximum limit of 1000 |
 **format** | **String**| The format of the output file. Allowed values:   - &#x60;XML&#x60;: Structured data format ideal for integrations and parsing.   - &#x60;PDF&#x60;: Printable document format preserving layout and design.   - &#x60;DocViewer&#x60;: Web-friendly format rendered in an in-browser document viewer.   - &#x60;ContentXML&#x60;: XML containing only the core content without layout or styling metadata.  | [enum: XML, PDF, DocViewer, ContentXML]
 **paginationLimit** | **Integer**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type

[**ResponseType**](ResponseType.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested response type of transcripts |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## searchTranscripts

> TranscriptsResponse searchTranscripts(transcriptsRequest)

Returns transcript documents and related metadata based on different search criteria.

Retrieves transcript documents in XML format and related metadata within FactSet coverage based on various criteria like date range, search text, specific IDs, or event details. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object.

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
        TranscriptsRequest transcriptsRequest = new TranscriptsRequest(); // TranscriptsRequest | Criteria to search for transcripts. Select one mode of search.
        try {
            TranscriptsResponse result = apiInstance.searchTranscripts(transcriptsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TranscriptsApi#searchTranscripts");
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
 **transcriptsRequest** | [**TranscriptsRequest**](TranscriptsRequest.md)| Criteria to search for transcripts. Select one mode of search. |

### Return type

[**TranscriptsResponse**](TranscriptsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts matching the specified criteria. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

