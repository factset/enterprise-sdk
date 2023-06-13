# PricesApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPricesBidAskGet**](PricesApi.md#getPricesBidAskGet) | **GET** /prices/bidAsk/get | Most recent bid and ask prices (best bid / offer) for a notation.
[**getPricesBidAskList**](PricesApi.md#getPricesBidAskList) | **GET** /prices/bidAsk/list | Most recent bid and ask prices (best bid / offer) for a list of notations.
[**getPricesGet**](PricesApi.md#getPricesGet) | **GET** /prices/get | Overview of trading on the most recent trading day, including the latest price, for a notation.
[**getPricesList**](PricesApi.md#getPricesList) | **GET** /prices/list | Overview of trading on the most recent trading day, including the latest price, for a list of notations.
[**getPricesOrderbookAggregatedGet**](PricesApi.md#getPricesOrderbookAggregatedGet) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**getPricesOrderbookFullGet**](PricesApi.md#getPricesOrderbookFullGet) | **GET** /prices/orderbook/full/get | Full orderbook
[**getPricesTradingScheduleEventTypeList**](PricesApi.md#getPricesTradingScheduleEventTypeList) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**postPricesTradingScheduleEventList**](PricesApi.md#postPricesTradingScheduleEventList) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.



## getPricesBidAskGet

> InlineResponse20086 getPricesBidAskGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval)

Most recent bid and ask prices (best bid / offer) for a notation.

Most recent bid and ask prices (best bid / offer) for a notation.

The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        String quality = "RLT"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("1000"); // BigDecimal | Minimum number of milliseconds at which updates are send.
        try {
            InlineResponse20086 result = apiInstance.getPricesBidAskGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesBidAskGet");
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
 **quality** | **String**|  | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscriptionMinimumInterval** | **BigDecimal**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000] [enum: 1000, 5000, 10000, 30000, 60000, 300000]

### Return type

[**InlineResponse20086**](InlineResponse20086.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPricesBidAskList

> InlineResponse20087 getPricesBidAskList(identifiers, identifierType, quality, sameQuality, attributes)

Most recent bid and ask prices (best bid / offer) for a list of notations.

Most recent bid and ask prices (best bid / offer) for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        java.util.Set<String> identifiers = Arrays.asList(); // java.util.Set<String> | 
        String identifierType = "idNotation"; // String | 
        String quality = "RLT"; // String | 
        Boolean sameQuality = true; // Boolean | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20087 result = apiInstance.getPricesBidAskList(identifiers, identifierType, quality, sameQuality, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesBidAskList");
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
 **identifiers** | **List&lt;String&gt;**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **quality** | **String**|  | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **sameQuality** | **Boolean**|  | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20087**](InlineResponse20087.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPricesGet

> InlineResponse20084 getPricesGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval)

Overview of trading on the most recent trading day, including the latest price, for a notation.

Overview of trading on the most recent trading day, including the latest price, for a notation.

The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        String quality = "RLT"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("1000"); // BigDecimal | Minimum number of milliseconds at which updates are sent.
        try {
            InlineResponse20084 result = apiInstance.getPricesGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesGet");
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
 **quality** | **String**|  | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscriptionMinimumInterval** | **BigDecimal**| Minimum number of milliseconds at which updates are sent. | [optional] [default to 5000] [enum: 1000, 5000, 10000, 30000, 60000, 300000]

### Return type

[**InlineResponse20084**](InlineResponse20084.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPricesList

> InlineResponse20085 getPricesList(identifiers, identifierType, quality, sameQuality, attributes)

Overview of trading on the most recent trading day, including the latest price, for a list of notations.

Overview of trading on the most recent trading day, including the latest price, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        java.util.Set<String> identifiers = Arrays.asList(); // java.util.Set<String> | 
        String identifierType = "idNotation"; // String | 
        String quality = "RLT"; // String | 
        Boolean sameQuality = true; // Boolean | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20085 result = apiInstance.getPricesList(identifiers, identifierType, quality, sameQuality, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesList");
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
 **identifiers** | **List&lt;String&gt;**|  |
 **identifierType** | **String**|  | [enum: idNotation, tickerExchange, tickerRegion, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional]
 **quality** | **String**|  | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **sameQuality** | **Boolean**|  | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPricesOrderbookAggregatedGet

> InlineResponse20088 getPricesOrderbookAggregatedGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval)

Orderbook aggregated by price.

Orderbook aggregated by price.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        String quality = "RLT"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("1000"); // BigDecimal | Non-negative number of milliseconds to throttle the update rate.
        try {
            InlineResponse20088 result = apiInstance.getPricesOrderbookAggregatedGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesOrderbookAggregatedGet");
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
 **quality** | **String**|  | [optional] [default to RLT] [enum: RLT, DLY, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscriptionMinimumInterval** | **BigDecimal**| Non-negative number of milliseconds to throttle the update rate. | [optional] [default to 5000] [enum: 1000, 5000, 10000, 30000, 60000, 300000]

### Return type

[**InlineResponse20088**](InlineResponse20088.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPricesOrderbookFullGet

> InlineResponse20089 getPricesOrderbookFullGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval)

Full orderbook

Full orderbook

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idNotation"; // String | 
        String quality = "RLT"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("1000"); // BigDecimal | Non-negative number of milliseconds to throttle the update rate.
        try {
            InlineResponse20089 result = apiInstance.getPricesOrderbookFullGet(identifier, identifierType, quality, attributes, subscriptionMinimumInterval);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesOrderbookFullGet");
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
 **quality** | **String**|  | [optional] [default to RLT] [enum: RLT, DLY, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscriptionMinimumInterval** | **BigDecimal**| Non-negative number of milliseconds to throttle the update rate. | [optional] [default to 5000] [enum: 1000, 5000, 10000, 30000, 60000, 300000]

### Return type

[**InlineResponse20089**](InlineResponse20089.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPricesTradingScheduleEventTypeList

> InlineResponse20091 getPricesTradingScheduleEventTypeList(attributes)

Trading schedule event types.

Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20091 result = apiInstance.getPricesTradingScheduleEventTypeList(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#getPricesTradingScheduleEventTypeList");
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

### Return type

[**InlineResponse20091**](InlineResponse20091.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPricesTradingScheduleEventList

> InlineResponse20090 postPricesTradingScheduleEventList(postPricesTradingScheduleEventListRequest)

Sequence of market-related events.

Sequence of market-related events like the opening time or closing time of a market of a specific notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.PricesApi;

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

        PricesApi apiInstance = new PricesApi(defaultClient);
        PostPricesTradingScheduleEventListRequest postPricesTradingScheduleEventListRequest = new PostPricesTradingScheduleEventListRequest(); // PostPricesTradingScheduleEventListRequest | Request Body
        try {
            InlineResponse20090 result = apiInstance.postPricesTradingScheduleEventList(postPricesTradingScheduleEventListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#postPricesTradingScheduleEventList");
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
 **postPricesTradingScheduleEventListRequest** | [**PostPricesTradingScheduleEventListRequest**](PostPricesTradingScheduleEventListRequest.md)| Request Body |

### Return type

[**InlineResponse20090**](InlineResponse20090.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

