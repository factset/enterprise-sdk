# EntitiesApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postEntitiesEntities**](EntitiesApi.md#postEntitiesEntities) | **POST** /cognitive/ner/v2/entities | 



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

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        EntitiesApi apiInstance = new EntitiesApi(defaultClient);
        Input payload = new Input(); // Input | 
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
 **payload** | [**Input**](Input.md)|  |

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
| **401** | Error: Unauthorized |  -  |
| **500** | Server-side Error |  -  |

