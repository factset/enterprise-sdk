# IdentifiersApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIdentifiers**](IdentifiersApi.md#getIdentifiers) | **GET** /v1/identifiers | Get all the identifier details for given identifiers



## getIdentifiers

> java.util.List&lt;IdentifierResolutionDto&gt; getIdentifiers(identifiers)

Get all the identifier details for given identifiers

### Example

```java
// Import classes:
import com.factset.sdk.IRNMeetings.ApiClient;
import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Configuration;
import com.factset.sdk.IRNMeetings.auth.*;
import com.factset.sdk.IRNMeetings.model.*;
import com.factset.sdk.IRNMeetings.api.IdentifiersApi;

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

        IdentifiersApi apiInstance = new IdentifiersApi(defaultClient);
        String identifiers = "identifiers_example"; // String | Identifiers
        try {
            java.util.List<IdentifierResolutionDto> result = apiInstance.getIdentifiers(identifiers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifiersApi#getIdentifiers");
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
 **identifiers** | **String**| Identifiers | [optional]

### Return type

[**java.util.List&lt;IdentifierResolutionDto&gt;**](IdentifierResolutionDto.md)

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

