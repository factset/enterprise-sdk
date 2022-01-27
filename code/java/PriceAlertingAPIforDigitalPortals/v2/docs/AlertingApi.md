# AlertingApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertingPricesBasicAlertGet**](AlertingApi.md#getAlertingPricesBasicAlertGet) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
[**getAlertingPricesBasicAlertList**](AlertingApi.md#getAlertingPricesBasicAlertList) | **GET** /alerting/prices/basic/alert/list | List of alerts.
[**getAlertingPricesBasicTriggerGet**](AlertingApi.md#getAlertingPricesBasicTriggerGet) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
[**postAlertingPricesBasicTriggerList**](AlertingApi.md#postAlertingPricesBasicTriggerList) | **POST** /alerting/prices/basic/trigger/list | List of triggers.



## getAlertingPricesBasicAlertGet

> InlineResponse200 getAlertingPricesBasicAlertGet(id, attributes)

Details of an alert.

Details of an alert. The details include the trigger definition at the time of alert creation.

### Example

```java
// Import classes:
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiClient;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiException;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.Configuration;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.auth.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.model.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.api.AlertingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        String id = "id_example"; // String | Identifier of the alert.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.getAlertingPricesBasicAlertGet(id, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingApi#getAlertingPricesBasicAlertGet");
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
 **id** | **String**| Identifier of the alert. |
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


## getAlertingPricesBasicAlertList

> InlineResponse2001 getAlertingPricesBasicAlertList(attributes, subscriptionMinimumInterval, paginationCursor, paginationLimit)

List of alerts.

List of alerts in descending order of creation.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiClient;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiException;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.Configuration;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.auth.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.model.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.api.AlertingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal subscriptionMinimumInterval = new BigDecimal("0.0"); // BigDecimal | Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately.
        String paginationCursor = "paginationCursor_example"; // String | Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2001 result = apiInstance.getAlertingPricesBasicAlertList(attributes, subscriptionMinimumInterval, paginationCursor, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingApi#getAlertingPricesBasicAlertList");
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
 **subscriptionMinimumInterval** | **BigDecimal**| Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. | [optional] [default to 0.0]
 **paginationCursor** | **String**| Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). | [optional]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## getAlertingPricesBasicTriggerGet

> InlineResponse2002 getAlertingPricesBasicTriggerGet(id, attributes)

Details of a trigger.

Details of a trigger.

### Example

```java
// Import classes:
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiClient;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiException;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.Configuration;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.auth.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.model.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.api.AlertingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        String id = "id_example"; // String | Identifier of the trigger.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2002 result = apiInstance.getAlertingPricesBasicTriggerGet(id, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingApi#getAlertingPricesBasicTriggerGet");
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
 **id** | **String**| Identifier of the trigger. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## postAlertingPricesBasicTriggerList

> InlineResponse2003 postAlertingPricesBasicTriggerList(body)

List of triggers.

Returns a list of triggers sorted in descending order of creation.

### Example

```java
// Import classes:
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiClient;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.ApiException;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.Configuration;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.auth.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.model.*;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.api.AlertingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2003 result = apiInstance.postAlertingPricesBasicTriggerList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingApi#postAlertingPricesBasicTriggerList");
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
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

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

