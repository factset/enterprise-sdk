# TradeNamesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTradeNamesForList**](TradeNamesApi.md#getTradeNamesForList) | **POST** /factset-rbics/v1/trade-names | Get a company&#39;s associated tradeNames and product lines.



## getTradeNamesForList

> TradeNamesResponse getTradeNamesForList(tradeNamesRequest)

Get a company&#39;s associated tradeNames and product lines.

RBICS with TradeNames maps over 260,000 products, services and brands (a.k.a. TradeNames) to the granular sectors of the FactSet Revere Business Industry Classification System taxonomy, resulting in a multi-sector participation map for each company. 

Whereas RBICS with Revenue offers quantified multi-sector exposure based on a company’s segment disclosures, RBICS with TradeNames provides a comprehensive view of sector participation at the product level.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.TradeNamesApi;

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

        TradeNamesApi apiInstance = new TradeNamesApi(defaultClient);
        TradeNamesRequest tradeNamesRequest = new TradeNamesRequest(); // TradeNamesRequest | Request Body to request a list of tradeName objects.
        try {
            TradeNamesResponse result = apiInstance.getTradeNamesForList(tradeNamesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TradeNamesApi#getTradeNamesForList");
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
 **tradeNamesRequest** | [**TradeNamesRequest**](TradeNamesRequest.md)| Request Body to request a list of tradeName objects. |

### Return type

[**TradeNamesResponse**](TradeNamesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of RBICS Tradename Objects |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |

