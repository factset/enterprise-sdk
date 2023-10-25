# CompanyApi

All URIs are relative to *https://api.factset.com/report/overview/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currentCapGet**](CompanyApi.md#currentCapGet) | **GET** /current-cap | Current Capitalization
[**financialHighlightsGet**](CompanyApi.md#financialHighlightsGet) | **GET** /financial-highlights | Financial / Estimate Highlights
[**getProfileProfile**](CompanyApi.md#getProfileProfile) | **GET** /profile | Overview Profile
[**keyStatsGet**](CompanyApi.md#keyStatsGet) | **GET** /key-stats | Key Stats
[**peerListGet**](CompanyApi.md#peerListGet) | **GET** /peer-list | Peer List
[**transactionsGet**](CompanyApi.md#transactionsGet) | **GET** /transactions | Transactions



## currentCapGet

> StachTableResponse currentCapGet(id)

Current Capitalization

### Example

```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.auth.*;
import com.factset.sdk.OverviewReportBuilder.models.*;
import com.factset.sdk.OverviewReportBuilder.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "FDS"; // String | Company ticker
        try {
            StachTableResponse result = apiInstance.currentCapGet(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#currentCapGet");
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
 **id** | **String**| Company ticker |

### Return type

[**StachTableResponse**](StachTableResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |


## financialHighlightsGet

> StachTableResponse financialHighlightsGet(id, actual, estimate)

Financial / Estimate Highlights

### Example

```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.auth.*;
import com.factset.sdk.OverviewReportBuilder.models.*;
import com.factset.sdk.OverviewReportBuilder.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "FDS"; // String | Company ticker
        Integer actual = 4; // Integer | The number of actual data periods to be returned. Must be greater than 0
        Integer estimate = 1; // Integer | The number of estimate data periods to be returned. Must be greater than 0
        try {
            StachTableResponse result = apiInstance.financialHighlightsGet(id, actual, estimate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#financialHighlightsGet");
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
 **id** | **String**| Company ticker |
 **actual** | **Integer**| The number of actual data periods to be returned. Must be greater than 0 | [optional] [default to 4]
 **estimate** | **Integer**| The number of estimate data periods to be returned. Must be greater than 0 | [optional] [default to 1]

### Return type

[**StachTableResponse**](StachTableResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; Returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |


## getProfileProfile

> ProfileResponse getProfileProfile(id)

Overview Profile

### Example

```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.auth.*;
import com.factset.sdk.OverviewReportBuilder.models.*;
import com.factset.sdk.OverviewReportBuilder.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "FDS"; // String | Company ticker
        try {
            ProfileResponse result = apiInstance.getProfileProfile(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getProfileProfile");
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
 **id** | **String**| Company ticker |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns the JSON in a simple key-value format |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |


## keyStatsGet

> KeyStatsResponse keyStatsGet(id)

Key Stats

### Example

```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.auth.*;
import com.factset.sdk.OverviewReportBuilder.models.*;
import com.factset.sdk.OverviewReportBuilder.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "FDS"; // String | Company ticker
        try {
            KeyStatsResponse result = apiInstance.keyStatsGet(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#keyStatsGet");
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
 **id** | **String**| Company ticker |

### Return type

[**KeyStatsResponse**](KeyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns the JSON in a simple key-value format |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |


## peerListGet

> PeerListResponse peerListGet(id, topn)

Peer List

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.auth.*;
import com.factset.sdk.OverviewReportBuilder.models.*;
import com.factset.sdk.OverviewReportBuilder.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "FDS"; // String | Company ticker
        BigDecimal topn = new BigDecimal("5"); // BigDecimal | Limits the number of peers returned.
        try {
            PeerListResponse result = apiInstance.peerListGet(id, topn);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#peerListGet");
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
 **id** | **String**| Company ticker |
 **topn** | **BigDecimal**| Limits the number of peers returned. | [optional]

### Return type

[**PeerListResponse**](PeerListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing key-value format |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |


## transactionsGet

> StachTableResponse transactionsGet(id, transactionType, financingType)

Transactions

### Example

```java
// Import classes:
import com.factset.sdk.OverviewReportBuilder.ApiClient;
import com.factset.sdk.OverviewReportBuilder.ApiException;
import com.factset.sdk.OverviewReportBuilder.Configuration;
import com.factset.sdk.OverviewReportBuilder.auth.*;
import com.factset.sdk.OverviewReportBuilder.models.*;
import com.factset.sdk.OverviewReportBuilder.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "FDS"; // String | Company ticker
        String transactionType = "ACQUISITION_MERGER"; // String | Filters response to return only this type of transaction. If not specified, returns all transactions. Values are not case sensitive.
        String financingType = "DEBT"; // String | Filters response to return transactions of this financing type. If not specified, returns all transactions. Values are not case sensitive
        try {
            StachTableResponse result = apiInstance.transactionsGet(id, transactionType, financingType);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#transactionsGet");
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
 **id** | **String**| Company ticker |
 **transactionType** | **String**| Filters response to return only this type of transaction. If not specified, returns all transactions. Values are not case sensitive. | [optional] [enum: ACQUISITION_MERGER, MAJORITY_STAKE, MINORITY_STAKE, SPINOFF, IPO, FOLLOW_ON, ST_DEBT, NOTES_BONDS, REVOLVING_CREDIT, TERM_LOANS, PEVC_INVESTMENTS, FUNDING]
 **financingType** | **String**| Filters response to return transactions of this financing type. If not specified, returns all transactions. Values are not case sensitive | [optional] [enum: DEBT, EQUITY]

### Return type

[**StachTableResponse**](StachTableResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; Returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  |

