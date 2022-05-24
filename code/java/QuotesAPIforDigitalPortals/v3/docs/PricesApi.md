# PricesApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPricesBidAskGet**](PricesApi.md#getPricesBidAskGet) | **GET** /prices/bidAsk/get | Current bid and ask prices (best bid / offer) for a notation.
[**getPricesBidAskList**](PricesApi.md#getPricesBidAskList) | **GET** /prices/bidAsk/list | Current bid and ask prices (best bid / offer) for a list of notations.
[**getPricesGet**](PricesApi.md#getPricesGet) | **GET** /prices/get | Overview of trading on the current trading day, including the latest price, for a notation.
[**getPricesList**](PricesApi.md#getPricesList) | **GET** /prices/list | Overview of trading on the current trading day, including the latest price, for a list of notations.
[**getPricesOrderbookAggregatedGet**](PricesApi.md#getPricesOrderbookAggregatedGet) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**getPricesOrderbookFullGet**](PricesApi.md#getPricesOrderbookFullGet) | **GET** /prices/orderbook/full/get | Full orderbook
[**getPricesTradingScheduleEventTypeList**](PricesApi.md#getPricesTradingScheduleEventTypeList) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**postPricesTradingScheduleEventList**](PricesApi.md#postPricesTradingScheduleEventList) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.



## getPricesBidAskGet

> InlineResponse20081 getPricesBidAskGet(id, quality, attributes, subscriptionMinimumInterval)

Current bid and ask prices (best bid / offer) for a notation.

Current bid and ask prices (best bid / offer) for a notation.

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
        String id = "id_example"; // String | Identifier of the notation.
        String quality = "RLT"; // String | Quality of the price.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("1000"); // BigDecimal | Minimum number of milliseconds at which updates are send.
        try {
            InlineResponse20081 result = apiInstance.getPricesBidAskGet(id, quality, attributes, subscriptionMinimumInterval);
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
 **id** | **String**| Identifier of the notation. |
 **quality** | **String**| Quality of the price. | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscriptionMinimumInterval** | **BigDecimal**| Minimum number of milliseconds at which updates are send. | [optional] [default to 5000.0] [enum: 1000, 5000, 10000, 30000, 60000, 300000]

### Return type

[**InlineResponse20081**](InlineResponse20081.md)

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

> InlineResponse20082 getPricesBidAskList(ids, quality, sameQuality, attributes)

Current bid and ask prices (best bid / offer) for a list of notations.

Current bid and ask prices (best bid / offer) for a list of notations.

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of notations.
        String quality = "RLT"; // String | Quality of the price.
        Boolean sameQuality = true; // Boolean | Assure that the prices for all notations are of the same quality.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20082 result = apiInstance.getPricesBidAskList(ids, quality, sameQuality, attributes);
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **quality** | **String**| Quality of the price. | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **sameQuality** | **Boolean**| Assure that the prices for all notations are of the same quality. | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20082**](InlineResponse20082.md)

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

> InlineResponse20079 getPricesGet(id, quality, attributes, subscriptionMinimumInterval)

Overview of trading on the current trading day, including the latest price, for a notation.

Overview of trading on the current trading day, including the latest price, for a notation.

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
        String id = "id_example"; // String | Identifier of the notation.
        String quality = "RLT"; // String | Quality of the price.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("1000"); // BigDecimal | Minimum number of milliseconds at which updates are sent.
        try {
            InlineResponse20079 result = apiInstance.getPricesGet(id, quality, attributes, subscriptionMinimumInterval);
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
 **id** | **String**| Identifier of the notation. |
 **quality** | **String**| Quality of the price. | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscriptionMinimumInterval** | **BigDecimal**| Minimum number of milliseconds at which updates are sent. | [optional] [default to 5000.0] [enum: 1000, 5000, 10000, 30000, 60000, 300000]

### Return type

[**InlineResponse20079**](InlineResponse20079.md)

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

> InlineResponse20080 getPricesList(ids, quality, sameQuality, attributes)

Overview of trading on the current trading day, including the latest price, for a list of notations.

Overview of trading on the current trading day, including the latest price, for a list of notations.

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of notations.
        String quality = "RLT"; // String | Quality of the price.
        Boolean sameQuality = true; // Boolean | Assure that the prices for all notations are of the same quality.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20080 result = apiInstance.getPricesList(ids, quality, sameQuality, attributes);
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **quality** | **String**| Quality of the price. | [optional] [default to DLY] [enum: RLT, DLY, EOD, BST]
 **sameQuality** | **Boolean**| Assure that the prices for all notations are of the same quality. | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20080**](InlineResponse20080.md)

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

> InlineResponse20083 getPricesOrderbookAggregatedGet(id, quality, attributes)

Orderbook aggregated by price.

Orderbook aggregated by price.

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
        String id = "id_example"; // String | Identifier of the notation.
        String quality = "RLT"; // String | Quality of the price.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20083 result = apiInstance.getPricesOrderbookAggregatedGet(id, quality, attributes);
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
 **id** | **String**| Identifier of the notation. |
 **quality** | **String**| Quality of the price. | [optional] [default to RLT] [enum: RLT, DLY, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20083**](InlineResponse20083.md)

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

> InlineResponse20084 getPricesOrderbookFullGet(id, quality, attributes)

Full orderbook

Full orderbook

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
        String id = "id_example"; // String | Identifier of the notation.
        String quality = "RLT"; // String | Quality of the price.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20084 result = apiInstance.getPricesOrderbookFullGet(id, quality, attributes);
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
 **id** | **String**| Identifier of the notation. |
 **quality** | **String**| Quality of the price. | [optional] [default to RLT] [enum: RLT, DLY, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## getPricesTradingScheduleEventTypeList

> InlineResponse20086 getPricesTradingScheduleEventTypeList(attributes)

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
            InlineResponse20086 result = apiInstance.getPricesTradingScheduleEventTypeList(attributes);
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


## postPricesTradingScheduleEventList

> InlineResponse20085 postPricesTradingScheduleEventList(body)

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
        InlineObject21 body = new InlineObject21(); // InlineObject21 | 
        try {
            InlineResponse20085 result = apiInstance.postPricesTradingScheduleEventList(body);
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
 **body** | [**InlineObject21**](InlineObject21.md)|  |

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

