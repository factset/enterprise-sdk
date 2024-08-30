# DsotmApi

All URIs are relative to *https://api.factset.com/analytics/dsotm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendTransactions**](DsotmApi.md#sendTransactions) | **POST** /transactions | Push transactions data into FactSet.



## sendTransactions

> sendTransactions(dsotmParametersRoot)

Push transactions data into FactSet.

This endpoint takes the transactions data and pushes them into FactSet.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.DirectStreamingofTransactionMessages.ApiClient;
import com.factset.sdk.DirectStreamingofTransactionMessages.ApiException;
import com.factset.sdk.DirectStreamingofTransactionMessages.Configuration;
import com.factset.sdk.DirectStreamingofTransactionMessages.auth.*;
import com.factset.sdk.DirectStreamingofTransactionMessages.models.*;
import com.factset.sdk.DirectStreamingofTransactionMessages.api.DsotmApi;

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

        DsotmApi apiInstance = new DsotmApi(defaultClient);
        DsotmParametersRoot dsotmParametersRoot = new DsotmParametersRoot(); // DsotmParametersRoot | 
        try {
            apiInstance.sendTransactions(dsotmParametersRoot);

        } catch (ApiException e) {
            System.err.println("Exception when calling DsotmApi#sendTransactions");
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
 **dsotmParametersRoot** | [**DsotmParametersRoot**](DsotmParametersRoot.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **400** | Invalid POST body. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the retry-after header. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **500** | Server error. Log the X-DataDirectRequest-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
| **503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

