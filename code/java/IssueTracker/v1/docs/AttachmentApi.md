# AttachmentApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileAttachment**](AttachmentApi.md#getFileAttachment) | **GET** /attachments/{id}/{name} | get the matched file attachment
[**getFileExtensions**](AttachmentApi.md#getFileExtensions) | **GET** /attachments/file-extensions | Allowed file types GET endpoint
[**postFileAttachment**](AttachmentApi.md#postFileAttachment) | **POST** /attachments | Post file attachment to Issue Tracker Issue or comment



## getFileAttachment

> File getFileAttachment(id, name)

get the matched file attachment

It retreive matched file. However, File read won't work until it used in any issue tracker issue/comment. 

Note: the Accept header gets ignored and the originally uploaded content-type is returned

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.auth.*;
import com.factset.sdk.IssueTracker.models.*;
import com.factset.sdk.IssueTracker.api.AttachmentApi;

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

        AttachmentApi apiInstance = new AttachmentApi(defaultClient);
        String id = "id_example"; // String | identity value of file attachment
        String name = "name_example"; // String | name of the file
        try {
            File result = apiInstance.getFileAttachment(id, name);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentApi#getFileAttachment");
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
 **id** | **String**| identity value of file attachment |
 **name** | **String**| name of the file |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/bmp, image/png, image/gif, image/jpeg, application/pdf, text/csv, application/vnd.openxmlformats-officedocument.wordprocessingml.document, text/plain, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/x-r-source, application/x-dosexec, text/html, application/xml, application/sql, application/vnd.ms-officetheme, application/msword, application/vnd.openxmlformats-officedocument.wordprocessingml.template, application/vnd.openxmlformats-officedocument.presentationml.template, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/zip, application/x-7z-compressed, application/octet-stream, text/tab-separated-values, application/x-iwork-keynote, application/vnd.ms-word.document.macroEnabled.12, application/vnd.ms-word.template.macroEnabled.12, application/vnd.ms-excel.sheet.macroEnabled.12, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getFileExtensions

> FileExtension getFileExtensions()

Allowed file types GET endpoint

This will provide information about file extensions allowed to attachments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.auth.*;
import com.factset.sdk.IssueTracker.models.*;
import com.factset.sdk.IssueTracker.api.AttachmentApi;

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

        AttachmentApi apiInstance = new AttachmentApi(defaultClient);
        try {
            FileExtension result = apiInstance.getFileExtensions();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentApi#getFileExtensions");
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

[**FileExtension**](FileExtension.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## postFileAttachment

> AttachmentResponse postFileAttachment(_file)

Post file attachment to Issue Tracker Issue or comment


This endpoint upload file attachments into Issue Tracker and it allows only single file at a time. It will throws error when tries to upload multiple files in single call. 

File size should not exceed 10Mb. More info provided in examples. It allows only few type of files for attachments. Please review "attachments/file-extensions" endpoint for list allowed file types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.io.File;
// Import classes:
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.auth.*;
import com.factset.sdk.IssueTracker.models.*;
import com.factset.sdk.IssueTracker.api.AttachmentApi;

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

        AttachmentApi apiInstance = new AttachmentApi(defaultClient);
        File _file = new File("/path/to/file"); // File | input file for upload
        try {
            AttachmentResponse result = apiInstance.postFileAttachment(_file);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentApi#postFileAttachment");
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
 **_file** | **File**| input file for upload |

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

