# CheckCaccessApi

All URIs are relative to *https://api.factset.com/services/off-platform-integrations-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCACCESS**](CheckCaccessApi.md#checkCACCESS) | **POST** /check-caccess | Check access for a list of encrypted CACCESS codes



## checkCACCESS

> AccessCheckResponse checkCACCESS(accessCheckRequest)

Check access for a list of encrypted CACCESS codes

Accepts an array of up to 25 encrypted CACCESS codes in 'data' and returns an array of result objects. On successful decryption of all codes, returns 200 with each result containing the encrypted code and a boolean 'hasAccess'. If decryption fails for any code, returns 400 with an 'errors' array containing the decryption errors and, if any codes decrypted successfully, a 'data' array with those results. Returns 400 with an 'errors' envelope for malformed input or if more than 25 codes are submitted, and 401 if the user is not authenticated.

Each CACCESS code must be encrypted using **AES-256-CBC** before being sent. To obtain the encryption key and integration guidance, contact [research-integrations-dev@factset.com](mailto:research-integrations-dev@factset.com).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OffPlatformIntegrations.ApiClient;
import com.factset.sdk.OffPlatformIntegrations.ApiException;
import com.factset.sdk.OffPlatformIntegrations.Configuration;
import com.factset.sdk.OffPlatformIntegrations.auth.*;
import com.factset.sdk.OffPlatformIntegrations.models.*;
import com.factset.sdk.OffPlatformIntegrations.api.CheckCaccessApi;

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

        CheckCaccessApi apiInstance = new CheckCaccessApi(defaultClient);
        AccessCheckRequest accessCheckRequest = new AccessCheckRequest(); // AccessCheckRequest | 
        try {
            AccessCheckResponse result = apiInstance.checkCACCESS(accessCheckRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CheckCaccessApi#checkCACCESS");
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
 **accessCheckRequest** | [**AccessCheckRequest**](AccessCheckRequest.md)|  |

### Return type

[**AccessCheckResponse**](AccessCheckResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All codes decrypted successfully. Returns a list of encrypted CACCESS codes and their access status. |  * api-version -  <br>  |
| **400** | Bad Request - either the request body is malformed/missing, more than 25 codes were submitted, or one or more codes could not be decrypted. Validation errors return an &#39;errors&#39; envelope; decryption failures return an &#39;errors&#39; array containing decryption errors and, if any codes decrypted successfully, a &#39;data&#39; array with those results. |  * api-version -  <br>  |
| **401** | Unauthenticated - authentication credentials are missing or invalid |  * api-version -  <br>  |
| **403** | Forbidden - authenticated user does not have the required access |  * api-version -  <br>  |
| **408** | Request Timeout - the request body took too long to arrive (limit: 10s) |  * api-version -  <br>  |
| **500** | Internal Server Error |  * api-version -  <br>  |
| **503** | Service Unavailable - request processing timed out (limit: 25s) |  * api-version -  <br>  |

