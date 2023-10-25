# NonPeriodicApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNonPeriodic**](NonPeriodicApi.md#getNonPeriodic) | **GET** /factset-private-markets/v1/non-periodic | Returns Private Company reference data for a list of ids.
[**getNonPeriodicForList**](NonPeriodicApi.md#getNonPeriodicForList) | **POST** /factset-private-markets/v1/non-periodic | Returns Private Company reference data for a list of ids.



## getNonPeriodic

> NonPeriodicResponse getNonPeriodic(ids, fields)

Returns Private Company reference data for a list of ids.

Returns Private Company reference information.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrivateMarkets.ApiClient;
import com.factset.sdk.FactSetPrivateMarkets.ApiException;
import com.factset.sdk.FactSetPrivateMarkets.Configuration;
import com.factset.sdk.FactSetPrivateMarkets.auth.*;
import com.factset.sdk.FactSetPrivateMarkets.models.*;
import com.factset.sdk.FactSetPrivateMarkets.api.NonPeriodicApi;

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

        NonPeriodicApi apiInstance = new NonPeriodicApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested FactSet Private Market Entity Identifier in XXXXXX-E format.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
        java.util.List<String> fields = Arrays.asList(); // java.util.List<String> | Private Markets Non-Periodic Fields. 
        try {
            NonPeriodicResponse result = apiInstance.getNonPeriodic(ids, fields);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NonPeriodicApi#getNonPeriodic");
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
 **ids** | **List&lt;String&gt;**| The requested FactSet Private Market Entity Identifier in XXXXXX-E format.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **fields** | **List&lt;String&gt;**| Private Markets Non-Periodic Fields.  |

### Return type

[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Private Company reference data for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getNonPeriodicForList

> NonPeriodicResponse getNonPeriodicForList(nonPeriodicRequest)

Returns Private Company reference data for a list of ids.

Returns a private markets reference object for the requested ids.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPrivateMarkets.ApiClient;
import com.factset.sdk.FactSetPrivateMarkets.ApiException;
import com.factset.sdk.FactSetPrivateMarkets.Configuration;
import com.factset.sdk.FactSetPrivateMarkets.auth.*;
import com.factset.sdk.FactSetPrivateMarkets.models.*;
import com.factset.sdk.FactSetPrivateMarkets.api.NonPeriodicApi;

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

        NonPeriodicApi apiInstance = new NonPeriodicApi(defaultClient);
        NonPeriodicRequest nonPeriodicRequest = new NonPeriodicRequest(); // NonPeriodicRequest | Request Body to request a list of Private Market non-periodic objects.
        try {
            NonPeriodicResponse result = apiInstance.getNonPeriodicForList(nonPeriodicRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NonPeriodicApi#getNonPeriodicForList");
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
 **nonPeriodicRequest** | [**NonPeriodicRequest**](NonPeriodicRequest.md)| Request Body to request a list of Private Market non-periodic objects. |

### Return type

[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Private Company Reference data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

