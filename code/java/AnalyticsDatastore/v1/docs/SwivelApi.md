# SwivelApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSwivelEndpoint**](SwivelApi.md#getSwivelEndpoint) | **GET** /analytics/pub-datastore/swivel/v1/{pubDoc}/{assetName}/{reportId}/{tileId}/{accountId} | Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.



## getSwivelEndpoint

> java.util.List<String> getSwivelEndpoint(pubDoc, assetName, reportId, tileId, accountId)

Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

```java
// Import classes:
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.SwivelApi;

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

        SwivelApi apiInstance = new SwivelApi(defaultClient);
        String pubDoc = "Analytics_Datastore"; // String | The publisher document containing the report
        String assetName = "ADS_Demo.PA3"; // String | The PA/SPAR asset name and extension
        String reportId = "report7"; // String | The PA/SPAR report ID
        String tileId = "tile0"; // String | The PA/SPAR tile ID
        String accountId = "LARGE_CORE"; // String | The account ID
        try {
            java.util.List<String> result = apiInstance.getSwivelEndpoint(pubDoc, assetName, reportId, tileId, accountId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SwivelApi#getSwivelEndpoint");
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
 **pubDoc** | **String**| The publisher document containing the report | [default to Analytics_Datastore]
 **assetName** | **String**| The PA/SPAR asset name and extension | [default to ADS_Demo.PA3]
 **reportId** | **String**| The PA/SPAR report ID | [default to report7]
 **tileId** | **String**| The PA/SPAR tile ID | [default to tile0]
 **accountId** | **String**| The account ID | [default to LARGE_CORE]

### Return type

**java.util.List&lt;String&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: headers

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response (when redirect followed), returns json response body of the report. |  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/pub-datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

