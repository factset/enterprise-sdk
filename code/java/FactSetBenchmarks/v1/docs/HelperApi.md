# HelperApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBenchmarkIds**](HelperApi.md#getBenchmarkIds) | **GET** /factset-benchmarks/v1/id-list | Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.
[**getBenchmarkIdsForList**](HelperApi.md#getBenchmarkIdsForList) | **POST** /factset-benchmarks/v1/id-list | Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.



## getBenchmarkIds

> BenchmarkIdListResponse getBenchmarkIds(familyFilter)

Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.

Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your `ids` parameter in the /constituents endpoint to return constituents for that id.<p> *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support. *</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.HelperApi;

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

        HelperApi apiInstance = new HelperApi(defaultClient);
        String familyFilter = "CHINA_HK_INDICES"; // String | Highest Level Filter to search by common Benchmark Families, such as S&P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA & HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe * **MSCI** - MSCI All Country, Asia Pacific, Thematic & Strategy, Emerging, Developed, US * **RUSSELL** - US, Global, and Nomura * **S&P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) * **MORNINGSTAR** - Global, Regional, Country, and Sector indicies * **BLOOMBERG** - Global, Regional, US, Europe, Maturity, Ratings 
        try {
            BenchmarkIdListResponse result = apiInstance.getBenchmarkIds(familyFilter);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HelperApi#getBenchmarkIds");
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
 **familyFilter** | **String**| Highest Level Filter to search by common Benchmark Families, such as S&amp;P, MSCI, or Russell. This will retrieve all related benchmark ids. For further filtering, use the response items such as the categoryDescription field. Leave blank if you wish to see a full sample list of ids. requested- * **CHINA &amp; HK INDICES** - Major Hong Kong and China Indices, such as Hang Seng Index (HSI-HKX) * **DOW JONES** - Dow Jones Global, Regions, Countries, Titans * **FACTSET MARKET INDICES** - Regional and Country Indices defined by FactSet * **FTSE** - FTSE Global, UK, Global All Cap, World, Xinhua, European, GWA, JSE, Multinationals, and Style indices * **GLOBAL INDICES** - A mix of major indices across the globe * **MSCI** - MSCI All Country, Asia Pacific, Thematic &amp; Strategy, Emerging, Developed, US * **RUSSELL** - US, Global, and Nomura * **S&amp;P** - US, ASX, Select Industry, BMI, Global, Thematic, Emerging, TSX * **STOXX** - Total Market, Europe, and Nordic * **TOPIX** - Topix Indices, such as TOPIX 500 (182301) * **MORNINGSTAR** - Global, Regional, Country, and Sector indicies * **BLOOMBERG** - Global, Regional, US, Europe, Maturity, Ratings  | [optional] [enum: CHINA_HK_INDICES, DOW_JONES, FACTSET_MARKET_INDICES, FTSE, GLOBAL_INDICES, MSCI, RUSSELL, SP, STOXX, TOPIX, MORNINGSTAR, BLOOMBERG]

### Return type

[**BenchmarkIdListResponse**](BenchmarkIdListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of sample Benchmark Ids |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getBenchmarkIdsForList

> BenchmarkIdListResponse getBenchmarkIdsForList(benchmarkIdListRequest)

Returns a sample list of Benchmark Identifiers and the benchmark categorization to use in other Benchmark API endpoints.

Returns a **sample** list of Benchmark Identifiers to use in other Benchmark API endpoints. This is a supporting API to be use alongside the other Benchmark API endpoints. For example, use the fsymID value returned in this response as the input to your `ids` parameter in the /constituents endpoint to return constituents for that id.<p> *This is not the full list of benchmark ids allowed in this service, but rather a representation of the most commonly requested. For complete assistance with ID lookup or concordance services, please reach out to FactSet Support.*</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetBenchmarks.ApiClient;
import com.factset.sdk.FactSetBenchmarks.ApiException;
import com.factset.sdk.FactSetBenchmarks.Configuration;
import com.factset.sdk.FactSetBenchmarks.auth.*;
import com.factset.sdk.FactSetBenchmarks.models.*;
import com.factset.sdk.FactSetBenchmarks.api.HelperApi;

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

        HelperApi apiInstance = new HelperApi(defaultClient);
        BenchmarkIdListRequest benchmarkIdListRequest = new BenchmarkIdListRequest(); // BenchmarkIdListRequest | Requests a sample list of identifiers that can be used in other Benchmarks API endpoints.
        try {
            BenchmarkIdListResponse result = apiInstance.getBenchmarkIdsForList(benchmarkIdListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HelperApi#getBenchmarkIdsForList");
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
 **benchmarkIdListRequest** | [**BenchmarkIdListRequest**](BenchmarkIdListRequest.md)| Requests a sample list of identifiers that can be used in other Benchmarks API endpoints. |

### Return type

[**BenchmarkIdListResponse**](BenchmarkIdListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of sample Benchmark Ids |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

