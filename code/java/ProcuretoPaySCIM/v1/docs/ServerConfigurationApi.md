# ServerConfigurationApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceProviderConfigGet**](ServerConfigurationApi.md#serviceProviderConfigGet) | **GET** /ServiceProviderConfig | Get server configuration.



## serviceProviderConfigGet

> ServiceProviderConfig serviceProviderConfigGet()

Get server configuration.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPaySCIM.ApiClient;
import com.factset.sdk.ProcuretoPaySCIM.ApiException;
import com.factset.sdk.ProcuretoPaySCIM.Configuration;
import com.factset.sdk.ProcuretoPaySCIM.auth.*;
import com.factset.sdk.ProcuretoPaySCIM.models.*;
import com.factset.sdk.ProcuretoPaySCIM.api.ServerConfigurationApi;

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

        ServerConfigurationApi apiInstance = new ServerConfigurationApi(defaultClient);
        try {
            ServiceProviderConfig result = apiInstance.serviceProviderConfigGet();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ServerConfigurationApi#serviceProviderConfigGet");
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

[**ServiceProviderConfig**](ServiceProviderConfig.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **500** | Internal server error. |  -  |

