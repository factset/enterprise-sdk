# NamedEntityRecognitionApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitiveNlpV1NerEntitiesPost**](NamedEntityRecognitionApi.md#cognitiveNlpV1NerEntitiesPost) | **POST** /cognitive/nlp/v1/ner/entities | Endpoint to detect entities from text



## cognitiveNlpV1NerEntitiesPost

> NERResponseSchema cognitiveNlpV1NerEntitiesPost(neRInputSchema)

Endpoint to detect entities from text

### Example

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.NamedEntityRecognitionApi;

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

        NamedEntityRecognitionApi apiInstance = new NamedEntityRecognitionApi(defaultClient);
        NERInputSchema neRInputSchema = new NERInputSchema(); // NERInputSchema | 
        try {
            NERResponseSchema result = apiInstance.cognitiveNlpV1NerEntitiesPost(neRInputSchema);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NamedEntityRecognitionApi#cognitiveNlpV1NerEntitiesPost");
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
 **neRInputSchema** | [**NERInputSchema**](NERInputSchema.md)|  | [optional]

### Return type

[**NERResponseSchema**](NERResponseSchema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Validation error |  -  |

