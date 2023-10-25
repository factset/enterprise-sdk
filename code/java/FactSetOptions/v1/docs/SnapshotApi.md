# SnapshotApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsSnapshotForList**](SnapshotApi.md#getOptionsSnapshotForList) | **POST** /factset-options/v1/snapshot | Returns all the profile information for the list of identifiers as of a specific date



## getOptionsSnapshotForList

> SnapshotResponse getOptionsSnapshotForList(snapshotRequest)

Returns all the profile information for the list of identifiers as of a specific date

Returns all the profile information for the list of identifiers for a specific date. The data includes - 
* Expiration Date
* Greek - Delta
* Implied Volatility
* Price 
* Style
* Type
* Underlying Security
* Underlying Security Price
* Open Interest
* Name

  *Currently only OPRA Exchange is supported with exchange ISO "USA"*


### Example

```java
// Import classes:
import com.factset.sdk.FactSetOptions.ApiClient;
import com.factset.sdk.FactSetOptions.ApiException;
import com.factset.sdk.FactSetOptions.Configuration;
import com.factset.sdk.FactSetOptions.auth.*;
import com.factset.sdk.FactSetOptions.models.*;
import com.factset.sdk.FactSetOptions.api.SnapshotApi;

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

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        SnapshotRequest snapshotRequest = new SnapshotRequest(); // SnapshotRequest | Snapshot Request Object
        try {
            SnapshotResponse result = apiInstance.getOptionsSnapshotForList(snapshotRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#getOptionsSnapshotForList");
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
 **snapshotRequest** | [**SnapshotRequest**](SnapshotRequest.md)| Snapshot Request Object |

### Return type

[**SnapshotResponse**](SnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Snapshot Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

