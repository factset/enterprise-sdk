# TermsConditionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTermsAndConditions**](TermsConditionsApi.md#getTermsAndConditions) | **GET** /factset-terms-and-conditions/v1/terms-and-conditions | Return select Terms and Conditions items for a Fixed Income security.
[**getTermsAndConditionsFields**](TermsConditionsApi.md#getTermsAndConditionsFields) | **GET** /factset-terms-and-conditions/v1/fields | Available fields for /terms-and-conditions endpoint
[**getTermsAndConditionsForList**](TermsConditionsApi.md#getTermsAndConditionsForList) | **POST** /factset-terms-and-conditions/v1/terms-and-conditions | Return Terms and Conditions for a list of Fixed Income securities.



## getTermsAndConditions

> TermsAndConditionsResponse getTermsAndConditions(ids, fields, categories)

Return select Terms and Conditions items for a Fixed Income security.

Returns Terms and Conditions data items for the Fixed Income security. Includes items for Conditional Redemptions, Redemption Options, Security Details, and Coupon Details.
Use the `fields` parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s).
<p>*For T&C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.model.*;
import com.factset.sdk.FactSetTermsandConditions.api.TermsConditionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TermsConditionsApi apiInstance = new TermsConditionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
        java.util.List<String> fields = Arrays.asList(); // java.util.List<String> | List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the `/fields` endpoint.
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | Selects the Fixed Income metrics by major category. Use the `/fields` endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options. 
        try {
            TermsAndConditionsResponse result = apiInstance.getTermsAndConditions(ids, fields, categories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TermsConditionsApi#getTermsAndConditions");
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
 **ids** | **List&lt;String&gt;**| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  |
 **fields** | **List&lt;String&gt;**| List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the &#x60;/fields&#x60; endpoint. | [optional]
 **categories** | **List&lt;String&gt;**| Selects the Fixed Income metrics by major category. Use the &#x60;/fields&#x60; endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] [enum: SECURITY_DETAILS, COUPON_DETAILS, CONVERTIBLE_FEATURES, REDEMPTION_OPTIONS]

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terms And Conditions Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getTermsAndConditionsFields

> FieldsResponse getTermsAndConditionsFields(category)

Available fields for /terms-and-conditions endpoint

Returns a list of available fields that can be used in the `fields`
parameter of the **/terms-and-conditions** endpoint.
Leave _category_ blank to request all available items.
Make Note, this does not represent all available fields within the Terms and Conditions API and all other endpoints.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.model.*;
import com.factset.sdk.FactSetTermsandConditions.api.TermsConditionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TermsConditionsApi apiInstance = new TermsConditionsApi(defaultClient);
        String category = "SECURITY_DETAILS"; // String | Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options. 
        try {
            FieldsResponse result = apiInstance.getTermsAndConditionsFields(category);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TermsConditionsApi#getTermsAndConditionsFields");
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
 **category** | **String**| Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional] [enum: SECURITY_DETAILS, COUPON_DETAILS, CONVERTIBLE_FEATURES, REDEMPTION_OPTIONS]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terms And Conditions Fields Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getTermsAndConditionsForList

> TermsAndConditionsResponse getTermsAndConditionsForList(termsAndConditionsRequest)

Return Terms and Conditions for a list of Fixed Income securities.

Returns Terms and Conditions data items for the Fixed Income security. Includes reference items for Conditional Redemptions, Redemption Options, Security Details, Convertible Features, and Coupon Details.
Use the `fields` parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s).
<p>*For T&C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.model.*;
import com.factset.sdk.FactSetTermsandConditions.api.TermsConditionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TermsConditionsApi apiInstance = new TermsConditionsApi(defaultClient);
        TermsAndConditionsRequest termsAndConditionsRequest = new TermsAndConditionsRequest(); // TermsAndConditionsRequest | Request object for Terms And Conditions
        try {
            TermsAndConditionsResponse result = apiInstance.getTermsAndConditionsForList(termsAndConditionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TermsConditionsApi#getTermsAndConditionsForList");
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
 **termsAndConditionsRequest** | [**TermsAndConditionsRequest**](TermsAndConditionsRequest.md)| Request object for Terms And Conditions |

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terms and Conditions Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

