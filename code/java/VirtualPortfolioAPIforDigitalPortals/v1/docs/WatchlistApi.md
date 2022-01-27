# WatchlistApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**watchlistCreatePost**](WatchlistApi.md#watchlistCreatePost) | **POST** /watchlist/create | Create a watchlist.
[**watchlistDeletePost**](WatchlistApi.md#watchlistDeletePost) | **POST** /watchlist/delete | Delete a watchlist.
[**watchlistListGet**](WatchlistApi.md#watchlistListGet) | **GET** /watchlist/list | List of watchlists.
[**watchlistModifyPost**](WatchlistApi.md#watchlistModifyPost) | **POST** /watchlist/modify | Modify a watchlist.
[**watchlistPositionCreatePost**](WatchlistApi.md#watchlistPositionCreatePost) | **POST** /watchlist/position/create | Add a position to a watchlist.
[**watchlistPositionDeletePost**](WatchlistApi.md#watchlistPositionDeletePost) | **POST** /watchlist/position/delete | Delete a position of a watchlist.
[**watchlistPositionListGet**](WatchlistApi.md#watchlistPositionListGet) | **GET** /watchlist/position/list | List of positions of a watchlist.
[**watchlistPositionModifyPost**](WatchlistApi.md#watchlistPositionModifyPost) | **POST** /watchlist/position/modify | Modify a position in a watchlist.



## watchlistCreatePost

> InlineResponse2012 watchlistCreatePost(body)

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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject9 body = new InlineObject9(); // InlineObject9 | 
        try {
            InlineResponse2012 result = apiInstance.watchlistCreatePost(body);
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
 **body** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


## watchlistDeletePost

> InlineResponse200 watchlistDeletePost(body)

Delete a watchlist.

Delete a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject10 body = new InlineObject10(); // InlineObject10 | 
        try {
            InlineResponse200 result = apiInstance.watchlistDeletePost(body);
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
 **body** | [**InlineObject10**](InlineObject10.md)|  | [optional]

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


## watchlistListGet

> InlineResponse20010 watchlistListGet(attributes, sort)

List of watchlists.

List of watchlists.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse20010 result = apiInstance.watchlistListGet(attributes, sort);
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
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name, numberPositions, -numberPositions, creation, -creation]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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

> InlineResponse2003 watchlistModifyPost(body)

Modify a watchlist.

Modify a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject11 body = new InlineObject11(); // InlineObject11 | 
        try {
            InlineResponse2003 result = apiInstance.watchlistModifyPost(body);
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
 **body** | [**InlineObject11**](InlineObject11.md)|  | [optional]

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


## watchlistPositionCreatePost

> InlineResponse2013 watchlistPositionCreatePost(body)

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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject12 body = new InlineObject12(); // InlineObject12 | 
        try {
            InlineResponse2013 result = apiInstance.watchlistPositionCreatePost(body);
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
 **body** | [**InlineObject12**](InlineObject12.md)|  | [optional]

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


## watchlistPositionDeletePost

> InlineResponse2003 watchlistPositionDeletePost(body)

Delete a position of a watchlist.

Delete a position of a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject13 body = new InlineObject13(); // InlineObject13 | 
        try {
            InlineResponse2003 result = apiInstance.watchlistPositionDeletePost(body);
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
 **body** | [**InlineObject13**](InlineObject13.md)|  | [optional]

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


## watchlistPositionListGet

> InlineResponse20011 watchlistPositionListGet(id, attributes, sort)

List of positions of a watchlist.

List of positions of a watchlist.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        String id = "id_example"; // String | Identifier of the watchlist.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse20011 result = apiInstance.watchlistPositionListGet(id, attributes, sort);
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
 **id** | **String**| Identifier of the watchlist. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, notation.id, -notation.id]

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


## watchlistPositionModifyPost

> InlineResponse2003 watchlistPositionModifyPost(body)

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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.model.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.WatchlistApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api-sandbox.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        WatchlistApi apiInstance = new WatchlistApi(defaultClient);
        InlineObject14 body = new InlineObject14(); // InlineObject14 | 
        try {
            InlineResponse2003 result = apiInstance.watchlistPositionModifyPost(body);
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
 **body** | [**InlineObject14**](InlineObject14.md)|  | [optional]

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

