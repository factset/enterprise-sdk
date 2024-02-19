# AnswersApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchForAdaptiveCardAnswer**](AnswersApi.md#searchForAdaptiveCardAnswer) | **GET** /search/answers/v1/adaptive-card | Fetch FactSet answer in Adaptive Card format
[**searchForDataAnswer**](AnswersApi.md#searchForDataAnswer) | **GET** /search/answers/v1/data | Fetch FactSet answer in data format



## searchForAdaptiveCardAnswer

> AdaptiveCardAnswerSuccessResponse searchForAdaptiveCardAnswer(query, includeThumbnail, disableNoAnswerResponses, theme)

Fetch FactSet answer in Adaptive Card format

Returns an answer to the specified query (if valid answer exists) in the Adaptive Card format (https://adaptivecards.io/).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        String query = "query_example"; // String | Query for desired answer (e.g., \"fds price\")
        Boolean includeThumbnail = false; // Boolean | Includes thumbnail of Adaptive Card in response
        Boolean disableNoAnswerResponses = true; // Boolean | Disables no-result answer responses (no-results and answer without data)
        String theme = "Light"; // String | Theme for desired answer (e.g., \"Light\", \"Dark\")
        try {
            AdaptiveCardAnswerSuccessResponse result = apiInstance.searchForAdaptiveCardAnswer(query, includeThumbnail, disableNoAnswerResponses, theme);
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
 **theme** | **String**| Theme for desired answer (e.g., \&quot;Light\&quot;, \&quot;Dark\&quot;) | [optional] [default to Light]

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

> DataAnswerSuccessResponse searchForDataAnswer(query, consumingApplication)

Fetch FactSet answer in data format

Returns an answer to the specified query (if a valid answer exists). Returns the answer data only (as JSON), without any markup information.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        String query = "query_example"; // String | Query for desired answer (e.g., \"fds price\")
        String consumingApplication = "Developer Portal"; // String | Name of application consuming the API (used for analytics purposes)
        try {
            DataAnswerSuccessResponse result = apiInstance.searchForDataAnswer(query, consumingApplication);
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
 **consumingApplication** | **String**| Name of application consuming the API (used for analytics purposes) | [optional] [default to Developer Portal]

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

