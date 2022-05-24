# AnswersApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchForAdaptiveCardAnswer**](AnswersApi.md#searchForAdaptiveCardAnswer) | **GET** /search/answers/v1/adaptive-card | Fetch FactSet answer in Adaptive Card format
[**searchForDataAnswer**](AnswersApi.md#searchForDataAnswer) | **GET** /search/answers/v1/data | Fetch FactSet answer in data format



## searchForAdaptiveCardAnswer

> AdaptiveCardAnswerSuccessResponse searchForAdaptiveCardAnswer(query, includeThumbnail, disableNoAnswerResponses)

Fetch FactSet answer in Adaptive Card format

Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).

### Example

```java
// Import classes:
import com.factset.sdk.FactSetSearchAnswers.ApiClient;
import com.factset.sdk.FactSetSearchAnswers.ApiException;
import com.factset.sdk.FactSetSearchAnswers.Configuration;
import com.factset.sdk.FactSetSearchAnswers.auth.*;
import com.factset.sdk.FactSetSearchAnswers.models.*;
import com.factset.sdk.FactSetSearchAnswers.api.AnswersApi;

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

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        String query = "query_example"; // String | Query for desired answer (e.g., \"fds price\")
        Boolean includeThumbnail = false; // Boolean | Includes thumbnail of Adaptive Card in response
        Boolean disableNoAnswerResponses = true; // Boolean | Disables no-result answer responses (no-results and answer without data)
        try {
            AdaptiveCardAnswerSuccessResponse result = apiInstance.searchForAdaptiveCardAnswer(query, includeThumbnail, disableNoAnswerResponses);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#searchForAdaptiveCardAnswer");
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
 **query** | **String**| Query for desired answer (e.g., \&quot;fds price\&quot;) |
 **includeThumbnail** | **Boolean**| Includes thumbnail of Adaptive Card in response | [optional] [default to false]
 **disableNoAnswerResponses** | **Boolean**| Disables no-result answer responses (no-results and answer without data) | [optional] [default to true]

### Return type

[**AdaptiveCardAnswerSuccessResponse**](AdaptiveCardAnswerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful. |  -  |
| **400** | Missing or empty query. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **500** | Unhandled error occurred while processing the request. |  -  |


## searchForDataAnswer

> DataAnswerSuccessResponse searchForDataAnswer(query)

Fetch FactSet answer in data format

Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetSearchAnswers.ApiClient;
import com.factset.sdk.FactSetSearchAnswers.ApiException;
import com.factset.sdk.FactSetSearchAnswers.Configuration;
import com.factset.sdk.FactSetSearchAnswers.auth.*;
import com.factset.sdk.FactSetSearchAnswers.models.*;
import com.factset.sdk.FactSetSearchAnswers.api.AnswersApi;

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

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        String query = "query_example"; // String | Query for desired answer (e.g., \"fds price\")
        try {
            DataAnswerSuccessResponse result = apiInstance.searchForDataAnswer(query);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#searchForDataAnswer");
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
 **query** | **String**| Query for desired answer (e.g., \&quot;fds price\&quot;) |

### Return type

[**DataAnswerSuccessResponse**](DataAnswerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful. |  -  |
| **400** | Missing or empty query. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **500** | Unhandled error occurred while processing the request. |  -  |

