# StockMovementSummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStockMovementSummary**](StockMovementSummaryApi.md#getStockMovementSummary) | **GET** /company/stock-movement-summary | Get Stock Movement Summary



## getStockMovementSummary

> StockMovementResponse getStockMovementSummary(identifier, outputType)

Get Stock Movement Summary

Returns the stock price movement over the last trading period or intraday, and aims to explain that movement using StreetAccount news over the last two trading days.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.auth.*;
import com.factset.sdk.SecurityIntelligence.models.*;
import com.factset.sdk.SecurityIntelligence.api.StockMovementSummaryApi;

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

        StockMovementSummaryApi apiInstance = new StockMovementSummaryApi(defaultClient);
        String identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
        String outputType = "default"; // String | Type of output to return. default for full summary and oneline for one-line summary.
        try {
            StockMovementResponse result = apiInstance.getStockMovementSummary(identifier, outputType);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StockMovementSummaryApi#getStockMovementSummary");
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company |
 **outputType** | **String**| Type of output to return. default for full summary and oneline for one-line summary. | [optional] [default to default] [enum: default, oneline]

### Return type

[**StockMovementResponse**](StockMovementResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with stock movement data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

