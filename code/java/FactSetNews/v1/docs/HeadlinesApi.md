# HeadlinesApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFactSetNewsHeadlines**](HeadlinesApi.md#getFactSetNewsHeadlines) | **POST** /headlines | Retrieve FactSet News headlines for the given filters
[**getFactSetNewsHeadlinesByView**](HeadlinesApi.md#getFactSetNewsHeadlinesByView) | **POST** /headlines/view | Retrieve FactSet News headlines for given view



## getFactSetNewsHeadlines

> SearchResponse getFactSetNewsHeadlines(headlinesRequest)

Retrieve FactSet News headlines for the given filters

This endpoint will pull all FactSet News headlines. Filters can be specified via the endpoint below. Please refer to `/filters` endpoint to obtain the values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.HeadlinesApi;

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

        HeadlinesApi apiInstance = new HeadlinesApi(defaultClient);
        HeadlinesRequest headlinesRequest = new HeadlinesRequest(); // HeadlinesRequest | Filter Body which needs to be sent with request.
        try {
            SearchResponse result = apiInstance.getFactSetNewsHeadlines(headlinesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HeadlinesApi#getFactSetNewsHeadlines");
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
 **headlinesRequest** | [**HeadlinesRequest**](HeadlinesRequest.md)| Filter Body which needs to be sent with request. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getFactSetNewsHeadlinesByView

> SearchResponse getFactSetNewsHeadlinesByView(headlinesRequestByView)

Retrieve FactSet News headlines for given view

This endpoint allows you to pull all FactSet News Headlines for a saved view. Views can be created via the 'Create Views' endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.HeadlinesApi;

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

        HeadlinesApi apiInstance = new HeadlinesApi(defaultClient);
        HeadlinesRequestByView headlinesRequestByView = new HeadlinesRequestByView(); // HeadlinesRequestByView | View body which needs to be sent with request.
        try {
            SearchResponse result = apiInstance.getFactSetNewsHeadlinesByView(headlinesRequestByView);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HeadlinesApi#getFactSetNewsHeadlinesByView");
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
 **headlinesRequestByView** | [**HeadlinesRequestByView**](HeadlinesRequestByView.md)| View body which needs to be sent with request. | [optional]

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

