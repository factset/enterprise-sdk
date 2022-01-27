# RelationshipCategoriesApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1RelationshipCategoriesGet**](RelationshipCategoriesApi.md#v1RelationshipCategoriesGet) | **GET** /v1/relationship-categories | Get list of the relationship categories configured in your group
[**v1RelationshipCategoriesPost**](RelationshipCategoriesApi.md#v1RelationshipCategoriesPost) | **POST** /v1/relationship-categories | Create a relationship category
[**v1RelationshipCategoriesRelationshipCategoryIdDelete**](RelationshipCategoriesApi.md#v1RelationshipCategoriesRelationshipCategoryIdDelete) | **DELETE** /v1/relationship-categories/{relationshipCategoryId} | Delete a relationship category
[**v1RelationshipCategoriesRelationshipCategoryIdPut**](RelationshipCategoriesApi.md#v1RelationshipCategoriesRelationshipCategoryIdPut) | **PUT** /v1/relationship-categories/{relationshipCategoryId} | Edit a relationship category
[**v1RelationshipCategoriesReorderPost**](RelationshipCategoriesApi.md#v1RelationshipCategoriesReorderPost) | **POST** /v1/relationship-categories/reorder | Reorder relationship categories



## v1RelationshipCategoriesGet

> java.util.List&lt;RelationshipCategoryDto&gt; v1RelationshipCategoriesGet()

Get list of the relationship categories configured in your group

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.RelationshipCategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RelationshipCategoriesApi apiInstance = new RelationshipCategoriesApi(defaultClient);
        try {
            java.util.List<RelationshipCategoryDto> result = apiInstance.v1RelationshipCategoriesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipCategoriesApi#v1RelationshipCategoriesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;RelationshipCategoryDto&gt;**](RelationshipCategoryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## v1RelationshipCategoriesPost

> java.util.UUID v1RelationshipCategoriesPost(relationshipCategorySaveDto)

Create a relationship category

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.RelationshipCategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RelationshipCategoriesApi apiInstance = new RelationshipCategoriesApi(defaultClient);
        RelationshipCategorySaveDto relationshipCategorySaveDto = new RelationshipCategorySaveDto(); // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to save
        try {
            java.util.UUID result = apiInstance.v1RelationshipCategoriesPost(relationshipCategorySaveDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipCategoriesApi#v1RelationshipCategoriesPost");
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
 **relationshipCategorySaveDto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to save | [optional]

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |


## v1RelationshipCategoriesRelationshipCategoryIdDelete

> v1RelationshipCategoriesRelationshipCategoryIdDelete(relationshipCategoryId)

Delete a relationship category

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.RelationshipCategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RelationshipCategoriesApi apiInstance = new RelationshipCategoriesApi(defaultClient);
        java.util.UUID relationshipCategoryId = new java.util.UUID(); // java.util.UUID | relationshipCategoryId to delete associated record
        try {
            apiInstance.v1RelationshipCategoriesRelationshipCategoryIdDelete(relationshipCategoryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipCategoriesApi#v1RelationshipCategoriesRelationshipCategoryIdDelete");
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
 **relationshipCategoryId** | **java.util.UUID**| relationshipCategoryId to delete associated record |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |


## v1RelationshipCategoriesRelationshipCategoryIdPut

> v1RelationshipCategoriesRelationshipCategoryIdPut(relationshipCategoryId, relationshipCategorySaveDto)

Edit a relationship category

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.RelationshipCategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RelationshipCategoriesApi apiInstance = new RelationshipCategoriesApi(defaultClient);
        java.util.UUID relationshipCategoryId = new java.util.UUID(); // java.util.UUID | relationshipCategoryId to update associated record
        RelationshipCategorySaveDto relationshipCategorySaveDto = new RelationshipCategorySaveDto(); // RelationshipCategorySaveDto | RelationshipCategorySaveDto object to update
        try {
            apiInstance.v1RelationshipCategoriesRelationshipCategoryIdPut(relationshipCategoryId, relationshipCategorySaveDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipCategoriesApi#v1RelationshipCategoriesRelationshipCategoryIdPut");
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
 **relationshipCategoryId** | **java.util.UUID**| relationshipCategoryId to update associated record |
 **relationshipCategorySaveDto** | [**RelationshipCategorySaveDto**](RelationshipCategorySaveDto.md)| RelationshipCategorySaveDto object to update | [optional]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |


## v1RelationshipCategoriesReorderPost

> v1RelationshipCategoriesReorderPost(relationshipCategoryListDto)

Reorder relationship categories

### Example

```java
// Import classes:
import com.factset.sdk.IRNContacts.ApiClient;
import com.factset.sdk.IRNContacts.ApiException;
import com.factset.sdk.IRNContacts.Configuration;
import com.factset.sdk.IRNContacts.auth.*;
import com.factset.sdk.IRNContacts.model.*;
import com.factset.sdk.IRNContacts.api.RelationshipCategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com/research/irn");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RelationshipCategoriesApi apiInstance = new RelationshipCategoriesApi(defaultClient);
        RelationshipCategoryListDto relationshipCategoryListDto = new RelationshipCategoryListDto(); // RelationshipCategoryListDto | List of Guid
        try {
            apiInstance.v1RelationshipCategoriesReorderPost(relationshipCategoryListDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipCategoriesApi#v1RelationshipCategoriesReorderPost");
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
 **relationshipCategoryListDto** | [**RelationshipCategoryListDto**](RelationshipCategoryListDto.md)| List of Guid | [optional]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

