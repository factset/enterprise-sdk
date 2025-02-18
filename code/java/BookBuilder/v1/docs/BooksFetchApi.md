# BooksFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadBook**](BooksFetchApi.md#downloadBook) | **GET** /download-api-book-aws/{book_id} | Retrieves book in PDF format
[**getBookList**](BooksFetchApi.md#getBookList) | **GET** /book-list | Check out the books that are in the book library



## downloadBook

> DownloadBookResponseWrapper downloadBook(bookId)

Retrieves book in PDF format

This endpoint uses the BookId returned from any of the request above. Returns the URL to load the book for the book ID requested. The URL will be in JSON format, the final book will be in PDF format. <br><br> NOTE -- The execution of this endpoint requires an extra step within the developer portal due to authentication limitations. When using the actual API, a successful response for this endpoint will be the PDF book rather than the URL to the PDF. <br><br><b><i>The actual endpoint is </b><font color=blue>https://api.factset.com/book-builder-api/v1/download-api-book/{book_id}</font></i>

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
import com.factset.sdk.BookBuilder.api.BooksFetchApi;
import com.factset.sdk.BookBuilder.api.BooksFetchApi.DownloadBookResponseWrapper;

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

        BooksFetchApi apiInstance = new BooksFetchApi(defaultClient);
        String bookId = "20200331093828132"; // String | A string representing the unique ID for a specific book. This ID must be provided in the URL path.
        try {
            DownloadBookResponseWrapper result = apiInstance.downloadBook(bookId);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // EnableBookDownload
            
                case 202:
                    System.out.println(result.getResponse202()); // java.util.List<BookProcessingResponseItem>
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling BooksFetchApi#downloadBook");
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
 **bookId** | **String**| A string representing the unique ID for a specific book. This ID must be provided in the URL path. |

### Return type

DownloadBookResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains URL to load the book for the BookID requested |  -  |
| **202** | Book is processing. Please check back later. |  -  |
| **400** | Something went wrong. Please create a new request. |  -  |
| **401** | Missing or invalid authentication |  -  |
| **503** | Unrecognized BookId |  -  |


## getBookList

> java.util.List<BookInfo> getBookList()

Check out the books that are in the book library

Retrieves the list of books that were previously created and are available in the client's book library

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
import com.factset.sdk.BookBuilder.api.BooksFetchApi;

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

        BooksFetchApi apiInstance = new BooksFetchApi(defaultClient);
        try {
            java.util.List<BookInfo> result = apiInstance.getBookList();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BooksFetchApi#getBookList");
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

[**java.util.List&lt;BookInfo&gt;**](BookInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains book name, book ID, created date, shared status of the book and book type |  -  |
| **401** | Missing or Invalid authentication |  -  |

