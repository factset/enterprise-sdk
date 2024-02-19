# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mpoV1OptimizeFPOPost**](DefaultApi.md#mpoV1OptimizeFPOPost) | **POST** /mpo/v1/optimizeFPO | 



## mpoV1OptimizeFPOPost

> OptimizerOutputsMultiPeriodOutput mpoV1OptimizeFPOPost(multiPeriodInput)



### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OptimizationEngineAPIMultiperiod.ApiClient;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.ApiException;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.Configuration;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.auth.*;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.*;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        OptimizerInputsMultiPeriodInput multiPeriodInput = new OptimizerInputsMultiPeriodInput(); // OptimizerInputsMultiPeriodInput | Multiperiod protobuf input
        try {
            OptimizerOutputsMultiPeriodOutput result = apiInstance.mpoV1OptimizeFPOPost(multiPeriodInput);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#mpoV1OptimizeFPOPost");
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
 **multiPeriodInput** | [**OptimizerInputsMultiPeriodInput**](OptimizerInputsMultiPeriodInput.md)| Multiperiod protobuf input | [optional]

### Return type

[**OptimizerOutputsMultiPeriodOutput**](OptimizerOutputsMultiPeriodOutput.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/x-protobuf
- **Accept**: application/x-protobuf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Multiperiod protobuf output |  -  |

