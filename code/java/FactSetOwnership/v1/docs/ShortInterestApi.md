# ShortInterestApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShortInterest**](ShortInterestApi.md#getShortInterest) | **GET** /short-interest | Gets short interest data for a requested identifier.
[**postShortInterest**](ShortInterestApi.md#postShortInterest) | **POST** /short-interest | Gets short interest data for a requested identifier.



## getShortInterest

> ShortInterestResponse getShortInterest(ids, years)

Gets short interest data for a requested identifier.

Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the `years` parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.ShortInterestApi;

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

        ShortInterestApi apiInstance = new ShortInterestApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested short interest identifier. <p>***id limit** =  1 per request*</p>
        Integer years = 1; // Integer | Number of years of short interest data to include. Specify an integer value from 1 to 10. If the years parameter is provided, the short interest percentage and short interest float percentage will be returned as null, since historical data for this value is not available.
        try {
            ShortInterestResponse result = apiInstance.getShortInterest(ids, years);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ShortInterestApi#getShortInterest");
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
 **ids** | **List&lt;String&gt;**| Requested short interest identifier. &lt;p&gt;***id limit** &#x3D;  1 per request*&lt;/p&gt; |
 **years** | **Integer**| Number of years of short interest data to include. Specify an integer value from 1 to 10. If the years parameter is provided, the short interest percentage and short interest float percentage will be returned as null, since historical data for this value is not available. | [optional]

### Return type

[**ShortInterestResponse**](ShortInterestResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Short Interest Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postShortInterest

> ShortInterestResponse postShortInterest(shortInterestRequest)

Gets short interest data for a requested identifier.

Returns short interest data for the specified security, sourced from NYSE, NASDAQ, and TSX exchanges via FactSet. Data is updated semi-monthly on scheduled dates and times in Eastern Time (ET). Note that the exact update dates may vary slightly due to weekends, market holidays, and other calendar adjustments. If the `years` parameter is provided, the short interest percentage and float percentage value will be returned as null, since historical data for this value is not available.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.ShortInterestApi;

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

        ShortInterestApi apiInstance = new ShortInterestApi(defaultClient);
        ShortInterestRequest shortInterestRequest = new ShortInterestRequest(); // ShortInterestRequest | Requesting short interest data for securities.
        try {
            ShortInterestResponse result = apiInstance.postShortInterest(shortInterestRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ShortInterestApi#postShortInterest");
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
 **shortInterestRequest** | [**ShortInterestRequest**](ShortInterestRequest.md)| Requesting short interest data for securities. |

### Return type

[**ShortInterestResponse**](ShortInterestResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Short Interest Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

