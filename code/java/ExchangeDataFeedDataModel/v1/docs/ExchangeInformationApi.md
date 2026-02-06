# ExchangeInformationApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExchanges**](ExchangeInformationApi.md#getExchanges) | **GET** /exchanges | Request metadata for covered Real-Time market data venues at FactSet.



## getExchanges

> ExchangesResponse getExchanges(productCode, exchangeCode, isoCode, format)

Request metadata for covered Real-Time market data venues at FactSet.

Returns a list of exchanges with details like exchange code, name, market open and close times, etc.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ExchangeDataFeedDataModel.ApiClient;
import com.factset.sdk.ExchangeDataFeedDataModel.ApiException;
import com.factset.sdk.ExchangeDataFeedDataModel.Configuration;
import com.factset.sdk.ExchangeDataFeedDataModel.auth.*;
import com.factset.sdk.ExchangeDataFeedDataModel.models.*;
import com.factset.sdk.ExchangeDataFeedDataModel.api.ExchangeInformationApi;

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

        ExchangeInformationApi apiInstance = new ExchangeInformationApi(defaultClient);
        java.util.List<Integer> productCode = Arrays.asList(); // java.util.List<Integer> | Allows filtering of specific product codes in the response.
        java.util.List<Integer> exchangeCode = Arrays.asList(); // java.util.List<Integer> | Allows filtering of specific exchange codes in the response.
        java.util.List<String> isoCode = Arrays.asList(); // java.util.List<String> | Allows filtering on specific ISO code in the response.
        String format = "json"; // String | The format of the output file.
        try {
            ExchangesResponse result = apiInstance.getExchanges(productCode, exchangeCode, isoCode, format);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExchangeInformationApi#getExchanges");
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
 **productCode** | **List&lt;Integer&gt;**| Allows filtering of specific product codes in the response. | [optional]
 **exchangeCode** | **List&lt;Integer&gt;**| Allows filtering of specific exchange codes in the response. | [optional]
 **isoCode** | **List&lt;String&gt;**| Allows filtering on specific ISO code in the response. | [optional]
 **format** | **String**| The format of the output file. | [optional] [enum: json, xml, csv]

### Return type

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of exchanges |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API key for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **402** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
| **404** | The provided endpoint is not valid. |  -  |
| **500** | Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |

