# StockApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStockCompositeProfileGetByNotation**](StockApi.md#getStockCompositeProfileGetByNotation) | **GET** /stock/composite/profile/getByNotation | Provides key elements of a stock profile together with the profile of the issuing company.
[**getStockDividendTypeList**](StockApi.md#getStockDividendTypeList) | **GET** /stock/dividend/type/list | List of dividend types.
[**getStockNotationKeyFiguresBenchmarkMonth1Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth1Get) | **GET** /stock/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a stock for the time range of one month.
[**getStockNotationKeyFiguresBenchmarkMonth3Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth3Get) | **GET** /stock/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a stock for the time range of three months.
[**getStockNotationKeyFiguresBenchmarkMonth6Get**](StockApi.md#getStockNotationKeyFiguresBenchmarkMonth6Get) | **GET** /stock/notation/keyFigures/benchmark/month/6/get | End-of-day (EOD) benchmark key figures of a stock for the time range of six months.
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



## getStockCompositeProfileGetByNotation

> InlineResponse2009 getStockCompositeProfileGetByNotation(identifier, identifierType, attributes, language)

Provides key elements of a stock profile together with the profile of the issuing company.

Provides key elements of a stock profile together with the profile of the issuing company.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2009 result = apiInstance.getStockCompositeProfileGetByNotation(identifier, identifierType, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockCompositeProfileGetByNotation");
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockDividendTypeList

> InlineResponse20011 getStockDividendTypeList(attributes, language)

List of dividend types.

List of dividend types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20011 result = apiInstance.getStockDividendTypeList(attributes, language);
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

[**InlineResponse20011**](InlineResponse20011.md)

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

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth1Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

End-of-day (EOD) benchmark key figures of a stock for the time range of one month.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkMonth1Get(identifier, identifierType, idNotationBenchmark, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth3Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

End-of-day (EOD) benchmark key figures of a stock for the time range of three months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkMonth3Get(identifier, identifierType, idNotationBenchmark, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getStockNotationKeyFiguresBenchmarkMonth6Get

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkMonth6Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of six months.

End-of-day (EOD) benchmark key figures of a stock for the time range of six months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkMonth6Get(identifier, identifierType, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#getStockNotationKeyFiguresBenchmarkMonth6Get");
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkWeek1Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

End-of-day (EOD) benchmark key figures of a stock for the time range of one week.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkWeek1Get(identifier, identifierType, idNotationBenchmark, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear1Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

End-of-day (EOD) benchmark key figures of a stock for the time range of one year.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkYear1Get(identifier, identifierType, idNotationBenchmark, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear3Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

End-of-day (EOD) benchmark key figures of a stock for the time range of three years.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkYear3Get(identifier, identifierType, idNotationBenchmark, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

> InlineResponse20012 getStockNotationKeyFiguresBenchmarkYear5Get(identifier, identifierType, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

End-of-day (EOD) benchmark key figures of a stock for the time range of five years.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20012 result = apiInstance.getStockNotationKeyFiguresBenchmarkYear5Get(identifier, identifierType, idNotationBenchmark, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **idNotationBenchmark** | **List&lt;String&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

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

> InlineResponse2008 getStockOwnerList(identifier, identifierType, attributes, language)

List of owners for a specific type of a company&#39;s shares.

List of top-20 owners for a specific type of a company's shares.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2008 result = apiInstance.getStockOwnerList(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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

> InlineResponse2003 getStockRecommendationAggregateGet(identifier, identifierType, attributes)

Target price and aggregated recommendations for a stock.

Target price and aggregated recommendations for a stock.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2003 result = apiInstance.getStockRecommendationAggregateGet(identifier, identifierType, attributes);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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

> InlineResponse2004 getStockRecommendationAggregateHistoryList(identifier, identifierType, snapshots, attributes)

Current and historical trade recommendations and target prices for a stock.

Current and historical trade recommendations and target prices for a stock.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> snapshots = Arrays.asList(); // java.util.Set<String> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2004 result = apiInstance.getStockRecommendationAggregateHistoryList(identifier, identifierType, snapshots, attributes);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **snapshots** | **List&lt;String&gt;**|  | [enum: latest, 1w, 1m, 3m, 6m, 1y]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## postStockDividendList

> InlineResponse20010 postStockDividendList(postStockDividendListRequest)

List of dividends for a stock.

List of dividends for a stock.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        PostStockDividendListRequest postStockDividendListRequest = new PostStockDividendListRequest(); // PostStockDividendListRequest | 
        try {
            InlineResponse20010 result = apiInstance.postStockDividendList(postStockDividendListRequest);
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
 **postStockDividendListRequest** | [**PostStockDividendListRequest**](PostStockDividendListRequest.md)|  | [optional]

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


## postStockNotationRankingIntradayList

> InlineResponse20013 postStockNotationRankingIntradayList(postStockNotationRankingIntradayListRequest)

Ranking of stocks&#39; notations using intraday figures.

Ranking of stocks' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameter `currency` has not been specified.`

The search can be restricted to a specific set of products by using customer-specific instrument or notation restriction lists. Such restriction lists are set up by FactSet upon request.

All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        PostStockNotationRankingIntradayListRequest postStockNotationRankingIntradayListRequest = new PostStockNotationRankingIntradayListRequest(); // PostStockNotationRankingIntradayListRequest | 
        try {
            InlineResponse20013 result = apiInstance.postStockNotationRankingIntradayList(postStockNotationRankingIntradayListRequest);
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
 **postStockNotationRankingIntradayListRequest** | [**PostStockNotationRankingIntradayListRequest**](PostStockNotationRankingIntradayListRequest.md)|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

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

> InlineResponse20014 postStockNotationScreenerSearch(postStockNotationScreenerSearchRequest)

Screener for stocks&#39; notations based on stock-specific parameters.

Screener for stocks' notations based on stock-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

Currency dependent current figures on company level (see attribute `currentKeyFigures.company.currencyDependent`) or on share instrument level (see attribute `currentKeyFigures.shareInstrument.currencyDependent`) are only returned if the currency (see parameter `currentKeyFigures.company.currencyDependent.currency.isoCode` or parameter `currentKeyFigures.shareInstrument.currencyDependent.currency.isoCode` respectively) are set.

Parameters for up to three fiscal years might be used in one request, see attribute `reportedKeyFigures`; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years; parameters for all three might be used in one request, see attribute `estimates`. The estimated values are calculated as the average of the most recent estimates provided by all analysts in a fixed time frame of 100 days. Screening and sorting by a currency-dependent attribute is not possible if the currency (see parameter `reportedKeyFigures.currencyDependentKeyFigures.currency.isoCode` and parameter `estimates.currencyDependentEstimates.currency.isoCode` respectively) is not set. If a fiscal year for the data as of the end of a fiscal year (see parameter `reportedKeyFigures.fiscalYear`) or for the estimates (see parameter `estimates.fiscalYear`) has been selected but no currency has been set, the respective data will be returned in the currency in which it was originally reported.

A specific set of stocks can be restricted to or excluded by using customer-specific instrument or notation selection lists. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        PostStockNotationScreenerSearchRequest postStockNotationScreenerSearchRequest = new PostStockNotationScreenerSearchRequest(); // PostStockNotationScreenerSearchRequest | 
        try {
            InlineResponse20014 result = apiInstance.postStockNotationScreenerSearch(postStockNotationScreenerSearchRequest);
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
 **postStockNotationScreenerSearchRequest** | [**PostStockNotationScreenerSearchRequest**](PostStockNotationScreenerSearchRequest.md)|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

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

> InlineResponse20015 postStockNotationScreenerValueRangesGet(postStockNotationScreenerValueRangesGetRequest)

Possible values and value ranges for the parameters used in the endpoint &#x60;/stock/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/stock/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/stock/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. For more information regarding the performance and volatility parameters, see the information available in the group description of the `/notation/keyFigures/` endpoints.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        StockApi apiInstance = new StockApi(defaultClient);
        PostStockNotationScreenerValueRangesGetRequest postStockNotationScreenerValueRangesGetRequest = new PostStockNotationScreenerValueRangesGetRequest(); // PostStockNotationScreenerValueRangesGetRequest | 
        try {
            InlineResponse20015 result = apiInstance.postStockNotationScreenerValueRangesGet(postStockNotationScreenerValueRangesGetRequest);
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
 **postStockNotationScreenerValueRangesGetRequest** | [**PostStockNotationScreenerValueRangesGetRequest**](PostStockNotationScreenerValueRangesGetRequest.md)|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

