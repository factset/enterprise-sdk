# FundamentalsPointInTimeApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postFundamentalsFiscalPeriods**](FundamentalsPointInTimeApi.md#postFundamentalsFiscalPeriods) | **POST** /periods | Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.
[**postFundamentalsPITData**](FundamentalsPointInTimeApi.md#postFundamentalsPITData) | **POST** /point-in-time | Retrieve Point-in-Time data for multiple securities.



## postFundamentalsFiscalPeriods

> BatchStatusResponse postFundamentalsFiscalPeriods(periodsRequest)

Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.

This endpoint initiates an asynchronous batch job to fetch detailed information about fiscal periods. The request allows filtering for fiscal periods ending within a specified calendar date range. The response provides Point-in-Time (PIT) details, showing when each period's information was first published and when it was superseded. This is crucial for historical backtesting. All requests will return a `202 Accepted` response with a `Location` header pointing to the `/batch-status` endpoint. Use the `id` from the status response to check for completion and retrieve the result from the `/batch-result` endpoint. **All timestamps are in UTC.**


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.auth.*;
import com.factset.sdk.FactSetFundamentals.models.*;
import com.factset.sdk.FactSetFundamentals.api.FundamentalsPointInTimeApi;

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

        FundamentalsPointInTimeApi apiInstance = new FundamentalsPointInTimeApi(defaultClient);
        PeriodsRequest periodsRequest = new PeriodsRequest(); // PeriodsRequest | Request object containing parameters for the fiscal periods request.
        try {
            BatchStatusResponse result = apiInstance.postFundamentalsFiscalPeriods(periodsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsPointInTimeApi#postFundamentalsFiscalPeriods");
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
 **periodsRequest** | [**PeriodsRequest**](PeriodsRequest.md)| Request object containing parameters for the fiscal periods request. |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. |  * Location - The URL to poll for status of the batch request. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. |  -  |
| **500** | Internal Server Error. |  -  |
| **503** | Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. |  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  |


## postFundamentalsPITData

> BatchStatusResponse postFundamentalsPITData(fundamentalsPITRequest)

Retrieve Point-in-Time data for multiple securities.

This endpoint initiates an asynchronous batch job to fetch Point-in-Time (PIT) data. PIT data allows you to view fundamentals data as it was known on a specific date. This is crucial for backtesting trading strategies, performing academic research, and avoiding lookahead bias. All requests will return a `202 Accepted` response with a `Location` header pointing to the `/batch-status` endpoint. Use the `id` from the status response to check for completion and retrieve the result from the `/batch-result` endpoint. **All timestamps are in UTC.**


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.auth.*;
import com.factset.sdk.FactSetFundamentals.models.*;
import com.factset.sdk.FactSetFundamentals.api.FundamentalsPointInTimeApi;

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

        FundamentalsPointInTimeApi apiInstance = new FundamentalsPointInTimeApi(defaultClient);
        FundamentalsPITRequest fundamentalsPITRequest = new FundamentalsPITRequest(); // FundamentalsPITRequest | Request object containing parameters for the PIT fundamentals request.
        try {
            BatchStatusResponse result = apiInstance.postFundamentalsPITData(fundamentalsPITRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundamentalsPointInTimeApi#postFundamentalsPITData");
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
 **fundamentalsPITRequest** | [**FundamentalsPITRequest**](FundamentalsPITRequest.md)| Request object containing parameters for the PIT fundamentals request. |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. |  * Location - The URL to poll for status of the batch request. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. |  -  |
| **500** | Internal Server Error. |  -  |
| **503** | Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. |  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  |

