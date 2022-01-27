# UserManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelIndividualPost**](UserManagementApi.md#cancelIndividualPost) | **POST** /cancelIndividual | Cancels an individual&#39;s serial and all productIds
[**createIndividualPost**](UserManagementApi.md#createIndividualPost) | **POST** /createIndividual | Provisions an individual for FactSet
[**getIndividualGet**](UserManagementApi.md#getIndividualGet) | **GET** /getIndividual | Returns an individual&#39;s details by uniqueId
[**listIndividualsGet**](UserManagementApi.md#listIndividualsGet) | **GET** /listIndividuals | Lists all individuals with details at all locations.
[**modifyIndividualPost**](UserManagementApi.md#modifyIndividualPost) | **POST** /modifyIndividual | Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.



## cancelIndividualPost

> InlineResponse202 cancelIndividualPost(cancelIndividual)

Cancels an individual&#39;s serial and all productIds

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.auth.*;
import com.factset.sdk.ProcuretoPayProvisioning.model.*;
import com.factset.sdk.ProcuretoPayProvisioning.api.UserManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/procuretopay/provisioning");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserManagementApi apiInstance = new UserManagementApi(defaultClient);
        CancelIndividual cancelIndividual = new CancelIndividual(); // CancelIndividual | 
        try {
            InlineResponse202 result = apiInstance.cancelIndividualPost(cancelIndividual);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementApi#cancelIndividualPost");
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
 **cancelIndividual** | [**CancelIndividual**](CancelIndividual.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## createIndividualPost

> InlineResponse202 createIndividualPost(createIndividual)

Provisions an individual for FactSet

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.auth.*;
import com.factset.sdk.ProcuretoPayProvisioning.model.*;
import com.factset.sdk.ProcuretoPayProvisioning.api.UserManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/procuretopay/provisioning");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserManagementApi apiInstance = new UserManagementApi(defaultClient);
        CreateIndividual createIndividual = new CreateIndividual(); // CreateIndividual | 
        try {
            InlineResponse202 result = apiInstance.createIndividualPost(createIndividual);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementApi#createIndividualPost");
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
 **createIndividual** | [**CreateIndividual**](CreateIndividual.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## getIndividualGet

> GetIndividual getIndividualGet(uniqueid)

Returns an individual&#39;s details by uniqueId

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.auth.*;
import com.factset.sdk.ProcuretoPayProvisioning.model.*;
import com.factset.sdk.ProcuretoPayProvisioning.api.UserManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/procuretopay/provisioning");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserManagementApi apiInstance = new UserManagementApi(defaultClient);
        String uniqueid = "jdoe113901"; // String | uniqueId to query
        try {
            GetIndividual result = apiInstance.getIndividualGet(uniqueid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementApi#getIndividualGet");
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
 **uniqueid** | **String**| uniqueId to query |

### Return type

[**GetIndividual**](GetIndividual.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## listIndividualsGet

> java.util.List&lt;Object&gt; listIndividualsGet(includeProductIds)

Lists all individuals with details at all locations.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.auth.*;
import com.factset.sdk.ProcuretoPayProvisioning.model.*;
import com.factset.sdk.ProcuretoPayProvisioning.api.UserManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/procuretopay/provisioning");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserManagementApi apiInstance = new UserManagementApi(defaultClient);
        Boolean includeProductIds = true; // Boolean | <br>Optional, if =TRUE will return additional product array per object with all productIds for all returned individuals.</br>
        try {
            java.util.List<Object> result = apiInstance.listIndividualsGet(includeProductIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementApi#listIndividualsGet");
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
 **includeProductIds** | **Boolean**| &lt;br&gt;Optional, if &#x3D;TRUE will return additional product array per object with all productIds for all returned individuals.&lt;/br&gt; | [optional]

### Return type

**java.util.List&lt;Object&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |


## modifyIndividualPost

> InlineResponse202 modifyIndividualPost(modifyIndividual)

Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.

### Example

```java
// Import classes:
import com.factset.sdk.ProcuretoPayProvisioning.ApiClient;
import com.factset.sdk.ProcuretoPayProvisioning.ApiException;
import com.factset.sdk.ProcuretoPayProvisioning.Configuration;
import com.factset.sdk.ProcuretoPayProvisioning.auth.*;
import com.factset.sdk.ProcuretoPayProvisioning.model.*;
import com.factset.sdk.ProcuretoPayProvisioning.api.UserManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/procuretopay/provisioning");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        UserManagementApi apiInstance = new UserManagementApi(defaultClient);
        ModifyIndividual modifyIndividual = new ModifyIndividual(); // ModifyIndividual | 
        try {
            InlineResponse202 result = apiInstance.modifyIndividualPost(modifyIndividual);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserManagementApi#modifyIndividualPost");
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
 **modifyIndividual** | [**ModifyIndividual**](ModifyIndividual.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json; charset=utf-8, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

