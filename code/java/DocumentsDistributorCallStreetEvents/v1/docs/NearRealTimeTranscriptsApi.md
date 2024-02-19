# NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment.
[**getBulkDocumentsNrtV1IndexedNrt**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1IndexedNrt) | **GET** /bulk-documents/nrt/v1/indexed-nrt | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**getBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1ListSnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest transcript snippets from an active call.
[**getBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getBulkDocumentsNrtV1Speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



## getBulkDocumentsNrtV1Calls

> NRTCalls getBulkDocumentsNrtV1Calls(paginationLimit, paginationOffset, audioSourceId, reportId, sort, entityId, ticker, callStatus)

Returns the active calls happening at the moment.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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
        Integer paginationLimit = 200; // Integer | Specifies the  number of results to return per page. [ Min=0; Max=500]
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        Integer audioSourceId = 471849; // Integer | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
        Integer reportId = 2683372; // Integer | Unique identifier for an event.
        String sort = "startDate"; // String | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used.
        String entityId = "000CGP-E"; // String | Factset entity level identifier for the company hosting the event.
        String ticker = "AZZ-US"; // String | Ticker-region identifier for the company hosting the event.
        String callStatus = "inProgress"; // String | Status of the call i.e. ended or inProgress or ewn or issueAtSource.
        try {
            NRTCalls result = apiInstance.getBulkDocumentsNrtV1Calls(paginationLimit, paginationOffset, audioSourceId, reportId, sort, entityId, ticker, callStatus);
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
 **paginationLimit** | **Integer**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional]
 **reportId** | **Integer**| Unique identifier for an event. | [optional]
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate] [enum: startDate, -startDate]
 **entityId** | **String**| Factset entity level identifier for the company hosting the event. | [optional]
 **ticker** | **String**| Ticker-region identifier for the company hosting the event. | [optional]
 **callStatus** | **String**| Status of the call i.e. ended or inProgress or ewn or issueAtSource. | [optional] [enum: inProgress, ended, ewn, issueAtSource]

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1IndexedNrt

> IndexedNRT getBulkDocumentsNrtV1IndexedNrt(audioSourceId, paginationLimit, paginationOffset, reportId)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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
        Integer paginationLimit = 25; // Integer | Specifies the  number of results to return per page. [ Min=0; Max=50 ]
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        Integer reportId = 2683372; // Integer | Unique identifier for an event.
        try {
            IndexedNRT result = apiInstance.getBulkDocumentsNrtV1IndexedNrt(audioSourceId, paginationLimit, paginationOffset, reportId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NearRealTimeTranscriptsApi#getBulkDocumentsNrtV1IndexedNrt");
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
 **paginationLimit** | **Integer**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] | [optional] [default to 25]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **reportId** | **Integer**| Unique identifier for an event. | [optional]

### Return type

[**IndexedNRT**](IndexedNRT.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1ListSnippets

> NRTSnippets getBulkDocumentsNrtV1ListSnippets(audioSourceId, paginationLimit, paginationOffset, reportId)

Returns the latest transcript snippets from an active call.

Returns the latest snippets from an active call

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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
        Integer paginationLimit = 200; // Integer | Specifies the  number of results to return per page. [ Min=0; Max=500]
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        Integer reportId = 2683372; // Integer | Unique identifier for an event.
        try {
            NRTSnippets result = apiInstance.getBulkDocumentsNrtV1ListSnippets(audioSourceId, paginationLimit, paginationOffset, reportId);
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
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **paginationLimit** | **Integer**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **reportId** | **Integer**| Unique identifier for an event. | [optional]

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getBulkDocumentsNrtV1Speakerids

> NRTSpeakerids getBulkDocumentsNrtV1Speakerids(audioSourceId, paginationLimit, paginationOffset, sort)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiClient;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.ApiException;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.Configuration;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.auth.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.models.*;
import com.factset.sdk.DocumentsDistributorCallStreetEvents.api.NearRealTimeTranscriptsApi;

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
        Integer paginationLimit = 200; // Integer | Specifies the  number of results to return per page. [ Min=0; Max=500]
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        String sort = "startDate"; // String | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used.
        try {
            NRTSpeakerids result = apiInstance.getBulkDocumentsNrtV1Speakerids(audioSourceId, paginationLimit, paginationOffset, sort);
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
 **audioSourceId** | **Integer**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. |
 **paginationLimit** | **Integer**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **sort** | **String**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used. | [optional] [default to startDate] [enum: startDate, -startDate]

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

