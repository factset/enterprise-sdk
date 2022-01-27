# CompanyApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyLogoGetByInstrument**](CompanyApi.md#getCompanyLogoGetByInstrument) | **GET** /company/logo/getByInstrument | URLs of company logos.



## getCompanyLogoGetByInstrument

> InlineResponse200 getCompanyLogoGetByInstrument(id, attributes)

URLs of company logos.

URLs of transparent company logos in different sizes. A small square logo is 31x31 pixels. A small rectangular logo has a maximum width of 88 pixels and a maximum height of 31 pixels. A medium or large logo has the size of the small logo scaled up by 200% and 300% respectively. A vector logo can be rendered at any size.

### Example

```java
// Import classes:
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.ApiClient;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.ApiException;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.Configuration;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.auth.*;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.model.*;
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.api.CompanyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.getCompanyLogoGetByInstrument(id, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyLogoGetByInstrument");
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
 **id** | **String**| Identifier of an instrument. |
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

