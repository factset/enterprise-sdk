# AboutApi

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthStatus**](AboutApi.md#healthStatus) | **GET** /linear/{version}/health | Get health of service
[**listRiskModels**](AboutApi.md#listRiskModels) | **GET** /linear/{version}/riskmodels | Get available risk models
[**riskModelMetadata**](AboutApi.md#riskModelMetadata) | **GET** /linear/{version}/riskmodels/{modelCode} | Get risk model details
[**stats**](AboutApi.md#stats) | **GET** /linear/{version}/stats | Get available risk statistics details
[**statsNamesOnly**](AboutApi.md#statsNamesOnly) | **GET** /linear/{version}/stats-names-only | Get available risk statistics names



## healthStatus

> InlineResponse2002 healthStatus(version)

Get health of service

Health status of the service

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
import com.factset.sdk.OpenRisk.api.AboutApi;

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

        AboutApi apiInstance = new AboutApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        try {
            InlineResponse2002 result = apiInstance.healthStatus(version);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AboutApi#healthStatus");
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

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service is operational and healthy |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **403** | Full access to the service is not authorized |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **404** | API version not found |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |


## listRiskModels

> InlineResponse200 listRiskModels(version)

Get available risk models

Get the list of available risk models, including their respective model codes required for use with other routes.

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
import com.factset.sdk.OpenRisk.api.AboutApi;

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

        AboutApi apiInstance = new AboutApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        try {
            InlineResponse200 result = apiInstance.listRiskModels(version);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AboutApi#listRiskModels");
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

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of available risk models for use. Both risk model subscription and each risk model vendor specific Open:Risk API subscription are required for use. For subscription, please report an issue from FactSet:Developer portal. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |


## riskModelMetadata

> InlineResponse2001 riskModelMetadata(version, modelCode)

Get risk model details

Get the meta data of the risk model for the corresponding modelCode. modelCode can be obtained via '/linear/{version}/riskmodels/' route.

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
import com.factset.sdk.OpenRisk.api.AboutApi;

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

        AboutApi apiInstance = new AboutApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        String modelCode = "modelCode_example"; // String | Model code
        try {
            InlineResponse2001 result = apiInstance.riskModelMetadata(version, modelCode);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AboutApi#riskModelMetadata");
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
 **modelCode** | **String**| Model code |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the meta data of risk model. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |


## stats

> SupportedStats stats(version)

Get available risk statistics details

All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When 'securityGroupMethod' is 'statSpecific', please refer to statistics documentation service for more information.

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
import com.factset.sdk.OpenRisk.api.AboutApi;

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

        AboutApi apiInstance = new AboutApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        try {
            SupportedStats result = apiInstance.stats(version);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AboutApi#stats");
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

### Return type

[**SupportedStats**](SupportedStats.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All base risk statistic names and their respective support and/or requirement for certain name-settings statistics options (such as: correlated specific risk, covariance isolation method, etc.), available levels, and security group calculation methodology. When &#39;securityGroupMethod&#39; is &#39;statSpecific&#39;, please refer to statistics documentation service for more information. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |


## statsNamesOnly

> SupportedStatsNamesOnly statsNamesOnly(version)

Get available risk statistics names

All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk)

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
import com.factset.sdk.OpenRisk.api.AboutApi;

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

        AboutApi apiInstance = new AboutApi(defaultClient);
        String version = "v1"; // String | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
        try {
            SupportedStatsNamesOnly result = apiInstance.statsNamesOnly(version);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AboutApi#statsNamesOnly");
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

### Return type

[**SupportedStatsNamesOnly**](SupportedStatsNamesOnly.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All available risk statistic names including statistics names containing risk statistics options such as CSR (correlated specific risk) |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

