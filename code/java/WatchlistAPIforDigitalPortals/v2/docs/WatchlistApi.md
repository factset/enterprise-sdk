# WatchlistApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**watchlistCreatePost**](WatchlistApi.md#watchlistCreatePost) | **POST** /watchlist/create | Create watchlist.
[**watchlistDeletePost**](WatchlistApi.md#watchlistDeletePost) | **POST** /watchlist/delete | The endpoint deletes a watchlist.
[**watchlistListGet**](WatchlistApi.md#watchlistListGet) | **GET** /watchlist/list | List watchlists.
[**watchlistModifyPost**](WatchlistApi.md#watchlistModifyPost) | **POST** /watchlist/modify | Rename a watchlist.
[**watchlistPositionCreatePost**](WatchlistApi.md#watchlistPositionCreatePost) | **POST** /watchlist/position/create | Add position in watchlist.
[**watchlistPositionDeletePost**](WatchlistApi.md#watchlistPositionDeletePost) | **POST** /watchlist/position/delete | Add position in watchlist.
[**watchlistPositionListGet**](WatchlistApi.md#watchlistPositionListGet) | **GET** /watchlist/position/list | List positions of watchlist.
[**watchlistPositionModifyPost**](WatchlistApi.md#watchlistPositionModifyPost) | **POST** /watchlist/position/modify | Add position in watchlist.



## watchlistCreatePost

> InlineResponse200 watchlistCreatePost(body)

Create watchlist.

The endpoint creates a new watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse200 result = apiInstance.watchlistCreatePost(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistCreatePost");
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


## watchlistDeletePost

> InlineResponse2001 watchlistDeletePost(body)

The endpoint deletes a watchlist.

The endpoint deletes a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject1 body = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2001 result = apiInstance.watchlistDeletePost(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistDeletePost");
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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


## watchlistListGet

> InlineResponse2002 watchlistListGet(attributes, sort, paginationOffset, paginationLimit)

List watchlists.

The endpoint lists all watchlist of a user.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2002 result = apiInstance.watchlistListGet(attributes, sort, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistListGet");
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
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: name, -name, amount, -amount]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## watchlistModifyPost

> InlineResponse200 watchlistModifyPost(body)

Rename a watchlist.

The endpoint renames a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject2 body = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse200 result = apiInstance.watchlistModifyPost(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistModifyPost");
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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


## watchlistPositionCreatePost

> InlineResponse2003 watchlistPositionCreatePost(body)

Add position in watchlist.

The endpoint adds a new position in a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject3 body = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2003 result = apiInstance.watchlistPositionCreatePost(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistPositionCreatePost");
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
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional]

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


## watchlistPositionDeletePost

> InlineResponse200 watchlistPositionDeletePost(body)

Add position in watchlist.

The endpoint deletes a position in a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject4 body = new InlineObject4(); // InlineObject4 | 
        try {
            InlineResponse200 result = apiInstance.watchlistPositionDeletePost(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistPositionDeletePost");
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
 **body** | [**InlineObject4**](InlineObject4.md)|  | [optional]

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


## watchlistPositionListGet

> InlineResponse2004 watchlistPositionListGet(name, attributes, sort, paginationOffset, paginationLimit)

List positions of watchlist.

The endpoint lists the positions of a watchlist.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        String name = "name_example"; // String | Name of watchlist
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2004 result = apiInstance.watchlistPositionListGet(name, attributes, sort, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistPositionListGet");
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
 **name** | **String**| Name of watchlist |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, notation, -notation]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## watchlistPositionModifyPost

> InlineResponse200 watchlistPositionModifyPost(body)

Add position in watchlist.

The endpoint modifies a position in a watchlist. All properties except the position id are modifiable by the endpoint.

### Example

```java
// Import classes:
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiClient;
import com.factset.sdk.WatchlistAPIforDigitalPortals.ApiException;
import com.factset.sdk.WatchlistAPIforDigitalPortals.Configuration;
import com.factset.sdk.WatchlistAPIforDigitalPortals.auth.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.models.*;
import com.factset.sdk.WatchlistAPIforDigitalPortals.api.WatchlistApi;

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

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject5 body = new InlineObject5(); // InlineObject5 | 
        try {
            InlineResponse200 result = apiInstance.watchlistPositionModifyPost(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#watchlistPositionModifyPost");
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
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional]

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

