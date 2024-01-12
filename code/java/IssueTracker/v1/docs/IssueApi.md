# IssueApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIssue**](IssueApi.md#getIssue) | **GET** /issues/{id} | Get the matched issue details
[**postIssue**](IssueApi.md#postIssue) | **POST** /issues | Creates a Issue Tracker issue
[**postReply**](IssueApi.md#postReply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue



## getIssue

> Issue getIssue(id)

Get the matched issue details

Retrieve the information of the client with the matching issue Id.

### Example

```java
// Import classes:
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.auth.*;
import com.factset.sdk.IssueTracker.models.*;
import com.factset.sdk.IssueTracker.api.IssueApi;

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

        IssueApi apiInstance = new IssueApi(defaultClient);
        String id = "id_example"; // String |   ID of Issue Tracker issue
        try {
            Issue result = apiInstance.getIssue(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IssueApi#getIssue");
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
 **id** | **String**|   ID of Issue Tracker issue |

### Return type

[**Issue**](Issue.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## postIssue

> IdResponse postIssue(issueRequest)

Creates a Issue Tracker issue

Creates a new issue in Issue Tracker

### Example

```java
// Import classes:
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.auth.*;
import com.factset.sdk.IssueTracker.models.*;
import com.factset.sdk.IssueTracker.api.IssueApi;

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

        IssueApi apiInstance = new IssueApi(defaultClient);
        IssueRequest issueRequest = new IssueRequest(); // IssueRequest | 
        try {
            IdResponse result = apiInstance.postIssue(issueRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IssueApi#postIssue");
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
 **issueRequest** | [**IssueRequest**](IssueRequest.md)|  | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## postReply

> IdResponse postReply(id, commentRequest)

post comment to Issue Tracker issue

Reply to the existing matched issue 

### Example

```java
// Import classes:
import com.factset.sdk.IssueTracker.ApiClient;
import com.factset.sdk.IssueTracker.ApiException;
import com.factset.sdk.IssueTracker.Configuration;
import com.factset.sdk.IssueTracker.auth.*;
import com.factset.sdk.IssueTracker.models.*;
import com.factset.sdk.IssueTracker.api.IssueApi;

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

        IssueApi apiInstance = new IssueApi(defaultClient);
        String id = "id_example"; // String | ID of Issue Tracker issue
        CommentRequest commentRequest = new CommentRequest(); // CommentRequest | 
        try {
            IdResponse result = apiInstance.postReply(id, commentRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling IssueApi#postReply");
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
 **id** | **String**| ID of Issue Tracker issue |
 **commentRequest** | [**CommentRequest**](CommentRequest.md)|  | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

