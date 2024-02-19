# RetrieveReportListApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportsGet**](RetrieveReportListApi.md#getReportsGet) | **GET** /get-reports | Retrieve a list of previously created reports and associated report metadata.



## getReportsGet

> GetReportInfo getReportsGet()

Retrieve a list of previously created reports and associated report metadata.

Endpoint to retrieve list of all available Market Intelligence reports for specific User in JSON format.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.MarketIntelligence.ApiClient;
import com.factset.sdk.MarketIntelligence.ApiException;
import com.factset.sdk.MarketIntelligence.Configuration;
import com.factset.sdk.MarketIntelligence.auth.*;
import com.factset.sdk.MarketIntelligence.models.*;
import com.factset.sdk.MarketIntelligence.api.RetrieveReportListApi;

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

        RetrieveReportListApi apiInstance = new RetrieveReportListApi(defaultClient);
        try {
            GetReportInfo result = apiInstance.getReportsGet();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RetrieveReportListApi#getReportsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetReportInfo**](GetReportInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response, Previously created report list fetched. |  -  |
| **400** | Unknown Error |  -  |
| **401** | Missing/invalid Credentials  or authentication failure |  -  |

