# DataItemsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFields**](DataItemsApi.md#getFields) | **GET** /factset-private-markets/v1/fields | Available private company fields, metrics, and ratios.



## getFields

> FieldsResponse getFields(category)

Available private company fields, metrics, and ratios.

Returns list of available Private Company fields that can be used in the `fields` parameter of related endpoints. These are related to FactSet Private Company standardized data.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrivateMarkets.ApiClient;
import com.factset.sdk.FactSetPrivateMarkets.ApiException;
import com.factset.sdk.FactSetPrivateMarkets.Configuration;
import com.factset.sdk.FactSetPrivateMarkets.auth.*;
import com.factset.sdk.FactSetPrivateMarkets.models.*;
import com.factset.sdk.FactSetPrivateMarkets.api.DataItemsApi;

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

        DataItemsApi apiInstance = new DataItemsApi(defaultClient);
        String category = "FINANCIALS"; // String | Filters the list of available fields per endpoint  -   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA.   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List. 
        try {
            FieldsResponse result = apiInstance.getFields(category);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DataItemsApi#getFields");
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
 **category** | **String**| Filters the list of available fields per endpoint  -   * **FINANCIALS** &#x3D; Financials endpoint data items, such as Assets, Liabilities, and EBITDA.   * **NON_PERIODIC** &#x3D; Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List.  | [optional] [enum: FINANCIALS, NON_PERIODIC]

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
| **200** | Private Company data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

