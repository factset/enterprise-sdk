# OrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](OrdersApi.md#cancel) | **POST** /orders/cancel | Cancel the orders on EMS system.
[**create**](OrdersApi.md#create) | **POST** /orders/create | Send orders to EMS for execution.
[**replace**](OrdersApi.md#replace) | **POST** /orders/replace | Replace the orders on EMS system.



## cancel

> EMSOrdersResponseRoot cancel(emSCancelOrdersRoot)

Cancel the orders on EMS system.

This endpoint takes the list of orders to be cancelled on the EMS system.

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
import com.factset.sdk.FactSetTrading.api.OrdersApi;

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

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        EMSCancelOrdersRoot emSCancelOrdersRoot = new EMSCancelOrdersRoot(); // EMSCancelOrdersRoot | 
        try {
            EMSOrdersResponseRoot result = apiInstance.cancel(emSCancelOrdersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#cancel");
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
 **emSCancelOrdersRoot** | [**EMSCancelOrdersRoot**](EMSCancelOrdersRoot.md)|  | [optional]

### Return type

[**EMSOrdersResponseRoot**](EMSOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the list of order ids. |  -  |
| **400** | Invalid post body parameters. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |


## create

> EMSOrdersResponseRoot create(emSOrdersRoot)

Send orders to EMS for execution.

This endpoint takes the list of orders and place them on EMS for execution.

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
import com.factset.sdk.FactSetTrading.api.OrdersApi;

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

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        EMSOrdersRoot emSOrdersRoot = new EMSOrdersRoot(); // EMSOrdersRoot | 
        try {
            EMSOrdersResponseRoot result = apiInstance.create(emSOrdersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#create");
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
 **emSOrdersRoot** | [**EMSOrdersRoot**](EMSOrdersRoot.md)|  | [optional]

### Return type

[**EMSOrdersResponseRoot**](EMSOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the list of orders. |  -  |
| **400** | Invalid post body parameters. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |


## replace

> EMSOrdersResponseRoot replace(emSReplaceOrdersRoot)

Replace the orders on EMS system.

This endpoint takes the list of orders to be replaced on the EMS system.

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
import com.factset.sdk.FactSetTrading.api.OrdersApi;

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

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        EMSReplaceOrdersRoot emSReplaceOrdersRoot = new EMSReplaceOrdersRoot(); // EMSReplaceOrdersRoot | 
        try {
            EMSOrdersResponseRoot result = apiInstance.replace(emSReplaceOrdersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#replace");
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
 **emSReplaceOrdersRoot** | [**EMSReplaceOrdersRoot**](EMSReplaceOrdersRoot.md)|  | [optional]

### Return type

[**EMSOrdersResponseRoot**](EMSOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, returns the list of order ids. |  -  |
| **400** | Invalid post body parameters. |  -  |
| **401** | Missing or invalid authentication. |  -  |
| **403** | User is forbidden with current credentials. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
| **429** | Rate limit reached. Wait before sending further requests. |  -  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
| **503** | Request timed out. Retry the request in sometime. |  -  |

