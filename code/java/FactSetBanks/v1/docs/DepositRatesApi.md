# DepositRatesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRates**](DepositRatesApi.md#getRates) | **POST** /deposit-rates | Returns deposit rates



## getRates

> RatesResponse getRates(ratesRequest)

Returns deposit rates

Returns current and historical deposit rates from US banks and credit unions — APY, previous APY, national APY averages, terms, and minimum balances — across CD, Savings, Interest Checking, Money Market, Fixed IRA, and Variable IRA products. Identifies where banks offer better rates than geographic competitors.

Covers 500+ financial institutions (US banks, credit unions, internet banks); 40+ data items.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetBanks.ApiClient;
import com.factset.sdk.FactSetBanks.ApiException;
import com.factset.sdk.FactSetBanks.Configuration;
import com.factset.sdk.FactSetBanks.auth.*;
import com.factset.sdk.FactSetBanks.models.*;
import com.factset.sdk.FactSetBanks.api.DepositRatesApi;

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

        DepositRatesApi apiInstance = new DepositRatesApi(defaultClient);
        RatesRequest ratesRequest = new RatesRequest(); // RatesRequest | 
        try {
            RatesResponse result = apiInstance.getRates(ratesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DepositRatesApi#getRates");
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
 **ratesRequest** | [**RatesRequest**](RatesRequest.md)|  |

### Return type

[**RatesResponse**](RatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit rates data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

