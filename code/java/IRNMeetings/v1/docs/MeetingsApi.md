# MeetingsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMeeting**](MeetingsApi.md#createMeeting) | **POST** /v1/meetings | Create a meeting
[**deleteMeeting**](MeetingsApi.md#deleteMeeting) | **DELETE** /v1/meetings/{meetingId} | Delete a Meeting
[**getMeeting**](MeetingsApi.md#getMeeting) | **GET** /v1/meetings/{meetingId} | Get details of a meeting
[**getMeetings**](MeetingsApi.md#getMeetings) | **GET** /v1/meetings | Get all the meetings in the specified date range filtered on the given identifiers
[**updateMeeting**](MeetingsApi.md#updateMeeting) | **PUT** /v1/meetings/{meetingId} | Update meeting



## createMeeting

> NewItemDto createMeeting(createMeetingDto)

Create a meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.model.*;
import com.factset.sdk.IRNMeetings.api.MeetingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        MeetingsApi apiInstance = new MeetingsApi(defaultClient);
        CreateMeetingDto createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | Note: The organizer property is deprecated in favor of organizerId
        try {
            NewItemDto result = apiInstance.createMeeting(createMeetingDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetingsApi#createMeeting");
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
 **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)| Note: The organizer property is deprecated in favor of organizerId | [optional]

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success - Returns unique identifier of the meeting created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## deleteMeeting

> deleteMeeting(meetingId)

Delete a Meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.model.*;
import com.factset.sdk.IRNMeetings.api.MeetingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        MeetingsApi apiInstance = new MeetingsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | 
        try {
            apiInstance.deleteMeeting(meetingId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetingsApi#deleteMeeting");
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
 **meetingId** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |


## getMeeting

> MeetingDto getMeeting(meetingId)

Get details of a meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.model.*;
import com.factset.sdk.IRNMeetings.api.MeetingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        MeetingsApi apiInstance = new MeetingsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | Meeting Id
        try {
            MeetingDto result = apiInstance.getMeeting(meetingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetingsApi#getMeeting");
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
 **meetingId** | **java.util.UUID**| Meeting Id |

### Return type

[**MeetingDto**](MeetingDto.md)

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


## getMeetings

> java.util.List&lt;MeetingSummaryDto&gt; getMeetings(start, end, identifiers, limit, modifiedSince, xIRNIncludeDeleted)

Get all the meetings in the specified date range filtered on the given identifiers

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.model.*;
import com.factset.sdk.IRNMeetings.api.MeetingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        MeetingsApi apiInstance = new MeetingsApi(defaultClient);
        String start = "start_example"; // String | StartDate
        String end = "end_example"; // String | EndDate
        java.util.List<String> identifiers = Arrays.asList(); // java.util.List<String> | Set of identifiers to filter on
        Integer limit = 56; // Integer | Limit on the number of meetings retrieved
        String modifiedSince = "modifiedSince_example"; // String | Only return meetings which have been modified or created since a particular time
        Boolean xIRNIncludeDeleted = false; // Boolean | Includes deleted meetings in results when set to true
        try {
            java.util.List<MeetingSummaryDto> result = apiInstance.getMeetings(start, end, identifiers, limit, modifiedSince, xIRNIncludeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetingsApi#getMeetings");
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
 **start** | **String**| StartDate | [optional]
 **end** | **String**| EndDate | [optional]
 **identifiers** | **List&lt;String&gt;**| Set of identifiers to filter on | [optional]
 **limit** | **Integer**| Limit on the number of meetings retrieved | [optional]
 **modifiedSince** | **String**| Only return meetings which have been modified or created since a particular time | [optional]
 **xIRNIncludeDeleted** | **Boolean**| Includes deleted meetings in results when set to true | [optional] [default to false]

### Return type

[**java.util.List&lt;MeetingSummaryDto&gt;**](MeetingSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## updateMeeting

> updateMeeting(meetingId, updateMeetingDto)

Update meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.model.*;
import com.factset.sdk.IRNMeetings.api.MeetingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        MeetingsApi apiInstance = new MeetingsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | Meeting Id
        UpdateMeetingDto updateMeetingDto = new UpdateMeetingDto(); // UpdateMeetingDto | Meeting details to update. Note: The organizer property is deprecated in favor of organizerId
        try {
            apiInstance.updateMeeting(meetingId, updateMeetingDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling MeetingsApi#updateMeeting");
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
 **meetingId** | **java.util.UUID**| Meeting Id |
 **updateMeetingDto** | [**UpdateMeetingDto**](UpdateMeetingDto.md)| Meeting details to update. Note: The organizer property is deprecated in favor of organizerId | [optional]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

