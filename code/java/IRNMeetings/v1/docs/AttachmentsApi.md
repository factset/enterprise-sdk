# AttachmentsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttachment**](AttachmentsApi.md#createAttachment) | **POST** /v1/meetings/{meetingId}/attachments | Create an attachment for a existing meeting
[**downloadAttachment**](AttachmentsApi.md#downloadAttachment) | **GET** /v1/meetings/{meetingId}/attachments/{attachmentId}/download | Download an attachment from a Meeting
[**getAttachments**](AttachmentsApi.md#getAttachments) | **GET** /v1/meetings/{meetingId}/attachments | Get all the attachments belonging to a meeting
[**softDeleteMeetingAttachment**](AttachmentsApi.md#softDeleteMeetingAttachment) | **DELETE** /v1/meetings/{meetingId}/attachments/{attachmentId} | Delete attachment from meeting



## createAttachment

> NewItemDto createAttachment(meetingId, _file)

Create an attachment for a existing meeting

### Example

```java
import java.io.File;
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.models.*;
import com.factset.sdk.IRNMeetings.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | Meeting Id
        File _file = new File("/path/to/file"); // File | 
        try {
            NewItemDto result = apiInstance.createAttachment(meetingId, _file);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#createAttachment");
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
 **_file** | **File**|  |

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success - Returns unique identifier of the Attachment |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## downloadAttachment

> downloadAttachment(meetingId, attachmentId)

Download an attachment from a Meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.models.*;
import com.factset.sdk.IRNMeetings.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | 
        java.util.UUID attachmentId = new java.util.UUID(); // java.util.UUID | 
        try {
            apiInstance.downloadAttachment(meetingId, attachmentId);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#downloadAttachment");
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
 **attachmentId** | **java.util.UUID**|  |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getAttachments

> java.util.List<AttachmentSummaryDto> getAttachments(meetingId)

Get all the attachments belonging to a meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.models.*;
import com.factset.sdk.IRNMeetings.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | Meeting Id
        try {
            java.util.List<AttachmentSummaryDto> result = apiInstance.getAttachments(meetingId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#getAttachments");
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

[**java.util.List&lt;AttachmentSummaryDto&gt;**](AttachmentSummaryDto.md)

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


## softDeleteMeetingAttachment

> softDeleteMeetingAttachment(meetingId, attachmentId)

Delete attachment from meeting

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.models.*;
import com.factset.sdk.IRNMeetings.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID meetingId = new java.util.UUID(); // java.util.UUID | Meeting Id
        java.util.UUID attachmentId = new java.util.UUID(); // java.util.UUID | Attachment Id
        try {
            apiInstance.softDeleteMeetingAttachment(meetingId, attachmentId);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#softDeleteMeetingAttachment");
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
 **attachmentId** | **java.util.UUID**| Attachment Id |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

