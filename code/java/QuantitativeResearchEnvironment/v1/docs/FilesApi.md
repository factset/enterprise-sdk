# FilesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsQuantQreV1FilesServerFilePost**](FilesApi.md#analyticsQuantQreV1FilesServerFilePost) | **POST** /analytics/quant/qre/v1/files/{server}/{file} | Starts a file upload
[**analyticsQuantQreV1FilesUploadsIdGet**](FilesApi.md#analyticsQuantQreV1FilesUploadsIdGet) | **GET** /analytics/quant/qre/v1/files/uploads/{id} | Get upload status by id



## analyticsQuantQreV1FilesServerFilePost

> FileUploadStatus analyticsQuantQreV1FilesServerFilePost(server, file, body)

Starts a file upload

This endpoint takes a file and uploads it

### Example

```java
import java.io.File;
// Import classes:
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.auth.*;
import com.factset.sdk.QuantitativeResearchEnvironment.model.*;
import com.factset.sdk.QuantitativeResearchEnvironment.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String server = "server_example"; // String | The server to upload the file to. Either `interactive` or `batch`.
        String file = "file_example"; // String | The file name to upload the file to. Existing directory can be specified.
        File body = new File("/path/to/file"); // File | 
        try {
            FileUploadStatus result = apiInstance.analyticsQuantQreV1FilesServerFilePost(server, file, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#analyticsQuantQreV1FilesServerFilePost");
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
 **file** | **String**| The file name to upload the file to. Existing directory can be specified. |
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


## analyticsQuantQreV1FilesUploadsIdGet

> FileUploadStatus analyticsQuantQreV1FilesUploadsIdGet(id)

Get upload status by id

This is the endpoint to check on the progress of a previous upload request.

### Example

```java
// Import classes:
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.auth.*;
import com.factset.sdk.QuantitativeResearchEnvironment.model.*;
import com.factset.sdk.QuantitativeResearchEnvironment.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String id = "id_example"; // String | From url, provided by location header or response body in the upload start endpoint
        try {
            FileUploadStatus result = apiInstance.analyticsQuantQreV1FilesUploadsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#analyticsQuantQreV1FilesUploadsIdGet");
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

