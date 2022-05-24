# DefaultApi

All URIs are relative to *http://ai-text-summarization-staging.factset.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResultV1ResultResultId**](DefaultApi.md#getResultV1ResultResultId) | **GET** /v1/result/{result_id} | GET request that returns the full headline and summary results from the initial POST requests
[**postHeadlineAndSummaryV1HeadlineAndSummary**](DefaultApi.md#postHeadlineAndSummaryV1HeadlineAndSummary) | **POST** /v1/headline-and-summary | POST request to create a 2-3 sentence summary from input text
[**postHeadlineV1Headline**](DefaultApi.md#postHeadlineV1Headline) | **POST** /v1/headline | POST request to create a headline from input text
[**postSummaryV1Summary**](DefaultApi.md#postSummaryV1Summary) | **POST** /v1/summary | POST request to create a headline and summary from input text



## getResultV1ResultResultId

> SuccessResponse getResultV1ResultResultId(resultId)

GET request that returns the full headline and summary results from the initial POST requests

Endpoint that returns the full headline and summary results from the initial POST requests.

### Example

```java
// Import classes:
import com.factset.sdk.AITextSummarization.ApiClient;
import com.factset.sdk.AITextSummarization.ApiException;
import com.factset.sdk.AITextSummarization.Configuration;
import com.factset.sdk.AITextSummarization.auth.*;
import com.factset.sdk.AITextSummarization.models.*;
import com.factset.sdk.AITextSummarization.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String resultId = "resultId_example"; // String | 
        try {
            SuccessResponse result = apiInstance.getResultV1ResultResultId(resultId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getResultV1ResultResultId");
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
 **resultId** | **String**|  |

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **202** | Processing |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **404** | Invalid Result ID |  -  |
| **500** | Internal Server Error |  -  |


## postHeadlineAndSummaryV1HeadlineAndSummary

> String postHeadlineAndSummaryV1HeadlineAndSummary(payload)

POST request to create a 2-3 sentence summary from input text

Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.

### Example

```java
// Import classes:
import com.factset.sdk.AITextSummarization.ApiClient;
import com.factset.sdk.AITextSummarization.ApiException;
import com.factset.sdk.AITextSummarization.Configuration;
import com.factset.sdk.AITextSummarization.auth.*;
import com.factset.sdk.AITextSummarization.models.*;
import com.factset.sdk.AITextSummarization.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Request payload = new Request(); // Request | 
        try {
            String result = apiInstance.postHeadlineAndSummaryV1HeadlineAndSummary(payload);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postHeadlineAndSummaryV1HeadlineAndSummary");
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
 **payload** | [**Request**](Request.md)|  |

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |


## postHeadlineV1Headline

> String postHeadlineV1Headline(payload)

POST request to create a headline from input text

Endpoint for initiating a processing job to create a headline from input text.

### Example

```java
// Import classes:
import com.factset.sdk.AITextSummarization.ApiClient;
import com.factset.sdk.AITextSummarization.ApiException;
import com.factset.sdk.AITextSummarization.Configuration;
import com.factset.sdk.AITextSummarization.auth.*;
import com.factset.sdk.AITextSummarization.models.*;
import com.factset.sdk.AITextSummarization.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Request payload = new Request(); // Request | 
        try {
            String result = apiInstance.postHeadlineV1Headline(payload);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postHeadlineV1Headline");
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
 **payload** | [**Request**](Request.md)|  |

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |


## postSummaryV1Summary

> String postSummaryV1Summary(payload)

POST request to create a headline and summary from input text

Endpoint for initiating a processing job to create a headline and summary from input text.

### Example

```java
// Import classes:
import com.factset.sdk.AITextSummarization.ApiClient;
import com.factset.sdk.AITextSummarization.ApiException;
import com.factset.sdk.AITextSummarization.Configuration;
import com.factset.sdk.AITextSummarization.auth.*;
import com.factset.sdk.AITextSummarization.models.*;
import com.factset.sdk.AITextSummarization.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Request payload = new Request(); // Request | 
        try {
            String result = apiInstance.postSummaryV1Summary(payload);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#postSummaryV1Summary");
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
 **payload** | [**Request**](Request.md)|  |

### Return type

**String**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |

