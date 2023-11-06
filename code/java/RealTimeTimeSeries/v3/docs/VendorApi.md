# VendorApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postVendorChartIQTimeSeriesEodList**](VendorApi.md#postVendorChartIQTimeSeriesEodList) | **POST** /vendor/chartIQ/timeSeries/eod/list | End-of-day time series data for a notation.
[**postVendorChartIQTimeSeriesEodSubsampleGet**](VendorApi.md#postVendorChartIQTimeSeriesEodSubsampleGet) | **POST** /vendor/chartIQ/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**postVendorChartIQTimeSeriesEodSubsampleList**](VendorApi.md#postVendorChartIQTimeSeriesEodSubsampleList) | **POST** /vendor/chartIQ/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**postVendorChartIQTimeSeriesIntradaySubsampleGet**](VendorApi.md#postVendorChartIQTimeSeriesIntradaySubsampleGet) | **POST** /vendor/chartIQ/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**postVendorChartIQTimeSeriesIntradaySubsampleList**](VendorApi.md#postVendorChartIQTimeSeriesIntradaySubsampleList) | **POST** /vendor/chartIQ/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.



## postVendorChartIQTimeSeriesEodList

> InlineResponse200 postVendorChartIQTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeTimeSeries.ApiClient;
import com.factset.sdk.RealTimeTimeSeries.ApiException;
import com.factset.sdk.RealTimeTimeSeries.Configuration;
import com.factset.sdk.RealTimeTimeSeries.auth.*;
import com.factset.sdk.RealTimeTimeSeries.models.*;
import com.factset.sdk.RealTimeTimeSeries.api.VendorApi;

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

        VendorApi apiInstance = new VendorApi(defaultClient);
        PostVendorChartIQTimeSeriesEodListRequest postVendorChartIQTimeSeriesEodListRequest = new PostVendorChartIQTimeSeriesEodListRequest(); // PostVendorChartIQTimeSeriesEodListRequest | Request Body
        try {
            InlineResponse200 result = apiInstance.postVendorChartIQTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIQTimeSeriesEodList");
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
 **postVendorChartIQTimeSeriesEodListRequest** | [**PostVendorChartIQTimeSeriesEodListRequest**](PostVendorChartIQTimeSeriesEodListRequest.md)| Request Body |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postVendorChartIQTimeSeriesEodSubsampleGet

> InlineResponse2001 postVendorChartIQTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeTimeSeries.ApiClient;
import com.factset.sdk.RealTimeTimeSeries.ApiException;
import com.factset.sdk.RealTimeTimeSeries.Configuration;
import com.factset.sdk.RealTimeTimeSeries.auth.*;
import com.factset.sdk.RealTimeTimeSeries.models.*;
import com.factset.sdk.RealTimeTimeSeries.api.VendorApi;

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

        VendorApi apiInstance = new VendorApi(defaultClient);
        PostVendorChartIQTimeSeriesEodSubsampleGetRequest postVendorChartIQTimeSeriesEodSubsampleGetRequest = new PostVendorChartIQTimeSeriesEodSubsampleGetRequest(); // PostVendorChartIQTimeSeriesEodSubsampleGetRequest | Request Body
        try {
            InlineResponse2001 result = apiInstance.postVendorChartIQTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIQTimeSeriesEodSubsampleGet");
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
 **postVendorChartIQTimeSeriesEodSubsampleGetRequest** | [**PostVendorChartIQTimeSeriesEodSubsampleGetRequest**](PostVendorChartIQTimeSeriesEodSubsampleGetRequest.md)| Request Body |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postVendorChartIQTimeSeriesEodSubsampleList

> InlineResponse2002 postVendorChartIQTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeTimeSeries.ApiClient;
import com.factset.sdk.RealTimeTimeSeries.ApiException;
import com.factset.sdk.RealTimeTimeSeries.Configuration;
import com.factset.sdk.RealTimeTimeSeries.auth.*;
import com.factset.sdk.RealTimeTimeSeries.models.*;
import com.factset.sdk.RealTimeTimeSeries.api.VendorApi;

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

        VendorApi apiInstance = new VendorApi(defaultClient);
        PostVendorChartIQTimeSeriesEodSubsampleListRequest postVendorChartIQTimeSeriesEodSubsampleListRequest = new PostVendorChartIQTimeSeriesEodSubsampleListRequest(); // PostVendorChartIQTimeSeriesEodSubsampleListRequest | Request Body
        try {
            InlineResponse2002 result = apiInstance.postVendorChartIQTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIQTimeSeriesEodSubsampleList");
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
 **postVendorChartIQTimeSeriesEodSubsampleListRequest** | [**PostVendorChartIQTimeSeriesEodSubsampleListRequest**](PostVendorChartIQTimeSeriesEodSubsampleListRequest.md)| Request Body |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postVendorChartIQTimeSeriesIntradaySubsampleGet

> InlineResponse2003 postVendorChartIQTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeTimeSeries.ApiClient;
import com.factset.sdk.RealTimeTimeSeries.ApiException;
import com.factset.sdk.RealTimeTimeSeries.Configuration;
import com.factset.sdk.RealTimeTimeSeries.auth.*;
import com.factset.sdk.RealTimeTimeSeries.models.*;
import com.factset.sdk.RealTimeTimeSeries.api.VendorApi;

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

        VendorApi apiInstance = new VendorApi(defaultClient);
        PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest postVendorChartIQTimeSeriesIntradaySubsampleGetRequest = new PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest(); // PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest | Request Body
        try {
            InlineResponse2003 result = apiInstance.postVendorChartIQTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIQTimeSeriesIntradaySubsampleGet");
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
 **postVendorChartIQTimeSeriesIntradaySubsampleGetRequest** | [**PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest**](PostVendorChartIQTimeSeriesIntradaySubsampleGetRequest.md)| Request Body |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postVendorChartIQTimeSeriesIntradaySubsampleList

> InlineResponse2004 postVendorChartIQTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeTimeSeries.ApiClient;
import com.factset.sdk.RealTimeTimeSeries.ApiException;
import com.factset.sdk.RealTimeTimeSeries.Configuration;
import com.factset.sdk.RealTimeTimeSeries.auth.*;
import com.factset.sdk.RealTimeTimeSeries.models.*;
import com.factset.sdk.RealTimeTimeSeries.api.VendorApi;

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

        VendorApi apiInstance = new VendorApi(defaultClient);
        PostVendorChartIQTimeSeriesIntradaySubsampleListRequest postVendorChartIQTimeSeriesIntradaySubsampleListRequest = new PostVendorChartIQTimeSeriesIntradaySubsampleListRequest(); // PostVendorChartIQTimeSeriesIntradaySubsampleListRequest | Request Body
        try {
            InlineResponse2004 result = apiInstance.postVendorChartIQTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIQTimeSeriesIntradaySubsampleList");
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
 **postVendorChartIQTimeSeriesIntradaySubsampleListRequest** | [**PostVendorChartIQTimeSeriesIntradaySubsampleListRequest**](PostVendorChartIQTimeSeriesIntradaySubsampleListRequest.md)| Request Body |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

