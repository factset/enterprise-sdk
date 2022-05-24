# CalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsQuantQreV1CalculationsIdGet**](CalculationsApi.md#analyticsQuantQreV1CalculationsIdGet) | **GET** /analytics/quant/qre/v1/calculations/{id} | Get calculation status by id
[**analyticsQuantQreV1CalculationsIdLogGet**](CalculationsApi.md#analyticsQuantQreV1CalculationsIdLogGet) | **GET** /analytics/quant/qre/v1/calculations/{id}/log | Get calculation log for a specific calculation
[**analyticsQuantQreV1CalculationsIdOutputGet**](CalculationsApi.md#analyticsQuantQreV1CalculationsIdOutputGet) | **GET** /analytics/quant/qre/v1/calculations/{id}/output | Get calculation output for a specific calculation
[**analyticsQuantQreV1CalculationsPost**](CalculationsApi.md#analyticsQuantQreV1CalculationsPost) | **POST** /analytics/quant/qre/v1/calculations | Starts a new script calculation



## analyticsQuantQreV1CalculationsIdGet

> CalculationStatus analyticsQuantQreV1CalculationsIdGet(id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.

### Example

```java
// Import classes:
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.auth.*;
import com.factset.sdk.QuantitativeResearchEnvironment.models.*;
import com.factset.sdk.QuantitativeResearchEnvironment.api.CalculationsApi;

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

        CalculationsApi apiInstance = new CalculationsApi(defaultClient);
        String id = "id_example"; // String | From url, provided by location header or response body in the calculation start endpoint
        try {
            CalculationStatus result = apiInstance.analyticsQuantQreV1CalculationsIdGet(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CalculationsApi#analyticsQuantQreV1CalculationsIdGet");
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
 **id** | **String**| From url, provided by location header or response body in the calculation start endpoint |

### Return type

[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the calculation is finished. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **202** | Expected response. Signals that the calculation is still in progress. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## analyticsQuantQreV1CalculationsIdLogGet

> File analyticsQuantQreV1CalculationsIdLogGet(id)

Get calculation log for a specific calculation

This endpoint returns the log from the calculation.

### Example

```java
// Import classes:
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.auth.*;
import com.factset.sdk.QuantitativeResearchEnvironment.models.*;
import com.factset.sdk.QuantitativeResearchEnvironment.api.CalculationsApi;

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

        CalculationsApi apiInstance = new CalculationsApi(defaultClient);
        String id = "id_example"; // String | From url, provided by location header or response body in the calculation start endpoint
        try {
            File result = apiInstance.analyticsQuantQreV1CalculationsIdLogGet(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CalculationsApi#analyticsQuantQreV1CalculationsIdLogGet");
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
 **id** | **String**| From url, provided by location header or response body in the calculation start endpoint |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the calculation is finished. Log from the calculation is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **202** | Expected response. Signals that the calculation is still in progress and no log is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## analyticsQuantQreV1CalculationsIdOutputGet

> File analyticsQuantQreV1CalculationsIdOutputGet(id)

Get calculation output for a specific calculation

This endpoint returns the specified output from the calculation.

### Example

```java
// Import classes:
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.auth.*;
import com.factset.sdk.QuantitativeResearchEnvironment.models.*;
import com.factset.sdk.QuantitativeResearchEnvironment.api.CalculationsApi;

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

        CalculationsApi apiInstance = new CalculationsApi(defaultClient);
        String id = "id_example"; // String | From url, provided by location header or response body in the calculation start endpoint
        try {
            File result = apiInstance.analyticsQuantQreV1CalculationsIdOutputGet(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CalculationsApi#analyticsQuantQreV1CalculationsIdOutputGet");
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
 **id** | **String**| From url, provided by location header or response body in the calculation start endpoint |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: *

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the calculation is finished. Output from the calculation is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  |
| **202** | Expected response. Signals that the calculation is still in progress and no output is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## analyticsQuantQreV1CalculationsPost

> CalculationStatus analyticsQuantQreV1CalculationsPost(calculation)

Starts a new script calculation

This endpoint takes a python script and starts executing it within QRE

### Example

```java
// Import classes:
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.auth.*;
import com.factset.sdk.QuantitativeResearchEnvironment.models.*;
import com.factset.sdk.QuantitativeResearchEnvironment.api.CalculationsApi;

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

        CalculationsApi apiInstance = new CalculationsApi(defaultClient);
        Calculation calculation = new Calculation(); // Calculation | 
        try {
            CalculationStatus result = apiInstance.analyticsQuantQreV1CalculationsPost(calculation);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CalculationsApi#analyticsQuantQreV1CalculationsPost");
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
 **calculation** | [**Calculation**](Calculation.md)|  | [optional]

### Return type

[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Expected response, contains the relative URL in the Location header to check the status of the calculation. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Invalid request body provided |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

