# BenchmarkConstituentsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBenchmarkConstituents**](BenchmarkConstituentsApi.md#getBenchmarkConstituents) | **GET** /factset-benchmarks/v1/constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
[**getBenchmarkConstituentsForList**](BenchmarkConstituentsApi.md#getBenchmarkConstituentsForList) | **POST** /factset-benchmarks/v1/constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
[**getFIBenchmarkConstituents**](BenchmarkConstituentsApi.md#getFIBenchmarkConstituents) | **GET** /factset-benchmarks/v1/fixed-income-constituents | Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
[**getFIBenchmarkConstituentsForList**](BenchmarkConstituentsApi.md#getFIBenchmarkConstituentsForList) | **POST** /factset-benchmarks/v1/fixed-income-constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.



## getBenchmarkConstituents

> BenchmarkConstituentsResponse getBenchmarkConstituents(ids, date, currency)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. Use the helper endpoint **/id-list** for valid identifiers.  


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.BenchmarkConstituentsApi;

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

        BenchmarkConstituentsApi apiInstance = new BenchmarkConstituentsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error. <p>***ids limit** =  1 per request*</p>
        String date = "date_example"; // String | Date of holding expressed in YYYY-MM-DD format.
        String currency = "currency_example"; // String | Currency for response.
        try {
            BenchmarkConstituentsResponse result = apiInstance.getBenchmarkConstituents(ids, date, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkConstituentsApi#getBenchmarkConstituents");
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
 **ids** | **List&lt;String&gt;**| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; |
 **date** | **String**| Date of holding expressed in YYYY-MM-DD format. | [optional]
 **currency** | **String**| Currency for response. | [optional]

### Return type

[**BenchmarkConstituentsResponse**](BenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benchmark data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getBenchmarkConstituentsForList

> BenchmarkConstituentsResponse getBenchmarkConstituentsForList(benchmarkConstituentsRequest)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. Use the helper endpoint **/id-list** for valid identifiers.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.BenchmarkConstituentsApi;

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

        BenchmarkConstituentsApi apiInstance = new BenchmarkConstituentsApi(defaultClient);
        BenchmarkConstituentsRequest benchmarkConstituentsRequest = new BenchmarkConstituentsRequest(); // BenchmarkConstituentsRequest | Requests Benchmark Constituents for the given identifier and date.
        try {
            BenchmarkConstituentsResponse result = apiInstance.getBenchmarkConstituentsForList(benchmarkConstituentsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkConstituentsApi#getBenchmarkConstituentsForList");
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
 **benchmarkConstituentsRequest** | [**BenchmarkConstituentsRequest**](BenchmarkConstituentsRequest.md)| Requests Benchmark Constituents for the given identifier and date. |

### Return type

[**BenchmarkConstituentsResponse**](BenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benchmark data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFIBenchmarkConstituents

> FixedIncomeBenchmarkConstituentsResponse getFIBenchmarkConstituents(ids, date, currency)

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.BenchmarkConstituentsApi;

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

        BenchmarkConstituentsApi apiInstance = new BenchmarkConstituentsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Fixed Income Benchmark Identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error. <p>***ids limit** =  1 per request*</p>
        String date = "date_example"; // String | Date of holding expressed in YYYY-MM-DD format.
        String currency = "currency_example"; // String | Currency for response.
        try {
            FixedIncomeBenchmarkConstituentsResponse result = apiInstance.getFIBenchmarkConstituents(ids, date, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkConstituentsApi#getFIBenchmarkConstituents");
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
 **ids** | **List&lt;String&gt;**| Fixed Income Benchmark Identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; |
 **date** | **String**| Date of holding expressed in YYYY-MM-DD format. | [optional]
 **currency** | **String**| Currency for response. | [optional]

### Return type

[**FixedIncomeBenchmarkConstituentsResponse**](FixedIncomeBenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Constituent data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFIBenchmarkConstituentsForList

> FixedIncomeBenchmarkConstituentsResponse getFIBenchmarkConstituentsForList(fixedIncomeBenchmarkConstituentsRequest)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.BenchmarkConstituentsApi;

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

        BenchmarkConstituentsApi apiInstance = new BenchmarkConstituentsApi(defaultClient);
        FixedIncomeBenchmarkConstituentsRequest fixedIncomeBenchmarkConstituentsRequest = new FixedIncomeBenchmarkConstituentsRequest(); // FixedIncomeBenchmarkConstituentsRequest | Requests Fixed Income Benchmark Constituents for the given identifier and date.
        try {
            FixedIncomeBenchmarkConstituentsResponse result = apiInstance.getFIBenchmarkConstituentsForList(fixedIncomeBenchmarkConstituentsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkConstituentsApi#getFIBenchmarkConstituentsForList");
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
 **fixedIncomeBenchmarkConstituentsRequest** | [**FixedIncomeBenchmarkConstituentsRequest**](FixedIncomeBenchmarkConstituentsRequest.md)| Requests Fixed Income Benchmark Constituents for the given identifier and date. |

### Return type

[**FixedIncomeBenchmarkConstituentsResponse**](FixedIncomeBenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Constituent data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

