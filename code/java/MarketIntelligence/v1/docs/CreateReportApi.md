# CreateReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPost**](CreateReportApi.md#createPost) | **POST** /create | Create new report templates including portfolio or market news and data.



## createPost

> PostResponseInfo createPost(miAPIPostRequest)

Create new report templates including portfolio or market news and data.

Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.

### Example

```java
// Import classes:
import com.factset.sdk.MarketIntelligence.ApiClient;
import com.factset.sdk.MarketIntelligence.ApiException;
import com.factset.sdk.MarketIntelligence.Configuration;
import com.factset.sdk.MarketIntelligence.auth.*;
import com.factset.sdk.MarketIntelligence.models.*;
import com.factset.sdk.MarketIntelligence.api.CreateReportApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        CreateReportApi apiInstance = new CreateReportApi(defaultClient);
        MIAPIPostRequest miAPIPostRequest = new MIAPIPostRequest(); // MIAPIPostRequest | 
        try {
            PostResponseInfo result = apiInstance.createPost(miAPIPostRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CreateReportApi#createPost");
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
 **miAPIPostRequest** | [**MIAPIPostRequest**](MIAPIPostRequest.md)|  |

### Return type

[**PostResponseInfo**](PostResponseInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response, report created. |  -  |
| **400** | Invalid identifier or Unknown error |  -  |
| **401** | Missing/invalid Credentials or Authentication failure |  -  |

