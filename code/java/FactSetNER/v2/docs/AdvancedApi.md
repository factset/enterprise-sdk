# AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAdvancedNerExtraction**](AdvancedApi.md#postAdvancedNerExtraction) | **POST** /advanced/extract | Advanced Processing



## postAdvancedNerExtraction

> OutputRoot postAdvancedNerExtraction(advancedRequestRoot)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.

Optionally select a model via `data.model` in the request body. Supported models:
- GPT 5.2
- Claude Sonnet 4.6
- Llama 4 Scout Instruct (the default)

Requests are limited to a 30-second timeout.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNER.ApiClient;
import com.factset.sdk.FactSetNER.ApiException;
import com.factset.sdk.FactSetNER.Configuration;
import com.factset.sdk.FactSetNER.auth.*;
import com.factset.sdk.FactSetNER.models.*;
import com.factset.sdk.FactSetNER.api.AdvancedApi;

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

        AdvancedApi apiInstance = new AdvancedApi(defaultClient);
        AdvancedRequestRoot advancedRequestRoot = new AdvancedRequestRoot(); // AdvancedRequestRoot | 
        try {
            OutputRoot result = apiInstance.postAdvancedNerExtraction(advancedRequestRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedApi#postAdvancedNerExtraction");
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
 **advancedRequestRoot** | [**AdvancedRequestRoot**](AdvancedRequestRoot.md)|  |

### Return type

[**OutputRoot**](OutputRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful entity extraction |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **502** | Upstream model gateway error |  -  |
| **504** | Request exceeded the 30-second processing timeout |  -  |

