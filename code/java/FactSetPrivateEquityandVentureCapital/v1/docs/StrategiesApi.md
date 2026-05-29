# StrategiesApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityStrategies**](StrategiesApi.md#getEntityStrategies) | **GET** /entities/strategies | Retrieve detailed investment strategy mandates for a specified fund or General Partner.



## getEntityStrategies

> EntityStrategiesResponse getEntityStrategies(ids)

Retrieve detailed investment strategy mandates for a specified fund or General Partner.

Provides a granular breakdown of the defined investment mandate for a fund or General Partner (GP). The strategy is multi-faceted, covering areas such as target **geographic exposure** (region, country, state), preferred **industry/sector** focus, targeted **investment instruments** (e.g., debt, equity, convertible notes), and **control criteria**.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.StrategiesApi;

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

        StrategiesApi apiInstance = new StrategiesApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint
        try {
            EntityStrategiesResponse result = apiInstance.getEntityStrategies(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StrategiesApi#getEntityStrategies");
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
 **ids** | **List&lt;String&gt;**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint |

### Return type

[**EntityStrategiesResponse**](EntityStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

