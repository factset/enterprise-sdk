# ServersApi

All URIs are relative to *https://api.factset.com/analytics/quant/fpe/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stopServer**](ServersApi.md#stopServer) | **DELETE** /servers | Stop the caller&#39;s API server



## stopServer

> stopServer()

Stop the caller&#39;s API server

Stops the user's underlying API server so that a subsequent calculation request starts a fresh server that picks up any recent configuration changes. This is a fire-and-forget stop: no new server is started synchronously. A new server is created automatically on the next calculation request. Warning: this will terminate any calculations that are currently running on that server.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiClient;
import com.factset.sdk.FactSetProgrammaticEnvironment.ApiException;
import com.factset.sdk.FactSetProgrammaticEnvironment.Configuration;
import com.factset.sdk.FactSetProgrammaticEnvironment.auth.*;
import com.factset.sdk.FactSetProgrammaticEnvironment.models.*;
import com.factset.sdk.FactSetProgrammaticEnvironment.api.ServersApi;

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

        ServersApi apiInstance = new ServersApi(defaultClient);
        try {
            apiInstance.stopServer();

        } catch (ApiException e) {
            System.err.println("Exception when calling ServersApi#stopServer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Server stop request accepted. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Missing or invalid authentication credentials. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Caller is not entitled to access this resource. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | No server found to stop. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Service temporarily unavailable. Retry the request later. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

