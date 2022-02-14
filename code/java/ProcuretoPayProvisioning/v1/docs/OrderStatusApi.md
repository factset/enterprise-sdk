# OrderStatusApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionStatusGet**](OrderStatusApi.md#transactionStatusGet) | **GET** /transactionStatus | Check status of order by transactionCode



## transactionStatusGet

> TransactionStatus transactionStatusGet(transactioncode)

Check status of order by transactionCode

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.auth.*;
import com.factset.sdk.ProcuretoPayProvisioning.model.*;
import com.factset.sdk.ProcuretoPayProvisioning.api.OrderStatusApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        OrderStatusApi apiInstance = new OrderStatusApi(defaultClient);
        String transactioncode = "7B27AA857B664F18AB4886A08A9A3D9C"; // String | Transaction Code to query
        try {
            TransactionStatus result = apiInstance.transactionStatusGet(transactioncode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderStatusApi#transactionStatusGet");
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
 **transactioncode** | **String**| Transaction Code to query |

### Return type

[**TransactionStatus**](TransactionStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | Requested Resource not found |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

