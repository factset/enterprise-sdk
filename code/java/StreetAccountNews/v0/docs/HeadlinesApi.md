# HeadlinesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStreetAccountHeadlines**](HeadlinesApi.md#getStreetAccountHeadlines) | **POST** /streetaccount/headlines | Retrieve StreetAccount headlines for given filters
[**getStreetAccountHeadlinesByView**](HeadlinesApi.md#getStreetAccountHeadlinesByView) | **POST** /streetaccount/views/{id}/headlines | Retrieve StreetAccount headlines for given view



## getStreetAccountHeadlines

> SearchResponse getStreetAccountHeadlines(saHeadlinesRequest)

Retrieve StreetAccount headlines for given filters

This endpoint will pull all headlines produced by StreetAccount and the full story body will be returned by the data set. Filters can be specified via the endpoint below.

### Example

```java
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.HeadlinesApi;

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

        HeadlinesApi apiInstance = new HeadlinesApi(defaultClient);
        SaHeadlinesRequest saHeadlinesRequest = new SaHeadlinesRequest(); // SaHeadlinesRequest | Filter Body which needs to be sent with request
        try {
            SearchResponse result = apiInstance.getStreetAccountHeadlines(saHeadlinesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HeadlinesApi#getStreetAccountHeadlines");
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
 **saHeadlinesRequest** | [**SaHeadlinesRequest**](SaHeadlinesRequest.md)| Filter Body which needs to be sent with request | [optional]

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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## getStreetAccountHeadlinesByView

> SearchResponse getStreetAccountHeadlinesByView(id, saHeadlinesRequestByView)

Retrieve StreetAccount headlines for given view

This endpoint allows you to pull all headlines produced by StreetAccount for a saved view. The full story body will be returned by the data set. Views can be created via the ‘Create Views’ endpoint.

### Example

```java
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.HeadlinesApi;

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

        HeadlinesApi apiInstance = new HeadlinesApi(defaultClient);
        String id = "SA News View"; // String | view id of the view to return headlines for
        SaHeadlinesRequestByView saHeadlinesRequestByView = new SaHeadlinesRequestByView(); // SaHeadlinesRequestByView | View body which needs to be sent with request
        try {
            SearchResponse result = apiInstance.getStreetAccountHeadlinesByView(id, saHeadlinesRequestByView);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HeadlinesApi#getStreetAccountHeadlinesByView");
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
 **id** | **String**| view id of the view to return headlines for |
 **saHeadlinesRequestByView** | [**SaHeadlinesRequestByView**](SaHeadlinesRequestByView.md)| View body which needs to be sent with request | [optional]

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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

