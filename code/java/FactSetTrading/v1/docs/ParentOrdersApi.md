# ParentOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateParentOrder**](ParentOrdersApi.md#updateParentOrder) | **PUT** /parent-orders/update | Update Parent Orders



## updateParentOrder

> ParentOrdersUpdateResponseRoot updateParentOrder(parentOrdersUpdateRoot)

Update Parent Orders

This endpoint allows the user to update parent orders which are already present in Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetTrading.ApiClient;
import com.factset.sdk.FactSetTrading.ApiException;
import com.factset.sdk.FactSetTrading.Configuration;
import com.factset.sdk.FactSetTrading.auth.*;
import com.factset.sdk.FactSetTrading.models.*;
import com.factset.sdk.FactSetTrading.api.ParentOrdersApi;

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

        ParentOrdersApi apiInstance = new ParentOrdersApi(defaultClient);
        ParentOrdersUpdateRoot parentOrdersUpdateRoot = new ParentOrdersUpdateRoot(); // ParentOrdersUpdateRoot | 
        try {
            ParentOrdersUpdateResponseRoot result = apiInstance.updateParentOrder(parentOrdersUpdateRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ParentOrdersApi#updateParentOrder");
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
 **parentOrdersUpdateRoot** | [**ParentOrdersUpdateRoot**](ParentOrdersUpdateRoot.md)|  | [optional]

### Return type

[**ParentOrdersUpdateResponseRoot**](ParentOrdersUpdateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  -  |
| **400** | Invalid parameters provided. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

