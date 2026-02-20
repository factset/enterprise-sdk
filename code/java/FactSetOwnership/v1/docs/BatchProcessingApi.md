# BatchProcessingApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchData**](BatchProcessingApi.md#getBatchData) | **GET** /batch-result | Returns the response for the Batch Request
[**getBatchStatus**](BatchProcessingApi.md#getBatchStatus) | **GET** /batch-status | Returns the latest status and metadata for the Batch Request.



## getBatchData

> GetBatchDataResponseWrapper getBatchData(id)

Returns the response for the Batch Request

Returns the response data for the specified batch id upon successful completion.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.BatchProcessingApi;
import com.factset.sdk.FactSetOwnership.api.BatchProcessingApi.GetBatchDataResponseWrapper;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.
        try {
            GetBatchDataResponseWrapper result = apiInstance.getBatchData(id);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // BatchResultResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling BatchProcessingApi#getBatchData");
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
 **id** | **java.util.UUID**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. |

### Return type

GetBatchDataResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the request&#39;s response object after the batch request has finished processing and the response is created |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **202** | Batch Request has not finished and the result has NOT been created. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **404** | Resource not found. |  -  |
| **429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
| **500** | Internal Server Error. |  -  |


## getBatchStatus

> BatchStatusResponse getBatchStatus(id)

Returns the latest status and metadata for the Batch Request.

Returns the current processing status of the batch request identified by the specified batch Id. Use this endpoint to monitor and track the progress or completion of long-running batch operations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.BatchProcessingApi;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.
        try {
            BatchStatusResponse result = apiInstance.getBatchStatus(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BatchProcessingApi#getBatchStatus");
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
 **id** | **java.util.UUID**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Batch request processing is complete and response has been created. The response contains the batch ID, timestamps, status, and error details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Location - Path to Batch Request result. <br>  |
| **202** | Batch request processing is still in progress and the result is not yet available. The response contains the batch ID, timestamps, status, and error details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **404** | Resource not found. |  -  |
| **429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
| **500** | Internal Server Error. |  -  |

