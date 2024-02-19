# RedemptionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFixedIncomeRedemptionPrices**](RedemptionsApi.md#getFixedIncomeRedemptionPrices) | **GET** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a Fixed Income security.
[**getFixedIncomeRedemptionPricesForList**](RedemptionsApi.md#getFixedIncomeRedemptionPricesForList) | **POST** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a list of Fixed Income securities.



## getFixedIncomeRedemptionPrices

> RedemptionPricesResponse getFixedIncomeRedemptionPrices(ids, categories)

Return Redemption Prices for a Fixed Income security.

Returns Redemption Prices for the Fixed Income security.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.models.*;
import com.factset.sdk.FactSetTermsandConditions.api.RedemptionsApi;

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

        RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
        String categories = "ALL"; // String | Filters the list of Redemption Prices Categories -   * **CALL** = Call prices.   * **PUT** = Put prices.   * **SF** = Sinking Fund prices. 
        try {
            RedemptionPricesResponse result = apiInstance.getFixedIncomeRedemptionPrices(ids, categories);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RedemptionsApi#getFixedIncomeRedemptionPrices");
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
 **categories** | **String**| Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  | [default to ALL] [enum: ALL, CALL, PUT, SF]

### Return type

[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Negative Redemption Prices Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFixedIncomeRedemptionPricesForList

> RedemptionPricesResponse getFixedIncomeRedemptionPricesForList(redemptionPricesRequest)

Return Redemption Prices for a list of Fixed Income securities.

Returns Redemption Prices for a list of Fixed Income securities.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetTermsandConditions.ApiClient;
import com.factset.sdk.FactSetTermsandConditions.ApiException;
import com.factset.sdk.FactSetTermsandConditions.Configuration;
import com.factset.sdk.FactSetTermsandConditions.auth.*;
import com.factset.sdk.FactSetTermsandConditions.models.*;
import com.factset.sdk.FactSetTermsandConditions.api.RedemptionsApi;

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

        RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
        RedemptionPricesRequest redemptionPricesRequest = new RedemptionPricesRequest(); // RedemptionPricesRequest | Request object for Fixed Income Redemption Prices.
        try {
            RedemptionPricesResponse result = apiInstance.getFixedIncomeRedemptionPricesForList(redemptionPricesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RedemptionsApi#getFixedIncomeRedemptionPricesForList");
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
 **redemptionPricesRequest** | [**RedemptionPricesRequest**](RedemptionPricesRequest.md)| Request object for Fixed Income Redemption Prices. |

### Return type

[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Negative Redemption Prices Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

