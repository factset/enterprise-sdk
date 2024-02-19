# PricesApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPricesTimeSeriesEodList**](PricesApi.md#postPricesTimeSeriesEodList) | **POST** /prices/timeSeries/eod/list | End-of-day time series data for a notation.
[**postPricesTimeSeriesEodSubsampleGet**](PricesApi.md#postPricesTimeSeriesEodSubsampleGet) | **POST** /prices/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**postPricesTimeSeriesEodSubsampleList**](PricesApi.md#postPricesTimeSeriesEodSubsampleList) | **POST** /prices/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**postPricesTimeSeriesIntradayList**](PricesApi.md#postPricesTimeSeriesIntradayList) | **POST** /prices/timeSeries/intraday/list | Intraday time series data for a notation.
[**postPricesTimeSeriesIntradaySubsampleGet**](PricesApi.md#postPricesTimeSeriesIntradaySubsampleGet) | **POST** /prices/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**postPricesTimeSeriesIntradaySubsampleList**](PricesApi.md#postPricesTimeSeriesIntradaySubsampleList) | **POST** /prices/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.



## postPricesTimeSeriesEodList

> InlineResponse2005 postPricesTimeSeriesEodList(postPricesTimeSeriesEodListRequest)

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
import com.factset.sdk.RealTimeTimeSeries.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTimeSeriesEodListRequest postPricesTimeSeriesEodListRequest = new PostPricesTimeSeriesEodListRequest(); // PostPricesTimeSeriesEodListRequest | Request Body
        try {
            InlineResponse2005 result = apiInstance.postPricesTimeSeriesEodList(postPricesTimeSeriesEodListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTimeSeriesEodList");
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
 **postPricesTimeSeriesEodListRequest** | [**PostPricesTimeSeriesEodListRequest**](PostPricesTimeSeriesEodListRequest.md)| Request Body |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPricesTimeSeriesEodSubsampleGet

> InlineResponse2006 postPricesTimeSeriesEodSubsampleGet(postPricesTimeSeriesEodSubsampleGetRequest)

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
import com.factset.sdk.RealTimeTimeSeries.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTimeSeriesEodSubsampleGetRequest postPricesTimeSeriesEodSubsampleGetRequest = new PostPricesTimeSeriesEodSubsampleGetRequest(); // PostPricesTimeSeriesEodSubsampleGetRequest | Request Body
        try {
            InlineResponse2006 result = apiInstance.postPricesTimeSeriesEodSubsampleGet(postPricesTimeSeriesEodSubsampleGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTimeSeriesEodSubsampleGet");
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
 **postPricesTimeSeriesEodSubsampleGetRequest** | [**PostPricesTimeSeriesEodSubsampleGetRequest**](PostPricesTimeSeriesEodSubsampleGetRequest.md)| Request Body |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPricesTimeSeriesEodSubsampleList

> InlineResponse2007 postPricesTimeSeriesEodSubsampleList(postPricesTimeSeriesEodSubsampleListRequest)

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
import com.factset.sdk.RealTimeTimeSeries.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTimeSeriesEodSubsampleListRequest postPricesTimeSeriesEodSubsampleListRequest = new PostPricesTimeSeriesEodSubsampleListRequest(); // PostPricesTimeSeriesEodSubsampleListRequest | Request Body
        try {
            InlineResponse2007 result = apiInstance.postPricesTimeSeriesEodSubsampleList(postPricesTimeSeriesEodSubsampleListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTimeSeriesEodSubsampleList");
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
 **postPricesTimeSeriesEodSubsampleListRequest** | [**PostPricesTimeSeriesEodSubsampleListRequest**](PostPricesTimeSeriesEodSubsampleListRequest.md)| Request Body |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPricesTimeSeriesIntradayList

> InlineResponse2008 postPricesTimeSeriesIntradayList(postPricesTimeSeriesIntradayListRequest)

Intraday time series data for a notation.

Intraday time series data for a notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

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
import com.factset.sdk.RealTimeTimeSeries.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTimeSeriesIntradayListRequest postPricesTimeSeriesIntradayListRequest = new PostPricesTimeSeriesIntradayListRequest(); // PostPricesTimeSeriesIntradayListRequest | Request Body
        try {
            InlineResponse2008 result = apiInstance.postPricesTimeSeriesIntradayList(postPricesTimeSeriesIntradayListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTimeSeriesIntradayList");
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
 **postPricesTimeSeriesIntradayListRequest** | [**PostPricesTimeSeriesIntradayListRequest**](PostPricesTimeSeriesIntradayListRequest.md)| Request Body |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPricesTimeSeriesIntradaySubsampleGet

> InlineResponse2009 postPricesTimeSeriesIntradaySubsampleGet(postPricesTimeSeriesIntradaySubsampleGetRequest)

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
import com.factset.sdk.RealTimeTimeSeries.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTimeSeriesIntradaySubsampleGetRequest postPricesTimeSeriesIntradaySubsampleGetRequest = new PostPricesTimeSeriesIntradaySubsampleGetRequest(); // PostPricesTimeSeriesIntradaySubsampleGetRequest | Request Body
        try {
            InlineResponse2009 result = apiInstance.postPricesTimeSeriesIntradaySubsampleGet(postPricesTimeSeriesIntradaySubsampleGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTimeSeriesIntradaySubsampleGet");
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
 **postPricesTimeSeriesIntradaySubsampleGetRequest** | [**PostPricesTimeSeriesIntradaySubsampleGetRequest**](PostPricesTimeSeriesIntradaySubsampleGetRequest.md)| Request Body |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPricesTimeSeriesIntradaySubsampleList

> InlineResponse20010 postPricesTimeSeriesIntradaySubsampleList(postPricesTimeSeriesIntradaySubsampleListRequest)

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
import com.factset.sdk.RealTimeTimeSeries.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTimeSeriesIntradaySubsampleListRequest postPricesTimeSeriesIntradaySubsampleListRequest = new PostPricesTimeSeriesIntradaySubsampleListRequest(); // PostPricesTimeSeriesIntradaySubsampleListRequest | Request Body
        try {
            InlineResponse20010 result = apiInstance.postPricesTimeSeriesIntradaySubsampleList(postPricesTimeSeriesIntradaySubsampleListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTimeSeriesIntradaySubsampleList");
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
 **postPricesTimeSeriesIntradaySubsampleListRequest** | [**PostPricesTimeSeriesIntradaySubsampleListRequest**](PostPricesTimeSeriesIntradaySubsampleListRequest.md)| Request Body |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

