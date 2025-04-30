# ProductsApi

All URIs are relative to *https://api.factset.com/ofs/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductById**](ProductsApi.md#getProductById) | **GET** /product/{id} | 
[**getProducts**](ProductsApi.md#getProducts) | **GET** /products | 



## getProductById

> ProductSuccessResponse getProductById(id)



Get a single Open:FactSet Marketplace Catalog product by ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OpenFactSetMarketplace.ApiClient;
import com.factset.sdk.OpenFactSetMarketplace.ApiException;
import com.factset.sdk.OpenFactSetMarketplace.Configuration;
import com.factset.sdk.OpenFactSetMarketplace.auth.*;
import com.factset.sdk.OpenFactSetMarketplace.models.*;
import com.factset.sdk.OpenFactSetMarketplace.api.ProductsApi;

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

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        String id = "id_example"; // String | ID of the product or partner
        try {
            ProductSuccessResponse result = apiInstance.getProductById(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#getProductById");
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
 **id** | **String**| ID of the product or partner |

### Return type

[**ProductSuccessResponse**](ProductSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a single Open:FactSet Marketplace Catalog product by ID. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. |  -  |
| **404** | Product not found |  -  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
| **500** | Internal Server Error |  -  |


## getProducts

> ProductsSuccessResponse getProducts(paginationLimit, paginationOffset)



Get all products published on the Open:FactSet Marketplace Catalog.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OpenFactSetMarketplace.ApiClient;
import com.factset.sdk.OpenFactSetMarketplace.ApiException;
import com.factset.sdk.OpenFactSetMarketplace.Configuration;
import com.factset.sdk.OpenFactSetMarketplace.auth.*;
import com.factset.sdk.OpenFactSetMarketplace.models.*;
import com.factset.sdk.OpenFactSetMarketplace.api.ProductsApi;

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

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        Integer paginationLimit = 10; // Integer | Limit for number of records returned per page
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            ProductsSuccessResponse result = apiInstance.getProducts(paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#getProducts");
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
 **paginationLimit** | **Integer**| Limit for number of records returned per page | [optional] [default to 10]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**ProductsSuccessResponse**](ProductsSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response to get all products published on the Open:FactSet Marketplace Catalog. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. |  -  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
| **500** | Internal Server Error |  -  |

