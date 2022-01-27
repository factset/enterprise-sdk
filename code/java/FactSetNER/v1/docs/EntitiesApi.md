# EntitiesApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postEntitiesEntities**](EntitiesApi.md#postEntitiesEntities) | **POST** /cognitive/ner/v1/entities | 



## postEntitiesEntities

> Response postEntitiesEntities(payload)



Extract named entities from document text.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetNER.ApiClient;
import com.factset.sdk.FactSetNER.ApiException;
import com.factset.sdk.FactSetNER.Configuration;
import com.factset.sdk.FactSetNER.auth.*;
import com.factset.sdk.FactSetNER.model.*;
import com.factset.sdk.FactSetNER.api.EntitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-sandbox.factset.com");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        EntitiesApi apiInstance = new EntitiesApi(defaultClient);
        Request payload = new Request(); // Request | 
        try {
            Response result = apiInstance.postEntitiesEntities(payload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#postEntitiesEntities");
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
 **payload** | [**Request**](Request.md)|  | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Server-side Error |  -  |

