# OperationsApi

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateFromHoldings**](OperationsApi.md#calculateFromHoldings) | **POST** /linear/{version}/calculate/from-holdings | Calculate risk statistics
[**generateIdMapping**](OperationsApi.md#generateIdMapping) | **POST** /linear/{version}/generate/id-mapping | Generate risk model ID mapping



## calculateFromHoldings

> InlineResponse2003 calculateFromHoldings(version, calculateFromHoldingsRequestBody)

Calculate risk statistics

Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OpenRisk.ApiClient;
import com.factset.sdk.OpenRisk.ApiException;
import com.factset.sdk.OpenRisk.Configuration;
import com.factset.sdk.OpenRisk.auth.*;
import com.factset.sdk.OpenRisk.models.*;
import com.factset.sdk.OpenRisk.api.OperationsApi;

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

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody = new CalculateFromHoldingsRequestBody(); // CalculateFromHoldingsRequestBody | 
        try {
            InlineResponse2003 result = apiInstance.calculateFromHoldings(version, calculateFromHoldingsRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#calculateFromHoldings");
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |
 **calculateFromHoldingsRequestBody** | [**CalculateFromHoldingsRequestBody**](CalculateFromHoldingsRequestBody.md)|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Request was malformed or the requested data is not available |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **403** | Access forbidden for the requested data |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |


## generateIdMapping

> InlineResponse2004 generateIdMapping(version, generateIdMappingRequestBody)

Generate risk model ID mapping

Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OpenRisk.ApiClient;
import com.factset.sdk.OpenRisk.ApiException;
import com.factset.sdk.OpenRisk.Configuration;
import com.factset.sdk.OpenRisk.auth.*;
import com.factset.sdk.OpenRisk.models.*;
import com.factset.sdk.OpenRisk.api.OperationsApi;

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

        OperationsApi apiInstance = new OperationsApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        GenerateIdMappingRequestBody generateIdMappingRequestBody = new GenerateIdMappingRequestBody(); // GenerateIdMappingRequestBody | 
        try {
            InlineResponse2004 result = apiInstance.generateIdMapping(version, generateIdMappingRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OperationsApi#generateIdMapping");
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
 **version** | **String**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |
 **generateIdMappingRequestBody** | [**GenerateIdMappingRequestBody**](GenerateIdMappingRequestBody.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Provides a mapping to security indices in the risk model or the reason for exclusion |  -  |
| **400** | Request was malformed or the requested data is not available |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **403** | Access forbidden for the requested data |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

