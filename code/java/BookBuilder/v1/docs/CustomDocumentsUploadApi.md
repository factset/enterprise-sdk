# CustomDocumentsUploadApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadCustomDocument**](CustomDocumentsUploadApi.md#uploadCustomDocument) | **POST** /upload-custom-document | Upload a custom document



## uploadCustomDocument

> java.util.List<Object> uploadCustomDocument(_file)

Upload a custom document

Upload any third-party documents that need to be included in the final PDF. Once uploaded, the successful response will be a unique fileurl that can be used to add the files to the PDF output using the create-book endpoint. Supported files include Powerpoint, Word, RTF, and PDF. The total size should not exceed 250MB and each file should not exceed 10MB.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.BookBuilder.ApiClient;
import com.factset.sdk.BookBuilder.ApiException;
import com.factset.sdk.BookBuilder.Configuration;
import com.factset.sdk.BookBuilder.auth.*;
import com.factset.sdk.BookBuilder.models.*;
import com.factset.sdk.BookBuilder.api.CustomDocumentsUploadApi;

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

        CustomDocumentsUploadApi apiInstance = new CustomDocumentsUploadApi(defaultClient);
        java.util.List<File> _file = Arrays.asList(); // java.util.List<File> | 
        try {
            java.util.List<Object> result = apiInstance.uploadCustomDocument(_file);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDocumentsUploadApi#uploadCustomDocument");
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
 **_file** | **List&lt;File&gt;**|  | [optional]

### Return type

**java.util.List&lt;Object&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains file name, fileURL of the book uploaded |  -  |
| **400** | Invalid ticker or Unknown error |  -  |
| **401** | Missing or invalid authentication |  -  |

