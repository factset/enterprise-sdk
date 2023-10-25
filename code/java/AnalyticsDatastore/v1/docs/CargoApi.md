# CargoApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCargoEndpoint**](CargoApi.md#getCargoEndpoint) | **GET** /analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId} | Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.



## getCargoEndpoint

> java.util.List<String> getCargoEndpoint(groupId, objectId)

Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.

STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/ 

Optional request header "accept-encoding", with allowed values of "br" and "gzip". If accept-encoding is passed, the response is compressed.

### Example

```java
// Import classes:
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.CargoApi;

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

        CargoApi apiInstance = new CargoApi(defaultClient);
        String groupId = "a4186c50f8e74f979d271dd22298c901"; // String | The ID of the group
        String objectId = "fe875bc4150542dea6bc237663a01a0d"; // String | The ID of the object
        try {
            java.util.List<String> result = apiInstance.getCargoEndpoint(groupId, objectId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CargoApi#getCargoEndpoint");
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
 **groupId** | **String**| The ID of the group | [default to a4186c50f8e74f979d271dd22298c901]
 **objectId** | **String**| The ID of the object | [default to fe875bc4150542dea6bc237663a01a0d]

### Return type

**java.util.List&lt;String&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns json response body of the report. |  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

