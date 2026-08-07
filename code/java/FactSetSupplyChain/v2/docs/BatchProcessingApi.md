# BatchProcessingApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchData**](BatchProcessingApi.md#getBatchData) | **GET** /batch-result | Returns the response for a Batch Request
[**getBatchStatus**](BatchProcessingApi.md#getBatchStatus) | **GET** /batch-status | Returns the status for a Batch Request



## getBatchData

> GetBatchDataResponseWrapper getBatchData(id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the ID. The response structure will be based on the endpoint that initiated the batch request.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetSupplyChain.ApiClient;
import com.factset.sdk.FactSetSupplyChain.ApiException;
import com.factset.sdk.FactSetSupplyChain.Configuration;
import com.factset.sdk.FactSetSupplyChain.auth.*;
import com.factset.sdk.FactSetSupplyChain.models.*;
import com.factset.sdk.FactSetSupplyChain.api.BatchProcessingApi;
import com.factset.sdk.FactSetSupplyChain.api.BatchProcessingApi.GetBatchDataResponseWrapper;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Batch Request identifier.
        try {
            GetBatchDataResponseWrapper result = apiInstance.getBatchData(id);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // BatchResultResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling BatchProcessingApi#getBatchData");
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
 **id** | **java.util.UUID**| Batch Request identifier. |

### Return type

GetBatchDataResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The long-running request has been completed and the result is created. The response structure will be based on the endpoint that initiated the batch request. |  -  |
| **202** | The batch Request has not finished and the result has NOT been created. |  -  |
| **404** | The requested resource was not found. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## getBatchStatus

> BatchStatusResponse getBatchStatus(id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetSupplyChain.ApiClient;
import com.factset.sdk.FactSetSupplyChain.ApiException;
import com.factset.sdk.FactSetSupplyChain.Configuration;
import com.factset.sdk.FactSetSupplyChain.auth.*;
import com.factset.sdk.FactSetSupplyChain.models.*;
import com.factset.sdk.FactSetSupplyChain.api.BatchProcessingApi;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Batch Request identifier.
        try {
            BatchStatusResponse result = apiInstance.getBatchStatus(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BatchProcessingApi#getBatchStatus");
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
 **id** | **java.util.UUID**| Batch Request identifier. |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
| **202** | The batch Request has not finished and the result has NOT been created. |  -  |
| **404** | The requested resource was not found. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

