# ChildOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelChildOrder**](ChildOrdersApi.md#cancelChildOrder) | **POST** /child-orders/cancel | Cancel Child Orders on Trading system
[**createChildOrder**](ChildOrdersApi.md#createChildOrder) | **POST** /child-orders/create | Create Child Orders on Trading system.
[**replaceChildOrder**](ChildOrdersApi.md#replaceChildOrder) | **POST** /child-orders/replace | Replace the Child Orders on Trading system.



## cancelChildOrder

> ChildOrdersResponseRoot cancelChildOrder(cancelChildOrdersRoot)

Cancel Child Orders on Trading system

This endpoint is used to cancel a specific child order on Trading system.

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
import com.factset.sdk.FactSetTrading.api.ChildOrdersApi;

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

        ChildOrdersApi apiInstance = new ChildOrdersApi(defaultClient);
        CancelChildOrdersRoot cancelChildOrdersRoot = new CancelChildOrdersRoot(); // CancelChildOrdersRoot | 
        try {
            ChildOrdersResponseRoot result = apiInstance.cancelChildOrder(cancelChildOrdersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChildOrdersApi#cancelChildOrder");
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
 **cancelChildOrdersRoot** | [**CancelChildOrdersRoot**](CancelChildOrdersRoot.md)|  | [optional]

### Return type

[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

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


## createChildOrder

> CreateChildOrdersResponseRoot createChildOrder(childOrdersRoot)

Create Child Orders on Trading system.

This endpoint is used to create child orders on Trading system.

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
import com.factset.sdk.FactSetTrading.api.ChildOrdersApi;

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

        ChildOrdersApi apiInstance = new ChildOrdersApi(defaultClient);
        ChildOrdersRoot childOrdersRoot = new ChildOrdersRoot(); // ChildOrdersRoot | 
        try {
            CreateChildOrdersResponseRoot result = apiInstance.createChildOrder(childOrdersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChildOrdersApi#createChildOrder");
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
 **childOrdersRoot** | [**ChildOrdersRoot**](ChildOrdersRoot.md)|  | [optional]

### Return type

[**CreateChildOrdersResponseRoot**](CreateChildOrdersResponseRoot.md)

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


## replaceChildOrder

> ChildOrdersResponseRoot replaceChildOrder(replaceChildOrdersRoot)

Replace the Child Orders on Trading system.

This endpoint takes the child order to be replaced on the Trading system.

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
import com.factset.sdk.FactSetTrading.api.ChildOrdersApi;

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

        ChildOrdersApi apiInstance = new ChildOrdersApi(defaultClient);
        ReplaceChildOrdersRoot replaceChildOrdersRoot = new ReplaceChildOrdersRoot(); // ReplaceChildOrdersRoot | 
        try {
            ChildOrdersResponseRoot result = apiInstance.replaceChildOrder(replaceChildOrdersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChildOrdersApi#replaceChildOrder");
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
 **replaceChildOrdersRoot** | [**ReplaceChildOrdersRoot**](ReplaceChildOrdersRoot.md)|  | [optional]

### Return type

[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

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

