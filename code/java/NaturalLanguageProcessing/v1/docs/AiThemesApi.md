# AiThemesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cognitiveNlpV1ThemesPost**](AiThemesApi.md#cognitiveNlpV1ThemesPost) | **POST** /cognitive/nlp/v1/themes | Endpoint to extract themes from text



## cognitiveNlpV1ThemesPost

> ThemesRoot cognitiveNlpV1ThemesPost(themeParametersRoot)

Endpoint to extract themes from text

This endpoint extracts themes from unstructured text. Each theme (`themeText`) is also given a score (`themeScore`). This score shows the relevancy of the theme within the text.
Example Output:
```json
{
  "data": [
  {
    "themeText": "home entertainment results",
    "themeScore": 0.92
  },
  {
    "themeText": ".....",
    "themeScore": .....
  }]
}
```


### Example

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiThemesApi;

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

        AiThemesApi apiInstance = new AiThemesApi(defaultClient);
        ThemeParametersRoot themeParametersRoot = new ThemeParametersRoot(); // ThemeParametersRoot | 
        try {
            ThemesRoot result = apiInstance.cognitiveNlpV1ThemesPost(themeParametersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiThemesApi#cognitiveNlpV1ThemesPost");
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
 **themeParametersRoot** | [**ThemeParametersRoot**](ThemeParametersRoot.md)|  |

### Return type

[**ThemesRoot**](ThemesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, generated themes |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **400** | The browser (or proxy) sent a request that this server could not understand. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **403** | You don&#39;t have the permission to access the requested resource. It is either read-protected or not readable by the server. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **503** | The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |

