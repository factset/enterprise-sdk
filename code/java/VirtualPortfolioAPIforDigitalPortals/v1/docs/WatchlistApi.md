# WatchlistApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWatchlistGet**](WatchlistApi.md#getWatchlistGet) | **GET** /watchlist/get | Details of a watchlist.
[**getWatchlistList**](WatchlistApi.md#getWatchlistList) | **GET** /watchlist/list | List of watchlists.
[**getWatchlistPositionList**](WatchlistApi.md#getWatchlistPositionList) | **GET** /watchlist/position/list | List of positions of a watchlist.
[**postWatchlistCreate**](WatchlistApi.md#postWatchlistCreate) | **POST** /watchlist/create | Create a watchlist.
[**postWatchlistDelete**](WatchlistApi.md#postWatchlistDelete) | **POST** /watchlist/delete | Delete a watchlist.
[**postWatchlistModify**](WatchlistApi.md#postWatchlistModify) | **POST** /watchlist/modify | Modify a watchlist.
[**postWatchlistPositionCreate**](WatchlistApi.md#postWatchlistPositionCreate) | **POST** /watchlist/position/create | Add a position to a watchlist.
[**postWatchlistPositionDelete**](WatchlistApi.md#postWatchlistPositionDelete) | **POST** /watchlist/position/delete | Delete a position of a watchlist.
[**postWatchlistPositionGet**](WatchlistApi.md#postWatchlistPositionGet) | **POST** /watchlist/position/get | Details of the position of a watchlist.
[**postWatchlistPositionModify**](WatchlistApi.md#postWatchlistPositionModify) | **POST** /watchlist/position/modify | Modify a position in a watchlist.



## getWatchlistGet

> InlineResponse20012 getWatchlistGet(id, attributes)

Details of a watchlist.

Details of a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20012 result = apiInstance.getWatchlistGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#getWatchlistGet");
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


## getWatchlistList

> InlineResponse20013 getWatchlistList(attributes, sort)

List of watchlists.

List of watchlists.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse20013 result = apiInstance.getWatchlistList(attributes, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#getWatchlistList");
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
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name, numberPositions, -numberPositions, creation, -creation]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getWatchlistPositionList

> InlineResponse20015 getWatchlistPositionList(id, attributes, sort)

List of positions of a watchlist.

List of positions of a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse20015 result = apiInstance.getWatchlistPositionList(id, attributes, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#getWatchlistPositionList");
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
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, notation.id, -notation.id]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postWatchlistCreate

> InlineResponse2013 postWatchlistCreate(inlineObject14)

Create a watchlist.

Create a watchlist.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|The number of watchlists would exceed 100.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject14 inlineObject14 = new InlineObject14(); // InlineObject14 | 
        try {
            InlineResponse2013 result = apiInstance.postWatchlistCreate(inlineObject14);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistCreate");
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
 **inlineObject14** | [**InlineObject14**](InlineObject14.md)|  | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


## postWatchlistDelete

> InlineResponse200 postWatchlistDelete(inlineObject15)

Delete a watchlist.

Delete a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject15 inlineObject15 = new InlineObject15(); // InlineObject15 | 
        try {
            InlineResponse200 result = apiInstance.postWatchlistDelete(inlineObject15);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistDelete");
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
 **inlineObject15** | [**InlineObject15**](InlineObject15.md)|  | [optional]

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


## postWatchlistModify

> InlineResponse2003 postWatchlistModify(inlineObject16)

Modify a watchlist.

Modify a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject16 inlineObject16 = new InlineObject16(); // InlineObject16 | 
        try {
            InlineResponse2003 result = apiInstance.postWatchlistModify(inlineObject16);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistModify");
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
 **inlineObject16** | [**InlineObject16**](InlineObject16.md)|  | [optional]

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


## postWatchlistPositionCreate

> InlineResponse2014 postWatchlistPositionCreate(inlineObject17)

Add a position to a watchlist.

Add a position to a watchlist.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|Maximum number of watchlist positions would exceed 100.|400 Bad Request|
|The watchlist does not exist.|400 Bad Request|
|The notation already exists in the watchlist.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject17 inlineObject17 = new InlineObject17(); // InlineObject17 | 
        try {
            InlineResponse2014 result = apiInstance.postWatchlistPositionCreate(inlineObject17);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistPositionCreate");
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
 **inlineObject17** | [**InlineObject17**](InlineObject17.md)|  | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


## postWatchlistPositionDelete

> InlineResponse2003 postWatchlistPositionDelete(inlineObject18)

Delete a position of a watchlist.

Delete a position of a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject18 inlineObject18 = new InlineObject18(); // InlineObject18 | 
        try {
            InlineResponse2003 result = apiInstance.postWatchlistPositionDelete(inlineObject18);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistPositionDelete");
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
 **inlineObject18** | [**InlineObject18**](InlineObject18.md)|  | [optional]

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


## postWatchlistPositionGet

> InlineResponse20014 postWatchlistPositionGet(inlineObject19)

Details of the position of a watchlist.

Details of the position of a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject19 inlineObject19 = new InlineObject19(); // InlineObject19 | 
        try {
            InlineResponse20014 result = apiInstance.postWatchlistPositionGet(inlineObject19);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistPositionGet");
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
 **inlineObject19** | [**InlineObject19**](InlineObject19.md)|  | [optional]

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


## postWatchlistPositionModify

> InlineResponse2003 postWatchlistPositionModify(inlineObject20)

Modify a position in a watchlist.

Modify a position in a watchlist.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|At least one of the parameters `notation` or `comment` must be set.|400 Bad Request|
|The notation already exists in the watchlist.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

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
        InlineObject20 inlineObject20 = new InlineObject20(); // InlineObject20 | 
        try {
            InlineResponse2003 result = apiInstance.postWatchlistPositionModify(inlineObject20);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling WatchlistApi#postWatchlistPositionModify");
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
 **inlineObject20** | [**InlineObject20**](InlineObject20.md)|  | [optional]

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

