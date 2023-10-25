# CouponsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCouponHistory**](CouponsApi.md#getCouponHistory) | **GET** /factset-terms-and-conditions/v1/coupon-history | Return historical Coupon information for a Fixed Income security.
[**getCouponHistoryForList**](CouponsApi.md#getCouponHistoryForList) | **POST** /factset-terms-and-conditions/v1/coupon-history | Return historical Coupon information for a list of Fixed Income securities.
[**getCouponSchedules**](CouponsApi.md#getCouponSchedules) | **GET** /factset-terms-and-conditions/v1/coupon-schedules | Return Coupon Sechedules for a Fixed Income security.
[**getCouponSchedulesForList**](CouponsApi.md#getCouponSchedulesForList) | **POST** /factset-terms-and-conditions/v1/coupon-schedules | Return Coupon Schedules information for a list of Fixed Income securities.



## getCouponHistory

> CouponHistoryResponse getCouponHistory(ids)

Return historical Coupon information for a Fixed Income security.

Returns historical Coupon information for the Fixed Income security.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.models.*;
import com.factset.sdk.FactSetTermsandConditions.api.CouponsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
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

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
        try {
            CouponHistoryResponse result = apiInstance.getCouponHistory(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CouponsApi#getCouponHistory");
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

### Return type

[**CouponHistoryResponse**](CouponHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon History Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCouponHistoryForList

> CouponHistoryResponse getCouponHistoryForList(termsAndConditionsScalarRequest)

Return historical Coupon information for a list of Fixed Income securities.

Returns historical Coupon information for a list of Fixed Income securities.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.models.*;
import com.factset.sdk.FactSetTermsandConditions.api.CouponsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
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

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        TermsAndConditionsScalarRequest termsAndConditionsScalarRequest = new TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Coupon History.
        try {
            CouponHistoryResponse result = apiInstance.getCouponHistoryForList(termsAndConditionsScalarRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CouponsApi#getCouponHistoryForList");
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Coupon History. |

### Return type

[**CouponHistoryResponse**](CouponHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon History Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCouponSchedules

> CouponSchedulesResponse getCouponSchedules(ids)

Return Coupon Sechedules for a Fixed Income security.

Returns Coupon Schedules information for the Fixed Income security.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.models.*;
import com.factset.sdk.FactSetTermsandConditions.api.CouponsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
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

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
        try {
            CouponSchedulesResponse result = apiInstance.getCouponSchedules(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CouponsApi#getCouponSchedules");
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

### Return type

[**CouponSchedulesResponse**](CouponSchedulesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon Schedules Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCouponSchedulesForList

> CouponSchedulesResponse getCouponSchedulesForList(termsAndConditionsScalarRequest)

Return Coupon Schedules information for a list of Fixed Income securities.

Returns historical Coupon Schedules information for a list of Fixed Income securities.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.models.*;
import com.factset.sdk.FactSetTermsandConditions.api.CouponsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
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

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        TermsAndConditionsScalarRequest termsAndConditionsScalarRequest = new TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Coupon Schedules.
        try {
            CouponSchedulesResponse result = apiInstance.getCouponSchedulesForList(termsAndConditionsScalarRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CouponsApi#getCouponSchedulesForList");
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Coupon Schedules. |

### Return type

[**CouponSchedulesResponse**](CouponSchedulesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon Schedules Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

