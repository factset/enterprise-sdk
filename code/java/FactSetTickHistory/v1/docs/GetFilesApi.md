# GetFilesApi

All URIs are relative to *https://api-sandbox.factset.com/bulk-documents/tickhistory*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1GetFilesGet**](GetFilesApi.md#v1GetFilesGet) | **GET** /v1/get-files | Returns the files from tickhistory endpoint for the specified date range



## v1GetFilesGet

> GetFilesResponse v1GetFilesGet(requestId, paginationLimit, paginationOffset)

Returns the files from tickhistory endpoint for the specified date range

### Example

```java
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.GetFilesApi;

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

        GetFilesApi apiInstance = new GetFilesApi(defaultClient);
        String requestId = "requestId_example"; // String | RequestId returned by request-files endpoint to poll and collect results of the query
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per response page
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            GetFilesResponse result = apiInstance.v1GetFilesGet(requestId, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GetFilesApi#v1GetFilesGet");
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
 **requestId** | **String**| RequestId returned by request-files endpoint to poll and collect results of the query |
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type

[**GetFilesResponse**](GetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **400** | Bad Request |  -  |

