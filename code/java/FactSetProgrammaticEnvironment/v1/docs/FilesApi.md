# FilesApi

All URIs are relative to *https://api.factset.com/analytics/quant/fpe/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUploadFileStatus**](FilesApi.md#getUploadFileStatus) | **GET** /files/uploads/{id} | Get upload status by id
[**uploadFile**](FilesApi.md#uploadFile) | **POST** /files/{server}/{file} | Starts a file upload



## getUploadFileStatus

> FileUploadStatus getUploadFileStatus(id)

Get upload status by id

This is the endpoint to check on the progress of a previous upload request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiClient;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiException;
import com.factset.sdk.FactSetProgrammaticEnvironment.Configuration;
import com.factset.sdk.FactSetProgrammaticEnvironment.auth.*;
import com.factset.sdk.FactSetProgrammaticEnvironment.models.*;
import com.factset.sdk.FactSetProgrammaticEnvironment.api.FilesApi;

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

        FilesApi apiInstance = new FilesApi(defaultClient);
        String id = "id_example"; // String | From url, provided by location header or response body in the upload start endpoint
        try {
            FileUploadStatus result = apiInstance.getUploadFileStatus(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getUploadFileStatus");
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
 **id** | **String**| From url, provided by location header or response body in the upload start endpoint |

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the upload is finished. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **202** | Expected response. Signals that the upload is still in progress. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## uploadFile

> FileUploadStatus uploadFile(server, _file, body)

Starts a file upload

This endpoint takes a file and uploads it

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.io.File;
// Import classes:
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiClient;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiException;
import com.factset.sdk.FactSetProgrammaticEnvironment.Configuration;
import com.factset.sdk.FactSetProgrammaticEnvironment.auth.*;
import com.factset.sdk.FactSetProgrammaticEnvironment.models.*;
import com.factset.sdk.FactSetProgrammaticEnvironment.api.FilesApi;

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

        FilesApi apiInstance = new FilesApi(defaultClient);
        String server = "server_example"; // String | The server to upload the file to. Either `interactive` or `batch`.
        String _file = "_file_example"; // String | The file name to upload the file to. Existing directory can be specified.
        File body = new File("/path/to/file"); // File | 
        try {
            FileUploadStatus result = apiInstance.uploadFile(server, _file, body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#uploadFile");
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
 **server** | **String**| The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. |
 **_file** | **String**| The file name to upload the file to. Existing directory can be specified. |
 **body** | **File**|  | [optional]

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: *
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Expected response, contains the relative URL in the Location header to check the status of the upload. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

