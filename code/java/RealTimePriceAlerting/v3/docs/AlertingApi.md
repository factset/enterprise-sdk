# AlertingApi

All URIs are relative to *https://api.factset.com/wealth/v3*

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimePriceAlerting.ApiClient;
import com.factset.sdk.RealTimePriceAlerting.ApiException;
import com.factset.sdk.RealTimePriceAlerting.Configuration;
import com.factset.sdk.RealTimePriceAlerting.auth.*;
import com.factset.sdk.RealTimePriceAlerting.models.*;
import com.factset.sdk.RealTimePriceAlerting.api.AlertingApi;

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

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        String id = "4004"; // String | Identifier of the alert.
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

> InlineResponse2001 getAlertingPricesBasicAlertList(attributes, metaSubscriptionMinimumInterval, paginationCursor, paginationLimit)

List of alerts.

List of alerts in descending order of creation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimePriceAlerting.ApiClient;
import com.factset.sdk.RealTimePriceAlerting.ApiException;
import com.factset.sdk.RealTimePriceAlerting.Configuration;
import com.factset.sdk.RealTimePriceAlerting.auth.*;
import com.factset.sdk.RealTimePriceAlerting.models.*;
import com.factset.sdk.RealTimePriceAlerting.api.AlertingApi;

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

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal metaSubscriptionMinimumInterval = new BigDecimal("0"); // BigDecimal | Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately.
        String paginationCursor = "Lorem ipsum"; // String | Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2001 result = apiInstance.getAlertingPricesBasicAlertList(attributes, metaSubscriptionMinimumInterval, paginationCursor, paginationLimit);
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
 **metaSubscriptionMinimumInterval** | **BigDecimal**| Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. | [optional] [default to 0]
 **paginationCursor** | **String**| Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). | [optional]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimePriceAlerting.ApiClient;
import com.factset.sdk.RealTimePriceAlerting.ApiException;
import com.factset.sdk.RealTimePriceAlerting.Configuration;
import com.factset.sdk.RealTimePriceAlerting.auth.*;
import com.factset.sdk.RealTimePriceAlerting.models.*;
import com.factset.sdk.RealTimePriceAlerting.api.AlertingApi;

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

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        String id = "4004"; // String | Identifier of the trigger.
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

> InlineResponse2003 postAlertingPricesBasicTriggerList(postAlertingPricesBasicTriggerListRequest)

List of triggers.

Returns a list of triggers sorted in descending order of creation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimePriceAlerting.ApiClient;
import com.factset.sdk.RealTimePriceAlerting.ApiException;
import com.factset.sdk.RealTimePriceAlerting.Configuration;
import com.factset.sdk.RealTimePriceAlerting.auth.*;
import com.factset.sdk.RealTimePriceAlerting.models.*;
import com.factset.sdk.RealTimePriceAlerting.api.AlertingApi;

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

        AlertingApi apiInstance = new AlertingApi(defaultClient);
        PostAlertingPricesBasicTriggerListRequest postAlertingPricesBasicTriggerListRequest = new PostAlertingPricesBasicTriggerListRequest(); // PostAlertingPricesBasicTriggerListRequest | Request Body
        try {
            InlineResponse2003 result = apiInstance.postAlertingPricesBasicTriggerList(postAlertingPricesBasicTriggerListRequest);
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
 **postAlertingPricesBasicTriggerListRequest** | [**PostAlertingPricesBasicTriggerListRequest**](PostAlertingPricesBasicTriggerListRequest.md)| Request Body | [optional]

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

