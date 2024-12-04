# VendorApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postVendorChartIqTimeSeriesEodList**](VendorApi.md#postVendorChartIqTimeSeriesEodList) | **POST** /vendor/chart-iq/time-series/eod/list | End-of-day time series data for a notation.
[**postVendorChartIqTimeSeriesEodSubsampleGet**](VendorApi.md#postVendorChartIqTimeSeriesEodSubsampleGet) | **POST** /vendor/chart-iq/time-series/eod/subsample/get | Single subsample end-of-day data for a notation.
[**postVendorChartIqTimeSeriesEodSubsampleList**](VendorApi.md#postVendorChartIqTimeSeriesEodSubsampleList) | **POST** /vendor/chart-iq/time-series/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**postVendorChartIqTimeSeriesIntradaySubsampleGet**](VendorApi.md#postVendorChartIqTimeSeriesIntradaySubsampleGet) | **POST** /vendor/chart-iq/time-series/intraday/subsample/get | Single subsample intraday data for a notation.
[**postVendorChartIqTimeSeriesIntradaySubsampleList**](VendorApi.md#postVendorChartIqTimeSeriesIntradaySubsampleList) | **POST** /vendor/chart-iq/time-series/intraday/subsample/list | Subsampled intraday time series data for a notation.



## postVendorChartIqTimeSeriesEodList

> InlineResponse200 postVendorChartIqTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
            InlineResponse200 result = apiInstance.postVendorChartIqTimeSeriesEodList(postVendorChartIQTimeSeriesEodListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIqTimeSeriesEodList");
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


## postVendorChartIqTimeSeriesEodSubsampleGet

> InlineResponse2001 postVendorChartIqTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
            InlineResponse2001 result = apiInstance.postVendorChartIqTimeSeriesEodSubsampleGet(postVendorChartIQTimeSeriesEodSubsampleGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIqTimeSeriesEodSubsampleGet");
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


## postVendorChartIqTimeSeriesEodSubsampleList

> InlineResponse2002 postVendorChartIqTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
            InlineResponse2002 result = apiInstance.postVendorChartIqTimeSeriesEodSubsampleList(postVendorChartIQTimeSeriesEodSubsampleListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIqTimeSeriesEodSubsampleList");
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


## postVendorChartIqTimeSeriesIntradaySubsampleGet

> InlineResponse2003 postVendorChartIqTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
            InlineResponse2003 result = apiInstance.postVendorChartIqTimeSeriesIntradaySubsampleGet(postVendorChartIQTimeSeriesIntradaySubsampleGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIqTimeSeriesIntradaySubsampleGet");
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


## postVendorChartIqTimeSeriesIntradaySubsampleList

> InlineResponse2004 postVendorChartIqTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
            InlineResponse2004 result = apiInstance.postVendorChartIqTimeSeriesIntradaySubsampleList(postVendorChartIQTimeSeriesIntradaySubsampleListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#postVendorChartIqTimeSeriesIntradaySubsampleList");
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

