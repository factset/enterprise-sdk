# AxiomaEquityPortfolioOptimizerApi

All URIs are relative to *https://api.factset.com/open-optimizer/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalVariablesAXP**](AxiomaEquityPortfolioOptimizerApi.md#getGlobalVariablesAXP) | **GET** /axp/settings/global-variables | Returns a dictionary with the name-value pairs for all global variables.
[**getOptimizationResultByIdAXP**](AxiomaEquityPortfolioOptimizerApi.md#getOptimizationResultByIdAXP) | **GET** /axp/{id} | Get AXP optimization result by id
[**getOptimizationStatusByIdAXP**](AxiomaEquityPortfolioOptimizerApi.md#getOptimizationStatusByIdAXP) | **GET** /axp/{id}/status | Get AXP optimization status by id
[**postAndOptimizeAXP**](AxiomaEquityPortfolioOptimizerApi.md#postAndOptimizeAXP) | **POST** /axp/optimize | Create and Run AXP optimization
[**postComponentsAXP**](AxiomaEquityPortfolioOptimizerApi.md#postComponentsAXP) | **POST** /axp/settings/components | Returns a dictionary with individually-filtered metadata for each component type.
[**postStrategiesAXP**](AxiomaEquityPortfolioOptimizerApi.md#postStrategiesAXP) | **POST** /axp/settings/strategies | Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.



## getGlobalVariablesAXP

> SettingsGlobalVarsResponse getGlobalVariablesAXP(cacheControl)

Returns a dictionary with the name-value pairs for all global variables.

Fetch all available global variables

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.auth.*;
import com.factset.sdk.OPENOPTIMIZER.models.*;
import com.factset.sdk.OPENOPTIMIZER.api.AxiomaEquityPortfolioOptimizerApi;

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

        AxiomaEquityPortfolioOptimizerApi apiInstance = new AxiomaEquityPortfolioOptimizerApi(defaultClient);
        String cacheControl = "cacheControl_example"; // String | Standard HTTP header.  Accepts max-stale.
        try {
            SettingsGlobalVarsResponse result = apiInstance.getGlobalVariablesAXP(cacheControl);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AxiomaEquityPortfolioOptimizerApi#getGlobalVariablesAXP");
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
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional]

### Return type

[**SettingsGlobalVarsResponse**](SettingsGlobalVarsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Name-value pairs for each global variable. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |


## getOptimizationResultByIdAXP

> ResultResponse getOptimizationResultByIdAXP(id)

Get AXP optimization result by id

This is the endpoint to get optimization result.
If the optimization result is available, a 200 is returned. 
Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.auth.*;
import com.factset.sdk.OPENOPTIMIZER.models.*;
import com.factset.sdk.OPENOPTIMIZER.api.AxiomaEquityPortfolioOptimizerApi;

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

        AxiomaEquityPortfolioOptimizerApi apiInstance = new AxiomaEquityPortfolioOptimizerApi(defaultClient);
        String id = "id_example"; // String | from url, provided from the location header in the Create and Run FPO optimization endpoint
        try {
            ResultResponse result = apiInstance.getOptimizationResultByIdAXP(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AxiomaEquityPortfolioOptimizerApi#getOptimizationResultByIdAXP");
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
 **id** | **String**| from url, provided from the location header in the Create and Run FPO optimization endpoint |

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets the optimization result. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **202** | The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |


## getOptimizationStatusByIdAXP

> OptimizationStatus getOptimizationStatusByIdAXP(id)

Get AXP optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.
If the optimization has finished computing, a 201 is returned and the result can be fetched using /axp/{id} endpoint. 
Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.auth.*;
import com.factset.sdk.OPENOPTIMIZER.models.*;
import com.factset.sdk.OPENOPTIMIZER.api.AxiomaEquityPortfolioOptimizerApi;

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

        AxiomaEquityPortfolioOptimizerApi apiInstance = new AxiomaEquityPortfolioOptimizerApi(defaultClient);
        String id = "id_example"; // String | from url, provided from the location header in the Create and Run AXP optimization endpoint
        try {
            OptimizationStatus result = apiInstance.getOptimizationStatusByIdAXP(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AxiomaEquityPortfolioOptimizerApi#getOptimizationStatusByIdAXP");
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
 **id** | **String**| from url, provided from the location header in the Create and Run AXP optimization endpoint |

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | This indicates that the optimization is complete and the result is now available. |  * Location - URL to fetch the optimization result <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **202** | Indicates optimization is in progress. The response body contains the detailed status. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |


## postAndOptimizeAXP

> OptimizationStatus postAndOptimizeAXP(cacheControl, axPOptimizationParametersRequest)

Create and Run AXP optimization

This endpoint runs AXP optimization specified in the POST body parameters.
            
Remarks:
            
*	Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.auth.*;
import com.factset.sdk.OPENOPTIMIZER.models.*;
import com.factset.sdk.OPENOPTIMIZER.api.AxiomaEquityPortfolioOptimizerApi;

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

        AxiomaEquityPortfolioOptimizerApi apiInstance = new AxiomaEquityPortfolioOptimizerApi(defaultClient);
        String cacheControl = "cacheControl_example"; // String | Standard HTTP header.  Accepts max-stale.
        AXPOptimizationParametersRequest axPOptimizationParametersRequest = new AXPOptimizationParametersRequest(); // AXPOptimizationParametersRequest | Optimization Parameters
        try {
            OptimizationStatus result = apiInstance.postAndOptimizeAXP(cacheControl, axPOptimizationParametersRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AxiomaEquityPortfolioOptimizerApi#postAndOptimizeAXP");
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
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional]
 **axPOptimizationParametersRequest** | [**AXPOptimizationParametersRequest**](AXPOptimizationParametersRequest.md)| Optimization Parameters | [optional]

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |


## postComponentsAXP

> AvailableComponentsResponse postComponentsAXP(axPAvailableComponentsInput)

Returns a dictionary with individually-filtered metadata for each component type.

Fetch metadata for all FPO component types. Output is individually-filtered for each component type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.auth.*;
import com.factset.sdk.OPENOPTIMIZER.models.*;
import com.factset.sdk.OPENOPTIMIZER.api.AxiomaEquityPortfolioOptimizerApi;

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

        AxiomaEquityPortfolioOptimizerApi apiInstance = new AxiomaEquityPortfolioOptimizerApi(defaultClient);
        AXPAvailableComponentsInput axPAvailableComponentsInput = new AXPAvailableComponentsInput(); // AXPAvailableComponentsInput | 
        try {
            AvailableComponentsResponse result = apiInstance.postComponentsAXP(axPAvailableComponentsInput);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AxiomaEquityPortfolioOptimizerApi#postComponentsAXP");
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
 **axPAvailableComponentsInput** | [**AXPAvailableComponentsInput**](AXPAvailableComponentsInput.md)|  | [optional]

### Return type

[**AvailableComponentsResponse**](AvailableComponentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object with filtered metadata for all requested components |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Expectation Failed |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |


## postStrategiesAXP

> AvailableStrategiesResponse postStrategiesAXP(cacheControl, availableStrategiesInput)

Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.

Fetch available FPO Strategies

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OPENOPTIMIZER.ApiClient;
import com.factset.sdk.OPENOPTIMIZER.ApiException;
import com.factset.sdk.OPENOPTIMIZER.Configuration;
import com.factset.sdk.OPENOPTIMIZER.auth.*;
import com.factset.sdk.OPENOPTIMIZER.models.*;
import com.factset.sdk.OPENOPTIMIZER.api.AxiomaEquityPortfolioOptimizerApi;

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

        AxiomaEquityPortfolioOptimizerApi apiInstance = new AxiomaEquityPortfolioOptimizerApi(defaultClient);
        String cacheControl = "cacheControl_example"; // String | Standard HTTP header.  Accepts max-stale.
        AvailableStrategiesInput availableStrategiesInput = new AvailableStrategiesInput(); // AvailableStrategiesInput | 
        try {
            AvailableStrategiesResponse result = apiInstance.postStrategiesAXP(cacheControl, availableStrategiesInput);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AxiomaEquityPortfolioOptimizerApi#postStrategiesAXP");
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
 **cacheControl** | **String**| Standard HTTP header.  Accepts max-stale. | [optional]
 **availableStrategiesInput** | [**AvailableStrategiesInput**](AvailableStrategiesInput.md)|  | [optional]

### Return type

[**AvailableStrategiesResponse**](AvailableStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, contains the requested strategies. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Expectation Failed |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

