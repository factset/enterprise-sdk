# StockApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStockDividendTypeList**](StockApi.md#getStockDividendTypeList) | **GET** /stock/dividend/type/list | List of dividend types.
[**getStockNotationKeyFiguresBenchmarkMonth1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth1Get) | **GET** /stock/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
[**getStockNotationKeyFiguresBenchmarkMonth3Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth3Get) | **GET** /stock/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
[**getStockNotationKeyFiguresBenchmarkWeek1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkWeek1Get) | **GET** /stock/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one week.
[**getStockNotationKeyFiguresBenchmarkYear1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkYear1Get) | **GET** /stock/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one year.
[**getStockNotationKeyFiguresBenchmarkYear3Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkYear3Get) | **GET** /stock/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three years.
[**getStockNotationKeyFiguresBenchmarkYear5Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkYear5Get) | **GET** /stock/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a stock for the time range of five years.
[**getStockOwnerList**](StockApi.md#getStockOwnerList) | **GET** /stock/owner/list | List of owners for a specific type of a company&#39;s shares.
[**getStockRecommendationAggregateGet**](StockApi.md#getStockRecommendationAggregateGet) | **GET** /stock/recommendation/aggregate/get | Target price and aggregated recommendations for a stock.
[**getStockRecommendationAggregateHistoryList**](StockApi.md#getStockRecommendationAggregateHistoryList) | **GET** /stock/recommendation/aggregate/history/list | Current and historical trade recommendations and target prices for a stock.
[**postStockDividendList**](StockApi.md#postStockDividendList) | **POST** /stock/dividend/list | List of dividends for a stock.
[**postStockNotationRankingIntradayList**](StockApi.md#postStockNotationRankingIntradayList) | **POST** /stock/notation/ranking/intraday/list | Ranking of stocks&#39; notations using intraday figures.
[**postStockNotationScreenerSearch**](StockApi.md#postStockNotationScreenerSearch) | **POST** /stock/notation/screener/search | Screener for stocks&#39; notations based on stock-specific parameters.
[**postStockNotationScreenerValueRangesGet**](StockApi.md#postStockNotationScreenerValueRangesGet) | **POST** /stock/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.



## getStockDividendTypeList

> InlineResponse2004 getStockDividendTypeList(attributes, language)

List of dividend types.

List of dividend types.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2004 result = apiInstance.getStockDividendTypeList(attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockDividendTypeList");
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
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkMonth1Get

> InlineResponse2005 getStockNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getStockNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkMonth1Get");
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
 **id** | **String**|  |
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkMonth3Get

> InlineResponse2005 getStockNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getStockNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkMonth3Get");
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
 **id** | **String**|  |
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkWeek1Get

> InlineResponse2005 getStockNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getStockNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkWeek1Get");
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
 **id** | **String**|  |
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkYear1Get

> InlineResponse2005 getStockNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getStockNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkYear1Get");
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
 **id** | **String**|  |
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkYear3Get

> InlineResponse2005 getStockNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getStockNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkYear3Get");
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
 **id** | **String**|  |
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkYear5Get

> InlineResponse2005 getStockNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getStockNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkYear5Get");
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
 **id** | **String**|  |
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockOwnerList

> InlineResponse2002 getStockOwnerList(id, attributes, language)

List of owners for a specific type of a company&#39;s shares.

List of top-20 owners for a specific type of a company's shares.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2002 result = apiInstance.getStockOwnerList(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockOwnerList");
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
 **id** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockRecommendationAggregateGet

> InlineResponse200 getStockRecommendationAggregateGet(id, attributes)

Target price and aggregated recommendations for a stock.

Target price and aggregated recommendations for a stock.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.getStockRecommendationAggregateGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockRecommendationAggregateGet");
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
 **id** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockRecommendationAggregateHistoryList

> InlineResponse2001 getStockRecommendationAggregateHistoryList(id, snapshots, attributes)

Current and historical trade recommendations and target prices for a stock.

Current and historical trade recommendations and target prices for a stock.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> snapshots = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2001 result = apiInstance.getStockRecommendationAggregateHistoryList(id, snapshots, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockRecommendationAggregateHistoryList");
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
 **id** | **String**|  |
 **snapshots** | **List&lt;String&gt;**|  | [enum: latest, 1w, 1m, 3m, 6m, 1y]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postStockDividendList

> InlineResponse2003 postStockDividendList(inlineObject)

List of dividends for a stock.

List of dividends for a stock.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        InlineObject inlineObject = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2003 result = apiInstance.postStockDividendList(inlineObject);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#postStockDividendList");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

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


## postStockNotationRankingIntradayList

> InlineResponse2006 postStockNotationRankingIntradayList(inlineObject1)

Ranking of stocks&#39; notations using intraday figures.

Ranking of stocks' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter `currency` has not been specified.`

The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.

All identifiers used as parameters must be valid and entitled.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2006 result = apiInstance.postStockNotationRankingIntradayList(inlineObject1);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#postStockNotationRankingIntradayList");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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


## postStockNotationScreenerSearch

> InlineResponse2007 postStockNotationScreenerSearch(inlineObject2)

Screener for stocks&#39; notations based on stock-specific parameters.

Screener for stocks' notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

Parameters for up to three fiscal years might be used in one request, see attribute `reportedKeyFigures`; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute `estimates`. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter `reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode` and parameter `estimates.currencyDependentEstimates.currency.isoCode` respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter `reportedKeyFigures.fiscalYear`) or for the estimates (see parameter `estimates.fiscalYear`) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.

A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2007 result = apiInstance.postStockNotationScreenerSearch(inlineObject2);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#postStockNotationScreenerSearch");
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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


## postStockNotationScreenerValueRangesGet

> InlineResponse2008 postStockNotationScreenerValueRangesGet(inlineObject3)

Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/stock/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the `/notation/keyFigures/` endpoints.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.StockApi;

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

        StockApi apiInstance = new StockApi(defaultClient);
        InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2008 result = apiInstance.postStockNotationScreenerValueRangesGet(inlineObject3);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#postStockNotationScreenerValueRangesGet");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

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

