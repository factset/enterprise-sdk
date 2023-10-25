# FactSetIdLookupApi

All URIs are relative to *https://api.factset.com/idsearch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchCompanyname**](FactSetIdLookupApi.md#searchCompanyname) | **POST** /v1/idsearch | Search funtionality to return tickers, company names and unique identifiers for FactSet data



## searchCompanyname

> LookupResponse searchCompanyname(lookupRequest)

Search funtionality to return tickers, company names and unique identifiers for FactSet data

Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request.


### Example

```java
// Import classes:
import com.factset.sdk.IDLookup.ApiClient;
import com.factset.sdk.IDLookup.ApiException;
import com.factset.sdk.IDLookup.Configuration;
import com.factset.sdk.IDLookup.auth.*;
import com.factset.sdk.IDLookup.models.*;
import com.factset.sdk.IDLookup.api.FactSetIdLookupApi;

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

        FactSetIdLookupApi apiInstance = new FactSetIdLookupApi(defaultClient);
        LookupRequest lookupRequest = new LookupRequest(); // LookupRequest | Post body to lookup any FactSet identifiers
        try {
            LookupResponse result = apiInstance.searchCompanyname(lookupRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FactSetIdLookupApi#searchCompanyname");
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
 **lookupRequest** | [**LookupRequest**](LookupRequest.md)| Post body to lookup any FactSet identifiers |

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of securities |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication issue |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error. |  -  |

