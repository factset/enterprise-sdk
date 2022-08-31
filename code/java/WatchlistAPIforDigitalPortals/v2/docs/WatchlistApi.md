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

> InlineResponse2001 getWatchlistGet(id, attributes)

Details of a watchlist.

Details of a watchlist.

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
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2001 result = apiInstance.getWatchlistGet(id, attributes);
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


## getWatchlistList

> InlineResponse2002 getWatchlistList(attributes, sort)

List of watchlists.

List of watchlists.

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
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2002 result = apiInstance.getWatchlistList(attributes, sort);
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


## getWatchlistPositionList

> InlineResponse2005 getWatchlistPositionList(id, attributes, sort)

List of positions of a watchlist.

List of positions of a watchlist.

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
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2005 result = apiInstance.getWatchlistPositionList(id, attributes, sort);
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


## postWatchlistCreate

> InlineResponse201 postWatchlistCreate(inlineObject)

Create a watchlist.

Create a watchlist.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|The number of watchlists would exceed 100.|400 Bad Request|

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
        InlineObject inlineObject = new InlineObject(); // InlineObject | 
        try {
            InlineResponse201 result = apiInstance.postWatchlistCreate(inlineObject);
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

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

> InlineResponse200 postWatchlistDelete(inlineObject1)

Delete a watchlist.

Delete a watchlist.

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
        InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse200 result = apiInstance.postWatchlistDelete(inlineObject1);
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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

> InlineResponse2003 postWatchlistModify(inlineObject2)

Modify a watchlist.

Modify a watchlist.

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
        InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2003 result = apiInstance.postWatchlistModify(inlineObject2);
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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

> InlineResponse2011 postWatchlistPositionCreate(inlineObject3)

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
        InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2011 result = apiInstance.postWatchlistPositionCreate(inlineObject3);
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

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

> InlineResponse2003 postWatchlistPositionDelete(inlineObject4)

Delete a position of a watchlist.

Delete a position of a watchlist.

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
        InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
        try {
            InlineResponse2003 result = apiInstance.postWatchlistPositionDelete(inlineObject4);
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

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

> InlineResponse2004 postWatchlistPositionGet(inlineObject5)

Details of the position of a watchlist.

Details of the position of a watchlist.

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
        InlineObject5 inlineObject5 = new InlineObject5(); // InlineObject5 | 
        try {
            InlineResponse2004 result = apiInstance.postWatchlistPositionGet(inlineObject5);
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

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


## postWatchlistPositionModify

> InlineResponse2003 postWatchlistPositionModify(inlineObject6)

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
        InlineObject6 inlineObject6 = new InlineObject6(); // InlineObject6 | 
        try {
            InlineResponse2003 result = apiInstance.postWatchlistPositionModify(inlineObject6);
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  | [optional]

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

