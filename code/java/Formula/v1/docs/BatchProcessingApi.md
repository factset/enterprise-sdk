# BatchProcessingApi

All URIs are relative to *https://api.factset.com/formula-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchData**](BatchProcessingApi.md#getBatchData) | **GET** /v1/batch-result | Returns the response for a Batch Request
[**getBatchDataWithPost**](BatchProcessingApi.md#getBatchDataWithPost) | **POST** /v1/batch-result | Returns the status for a Batch Request
[**getBatchStatus**](BatchProcessingApi.md#getBatchStatus) | **GET** /v1/batch-status | Returns the status for a Batch Request
[**getBatchStatusWithPost**](BatchProcessingApi.md#getBatchStatusWithPost) | **POST** /v1/batch-status | Returns the status for a Batch Request



## getBatchData

> GetBatchDataResponseWrapper getBatchData(id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.

  The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.

  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

```java
// Import classes:
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.auth.*;
import com.factset.sdk.Formula.models.*;
import com.factset.sdk.Formula.api.BatchProcessingApi;
import com.factset.sdk.Formula.api.BatchProcessingApi.GetBatchDataResponseWrapper;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Batch Request identifier.
        try {
            GetBatchDataResponseWrapper result = apiInstance.getBatchData(id);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // BatchDataResponse
            
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
| **200** | Request Response Object when batch request has completed and response is created |  -  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |


## getBatchDataWithPost

> GetBatchDataWithPostResponseWrapper getBatchDataWithPost(batchDataRequest)

Returns the status for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.

  The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.

  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

```java
// Import classes:
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.auth.*;
import com.factset.sdk.Formula.models.*;
import com.factset.sdk.Formula.api.BatchProcessingApi;
import com.factset.sdk.Formula.api.BatchProcessingApi.GetBatchDataWithPostResponseWrapper;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        BatchDataRequest batchDataRequest = new BatchDataRequest(); // BatchDataRequest | 
        try {
            GetBatchDataWithPostResponseWrapper result = apiInstance.getBatchDataWithPost(batchDataRequest);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // BatchDataResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling BatchProcessingApi#getBatchDataWithPost");
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
 **batchDataRequest** | [**BatchDataRequest**](BatchDataRequest.md)|  |

### Return type

GetBatchDataWithPostResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request Response Object when batch request has completed and response is created |  -  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |


## getBatchStatus

> BatchStatusResponse getBatchStatus(id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.

  The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.

  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

```java
// Import classes:
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.auth.*;
import com.factset.sdk.Formula.models.*;
import com.factset.sdk.Formula.api.BatchProcessingApi;

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
| **201** | Batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |


## getBatchStatusWithPost

> BatchStatusResponse getBatchStatusWithPost(batchDataRequest)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.

  The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.

  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or "Report Issue" above and our support teams can assist.*


### Example

```java
// Import classes:
import com.factset.sdk.Formula.ApiClient;
import com.factset.sdk.Formula.ApiException;
import com.factset.sdk.Formula.Configuration;
import com.factset.sdk.Formula.auth.*;
import com.factset.sdk.Formula.models.*;
import com.factset.sdk.Formula.api.BatchProcessingApi;

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

        BatchProcessingApi apiInstance = new BatchProcessingApi(defaultClient);
        BatchDataRequest batchDataRequest = new BatchDataRequest(); // BatchDataRequest | 
        try {
            BatchStatusResponse result = apiInstance.getBatchStatusWithPost(batchDataRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BatchProcessingApi#getBatchStatusWithPost");
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
 **batchDataRequest** | [**BatchDataRequest**](BatchDataRequest.md)|  |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

