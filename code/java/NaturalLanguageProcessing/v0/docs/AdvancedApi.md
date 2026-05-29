# AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postAdvancedNerExtraction**](AdvancedApi.md#postAdvancedNerExtraction) | **POST** /advanced | Advanced Processing



## postAdvancedNerExtraction

> OutputRoot postAdvancedNerExtraction(advancedRequestRoot, model)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AdvancedApi;

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
        String model = "openai.gpt-5.2-2025-12-11"; // String | Optional override for the Advanced model backend.
        try {
            OutputRoot result = apiInstance.postAdvancedNerExtraction(advancedRequestRoot, model);
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
 **model** | **String**| Optional override for the Advanced model backend. | [optional] [default to meta.llama-4-scout-instruct] [enum: openai.gpt-5.2-2025-12-11, anthropic.claude-sonnet-4-6, meta.llama-4-scout-instruct]

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
| **403** | Forbidden |  -  |

