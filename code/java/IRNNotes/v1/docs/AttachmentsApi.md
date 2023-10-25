# AttachmentsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttachment**](AttachmentsApi.md#createAttachment) | **POST** /v1/notes/{noteId}/attachments | Create an attachment for an existing note
[**downloadAttachment**](AttachmentsApi.md#downloadAttachment) | **GET** /v1/notes/{noteId}/attachments/{attachmentId}/download | Download an attachment from a Note
[**getAttachments**](AttachmentsApi.md#getAttachments) | **GET** /v1/notes/{noteId}/attachments | Get all the attachments belonging to a note
[**softDeleteNoteAttachment**](AttachmentsApi.md#softDeleteNoteAttachment) | **DELETE** /v1/notes/{noteId}/attachments/{attachmentId} | Delete attachment from note



## createAttachment

> NewItemDto createAttachment(noteId, _file)

Create an attachment for an existing note

### Example

```java
import java.io.File;
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | 
        File _file = new File("/path/to/file"); // File | 
        try {
            NewItemDto result = apiInstance.createAttachment(noteId, _file);
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
 **noteId** | **java.util.UUID**|  |
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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## downloadAttachment

> downloadAttachment(noteId, attachmentId)

Download an attachment from a Note

### Example

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | 
        java.util.UUID attachmentId = new java.util.UUID(); // java.util.UUID | 
        try {
            apiInstance.downloadAttachment(noteId, attachmentId);

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
 **noteId** | **java.util.UUID**|  |
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

> java.util.List<AttachmentSummaryDto> getAttachments(noteId)

Get all the attachments belonging to a note

### Example

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | Note Id
        try {
            java.util.List<AttachmentSummaryDto> result = apiInstance.getAttachments(noteId);
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
 **noteId** | **java.util.UUID**| Note Id |

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


## softDeleteNoteAttachment

> softDeleteNoteAttachment(noteId, attachmentId)

Delete attachment from note

### Example

```java
// Import classes:
import com.factset.sdk.IRNNotes.ApiClient;
import com.factset.sdk.IRNNotes.ApiException;
import com.factset.sdk.IRNNotes.Configuration;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.AttachmentsApi;

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | Note Id
        java.util.UUID attachmentId = new java.util.UUID(); // java.util.UUID | Attachment Id
        try {
            apiInstance.softDeleteNoteAttachment(noteId, attachmentId);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#softDeleteNoteAttachment");
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
 **noteId** | **java.util.UUID**| Note Id |
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

