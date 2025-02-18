# CustomDocumentsFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomUploadList**](CustomDocumentsFetchApi.md#getCustomUploadList) | **GET** /custom-upload-list | Check out the documents uploaded before to use them in creating books



## getCustomUploadList

> java.util.List<Object> getCustomUploadList()

Check out the documents uploaded before to use them in creating books

Retrieves the list of documents uploaded before using the endpoint "/upload-custom-document". The documents uploaded are available for 30 days from the date of uploading.

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
import com.factset.sdk.BookBuilder.api.CustomDocumentsFetchApi;

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

        CustomDocumentsFetchApi apiInstance = new CustomDocumentsFetchApi(defaultClient);
        try {
            java.util.List<Object> result = apiInstance.getCustomUploadList();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDocumentsFetchApi#getCustomUploadList");
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

**java.util.List&lt;Object&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains file name, fileURL and the date and time the book was uploaded |  -  |
| **401** | Missing or invalid authentication |  -  |

