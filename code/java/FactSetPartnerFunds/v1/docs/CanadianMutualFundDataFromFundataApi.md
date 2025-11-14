# CanadianMutualFundDataFromFundataApi

All URIs are relative to *https://api.factset.com/content/partner-funds/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssetAllocations**](CanadianMutualFundDataFromFundataApi.md#getAssetAllocations) | **GET** /fundata/asset-allocations | Fund asset allocations
[**getDistribution**](CanadianMutualFundDataFromFundataApi.md#getDistribution) | **GET** /fundata/distribution | Fund distributions
[**getFees**](CanadianMutualFundDataFromFundataApi.md#getFees) | **GET** /fundata/fees | Fund fees
[**getGeographicAllocations**](CanadianMutualFundDataFromFundataApi.md#getGeographicAllocations) | **GET** /fundata/geographic-allocations | Fund geographic allocations
[**getGrowthOfTenK**](CanadianMutualFundDataFromFundataApi.md#getGrowthOfTenK) | **GET** /fundata/growth-of-10k | Fund growth of 10K
[**getHoldings**](CanadianMutualFundDataFromFundataApi.md#getHoldings) | **GET** /fundata/holdings | Fund holdings
[**getProfile**](CanadianMutualFundDataFromFundataApi.md#getProfile) | **GET** /fundata/profile | Fund profile
[**getRankings**](CanadianMutualFundDataFromFundataApi.md#getRankings) | **GET** /fundata/rankings | Fund rankings
[**getReturns**](CanadianMutualFundDataFromFundataApi.md#getReturns) | **GET** /fundata/returns | Fund returns
[**getRisk**](CanadianMutualFundDataFromFundataApi.md#getRisk) | **GET** /fundata/risk | Fund risk
[**getSectorAllocations**](CanadianMutualFundDataFromFundataApi.md#getSectorAllocations) | **GET** /fundata/sector-allocations | Fund sector allocations



## getAssetAllocations

> AssetAllocationsResponse getAssetAllocations(ids, language, sort)

Fund asset allocations

This endpoint provides asset allocations for Canadian mutual fund aggregated by asset. The result is default sorted in descending order of asset weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String language = "EN"; // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
        try {
            AssetAllocationsResponse result = apiInstance.getAssetAllocations(ids, language, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getAssetAllocations");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN] [enum: EN, FR]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional]

### Return type

[**AssetAllocationsResponse**](AssetAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asset allocation response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getDistribution

> DistributionsResponse getDistribution(ids)

Fund distributions

This endpoint provides distribution data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        try {
            DistributionsResponse result = apiInstance.getDistribution(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getDistribution");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**DistributionsResponse**](DistributionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The distribution response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFees

> FeesResponse getFees(ids, language)

Fund fees

This endpoint provides fees data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String language = "EN"; // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
        try {
            FeesResponse result = apiInstance.getFees(ids, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getFees");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN] [enum: EN, FR]

### Return type

[**FeesResponse**](FeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fees response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getGeographicAllocations

> GeoAllocationsResponse getGeographicAllocations(ids, language, sort)

Fund geographic allocations

This endpoint provides geographic allocations (which can be countries or regions) of the holdings within Canadian mutual funds. The result is default sorted in descending order of geographic weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String language = "EN"; // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
        try {
            GeoAllocationsResponse result = apiInstance.getGeographicAllocations(ids, language, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getGeographicAllocations");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN] [enum: EN, FR]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional]

### Return type

[**GeoAllocationsResponse**](GeoAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The geographic allocation response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getGrowthOfTenK

> GrowthOfTenKResponse getGrowthOfTenK(ids, timePeriod, sort)

Fund growth of 10K

This endpoint provides growth of 10K data for Canadian mutual funds. The result is default sorted in descending order of asOfDate.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String timePeriod = "3M"; // String | Periodicity or frequency of the fiscal period.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
        try {
            GrowthOfTenKResponse result = apiInstance.getGrowthOfTenK(ids, timePeriod, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getGrowthOfTenK");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **timePeriod** | **String**| Periodicity or frequency of the fiscal period. | [optional] [default to 1Y] [enum: 3M, 6M, 1Y, 3Y, 5Y, 10Y, 20Y]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional]

### Return type

[**GrowthOfTenKResponse**](GrowthOfTenKResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The growth of 10K response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getHoldings

> HoldingsResponse getHoldings(ids)

Fund holdings

This endpoint provides top 10 holdings for Canadian mutual funds. The result is default sorted in descending order of weight of the holdings.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        try {
            HoldingsResponse result = apiInstance.getHoldings(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getHoldings");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**HoldingsResponse**](HoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holdings response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getProfile

> ProfileResponse getProfile(ids, language)

Fund profile

This endpoint provides profile information for Canadian mutual funds such as objective, manager, and basic returns.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String language = "EN"; // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
        try {
            ProfileResponse result = apiInstance.getProfile(ids, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getProfile");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN] [enum: EN, FR]

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
| **200** | The fund profile response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRankings

> PerformanceRankingsResponse getRankings(ids)

Fund rankings

This endpoint provides rankings for Canadian mutual funds as compared to benchmarks and peers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        try {
            PerformanceRankingsResponse result = apiInstance.getRankings(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getRankings");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**PerformanceRankingsResponse**](PerformanceRankingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund rankings response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getReturns

> PerformanceReturnsResponse getReturns(ids)

Fund returns

This endpoint provides all the comparative performance values for Canadian mutual funds and their respective benchmark indices. Please note: all periods greater than one year are annualized.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        try {
            PerformanceReturnsResponse result = apiInstance.getReturns(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getReturns");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**PerformanceReturnsResponse**](PerformanceReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund returns response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRisk

> RiskResponse getRisk(ids, language, numYears)

Fund risk

This endpoint provides risk data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String language = "EN"; // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
        Integer numYears = 5; // Integer | Number of years of risk data to return. 
        try {
            RiskResponse result = apiInstance.getRisk(ids, language, numYears);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getRisk");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN] [enum: EN, FR]
 **numYears** | **Integer**| Number of years of risk data to return.  | [optional] [default to 5]

### Return type

[**RiskResponse**](RiskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The risk response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSectorAllocations

> SectorAllocationsResponse getSectorAllocations(ids, language, sort)

Fund sector allocations

This endpoint provides Canadian mutual fund data aggregated by sector. The result is default sorted in descending order of sector weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPartnerFunds.ApiClient;
import com.factset.sdk.FactSetPartnerFunds.ApiException;
import com.factset.sdk.FactSetPartnerFunds.Configuration;
import com.factset.sdk.FactSetPartnerFunds.auth.*;
import com.factset.sdk.FactSetPartnerFunds.models.*;
import com.factset.sdk.FactSetPartnerFunds.api.CanadianMutualFundDataFromFundataApi;

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

        CanadianMutualFundDataFromFundataApi apiInstance = new CanadianMutualFundDataFromFundataApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
        String language = "EN"; // String | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order.
        try {
            SectorAllocationsResponse result = apiInstance.getSectorAllocations(ids, language, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CanadianMutualFundDataFromFundataApi#getSectorAllocations");
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
 **ids** | **List&lt;String&gt;**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **String**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN] [enum: EN, FR]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional]

### Return type

[**SectorAllocationsResponse**](SectorAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund sector allocation response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

