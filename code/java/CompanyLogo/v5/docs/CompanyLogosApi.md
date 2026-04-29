# CompanyLogosApi

All URIs are relative to *https://api.factset.com/wealth/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCompanyLogo**](CompanyLogosApi.md#postCompanyLogo) | **POST** /company/logo | Retrieves logos for one or more publicly traded companies.



## postCompanyLogo

> InlineResponse200 postCompanyLogo(postCompanyLogoRequest)

Retrieves logos for one or more publicly traded companies.

Retrieves high-quality logos for one or more publicly traded companies using standard identifiers (e.g., ticker symbols, ISIN). Logos are available in a selection of predefined sizes or can be generated on-the-fly to custom dimensions. The endpoint accepts up to 100 identifiers per request. Note: Requesting a large number of logos in a single call may result in increased response times.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.CompanyLogo.ApiClient;
import com.factset.sdk.CompanyLogo.ApiException;
import com.factset.sdk.CompanyLogo.Configuration;
import com.factset.sdk.CompanyLogo.auth.*;
import com.factset.sdk.CompanyLogo.models.*;
import com.factset.sdk.CompanyLogo.api.CompanyLogosApi;

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

        CompanyLogosApi apiInstance = new CompanyLogosApi(defaultClient);
        PostCompanyLogoRequest postCompanyLogoRequest = new PostCompanyLogoRequest(); // PostCompanyLogoRequest | Request Body
        try {
            InlineResponse200 result = apiInstance.postCompanyLogo(postCompanyLogoRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyLogosApi#postCompanyLogo");
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
 **postCompanyLogoRequest** | [**PostCompanyLogoRequest**](PostCompanyLogoRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated API Key or Token. |  -  |
| **403** | Forbidden. The API Key or token is not authorized. |  -  |
| **500** | Internal Server Error. |  -  |

